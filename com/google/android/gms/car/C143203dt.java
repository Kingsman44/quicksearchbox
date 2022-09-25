package com.google.android.gms.car;

import android.view.ViewTreeObserver;
import com.google.android.gms.car.p10764h.C143316a;

/* renamed from: com.google.android.gms.car.dt */
/* compiled from: PG */
final class C143203dt implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ C143204du f388301a;

    public C143203dt(C143204du duVar) {
        this.f388301a = duVar;
    }

    public final boolean onPreDraw() {
        this.f388301a.f388302a.getViewTreeObserver().removeOnPreDrawListener(this);
        if (this.f388301a.f388302a.requestFocus()) {
            C143316a.m232516f("GH.ViewFocusInfo", "Restored focus asynchronously");
            return true;
        }
        C143316a.m232514d(5, "GH.ViewFocusInfo", (Throwable) null, "Attempted to request focus on the desired View asynchronously, but failed.", new Object[0]);
        return true;
    }
}
