package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.measurement.internal.hx */
/* compiled from: PG */
final class C145433hx implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AppMetadata f393205a;

    /* renamed from: b */
    final /* synthetic */ C145456it f393206b;

    public C145433hx(C145456it itVar, AppMetadata appMetadata) {
        this.f393206b = itVar;
        this.f393205a = appMetadata;
    }

    public final void run() {
        C145456it itVar = this.f393206b;
        C145316do doVar = itVar.f393272c;
        if (doVar == null) {
            itVar.f393011w.mo120965ar().f392795c.mo120894a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            C143919bh.m233958a(this.f393205a);
            doVar.mo120864n(this.f393205a);
        } catch (RemoteException e) {
            this.f393206b.f393011w.mo120965ar().f392795c.mo120895b("Failed to reset data on the service: remote exception", e);
        }
        this.f393206b.mo121158n();
    }
}
