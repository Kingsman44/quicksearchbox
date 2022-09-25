package com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b;

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

/* renamed from: com.google.android.libraries.search.assistant.invocation.d.b.b.b.u */
/* compiled from: PG */
public class C33693u extends C70723a {
    public C33693u() {
        this(C69586p.f185991a);
    }

    /* renamed from: d */
    public C71587n mo39028d(C71587n nVar) {
        throw null;
    }

    /* renamed from: gs */
    public final C70711ep mo17222gs() {
        C70716eu euVar = C33691s.f90015a;
        if (euVar == null) {
            synchronized (C33691s.class) {
                euVar = C33691s.f90015a;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.libraries.search.assistant.invocation.audio.input.service.proto.AudioInputInternalService");
                    etVar.mo62433a(C33691s.m62280a());
                    euVar = new C70716eu(etVar);
                    C33691s.f90015a = euVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        String str = euVar.f188456a;
        C70710eo.m103395c(C70735al.m103423a(this.f188460t, C33691s.m62280a(), new C33692t(this)), str, hashMap);
        return C70710eo.m103393a(str, euVar, hashMap);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33693u(C69585o oVar) {
        super(oVar);
        C69664n.m101061g(oVar, "coroutineContext");
    }
}
