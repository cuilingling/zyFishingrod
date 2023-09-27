package com.zhaoyang.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import me.jessyan.retrofiturlmanager.RetrofitUrlManager;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // When building OkHttpClient, the OkHttpClient.Builder() is passed to the with() method to initialize the configuration
        OkHttpClient okHttpClient = RetrofitUrlManager.getInstance().with(new OkHttpClient.Builder()).build();




        // You can change BaseUrl at any time while App is running (The interface that declared the Domain-Name header)
        RetrofitUrlManager.getInstance().putDomain("douban", "https://api.douban.com");

       new Retrofit.Builder()
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .baseUrl("")
                .build();
    }
}