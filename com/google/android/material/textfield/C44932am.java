package com.google.android.material.textfield;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: com.google.android.material.textfield.am */
/* compiled from: PG */
final class C44932am implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ TextInputLayout f117392a;

    public C44932am(TextInputLayout textInputLayout) {
        this.f117392a = textInputLayout;
    }

    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f117392a;
        textInputLayout.mo48494u(!textInputLayout.f117325s, false);
        TextInputLayout textInputLayout2 = this.f117392a;
        if (textInputLayout2.f117311e) {
            textInputLayout2.mo48490r(editable);
        }
        TextInputLayout textInputLayout3 = this.f117392a;
        if (textInputLayout3.f117316j) {
            textInputLayout3.mo48495v(editable);
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
