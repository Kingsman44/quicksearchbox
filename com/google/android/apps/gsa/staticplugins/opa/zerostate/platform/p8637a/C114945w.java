package com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8637a;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.a.w */
/* compiled from: PG */
final class C114945w implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ Button f318927a;

    public C114945w(Button button) {
        this.f318927a = button;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f318927a.setEnabled(charSequence.length() > 0);
    }
}
