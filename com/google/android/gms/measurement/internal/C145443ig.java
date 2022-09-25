package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.measurement.internal.ig */
/* compiled from: PG */
final class C145443ig implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AppMetadata f393230a;

    /* renamed from: b */
    final /* synthetic */ C145456it f393231b;

    public C145443ig(C145456it itVar, AppMetadata appMetadata) {
        this.f393231b = itVar;
        this.f393230a = appMetadata;
    }

    public final void run() {
        C145456it itVar = this.f393231b;
        C145316do doVar = itVar.f393272c;
        if (doVar == null) {
            itVar.f393011w.mo120965ar().f392795c.mo120894a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            C143919bh.m233958a(this.f393230a);
            doVar.mo120870t(this.f393230a);
            this.f393231b.mo121158n();
        } catch (RemoteException e) {
            this.f393231b.f393011w.mo120965ar().f392795c.mo120895b("Failed to send measurementEnabled to the service", e);
        }
    }
}
