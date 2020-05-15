package com.example.a0leander.buildmyfirstapp.View;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.a0leander.buildmyfirstapp.Control.MediaPlayerSingleton;
import com.example.a0leander.buildmyfirstapp.R;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    /*
    media player testing
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    /** play testfile in mediaPlayer */
    public void playTestFile(View view){

        try {
            MediaPlayerSingleton.getSingletonMedia().start();
        }
        catch (Exception e){
            Toast.makeText(this, "couldnt play audio file", Toast.LENGTH_SHORT).show();
        }
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
