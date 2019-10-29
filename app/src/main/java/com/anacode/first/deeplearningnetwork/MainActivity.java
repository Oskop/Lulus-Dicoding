package com.anacode.first.deeplearningnetwork;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvNetwork;
    private ArrayList<NetworkArchitecture> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvNetwork = findViewById(R.id.rv_network);
        rvNetwork.setHasFixedSize(true);

        list.addAll(NetworksData.getListData());

        showRecyclerList();
    }

    private void showRecyclerList() {
        rvNetwork.setLayoutManager(new LinearLayoutManager(this));
        ListNetworkAdapter listNetworkAdapter = new ListNetworkAdapter(list);
        rvNetwork.setAdapter(listNetworkAdapter);

        listNetworkAdapter.setOnItemClickCallback(new ListNetworkAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(NetworkArchitecture data) {
                showSelectedData(data);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent about = new Intent(MainActivity.this, AboutMe.class);
        startActivity(about);
        return super.onOptionsItemSelected(item);
    }

    public void showSelectedData(NetworkArchitecture nw) {
        Intent detailIntent = new Intent(MainActivity.this, DetailNetwork.class);
        detailIntent.putExtra(DetailNetwork.EXTRA_IMG, nw.getPhoto());
        detailIntent.putExtra(DetailNetwork.EXTRA_FULLNAME, nw.getFullName());
        detailIntent.putExtra(DetailNetwork.EXTRA_NICKNAME, nw.getNickName());
        detailIntent.putExtra(DetailNetwork.EXTRA_DETAIL, nw.getDetail());
        detailIntent.putExtra(DetailNetwork.EXTRA_MAJOR, nw.getMajor());
        detailIntent.putExtra(DetailNetwork.EXTRA_USE, nw.getUse());
        startActivity(detailIntent);
    }
}
