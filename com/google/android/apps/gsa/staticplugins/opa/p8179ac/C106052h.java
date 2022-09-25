package com.google.android.apps.gsa.staticplugins.opa.p8179ac;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ac.h */
/* compiled from: PG */
final class C106052h implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ C106053i f296070a;

    public C106052h(C106053i iVar) {
        this.f296070a = iVar;
    }

    public final void afterTextChanged(Editable editable) {
        C106053i iVar = this.f296070a;
        if (TextUtils.isEmpty(iVar.f296075e.getText())) {
            iVar.f296074d.setVisibility(0);
            iVar.f296076f.setVisibility(8);
            return;
        }
        iVar.f296074d.setVisibility(8);
        iVar.f296076f.setVisibility(0);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
