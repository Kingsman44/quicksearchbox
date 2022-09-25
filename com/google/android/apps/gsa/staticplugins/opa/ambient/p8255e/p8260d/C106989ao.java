package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8260d;

import com.google.android.apps.gsa.assistant.settings.devices.p522c.p524b.C9684l;
import com.google.android.apps.gsa.assistant.settings.features.d.u;
import com.google.android.apps.gsa.assistant.settings.shared.h;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.p6456e.C83785c;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.smartspace.p7259c.C92094j;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8229c.p8230a.C106601a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.C106864c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.C106973d;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8256a.C106858d;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8256a.p8257a.C106848a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8256a.p8257a.C106855h;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8269e.C107048a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8269e.C107058b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p4016z.C53685aj;
import com.google.assistant.p4016z.C53686ak;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C63042fg;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Collectors;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.d.ao */
/* compiled from: PG */
public final class C106989ao implements C106973d {

    /* renamed from: a */
    public final C58974d f297978a;

    /* renamed from: b */
    public final C107048a f297979b;

    /* renamed from: c */
    public final C86124t f297980c;

    /* renamed from: d */
    public final C9684l f297981d;

    /* renamed from: e */
    public final h f297982e;

    /* renamed from: f */
    public final C60888db f297983f;

    /* renamed from: g */
    public final C106601a f297984g;

    /* renamed from: h */
    private final C58495hd f297985h;

    /* renamed from: i */
    private final Set f297986i;

    /* renamed from: j */
    private final Set f297987j;

    /* renamed from: k */
    private final Set f297988k;

    /* renamed from: l */
    private final C60888db f297989l;

    /* renamed from: m */
    private final C106858d f297990m;

    /* renamed from: n */
    private final C83785c f297991n;

    /* renamed from: o */
    private final u f297992o;

    /* renamed from: p */
    private C60870cx f297993p = C60856cj.m92900i(C118826c.f331422a);

    /* renamed from: q */
    private C60870cx f297994q = C60856cj.m92900i(C118826c.f331422a);

    public C106989ao(h hVar, C86124t tVar, C9684l lVar, Map map, C60888db dbVar, C60888db dbVar2, C106601a aVar, C107048a aVar2, C83564a aVar3, Set set, Set set2, Set set3, C106858d dVar, C83785c cVar, u uVar) {
        this.f297982e = hVar;
        this.f297985h = C58495hd.m89898l(map);
        this.f297989l = dbVar;
        this.f297983f = dbVar2;
        this.f297984g = aVar;
        this.f297979b = aVar2;
        C83564a aVar4 = aVar3;
        this.f297978a = aVar3.mo76900a("SuggAggr");
        this.f297986i = set;
        this.f297987j = set2;
        this.f297988k = set3;
        this.f297992o = uVar;
        this.f297980c = tVar;
        this.f297981d = lVar;
        this.f297990m = dVar;
        this.f297991n = cVar;
    }

    /* renamed from: c */
    private final C60870cx m177707c(Set set, C106596h hVar, C60870cx cxVar) {
        C107001l lVar = new C107001l(this, set, hVar);
        return C60922j.m93045h(cxVar, C47810es.m84966f(lVar), this.f297983f);
    }

    /* renamed from: d */
    private final synchronized void m177708d(C106596h hVar) {
        C60870cx cxVar;
        if (this.f297980c.mo79746e(C90017bw.f247927ap)) {
            if (!this.f297994q.isDone()) {
                this.f297994q.cancel(true);
            }
            C106858d dVar = this.f297990m;
            if (!hVar.f297208c) {
                ((C58970a) ((C58970a) ((C106855h) dVar).f297735e.mo56224b()).mo56372aa(23328)).mo56386p("Headset not connected, returning empty suggestions.");
                cxVar = C47633f.m84733g(C60856cj.m92900i(C106855h.m177613a(C58485gu.m89845m())));
            } else {
                C60870cx b = ((C106855h) dVar).f297732b.mo76966b();
                C106848a aVar = new C106848a((C106855h) dVar);
                cxVar = C60922j.m93044g(b, C47810es.m84963c(aVar), ((C106855h) dVar).f297733c);
            }
            C83785c cVar = this.f297991n;
            Objects.requireNonNull(cVar);
            C107003n nVar = new C107003n(cVar);
            this.f297994q = C60922j.m93045h(cxVar, C47810es.m84966f(nVar), this.f297983f);
        }
    }

    /* renamed from: a */
    public final synchronized C60870cx mo95725a(C106596h hVar) {
        C60870cx a;
        this.f297984g.mo95589c(5);
        ((C58970a) ((C58970a) this.f297978a.mo56224b()).mo56372aa(23434)).mo56386p("onContextChanged");
        Collection.EL.stream(this.f297985h.values()).map(C106999j.f298007a).collect(Collectors.joining("\n"));
        C107048a aVar = this.f297979b;
        C53685aj ajVar = (C53685aj) C53686ak.f140913f.createBuilder();
        C63042fg a2 = aVar.mo95741a();
        ajVar.copyOnWrite();
        C53686ak akVar = (C53686ak) ajVar.instance;
        a2.getClass();
        akVar.f140918d = a2;
        akVar.f140915a |= 1;
        ajVar.copyOnWrite();
        C53686ak akVar2 = (C53686ak) ajVar.instance;
        hVar.getClass();
        akVar2.f140917c = hVar;
        akVar2.f140916b = 8;
        long j = hVar.f297215j;
        ajVar.copyOnWrite();
        C53686ak akVar3 = (C53686ak) ajVar.instance;
        akVar3.f140915a |= 2;
        akVar3.f140919e = j;
        ((C107058b) aVar.f298089b.mo17428b()).mo95744a((C53686ak) ajVar.build());
        m177708d(hVar);
        if (!this.f297993p.isDone()) {
            this.f297993p.cancel(true);
        }
        C58495hd hdVar = (C58495hd) Collection.EL.stream(this.f297985h.entrySet()).filter(new C106982ah(hVar)).collect(C58370cn.m89403c(C106984aj.f297973a, C106993d.f298001a, C106994e.f298002a));
        C60870cx o = C60856cj.m92906o((Iterable) Collection.EL.stream(((C58495hd) Stream.CC.concat(Collection.EL.stream(hdVar.entrySet()).filter(new C106997h(Collection.EL.stream(hdVar.values()).filter(C106995f.f298003a).mapToInt(C106996g.f298004a).min().orElse(Integer.MAX_VALUE))), Collection.EL.stream(hdVar.entrySet()).filter(C106998i.f298006a)).collect(C58370cn.m89403c(C106984aj.f297973a, C106993d.f298001a, C106983ai.f297972a))).entrySet()).peek(new C107012w(this)).map(new C107013x(this, hVar)).collect(C58370cn.f155946a));
        C60870cx g = C60922j.m93044g(o, C47810es.m84963c(new C107004o(this)), this.f297983f);
        C60856cj.m92911t(g, C47810es.m84974n(new C106985ak(this)), this.f297989l);
        C60870cx g2 = C60922j.m93044g(o, C47810es.m84963c(C107007r.f298020a), this.f297983f);
        C60856cj.m92911t(g2, C47810es.m84974n(new C106988an(this)), this.f297989l);
        C47633f h = C47633f.m84733g(o).mo51515h(C107010u.f298025a, this.f297983f);
        C60856cj.m92911t(h.f164926b, C47810es.m84974n(new C106986al(this)), this.f297989l);
        C47638k.m84751b(g, g2).mo51520a(new C106992c(this, g, g2, hVar), this.f297983f);
        a = C47638k.m84751b(m177707c(this.f297986i, hVar, g), m177707c(this.f297988k, hVar, g2), m177707c(this.f297987j, hVar, h)).mo51520a(C107000k.f298008a, this.f297983f);
        this.f297993p = a;
        return a;
    }

    /* renamed from: b */
    public final C60870cx mo95726b(C106864c cVar, C92094j jVar, C106596h hVar) {
        C60870cx e = this.f297992o.e(jVar);
        C107002m mVar = new C107002m(this, jVar, cVar, hVar);
        return C60922j.m93045h(e, C47810es.m84966f(mVar), this.f297983f);
    }
}
