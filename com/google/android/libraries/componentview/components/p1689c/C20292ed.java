package com.google.android.libraries.componentview.components.p1689c;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: com.google.android.libraries.componentview.components.c.ed */
/* compiled from: PG */
final class C20292ed implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ C20297ei f57004a;

    public C20292ed(C20297ei eiVar) {
        this.f57004a = eiVar;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C20297ei eiVar = this.f57004a;
        if (!eiVar.f57021i) {
            eiVar.mo25344o();
            this.f57004a.f57019g.removeCallbacksAndMessages((Object) null);
            this.f57004a.f57019g.postDelayed(new C20291ec(this), 1000);
        }
    }
}
