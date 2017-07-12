package com.example.yenphuong.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    public void initView(){
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<DataShop> arrayList = new ArrayList<>();
        arrayList.add(new DataShop(R.drawable.aaa,"aaa"));
        arrayList.add(new DataShop(R.drawable.bbb,"bbb"));
        arrayList.add(new DataShop(R.drawable.ccc,"ccc"));
        arrayList.add(new DataShop(R.drawable.ddd,"ddd"));
        arrayList.add(new DataShop(R.drawable.eee,"eee"));
        arrayList.add(new DataShop(R.drawable.fff,"fff"));
        ShopAdapter shopAdapter = new ShopAdapter(arrayList, getApplicationContext());
        recyclerView.setAdapter(shopAdapter);

    }
}
