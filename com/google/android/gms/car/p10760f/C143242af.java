package com.google.android.gms.car.p10760f;

import android.os.RemoteException;
import android.util.SparseArray;
import android.view.Surface;
import com.google.android.gms.car.C143150cf;
import com.google.android.gms.car.C143179df;
import com.google.android.gms.car.C143207dx;

/* renamed from: com.google.android.gms.car.f.af */
/* compiled from: PG */
public final /* synthetic */ class C143242af implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C143268bb f388375a;

    public /* synthetic */ C143242af(C143268bb bbVar) {
        this.f388375a = bbVar;
    }

    public final void run() {
        C143268bb bbVar = this.f388375a;
        SparseArray sparseArray = C143268bb.f388432a;
        if (bbVar.mo118326v()) {
            bbVar.mo118311k(2, false);
            C143207dx dxVar = bbVar.f388463l;
            if (dxVar != null) {
                dxVar.mo118229c((Surface) null);
            }
            try {
                C143150cf cfVar = bbVar.f388447O;
                if (cfVar != null) {
                    cfVar.mo17262he(3, cfVar.mo17260gA());
                }
            } catch (RemoteException unused) {
                bbVar.mo118322r();
            }
            C143179df dfVar = bbVar.f388464m;
            if (dfVar != null) {
                dfVar.hide();
            }
        }
    }
}
