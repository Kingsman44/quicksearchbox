package com.google.android.apps.gsa.staticplugins.p7922eo;

import com.google.android.apps.gsa.assist.p501a.C9318f;
import com.google.android.apps.gsa.c.f.al;
import com.google.android.apps.gsa.c.f.u;
import com.google.android.apps.gsa.c.l;
import com.google.android.apps.gsa.p5836c.C74460g;
import com.google.android.apps.gsa.p5836c.p5843f.C74458k;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119055k;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119063s;
import com.google.android.apps.gsa.search.core.p6519al.p6648ch.C85107a;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85422c;
import com.google.android.apps.gsa.search.core.p6820r.C86577w;
import com.google.android.apps.gsa.search.core.p6820r.p6838j.C86498a;
import com.google.android.apps.gsa.search.shared.p6926d.C87541c;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60873d;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;

/* renamed from: com.google.android.apps.gsa.staticplugins.eo.ai */
/* compiled from: PG */
final class C100580ai implements C22868d {

    /* renamed from: a */
    final /* synthetic */ Query f281211a;

    /* renamed from: b */
    final /* synthetic */ C85422c f281212b;

    /* renamed from: c */
    final /* synthetic */ SettableFuture f281213c;

    /* renamed from: d */
    final /* synthetic */ int f281214d;

    /* renamed from: e */
    final /* synthetic */ ClientConfig f281215e;

    /* renamed from: f */
    final /* synthetic */ C89061q f281216f;

    /* renamed from: g */
    final /* synthetic */ C86498a f281217g;

    /* renamed from: h */
    final /* synthetic */ C89356b f281218h;

    /* renamed from: i */
    final /* synthetic */ C58833ax f281219i;

    /* renamed from: j */
    final /* synthetic */ C100585an f281220j;

    public C100580ai(C100585an anVar, Query query, C85422c cVar, SettableFuture settableFuture, int i, ClientConfig clientConfig, C89061q qVar, C86498a aVar, C89356b bVar, C58833ax axVar) {
        this.f281220j = anVar;
        this.f281211a = query;
        this.f281212b = cVar;
        this.f281213c = settableFuture;
        this.f281214d = i;
        this.f281215e = clientConfig;
        this.f281216f = qVar;
        this.f281217g = aVar;
        this.f281218h = bVar;
        this.f281219i = axVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        this.f281213c.mo57357o(th);
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17702gm(Object obj) {
        al alVar;
        C86577w wVar;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            alVar = (C74458k) axVar.mo56107c();
        } else {
            alVar = this.f281220j.mo91979b(this.f281211a, this.f281212b);
        }
        if (this.f281211a.mo84412cs()) {
            l lVar = this.f281220j.f281234E;
            al alVar2 = alVar;
            if (lVar.f && lVar.j.mo85390b()) {
                lVar.e.mo28212l("Set audioRequestListeningSessionAdapter", new C74460g(lVar, alVar2));
            }
        }
        if (this.f281213c.value instanceof C60873d.C60875b) {
            ((u) this.f281220j.f281232C.mo27525b()).f("VSWorkerHelper", C58833ax.m90834k(alVar));
            return;
        }
        C100585an anVar = this.f281220j;
        SettableFuture settableFuture = this.f281213c;
        Query query = this.f281211a;
        int i = this.f281214d;
        ClientConfig clientConfig = this.f281215e;
        C89061q qVar = this.f281216f;
        C85422c cVar = this.f281212b;
        C86498a aVar = this.f281217g;
        C89356b bVar = this.f281218h;
        C58833ax axVar2 = this.f281219i;
        C58833ax k = C58833ax.m90834k(alVar);
        C58833ax b = ((C74458k) ((C58847bk) k).f156646a).mo70775b();
        if (b.mo56113h()) {
            anVar.f281231B.b(b, query.f252749G);
        }
        cVar.mo78950p(query);
        Query aM = query.mo84276aM(i);
        if (aM.mo84403cj() && aM.mo84434dO() && aM.mo84363bw("android.opa.extra.INITIAL_QUERY") && !aM.mo84338bW() && !aM.mo84328bM() && anVar.f281256r.mo17583e()) {
            C58976aa aaVar = C58975e.f156826a;
            ((C87541c) anVar.f281255q.mo27525b()).f236453o.mo17529f(C9318f.CONTEXTUAL);
        }
        C58976aa aaVar2 = C58975e.f156826a;
        C100622s sVar = new C100622s(anVar, aM, b, clientConfig);
        C85107a aVar2 = anVar.f281262x;
        C58833ax axVar3 = axVar2;
        C85107a aVar3 = aVar2;
        C89356b bVar2 = bVar;
        C86498a aVar4 = aVar;
        C60870cx a = C100619p.m166757a(bVar, aM, sVar, i, qVar, cVar, aVar3, k, anVar.f281233D);
        C60870cx h = C60922j.m93045h(a, new C100572aa(aM), C60826bg.f164896a);
        C90476a aVar5 = C91018d.f254254a;
        C60870cx h2 = C60922j.m93045h(h, C100573ab.f281192a, C60826bg.f164896a);
        if (!axVar3.mo56113h()) {
            anVar.f281245g.mo28211k(h, "Obtained VoiceResult", new C100581aj(anVar, cVar, aM, clientConfig));
        }
        if (axVar3.mo56113h()) {
            wVar = aVar4.mo80185i(aM, C119063s.m197648a(a, C119055k.f332143a), (C60870cx) axVar3.mo56107c(), bVar2);
            new C90873ag(wVar.mo80180a(), anVar.f281245g, "SearchGraph finished", C100574ac.f281193a).mo85223a(C100575ad.f281194a);
        } else {
            wVar = null;
        }
        C86577w wVar2 = wVar;
        C100609f fVar = anVar.f281264z;
        boolean z = anVar.f281235F;
        aM.getClass();
        C68214a a2 = C68219e.m98518a(((C68226l) fVar.f281328a).f184585a);
        a2.getClass();
        ((C22871g) fVar.f281329b.mo17428b()).getClass();
        u uVar = (u) fVar.f281330c.mo17428b();
        uVar.getClass();
        anVar.f281236G = new C100608e(aM, h2, wVar2, bVar2, k, z, a2, uVar);
        settableFuture.mo57356n(anVar.f281236G);
    }
}
