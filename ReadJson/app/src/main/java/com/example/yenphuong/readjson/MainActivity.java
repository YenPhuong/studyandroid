package com.example.yenphuong.readjson;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class MainActivity extends AppCompatActivity {
    TextView tvmonHoc;
    TextView tvnoiHoc;
    TextView tvwebsite;
    TextView tvfanpage;
    TextView tvlogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvmonHoc = (TextView)findViewById(R.id.monHoc);
        tvnoiHoc = (TextView)findViewById(R.id.noiHoc);
        tvwebsite = (TextView)findViewById(R.id.website);
        tvfanpage = (TextView)findViewById(R.id.fanpage);
        tvlogo = (TextView)findViewById(R.id.logo);

        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                new ReadJson().execute("http://khoapham.vn/KhoaPhamTraining/android/json/demo3.json");
            }
        });
    }

    class ReadJson extends AsyncTask<String, Integer, String>{

        @Override
        protected String doInBackground(String... params) {
            return docNoiDung_Tu_URL(params[0]);
        }

        @Override
        protected void onPostExecute(String s){
            try {
                JSONObject root = new JSONObject(s);
                String monhoc = root.getString("monhoc");
                tvmonHoc.setText(monhoc);
                String noihoc = root.getString("noihoc");
                tvnoiHoc.setText(noihoc);
                String website = root.getString("website");
                tvwebsite.setText(website);
                String fanpage = root.getString("fanpage");
                tvfanpage.setText(fanpage);
                String logo = root.getString("logo");
                tvlogo.setText(logo);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    private static String docNoiDung_Tu_URL(String theUrl)
    {
        StringBuilder content = new StringBuilder();

        try
        {
            // create a url object
            URL url = new URL(theUrl);

            // create a urlconnection object
            URLConnection urlConnection = url.openConnection();

            // wrap the urlconnection in a bufferedreader
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

            String line;

            // read from the urlconnection via the bufferedreader
            while ((line = bufferedReader.readLine()) != null)
            {
                content.append(line + "\n");
            }
            bufferedReader.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return content.toString();
    }
}
