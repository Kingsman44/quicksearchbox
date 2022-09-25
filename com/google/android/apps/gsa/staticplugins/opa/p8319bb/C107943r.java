package com.google.android.apps.gsa.staticplugins.opa.p8319bb;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.p6482q.p6483a.C84234g;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8320a.C107739r;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.r */
/* compiled from: PG */
final class C107943r implements C107739r {

    /* renamed from: a */
    final /* synthetic */ C107945t f300326a;

    public C107943r(C107945t tVar) {
        this.f300326a = tVar;
    }

    /* renamed from: a */
    public final void mo96263a(Query query) {
        ((C89859i) this.f300326a.f300349d.mo27525b()).mo83702b(C89849ae.OPA_NEW_QUERY_COMMITTED);
        C87684al alVar = new C87684al(C88244um.ASSISTANT_REQUEST_ID);
        alVar.mo81966c(query);
        this.f300326a.mo96340m(alVar.mo81964a());
        e a = e.a(query.mo84263a("android.opa.extra.TRIGGERED_BY"));
        if (((C58833ax) this.f300326a.f300351f.mo27525b()).mo56113h()) {
            C90875ai.m148465b(C107941p.f300324a, ((C84234g) ((C58833ax) this.f300326a.f300351f.mo27525b()).mo56107c()).mo77709a(a), this.f300326a.f300350e, "cache opa trigger type").mo85223a(C107942q.f300325a);
        }
    }

    /* renamed from: b */
    public final void mo96264b(Query query) {
    }
}
