package com.google.android.apps.gsa.staticplugins.save.p8699ui;

import android.view.animation.Interpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.ui.j */
/* compiled from: PG */
public final /* synthetic */ class C116457j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InputMethodManager f322912a;

    /* renamed from: b */
    public final /* synthetic */ EditText f322913b;

    public /* synthetic */ C116457j(InputMethodManager inputMethodManager, EditText editText) {
        this.f322912a = inputMethodManager;
        this.f322913b = editText;
    }

    public final void run() {
        InputMethodManager inputMethodManager = this.f322912a;
        EditText editText = this.f322913b;
        Interpolator interpolator = Interstitial.f322858a;
        inputMethodManager.showSoftInput(editText, 1);
    }
}
