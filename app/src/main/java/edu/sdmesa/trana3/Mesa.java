package edu.sdmesa.trana3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Mesa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa);

        WebView myWebView = (WebView) findViewById(R.id.webviewMesa);
        myWebView.loadUrl("http://www.sdmesa.edu");
    }

}
