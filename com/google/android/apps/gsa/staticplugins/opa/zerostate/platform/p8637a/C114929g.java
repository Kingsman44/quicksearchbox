package com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8637a;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.a.g */
/* compiled from: PG */
final class C114929g implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ C114930h f318875a;

    public C114929g(C114930h hVar) {
        this.f318875a = hVar;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C114930h hVar = this.f318875a;
        hVar.f318879d.f318881b.set(hVar.getAbsoluteAdapterPosition(), charSequence.toString());
    }
}
