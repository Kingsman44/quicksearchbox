package com.google.android.apps.gsa.nowoverlayservice;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.az */
/* compiled from: PG */
final class C83451az implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ View f227482a;

    /* renamed from: b */
    final /* synthetic */ C83468bb f227483b;

    public C83451az(C83468bb bbVar, View view) {
        this.f227483b = bbVar;
        this.f227482a = view;
    }

    public final boolean onPreDraw() {
        this.f227482a.getViewTreeObserver().removeOnPreDrawListener(this);
        C83468bb bbVar = this.f227483b;
        if (bbVar.f227555f) {
            bbVar.f227556g = true;
            bbVar.mo76797f();
        }
        return true;
    }
}
