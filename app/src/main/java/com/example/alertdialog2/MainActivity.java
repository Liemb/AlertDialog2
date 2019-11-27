package com.example.alertdialog2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    AlertDialog.Builder adb;
    LinearLayout Layout;
    String[] colors ={"Red", "Blue", "Green"};
    int[] color = {0,0,0};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Layout = (LinearLayout) findViewById(R.id.Layout);
    }

    public void ChangeColor(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Back Ground Color");
        adb.setMessage("choose an color");
        adb.setItems(colors, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                color[which] = 55;
                Layout.setBackgroundColor(Color.rgb(color[0], color[1], color[2]));
            }
        });
        AlertDialog ad = adb.create();
        ad.show();
    }
}
