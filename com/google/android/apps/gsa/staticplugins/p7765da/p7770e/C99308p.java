package com.google.android.apps.gsa.staticplugins.p7765da.p7770e;

import com.google.p4017at.p4086k.p4087a.p4088a.p4089a.C54470g;
import com.google.p4017at.p4086k.p4087a.p4088a.p4089a.C54471h;
import com.google.p4017at.p4086k.p4087a.p4088a.p4089a.C54481r;
import com.google.p4017at.p4086k.p4087a.p4088a.p4089a.C54483t;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.gsa.staticplugins.da.e.p */
/* compiled from: PG */
public final /* synthetic */ class C99308p implements C99312t {

    /* renamed from: a */
    public final /* synthetic */ C54481r f277767a;

    public /* synthetic */ C99308p(C54481r rVar) {
        this.f277767a = rVar;
    }

    /* renamed from: a */
    public final Object mo91399a(C54470g gVar) {
        C54481r rVar = this.f277767a;
        C70888j jVar = gVar.f189039a;
        C70338di diVar = C54471h.f143027e;
        if (diVar == null) {
            synchronized (C54471h.class) {
                diVar = C54471h.f143027e;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.internal.search.gsa.collections.v0.CollectionService", "RemoveItemFromAllLists");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C54481r.f143043c);
                    d.f187486b = C70850d.m103697c(C54483t.f143048b);
                    diVar = d.mo62040a();
                    C54471h.f143027e = diVar;
                }
            }
        }
        return C70876o.m103760a(jVar.mo39510a(diVar, gVar.f189040b), rVar);
    }
}
