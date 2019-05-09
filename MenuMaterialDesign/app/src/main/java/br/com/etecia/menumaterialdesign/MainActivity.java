package br.com.etecia.menumaterialdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbbar = (Toolbar) findViewById(R.id.idToolbar);
        setSupportActionBar(toolbbar);
        getSupportActionBar().setTitle("Criando menu");
        getSupportActionBar().setIcon(R.drawable.ic_arrow_dp);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_principal, menu);


        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.mCompartilhar
                ;
                Toast.makeText(getApplicationContext(), "Compartilhar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.m
                ;
                Toast.makeText(getApplicationContext(), "Compartilhar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.m
                ;
                Toast.makeText(getApplicationContext(), "Compartilhar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.m
                ;
                Toast.makeText(getApplicationContext(), "Compartilhar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.m
                ;
                Toast.makeText(getApplicationContext(), "Compartilhar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.m
                ;
                Toast.makeText(getApplicationContext(), "Compartilhar", Toast.LENGTH_SHORT).show();
                break;

            return super.onOptionsItemSelected(item);
        }
    }
