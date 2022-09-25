package com.google.android.libraries.accountlinking.p10979b;

import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60870cx;
import com.google.p3562ao.p3563a.p3568d.C45556b;
import com.google.p3562ao.p3563a.p3568d.C45565c;
import com.google.p3562ao.p3563a.p3568d.C45581s;
import com.google.p3562ao.p3563a.p3568d.C45583u;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.libraries.accountlinking.b.n */
/* compiled from: PG */
public final /* synthetic */ class C147410n implements C147411o {

    /* renamed from: a */
    public final /* synthetic */ C45581s f397926a;

    public /* synthetic */ C147410n(C45581s sVar) {
        this.f397926a = sVar;
    }

    /* renamed from: a */
    public final C60870cx mo124154a(C45556b bVar) {
        C45581s sVar = this.f397926a;
        C58495hd hdVar = C147412p.f397927a;
        C70888j jVar = bVar.f189039a;
        C70338di diVar = C45565c.f119084d;
        if (diVar == null) {
            synchronized (C45565c.class) {
                diVar = C45565c.f119084d;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.internal.identity.accountlinking.v1.AccountLinkingService", "FinishOAuth");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C45581s.f119121e);
                    d.f187486b = C70850d.m103697c(C45583u.f119127b);
                    diVar = d.mo62040a();
                    C45565c.f119084d = diVar;
                }
            }
        }
        return C70876o.m103760a(jVar.mo39510a(diVar, bVar.f189040b), sVar);
    }
}
