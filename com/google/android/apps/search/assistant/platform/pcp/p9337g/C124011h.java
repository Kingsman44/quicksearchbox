package com.google.android.apps.search.assistant.platform.pcp.p9337g;

import com.google.android.libraries.performance.primes.C31164au;
import com.google.android.libraries.performance.primes.C31167ax;
import com.google.android.libraries.performance.primes.metrics.p2415i.C31520m;
import com.google.assistant.p3994s.p3995a.C53142cy;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.g.h */
/* compiled from: PG */
final class C124011h implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C31520m f342523a;

    /* renamed from: b */
    final /* synthetic */ Optional f342524b;

    public C124011h(C31520m mVar, Optional optional) {
        this.f342523a = mVar;
        this.f342524b = optional;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x b = C124012i.f342525a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PCP.SyncManager");
        ((C59052c) ((C59052c) b).mo56372aa(35353)).mo56389s("Pcp Connection error: %s", th.getMessage());
        C31167ax.m58112a().mo36918j(this.f342523a, C31164au.m58091a(C31164au.m58092b("PcpV1StartGrpcSync_"), C31164au.m58093c((String) null, (Enum) this.f342524b.orElse(C53306j.UNKNOWNN))), 3);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C53142cy cyVar = (C53142cy) obj;
        C31167ax.m58112a().mo36918j(this.f342523a, C31164au.m58091a(C31164au.m58092b("PcpV1StartGrpcSync_"), C31164au.m58093c((String) null, (Enum) this.f342524b.orElse(C53306j.UNKNOWNN))), 2);
    }
}
