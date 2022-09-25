package com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9058b;

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

/* renamed from: com.google.android.apps.search.assistant.platform.c.c.a.b.g */
/* compiled from: PG */
public class C120131g extends C70723a {
    public C120131g() {
        this(C69586p.f185991a);
    }

    /* renamed from: b */
    public C71587n mo104675b(C120141q qVar) {
        throw null;
    }

    /* renamed from: gs */
    public final C70711ep mo17222gs() {
        C70716eu euVar = C120129e.f334366a;
        if (euVar == null) {
            synchronized (C120129e.class) {
                euVar = C120129e.f334366a;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.apps.search.assistant.platform.invocation.triggering.migration.surfaces.LegacySpecialAssistantExperienceService");
                    etVar.mo62433a(C120129e.m199069a());
                    euVar = new C70716eu(etVar);
                    C120129e.f334366a = euVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        String str = euVar.f188456a;
        C70710eo.m103395c(C70735al.m103424b(this.f188460t, C120129e.m199069a(), new C120130f(this)), str, hashMap);
        return C70710eo.m103393a(str, euVar, hashMap);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120131g(C69585o oVar) {
        super(oVar);
        C69664n.m101061g(oVar, "coroutineContext");
    }
}
