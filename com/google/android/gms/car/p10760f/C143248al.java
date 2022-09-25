package com.google.android.gms.car.p10760f;

import android.content.Intent;
import android.os.RemoteException;
import android.util.SparseArray;
import com.google.android.gms.car.C143150cf;
import com.google.android.gms.car.p10764h.C143316a;

/* renamed from: com.google.android.gms.car.f.al */
/* compiled from: PG */
public final /* synthetic */ class C143248al implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C143268bb f388385a;

    /* renamed from: b */
    public final /* synthetic */ Intent f388386b;

    public /* synthetic */ C143248al(C143268bb bbVar, Intent intent) {
        this.f388385a = bbVar;
        this.f388386b = intent;
    }

    public final void run() {
        boolean z;
        C143268bb bbVar = this.f388385a;
        Intent intent = this.f388386b;
        SparseArray sparseArray = C143268bb.f388432a;
        if (bbVar.mo118326v() && bbVar.f388461j != null) {
            if (bbVar.f388444L == 5) {
                bbVar.mo118311k(4, false);
                z = true;
            } else {
                z = false;
            }
            if (bbVar.f388444L == 4 || bbVar.f388444L == 3) {
                bbVar.f388461j.mo19991n(intent);
            } else {
                C143316a.m232514d(6, "CAR.PROJECTION.CAHI", (Throwable) null, "%s onNewIntent not sent, activity is in state: %s", bbVar.f388473v, C143268bb.f388432a.get(bbVar.f388444L));
            }
            if (z) {
                bbVar.mo118311k(5, false);
            }
            try {
                C143150cf cfVar = bbVar.f388447O;
                if (cfVar != null) {
                    cfVar.mo17262he(2, cfVar.mo17260gA());
                }
            } catch (RemoteException unused) {
                bbVar.mo118322r();
            }
        }
    }
}
