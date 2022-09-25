package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

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

/* renamed from: com.google.android.apps.search.assistant.platform.j.a.dc */
/* compiled from: PG */
public class C121630dc extends C70723a {
    public C121630dc() {
        this(C69586p.f185991a);
    }

    /* renamed from: b */
    public Object mo105271b(C121564ar arVar, C69577g gVar) {
        throw null;
    }

    /* renamed from: c */
    public C71587n mo105272c(C121552af afVar) {
        throw null;
    }

    /* renamed from: d */
    public C71587n mo105273d(C121556aj ajVar) {
        throw null;
    }

    /* renamed from: e */
    public Object mo105274e(C69577g gVar) {
        throw null;
    }

    /* renamed from: gs */
    public final C70711ep mo17222gs() {
        C70716eu euVar = C121624cx.f337473a;
        if (euVar == null) {
            synchronized (C121624cx.class) {
                euVar = C121624cx.f337473a;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.apps.search.assistant.platform.triggering.directactions.InternalDirectActionsService");
                    etVar.mo62433a(C121624cx.m200964d());
                    etVar.mo62433a(C121624cx.m200963c());
                    etVar.mo62433a(C121624cx.m200961a());
                    etVar.mo62433a(C121624cx.m200962b());
                    euVar = new C70716eu(etVar);
                    C121624cx.f337473a = euVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        String str = euVar.f188456a;
        C70710eo.m103395c(C70735al.m103425c(this.f188460t, C121624cx.m200964d(), new C121625cy(this)), str, hashMap);
        C70710eo.m103395c(C70735al.m103425c(this.f188460t, C121624cx.m200963c(), new C121626cz(this)), str, hashMap);
        C70710eo.m103395c(C70735al.m103424b(this.f188460t, C121624cx.m200961a(), new C121628da(this)), str, hashMap);
        C70710eo.m103395c(C70735al.m103424b(this.f188460t, C121624cx.m200962b(), new C121629db(this)), str, hashMap);
        return C70710eo.m103393a(str, euVar, hashMap);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121630dc(C69585o oVar) {
        super(oVar);
        C69664n.m101061g(oVar, "coroutineContext");
    }
}
