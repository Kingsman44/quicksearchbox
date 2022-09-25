package com.google.android.libraries.lens.view.infopanel;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

/* renamed from: com.google.android.libraries.lens.view.infopanel.bf */
/* compiled from: PG */
final class C27044bf implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ View f73707a;

    /* renamed from: b */
    final /* synthetic */ C27051bm f73708b;

    public C27044bf(C27051bm bmVar, View view) {
        this.f73708b = bmVar;
        this.f73707a = view;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence.length() == 0) {
            C27051bm bmVar = this.f73708b;
            if (bmVar.f73733m) {
                bmVar.mo32494b(bmVar.f73725e.requireView());
                return;
            }
            return;
        }
        this.f73707a.setVisibility(0);
        C27051bm bmVar2 = this.f73708b;
        if (!bmVar2.f73733m) {
            bmVar2.mo32493a(bmVar2.f73725e.requireView());
        }
    }
}
