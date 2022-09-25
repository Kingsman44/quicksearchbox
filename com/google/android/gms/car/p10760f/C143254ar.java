package com.google.android.gms.car.p10760f;

import android.os.RemoteException;
import android.util.SparseArray;
import com.google.android.gms.car.C143150cf;

/* renamed from: com.google.android.gms.car.f.ar */
/* compiled from: PG */
public final /* synthetic */ class C143254ar implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C143268bb f388404a;

    public /* synthetic */ C143254ar(C143268bb bbVar) {
        this.f388404a = bbVar;
    }

    public final void run() {
        C143268bb bbVar = this.f388404a;
        SparseArray sparseArray = C143268bb.f388432a;
        if (bbVar.mo118326v()) {
            if (bbVar.f388461j != null && (bbVar.f388444L == 3 || bbVar.f388444L == 5)) {
                bbVar.mo118311k(4, false);
            }
            try {
                C143150cf cfVar = bbVar.f388447O;
                if (cfVar != null) {
                    cfVar.mo17262he(7, cfVar.mo17260gA());
                }
            } catch (RemoteException unused) {
                bbVar.mo118322r();
            }
        }
    }
}
