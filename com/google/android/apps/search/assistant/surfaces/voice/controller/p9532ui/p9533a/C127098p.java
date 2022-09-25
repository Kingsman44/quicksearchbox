package com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9533a;

import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.p */
/* compiled from: PG */
public final class C127098p {

    /* renamed from: a */
    private final C127100r f349979a;

    public C127098p(C127100r rVar) {
        C69664n.m101061g(rVar, "service");
        this.f349979a = rVar;
    }

    /* renamed from: a */
    public final C60870cx mo107930a(C127289i iVar) {
        C69664n.m101061g(iVar, "queryContext");
        C127100r rVar = this.f349979a;
        C127083a aVar = (C127083a) C127084b.f349934c.createBuilder();
        C69664n.m101060f(aVar, "newBuilder()");
        C69664n.m101061g(aVar, "builder");
        C69664n.m101061g(iVar, "value");
        aVar.copyOnWrite();
        C127084b bVar = (C127084b) aVar.instance;
        iVar.getClass();
        bVar.f349937b = iVar;
        bVar.f349936a |= 1;
        C62942bv build = aVar.build();
        C69664n.m101060f(build, "_builder.build()");
        return C70876o.m103760a(rVar.f189039a.mo39510a(C127101s.m207869a(), rVar.f189040b), (C127084b) build);
    }
}
