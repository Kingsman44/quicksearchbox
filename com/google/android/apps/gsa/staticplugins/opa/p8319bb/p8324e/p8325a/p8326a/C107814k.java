package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.p8325a.p8326a;

import com.google.android.apps.gsa.nga.shared.p6345h.C81323s;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82338bm;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82567jz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82569ka;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.opa.p8595v.C113919w;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.e.a.a.k */
/* compiled from: PG */
public final /* synthetic */ class C107814k implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C107820q f299994a;

    /* renamed from: b */
    public final /* synthetic */ Query f299995b;

    public /* synthetic */ C107814k(C107820q qVar, Query query) {
        this.f299994a = qVar;
        this.f299995b = query;
    }

    public final void run() {
        C107820q qVar = this.f299994a;
        Query query = this.f299995b;
        long j = query.f252749G;
        C89849ae a = qVar.f300032k.mo100772a(j);
        if (a == null) {
            a = C89849ae.OPA_ENDSTATE_NGA_HANDOVER_TIMEOUT;
        }
        C89849ae aeVar = a;
        qVar.f300032k.mo100774c(j, C113919w.END_STATE_LOGGED);
        if (qVar.f300030i.mo56113h()) {
            C82567jz c = C82569ka.m131549c();
            ((C82338bm) c).f224930b = "timeout_session";
            ((C83305i) qVar.f300030i.mo56107c()).mo75579d(c.mo75772a());
        }
        if (qVar.f300034m.mo56113h()) {
            C60870cx a2 = ((C81323s) qVar.f300034m.mo56107c()).mo74936a();
            C107818o oVar = new C107818o(qVar, aeVar, j, query);
            C60856cj.m92911t(a2, C47810es.m84974n(oVar), C60826bg.f164896a);
        }
    }
}
