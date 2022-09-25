package com.google.android.apps.gsa.staticplugins.opa.p8621x;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.x.g */
/* compiled from: PG */
public final /* synthetic */ class C114519g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InputMethodManager f317584a;

    /* renamed from: b */
    public final /* synthetic */ EditText f317585b;

    public /* synthetic */ C114519g(InputMethodManager inputMethodManager, EditText editText) {
        this.f317584a = inputMethodManager;
        this.f317585b = editText;
    }

    public final void run() {
        this.f317584a.showSoftInput(this.f317585b, 1);
    }
}
