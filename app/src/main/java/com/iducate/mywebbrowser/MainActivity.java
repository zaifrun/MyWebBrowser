package com.iducate.mywebbrowser;

import android.os.Bundle;
import android.webkit.WebView;
import android.app.Activity;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		WebView browser=(WebView)findViewById(R.id.webkit);
		browser.loadUrl(getIntent().getDataString());
	}

}
