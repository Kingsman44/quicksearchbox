package com.google.android.apps.gsa.staticplugins.p7765da.p7770e;

import com.google.p4017at.p4086k.p4087a.p4088a.p4089a.C54462a;
import com.google.p4017at.p4086k.p4087a.p4088a.p4089a.C54466c;
import com.google.p4017at.p4086k.p4087a.p4088a.p4089a.C54468e;
import com.google.p4017at.p4086k.p4087a.p4088a.p4089a.C54470g;
import com.google.p4017at.p4086k.p4087a.p4088a.p4089a.C54471h;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.gsa.staticplugins.da.e.g */
/* compiled from: PG */
public final /* synthetic */ class C99299g implements C99312t {

    /* renamed from: a */
    public final /* synthetic */ C54462a f277755a;

    public /* synthetic */ C99299g(C54462a aVar) {
        this.f277755a = aVar;
    }

    /* renamed from: a */
    public final Object mo91399a(C54470g gVar) {
        C54466c cVar = (C54466c) this.f277755a.build();
        C70888j jVar = gVar.f189039a;
        C70338di diVar = C54471h.f143025c;
        if (diVar == null) {
            synchronized (C54471h.class) {
                diVar = C54471h.f143025c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.internal.search.gsa.collections.v0.CollectionService", "AddItems");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C54466c.f143013d);
                    d.f187486b = C70850d.m103697c(C54468e.f143019b);
                    diVar = d.mo62040a();
                    C54471h.f143025c = diVar;
                }
            }
        }
        return C70876o.m103760a(jVar.mo39510a(diVar, gVar.f189040b), cVar);
    }
}
