package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.api.internal.C145198g;

/* renamed from: com.google.android.gms.measurement.internal.i */
/* compiled from: PG */
final class C145436i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C145198g f393213a;

    /* renamed from: b */
    final /* synthetic */ EventParcel f393214b;

    /* renamed from: c */
    final /* synthetic */ String f393215c;

    /* renamed from: d */
    final /* synthetic */ AppMeasurementDynamiteService f393216d;

    public C145436i(AppMeasurementDynamiteService appMeasurementDynamiteService, C145198g gVar, EventParcel eventParcel, String str) {
        this.f393216d = appMeasurementDynamiteService;
        this.f393213a = gVar;
        this.f393214b = eventParcel;
        this.f393215c = str;
    }

    public final void run() {
        C145456it m = this.f393216d.f392498a.mo120975m();
        C145198g gVar = this.f393213a;
        EventParcel eventParcel = this.f393214b;
        String str = this.f393215c;
        m.mo120904g();
        m.mo120949a();
        if (m.f393011w.mo120977o().mo121278al() != 0) {
            m.f393011w.mo120965ar().f392798f.mo120894a("Not bundling data. Service unavailable or out of date");
            m.f393011w.mo120977o().mo121258O(gVar, new byte[0]);
            return;
        }
        m.mo121159o(new C145441ie(m, eventParcel, str, gVar));
    }
}
