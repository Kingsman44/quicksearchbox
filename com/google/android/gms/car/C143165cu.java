package com.google.android.gms.car;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.car.p10764h.C143316a;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.car.cu */
/* compiled from: PG */
public final /* synthetic */ class C143165cu implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C143179df f388207a;

    public /* synthetic */ C143165cu(C143179df dfVar) {
        this.f388207a = dfVar;
    }

    public final void onGlobalFocusChanged(View view, View view2) {
        C143179df dfVar = this.f388207a;
        if (view != null) {
            if (C143109au.m232164a("CAR.PROJECTION.PRES", 3)) {
                C143316a.m232514d(3, "CAR.PROJECTION.PRES", (Throwable) null, "%s.onGlobalFocusChanged: setHovered(false) for oldFocus: %s", dfVar.f388260h, view);
            }
            view.setHovered(false);
        }
        View view3 = (View) dfVar.f388232G.get();
        if (!(view3 == null || view3 == view || view3 == view2)) {
            if (C143109au.m232164a("CAR.PROJECTION.PRES", 3)) {
                C143316a.m232514d(3, "CAR.PROJECTION.PRES", (Throwable) null, "%s.onGlobalFocusChanged: setHovered(false) for lastFocus: %s", dfVar.f388260h, view3);
            }
            view3.setHovered(false);
        }
        if (view2 != null) {
            dfVar.mo118162r(view2);
        }
        dfVar.f388232G = new WeakReference(view2);
    }
}
