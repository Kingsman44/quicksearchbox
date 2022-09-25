package com.google.android.libraries.lens.view.filters.p2097a;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: com.google.android.libraries.lens.view.filters.a.am */
/* compiled from: PG */
final class C25863am implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ C25873f f70255a;

    /* renamed from: b */
    final /* synthetic */ C25864an f70256b;

    public C25863am(C25864an anVar, C25873f fVar) {
        this.f70256b = anVar;
        this.f70255a = fVar;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f70255a.getFilter().filter(charSequence.toString());
        this.f70256b.mo31029b();
    }
}
