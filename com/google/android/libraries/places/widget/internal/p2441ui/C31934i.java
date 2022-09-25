package com.google.android.libraries.places.widget.internal.p2441ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.libraries.places.p2424a.p2425a.C31775f;

/* renamed from: com.google.android.libraries.places.widget.internal.ui.i */
/* compiled from: PG */
final class C31934i implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ AutocompleteImplFragment f85899a;

    public C31934i(AutocompleteImplFragment autocompleteImplFragment) {
        this.f85899a = autocompleteImplFragment;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void afterTextChanged(Editable editable) {
        try {
            this.f85899a.f85867a.mo37652c(editable.toString());
        } catch (Error | RuntimeException e) {
            C31775f.m59130a(e);
            throw e;
        }
    }
}
