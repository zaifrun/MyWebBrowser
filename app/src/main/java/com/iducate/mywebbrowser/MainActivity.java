package com.iducate.mywebbrowser;

import android.os.Bundle;
import android.webkit.WebView;
import android.app.Activity;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//get our web view
		WebView browser=(WebView)findViewById(R.id.webkit);
		
		//load the URL
		browser.loadUrl(getIntent().getDataString());
	}

}
