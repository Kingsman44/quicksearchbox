package com.google.android.gms.car.p10759e;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.car.e.t */
/* compiled from: PG */
final class C143228t implements Callable {

    /* renamed from: a */
    final /* synthetic */ CharSequence f388345a;

    /* renamed from: b */
    final /* synthetic */ int f388346b;

    /* renamed from: c */
    final /* synthetic */ C143232x f388347c;

    public C143228t(C143232x xVar, CharSequence charSequence, int i) {
        this.f388347c = xVar;
        this.f388345a = charSequence;
        this.f388346b = i;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return Boolean.valueOf(this.f388347c.f388355a.setComposingText(this.f388345a, this.f388346b));
    }
}
