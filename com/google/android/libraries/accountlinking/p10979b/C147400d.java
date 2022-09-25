package com.google.android.libraries.accountlinking.p10979b;

import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60870cx;
import com.google.p3562ao.p3563a.p3568d.C45556b;
import com.google.p3562ao.p3563a.p3568d.C45564bh;
import com.google.p3562ao.p3563a.p3568d.C45565c;
import com.google.p3562ao.p3563a.p3568d.C45587y;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.libraries.accountlinking.b.d */
/* compiled from: PG */
public final /* synthetic */ class C147400d implements C147411o {

    /* renamed from: a */
    public final /* synthetic */ C45564bh f397916a;

    public /* synthetic */ C147400d(C45564bh bhVar) {
        this.f397916a = bhVar;
    }

    /* renamed from: a */
    public final C60870cx mo124154a(C45556b bVar) {
        C45564bh bhVar = this.f397916a;
        C58495hd hdVar = C147412p.f397927a;
        C70888j jVar = bVar.f189039a;
        C70338di diVar = C45565c.f119085e;
        if (diVar == null) {
            synchronized (C45565c.class) {
                diVar = C45565c.f119085e;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.internal.identity.accountlinking.v1.AccountLinkingService", "StrongCheckLink");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C45564bh.f119077c);
                    d.f187486b = C70850d.m103697c(C45587y.f119133c);
                    diVar = d.mo62040a();
                    C45565c.f119085e = diVar;
                }
            }
        }
        return C70876o.m103760a(jVar.mo39510a(diVar, bVar.f189040b), bhVar);
    }
}
