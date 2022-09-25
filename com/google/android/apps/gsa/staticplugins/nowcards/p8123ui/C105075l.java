package com.google.android.apps.gsa.staticplugins.nowcards.p8123ui;

import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.ui.l */
/* compiled from: PG */
public final class C105075l implements Runnable {

    /* renamed from: a */
    final /* synthetic */ View f292809a;

    /* renamed from: b */
    final /* synthetic */ int f292810b;

    /* renamed from: c */
    final /* synthetic */ int f292811c;

    /* renamed from: d */
    final /* synthetic */ View f292812d;

    public C105075l(View view, int i, int i2, View view2) {
        this.f292809a = view;
        this.f292810b = i;
        this.f292811c = i2;
        this.f292812d = view2;
    }

    public final void run() {
        C105078o.m174319a(this.f292809a, this.f292810b, this.f292811c, Math.max(this.f292809a.getWidth(), this.f292809a.getHeight()), 0, new C105074k(this));
    }
}
