package com.example.yenphuong.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvMonHoc;
    EditText edtName;
    Button btnAdd, btnUpdate;
    ArrayList<String > mangMonHoc;
    int positionUpdate = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMonHoc = (ListView)findViewById(R.id.listView);
        edtName = (EditText)findViewById(R.id.editTextName);
        btnAdd = (Button)findViewById(R.id.buttonAdd);
        btnUpdate = (Button)findViewById(R.id.buttonUpdate);

        mangMonHoc = new ArrayList<String>();
        mangMonHoc.add("Lap trinh Android");
        mangMonHoc.add("Lap trinh iOS");
        mangMonHoc.add("Lap trinh ASP.NET");
        mangMonHoc.add("Lap trinh Windows Phone");
        mangMonHoc.add("Lap trinh PHP");
        mangMonHoc.add("Lap trinh PhoneGap");


        final ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,mangMonHoc);

        lvMonHoc.setAdapter(adapter);



        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAdded = edtName.getText().toString();
                mangMonHoc.add(textAdded);
                adapter.notifyDataSetChanged();
                edtName.setText("");
            }
        });

        lvMonHoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(
//                        MainActivity.this,
//                        mangMonHoc.get(position),
//                        Toast.LENGTH_SHORT
//                ).show();
                edtName.setText(mangMonHoc.get(position));
                positionUpdate = position;
            }
        });
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String t = edtName.getText().toString();
                mangMonHoc.set(positionUpdate, t);
                adapter.notifyDataSetChanged();
                edtName.setText("");
            }
        });
        lvMonHoc.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(
                        MainActivity.this,
                        "Deleted "+mangMonHoc.get(position),
                        Toast.LENGTH_LONG
                ).show();
                mangMonHoc.remove(position);
                adapter.notifyDataSetChanged();
                return false;
            }
        });
    }
}
