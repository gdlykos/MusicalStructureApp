package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicLibrary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_library);

        // Find the View that transfer to now playing activity
        TextView nowPlayingTextView = (TextView) findViewById(R.id.now_playing_button);

        // Set a click listener on that View
        nowPlayingTextView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the now plaing button is clicked on.
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MusicLibrary.this, NowPlaying.class));
            }
        });

        //Create an array list of the songs title and the artist
        ArrayList<Songs> songs = new ArrayList<Songs>();

        songs.add(new Songs(getString(R.string.song1Title), getString(R.string.song1Artist)));
        songs.add(new Songs(getString(R.string.song2Title), getString(R.string.song2Artist)));
        songs.add(new Songs(getString(R.string.song3Title), getString(R.string.song3Artist)));
        songs.add(new Songs(getString(R.string.song4Title), getString(R.string.song4Artist)));
        songs.add(new Songs(getString(R.string.song5Title), getString(R.string.song5Artist)));
        songs.add(new Songs(getString(R.string.song6Title), getString(R.string.song6Artist)));
        songs.add(new Songs(getString(R.string.song7Title), getString(R.string.song7Artist)));
        songs.add(new Songs(getString(R.string.song8Title), getString(R.string.song8Artist)));
        songs.add(new Songs(getString(R.string.song9Title), getString(R.string.song9Artist)));
        songs.add(new Songs(getString(R.string.song10Title), getString(R.string.song10Artist)));

        // Create an {@link SongsListAdapter}, whose data source is a list of {@link Songs}. The
        // adapter knows how to create list items for each item in the list.
        SongsListAdapter adapter = new SongsListAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_music_library layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SongsListAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
