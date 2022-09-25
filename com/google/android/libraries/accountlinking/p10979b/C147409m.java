package com.google.android.libraries.accountlinking.p10979b;

import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60870cx;
import com.google.p3562ao.p3563a.p3568d.C45556b;
import com.google.p3562ao.p3563a.p3568d.C45565c;
import com.google.p3562ao.p3563a.p3568d.C45570h;
import com.google.p3562ao.p3563a.p3568d.C45571i;
import com.google.p3562ao.p3563a.p3568d.C45587y;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.libraries.accountlinking.b.m */
/* compiled from: PG */
public final /* synthetic */ class C147409m implements C147411o {

    /* renamed from: a */
    public final /* synthetic */ C45570h f397925a;

    public /* synthetic */ C147409m(C45570h hVar) {
        this.f397925a = hVar;
    }

    /* renamed from: a */
    public final C60870cx mo124154a(C45556b bVar) {
        C45570h hVar = this.f397925a;
        C58495hd hdVar = C147412p.f397927a;
        C45571i iVar = (C45571i) hVar.build();
        C70888j jVar = bVar.f189039a;
        C70338di diVar = C45565c.f119081a;
        if (diVar == null) {
            synchronized (C45565c.class) {
                diVar = C45565c.f119081a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.internal.identity.accountlinking.v1.AccountLinkingService", "CreateLink");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C45571i.f119099e);
                    d.f187486b = C70850d.m103697c(C45587y.f119133c);
                    diVar = d.mo62040a();
                    C45565c.f119081a = diVar;
                }
            }
        }
        return C70876o.m103760a(jVar.mo39510a(diVar, bVar.f189040b), iVar);
    }
}
