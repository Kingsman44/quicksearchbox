package com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b;

import java.util.HashMap;
import kotlinx.coroutines.p5574b.C71587n;
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

/* renamed from: com.google.android.libraries.search.assistant.invocation.d.a.b.b.ah */
/* compiled from: PG */
public class C33601ah extends C70723a {
    public C33601ah() {
        this(C69586p.f185991a);
    }

    /* renamed from: c */
    public Object mo39000c(C33630x xVar, C69577g gVar) {
        throw null;
    }

    /* renamed from: d */
    public C71587n mo39001d(C71587n nVar) {
        throw null;
    }

    /* renamed from: gs */
    public final C70711ep mo17222gs() {
        C70716eu euVar = C33598ae.f89818a;
        if (euVar == null) {
            synchronized (C33598ae.class) {
                euVar = C33598ae.f89818a;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.libraries.search.assistant.invocation.audio.focus.service.proto.AudioFocusInternalService");
                    etVar.mo62433a(C33598ae.m62197a());
                    etVar.mo62433a(C33598ae.m62198b());
                    euVar = new C70716eu(etVar);
                    C33598ae.f89818a = euVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        String str = euVar.f188456a;
        C70710eo.m103395c(C70735al.m103423a(this.f188460t, C33598ae.m62197a(), new C33599af(this)), str, hashMap);
        C70710eo.m103395c(C70735al.m103425c(this.f188460t, C33598ae.m62198b(), new C33600ag(this)), str, hashMap);
        return C70710eo.m103393a(str, euVar, hashMap);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33601ah(C69585o oVar) {
        super(oVar);
        C69664n.m101061g(oVar, "coroutineContext");
    }
}
