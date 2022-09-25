package com.google.android.gms.car.p10759e;

import android.view.KeyEvent;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.car.e.j */
/* compiled from: PG */
final class C143218j implements Callable {

    /* renamed from: a */
    final /* synthetic */ KeyEvent f388321a;

    /* renamed from: b */
    final /* synthetic */ C143232x f388322b;

    public C143218j(C143232x xVar, KeyEvent keyEvent) {
        this.f388322b = xVar;
        this.f388321a = keyEvent;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return Boolean.valueOf(this.f388322b.f388355a.sendKeyEvent(this.f388321a));
    }
}
