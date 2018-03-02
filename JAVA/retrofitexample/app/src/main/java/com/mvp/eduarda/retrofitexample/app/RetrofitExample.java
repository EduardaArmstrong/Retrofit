package com.mvp.eduarda.retrofitexample.app;

import android.app.Application;
import com.mvp.eduarda.retrofitexample.data.service.GitMVVMService;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Eduarda on 26/02/2018.
 */

public class RetrofitExample extends Application {

    private static RetrofitExample singleton;
    private static String BASE_URL =  "https://api.github.com/";

    public RetrofitExample() {
    }

    public static RetrofitExample getInstance(){
        return singleton;
    }

    public GitMVVMService getAPI(){
        Retrofit retrofit = new Retrofit
                .Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(GitMVVMService.class);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        singleton = this;

    }
}
