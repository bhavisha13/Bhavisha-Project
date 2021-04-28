package com.example.bhavishapractical;


import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIInterface {


    @FormUrlEncoded
    @Headers({"Apikey: g6y10dstw2am8p9u7kfiba4xcvzj5lh3proxieqn"})
    @POST("login")
    Call<Loginmodel> login(@Field("email") String email_address,
                           @Field("password") String password,
                           @Field("deviceToken") String deviceToken,
                           @Field("deviceType") String deviceType);







}