package com.google.android.apps.search.assistant.platform.p9005b.p9036b.p9037a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119812bg;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120691f;
import com.google.android.libraries.search.assistant.p2517f.p2518a.C32603b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.C32777d;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.libraries.search.assistant.p2517f.p2532b.C32941s;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.p2577a.C33447g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.assistant.platform.b.b.a.u */
/* compiled from: PG */
final class C119930u extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C120691f f334000a;

    /* renamed from: b */
    final /* synthetic */ C119812bg f334001b;

    /* renamed from: c */
    final /* synthetic */ C32777d f334002c;

    /* renamed from: d */
    final /* synthetic */ C33447g f334003d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119930u(C120691f fVar, C119812bg bgVar, C32777d dVar, C33447g gVar) {
        super(0);
        this.f334000a = fVar;
        this.f334001b = bgVar;
        this.f334002c = dVar;
        this.f334003d = gVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        C32849cq cqVar;
        C59071e eVar = C119931v.f334004a;
        C120691f fVar = this.f334000a;
        C119812bg bgVar = this.f334001b;
        C32777d dVar = this.f334002c;
        C33447g gVar = this.f334003d;
        int i = fVar.f335675a & 2;
        if (i == 0 && (bgVar.f333726a & 1) == 0) {
            C58976aa aaVar = C58975e.f156826a;
            return null;
        }
        if (i != 0) {
            cqVar = fVar.f335677c;
            if (cqVar == null) {
                cqVar = C32849cq.f88059c;
            }
        } else {
            cqVar = bgVar.f333727b;
            if (cqVar == null) {
                cqVar = C32849cq.f88059c;
            }
        }
        C69664n.m101060f(cqVar, "if (initialRequestData.h…on.sessionToken\n        }");
        C32603b a = dVar.mo38218a("ConvApi", cqVar, new C119928s());
        C59052c cVar = (C59052c) C119931v.f334004a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "ConvEngine.Context");
        String b = C32941s.m60951b(cqVar);
        cVar.mo56379ah(new C59094n(34596));
        cVar.mo56389s("#initializeAccessSession with sessionToken: %s", b);
        gVar.mo38849b(new C119929t(a));
        return a;
    }
}
