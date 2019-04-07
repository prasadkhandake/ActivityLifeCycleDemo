package com.example.activitylifecycledemo;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("onCreate()","Activity Created");
    }

    public void next(View view)
    {
        Intent i=new Intent(MainActivity.this,Main2Activity.class);
        startActivity(i);
    }

    public void alert(View view)
    {
        AlertDialog.Builder adb=new AlertDialog.Builder(this);
        adb.setTitle("Do you want to Continue?");
        adb.setPositiveButton(R.string.alertp, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Done", Toast.LENGTH_SHORT).show();
            }
        })
        .setNegativeButton(R.string.alertn, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        AlertDialog ad=adb.create();//Factory Method
        ad.show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("onStart()","Activity Started");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("onPause()","Activity Paused");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("onReStart()","Activity Restarted");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("onResume()","Activity Resumed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("onStop()","Activity Stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("onDestroy()","Activity Destroyed");
    }
}
