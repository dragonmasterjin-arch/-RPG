package com.insaengrpg.app;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebSettings;
import android.webkit.WebChromeClient;
import android.graphics.Color;
import android.view.WindowManager;

public class MainActivity extends Activity {
  private WebView webView;
  @Override public void onCreate(Bundle state) {
    super.onCreate(state);
    getWindow().setStatusBarColor(Color.rgb(11,16,32));
    getWindow().setNavigationBarColor(Color.rgb(11,16,32));
    webView = new WebView(this);
    webView.setBackgroundColor(Color.rgb(11,16,32));
    WebSettings settings=webView.getSettings();
    settings.setJavaScriptEnabled(true);
    settings.setDomStorageEnabled(true);
    settings.setAllowFileAccess(true);
    webView.setWebViewClient(new WebViewClient());
    webView.setWebChromeClient(new WebChromeClient());
    setContentView(webView);
    webView.loadUrl("file:///android_asset/index.html");
  }
  @Override public void onBackPressed(){if(webView!=null && webView.canGoBack())webView.goBack();else super.onBackPressed();}
  @Override protected void onDestroy(){if(webView!=null)webView.destroy();super.onDestroy();}
}
