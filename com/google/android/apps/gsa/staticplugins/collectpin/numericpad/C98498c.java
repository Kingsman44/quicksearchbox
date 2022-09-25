package com.google.android.apps.gsa.staticplugins.collectpin.numericpad;

import android.text.Editable;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.collectpin.C98493g;

/* renamed from: com.google.android.apps.gsa.staticplugins.collectpin.numericpad.c */
/* compiled from: PG */
public final /* synthetic */ class C98498c implements View.OnLongClickListener {

    /* renamed from: a */
    public final /* synthetic */ NumericPinPad f275045a;

    public /* synthetic */ C98498c(NumericPinPad numericPinPad) {
        this.f275045a = numericPinPad;
    }

    public final boolean onLongClick(View view) {
        C98493g gVar = this.f275045a.f275042f;
        if (gVar == null) {
            return false;
        }
        gVar.f275033a.requestFocus();
        Editable text = gVar.f275033a.getText();
        if (text == null) {
            return true;
        }
        text.clear();
        return true;
    }
}
