package com.dicoding.antreyuk;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailPageActivity extends Activity implements View.OnClickListener {
    public static final String COMP_NAME = "name";
    public static final String COMP_ADDRESS = "address";
    public static final String COMP_DETAILS = "details";
    public static final String COMP_BRAND = "0";
    public static final String COMP_TIPS = "tips";
    public static final String COMP_QUEUE = "queue";
    private int REQUEST_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_page);

        ImageView brand = findViewById(R.id.company_photo);
        TextView compName = findViewById(R.id.company_name);
        TextView compAddress = findViewById(R.id.company_address);
        TextView compDetails = findViewById(R.id.list_service);
        TextView compTips = findViewById(R.id.list_tips);
        TextView compQueue = findViewById(R.id.queue);

        int compBrand = getIntent().getIntExtra(COMP_BRAND,0);
        String name = getIntent().getStringExtra(COMP_NAME);
        String address = getIntent().getStringExtra(COMP_ADDRESS);
        String details = getIntent().getStringExtra(COMP_DETAILS);
        String tips = getIntent().getStringExtra(COMP_TIPS);
        String queue = getIntent().getStringExtra(COMP_QUEUE);

        brand.setImageResource(compBrand);
        compName.setText(name);
        compAddress.setText(address);
        compDetails.setText(details);
        compTips.setText(tips);
        compQueue.setText(queue);

        Button btnAccept = findViewById(R.id.btn_accept_queue);
        btnAccept.setOnClickListener(this);

        Button btnReject = findViewById(R.id.btn_cancel_queue);
        btnReject.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_accept_queue:
                Intent acceptIntent = new Intent();
                Toast.makeText(this, "Nomor Antrean DIDAPATKAN",Toast.LENGTH_SHORT).show();
                finish();
                break;
            case R.id.btn_cancel_queue:
                Intent rejectIntent = new Intent();
                Toast.makeText(this,"Nomor Antrean DIBATALKAN",Toast.LENGTH_SHORT).show();
                finish();
                break;
        }
    }
}