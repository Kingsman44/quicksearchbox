package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.p6211a;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.C78728n;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6159c.C78224b;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78236a;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78255e;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78260j;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78262l;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78263m;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.p6167b.C78245d;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78801c;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78804f;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78806h;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78808j;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78810l;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78813o;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78814p;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78815q;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78816r;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78817s;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.p6212b.C78799a;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80762ej;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import com.google.android.apps.gsa.shared.p6983ah.C89160q;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.s.a.u */
/* compiled from: PG */
public final class C78796u implements C78236a, C78255e, C78260j, C78817s, C78728n {

    /* renamed from: f */
    private static final C59071e f216877f = C59071e.m91332i("com.google.android.apps.gsa.nga.engine.ui.e.s.a.u");

    /* renamed from: a */
    public final C83357g f216878a = new C83361k(C78816r.f216932a, C78263m.class);

    /* renamed from: b */
    public final C83358h f216879b;

    /* renamed from: c */
    public final C83358h f216880c;

    /* renamed from: d */
    public final C83357g f216881d = new C83361k(C78808j.UNRECOGNIZED, C78263m.class);

    /* renamed from: e */
    public final C83363m f216882e = new C83363m();

    /* renamed from: g */
    private final C22871g f216883g;

    /* renamed from: h */
    private final C83358h f216884h;

    /* renamed from: i */
    private final C83363m f216885i = new C83363m();

    /* renamed from: j */
    private final C78262l f216886j;

    /* renamed from: k */
    private final C78799a f216887k;

    public C78796u(C22871g gVar, C83358h hVar, C83358h hVar2, C83358h hVar3, C78799a aVar, C78262l lVar) {
        this.f216883g = gVar;
        this.f216879b = hVar;
        this.f216880c = hVar2;
        this.f216884h = hVar3;
        this.f216887k = aVar;
        this.f216886j = lVar;
    }

    /* renamed from: w */
    private final boolean m126567w() {
        int h = ((C78245d) this.f216880c.mo76657c()).mo73180b().mo73175h();
        boolean z = h == 2;
        if (h != 0) {
            return z;
        }
        throw null;
    }

    /* renamed from: x */
    private final boolean m126568x() {
        int h = ((C78245d) this.f216880c.mo76657c()).mo73180b().mo73175h();
        boolean z = h == 3;
        if (h != 0) {
            return z;
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo73153a() {
        this.f216883g.mo28212l("[NGA] onAssistantExplicitDismissGesture", new C78791p(this));
    }

    /* renamed from: b */
    public final void mo73154b() {
        this.f216883g.mo28212l("[NGA] onAssistantImplicitDismissGesture", new C78783h(this));
    }

    /* renamed from: c */
    public final void mo73155c() {
        this.f216883g.mo28212l("[NGA] onInputPlateInteraction", new C78792q(this));
    }

    /* renamed from: d */
    public final void mo73227d() {
        this.f216883g.mo28212l("[NGA] activeNotListening", new C78784i(this));
    }

    /* renamed from: e */
    public final void mo73228e() {
        this.f216883g.mo28212l("[NGA] activeNotListeningWithSpeedBump", new C78781f(this));
    }

    /* renamed from: f */
    public final void mo73229f() {
        this.f216883g.mo28212l("[NGA] activateScreenContextExplanationSession", new C78794s(this));
    }

    /* renamed from: g */
    public final void mo73244g() {
        this.f216883g.mo28212l("[NGA] activateOAuthTokenFixSession", new C78795t(this));
    }

    /* renamed from: h */
    public final void mo73112h() {
        mo73623t(C78816r.f216932a);
        this.f216885i.mo76661a();
    }

    /* renamed from: i */
    public final void mo73113i() {
        this.f216885i.mo76663c(C83349aj.m132655j(this.f216880c, this.f216886j.mo73247a(), this.f216881d, new C78780e(this)), new C78787l(this));
        this.f216885i.mo76663c(this.f216881d, new C78788m(this));
        this.f216885i.mo76663c(C83349aj.m132658m(this.f216879b, C78789n.f216870a), new C78790o(this));
    }

    /* renamed from: j */
    public final /* synthetic */ void mo73114j() {
    }

    /* renamed from: k */
    public final /* synthetic */ void mo73115k() {
    }

    /* renamed from: l */
    public final void mo73615l(boolean z) {
        C78814p pVar;
        if (C78816r.m126609n((C78815q) ((C83361k) this.f216878a).f227199b.get())) {
            C78815q qVar = (C78815q) ((C83361k) this.f216878a).f227199b.get();
            if (qVar.f216929a == 3) {
                pVar = (C78814p) qVar.f216930b;
            } else {
                pVar = C78814p.f216922d;
            }
            C78813o oVar = (C78813o) pVar.toBuilder();
            oVar.copyOnWrite();
            ((C78814p) oVar.instance).f216926c = z;
            C78814p pVar2 = (C78814p) oVar.build();
            C78801c cVar = (C78801c) C78815q.f216927d.createBuilder();
            cVar.copyOnWrite();
            C78815q qVar2 = (C78815q) cVar.instance;
            pVar2.getClass();
            qVar2.f216930b = pVar2;
            qVar2.f216929a = 3;
            mo73622s(cVar);
        }
    }

    /* renamed from: m */
    public final void mo73616m() {
        if (!C78816r.m126597b((C78815q) ((C83361k) this.f216878a).f227199b.get()) && !((C78224b) this.f216879b.mo76657c()).mo73148k(C89160q.DEMAND_STATE) && !m126567w()) {
            mo73623t(C78816r.f216932a);
        }
    }

    /* renamed from: n */
    public final void mo73617n(C78808j jVar) {
        if (m126568x() || m126567w()) {
            this.f216881d.mo76660b(jVar);
        }
    }

    /* renamed from: o */
    public final void mo73618o() {
        if (m126568x() || m126567w()) {
            this.f216881d.mo76660b(C78808j.UNRECOGNIZED);
        }
    }

    /* renamed from: p */
    public final void mo73619p() {
        if (((C78245d) this.f216880c.mo76657c()).mo73184g()) {
            mo73623t(C78816r.f216932a);
        } else {
            mo73625v(2);
        }
    }

    /* renamed from: q */
    public final Long mo73620q(C78815q qVar) {
        Optional a = C78816r.m126596a(qVar);
        C78799a aVar = this.f216887k;
        Objects.requireNonNull(aVar);
        return (Long) a.orElseGet(new C78782g(aVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final /* synthetic */ Long mo73621r() {
        return mo73620q((C78815q) ((C83361k) this.f216878a).f227199b.get());
    }

    /* renamed from: s */
    public final void mo73622s(C78801c cVar) {
        boolean b = ((C80762ej) this.f216884h.mo76657c()).mo74563b();
        cVar.copyOnWrite();
        C78815q qVar = C78815q.f216927d;
        ((C78815q) cVar.instance).f216931c = b;
        C78815q qVar2 = (C78815q) cVar.build();
        ((C59052c) ((C59052c) f216877f.mo56224b()).mo56372aa(5351)).mo56389s("Setting session to type: %s", C78810l.m126595a(qVar2.f216929a));
        this.f216878a.mo76660b(qVar2);
    }

    /* renamed from: t */
    public final void mo73623t(C78815q qVar) {
        mo73622s((C78801c) qVar.toBuilder());
    }

    /* renamed from: u */
    public final boolean mo73624u() {
        return !m126568x();
    }

    /* renamed from: v */
    public final void mo73625v(int i) {
        if (!((C78224b) this.f216879b.mo76657c()).mo73148k(C89160q.DEMAND_STATE)) {
            C78801c cVar = (C78801c) C78815q.f216927d.createBuilder();
            C78804f fVar = (C78804f) C78806h.f216899c.createBuilder();
            long longValue = mo73620q((C78815q) ((C83361k) this.f216878a).f227199b.get()).longValue();
            fVar.copyOnWrite();
            ((C78806h) fVar.instance).f216901a = longValue;
            fVar.copyOnWrite();
            ((C78806h) fVar.instance).f216902b = i - 2;
            cVar.copyOnWrite();
            C78815q qVar = (C78815q) cVar.instance;
            C78806h hVar = (C78806h) fVar.build();
            hVar.getClass();
            qVar.f216930b = hVar;
            qVar.f216929a = 5;
            mo73622s(cVar);
        }
    }
}
