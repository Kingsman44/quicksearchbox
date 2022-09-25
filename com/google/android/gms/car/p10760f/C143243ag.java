package com.google.android.gms.car.p10760f;

import android.graphics.Rect;
import android.util.SparseArray;
import com.google.android.gms.car.C143179df;
import com.google.android.gms.car.p10764h.C143316a;

/* renamed from: com.google.android.gms.car.f.ag */
/* compiled from: PG */
public final /* synthetic */ class C143243ag implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C143268bb f388376a;

    /* renamed from: b */
    public final /* synthetic */ Rect f388377b;

    public /* synthetic */ C143243ag(C143268bb bbVar, Rect rect) {
        this.f388376a = bbVar;
        this.f388377b = rect;
    }

    public final void run() {
        C143268bb bbVar = this.f388376a;
        Rect rect = this.f388377b;
        SparseArray sparseArray = C143268bb.f388432a;
        bbVar.f388476y.set(rect);
        C143179df dfVar = bbVar.f388464m;
        if (dfVar != null) {
            dfVar.mo118163s(bbVar.f388476y);
        } else {
            C143316a.m232516f("CAR.PROJECTION.CAHI", "System window insets updated before presentation attached. Will apply to presentation when attaching.");
        }
    }
}
