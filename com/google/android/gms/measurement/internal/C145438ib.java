package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.ib */
/* compiled from: PG */
final class C145438ib implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C145423hn f393219a;

    /* renamed from: b */
    final /* synthetic */ C145456it f393220b;

    public C145438ib(C145456it itVar, C145423hn hnVar) {
        this.f393220b = itVar;
        this.f393219a = hnVar;
    }

    public final void run() {
        C145456it itVar = this.f393220b;
        C145316do doVar = itVar.f393272c;
        if (doVar == null) {
            itVar.f393011w.mo120965ar().f392795c.mo120894a("Failed to send current screen to service");
            return;
        }
        try {
            C145423hn hnVar = this.f393219a;
            if (hnVar == null) {
                doVar.mo120868r(0, (String) null, (String) null, itVar.f393011w.f392931a.getPackageName());
            } else {
                doVar.mo120868r(hnVar.f393164c, hnVar.f393162a, hnVar.f393163b, itVar.f393011w.f392931a.getPackageName());
            }
            this.f393220b.mo121158n();
        } catch (RemoteException e) {
            this.f393220b.f393011w.mo120965ar().f392795c.mo120895b("Failed to send current screen to the service", e);
        }
    }
}
