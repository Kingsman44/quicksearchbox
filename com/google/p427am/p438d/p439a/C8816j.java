package com.google.p427am.p438d.p439a;

import java.util.HashMap;
import kotlinx.coroutines.p5574b.C71587n;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.C69586p;
import p5488io.grpc.C70710eo;
import p5488io.grpc.C70711ep;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5526f.C70723a;
import p5488io.grpc.p5526f.C70735al;

/* renamed from: com.google.am.d.a.j */
/* compiled from: PG */
public class C8816j extends C70723a {
    public C8816j() {
        super(C69586p.f185991a);
    }

    /* renamed from: b */
    public C71587n mo17242b(C8818l lVar) {
        throw null;
    }

    /* renamed from: c */
    public Object mo17243c(C8769cp cpVar) {
        throw null;
    }

    /* renamed from: d */
    public Object mo17244d(C8806dz dzVar) {
        throw null;
    }

    /* renamed from: gs */
    public final C70711ep mo17222gs() {
        C70716eu euVar = C8807e.f30188a;
        if (euVar == null) {
            synchronized (C8807e.class) {
                euVar = C8807e.f30188a;
                if (euVar == null) {
                    C70715et etVar = new C70715et("usonia.ipc.Auth");
                    etVar.mo62433a(C8807e.m23417a());
                    etVar.mo62433a(C8807e.m23418b());
                    etVar.mo62433a(C8807e.m23419c());
                    etVar.mo62433a(C8807e.m23420d());
                    euVar = new C70716eu(etVar);
                    C8807e.f30188a = euVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        String str = euVar.f188456a;
        C70710eo.m103395c(C70735al.m103425c(this.f188460t, C8807e.m23417a(), new C8812f(this)), str, hashMap);
        C70710eo.m103395c(C70735al.m103424b(this.f188460t, C8807e.m23418b(), new C8813g(this)), str, hashMap);
        C70710eo.m103395c(C70735al.m103425c(this.f188460t, C8807e.m23419c(), new C8814h(this)), str, hashMap);
        C70710eo.m103395c(C70735al.m103425c(this.f188460t, C8807e.m23420d(), new C8815i(this)), str, hashMap);
        return C70710eo.m103393a(str, euVar, hashMap);
    }

    public C8816j(C69585o oVar) {
        super(oVar);
    }
}
