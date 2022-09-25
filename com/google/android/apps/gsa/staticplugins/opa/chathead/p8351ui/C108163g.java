package com.google.android.apps.gsa.staticplugins.opa.chathead.p8351ui;

import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chathead.ui.g */
/* compiled from: PG */
public final /* synthetic */ class C108163g implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C108185z f300824a;

    public /* synthetic */ C108163g(C108185z zVar) {
        this.f300824a = zVar;
    }

    public final void onSystemUiVisibilityChange(int i) {
        float f;
        C108185z zVar = this.f300824a;
        int i2 = 0;
        zVar.f300872i.set(C108185z.m179562w(i, 4) || C108185z.m179562w(i, 2) || C108185z.m179562w(i, 2048) || C108185z.m179562w(i, 4096));
        if (zVar.f300873j == 4) {
            View b = zVar.mo96520b();
            if (zVar.f300872i.get()) {
                f = 0.0f;
            } else {
                f = zVar.mo96519a();
            }
            b.setAlpha(f);
            if (zVar.f300872i.get()) {
                zVar.mo96528j();
            }
        }
        View d = zVar.mo96522d();
        if (true == zVar.f300872i.get()) {
            i2 = 8;
        }
        d.setVisibility(i2);
    }
}
