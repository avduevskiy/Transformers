package com.aequilibrium.transformers.utils

import android.text.Editable
import android.text.TextWatcher

class SimpleTextWatcher(
    private val onTextChangedListener: (String) -> Unit
) : TextWatcher {

    override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {

    }

    override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {

    }

    override fun afterTextChanged(s: Editable) {
        onTextChangedListener(s.toString())
    }

}