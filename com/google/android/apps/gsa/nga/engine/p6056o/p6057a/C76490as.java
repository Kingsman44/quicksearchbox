package com.google.android.apps.gsa.nga.engine.p6056o.p6057a;

import com.google.android.apps.gsa.nga.engine.ax.c.b;
import com.google.android.apps.gsa.nga.engine.ax.c.g;
import com.google.android.apps.gsa.nga.engine.ax.c.o;
import com.google.android.apps.gsa.nga.engine.ax.c.r;
import com.google.android.apps.gsa.nga.engine.ax.c.s;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.C77423q;
import com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6076i.C76741a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6095g.C77381af;
import com.google.android.apps.gsa.nga.engine.p6056o.p6095g.C77388am;
import com.google.android.apps.gsa.nga.engine.p6056o.p6095g.C77402o;
import com.google.android.apps.gsa.nga.engine.p6260x.C79849ag;
import com.google.android.apps.gsa.nga.engine.p6260x.C79853ak;
import com.google.android.apps.gsa.nga.engine.p6260x.C79863k;
import com.google.android.apps.gsa.nga.engine.understanding.C78977ad;
import com.google.android.apps.gsa.nga.engine.understanding.C78994au;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.C60321oe;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p4449cd.p4456g.C57981b;
import dagger.C68214a;
import java.util.Comparator;
import java.util.Set;
import p3186j$.util.Comparator;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collector;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.a.as */
/* compiled from: PG */
public final class C76490as implements C77423q {

    /* renamed from: a */
    public final C58974d f211679a = C58974d.m91134h("FulfillmentOrchestrator");

    /* renamed from: b */
    public final C22871g f211680b;

    /* renamed from: c */
    public final Set f211681c;

    /* renamed from: d */
    public final C83334w f211682d;

    /* renamed from: e */
    public final C79863k f211683e;

    /* renamed from: f */
    public final C91142g f211684f;

    /* renamed from: g */
    public final C76741a f211685g;

    /* renamed from: h */
    private final C76529w f211686h;

    /* renamed from: i */
    private final C22871g f211687i;

    /* renamed from: j */
    private final Comparator f211688j;

    /* renamed from: k */
    private final C79853ak f211689k;

    /* renamed from: l */
    private final C68214a f211690l;

    public C76490as(C76529w wVar, C22871g gVar, C22871g gVar2, Set set, C77381af afVar, C83334w wVar2, C79863k kVar, C91142g gVar3, C79853ak akVar, C76741a aVar, C68214a aVar2) {
        this.f211686h = wVar;
        this.f211680b = gVar;
        this.f211687i = gVar2;
        this.f211681c = set;
        this.f211688j = afVar;
        this.f211682d = wVar2;
        this.f211683e = kVar;
        this.f211684f = gVar3;
        this.f211689k = akVar;
        this.f211685g = aVar;
        this.f211690l = aVar2;
    }

    /* renamed from: a */
    public final C60870cx mo72211a(C78994au auVar, C74965n nVar) {
        C78994au auVar2 = auVar;
        C74965n nVar2 = nVar;
        this.f211683e.mo74237c(C89849ae.NGA_FULFILLMENT_START, nVar.mo71336k());
        C77388am b = auVar.mo73754b();
        C77402o a = auVar.mo73753a();
        C76529w wVar = this.f211686h;
        C58480gp e = C58485gu.m89837e();
        C78977ad c = auVar.mo73755c();
        C76527u uVar = new C76527u(auVar2);
        for (C76530x vVar : wVar.f211755a) {
            s f = auVar.mo73758f();
            C76528v vVar2 = new C76528v(vVar, nVar2);
            e.mo55395g(f.f(new o(vVar2), "[NGA] FulfillmentCandidateFactories.createCandidates", wVar.f211756b, c, uVar, true).d(r.a, true));
        }
        s g = s.g(e.mo55394f());
        Comparator comparing = Comparator.CC.comparing(new C76479ah(b, a), this.f211688j);
        C58480gp e2 = C58485gu.m89837e();
        s e3 = g.f(new C76480ai(this, auVar2, nVar2), "[NGA] FulfillmentOrchestrator fulfill.", this.f211680b, auVar.mo73755c(), new C76481aj(a), true).e(new C76482ak(), true).c(new C76483al(a)).e(new C76532z(this, a, b, e2, auVar), true);
        Collector maxBy = Collectors.maxBy(comparing);
        C57981b bVar = e3.a;
        b bVar2 = new b(maxBy);
        bVar.mo20440jJ(bVar2);
        SettableFuture settableFuture = bVar2.a;
        g e4 = auVar.mo73757e();
        for (Object h : e4.a) {
            e4.mo54591h(h);
        }
        e4.mo54589f(true);
        C60870cx i = this.f211680b.mo28209i(settableFuture, "[NGA] FulfillmentOrchestrator maybeConvertToCloudResponse.", new C76472aa(this, nVar2));
        this.f211680b.mo28211k(i, "[NGA] FulfillmentOrchestrator log results.", new C76484am(this, e2, nVar, a, b));
        C60856cj.m92911t(i, new C76485an(this, i, auVar.mo73755c()), C60826bg.f164896a);
        this.f211680b.mo28211k(i, "[NGA] FulfillmentOrchestrator.logAppFlow", new C76486ao(this, nVar2));
        this.f211680b.mo28211k(i, "[NGA] FulfillmentOrchestrator.fulfill.informResponseListeners", new C76489ar(this));
        return i;
    }

    /* renamed from: b */
    public final void mo72212b(C58485gu guVar, Optional optional, C80401n nVar, C74965n nVar2) {
        this.f211687i.mo28212l("[NGA] FulfillmentOrchestrator.logInBackground", new C76477af(this, guVar, nVar2, optional, nVar));
    }

    /* renamed from: c */
    public final void mo72213c(int i, C74965n nVar) {
        C28292j jVar = new C28292j(88534);
        jVar.mo33794h(i);
        C60321oe b = C28285c.m52875b(C28293k.m52907d(jVar, C58485gu.m89845m()), 88755);
        if (b != null) {
            ((C79849ag) this.f211690l.mo27525b()).mo74228c(b, Optional.ofNullable(this.f211689k.mo74223h(nVar.mo71336k())));
        }
    }
}
