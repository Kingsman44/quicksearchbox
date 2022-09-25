package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.api.internal.C145198g;

/* renamed from: com.google.android.gms.measurement.internal.j */
/* compiled from: PG */
final class C145463j implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C145198g f393296a;

    /* renamed from: b */
    final /* synthetic */ String f393297b;

    /* renamed from: c */
    final /* synthetic */ String f393298c;

    /* renamed from: d */
    final /* synthetic */ boolean f393299d;

    /* renamed from: e */
    final /* synthetic */ AppMeasurementDynamiteService f393300e;

    public C145463j(AppMeasurementDynamiteService appMeasurementDynamiteService, C145198g gVar, String str, String str2, boolean z) {
        this.f393300e = appMeasurementDynamiteService;
        this.f393296a = gVar;
        this.f393297b = str;
        this.f393298c = str2;
        this.f393299d = z;
    }

    public final void run() {
        C145456it m = this.f393300e.f392498a.mo120975m();
        C145198g gVar = this.f393296a;
        String str = this.f393297b;
        String str2 = this.f393298c;
        boolean z = this.f393299d;
        m.mo120904g();
        m.mo120949a();
        m.mo121159o(new C145431hv(m, str, str2, m.mo121152e(false), z, gVar));
    }
}
