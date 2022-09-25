package com.google.android.apps.gsa.search.core.p6820r.p6837i;

import com.google.android.apps.gsa.search.core.p6820r.C86394c;
import com.google.android.apps.gsa.search.core.p6820r.C86570p;
import com.google.android.apps.gsa.search.core.p6820r.C86574t;
import com.google.android.apps.gsa.search.core.p6820r.C86575u;
import com.google.android.apps.gsa.search.core.p6820r.C86576v;
import com.google.android.apps.gsa.search.core.p6820r.C86577w;
import com.google.android.apps.gsa.shared.logger.p7053c.C89880c;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.search.core.r.i.k */
/* compiled from: PG */
final class C86493k implements C22862b {

    /* renamed from: a */
    final /* synthetic */ C86494l f233730a;

    public C86493k(C86494l lVar) {
        this.f233730a = lVar;
    }

    /* renamed from: b */
    public final C60870cx mo17947a() {
        C86575u uVar;
        C86570p pVar;
        if (!this.f233730a.f233735e.mo84326bK()) {
            C86494l lVar = this.f233730a;
            if (!lVar.f233739i.mo80164h(lVar.f233735e)) {
                return C86494l.f233732b;
            }
        }
        C86494l lVar2 = this.f233730a;
        C86394c cVar = lVar2.f233738h;
        C58833ax axVar = cVar.f233508a;
        cVar.f233508a = C58833ax.m90834k(lVar2);
        if (axVar.mo56113h()) {
            C89880c.m146354a(this.f233730a.f233735e);
            ((C86577w) axVar.mo56107c()).mo80181b();
        }
        this.f233730a.f233737g.mo80109c();
        C86494l lVar3 = this.f233730a;
        lVar3.f233737g.mo80110d(lVar3.f233735e);
        C58485gu guVar = this.f233730a.f233742l;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            ((C86576v) guVar.get(i)).mo80196b();
        }
        C86494l lVar4 = this.f233730a;
        synchronized (lVar4.f233740j) {
            uVar = lVar4.f233741k;
            lVar4.f233741k = null;
        }
        if (uVar == null) {
            pVar = new C86574t(C86570p.f233891a, C86494l.f233733c, C86494l.f233732b);
        } else {
            pVar = uVar.mo80194b(lVar4.f233735e);
        }
        this.f233730a.f233736f.mo28211k(pVar.mo80193c(), "Search done", new C86486d(this.f233730a));
        if (this.f233730a.f233735e.mo84430dK()) {
            C90875ai.m148465b(new C86487e(this), pVar.mo80193c(), this.f233730a.f233736f, "Query completion").mo85223a(new C86488f(this));
        }
        C60870cx a = C90877ak.m148467a(Arrays.asList(new C60870cx[]{pVar.mo80191a(), pVar.mo80193c()}));
        C90875ai.m148465b(new C86489g(this), a, this.f233730a.f233736f, "Search Results Ready").mo85223a(new C86490h(this));
        this.f233730a.f233734d.mo83286e().mo54567b(new C86491i(this, a));
        return pVar.mo80193c();
    }

    /* renamed from: c */
    public final void mo80178c() {
        C86494l lVar = this.f233730a;
        lVar.f233737g.mo80108b(lVar.f233735e);
    }

    /* renamed from: d */
    public final void mo80179d() {
        C58485gu guVar = this.f233730a.f233742l;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            ((C86576v) guVar.get(i)).mo80197c();
        }
        C86494l lVar = this.f233730a;
        lVar.f233737g.mo80112f(lVar.f233735e);
    }
}
