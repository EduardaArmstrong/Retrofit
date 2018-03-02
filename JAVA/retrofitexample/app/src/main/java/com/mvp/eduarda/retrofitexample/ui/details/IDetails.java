package com.mvp.eduarda.retrofitexample.ui.details;

import com.mvp.eduarda.retrofitexample.data.model.Items;

import java.util.List;

/**
 * Created by Eduarda on 26/02/2018.
 */

public interface IDetails {

    interface IDetailsView{
        void updateScreen(List<Items> listResult);
    }

    interface IDetailsPresenter{
        void findItem(int id);
    }
}
