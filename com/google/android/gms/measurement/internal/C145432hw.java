package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.measurement.internal.hw */
/* compiled from: PG */
final class C145432hw implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AppMetadata f393201a;

    /* renamed from: b */
    final /* synthetic */ boolean f393202b;

    /* renamed from: c */
    final /* synthetic */ UserAttributeParcel f393203c;

    /* renamed from: d */
    final /* synthetic */ C145456it f393204d;

    public C145432hw(C145456it itVar, AppMetadata appMetadata, boolean z, UserAttributeParcel userAttributeParcel) {
        this.f393204d = itVar;
        this.f393201a = appMetadata;
        this.f393202b = z;
        this.f393203c = userAttributeParcel;
    }

    public final void run() {
        UserAttributeParcel userAttributeParcel;
        C145456it itVar = this.f393204d;
        C145316do doVar = itVar.f393272c;
        if (doVar == null) {
            itVar.f393011w.mo120965ar().f392795c.mo120894a("Discarding data. Failed to set user property");
            return;
        }
        C143919bh.m233958a(this.f393201a);
        C145456it itVar2 = this.f393204d;
        if (this.f393202b) {
            userAttributeParcel = null;
        } else {
            userAttributeParcel = this.f393203c;
        }
        itVar2.mo121160p(doVar, userAttributeParcel, this.f393201a);
        this.f393204d.mo121158n();
    }
}
