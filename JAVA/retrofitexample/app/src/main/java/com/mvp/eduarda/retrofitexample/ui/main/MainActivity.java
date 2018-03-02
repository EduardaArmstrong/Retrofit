package com.mvp.eduarda.retrofitexample.ui.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mvp.eduarda.retrofitexample.R;
import com.mvp.eduarda.retrofitexample.app.RetrofitExample;
import com.mvp.eduarda.retrofitexample.data.model.Items;
import com.mvp.eduarda.retrofitexample.ui.details.DetailsActivity;
import com.mvp.eduarda.retrofitexample.ui.main.adapter.ItemAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements IMain.IMainView {

    private TextView nameText;
    private TextView descriptionText;
    private RecyclerView recyclerView;
    private ItemAdapter adapter;
    private MainPresenterImpl mainPresenterImpl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameText = (TextView) findViewById(R.id.name);
        descriptionText = (TextView) findViewById(R.id.description);
        recyclerView = (RecyclerView) findViewById(R.id.listaId);

        //components recover
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new ItemAdapter(new ArrayList<Items>());

        mainPresenterImpl = new MainPresenterImpl(this, RetrofitExample.getInstance().getAPI());
        mainPresenterImpl.findList();

        adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Items item =(Items) adapter.getData().get(position);
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                intent.putExtra("id", Integer.parseInt(item.getId()));
                startActivity(intent);

            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        mainPresenterImpl.findList();
    }

    @Override
    public void updateList(List<Items> listResult) {
        if(!listResult.isEmpty()){
            adapter.setNewData(listResult);
        }
        recyclerView.setAdapter(adapter);
    }

}
