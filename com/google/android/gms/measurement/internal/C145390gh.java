package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.gh */
/* compiled from: PG */
public final /* synthetic */ class C145390gh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C145416hg f393065a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f393066b;

    /* renamed from: c */
    public final /* synthetic */ long f393067c;

    public /* synthetic */ C145390gh(C145416hg hgVar, Bundle bundle, long j) {
        this.f393065a = hgVar;
        this.f393066b = bundle;
        this.f393067c = j;
    }

    public final void run() {
        C145416hg hgVar = this.f393065a;
        Bundle bundle = this.f393066b;
        long j = this.f393067c;
        if (TextUtils.isEmpty(hgVar.f393011w.mo120969d().mo120875f())) {
            hgVar.mo121109w(bundle, 0, j);
        } else {
            hgVar.f393011w.mo120965ar().f392800h.mo120894a("Using developer consent only; google app id found");
        }
    }
}
