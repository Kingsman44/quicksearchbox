package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9530g.p9531a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126981b;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126985f;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126986g;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126988i;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126991l;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126992m;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126998s;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.g.a.l */
/* compiled from: PG */
final class C127078l extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C127081o f349912a;

    /* renamed from: b */
    final /* synthetic */ C119834cb f349913b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127078l(C127081o oVar, C119834cb cbVar) {
        super(0);
        this.f349912a = oVar;
        this.f349913b = cbVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5672a() {
        C59052c cVar = (C59052c) C127081o.f349917a.mo56226d();
        cVar.mo56379ah(new C59094n(37377));
        cVar.mo56386p("Speech timeout triggered");
        C127081o oVar = this.f349912a;
        C119834cb cbVar = this.f349913b;
        C126986g gVar = (C126986g) C126988i.f349669h.createBuilder();
        C69664n.m101060f(gVar, "newBuilder()");
        C126981b a = C69664n.m101061g(gVar, "builder");
        a.mo107883c(C126985f.ERROR_TIMEOUT);
        a.mo107887g(C126998s.TIMEOUT_DURING_SPEECH);
        a.mo107884d(cbVar);
        C126991l lVar = (C126991l) C126992m.f349681d.createBuilder();
        C69664n.m101060f(lVar, "newBuilder()");
        a.mo107885e(C69664n.m101061g(lVar, "builder").mo107891a());
        oVar.f349918b.mo5761a(a.mo107881a());
        return C69788q.f186170a;
    }
}
