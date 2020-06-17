package com.example.supertrunfo.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.supertrunfo.R;

/**
 * A placeholder fragment containing a simple view.
 */

public class PlaceholderFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    private PageViewModel pageViewModel;

    public static PlaceholderFragment newInstance(int index) {
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageViewModel = ViewModelProviders.of(this).get(PageViewModel.class);
        int index = 1;
        if (getArguments() != null) {
            index = getArguments().getInt(ARG_SECTION_NUMBER);
        }
        pageViewModel.setIndex(index);
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
            View root = inflater.inflate(R.layout.fragment_main, container, false);

            final ImageView imgHeroi = root.findViewById(R.id.imageView3);

            final TextView txt_item1 = root.findViewById(R.id.txt_item1);
            final TextView txt_item2 = root.findViewById(R.id.txt_item2);
            final TextView txt_item3 = root.findViewById(R.id.txt_item3);
            final TextView txt_item4 = root.findViewById(R.id.txt_item4);

            final TextView txt_item1power = root.findViewById(R.id.txt_item1Power);
            final TextView txt_item2power = root.findViewById(R.id.txt_item2Power);
            final TextView txt_item3power = root.findViewById(R.id.txt_item3Power);
            final TextView txt_item4power = root.findViewById(R.id.txt_item4Power);



        pageViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

                int index = 1;
                if (getArguments() != null) {
                    index = getArguments().getInt(ARG_SECTION_NUMBER);
                }

                if ( index == 1 ){

                    imgHeroi.setImageResource(R.drawable.ic_batman);

                    txt_item1.setText("Batrang:");
                    txt_item1power.setText("222");
                    txt_item2.setText("Granada Sonica:");
                    txt_item2power.setText("333");
                    txt_item3.setText("Bomba de Fumaça:");
                    txt_item3power.setText("444");
                    txt_item4.setText("Granadas de Luz:");
                    txt_item4power.setText("555");

                }else if ( index == 2 ){

                    imgHeroi.setImageResource(R.drawable.ic_spider);
                    txt_item1.setText("Spider web:");
                    txt_item1power.setText("123");
                    txt_item2.setText("Arasd:");
                    txt_item2power.setText("456");
                    txt_item3.setText("yrtu de acaf:");
                    txt_item3power.setText("789");
                    txt_item4.setText("dfasdf");
                    txt_item4power.setText("000");

                }else if ( index == 3 ){

                    imgHeroi.setImageResource(R.drawable.ic_ironman);
                    txt_item1.setText("S45hsd web:");
                    txt_item1power.setText("333");
                    txt_item2.setText("Ajghj:");
                    txt_item2power.setText("333");
                    txt_item3.setText("yrtu de acaf:");
                    txt_item3power.setText("444");
                    txt_item4.setText("asdf");
                    txt_item4power.setText("444");

                }else if ( index == 4 ){

                    imgHeroi.setImageResource(R.drawable.ic_deadpool);
                    txt_item1.setText("Spider web:");
                    txt_item1power.setText("555");
                    txt_item2.setText("Arasd:");
                    txt_item2power.setText("555");
                    txt_item3.setText("yrtu de acaf:");
                    txt_item3power.setText("555");
                    txt_item4.setText("dfasdf");
                    txt_item4power.setText("555");

                }else if ( index == 5 ){

                    imgHeroi.setImageResource(R.drawable.ic_superman);
                    txt_item1.setText("Spider web:");
                    txt_item1power.setText("666");
                    txt_item2.setText("Arasd:");
                    txt_item2power.setText("666");
                    txt_item3.setText("yrtu de acaf:");
                    txt_item3power.setText("666");
                    txt_item4.setText("dfasdf");
                    txt_item4power.setText("666");

                }else if ( index == 6 ){

                    imgHeroi.setImageResource(R.drawable.ic_wolverine);
                    txt_item1.setText("Spider web:");
                    txt_item1power.setText("123");
                    txt_item2.setText("Arasd:");
                    txt_item2power.setText("456");
                    txt_item3.setText("yrtu de acaf:");
                    txt_item3power.setText("789");
                    txt_item4.setText("dfasdf");
                    txt_item4power.setText("000");
                }



            }

        });

        return root;
    }
}
