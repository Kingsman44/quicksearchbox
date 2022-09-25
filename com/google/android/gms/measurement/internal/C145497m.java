package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.api.internal.C145198g;

/* renamed from: com.google.android.gms.measurement.internal.m */
/* compiled from: PG */
final class C145497m implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C145198g f393396a;

    /* renamed from: b */
    final /* synthetic */ AppMeasurementDynamiteService f393397b;

    public C145497m(AppMeasurementDynamiteService appMeasurementDynamiteService, C145198g gVar) {
        this.f393397b = appMeasurementDynamiteService;
        this.f393396a = gVar;
    }

    public final void run() {
        this.f393397b.f392498a.mo120977o().mo121255L(this.f393396a, this.f393397b.f392498a.mo120979q());
    }
}
