package com.google.android.gms.car.p10760f;

import android.util.SparseArray;
import com.google.android.gms.car.C143109au;
import com.google.android.gms.car.C143179df;
import com.google.android.gms.car.CarWindowManagerLayoutParams;
import com.google.android.gms.car.p10764h.C143316a;

/* renamed from: com.google.android.gms.car.f.as */
/* compiled from: PG */
public final /* synthetic */ class C143255as implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C143268bb f388405a;

    /* renamed from: b */
    public final /* synthetic */ CarWindowManagerLayoutParams f388406b;

    public /* synthetic */ C143255as(C143268bb bbVar, CarWindowManagerLayoutParams carWindowManagerLayoutParams) {
        this.f388405a = bbVar;
        this.f388406b = carWindowManagerLayoutParams;
    }

    public final void run() {
        C143268bb bbVar = this.f388405a;
        CarWindowManagerLayoutParams carWindowManagerLayoutParams = this.f388406b;
        SparseArray sparseArray = C143268bb.f388432a;
        C143179df dfVar = bbVar.f388464m;
        if (dfVar != null) {
            int i = carWindowManagerLayoutParams.f387986a;
            if (dfVar.f388273u) {
                C143286bt btVar = dfVar.f388259g;
                btVar.f388502e = i;
                if (btVar.f388498a != null && btVar.f388499b != null && btVar.f388500c != null && btVar.f388501d != null) {
                    btVar.mo118339d();
                } else if (C143109au.m232164a("CAR.PROJECTION", 3)) {
                    C143316a.m232511a("CAR.PROJECTION", (Throwable) null, "Call to setCarWindowLayoutFlags prior to addTrampolines");
                }
            }
        }
    }
}
