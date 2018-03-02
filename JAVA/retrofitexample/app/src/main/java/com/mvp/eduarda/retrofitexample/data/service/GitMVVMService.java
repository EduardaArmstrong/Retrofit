package com.mvp.eduarda.retrofitexample.data.service;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Eduarda on 26/02/2018.
 */

public interface GitMVVMService {

    @GET("search/repositories?q=mvvm+language:kotlin")
    Call<GitMVVMResponse> getList(@Query("sort") String sort , @Query("order") String order);
}
