package com.example.a0leander.buildmyfirstapp.Control;

import android.content.Context;
import android.net.Uri;

public interface MediaPlayerInterface {

    void assignSound(String path) throws Exception;
    void playSound() throws Exception;
    void stopSound();

}
