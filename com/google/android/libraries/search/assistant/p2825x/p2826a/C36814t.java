package com.google.android.libraries.search.assistant.p2825x.p2826a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2687c.p2689b.C34679f;
import com.google.android.libraries.search.p3055n.C39367bp;
import com.google.android.libraries.search.p3055n.C39369br;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5218j.C66944fg;
import com.google.speech.p5218j.C67087ko;
import kotlinx.coroutines.p5574b.C71548cy;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.quickphrasesmanager.impl.QuickPhrasesManagerImpl$getSodaQuickPhraseFrontend$1$handleSodaEventFuture$1", mo61344c = "QuickPhrasesManagerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {277})
/* renamed from: com.google.android.libraries.search.assistant.x.a.t */
/* compiled from: PG */
final class C36814t extends C69572j implements C69626l {

    /* renamed from: a */
    int f95943a;

    /* renamed from: b */
    final /* synthetic */ C67087ko f95944b;

    /* renamed from: c */
    final /* synthetic */ C36808o f95945c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36814t(C67087ko koVar, C36808o oVar, C69577g gVar) {
        super(1, gVar);
        this.f95944b = koVar;
        this.f95945c = oVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C36814t(this.f95944b, this.f95945c, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        Object e;
        Object e2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f95943a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C59071e eVar = C36808o.f95913a;
            C58976aa aaVar = C58975e.f156826a;
            C67087ko koVar = this.f95944b;
            C62940bt r1 = C62942bv.checkIsLite(C39369br.f103680b);
            koVar.mo58887l(r1);
            if (koVar.f169962ag.mo58857o(r1.f169971d)) {
                C71548cy cyVar = this.f95945c.f95924l;
                do {
                    e2 = cyVar.mo62784e();
                    C34679f fVar = (C34679f) e2;
                } while (!cyVar.mo62808g(e2, C34679f.ACTIVE));
                C59052c cVar = (C59052c) C36808o.f95913a.mo56224b();
                cVar.mo56378ag(C58975e.f156826a, "QuickPhrases.Manager");
                cVar.mo56379ah(new C59094n(52350));
                cVar.mo56386p("Soda started listening for QPs.");
                return C69788q.f186170a;
            }
            C67087ko koVar2 = this.f95944b;
            C62940bt r2 = C62942bv.checkIsLite(C39367bp.f103677b);
            koVar2.mo58887l(r2);
            if (koVar2.f169962ag.mo58857o(r2.f169971d)) {
                C71548cy cyVar2 = this.f95945c.f95924l;
                do {
                    e = cyVar2.mo62784e();
                    C34679f fVar2 = (C34679f) e;
                } while (!cyVar2.mo62808g(e, C34679f.INACTIVE_SODA_NOT_LISTENING));
                C59052c cVar2 = (C59052c) C36808o.f95913a.mo56224b();
                cVar2.mo56378ag(C58975e.f156826a, "QuickPhrases.Manager");
                cVar2.mo56379ah(new C59094n(52349));
                cVar2.mo56386p("Soda stopped listening for QPs.");
                return C69788q.f186170a;
            }
            C67087ko koVar3 = this.f95944b;
            C62940bt r22 = C62942bv.checkIsLite(C66944fg.f181964f);
            koVar3.mo58887l(r22);
            if (koVar3.f169962ag.mo58857o(r22.f169971d)) {
                C36808o oVar = this.f95945c;
                C67087ko koVar4 = this.f95944b;
                C62940bt r23 = C62942bv.checkIsLite(C66944fg.f181964f);
                koVar4.mo58887l(r23);
                Object l = koVar4.f169962ag.mo58854l(r23.f169971d);
                if (l == null) {
                    obj2 = r23.f169969b;
                } else {
                    obj2 = r23.mo58889c(l);
                }
                C69664n.m101060f(obj2, "it.getExtension(QuickPhraseEvent.id)");
                this.f95943a = 1;
                if (oVar.mo40411e((C66944fg) obj2, this) == aVar) {
                    return aVar;
                }
            } else {
                C59052c cVar3 = (C59052c) C36808o.f95913a.mo56225c();
                cVar3.mo56378ag(C58975e.f156826a, "QuickPhrases.Manager");
                cVar3.mo56379ah(new C59094n(52348));
                cVar3.mo56386p("Unexpected SODA event received.");
            }
        }
        return C69788q.f186170a;
    }
}
