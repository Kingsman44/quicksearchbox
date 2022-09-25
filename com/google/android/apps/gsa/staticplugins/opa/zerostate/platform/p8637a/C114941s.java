package com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8637a;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.a.s */
/* compiled from: PG */
final class C114941s implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ C114942t f318899a;

    public C114941s(C114942t tVar) {
        this.f318899a = tVar;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C114942t tVar = this.f318899a;
        Button button = tVar.f318906g;
        button.getClass();
        button.setEnabled(tVar.mo101732o());
    }
}
