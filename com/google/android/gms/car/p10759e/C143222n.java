package com.google.android.gms.car.p10759e;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.car.e.n */
/* compiled from: PG */
final class C143222n implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Callable f388330a;

    /* renamed from: b */
    final /* synthetic */ C143232x f388331b;

    public C143222n(C143232x xVar, Callable callable) {
        this.f388331b = xVar;
        this.f388330a = callable;
    }

    public final void run() {
        try {
            this.f388331b.f388356b = ((Boolean) this.f388330a.call()).booleanValue();
        } catch (Exception e) {
            this.f388331b.f388356b = false;
            throw new RuntimeException("Input connection action failed", e);
        }
    }
}
