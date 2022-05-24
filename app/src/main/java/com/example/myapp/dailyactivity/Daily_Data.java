/*
        Nama : Nuraeni Eka Susanti
        NIM : 10119225
        Kelas : IF-6
Tanggal pengerjaan : 08 Mei 2022
*/
package com.example.myapp.dailyactivity;

import java.util.ArrayList;

public class Daily_Data {
    private static String[] data_kegiatan = {
            "Tidur",
            "Makan",
            "Kuliah",
            "Mendengarkan Musik",
            "Belajar",
            "Bermain Games",
            "Menonton Film"
    };

    public static ArrayList<Daily> getListData() {
        ArrayList<Daily> list = new ArrayList<>();
        for (int position = 0; position < data_kegiatan.length; position++) {
            Daily daily = new Daily();
            daily.setKegiatan(data_kegiatan[position]);
            list.add(daily);
        }
        return list;
    }
}
