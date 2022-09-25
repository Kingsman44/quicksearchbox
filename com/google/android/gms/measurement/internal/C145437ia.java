package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* renamed from: com.google.android.gms.measurement.internal.ia */
/* compiled from: PG */
final class C145437ia implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AppMetadata f393217a;

    /* renamed from: b */
    final /* synthetic */ C145456it f393218b;

    public C145437ia(C145456it itVar, AppMetadata appMetadata) {
        this.f393218b = itVar;
        this.f393217a = appMetadata;
    }

    public final void run() {
        C145456it itVar = this.f393218b;
        C145316do doVar = itVar.f393272c;
        if (doVar == null) {
            itVar.f393011w.mo120965ar().f392795c.mo120894a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            C143919bh.m233958a(this.f393217a);
            doVar.mo120861k(this.f393217a);
            this.f393218b.f393011w.mo120970e().mo120887k();
            this.f393218b.mo121160p(doVar, (AbstractSafeParcelable) null, this.f393217a);
            this.f393218b.mo121158n();
        } catch (RemoteException e) {
            this.f393218b.f393011w.mo120965ar().f392795c.mo120895b("Failed to send app launch to the service", e);
        }
    }
}
