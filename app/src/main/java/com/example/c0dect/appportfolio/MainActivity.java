package com.example.c0dect.appportfolio;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void displayMessage(View view) {
        Context context = getApplicationContext();
        CharSequence toastMessage = getToastMessage(view);
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, toastMessage, duration);
        toast.show();
    }

    private CharSequence getToastMessage(View view) {
        String baseString = "This button will launch my %s project!";
        String toastMessage = "";
        switch(view.getId()) {
            case R.id.btn_spotify:
                toastMessage = String.format(baseString, "Spotify");
                break;
            case R.id.btn_scores:
                toastMessage = String.format(baseString, "Scores App");
                break;
            case R.id.btn_library:
                toastMessage = String.format(baseString, "Library App");
                break;
            case R.id.btn_build_bigger:
                toastMessage = String.format(baseString, "Build it Bigger");
                break;
            case R.id.btn_xyz_reader:
                toastMessage = String.format(baseString, "XYZ Reader");
                break;
            case R.id.btn_capstone:
                toastMessage = String.format(baseString, "Capstone");
                break;
        }
        return toastMessage;
    }
}
