package com.example.supertrunfo.ui.main;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;


public class PageViewModel extends ViewModel {


     private String heroi[] = {"Batman","Homem-Aranha","Homem de Ferro","DeadPool","Superman","Wolverine"};

/*
    private static final int[] heroi = new int[]{R.string.tab_text_1, R.string.tab_text_2,R.string.tab_text_3,
            R.string.tab_text_4,R.string.tab_text_5,R.string.tab_text_6};
*/


    private MutableLiveData<Integer> mIndex = new MutableLiveData<>();
    private LiveData<String> mText = Transformations.map(mIndex, new Function<Integer, String>() {
        @Override
        public String apply(Integer input) {
            return input.toString();
        }
    });



    public void setIndex(int index) {
        mIndex.setValue(index);
    }

    public LiveData<String> getText() {
        return mText;
    }
}