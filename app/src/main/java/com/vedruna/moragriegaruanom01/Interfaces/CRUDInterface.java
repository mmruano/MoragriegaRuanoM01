package com.vedruna.moragriegaruanom01.Interfaces;

import com.vedruna.moragriegaruanom01.Model.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CRUDInterface {

    @GET("product")
    Call<List<Product>> getAll();
}
