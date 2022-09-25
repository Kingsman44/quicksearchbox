package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9526c;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119844cl;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119885dz;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119903v;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119904w;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127537a;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127538b;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127540d;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127545i;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127546j;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127547k;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127549m;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import java.util.ArrayDeque;
import kotlinx.coroutines.p5574b.C71548cy;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.c.x */
/* compiled from: PG */
final class C127035x extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C127012af f349817a;

    /* renamed from: b */
    final /* synthetic */ C119904w f349818b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127035x(C127012af afVar, C119904w wVar) {
        super(0);
        this.f349817a = afVar;
        this.f349818b = wVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5672a() {
        C119834cb cbVar;
        if (((C127034w) this.f349817a.f349746e.mo62784e()).f349812c.f333911a == 2 && this.f349818b.f333911a == 1) {
            C127012af afVar = this.f349817a;
            C127020i iVar = afVar.f349743b;
            C34053bp bpVar = ((C127034w) afVar.f349746e.mo62784e()).f349810a;
            if (bpVar != null && !bpVar.equals(C34053bp.f90753a)) {
                C59052c cVar = (C59052c) C127020i.f349773a.mo56224b();
                cVar.mo56378ag(C58975e.f156826a, "ConvCleanup");
                C61301b a = C34711b.m63445a(bpVar);
                cVar.mo56379ah(new C59094n(37347));
                cVar.mo56389s("Will stop active invocation as executed %s", a);
                C127537a aVar = (C127537a) C127538b.f351181b.createBuilder();
                C69664n.m101060f(aVar, "newBuilder()");
                C127540d a2 = C69664n.m101061g(aVar, "builder");
                C127545i iVar2 = (C127545i) C127547k.f351196c.createBuilder();
                C69664n.m101060f(iVar2, "newBuilder()");
                C127549m a3 = C69664n.m101061g(iVar2, "builder");
                a3.mo108131b(bpVar);
                a3.mo108132c(C127546j.EXECUTED);
                a2.mo108128b(a3.mo108130a());
                iVar.mo107896b(a2.mo108127a());
            }
            ArrayDeque<C34053bp> arrayDeque = ((C127034w) this.f349817a.f349746e.mo62784e()).f349811b;
            C127012af afVar2 = this.f349817a;
            for (C34053bp a4 : arrayDeque) {
                afVar2.f349743b.mo107895a(a4);
            }
            ((C127034w) this.f349817a.f349746e.mo62784e()).f349811b.clear();
            C71548cy cyVar = this.f349817a.f349746e;
            cyVar.mo62807f(C127034w.m207781b((C127034w) cyVar.mo62784e(), (C34053bp) null, (C119904w) null, (C119834cb) null, (C119885dz) null, (C119844cl) null, 126));
        }
        C119904w wVar = this.f349818b;
        if (wVar.f333911a == 2) {
            cbVar = ((C119903v) wVar.f333912b).f333908c;
            if (cbVar == null) {
                cbVar = C119834cb.f333765b;
            }
        } else {
            cbVar = ((C127034w) this.f349817a.f349746e.mo62784e()).f349813d;
        }
        C119834cb cbVar2 = cbVar;
        C69664n.m101060f(cbVar2, "if (assistantState.hasWo…alue.currentInteractionId");
        C71548cy cyVar2 = this.f349817a.f349746e;
        cyVar2.mo62807f(C127034w.m207781b((C127034w) cyVar2.mo62784e(), (C34053bp) null, this.f349818b, cbVar2, (C119885dz) null, (C119844cl) null, 115));
        return C69788q.f186170a;
    }
}
