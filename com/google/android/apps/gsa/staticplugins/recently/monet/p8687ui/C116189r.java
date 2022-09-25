package com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui;

import android.view.inputmethod.InputMethodManager;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.monet.ui.r */
/* compiled from: PG */
public final /* synthetic */ class C116189r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C116166ai f322160a;

    public /* synthetic */ C116189r(C116166ai aiVar) {
        this.f322160a = aiVar;
    }

    public final void run() {
        C116166ai aiVar = this.f322160a;
        ((InputMethodManager) aiVar.f322102d.getSystemService("input_method")).hideSoftInputFromWindow(aiVar.mo28297il().getWindowToken(), 0);
    }
}
