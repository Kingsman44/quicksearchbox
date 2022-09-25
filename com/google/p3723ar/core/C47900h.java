package com.google.p3723ar.core;

import com.google.p3723ar.core.ArCoreApk;

/* renamed from: com.google.ar.core.h */
/* compiled from: PG */
final class C47900h implements ArCoreApk.ICheckAvailabilityCallback {

    /* renamed from: a */
    final /* synthetic */ C47901i f124032a;

    public C47900h(C47901i iVar) {
        this.f124032a = iVar;
    }

    public final void onResult(ArCoreApk.Availability availability) {
        synchronized (this.f124032a) {
            C47901i iVar = this.f124032a;
            iVar.f124034b = availability;
            iVar.f124035c = false;
        }
    }
}
