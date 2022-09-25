package com.google.android.gms.car.p10760f;

import android.os.RemoteException;
import android.util.SparseArray;
import com.google.android.gms.car.C143150cf;

/* renamed from: com.google.android.gms.car.f.ap */
/* compiled from: PG */
public final /* synthetic */ class C143252ap implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C143268bb f388398a;

    public /* synthetic */ C143252ap(C143268bb bbVar) {
        this.f388398a = bbVar;
    }

    public final void run() {
        C143268bb bbVar = this.f388398a;
        SparseArray sparseArray = C143268bb.f388432a;
        if (bbVar.mo118326v()) {
            bbVar.mo118311k(5, false);
            try {
                C143150cf cfVar = bbVar.f388447O;
                if (cfVar != null) {
                    cfVar.mo17262he(5, cfVar.mo17260gA());
                }
            } catch (RemoteException unused) {
                bbVar.mo118322r();
            }
        }
    }
}
