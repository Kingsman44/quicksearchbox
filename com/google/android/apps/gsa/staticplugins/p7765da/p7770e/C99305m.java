package com.google.android.apps.gsa.staticplugins.p7765da.p7770e;

import com.google.p4017at.p4086k.p4087a.p4088a.p4089a.C54470g;
import com.google.p4017at.p4086k.p4087a.p4088a.p4089a.C54471h;
import com.google.p4017at.p4086k.p4087a.p4088a.p4089a.C54476m;
import com.google.p4017at.p4086k.p4087a.p4088a.p4089a.C54477n;
import com.google.p4017at.p4086k.p4087a.p4088a.p4089a.C54479p;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57570an;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57572ap;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57573aq;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57601br;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.gsa.staticplugins.da.e.m */
/* compiled from: PG */
public final /* synthetic */ class C99305m implements C99312t {

    /* renamed from: a */
    public final /* synthetic */ C99313u f277761a;

    /* renamed from: b */
    public final /* synthetic */ C57572ap f277762b;

    public /* synthetic */ C99305m(C99313u uVar, C57572ap apVar) {
        this.f277761a = uVar;
        this.f277762b = apVar;
    }

    /* renamed from: a */
    public final Object mo91399a(C54470g gVar) {
        C99313u uVar = this.f277761a;
        C57572ap apVar = this.f277762b;
        C54476m mVar = (C54476m) C54477n.f143036b.createBuilder();
        C57570an anVar = (C57570an) C57573aq.f153809g.createBuilder();
        C57601br j = uVar.mo91409j(28);
        anVar.copyOnWrite();
        j.getClass();
        ((C57573aq) anVar.instance).f153813c = j;
        anVar.copyOnWrite();
        ((C57573aq) anVar.instance).f153815e = 200;
        anVar.copyOnWrite();
        ((C57573aq) anVar.instance).f153814d = 2;
        anVar.copyOnWrite();
        C57573aq aqVar = (C57573aq) anVar.instance;
        apVar.getClass();
        aqVar.f153812b = apVar;
        aqVar.f153811a = 11;
        anVar.copyOnWrite();
        ((C57573aq) anVar.instance).f153816f = 2;
        mVar.copyOnWrite();
        C57573aq aqVar2 = (C57573aq) anVar.build();
        aqVar2.getClass();
        ((C54477n) mVar.instance).f143038a = aqVar2;
        C54477n nVar = (C54477n) mVar.build();
        C70888j jVar = gVar.f189039a;
        C70338di diVar = C54471h.f143023a;
        if (diVar == null) {
            synchronized (C54471h.class) {
                diVar = C54471h.f143023a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.internal.search.gsa.collections.v0.CollectionService", "ListLists");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C54477n.f143036b);
                    d.f187486b = C70850d.m103697c(C54479p.f143039b);
                    diVar = d.mo62040a();
                    C54471h.f143023a = diVar;
                }
            }
        }
        return C70876o.m103760a(jVar.mo39510a(diVar, gVar.f189040b), nVar);
    }
}
