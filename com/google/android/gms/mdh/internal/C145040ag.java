package com.google.android.gms.mdh.internal;

import com.google.android.gms.mdh.SyncStatus;
import com.google.android.libraries.gcoreclient.p1794s.p1795a.C21647l;
import com.google.android.libraries.p10923ac.p10948d.p10949a.p10950a.p10951a.C147211a;

/* renamed from: com.google.android.gms.mdh.internal.ag */
/* compiled from: PG */
public final /* synthetic */ class C145040ag implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C145043aj f392073a;

    /* renamed from: b */
    public final /* synthetic */ SyncStatus f392074b;

    public /* synthetic */ C145040ag(C145043aj ajVar, SyncStatus syncStatus) {
        this.f392073a = ajVar;
        this.f392074b = syncStatus;
    }

    public final void run() {
        C145043aj ajVar = this.f392073a;
        SyncStatus syncStatus = this.f392074b;
        if (ajVar.f392080a) {
            ajVar.f392081b.f60001a.f397449b.mo90624a(C147211a.m240066a(new C21647l(syncStatus)));
        }
    }
}
