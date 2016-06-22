package com.example.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    Button popularMoviesButton, stockHawkbutton, buildItBiggerButton, makeYourAppMaterialButton, goUbiquitousButton, capstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        popularMoviesButton = (Button) findViewById(R.id.popular_movies_button);
        stockHawkbutton = (Button) findViewById(R.id.stock_hawk_button);
        buildItBiggerButton = (Button) findViewById(R.id.build_it_bigger_button);
        makeYourAppMaterialButton = (Button) findViewById(R.id.make_your_app_material_button);
        goUbiquitousButton = (Button) findViewById(R.id.go_ubiquitous_button);
        capstoneButton = (Button) findViewById(R.id.capstone_button);

        popularMoviesButton.setOnClickListener(this);
        stockHawkbutton.setOnClickListener(this);
        buildItBiggerButton.setOnClickListener(this);
        makeYourAppMaterialButton.setOnClickListener(this);
        goUbiquitousButton.setOnClickListener(this);
        capstoneButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.popular_movies_button:
                Toast.makeText(MainActivity.this, "Popular Movies Button", Toast.LENGTH_SHORT).show();
                break;

            case R.id.stock_hawk_button:
                Toast.makeText(MainActivity.this, "Stock Hawk Button", Toast.LENGTH_SHORT).show();
                break;

            case R.id.build_it_bigger_button:
                Toast.makeText(MainActivity.this, "Build It Bigger Button", Toast.LENGTH_SHORT).show();
                break;

            case R.id.make_your_app_material_button:
                Toast.makeText(MainActivity.this, "Make Your App Material Button", Toast.LENGTH_SHORT).show();
                break;

            case R.id.go_ubiquitous_button:
                Toast.makeText(MainActivity.this, "Go Ubiquitous Button", Toast.LENGTH_SHORT).show();
                break;

            case R.id.capstone_button:
                Toast.makeText(MainActivity.this, "Capston Button", Toast.LENGTH_SHORT).show();
                break;

            default:
                break;

        }
    }
}
