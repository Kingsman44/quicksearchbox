package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.base.C58887cx;

/* renamed from: com.google.android.apps.gsa.search.core.state.bu */
/* compiled from: PG */
final class C86852bu implements C22868d {

    /* renamed from: a */
    public final Query f234562a;

    /* renamed from: b */
    final /* synthetic */ C86854bw f234563b;

    public C86852bu(C86854bw bwVar, Query query) {
        this.f234563b = bwVar;
        this.f234562a = query;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C90456c cVar;
        C58887cx.m90979f(th, Error.class);
        if (th instanceof C90456c) {
            cVar = (C90456c) th;
        } else {
            cVar = new C90452a(th, 211, C89885b.INTERNAL_ERROR_SEE_STACK_TRACE_VALUE);
        }
        ((C87052fn) this.f234563b.f234571c.mo27525b()).mo80714s(this.f234562a, new SearchError(this.f234562a, (String) null, cVar));
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17702gm(Object obj) {
        C86232bo boVar = (C86232bo) obj;
        new C90873ag(this.f234563b.f234572d.mo28210j(this.f234563b.f234572d.mo28209i(boVar.mo79896t(), "Pass back Clockwork result", new C86848bq(this)), "Get action data", new C86849br(boVar)), this.f234563b.f234572d, "Pass back action data", new C86850bs(this)).mo85223a(C86851bt.f234561a);
        ((C87052fn) this.f234563b.f234571c.mo27525b()).mo80717v(this.f234562a);
    }
}
