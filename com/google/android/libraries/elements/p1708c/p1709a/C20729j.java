package com.google.android.libraries.elements.p1708c.p1709a;

import android.view.inputmethod.InputMethodManager;
import com.google.android.libraries.elements.interfaces.C21311r;

/* renamed from: com.google.android.libraries.elements.c.a.j */
/* compiled from: PG */
public final /* synthetic */ class C20729j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C20730k f58045a;

    /* renamed from: b */
    public final /* synthetic */ C21311r f58046b;

    public /* synthetic */ C20729j(C20730k kVar, C21311r rVar) {
        this.f58045a = kVar;
        this.f58046b = rVar;
    }

    public final void run() {
        ((InputMethodManager) this.f58045a.f58047a.getSystemService("input_method")).hideSoftInputFromWindow(this.f58046b.mo26732b().getWindowToken(), 0);
    }
}
