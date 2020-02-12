package com.aqil.universitetler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private static final String tag="MyApp";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final WebView myWebView = findViewById(R.id.myWeb);
        myWebView.setWebViewClient(new WebViewClient());

        final Button reloudWebsiteButton = findViewById(R.id.wcu);
        reloudWebsiteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myWebView.loadUrl("https://wcu.edu.az/");
            }
        });

        final Button reloudWebsiteButton1 = findViewById(R.id.ada);
        reloudWebsiteButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myWebView.loadUrl("https://www.ada.edu.az");
            }
        });

        final Button reloudWebsiteButton2 = findViewById(R.id.banm);
        reloudWebsiteButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myWebView.loadUrl("http://www.bhos.edu.az/az/index");
            }
        });


        Log.i(tag, "OnCreateCalled");
    }


}
