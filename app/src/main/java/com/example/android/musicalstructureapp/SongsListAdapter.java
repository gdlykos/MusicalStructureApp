package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by georg on 13/3/2018.
 */

public class SongsListAdapter extends ArrayAdapter<Songs> {

    private static final String LOG_TAG = SongsListAdapter.class.getSimpleName();

    public SongsListAdapter(Activity context, ArrayList<Songs> words) {
        super(context, 0, words);
    }

    public View getView (int position, @Nullable View convertView, @NonNull ViewGroup parent){

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Songs currentSong = getItem(position);
        TextView songText = (TextView) listItemView.findViewById(R.id.song_text_view);
        songText.setText(currentSong.getSongName());

        TextView artistText = (TextView) listItemView.findViewById(R.id.artist_text_view);
        artistText.setText(currentSong.getArtistName());

        return listItemView;
    }
}
