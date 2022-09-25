package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c;

import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a.C121833ap;
import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a.C121838au;
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

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.n */
/* compiled from: PG */
public class C122054n extends C70723a {
    public C122054n() {
        this(C69586p.f185991a);
    }

    /* renamed from: b */
    public Object mo105404b(C121833ap apVar, C69577g gVar) {
        throw null;
    }

    /* renamed from: c */
    public Object mo105405c(C121838au auVar, C69577g gVar) {
        throw null;
    }

    /* renamed from: gs */
    public final C70711ep mo17222gs() {
        C70716eu euVar = C122051k.f338610a;
        if (euVar == null) {
            synchronized (C122051k.class) {
                euVar = C122051k.f338610a;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.apps.search.assistant.platform.triggering.invocations.vis.activitystarter.ApaInternalActivityStarterService");
                    etVar.mo62433a(C122051k.m201571b());
                    etVar.mo62433a(C122051k.m201570a());
                    euVar = new C70716eu(etVar);
                    C122051k.f338610a = euVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        String str = euVar.f188456a;
        C70710eo.m103395c(C70735al.m103425c(this.f188460t, C122051k.m201571b(), new C122052l(this)), str, hashMap);
        C70710eo.m103395c(C70735al.m103425c(this.f188460t, C122051k.m201570a(), new C122053m(this)), str, hashMap);
        return C70710eo.m103393a(str, euVar, hashMap);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C122054n(C69585o oVar) {
        super(oVar);
        C69664n.m101061g(oVar, "coroutineContext");
    }
}
