package com.example.gd3_e_09406.twoway;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.gd3_e_09406.R;
import com.example.gd3_e_09406.databinding.TwoWayBinding;
import com.google.gson.Gson;

public class DetailDataPegawai extends AppCompatActivity {

    Pegawai pgwi;
    TwoWayBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.two_way);

        //ambil data intent
        String strPegawai = getIntent().getStringExtra("objPgw");
        Gson gson = new Gson();
        pgwi = gson.fromJson(strPegawai, Pegawai.class);

        //Inisialisasi objek ke dta binding
        binding.setPgwi(pgwi);
        binding.setActivity(this);
    }
    //Membuat response
    public View.OnClickListener btnBackClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent mainActivity = new Intent(DetailDataPegawai.this, InputDataPegawai.class);
            mainActivity.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(mainActivity);
        }
    };
}
