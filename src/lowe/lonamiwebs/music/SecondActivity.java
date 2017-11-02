package lowe.lonamiwebs.music;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class SecondActivity extends Activity {
	
	private MediaPlayer mPlayer;
	private int currentSong = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		Intent intent = getIntent();
		int number = intent.getIntExtra("BUTTON NUMBER", 1);
		
		TextView tv = (TextView) findViewById(R.id.textView);
		tv.setText(String.valueOf(number));
		
		switch (number) {
		case 1:
			mPlayer = MediaPlayer.create(SecondActivity.this, R.raw.song1);
			currentSong = R.raw.song1;
			tv.setText(
					"Escuchando Mi Primera Canción. Esta es algo especial, es la primera que hice con el programa MuseScore, básico pero me quedo bien. La llamé La Vida en el Campo."
					);
		break;
		
		case 2:
			mPlayer = MediaPlayer.create(SecondActivity.this, R.raw.song2);
			currentSong = R.raw.song2;
			tv.setText(
					"Escuchando Retro One. Otra de mis canciones, esta vez creada con NodeBeat. Es algo más actual que la anterior. Se llama Retro One."
					);
		break;
		
		case 3:
			mPlayer = MediaPlayer.create(SecondActivity.this, R.raw.song3);
			currentSong = R.raw.song3;
			tv.setText(
					"Escuchando Drops Dance on the Flute. Otra canción creada por mi con NodeBeat. Excelente app. Sigue el modelo actual. A esta la he llamado The Drops Dance - on the Flute (El Baile de las Gotas - en la Flauta)."
					);
		break;
		
		case 4:
			mPlayer = MediaPlayer.create(SecondActivity.this, R.raw.song4);
			currentSong = R.raw.song4;
			tv.setText(
					"Escuchando The Forest Mix. Creado también con NodeBeat, se nota que voy mejorando en su manejo. Esta se llama The Forest Mix (El Mix del Bosque)."
					);
		break;
		
		case 5:
			mPlayer = MediaPlayer.create(SecondActivity.this, R.raw.song5);
			currentSong = R.raw.song5;
			tv.setText(
					"Escuchando Mix Teh Rythm. La última de la tanda, Mix Teh Rythm (Mezcla El Ritmo) es la última creada junto al resto creadas con NodeBeat."
					);
		break;
		
		case 6:
			mPlayer = MediaPlayer.create(SecondActivity.this, R.raw.song6);
			currentSong = R.raw.song6;
			tv.setText(
					"Escuchando The Love Is Rythm. Esta canción va dedicada a alguien, aunque sin letra, la hice pensando en una persona muy especial :3 La he llamado The Love Is Rythm (El Amor Es Ritmo)."
					);
		break;
		
		case 7:
			mPlayer = MediaPlayer.create(SecondActivity.this, R.raw.song7);
			currentSong = R.raw.song7;
			tv.setText(
					"Escuchando Not Give Up, Give IT Up. Aquí va otra de mis creaciones a la cual he llamado Not Give Up, Give IT Up (algo así como no te rindas, dalo todo, súbelo)."
					);
		break;
		}
		
		mPlayer.start();
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		if (mPlayer.isPlaying()) {
			mPlayer.pause();
		}
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		if (mPlayer == null) {
			mPlayer = MediaPlayer.create(SecondActivity.this, currentSong);
		}
	}
	
	@Override
	protected void onStop() {
		super.onStop();
		
		if (mPlayer.isPlaying()) {
			mPlayer.stop();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}

}
