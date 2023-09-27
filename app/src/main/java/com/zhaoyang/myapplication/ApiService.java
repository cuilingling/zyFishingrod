package com.zhaoyang.myapplication;

import io.reactivex.rxjava3.core.Observable;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ApiService {

    @Headers({"Domain-Name: douban"}) // Add the Domain-Name header
    @GET("/v2/book/{id}")
    Observable<ResponseBody> getBook(@Path("id") int id);


    @Headers({"Domain-Name: douban"}) // Add the Domain-Name header
    @POST("/v2/book/{id}")
    Observable<ResponseBody> getBooks(@Body RequestBody requestBody);
}
