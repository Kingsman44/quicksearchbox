package com.google.android.apps.search.podcasts.library.showsubscriptions;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.library.showsubscriptions.g */
/* compiled from: PG */
public final class C140626g implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ Button f381924a;

    public C140626g(Button button) {
        this.f381924a = button;
    }

    public final void afterTextChanged(Editable editable) {
        C69664n.m101061g(editable, "editable");
        this.f381924a.setEnabled(editable.length() > 0);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
