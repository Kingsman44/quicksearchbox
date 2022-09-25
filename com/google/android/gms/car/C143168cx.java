package com.google.android.gms.car;

import android.os.Build;
import android.view.ViewTreeObserver;
import com.google.android.gms.car.p10764h.C143316a;

/* renamed from: com.google.android.gms.car.cx */
/* compiled from: PG */
final class C143168cx implements ViewTreeObserver.OnTouchModeChangeListener {

    /* renamed from: a */
    final /* synthetic */ C143179df f388210a;

    public C143168cx(C143179df dfVar) {
        this.f388210a = dfVar;
    }

    public final void onTouchModeChanged(boolean z) {
        if (C143316a.m232515e("CAR.PROJECTION.PRES", 2)) {
            C143179df dfVar = this.f388210a;
            C143316a.m232514d(2, "CAR.PROJECTION.PRES", (Throwable) null, "%s onTouchModeChanged(isInTouchMode:%b) [attachedToWindow:%b, hasInputFocus:%b, inTouchMode:%b]", dfVar.f388260h, Boolean.valueOf(z), Boolean.valueOf(dfVar.f388262j), Boolean.valueOf(dfVar.f388263k), Boolean.valueOf(dfVar.f388264l));
        }
        C143179df dfVar2 = this.f388210a;
        if (dfVar2.f388262j) {
            boolean z2 = dfVar2.f388264l;
            if (z != z2) {
                dfVar2.mo118145d(dfVar2.f388263k, z2);
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                this.f388210a.mo118149g();
            }
            C143179df dfVar3 = this.f388210a;
            if (dfVar3.f388273u) {
                dfVar3.mo118148f(dfVar3.mo118143c().getDecorView());
            }
        }
    }
}
