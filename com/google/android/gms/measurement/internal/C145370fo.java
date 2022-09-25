package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.measurement.internal.fo */
/* compiled from: PG */
final class C145370fo implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AppMetadata f392983a;

    /* renamed from: b */
    final /* synthetic */ C145379fx f392984b;

    public C145370fo(C145379fx fxVar, AppMetadata appMetadata) {
        this.f392984b = fxVar;
        this.f392983a = appMetadata;
    }

    public final void run() {
        this.f392984b.f393008a.mo121217m();
        C145488jy jyVar = this.f392984b.f393008a;
        AppMetadata appMetadata = this.f392983a;
        jyVar.mo120966as().mo120904g();
        jyVar.mo121218n();
        C143919bh.m233969l(appMetadata.f392500a);
        jyVar.mo121209b(appMetadata);
    }
}
