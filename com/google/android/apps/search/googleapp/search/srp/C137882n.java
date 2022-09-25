package com.google.android.apps.search.googleapp.search.srp;

import android.view.View;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.n */
/* compiled from: PG */
public final /* synthetic */ class C137882n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C137886r f375143a;

    /* renamed from: b */
    public final /* synthetic */ View f375144b;

    /* renamed from: c */
    public final /* synthetic */ int f375145c;

    public /* synthetic */ C137882n(C137886r rVar, View view, int i) {
        this.f375143a = rVar;
        this.f375144b = view;
        this.f375145c = i;
    }

    public final void run() {
        this.f375144b.setTranslationY((float) (-Math.min(this.f375145c, ((C137722au) this.f375143a.f375168r.mo47045a()).f374623d)));
    }
}
