package com.google.android.apps.search.assistant.platform.p9005b.p9036b.p9037a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119812bg;
import com.google.android.apps.search.assistant.platform.p9005b.p9036b.C119934c;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120691f;
import com.google.android.libraries.search.assistant.p2517f.p2518a.C32603b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.C32777d;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32779aa;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32809bd;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32812bg;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32871q;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32878x;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32879y;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.p2577a.C33447g;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62948a;
import p5462h.C69613f;
import p5462h.C69747m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.b.b.a.v */
/* compiled from: PG */
public final class C119931v implements C119934c {

    /* renamed from: a */
    public static final C59071e f334004a = C59071e.m91331h();

    /* renamed from: b */
    private static final C62910ar f334005b;

    /* renamed from: c */
    private final C69613f f334006c;

    static {
        C62910ar m = C62948a.m95462m(20, 0);
        C69664n.m101060f(m, "fromSeconds(20)");
        f334005b = m;
    }

    public C119931v(C120691f fVar, C119812bg bgVar, C32777d dVar, C33447g gVar) {
        C69664n.m101061g(fVar, "initialRequestData");
        C69664n.m101061g(gVar, "shutdownHookRegistry");
        this.f334006c = new C69747m(new C119930u(fVar, bgVar, dVar, gVar));
    }

    /* renamed from: c */
    private final C32603b m198831c() {
        return (C32603b) this.f334006c.mo5768a();
    }

    /* renamed from: a */
    public final C60870cx mo104569a(C32796ar arVar, boolean z) {
        C69664n.m101061g(arVar, "contextKey");
        C32878x xVar = (C32878x) C32879y.f88112f.createBuilder();
        C69664n.m101060f(xVar, "newBuilder()");
        C32779aa a = C69664n.m101061g(xVar, "builder");
        C32809bd bdVar = (C32809bd) C32810be.f87993c.createBuilder();
        C69664n.m101060f(bdVar, "newBuilder()");
        C32812bg a2 = C69664n.m101061g(bdVar, "builder");
        a2.mo38308b(arVar);
        a.mo38290b(a2.mo38307a());
        C32878x xVar2 = a.f87949a;
        xVar2.copyOnWrite();
        C32879y yVar = (C32879y) xVar2.instance;
        yVar.f88114a |= 2;
        yVar.f88116c = z;
        a.mo38291c(f334005b);
        C32879y a3 = a.mo38289a();
        C32603b c = m198831c();
        C60870cx b = c != null ? c.mo38180b(a3, C32871q.STATIC_CACHE) : null;
        if (b != null) {
            return b;
        }
        throw new Exception("No access session when calling fetchContext.");
    }

    /* renamed from: b */
    public final C60870cx mo104570b() {
        C32603b c = m198831c();
        C60870cx d = c != null ? c.mo38183d() : null;
        if (d != null) {
            return d;
        }
        throw new Exception("No access session when calling supportedContextKeys.");
    }
}
