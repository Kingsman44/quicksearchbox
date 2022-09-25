package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.measurement.internal.ju */
/* compiled from: PG */
final class C145484ju implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f393334a;

    /* renamed from: b */
    final /* synthetic */ String f393335b = "_err";

    /* renamed from: c */
    final /* synthetic */ Bundle f393336c;

    /* renamed from: d */
    final /* synthetic */ C145485jv f393337d;

    public C145484ju(C145485jv jvVar, String str, Bundle bundle) {
        this.f393337d = jvVar;
        this.f393334a = str;
        this.f393336c = bundle;
    }

    public final void run() {
        C145495ke j = this.f393337d.f393338a.mo121214j();
        String str = this.f393334a;
        String str2 = this.f393335b;
        Bundle bundle = this.f393336c;
        C143919bh.m233958a(this.f393337d.f393338a.f393363k);
        EventParcel ak = j.mo121277ak(str, str2, bundle, "auto", System.currentTimeMillis(), false);
        C145488jy jyVar = this.f393337d.f393338a;
        C143919bh.m233958a(ak);
        jyVar.mo121223s(ak, this.f393334a);
    }
}
