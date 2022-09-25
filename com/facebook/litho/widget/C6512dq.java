package com.facebook.litho.widget;

import android.view.View;

/* renamed from: com.facebook.litho.widget.dq */
/* compiled from: PG */
final class C6512dq implements Runnable {

    /* renamed from: a */
    public final C6434at f19334a;

    /* renamed from: b */
    final /* synthetic */ C6514ds f19335b;

    /* renamed from: c */
    private final View f19336c;

    public C6512dq(C6514ds dsVar, C6434at atVar, View view) {
        this.f19335b = dsVar;
        this.f19334a = atVar;
        this.f19336c = view;
    }

    public final void run() {
        this.f19335b.f19348l = this.f19334a.mo13514a(this.f19336c);
    }
}
