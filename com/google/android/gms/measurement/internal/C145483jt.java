package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C143919bh;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.jt */
/* compiled from: PG */
final class C145483jt implements Callable {

    /* renamed from: a */
    final /* synthetic */ AppMetadata f393332a;

    /* renamed from: b */
    final /* synthetic */ C145488jy f393333b;

    public C145483jt(C145488jy jyVar, AppMetadata appMetadata) {
        this.f393333b = jyVar;
        this.f393332a = appMetadata;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C145488jy jyVar = this.f393333b;
        String str = this.f393332a.f392500a;
        C143919bh.m233958a(str);
        if (jyVar.mo121212e(str).mo120786f(C145223ac.ANALYTICS_STORAGE) && C145224ad.m235920b(this.f393332a.f392521v).mo120786f(C145223ac.ANALYTICS_STORAGE)) {
            return this.f393333b.mo121209b(this.f393332a).mo121037m();
        }
        this.f393333b.mo120965ar().f392803k.mo120894a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
