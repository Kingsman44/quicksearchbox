package com.google.android.apps.search.googleapp.saves.savefeature.p10392a;

import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10393a.C137234a;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10393a.C137238e;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c.C137244b;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57570an;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57572ap;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57573aq;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57575as;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57601br;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57604bu;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57605bv;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57648i;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.a.o */
/* compiled from: PG */
public final class C137273o implements C46689ag {

    /* renamed from: a */
    final /* synthetic */ C137244b f373447a;

    /* renamed from: b */
    final /* synthetic */ C137274p f373448b;

    public C137273o(C137274p pVar, C137244b bVar) {
        this.f373448b = pVar;
        this.f373447a = bVar;
    }

    /* renamed from: a */
    public final C46463o mo18086a() {
        C137238e eVar = this.f373448b.f373453e;
        C60870cx d = eVar.f373381c.mo46042d();
        C137234a aVar = new C137234a(eVar);
        C60870cx g = C60922j.m93044g(d, C47810es.m84963c(aVar), C60826bg.f164896a);
        C137271m mVar = new C137271m(this, this.f373447a);
        return new C46463o(new C60817ay(C60922j.m93044g(g, C47810es.m84963c(mVar), this.f373448b.f373458j)));
    }

    /* renamed from: b */
    public final C60870cx mo18087b() {
        C57570an anVar = (C57570an) C57573aq.f153809g.createBuilder();
        C137274p pVar = this.f373448b;
        C57648i iVar = this.f373447a.f373389b;
        if (iVar == null) {
            iVar = pVar.mo113603b();
        }
        C57601br c = C137274p.m223026c(iVar);
        anVar.copyOnWrite();
        c.getClass();
        ((C57573aq) anVar.instance).f153813c = c;
        long j = this.f373448b.f373451c;
        anVar.copyOnWrite();
        ((C57573aq) anVar.instance).f153815e = (int) j;
        anVar.copyOnWrite();
        ((C57573aq) anVar.instance).f153814d = 2;
        C57572ap apVar = C137274p.f373450b;
        anVar.copyOnWrite();
        C57573aq aqVar = (C57573aq) anVar.instance;
        apVar.getClass();
        aqVar.f153812b = apVar;
        aqVar.f153811a = 11;
        anVar.copyOnWrite();
        ((C57573aq) anVar.instance).f153816f = 2;
        C57573aq aqVar2 = (C57573aq) anVar.build();
        C57604bu buVar = this.f373448b.f373452d;
        C70888j jVar = buVar.f189039a;
        C70338di diVar = C57605bv.f153884a;
        if (diVar == null) {
            synchronized (C57605bv.class) {
                diVar = C57605bv.f153884a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.search.platform.save.v2.SaveService", "ListLists");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C57573aq.f153809g);
                    d.f187486b = C70850d.m103697c(C57575as.f153817b);
                    diVar = d.mo62040a();
                    C57605bv.f153884a = diVar;
                }
            }
        }
        C60870cx a = C70876o.m103760a(jVar.mo39510a(diVar, buVar.f189040b), aqVar2);
        C137272n nVar = new C137272n(this);
        return C60922j.m93045h(a, C47810es.m84966f(nVar), this.f373448b.f373458j);
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo18088c() {
        return "SaveFeatureContentKey";
    }
}
