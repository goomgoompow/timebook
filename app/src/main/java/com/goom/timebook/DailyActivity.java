package com.goom.timebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

public class DailyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily);

        List<Integer> data = Arrays.asList(1,2,3,4,5,6,7,8);
//        data.stream().filter()
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
