package com.example.ugd3_e_09406.oneway;

import java.util.ArrayList;

public class DaftarPegawai {
    public ArrayList<Pegawai> Pegawai;
    public DaftarPegawai(){
        Pegawai = new ArrayList();
        Pegawai.add(Yosia);
        Pegawai.add(Maria);
        Pegawai.add(Tina);
        Pegawai.add(Yerry);
        Pegawai.add(John);
        Pegawai.add(Max);
        Pegawai.add(Jack);
        Pegawai.add(Ryo);
    }
    public static final Pegawai Yosia = new Pegawai("Yosia Galih","180709971",
            "Asisten Bahasa Inggris Khusus","Yogyakarta",5000000,2018);
    public static final Pegawai Maria = new Pegawai("Maria Ana","180709972",
            "Asisten Dasar Pemrograman","Yogyakarta",5900000,2015);
    public static final Pegawai Tina = new Pegawai("Tina Keys","180709973",
            "Asisten Basis Data","Yogyakarta",5570000,2017);
    public static final Pegawai Yerry = new Pegawai("Yerry Cerry","180709974",
            "Asisten Struktur Data","Yogyakarta",5500000,2016);
    public static final Pegawai John = new Pegawai("John Wall","180709975",
            "Asisten Jaringan Komputer","Yogyakarta",9000000,2011);
    public static final Pegawai Max = new Pegawai("Max Verstappen","180709976",
            "Asisten Pemrograman Berorientasi Objek","Yogyakarta",8000000,2012);
    public static final Pegawai Jack = new Pegawai("Jack Hanma","180709977",
            "Asisten Pemrograman Berbasis Platform","Yogyakarta",7000000,2013);
    public static final Pegawai Ryo = new Pegawai("Ryo Jackson","180709978",
            "Asisten Bahasa Inggris Khusus","Yogyakarta",6000000,2014);
}
