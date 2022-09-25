package com.google.android.libraries.search.assistant.invocation.p2636j.p2640c;

import java.util.HashMap;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.C69586p;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70710eo;
import p5488io.grpc.C70711ep;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5526f.C70723a;
import p5488io.grpc.p5526f.C70735al;

/* renamed from: com.google.android.libraries.search.assistant.invocation.j.c.c */
/* compiled from: PG */
public class C33897c extends C70723a {
    public C33897c() {
        this(C69586p.f185991a);
    }

    /* renamed from: b */
    public Object mo39122b(C33906l lVar, C69577g gVar) {
        throw null;
    }

    /* renamed from: gs */
    public final C70711ep mo17222gs() {
        C70716eu euVar = C33895a.f90431a;
        if (euVar == null) {
            synchronized (C33895a.class) {
                euVar = C33895a.f90431a;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.libraries.search.assistant.invocation.lifecycle.service.ApaLifecycleApiService");
                    etVar.mo62433a(C33895a.m62551a());
                    euVar = new C70716eu(etVar);
                    C33895a.f90431a = euVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        String str = euVar.f188456a;
        C70710eo.m103395c(C70735al.m103425c(this.f188460t, C33895a.m62551a(), new C33896b(this)), str, hashMap);
        return C70710eo.m103393a(str, euVar, hashMap);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33897c(C69585o oVar) {
        super(oVar);
        C69664n.m101061g(oVar, "coroutineContext");
    }
}
