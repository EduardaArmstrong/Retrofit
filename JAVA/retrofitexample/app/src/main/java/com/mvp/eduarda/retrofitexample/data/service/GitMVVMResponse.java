package com.mvp.eduarda.retrofitexample.data.service;

import com.mvp.eduarda.retrofitexample.data.model.Items;

import java.util.List;

/**
 * Created by Eduarda on 26/02/2018.
 */

public class GitMVVMResponse {

    private List<Items> items;

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }
}
