package com.example.supertrunfo.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
               // txt_item1.setText(s);


                if ( s == "1" ) {
                    txt_item1.setText("Batrang:");
                    txt_item1power.setText("123");
                    txt_item2.setText("Granada Sonica:");
                    txt_item2power.setText("456");
                    txt_item3.setText("Bomba de Fumaça:");
                    txt_item3power.setText("789");
                    txt_item4.setText("Granadas de Luz:");
                    txt_item4power.setText("000");

                }
                else if ( s == "2" ) {

                    txt_item1.setText("Bola de Teias:");
                    txt_item1power.setText("222");
                    txt_item2.setText("Granada Sonica:");
                    txt_item2power.setText("222");
                    txt_item3.setText("Bomba de Fumaça:");
                    txt_item3power.setText("222");
                    txt_item4.setText("Granadas de Luz:");
                    txt_item4power.setText("000");

                }

            }
        });

        return root;
    }
}