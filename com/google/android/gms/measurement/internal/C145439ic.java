package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.measurement.internal.ic */
/* compiled from: PG */
final class C145439ic implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AppMetadata f393221a;

    /* renamed from: b */
    final /* synthetic */ Bundle f393222b;

    /* renamed from: c */
    final /* synthetic */ C145456it f393223c;

    public C145439ic(C145456it itVar, AppMetadata appMetadata, Bundle bundle) {
        this.f393223c = itVar;
        this.f393221a = appMetadata;
        this.f393222b = bundle;
    }

    public final void run() {
        C145456it itVar = this.f393223c;
        C145316do doVar = itVar.f393272c;
        if (doVar == null) {
            itVar.f393011w.mo120965ar().f392795c.mo120894a("Failed to send default event parameters to service");
            return;
        }
        try {
            C143919bh.m233958a(this.f393221a);
            doVar.mo120869s(this.f393222b, this.f393221a);
        } catch (RemoteException e) {
            this.f393223c.f393011w.mo120965ar().f392795c.mo120895b("Failed to send default event parameters to service", e);
        }
    }
}
