package com.dicoding.antreyuk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.SupportActionModeWrapper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.MediaParser;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ArrayList<Company> list = new ArrayList<>();
    private RecyclerView rvCompany;
    private String title = "Home Page";
    private  CompanyData companyData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        rvCompany = findViewById(R.id.rv_company);
        rvCompany.setHasFixedSize(true);

        Button btnAbout = findViewById(R.id.bio);
        btnAbout.setOnClickListener(this);

        list.addAll(CompanyData.getListData());
        showRecyclerList();

    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    private void showRecyclerList() {
        rvCompany.setLayoutManager(new LinearLayoutManager(this));
        HomePageCompany homePageCompany =new HomePageCompany(list);
        rvCompany.setAdapter(homePageCompany);

        homePageCompany.setOnItemClickAction(new HomePageCompany.OnItemClickAction() {
            @Override
            public void onItemClicked(Company data) {
                showSelectedCompany(data);
            }
        });
    }

    private void showSelectedCompany(Company data) {
        Intent toDetailCompanyIntent = new Intent(MainActivity.this, DetailPageActivity.class);
        toDetailCompanyIntent.putExtra(String.valueOf(DetailPageActivity.COMP_NAME),data.getCompany());
        toDetailCompanyIntent.putExtra(String.valueOf(DetailPageActivity.COMP_ADDRESS),data.getAddress());
        toDetailCompanyIntent.putExtra(String.valueOf(DetailPageActivity.COMP_DETAILS),data.getDetail());
        toDetailCompanyIntent.putExtra(String.valueOf(DetailPageActivity.COMP_BRAND),data.getBrand());
        toDetailCompanyIntent.putExtra(String.valueOf(DetailPageActivity.COMP_TIPS),data.getTips());
        toDetailCompanyIntent.putExtra(String.valueOf(DetailPageActivity.COMP_QUEUE),data.getQueue());
        startActivity(toDetailCompanyIntent);

    }

    @Override
    public void onClick(View v) {
        Intent moveIntent = new Intent(MainActivity.this, AboutUserActivity.class);
        startActivity(moveIntent);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}