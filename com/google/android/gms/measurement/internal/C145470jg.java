package com.google.android.gms.measurement.internal;

import android.os.SystemClock;
import com.google.android.gms.common.util.C144006f;

/* renamed from: com.google.android.gms.measurement.internal.jg */
/* compiled from: PG */
final class C145470jg extends C145231ak {

    /* renamed from: b */
    final /* synthetic */ C145471jh f393312b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C145470jg(C145471jh jhVar, C145383ga gaVar) {
        super(gaVar);
        this.f393312b = jhVar;
    }

    /* renamed from: b */
    public final void mo120830b() {
        C145471jh jhVar = this.f393312b;
        jhVar.f393316d.mo120904g();
        C144006f fVar = jhVar.f393316d.f393011w.f392924A;
        jhVar.mo121186a(false, false, SystemClock.elapsedRealtime());
        C145301d b = jhVar.f393316d.f393011w.mo120967b();
        C144006f fVar2 = jhVar.f393316d.f393011w.f392924A;
        b.mo120852e(SystemClock.elapsedRealtime());
    }
}
