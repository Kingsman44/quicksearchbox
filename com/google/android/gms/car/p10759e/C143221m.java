package com.google.android.gms.car.p10759e;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.car.e.m */
/* compiled from: PG */
final class C143221m implements Callable {

    /* renamed from: a */
    final /* synthetic */ String f388327a;

    /* renamed from: b */
    final /* synthetic */ Bundle f388328b;

    /* renamed from: c */
    final /* synthetic */ C143232x f388329c;

    public C143221m(C143232x xVar, String str, Bundle bundle) {
        this.f388329c = xVar;
        this.f388327a = str;
        this.f388328b = bundle;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return Boolean.valueOf(this.f388329c.f388355a.performPrivateCommand(this.f388327a, this.f388328b));
    }
}
