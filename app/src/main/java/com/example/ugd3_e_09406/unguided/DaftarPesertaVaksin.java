package com.example.ugd3_e_09406.unguided;

import java.util.ArrayList;

public class DaftarPesertaVaksin {
        public ArrayList<DataPeserta> DataPeserta;
        public DaftarPesertaVaksin(){
            DataPeserta = new ArrayList();
            DataPeserta.add(Yosia);
            DataPeserta.add(Maria);
            DataPeserta.add(Tina);
            DataPeserta.add(Yerry);
            DataPeserta.add(John);
            DataPeserta.add(Max);
            DataPeserta.add(Jack);
            DataPeserta.add(Ryo);
        }
        public static final DataPeserta Yosia = new DataPeserta("Yosia Galih","180709971",
                "Asisten Bahasa Inggris Khusus","Yogyakarta",55F,"2018","");
        public static final DataPeserta Maria = new DataPeserta("Maria Ana","180709972",
                "Asisten Dasar Pemrograman","Yogyakarta",59F,"2015","");
        public static final DataPeserta Tina = new DataPeserta("Tina Keys","180709973",
                "Asisten Basis Data","Yogyakarta",55F,"2017","");
        public static final DataPeserta Yerry = new DataPeserta("Yerry Cerry","180709974",
                "Asisten Struktur Data","Yogyakarta",55F,"2016","");
        public static final DataPeserta John = new DataPeserta("John Wall","180709975",
                "Asisten Jaringan Komputer","Yogyakarta",90F,"2011","");
        public static final DataPeserta Max = new DataPeserta("Max Verstappen","180709976",
                "Asisten Pemrograman Berorientasi Objek","Yogyakarta",80F,"2012","");
        public static final DataPeserta Jack = new DataPeserta("Jack Hanma","180709977",
                "Asisten Pemrograman Berbasis Platform","Yogyakarta",70F,"2013","");
        public static final DataPeserta Ryo = new DataPeserta("Ryo Jackson","180709978",
                "Asisten Bahasa Inggris Khusus","Yogyakarta",34F,"2014","");
    }

