package lowe.lonamiwebs.music;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	Button b1, b2, b3, b4, b5, b6, b7;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		b1 = (Button) findViewById(R.id.button1);
		b2 = (Button) findViewById(R.id.button2);
		b3 = (Button) findViewById(R.id.button3);
		b4 = (Button) findViewById(R.id.button4);
		b5 = (Button) findViewById(R.id.button5);
		b6 = (Button) findViewById(R.id.button6);
		b7 = (Button) findViewById(R.id.button7);

		createListeners();

	}

	private void createListeners() {
		b1.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				startSecondActivity(1);
			}
		});

		b2.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				startSecondActivity(2);
			}
		});

		b3.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				startSecondActivity(3);
			}
		});

		b4.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				startSecondActivity(4);
			}
		});

		b5.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				startSecondActivity(5);
			}
		});

		b6.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				startSecondActivity(6);
			}
		});

		b7.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				startSecondActivity(7);
			}
		});
	}

	private void startSecondActivity(int buttonNum) {
		Intent intent = new Intent(this, SecondActivity.class);
		intent.putExtra("BUTTON NUMBER", buttonNum);
		startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
