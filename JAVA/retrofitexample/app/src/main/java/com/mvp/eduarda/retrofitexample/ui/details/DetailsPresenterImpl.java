package com.mvp.eduarda.retrofitexample.ui.details;

import android.util.Log;

import com.mvp.eduarda.retrofitexample.data.model.Items;
import com.mvp.eduarda.retrofitexample.data.service.GitMVVMResponse;
import com.mvp.eduarda.retrofitexample.data.service.GitMVVMService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Eduarda on 26/02/2018.
 */

public class DetailsPresenterImpl implements IDetails.IDetailsPresenter {

    private IDetails.IDetailsView detailsView;
    private List<Items> result = new ArrayList<Items>();
    private GitMVVMService gitMVVMService;

    public DetailsPresenterImpl(IDetails.IDetailsView detailsView , GitMVVMService git) {
        this.detailsView = detailsView;
        this.gitMVVMService = git;

    }

    @Override
    public void findItem(int id) {

//        gitMVVMService.getItem(String.valueOf(id)).enqueue(new Callback<GitMVVMResponse>() {
//            @Override
//            public void onResponse(Call<GitMVVMResponse> call, Response<GitMVVMResponse> response) {
//
//                if(response.isSuccessful()){
//
//                    detailsView.updateScreen(result);
//
//                }
//            }
//
//            @Override
//            public void onFailure(Call<GitMVVMResponse> call, Throwable t) {
//
//                Log.i("TAG", "error Details" );
//
//            }
//
//        });
    }
}
