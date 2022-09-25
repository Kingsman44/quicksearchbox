package com.google.android.apps.gsa.staticplugins.opa.p8313ay;

import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ay.aa */
/* compiled from: PG */
final class C107641aa implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ C107656ap f299472a;

    public C107641aa(C107656ap apVar) {
        this.f299472a = apVar;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int measuredHeight = this.f299472a.f299586i.getMeasuredHeight();
        View view2 = this.f299472a.f299596s;
        if (view2 != null) {
            measuredHeight -= view2.getMeasuredHeight();
        }
        this.f299472a.f299504M.mo5708l(Integer.valueOf(measuredHeight));
        if (this.f299472a.mo96183l() != null) {
            this.f299472a.mo96183l().x(measuredHeight);
        }
    }
}
