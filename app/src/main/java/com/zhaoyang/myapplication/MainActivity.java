package com.zhaoyang.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.bumptech.glide.Glide;
import com.zhaoyang.net.RetrofitClient;
import com.zhaoyang.net.logging.Level;
import com.zhaoyang.net.logging.LoggingInterceptor;
import com.zhaoyang.net.util.HttpsUtils;


import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import me.jessyan.retrofiturlmanager.RetrofitUrlManager;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import okhttp3.internal.platform.Platform;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initNet();



    }

    private void initNet() {



        RetrofitClient.getInstance().putDomain("jinxiang", "https://smartdriver.hn96606.cn");

        // https://api.wmdb.tv/api/v1/top?type=Imdb&skip=0&limit=20&lang=Cn
        Retrofit retrofit = RetrofitClient.getInstance().getRetrofit();
        retrofit.create(ApiService.class).getListCompany()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ResponseBody>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull ResponseBody responseBody) {
                        String s = responseBody.toString();
                        Log.e("TAG", "onNext: " + s);

                        getApi();
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        Log.e("TAG", "onError: " + e.getMessage());

                    }

                    @Override
                    public void onComplete() {

                    }
                });


    }

    private void getApi() {
        RetrofitClient.getInstance().putDomain("api", "https://tenapi.cn");

        // https://api.wmdb.tv/api/v1/top?type=Imdb&skip=0&limit=20&lang=Cn
        Retrofit retrofit = RetrofitClient.getInstance().getRetrofit();
        retrofit.create(ApiService.class).getHut()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ResponseBody>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull ResponseBody responseBody) {
                        String s = responseBody.toString();
                        Log.e("TAG", "onNext: " + s);

                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        Log.e("TAG", "onError: " + e.getMessage());

                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }
}