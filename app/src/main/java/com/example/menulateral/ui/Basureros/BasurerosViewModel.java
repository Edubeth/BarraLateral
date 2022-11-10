package com.example.menulateral.ui.Basureros;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BasurerosViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public BasurerosViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Basureros fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}