package edu.sdmesa.trana3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Reddit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reddit);

        WebView myWebView = (WebView) findViewById(R.id.webviewReddit);
        myWebView.loadUrl("http://www.reddit.com");
    }
}
