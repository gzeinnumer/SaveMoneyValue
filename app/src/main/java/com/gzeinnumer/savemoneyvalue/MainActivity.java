package com.gzeinnumer.savemoneyvalue;

import static com.gzeinnumer.savemoneyvalue.helper.GblFunction.idr;
import static com.gzeinnumer.savemoneyvalue.helper.GblFunction.idrComma;
import static com.gzeinnumer.savemoneyvalue.helper.GblFunction.saparator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "asdcafasfafasf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int sum = 12345678;

        Log.d(TAG, "onCreate: "+saparator(String.valueOf(sum)));    // 12345678  = 12.345.678
        Log.d(TAG, "onCreate: "+idrComma(String.valueOf(sum)));     // 12345678  = 12.345.678,00
        Log.d(TAG, "onCreate: "+idr(String.valueOf(sum)));          // 12345678  = Rp 12.345.678
    }
}