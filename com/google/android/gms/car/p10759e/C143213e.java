package com.google.android.gms.car.p10759e;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.car.e.e */
/* compiled from: PG */
final class C143213e implements Callable {

    /* renamed from: a */
    final /* synthetic */ int f388312a;

    /* renamed from: b */
    final /* synthetic */ int f388313b;

    /* renamed from: c */
    final /* synthetic */ C143232x f388314c;

    public C143213e(C143232x xVar, int i, int i2) {
        this.f388314c = xVar;
        this.f388312a = i;
        this.f388313b = i2;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return Boolean.valueOf(this.f388314c.f388355a.setSelection(this.f388312a, this.f388313b));
    }
}
