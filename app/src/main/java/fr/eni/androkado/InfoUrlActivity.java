package fr.eni.androkado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class InfoUrlActivity extends AppCompatActivity {

    private static final String TAG = "ACOS";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_url);

    }

    @Override
    protected void onResume() {
        super.onResume();

        Intent intent = getIntent();
        intent.getSerializableExtra("article");

        
    }
}