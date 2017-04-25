package com.example.yenphuong.listviewcustomadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvSinhVien;
    ArrayList<SinhVien> mangSinhVien;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvSinhVien = (ListView)findViewById(R.id.listViewSinhVien);
        mangSinhVien = new ArrayList<SinhVien>();

        mangSinhVien.add(new SinhVien("Phuong", 1995));
        mangSinhVien.add(new SinhVien("Phuong", 1995));
        mangSinhVien.add(new SinhVien("Phuong", 1995));
        mangSinhVien.add(new SinhVien("Phuong", 1995));
        mangSinhVien.add(new SinhVien("Phuong", 1995));
        mangSinhVien.add(new SinhVien("Phuong", 1995));
        mangSinhVien.add(new SinhVien("Phuong", 1995));

        SinhVienAdapter adapter = new SinhVienAdapter(MainActivity.this, R.layout.dong_sinh_vien, mangSinhVien);

        lvSinhVien.setAdapter(adapter);

    }
}
