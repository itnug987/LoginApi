package com.example.aakash.apiandroid;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface LoginApi {

    String DJANGO_SITE = "http://10.0.2.2:8000/";


    @POST("bp-login/")
    Call<Example> login(@Body Login login);

@GET("api/v1/businesspartners/bpauthtoken/")
Call<ResponseBody> getDetail(@Header("Authorization") String djangoToken);
}
