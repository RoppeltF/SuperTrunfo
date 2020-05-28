package com.example.supertrunfo.ui.main;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

import com.example.supertrunfo.R;


public class PageViewModel extends ViewModel {


    private String heroi[] = {"Super-Homem","Homem-Aranha","Homem de Ferro","Drax","Groot","Batman","DeadPool","Thor"};


    private MutableLiveData<Integer> mIndex = new MutableLiveData<>();
    private LiveData<String> mText = Transformations.map(mIndex, new Function<Integer, String>() {
        @Override
        public String apply(Integer input) {
            return "Hello I'm " + heroi[input-1];
        }
    });

    public void setIndex(int index) {
        mIndex.setValue(index);
    }

    public LiveData<String> getText() {
        return mText;
    }
}