package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.measurement.internal.ij */
/* compiled from: PG */
final class C145446ij implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AppMetadata f393240a;

    /* renamed from: b */
    final /* synthetic */ boolean f393241b;

    /* renamed from: c */
    final /* synthetic */ ConditionalUserPropertyParcel f393242c;

    /* renamed from: d */
    final /* synthetic */ C145456it f393243d;

    public C145446ij(C145456it itVar, AppMetadata appMetadata, boolean z, ConditionalUserPropertyParcel conditionalUserPropertyParcel) {
        this.f393243d = itVar;
        this.f393240a = appMetadata;
        this.f393241b = z;
        this.f393242c = conditionalUserPropertyParcel;
    }

    public final void run() {
        ConditionalUserPropertyParcel conditionalUserPropertyParcel;
        C145456it itVar = this.f393243d;
        C145316do doVar = itVar.f393272c;
        if (doVar == null) {
            itVar.f393011w.mo120965ar().f392795c.mo120894a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        C143919bh.m233958a(this.f393240a);
        C145456it itVar2 = this.f393243d;
        if (this.f393241b) {
            conditionalUserPropertyParcel = null;
        } else {
            conditionalUserPropertyParcel = this.f393242c;
        }
        itVar2.mo121160p(doVar, conditionalUserPropertyParcel, this.f393240a);
        this.f393243d.mo121158n();
    }
}
