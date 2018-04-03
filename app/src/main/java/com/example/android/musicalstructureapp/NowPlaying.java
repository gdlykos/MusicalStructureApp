package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class NowPlaying extends AppCompatActivity {
    private ImageButton b1,b2,b3,b4;
    private MediaPlayer mediaPlayer;

    private SeekBar seekbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        b1 = (ImageButton) findViewById(R.id.play_button);

        mediaPlayer = MediaPlayer.create(this, R.raw.mirage);

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                Toast.makeText(NowPlaying.this, "I'm done!", Toast.LENGTH_LONG).show();
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the music library button is clicked on.
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
            }
        });

        // Find the View that transfer to Music library activity
        TextView musicLibraryTextView = (TextView) findViewById(R.id.music_library_button);

        // Set a click listener on that View
        musicLibraryTextView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the music library button is clicked on.
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NowPlaying.this, MusicLibrary.class));
            }
        });
    }
}
