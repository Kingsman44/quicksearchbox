package com.google.android.apps.search.assistant.platform.pcp.validity;

import com.google.android.libraries.performance.primes.C31164au;
import com.google.android.libraries.performance.primes.C31167ax;
import com.google.android.libraries.performance.primes.metrics.p2415i.C31520m;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.validity.m */
/* compiled from: PG */
final class C124164m implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C31520m f342891a;

    /* renamed from: b */
    final /* synthetic */ C124166o f342892b;

    public C124164m(C124166o oVar, C31520m mVar) {
        this.f342892b = oVar;
        this.f342891a = mVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) this.f342892b.f342909o.mo56226d()).mo56372aa(35429)).mo56389s("Failed to fetchDataAndWriteToDatabase: %s", th.getMessage());
        C31167ax.m58112a().mo36918j(this.f342891a, C31164au.m58092b("PCP_process_validity_update"), 3);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        C31167ax.m58112a().mo36918j(this.f342891a, C31164au.m58092b("PCP_process_validity_update"), 2);
    }
}
