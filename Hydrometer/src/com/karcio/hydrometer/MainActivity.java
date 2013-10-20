package com.karcio.hydrometer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	private EditText editText1;
	private EditText editText2;
	private Button button1;
	private TextView textView4;
	private double og;
	private double fg;
	private double ac;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initParams();

	}

	private void initParams() {
		editText1 = (EditText) findViewById(R.id.editText1);
		editText2 = (EditText) findViewById(R.id.editText2);
		button1 = (Button) findViewById(R.id.button1);
		textView4 = (TextView) findViewById(R.id.textView4);

		button1.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				calculate();
			}
		});
	}

	protected void calculate() {
		og = Double.parseDouble(editText1.getText().toString());
		fg = Double.parseDouble(editText2.getText().toString());
		ac = ((og - fg) / 7.46) + 0.5;
		String Ac = String.format("%.2f", ac);
		textView4.setText(Ac);

	}

}
