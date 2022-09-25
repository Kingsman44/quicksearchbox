package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2681e;

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

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.e.s */
/* compiled from: PG */
public class C34607s extends C70723a {
    public C34607s() {
        this(C69586p.f185991a);
    }

    /* renamed from: b */
    public Object mo39446b(C34590b bVar, C69577g gVar) {
        throw null;
    }

    /* renamed from: gs */
    public final C70711ep mo17222gs() {
        C70716eu euVar = C34605q.f91918a;
        if (euVar == null) {
            synchronized (C34605q.class) {
                euVar = C34605q.f91918a;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.libraries.search.assistant.invocation.triggering.source.hotword.external.ExternalHotwordVerificationService");
                    etVar.mo62433a(C34605q.m63336a());
                    euVar = new C70716eu(etVar);
                    C34605q.f91918a = euVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        String str = euVar.f188456a;
        C70710eo.m103395c(C70735al.m103425c(this.f188460t, C34605q.m63336a(), new C34606r(this)), str, hashMap);
        return C70710eo.m103393a(str, euVar, hashMap);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34607s(C69585o oVar) {
        super(oVar);
        C69664n.m101061g(oVar, "coroutineContext");
    }
}
