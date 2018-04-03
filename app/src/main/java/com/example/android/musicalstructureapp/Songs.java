package com.example.android.musicalstructureapp;

/**
 * Created by georg on 13/3/2018.
 */

public class Songs {

    private String songName;
    private String artistName;

    public Songs(String songsText, String artsisText){
        songName = songsText;
        artistName = artsisText;
    }

    public String getSongName(){
        return songName;
    }
    public String getArtistName(){
        return artistName;
    }

}
