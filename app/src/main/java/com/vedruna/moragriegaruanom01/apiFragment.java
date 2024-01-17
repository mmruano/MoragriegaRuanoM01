package com.vedruna.moragriegaruanom01;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.widget.ListView;

import com.vedruna.moragriegaruanom01.Adapters.ProductsAdapter;
import com.vedruna.moragriegaruanom01.Interfaces.CRUDInterface;
import com.vedruna.moragriegaruanom01.Model.Product;
import com.vedruna.moragriegaruanom01.Utls.Constans;

import java.util.List;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class apiFragment extends Fragment {

    List<Product> products;
    CRUDInterface crudInterface;
    ListView listView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            listView = listView.findViewById(R.id.productsListView);
            getAll();
        }
    }

    private void getAll() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constans.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        crudInterface = retrofit.create(CRUDInterface.class);
        Call<List<Product>> call = crudInterface.getAll();
        call.enqueue(new Callback<List<Product>>() {
            @Override
            public void onResponse(@NonNull Call<List<Product>> call, @NonNull Response<List<Product>> response) {
                if(!response.isSuccessful()) {
                    Log.e("Response err: ", response.message());
                    return;
                }
                products = response.body();
                ProductsAdapter productsAdapter = new ProductsAdapter(products, requireActivity().getApplicationContext());
                listView.setAdapter(productsAdapter);
                products.forEach(p -> Log.i("Prods: ", p.toString()));
            }

            @Override
            public void onFailure(@NonNull Call<List<Product>> call, @NonNull Throwable t) {
                Log.e("Throw err: ", Objects.requireNonNull(t.getMessage()));
            }
        });
    }
}