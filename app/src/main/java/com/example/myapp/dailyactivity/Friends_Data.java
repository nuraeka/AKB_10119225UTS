/*
        Nama : Nuraeni Eka Susanti
        NIM : 10119225
        Kelas : IF-6
Tanggal pengerjaan : 08 Mei 2022
*/
package com.example.myapp.dailyactivity;

import com.example.myapp.R;

import java.util.ArrayList;

public class Friends_Data {
    private static String[] data_nama = {
            "Indri Maharani",
            "Arfi Rahmawati",
            "Puspita Ayu Sualistika",
            "Sendy Oktaviani"
    };

    private static String[] data_username = {
            "@indrimaharanii",
            "@arfirahhhh_",
            "@puspitaayus",
            "@jglow.sendy11"
    };

    private static int[] data_img = {
            R.drawable.indrii,
            R.drawable.arfi,
            R.drawable.puspita,
            R.drawable.sendy
    };

    public static ArrayList<Friends> getListData() {
        ArrayList<Friends> list = new ArrayList<>();
        for (int position = 0; position<data_nama.length; position++) {
            Friends friends = new Friends();
            friends.setNama(data_nama[position]);
            friends.setUsername(data_username[position]);
            friends.setFoto(data_img[position]);
            list.add(friends);
        }
        return list;
    }
}
