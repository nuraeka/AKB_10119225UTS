/*
        Nama : Nuraeni Eka Susanti
        NIM : 10119225
        Kelas : IF-6
Tanggal pengerjaan : 08 Mei 2022
*/
package com.example.myapp.music;

import java.util.ArrayList;

public class Music_Data {
    private static String[] data_musik = {
            "IVE - Love Dive",
            "EXO - Love Shot",
            "NMIXX - O.O",
            "Red Velvet - Fell My Rhytm",
            "EXO - Call Me Baby",
            "IU - Blueming",
            "Daya - Sit Still Look Pretty",
            "Dua Lipa - Levitating",
            "Ariana Grande - 7 Rings",
            "Ariana Grande - One Last Time"
    };

    public static ArrayList<Music_Item> getListData() {
        ArrayList<Music_Item> list = new ArrayList<>();
        for (int position = 0; position <data_musik.length; position++) {
            Music_Item mi = new Music_Item();
            mi.setMusicList(data_musik[position]);
            list.add(mi);
        }
        return list;
    }
}
