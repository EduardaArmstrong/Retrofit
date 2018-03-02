package com.mvp.eduarda.retrofitexample.ui.main.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.mvp.eduarda.retrofitexample.R;
import com.mvp.eduarda.retrofitexample.data.model.Items;

import java.util.List;

/**
 * Created by Eduarda on 26/02/2018.
 */

public class ItemAdapter extends BaseQuickAdapter<Items, BaseViewHolder> {

    public ItemAdapter(@Nullable List<Items> data) {
        super(R.layout.recycle_item, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, Items item) {
        helper.setText(R.id.name, item.getName());
        helper.setText(R.id.description, item.getDescription());

    }
}
