package com.example.gd3_e_09406.oneway;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.gd3_e_09406.R;
import com.example.gd3_e_09406.databinding.OneWayBinding;

import java.util.ArrayList;

public class TampilPegawai extends AppCompatActivity {

    ArrayList<Pegawai> PegawaiList;
    OneWayBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.one_way);

        PegawaiList = new DaftarPegawai().Pegawai;
        binding.setPgw(PegawaiList.get(3));
    }

}
