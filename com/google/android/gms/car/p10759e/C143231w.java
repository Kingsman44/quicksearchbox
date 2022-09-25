package com.google.android.gms.car.p10759e;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.car.e.w */
/* compiled from: PG */
final class C143231w implements Callable {

    /* renamed from: a */
    final /* synthetic */ CharSequence f388352a;

    /* renamed from: b */
    final /* synthetic */ int f388353b;

    /* renamed from: c */
    final /* synthetic */ C143232x f388354c;

    public C143231w(C143232x xVar, CharSequence charSequence, int i) {
        this.f388354c = xVar;
        this.f388352a = charSequence;
        this.f388353b = i;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return Boolean.valueOf(this.f388354c.f388355a.commitText(this.f388352a, this.f388353b));
    }
}
