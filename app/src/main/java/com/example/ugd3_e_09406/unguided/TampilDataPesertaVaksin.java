package com.example.ugd3_e_09406.unguided;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.ugd3_e_09406.R;


import java.util.ArrayList;

public class TampilDataPesertaVaksin extends AppCompatActivity {
    ArrayList<DataPeserta> PesertaList;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        setTitle("UGD3_E_09406");
        super.onCreate(savedInstanceState);


        PesertaList = new DaftarPesertaVaksin().DataPeserta;

    }
}
