package com.example.yenphuong.listviewcustomadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by yenphuong on 4/25/17.
 */

public class SinhVienAdapter extends BaseAdapter {
    Context myContext;
    int myLayout;
    List<SinhVien> arraySinhvien;

    public SinhVienAdapter(Context context, int layout, List<SinhVien> sinhVienList){
        myContext = context;
        myLayout = layout;
        arraySinhvien = sinhVienList;

    }
    @Override
    public int getCount() {
        return arraySinhvien.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(myLayout, null);

        TextView txtHoTen = (TextView)convertView.findViewById(R.id.textViewHoTen);
        txtHoTen.setText(arraySinhvien.get(position).HoTen);

        TextView txtNamSinh = (TextView)convertView.findViewById(R.id.textViewNamSinh);
        txtNamSinh.setText(String.valueOf(arraySinhvien.get(position).NamSinh));

        return convertView;
    }
}
