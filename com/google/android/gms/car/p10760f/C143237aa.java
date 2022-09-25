package com.google.android.gms.car.p10760f;

import android.os.RemoteException;
import com.google.android.gms.car.C143150cf;

/* renamed from: com.google.android.gms.car.f.aa */
/* compiled from: PG */
final class C143237aa implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C143268bb f388362a;

    public C143237aa(C143268bb bbVar) {
        this.f388362a = bbVar;
    }

    public final void run() {
        try {
            C143150cf cfVar = this.f388362a.f388447O;
            if (cfVar != null) {
                cfVar.mo17262he(20, cfVar.mo17260gA());
            }
        } catch (RemoteException unused) {
        }
        C143268bb bbVar = this.f388362a;
        if (bbVar.f388461j != null) {
            bbVar.mo118311k(0, false);
        }
        try {
            C143150cf cfVar2 = this.f388362a.f388447O;
            if (cfVar2 != null) {
                cfVar2.mo17262he(10, cfVar2.mo17260gA());
            }
        } catch (RemoteException unused2) {
        }
        this.f388362a.f388454c = null;
    }
}
