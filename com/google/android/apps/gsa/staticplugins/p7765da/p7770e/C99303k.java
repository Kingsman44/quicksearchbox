package com.google.android.apps.gsa.staticplugins.p7765da.p7770e;

import com.google.p4017at.p4086k.p4087a.p4088a.p4089a.C54470g;
import com.google.p4017at.p4086k.p4087a.p4088a.p4089a.C54471h;
import com.google.p4017at.p4086k.p4087a.p4088a.p4089a.C54473j;
import com.google.p4017at.p4086k.p4087a.p4088a.p4089a.C54475l;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.gsa.staticplugins.da.e.k */
/* compiled from: PG */
public final /* synthetic */ class C99303k implements C99312t {

    /* renamed from: a */
    public final /* synthetic */ C54473j f277759a;

    public /* synthetic */ C99303k(C54473j jVar) {
        this.f277759a = jVar;
    }

    /* renamed from: a */
    public final Object mo91399a(C54470g gVar) {
        C54473j jVar = this.f277759a;
        C70888j jVar2 = gVar.f189039a;
        C70338di diVar = C54471h.f143024b;
        if (diVar == null) {
            synchronized (C54471h.class) {
                diVar = C54471h.f143024b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.internal.search.gsa.collections.v0.CollectionService", "CreateList");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C54473j.f143029b);
                    d.f187486b = C70850d.m103697c(C54475l.f143032b);
                    diVar = d.mo62040a();
                    C54471h.f143024b = diVar;
                }
            }
        }
        return C70876o.m103760a(jVar2.mo39510a(diVar, gVar.f189040b), jVar);
    }
}
