package com.example.aakash.apiandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private String token;
    Retrofit.Builder builder = new Retrofit.Builder()
            .baseUrl(LoginApi.DJANGO_SITE)
            .addConverterFactory(GsonConverterFactory.create());
    Retrofit retrofit = builder.build();
    LoginApi loginApi = retrofit.create(LoginApi.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login();
//getSecret();
        showPost(token);
//login();
    }
//
//private void login() {
//    Login login = new Login("maakashm99@gmail.com", "aakashman1");
//    Call<Example> call = loginApi.login(login);
//    call.enqueue(new Callback<Example>() {
//        @Override
//        public void onResponse(Call<Example> call, Response<Example> response) {
//            if (response.isSuccessful()) {
//                Toast.makeText(MainActivity.this, response.body().getToken(), Toast.LENGTH_SHORT).show();
//                token=response.body().getToken();
//            } else {
//                Toast.makeText(MainActivity.this, "NOt correct", Toast.LENGTH_SHORT).show();
//            }
//        }
//        @Override
//        public void onFailure(Call<Example> call, Throwable t) {
//            Toast.makeText(MainActivity.this, "Error 1", Toast.LENGTH_SHORT).show();
//
//        }
//    });
//
//    }
//
//    private void getSecret(){
//        Call<ResponseBody> call = loginApi.getDetail("Token "+token);
//        call.enqueue(new Callback<ResponseBody>() {
//            @Override
//            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
//                if (response.isSuccessful()) {
//                    Toast.makeText(MainActivity.this, response.body().toString(), Toast.LENGTH_SHORT).show();
//                } else {
//                    Toast.makeText(MainActivity.this, "NOt correct", Toast.LENGTH_SHORT).show();
//                }
//            }
//
//            @Override
//            public void onFailure(Call<ResponseBody> call, Throwable t) {
//                Toast.makeText(MainActivity.this, "Error 2", Toast.LENGTH_SHORT).show();
//
//            }
//        });
//    }


    private void login() {

        Login login = new Login("srinivas@gmail.com", "123456");

        Call<Example> call = loginApi.login(login);

        call.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                Log.i("ghjk", "ghjk");
                if (response.isSuccessful()) {

                    if (response.body() != null) {

                        String token = response.body().getToken();
                        Toast.makeText(getApplicationContext(), token, Toast.LENGTH_SHORT).show();
                        showPost(token);
                        Toast.makeText(MainActivity.this, "12345", Toast.LENGTH_SHORT).show();
                        Log.i("sperer", "gyjvhj");
                    }
                } else {
                    Log.d("fail", "fail");
                }
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Failed", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void showPost(String token) {


        String Token_request = "Token " + token;

        Call<ResponseBody> call = loginApi.getDetail(Token_request);

        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                ResponseBody finalResponseBody = response.body();

                Log.i("tuy", "hghyjv");
                Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Failure", Toast.LENGTH_SHORT).show();
            }
        });
    }
}