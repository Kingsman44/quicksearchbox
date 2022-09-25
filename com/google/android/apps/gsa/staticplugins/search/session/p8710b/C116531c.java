package com.google.android.apps.gsa.staticplugins.search.session.p8710b;

import android.os.Bundle;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6895f.C87344a;
import com.google.android.apps.gsa.shared.search.C90498f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.staticplugins.p7377ah.p7378a.C93849c;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116604bo;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116766ho;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.common.p4552o.amo;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.b.c */
/* compiled from: PG */
public final class C116531c implements C87344a {

    /* renamed from: a */
    public final C116766ho f323131a;

    /* renamed from: b */
    private final C116604bo f323132b;

    public C116531c(C116604bo boVar, C116766ho hoVar) {
        this.f323132b = boVar;
        this.f323131a = hoVar;
    }

    /* renamed from: a */
    public final String mo80985a() {
        return ((C116735gk) this.f323132b.f323383d.mo27525b()).f323783o.mo84346be();
    }

    /* renamed from: b */
    public final List mo80986b() {
        return this.f323132b.f323388i;
    }

    /* renamed from: c */
    public final boolean mo80987c() {
        C116604bo boVar = this.f323132b;
        return boVar.f323385f || boVar.f323386g;
    }

    /* renamed from: d */
    public final boolean mo80988d() {
        return this.f323132b.f323386g;
    }

    /* renamed from: e */
    public final void mo80989e(String str, amo amo) {
        String bf;
        C116604bo boVar = this.f323132b;
        Query query = ((C116735gk) boVar.f323383d.mo27525b()).f323783o;
        if (!((C116735gk) boVar.f323383d.mo27525b()).mo102879U() && (bf = ((C116735gk) boVar.f323383d.mo27525b()).f323784p.mo84347bf("android.search.extra.EVENT_ID")) != null) {
            query = query.mo84306ar(bf);
        }
        C90498f i = query.mo84480i();
        i.mo84588t(str, true);
        i.mo84561T(QueryTriggerType.CORPUS_SELECTOR);
        i.f252966D = true;
        String bf2 = query.mo84347bf("android.search.extra.EVENT_ID");
        if (bf2 != null) {
            Bundle g = query.mo84477g();
            g.getClass();
            g.remove("android.search.extra.EVENT_ID");
            g.putString("android.search.extra.PARENT_EVENT_ID", bf2);
            i.mo84589u(g);
        }
        Query aL = i.mo84568a().mo84275aL("gsa-dynamic-activity");
        if (amo != null) {
            aL = aL.mo84272aI(amo);
        }
        if (((C116735gk) boVar.f323383d.mo27525b()).mo102879U()) {
            ((C116735gk) boVar.f323383d.mo27525b()).mo102868F(aL);
        } else {
            ((C116735gk) boVar.f323383d.mo27525b()).mo80462q(aL);
        }
    }

    /* renamed from: f */
    public final void mo80990f(C93849c cVar, C23052c cVar2) {
        C116529a aVar = new C116529a(cVar);
        this.f323131a.mo80760l(aVar);
        cVar2.mo28427o(new C116530b(this, aVar, cVar2));
    }
}
