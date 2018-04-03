package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that transfer to now playing activity
        TextView nowPlayingTextView = (TextView) findViewById(R.id.now_playing_button);

        // Set a click listener on that View
        nowPlayingTextView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the now plaing button is clicked on.
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, NowPlaying.class));
            }
        });

        // Find the View that transfer to Music library activity
        TextView musicLibraryTextView = (TextView) findViewById(R.id.music_library_button);

        // Set a click listener on that View
        musicLibraryTextView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the music library button is clicked on.
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MusicLibrary.class));
            }
        });
    }
}
