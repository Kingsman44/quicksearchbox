package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.base.C58887cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.bb */
/* compiled from: PG */
final class C116591bb implements C22868d {

    /* renamed from: a */
    public final Query f323335a;

    /* renamed from: b */
    final /* synthetic */ C116593bd f323336b;

    public C116591bb(C116593bd bdVar, Query query) {
        this.f323336b = bdVar;
        this.f323335a = query;
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
        ((C116735gk) this.f323336b.f323344c.mo27525b()).mo102907x(this.f323335a, new SearchError(this.f323335a, (String) null, cVar));
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17702gm(Object obj) {
        C86232bo boVar = (C86232bo) obj;
        new C90873ag(this.f323336b.f323345d.mo28210j(this.f323336b.f323345d.mo28209i(boVar.mo79896t(), "Pass back Clockwork result", new C116586ax(this)), "Get action data", new C116587ay(boVar)), this.f323336b.f323345d, "Pass back action data", new C116588az(this)).mo85223a(C116590ba.f323334a);
        ((C116735gk) this.f323336b.f323344c.mo27525b()).mo102864A(this.f323335a);
    }
}
