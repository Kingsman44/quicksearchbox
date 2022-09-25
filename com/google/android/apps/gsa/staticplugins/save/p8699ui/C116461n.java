package com.google.android.apps.gsa.staticplugins.save.p8699ui;

import android.view.inputmethod.InputMethodManager;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.ui.n */
/* compiled from: PG */
public final /* synthetic */ class C116461n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Interstitial f322919a;

    /* renamed from: b */
    public final /* synthetic */ InputMethodManager f322920b;

    public /* synthetic */ C116461n(Interstitial interstitial, InputMethodManager inputMethodManager) {
        this.f322919a = interstitial;
        this.f322920b = inputMethodManager;
    }

    public final void run() {
        this.f322920b.hideSoftInputFromWindow(this.f322919a.getWindowToken(), 0);
    }
}
