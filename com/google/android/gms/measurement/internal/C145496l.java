package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.api.internal.C145198g;

/* renamed from: com.google.android.gms.measurement.internal.l */
/* compiled from: PG */
final class C145496l implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C145198g f393392a;

    /* renamed from: b */
    final /* synthetic */ String f393393b;

    /* renamed from: c */
    final /* synthetic */ String f393394c;

    /* renamed from: d */
    final /* synthetic */ AppMeasurementDynamiteService f393395d;

    public C145496l(AppMeasurementDynamiteService appMeasurementDynamiteService, C145198g gVar, String str, String str2) {
        this.f393395d = appMeasurementDynamiteService;
        this.f393392a = gVar;
        this.f393393b = str;
        this.f393394c = str2;
    }

    public final void run() {
        C145456it m = this.f393395d.f392498a.mo120975m();
        C145198g gVar = this.f393392a;
        String str = this.f393393b;
        String str2 = this.f393394c;
        m.mo120904g();
        m.mo120949a();
        m.mo121159o(new C145448il(m, str, str2, m.mo121152e(false), gVar));
    }
}
