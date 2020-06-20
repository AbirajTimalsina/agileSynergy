package com.example.agilesynergy.api;

import com.example.agilesynergy.models.newdishesModel;
import com.example.agilesynergy.models.popularfoodModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface homeApi {

    @GET("popularfood/all")
    Call<List<popularfoodModel>> getpopularfooddetails();

    @GET("newdishesfood")
    Call<List<newdishesModel>> getnewdishesdetails();

}