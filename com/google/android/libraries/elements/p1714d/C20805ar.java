package com.google.android.libraries.elements.p1714d;

import android.view.inputmethod.InputMethodManager;

/* renamed from: com.google.android.libraries.elements.d.ar */
/* compiled from: PG */
public final /* synthetic */ class C20805ar implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C20809av f58255a;

    public /* synthetic */ C20805ar(C20809av avVar) {
        this.f58255a = avVar;
    }

    public final void run() {
        InputMethodManager inputMethodManager;
        C20809av avVar = this.f58255a;
        if (avVar.requestFocus() && (inputMethodManager = (InputMethodManager) avVar.getContext().getSystemService("input_method")) != null) {
            inputMethodManager.showSoftInput(avVar, 1);
        }
    }
}
