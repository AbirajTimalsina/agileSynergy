package com.example.agilesynergy.api;

import com.example.agilesynergy.models.user;
import com.example.agilesynergy.models.userForgotPassword;
import com.example.agilesynergy.response.ResponseUser;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface userapi {

    @POST("users/signup")
    Call<ResponseUser> userRegister(@Body user user);
    
    @POST("users/userforgotpassword")
    Call<user> GetForgottenUserData(@Body user user);

    @PUT("users/userforgotpassword")
    Call<userForgotPassword> updateForgottenUser(@Body userForgotPassword user);

    @FormUrlEncoded
    @POST("users/login")
    Call<ResponseUser> checklogin(@Field("phonenumber") String phonenumber, @Field("password") String password);
    @GET("users/me")
    Call<user> getUserDetails(@Header("Authorization") String token);
}
