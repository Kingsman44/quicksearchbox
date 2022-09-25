package com.google.android.gms.car;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: com.google.android.gms.car.cv */
/* compiled from: PG */
public final /* synthetic */ class C143166cv implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C143179df f388208a;

    public /* synthetic */ C143166cv(C143179df dfVar) {
        this.f388208a = dfVar;
    }

    public final void onGlobalFocusChanged(View view, View view2) {
        C143179df dfVar = this.f388208a;
        if (view == view2) {
            return;
        }
        if (view == dfVar.mo118143c().getDecorView() || view2 == null) {
            dfVar.mo118148f(dfVar.mo118143c().getDecorView());
        }
    }
}
