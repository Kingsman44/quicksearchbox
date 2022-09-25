package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.measurement.internal.ii */
/* compiled from: PG */
final class C145445ii implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f393234a = true;

    /* renamed from: b */
    final /* synthetic */ AppMetadata f393235b;

    /* renamed from: c */
    final /* synthetic */ boolean f393236c;

    /* renamed from: d */
    final /* synthetic */ EventParcel f393237d;

    /* renamed from: e */
    final /* synthetic */ String f393238e;

    /* renamed from: f */
    final /* synthetic */ C145456it f393239f;

    public C145445ii(C145456it itVar, boolean z, AppMetadata appMetadata, boolean z2, EventParcel eventParcel, String str) {
        this.f393239f = itVar;
        this.f393235b = appMetadata;
        this.f393236c = z2;
        this.f393237d = eventParcel;
        this.f393238e = str;
    }

    public final void run() {
        EventParcel eventParcel;
        C145456it itVar = this.f393239f;
        C145316do doVar = itVar.f393272c;
        if (doVar == null) {
            itVar.f393011w.mo120965ar().f392795c.mo120894a("Discarding data. Failed to send event to service");
            return;
        }
        C143919bh.m233958a(this.f393235b);
        C145456it itVar2 = this.f393239f;
        if (this.f393236c) {
            eventParcel = null;
        } else {
            eventParcel = this.f393237d;
        }
        itVar2.mo121160p(doVar, eventParcel, this.f393235b);
        this.f393239f.mo121158n();
    }
}
