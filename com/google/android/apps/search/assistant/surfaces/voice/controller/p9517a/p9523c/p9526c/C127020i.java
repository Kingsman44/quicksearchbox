package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9526c;

import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127537a;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127538b;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127540d;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127545i;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127546j;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127547k;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127549m;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127555s;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127556t;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.c.i */
/* compiled from: PG */
public final class C127020i {

    /* renamed from: a */
    public static final C59071e f349773a = C59071e.m91331h();

    /* renamed from: b */
    private final C127555s f349774b;

    public C127020i(C127555s sVar) {
        C69664n.m101061g(sVar, "stub");
        this.f349774b = sVar;
    }

    /* renamed from: a */
    public final void mo107895a(C34053bp bpVar) {
        if (bpVar != null && !bpVar.equals(C34053bp.f90753a)) {
            C59052c cVar = (C59052c) f349773a.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, "ConvCleanup");
            C61301b a = C34711b.m63445a(bpVar);
            cVar.mo56379ah(new C59094n(37346));
            cVar.mo56389s("Cancel %s", a);
            C127537a aVar = (C127537a) C127538b.f351181b.createBuilder();
            C69664n.m101060f(aVar, "newBuilder()");
            C127540d a2 = C69664n.m101061g(aVar, "builder");
            C127545i iVar = (C127545i) C127547k.f351196c.createBuilder();
            C69664n.m101060f(iVar, "newBuilder()");
            C127549m a3 = C69664n.m101061g(iVar, "builder");
            a3.mo108131b(bpVar);
            a3.mo108132c(C127546j.CANCELLED);
            a2.mo108128b(a3.mo108130a());
            mo107896b(a2.mo108127a());
        }
    }

    /* renamed from: b */
    public final void mo107896b(C127538b bVar) {
        C127019h hVar = new C127019h();
        C127555s sVar = this.f349774b;
        C70876o.m103763d(sVar.f189039a.mo39510a(C127556t.m208535a(), sVar.f189040b), bVar, hVar, false);
    }
}
