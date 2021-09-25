package com.example.ugd3_e_09406.oneway;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.ugd3_e_09406.R;
import com.example.ugd3_e_09406.databinding.OneWayBinding;

import java.util.ArrayList;

public class TampilPegawai extends AppCompatActivity {

    ArrayList<Pegawai> PegawaiList;
    OneWayBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        setTitle("UGD3_E_09406");
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.one_way);

        PegawaiList = new DaftarPegawai().Pegawai;
        binding.setPgw(PegawaiList.get(3));
    }

}
