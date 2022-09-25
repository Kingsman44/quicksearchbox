package com.google.android.gms.car.p10750a.p10751a;

import android.os.RemoteException;
import com.google.android.gms.car.p10764h.C143316a;
import com.google.common.base.C58852bp;

/* renamed from: com.google.android.gms.car.a.a.au */
/* compiled from: PG */
public final /* synthetic */ class C142997au implements C58852bp {

    /* renamed from: a */
    public final /* synthetic */ C143000ax f388036a;

    public /* synthetic */ C142997au(C143000ax axVar) {
        this.f388036a = axVar;
    }

    /* renamed from: a */
    public final void mo40846a(Object obj) {
        C143000ax axVar = this.f388036a;
        RemoteException remoteException = (RemoteException) obj;
        if (C143316a.m232515e("GH.CarClient", 4)) {
            C143316a.m232513c("GH.CarClient", remoteException, "Tearing down in response to RemoteException.");
        }
        axVar.mo117931m();
    }
}
