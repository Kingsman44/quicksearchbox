package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.measurement.internal.fp */
/* compiled from: PG */
final class C145371fp implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AppMetadata f392985a;

    /* renamed from: b */
    final /* synthetic */ C145379fx f392986b;

    public C145371fp(C145379fx fxVar, AppMetadata appMetadata) {
        this.f392986b = fxVar;
        this.f392985a = appMetadata;
    }

    public final void run() {
        this.f392986b.f393008a.mo121217m();
        C145488jy jyVar = this.f392986b.f393008a;
        AppMetadata appMetadata = this.f392985a;
        jyVar.mo120966as().mo120904g();
        jyVar.mo121218n();
        C143919bh.m233969l(appMetadata.f392500a);
        C145224ad b = C145224ad.m235920b(appMetadata.f392521v);
        C145224ad e = jyVar.mo121212e(appMetadata.f392500a);
        jyVar.mo120965ar().f392803k.mo120896c("Setting consent, package, consent", appMetadata.f392500a, b);
        jyVar.mo121201B(appMetadata.f392500a, b);
        if (b.mo120787h(e)) {
            jyVar.mo121229y(appMetadata);
        }
    }
}
