package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.api.internal.C145198g;

/* renamed from: com.google.android.gms.measurement.internal.h */
/* compiled from: PG */
final class C145409h implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C145198g f393116a;

    /* renamed from: b */
    final /* synthetic */ AppMeasurementDynamiteService f393117b;

    public C145409h(AppMeasurementDynamiteService appMeasurementDynamiteService, C145198g gVar) {
        this.f393117b = appMeasurementDynamiteService;
        this.f393116a = gVar;
    }

    public final void run() {
        C145456it m = this.f393117b.f392498a.mo120975m();
        C145198g gVar = this.f393116a;
        m.mo120904g();
        m.mo120949a();
        m.mo121159o(new C145435hz(m, m.mo121152e(false), gVar));
    }
}
