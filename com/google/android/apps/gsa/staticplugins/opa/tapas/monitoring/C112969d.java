package com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring;

import com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.common.C112966g;
import com.google.common.p4526f.C59071e;
import java.util.Map;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.d */
/* compiled from: PG */
public final class C112969d {

    /* renamed from: a */
    public static final C59071e f313047a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.d");

    /* renamed from: d */
    private static final C112959c f313048d = C112959c.m186947a(C112957a.f313023a, "Tapas/TapasServerRequestMonitor");

    /* renamed from: b */
    public final Map f313049b = new ConcurrentHashMap();

    /* renamed from: c */
    public final C112982q f313050c;

    public C112969d(C112982q qVar) {
        this.f313050c = qVar;
    }

    /* renamed from: a */
    public final void mo99795a(long j, String str) {
        C112966g b = f313048d.mo99787b(str);
        this.f313050c.mo99804e(j, C112976k.TAPAS_SEARCH);
        this.f313049b.put(Long.valueOf(j), b);
    }
}
