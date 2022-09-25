package com.google.android.gms.car.p10760f;

import com.google.android.gms.car.KillOptions;
import com.google.android.gms.car.p10764h.C143316a;

/* renamed from: com.google.android.gms.car.f.au */
/* compiled from: PG */
public final /* synthetic */ class C143257au implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ KillOptions f388408a;

    public /* synthetic */ C143257au(KillOptions killOptions) {
        this.f388408a = killOptions;
    }

    public final void run() {
        KillOptions killOptions = this.f388408a;
        C143316a.m232513c("CAR.PROJECTION.CAHI", (Throwable) null, "Throwing a CrashClientAnrException to explicitly crash");
        String str = killOptions.f387997a;
        String str2 = killOptions.f388000d;
        throw new C143261ay(str + ":" + str2);
    }
}
