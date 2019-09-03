package com.example.qlquants;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class ActivityGetURL extends AppCompatActivity {

    Button btnCheckURL;
    EditText txtCheckURL;
    TextView txtViewURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_url);
        AnhXa();
        btnCheckURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new GetUrl().execute("http://" + txtCheckURL.getText().toString().trim());
            }
        });
    }

    private void AnhXa() {
        btnCheckURL = (Button) findViewById(R.id.btnCheckURL);
        txtCheckURL = (EditText) findViewById(R.id.txtCheckUrl);
        txtViewURL = (TextView) findViewById(R.id.txtViewURL);
    }

    class GetUrl extends AsyncTask<String, String, String>{

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(15, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .readTimeout(15, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true)
                .build();

        @Override
        protected String doInBackground(String... strings) {
            Request.Builder builder = new Request.Builder();
            builder.url(strings[0]);
            Request request = builder.build();
            try (Response response = okHttpClient.newCall(request).execute()) {
                return response.body().string();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            if (!s.equals("")){
                txtViewURL.append(s);
            }else {
                //Toast.makeText(GetUrl.this, "Đường dẫn bị lỗi !", Toast.LENGTH_SHORT).show();
            }
            super.onPostExecute(s);
        }
    }
}
