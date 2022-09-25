package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9333c;

import com.google.android.libraries.performance.primes.C31164au;
import com.google.android.libraries.performance.primes.C31167ax;
import com.google.android.libraries.performance.primes.metrics.p2415i.C31520m;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.c.l */
/* compiled from: PG */
final class C123867l implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C31520m f342154a;

    /* renamed from: b */
    final /* synthetic */ C123878w f342155b;

    public C123867l(C123878w wVar, C31520m mVar) {
        this.f342155b = wVar;
        this.f342154a = mVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) this.f342155b.f342187i.mo56226d()).mo56372aa(35277)).mo56389s("Failed to fetchDataAndWriteToDatabase: %s", th.getMessage());
        C31167ax.m58112a().mo36918j(this.f342154a, C31164au.m58092b("SmartspaceUpdate_LOCAL_CALENDAR"), 3);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        C31167ax.m58112a().mo36918j(this.f342154a, C31164au.m58092b("SmartspaceUpdate_LOCAL_CALENDAR"), 2);
    }
}
