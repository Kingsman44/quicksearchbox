package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8451c;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.performance.primes.C31164au;
import com.google.android.libraries.performance.primes.C31167ax;
import com.google.android.libraries.performance.primes.metrics.p2415i.C31520m;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.c.ab */
/* compiled from: PG */
final class C110537ab implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C31520m f308151a;

    /* renamed from: b */
    final /* synthetic */ C110538ac f308152b;

    public C110537ab(C110538ac acVar, C31520m mVar) {
        this.f308152b = acVar;
        this.f308151a = mVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) this.f308152b.f308162i.mo56226d()).mo56372aa(26558)).mo56389s("Failed to refresh Smartspace calendar data %s", th.getMessage());
        C31167ax.m58112a().mo36918j(this.f308151a, C31164au.m58092b("SmartspaceUpdate_LOCAL_CALENDAR"), 3);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C118826c cVar = (C118826c) obj;
        C31167ax.m58112a().mo36918j(this.f308151a, C31164au.m58092b("SmartspaceUpdate_LOCAL_CALENDAR"), 2);
    }
}
