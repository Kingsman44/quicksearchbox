package com.google.android.apps.gsa.staticplugins.save.p8699ui;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.ui.s */
/* compiled from: PG */
final class C116466s implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ TextView f322926a;

    public C116466s(TextView textView) {
        this.f322926a = textView;
    }

    public final void afterTextChanged(Editable editable) {
        if (editable.length() == 0) {
            this.f322926a.setEnabled(false);
            this.f322926a.setAlpha(0.38f);
            return;
        }
        this.f322926a.setEnabled(true);
        this.f322926a.setAlpha(1.0f);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
