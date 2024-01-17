package com.vedruna.moragriegaruanom01.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.vedruna.moragriegaruanom01.Model.Product;
import com.vedruna.moragriegaruanom01.R;

import java.util.List;

public class ProductsAdapter extends BaseAdapter {

    List<Product> products;
    Context context;
    TextView nameText;
    Button viewButton;

    public ProductsAdapter(List<Product> products, Context context) {
        this.products = products;
        this.context = context;
    }

    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public Object getItem(int i) {
        return products.get(i);
    }

    @Override
    public long getItemId(int i) {
        return products.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.product_list, viewGroup, false);
        }
        nameText = view.findViewById(R.id.nameText);
        nameText.setText(products.get(i).getName());
        viewButton = view.findViewById(R.id.viewButton);
        return view;
    }
}
