package com.google.android.apps.search.assistant.platform.p9044c.p9052b.p9053a.p9054a;

import java.util.HashMap;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.C69586p;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70710eo;
import p5488io.grpc.C70711ep;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5526f.C70723a;
import p5488io.grpc.p5526f.C70735al;

/* renamed from: com.google.android.apps.search.assistant.platform.c.b.a.a.s */
/* compiled from: PG */
public class C120103s extends C70723a {
    public C120103s() {
        this(C69586p.f185991a);
    }

    /* renamed from: b */
    public Object mo104667b(C120095k kVar) {
        throw null;
    }

    /* renamed from: gs */
    public final C70711ep mo17222gs() {
        C70716eu euVar = C120101q.f334324a;
        if (euVar == null) {
            synchronized (C120101q.class) {
                euVar = C120101q.f334324a;
                if (euVar == null) {
                    C70715et etVar = new C70715et("com.google.android.apps.search.assistant.platform.invocation.configuration.defaults.agsa.SettingsChangeListenerService");
                    etVar.mo62433a(C120101q.m199028a());
                    euVar = new C70716eu(etVar);
                    C120101q.f334324a = euVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        String str = euVar.f188456a;
        C70710eo.m103395c(C70735al.m103425c(this.f188460t, C120101q.m199028a(), new C120102r(this)), str, hashMap);
        return C70710eo.m103393a(str, euVar, hashMap);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120103s(C69585o oVar) {
        super(oVar);
        C69664n.m101061g(oVar, "coroutineContext");
    }
}
