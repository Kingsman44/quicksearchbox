package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2682f;

import java.util.HashMap;
import kotlinx.coroutines.p5574b.C71587n;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.C69586p;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70710eo;
import p5488io.grpc.C70711ep;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5526f.C70723a;
import p5488io.grpc.p5526f.C70735al;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.f.y */
/* compiled from: PG */
public class C34635y extends C70723a {
    public C34635y() {
        this(C69586p.f185991a);
    }

    /* renamed from: b */
    public C71587n mo39453b(C34613c cVar) {
        throw null;
    }

    /* renamed from: gs */
    public final C70711ep mo17222gs() {
        C70716eu euVar = C34633w.f91966a;
        if (euVar == null) {
            synchronized (C34633w.class) {
                euVar = C34633w.f91966a;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.libraries.search.assistant.invocation.triggering.source.hotword.suppression.HotwordSuppressionService");
                    etVar.mo62433a(C34633w.m63360a());
                    euVar = new C70716eu(etVar);
                    C34633w.f91966a = euVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        String str = euVar.f188456a;
        C70710eo.m103395c(C70735al.m103424b(this.f188460t, C34633w.m63360a(), new C34634x(this)), str, hashMap);
        return C70710eo.m103393a(str, euVar, hashMap);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34635y(C69585o oVar) {
        super(oVar);
        C69664n.m101061g(oVar, "coroutineContext");
    }
}
