package com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b;

import com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a.C120124o;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import kotlinx.coroutines.p5573a.C71367au;
import p5462h.C69677g;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.c.a.a.a.b.ad */
/* compiled from: PG */
final class C120042ad implements C120079y {

    /* renamed from: a */
    private final C120124o f334202a;

    /* renamed from: b */
    private final C71367au f334203b;

    public C120042ad(C120124o oVar, C71367au auVar) {
        C69664n.m101061g(oVar, "variance");
        this.f334202a = oVar;
        this.f334203b = auVar;
    }

    /* renamed from: a */
    public final C120124o mo104645a() {
        return this.f334202a;
    }

    /* renamed from: b */
    public final Object mo104646b(C69577g gVar) {
        C59052c cVar = (C59052c) C120045ag.f334210a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "TRG.VIS.Conformity");
        cVar.mo56379ah(new C59094n(34646));
        cVar.mo56389s("Sending conformity failure to session(%s).", this);
        C71367au auVar = this.f334203b;
        C120048aj ajVar = (C120048aj) C120054ap.f334221c.createBuilder();
        C69664n.m101060f(ajVar, "newBuilder()");
        C120056b a = C69664n.m101061g(ajVar, "builder");
        C120050al alVar = (C120050al) C120051am.f334216a.createBuilder();
        C69664n.m101060f(alVar, "newBuilder()");
        C69664n.m101061g(alVar, "builder");
        C62942bv build = alVar.build();
        C69664n.m101060f(build, "_builder.build()");
        C120051am amVar = (C120051am) build;
        C69664n.m101061g(amVar, "value");
        C120048aj ajVar2 = a.f334231a;
        ajVar2.copyOnWrite();
        C120054ap apVar = (C120054ap) ajVar2.instance;
        amVar.getClass();
        apVar.f334224b = amVar;
        apVar.f334223a = 1;
        Object v = auVar.mo62729v(a.mo104653a(), gVar);
        return v == C69554a.COROUTINE_SUSPENDED ? v : C69788q.f186170a;
    }

    /* renamed from: c */
    public final Object mo104647c(C120124o oVar, C69577g gVar) {
        C120055aq aqVar;
        C59052c cVar = (C59052c) C120045ag.f334210a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "TRG.VIS.Conformity");
        cVar.mo56379ah(new C59094n(34647));
        cVar.mo56354G("Sending new platform variance(%s) to session(%s).", oVar, this);
        C71367au auVar = this.f334203b;
        C120048aj ajVar = (C120048aj) C120054ap.f334221c.createBuilder();
        C69664n.m101060f(ajVar, "newBuilder()");
        C120056b a = C69664n.m101061g(ajVar, "builder");
        C120052an anVar = (C120052an) C120053ao.f334218b.createBuilder();
        C69664n.m101060f(anVar, "newBuilder()");
        C69664n.m101061g(anVar, "builder");
        C120124o oVar2 = C120124o.CLASSIC;
        int ordinal = oVar.ordinal();
        if (ordinal == 0) {
            aqVar = C120055aq.CLASSIC;
        } else if (ordinal == 1) {
            aqVar = C120055aq.APA;
        } else {
            throw new C69677g();
        }
        C69664n.m101061g(aqVar, "value");
        anVar.copyOnWrite();
        ((C120053ao) anVar.instance).f334220a = aqVar.getNumber();
        C62942bv build = anVar.build();
        C69664n.m101060f(build, "_builder.build()");
        C120053ao aoVar = (C120053ao) build;
        C69664n.m101061g(aoVar, "value");
        C120048aj ajVar2 = a.f334231a;
        ajVar2.copyOnWrite();
        C120054ap apVar = (C120054ap) ajVar2.instance;
        aoVar.getClass();
        apVar.f334224b = aoVar;
        apVar.f334223a = 2;
        Object v = auVar.mo62729v(a.mo104653a(), gVar);
        return v == C69554a.COROUTINE_SUSPENDED ? v : C69788q.f186170a;
    }

    /* renamed from: d */
    public final Object mo104648d() {
        C59052c cVar = (C59052c) C120045ag.f334210a.mo56226d();
        cVar.mo56378ag(C58975e.f156826a, "TRG.VIS.Conformity");
        cVar.mo56379ah(new C59094n(34645));
        cVar.mo56389s("Abandoning conformity tracking session(%s).", this);
        this.f334203b.mo62727D((Throwable) null);
        return C69788q.f186170a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C120042ad)) {
            return false;
        }
        C120042ad adVar = (C120042ad) obj;
        return this.f334202a == adVar.f334202a && C69664n.m101066l(this.f334203b, adVar.f334203b);
    }

    public final int hashCode() {
        return (this.f334202a.hashCode() * 31) + this.f334203b.hashCode();
    }

    public final String toString() {
        C120124o oVar = this.f334202a;
        C71367au auVar = this.f334203b;
        return "ConnectedSessionImpl(variance=" + oVar + ", channel=" + auVar + ")";
    }
}
