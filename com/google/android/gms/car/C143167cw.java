package com.google.android.gms.car;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: com.google.android.gms.car.cw */
/* compiled from: PG */
public final /* synthetic */ class C143167cw implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C143179df f388209a;

    public /* synthetic */ C143167cw(C143179df dfVar) {
        this.f388209a = dfVar;
    }

    public final void onGlobalFocusChanged(View view, View view2) {
        C143131bo boVar;
        C143179df dfVar = this.f388209a;
        if (view != view2) {
            C143132bp bpVar = dfVar.f388243R;
            if (view2 != null && (boVar = (C143131bo) bpVar.f388189a.peek()) != null) {
                View view3 = (View) boVar.f388187c.get();
                if (!bpVar.mo118061c(boVar.f388185b, view3, (View) boVar.f388188d.get())) {
                    bpVar.f388189a.clear();
                } else if (view3 != view2) {
                    bpVar.f388189a.clear();
                }
            }
        }
    }
}
