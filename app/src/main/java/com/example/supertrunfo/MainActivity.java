package com.example.supertrunfo;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.example.supertrunfo.ui.main.SectionsPagerAdapter;

import java.util.HashMap;
import java.util.Map;

import static java.lang.String.valueOf;

public class MainActivity extends AppCompatActivity {


     private ListView lvLista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        TextView nomeHeroi = findViewById(R.id.heroiNome);
        nomeHeroi = findViewById(R.id.heroiNome);

        lvLista = findViewById(R.id.lvLista);

        tabs.setupWithViewPager(viewPager);

        tabs.getTabAt( 0 ).setIcon(R.drawable.ic_batman);
        tabs.getTabAt( 1 ).setIcon(R.drawable.ic_spider);
        tabs.getTabAt( 2 ).setIcon(R.drawable.ic_ironman);
        tabs.getTabAt( 3 ).setIcon(R.drawable.ic_deadpool);
        tabs.getTabAt( 4 ).setIcon(R.drawable.ic_superman);
        tabs.getTabAt( 5 ).setIcon(R.drawable.ic_wolverine);

        nomeHeroi.setText( "chang" ) ;



        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setImageResource(R.drawable.ic_swords);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar.make(view, "Time to Fight ! ", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });



    }
}