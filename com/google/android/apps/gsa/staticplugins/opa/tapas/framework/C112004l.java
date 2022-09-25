package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c.C111948ap;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112705m;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113409et;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.l */
/* compiled from: PG */
public final /* synthetic */ class C112004l implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C111825ap f311157a;

    /* renamed from: b */
    public final /* synthetic */ C48672ag f311158b;

    /* renamed from: c */
    public final /* synthetic */ C69464a f311159c;

    /* renamed from: d */
    public final /* synthetic */ boolean f311160d;

    /* renamed from: e */
    public final /* synthetic */ C113405ep f311161e;

    /* renamed from: f */
    public final /* synthetic */ C58490gz f311162f;

    public /* synthetic */ C112004l(C111825ap apVar, C48672ag agVar, C69464a aVar, boolean z, C113405ep epVar, C58490gz gzVar) {
        this.f311157a = apVar;
        this.f311158b = agVar;
        this.f311159c = aVar;
        this.f311160d = z;
        this.f311161e = epVar;
        this.f311162f = gzVar;
    }

    public final Object call() {
        C60870cx cxVar;
        C111825ap apVar = this.f311157a;
        C48672ag agVar = this.f311158b;
        C69464a aVar = this.f311159c;
        boolean z = this.f311160d;
        C113405ep epVar = this.f311161e;
        C58490gz gzVar = this.f311162f;
        long c = apVar.f310774h.mo26871c();
        C113409et etVar = (C113409et) aVar.mo17428b();
        C58976aa aaVar = C58975e.f156826a;
        etVar.mo99101a().name();
        boolean equals = C48672ag.TAPAS_SERVER.equals(agVar);
        if (equals) {
            if (z) {
                C112705m mVar = (C112705m) apVar.f310782p.mo27525b();
                long a = epVar.mo100016a();
                mVar.mo99676k(a, C89849ae.TAPAS_SERVER_SOURCE_ZERO_PREFIX_FETCH_START);
                mVar.mo99674i(C89849ae.TAPAS_SERVER_SOURCE_ZERO_PREFIX_FETCH_START, a);
            } else {
                C112705m mVar2 = (C112705m) apVar.f310782p.mo27525b();
                long a2 = epVar.mo100016a();
                mVar2.mo99676k(a2, C89849ae.TAPAS_SERVER_SOURCE_N_PREFIX_FETCH_START);
                mVar2.mo99674i(C89849ae.TAPAS_SERVER_SOURCE_N_PREFIX_FETCH_START, a2);
            }
        }
        if (!apVar.f310769c.mo79746e(C90063do.f249421dH) || !equals || !z) {
            C121537f fVar = C111825ap.f310762a;
            String name = etVar.mo99101a().name();
            cxVar = C90877ak.m148471e(fVar.mo105234c("SourceFetch_".concat(String.valueOf(name)), new C112005m(etVar, epVar, gzVar)), ((C111885bw) apVar.f310785s.mo27525b()).mo99274b(epVar.mo100033p(), C111885bw.m185717c(epVar)), TimeUnit.MILLISECONDS, apVar.f310773g);
        } else {
            cxVar = etVar.mo99103c(epVar, gzVar.mo55427f(false));
        }
        C60870cx cxVar2 = cxVar;
        ((C111948ap) apVar.f310783q.mo27525b()).mo99308b(c, cxVar2, epVar, agVar);
        return cxVar2;
    }
}
