package com.example.allapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.action_open_notes:
//                Toast.makeText(MainActivity.this, "Открыть записную книжку",
//                        Toast.LENGTH_LONG).show();
                Intent intentNotes = new Intent(MainActivity.this, NotesActivity.class);
                startActivity(intentNotes);
                break;
            case R.id.action_adress:
                Intent intentAdress = new Intent(MainActivity.this, AdressActivity.class);
                startActivity(intentAdress);
                break;
            case R.id.action_deadline:
                Intent intentDeadline = new Intent(MainActivity.this, DeadlineActivity.class);
                startActivity(intentDeadline);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}