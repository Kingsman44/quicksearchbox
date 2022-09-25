package com.google.android.gms.car.p10759e;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.car.e.s */
/* compiled from: PG */
final class C143227s implements Callable {

    /* renamed from: a */
    final /* synthetic */ int f388342a;

    /* renamed from: b */
    final /* synthetic */ int f388343b;

    /* renamed from: c */
    final /* synthetic */ C143232x f388344c;

    public C143227s(C143232x xVar, int i, int i2) {
        this.f388344c = xVar;
        this.f388342a = i;
        this.f388343b = i2;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return Boolean.valueOf(this.f388344c.f388355a.deleteSurroundingText(this.f388342a, this.f388343b));
    }
}
