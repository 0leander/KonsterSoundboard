package com.example.a0leander.AndroidDevelopment.Control;

import android.content.Context;
import android.media.MediaPlayer;

import com.example.a0leander.AndroidDevelopment.R;

public class MediaPlayerSingleton implements MediaPlayerInterface {

    private static MediaPlayerSingleton instance;
    private static MediaPlayer mediaPlayer;
    private Context appContext;

    public static MediaPlayerSingleton getInstance(){
        if (instance == null){
            instance = new MediaPlayerSingleton();
        }
        return instance;
    }

    public static MediaPlayer getSingletonMedia(){
        if(mediaPlayer == null) {
            mediaPlayer = MediaPlayer.create(get(), R.raw.testfile);
        }
        return mediaPlayer;
    }

    public void init(Context context){
        if(appContext == null){
            this.appContext = context;
        }
    }

    private Context getContext() {
        return appContext;
    }

    public static Context get(){
        return getInstance().getContext();
    }


    @Override
    public void assignSound(String path) throws Exception {
        mediaPlayer.setDataSource(path);
    }

    @Override
    public void playSound() throws Exception {
        mediaPlayer.start();
    }

    @Override
    public void stopSound() {
        mediaPlayer.stop();
    }
}
