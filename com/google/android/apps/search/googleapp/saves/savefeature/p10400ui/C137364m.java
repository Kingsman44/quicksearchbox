package com.google.android.apps.search.googleapp.saves.savefeature.p10400ui;

import android.support.p033v7.app.C0392m;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.ui.m */
/* compiled from: PG */
final class C137364m implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ C137365n f373642a;

    public C137364m(C137365n nVar) {
        this.f373642a = nVar;
    }

    public final void afterTextChanged(Editable editable) {
        Button button = ((C0392m) this.f373642a.f373643a.requireDialog()).f1349a.f1110j;
        if (editable.length() == 0) {
            C137365n.m223190a(button);
            return;
        }
        button.setEnabled(true);
        button.setAlpha(1.0f);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
