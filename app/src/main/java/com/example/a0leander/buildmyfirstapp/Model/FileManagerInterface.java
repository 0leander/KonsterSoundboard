package com.example.a0leander.buildmyfirstapp.Model;

import android.net.Uri;

import java.io.File;

public interface FileManagerInterface {

    void importSoundFile(Uri uri) throws Exception;
    void saveSoundFile(Uri uri, File file) throws Exception;

    void saveFilterFile(Uri uri, File file) throws Exception;

    void getFile(Uri uri) throws Exception;
    void deleteFile(Uri uri) throws Exception;

    }
