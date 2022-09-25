package com.google.android.gms.car.p10750a.p10751a;

import android.os.RemoteException;
import com.google.android.gms.car.C143109au;
import com.google.android.gms.car.p10760f.C143309x;
import com.google.android.gms.car.p10764h.C143316a;
import com.google.common.base.C58852bp;

/* renamed from: com.google.android.gms.car.a.a.da */
/* compiled from: PG */
public final /* synthetic */ class C143058da implements C58852bp {

    /* renamed from: a */
    public final /* synthetic */ C143059db f388136a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f388137b;

    public /* synthetic */ C143058da(C143059db dbVar, Runnable runnable) {
        this.f388136a = dbVar;
        this.f388137b = runnable;
    }

    /* renamed from: a */
    public final void mo40846a(Object obj) {
        C143059db dbVar = this.f388136a;
        Runnable runnable = this.f388137b;
        RemoteException remoteException = (RemoteException) obj;
        if (C143109au.m232164a("CAR.CLIENT", 3)) {
            C143316a.m232511a("CAR.CLIENT", remoteException, "carServiceExceptionHandler invoked");
        }
        dbVar.mo117931m();
        ((C143309x) runnable).f388539a.mo118322r();
    }
}
