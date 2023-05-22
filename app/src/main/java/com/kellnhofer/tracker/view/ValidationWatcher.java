package com.kellnhofer.tracker.view;

import android.text.Editable;
import android.text.TextWatcher;

public abstract class ValidationWatcher implements TextWatcher {

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public abstract void afterTextChanged(Editable s);

}
