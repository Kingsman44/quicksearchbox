package com.google.android.apps.gsa.staticplugins.p7765da.p7770e;

import com.google.p4017at.p4086k.p4087a.p4088a.p4089a.C54464ab;
import com.google.p4017at.p4086k.p4087a.p4088a.p4089a.C54470g;
import com.google.p4017at.p4086k.p4087a.p4088a.p4089a.C54471h;
import com.google.p4017at.p4086k.p4087a.p4088a.p4089a.C54488y;
import com.google.p4017at.p4086k.p4087a.p4088a.p4089a.C54489z;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57608by;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57614cd;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.gsa.staticplugins.da.e.q */
/* compiled from: PG */
public final /* synthetic */ class C99309q implements C99312t {

    /* renamed from: a */
    public final /* synthetic */ C57608by f277768a;

    public /* synthetic */ C99309q(C57608by byVar) {
        this.f277768a = byVar;
    }

    /* renamed from: a */
    public final Object mo91399a(C54470g gVar) {
        C57608by byVar = this.f277768a;
        C54488y yVar = (C54488y) C54489z.f143060b.createBuilder();
        yVar.copyOnWrite();
        C57614cd cdVar = (C57614cd) byVar.build();
        cdVar.getClass();
        ((C54489z) yVar.instance).f143062a = cdVar;
        C54489z zVar = (C54489z) yVar.build();
        C70888j jVar = gVar.f189039a;
        C70338di diVar = C54471h.f143028f;
        if (diVar == null) {
            synchronized (C54471h.class) {
                diVar = C54471h.f143028f;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.internal.search.gsa.collections.v0.CollectionService", "SearchItems");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C54489z.f143060b);
                    d.f187486b = C70850d.m103697c(C54464ab.f143008b);
                    diVar = d.mo62040a();
                    C54471h.f143028f = diVar;
                }
            }
        }
        return C70876o.m103760a(jVar.mo39510a(diVar, gVar.f189040b), zVar);
    }
}
