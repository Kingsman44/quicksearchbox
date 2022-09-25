package com.google.android.apps.gsa.staticplugins.nowcards.p8123ui;

import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.ui.j */
/* compiled from: PG */
public final class C105073j implements Runnable {

    /* renamed from: a */
    final /* synthetic */ View f292805a;

    /* renamed from: b */
    final /* synthetic */ int f292806b;

    /* renamed from: c */
    final /* synthetic */ int f292807c;

    public C105073j(View view, int i, int i2) {
        this.f292805a = view;
        this.f292806b = i;
        this.f292807c = i2;
    }

    public final void run() {
        C105078o.m174319a(this.f292805a, this.f292806b, this.f292807c, 0, Math.max(this.f292805a.getWidth(), this.f292805a.getHeight()), (Runnable) null);
    }
}
