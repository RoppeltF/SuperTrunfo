package com.example.supertrunfo;

import android.os.Bundle;

import com.example.supertrunfo.ui.main.PageViewModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.supertrunfo.ui.main.SectionsPagerAdapter;

import java.util.HashMap;
import java.util.Map;

import static java.lang.String.valueOf;

public class MainActivity extends AppCompatActivity {

 //   private String heroi[] = {"Super-Homem","Homem-Aranha","Homem de Ferro","Drax","Groot","Batman","DeadPool","Thor"};

    Map<String, String> pairs = new HashMap<String,String>();
 //   pairs.puts( "cap_america" , "R.drawable.ic_cap_america" );


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        TextView nomeHeroi = findViewById(R.id.heroiNome);


        tabs.setupWithViewPager(viewPager);

        tabs.getTabAt( 0 ).setIcon(R.drawable.ic_batman);
        tabs.getTabAt( 1 ).setIcon(R.drawable.ic_spider);
        tabs.getTabAt( 2 ).setIcon(R.drawable.ic_ironman);
        tabs.getTabAt( 3 ).setIcon(R.drawable.ic_deadpool);
        tabs.getTabAt( 4 ).setIcon(R.drawable.ic_superman);
        tabs.getTabAt( 5 ).setIcon(R.drawable.ic_wolverine);

        nomeHeroi.setText( "Banana" ) ;




        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });



    }
}