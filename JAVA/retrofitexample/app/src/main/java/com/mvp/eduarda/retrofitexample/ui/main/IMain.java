package com.mvp.eduarda.retrofitexample.ui.main;

import com.mvp.eduarda.retrofitexample.data.model.Items;

import java.util.List;

/**
 * Created by Eduarda on 26/02/2018.
 */

public interface IMain {

    interface IMainView{
        void updateList(List<Items> listResult);
    }

    interface IMainPresenter{
        void findList();
    }

}
