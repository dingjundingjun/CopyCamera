package com.dingj.copycamera;

import com.android.camera.util.GcamHelper;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.Window;

public class CameraActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		GcamHelper.init(getContentResolver());
		getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
		setContentView(R.layout.camera_filmstrip);
	}

	
}
