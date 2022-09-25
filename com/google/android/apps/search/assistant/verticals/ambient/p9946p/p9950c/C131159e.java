package com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9950c;

import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.libraries.mdi.download.C28804cs;
import com.google.android.libraries.mdi.download.C28805ct;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.C29651hv;
import com.google.android.libraries.mdi.download.C29652hw;
import com.google.android.libraries.mdi.download.C29678r;
import com.google.android.libraries.performance.primes.C31164au;
import com.google.android.libraries.performance.primes.C31167ax;
import com.google.android.libraries.performance.primes.metrics.p2415i.C31520m;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.p.c.e */
/* compiled from: PG */
public final class C131159e {

    /* renamed from: a */
    public final C58974d f358676a;

    /* renamed from: b */
    public final C29409fd f358677b;

    /* renamed from: c */
    private final ExecutorService f358678c;

    public C131159e(C130603a aVar, C29409fd fdVar, C60887da daVar) {
        this.f358676a = aVar.mo109740b(this);
        this.f358677b = fdVar;
        this.f358678c = daVar;
    }

    /* renamed from: c */
    public static void m213677c(C31520m mVar, String str) {
        if (str.equals("hammerspace_hammerdb_index_group_tng")) {
            C31167ax.m58112a().mo36918j(mVar, C31164au.m58092b("HammerDB_index_group_download"), 1);
        } else if (str.equals("hammerspace_hammerdb_slices_group_tng")) {
            C31167ax.m58112a().mo36918j(mVar, C31164au.m58092b("HammerDB_slice_group_download"), 1);
        }
    }

    /* renamed from: a */
    public final C60870cx mo110104a(C131160f fVar) {
        C131155a aVar = (C131155a) fVar;
        ((C58970a) ((C58970a) this.f358676a.mo56224b()).mo56372aa(39048)).mo56389s("Downloading %s.", aVar.f358667a);
        C31520m c = C31167ax.m58112a().mo36912c();
        C29409fd fdVar = this.f358677b;
        C29651hv e = C29652hw.m54673e();
        ((C29678r) e).f80363a = aVar.f358667a;
        C47633f i = C47633f.m84733g(fdVar.mo34722k(e.mo34789a())).mo51516i(new C131156b(this, fVar), this.f358678c).mo51516i(new C131157c(this, fVar), this.f358678c);
        C131158d dVar = new C131158d(this, c, fVar);
        C60856cj.m92911t(i, C47810es.m84974n(dVar), this.f358678c);
        return i;
    }

    /* renamed from: b */
    public final C60870cx mo110105b(String str) {
        C29409fd fdVar = this.f358677b;
        C28804cs f = C28805ct.m53747f();
        f.mo34449c(str);
        return fdVar.mo34717f(f.mo34447a());
    }
}
