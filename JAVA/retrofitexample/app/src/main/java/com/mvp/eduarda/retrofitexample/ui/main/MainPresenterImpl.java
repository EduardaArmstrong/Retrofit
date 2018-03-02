package com.mvp.eduarda.retrofitexample.ui.main;

import android.util.Log;

import com.mvp.eduarda.retrofitexample.data.service.GitMVVMResponse;
import com.mvp.eduarda.retrofitexample.data.service.GitMVVMService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Eduarda on 26/02/2018.
 */

public class MainPresenterImpl implements IMain.IMainPresenter {

    private IMain.IMainView mainView;
    private GitMVVMService gitMVVMService;

    public MainPresenterImpl(IMain.IMainView mainView, GitMVVMService git) {
        this.mainView = mainView;
        this.gitMVVMService = git;
    }

    @Override
    public void findList() {

        gitMVVMService.getList("stars","desc").enqueue(new Callback<GitMVVMResponse>() {
            @Override
            public void onResponse(Call<GitMVVMResponse> call, Response<GitMVVMResponse> response) {

                if(response.isSuccessful()){
                    mainView.updateList(response.body().getItems());
                }
            }

            @Override
            public void onFailure(Call<GitMVVMResponse> call, Throwable t) {

                Log.i("TAG", "error loading from API" );

            }
        });

    }

}
