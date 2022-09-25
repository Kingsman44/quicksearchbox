package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.measurement.internal.ih */
/* compiled from: PG */
final class C145444ih implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AppMetadata f393232a;

    /* renamed from: b */
    final /* synthetic */ C145456it f393233b;

    public C145444ih(C145456it itVar, AppMetadata appMetadata) {
        this.f393233b = itVar;
        this.f393232a = appMetadata;
    }

    public final void run() {
        C145456it itVar = this.f393233b;
        C145316do doVar = itVar.f393272c;
        if (doVar == null) {
            itVar.f393011w.mo120965ar().f392795c.mo120894a("Failed to send consent settings to service");
            return;
        }
        try {
            C143919bh.m233958a(this.f393232a);
            doVar.mo120867q(this.f393232a);
            this.f393233b.mo121158n();
        } catch (RemoteException e) {
            this.f393233b.f393011w.mo120965ar().f392795c.mo120895b("Failed to send consent settings to the service", e);
        }
    }
}
