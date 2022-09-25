package com.google.android.libraries.elements.p1714d;

import android.os.IBinder;
import android.view.inputmethod.InputMethodManager;

/* renamed from: com.google.android.libraries.elements.d.as */
/* compiled from: PG */
public final /* synthetic */ class C20806as implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C20809av f58256a;

    public /* synthetic */ C20806as(C20809av avVar) {
        this.f58256a = avVar;
    }

    public final void run() {
        C20809av avVar = this.f58256a;
        avVar.clearFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) avVar.getContext().getSystemService("input_method");
        IBinder windowToken = avVar.getWindowToken();
        if (inputMethodManager != null && windowToken != null) {
            inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
        }
    }
}
