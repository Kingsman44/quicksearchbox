package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a;

import com.google.android.libraries.search.p3055n.C39253ac;
import com.google.android.libraries.search.p3055n.C39260aj;
import com.google.android.libraries.search.p3055n.C39822z;
import com.google.android.libraries.search.p3055n.p3061c.C39645b;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5218j.C67087ko;
import kotlinx.coroutines.p5574b.C71548cy;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.ag */
/* compiled from: PG */
final class C34531ag implements C39645b {

    /* renamed from: a */
    final /* synthetic */ C34563bg f91769a;

    public C34531ag(C34563bg bgVar) {
        this.f91769a = bgVar;
    }

    /* renamed from: a */
    public final void mo39385a(C67087ko koVar) {
        Object obj;
        Object e;
        C34528ad a;
        Object obj2;
        Object e2;
        C34528ad a2;
        Object obj3;
        C69664n.m101061g(koVar, "event");
        C62940bt r0 = C62942bv.checkIsLite(C39822z.f104715d);
        koVar.mo58887l(r0);
        if (koVar.f169962ag.mo58857o(r0.f169971d)) {
            C71548cy cyVar = this.f91769a.f91829e;
            do {
                e2 = cyVar.mo62784e();
                C34526ab abVar = (C34526ab) e2;
                C34525aa aaVar = (C34525aa) C34526ab.f91759c.createBuilder();
                C69664n.m101060f(aaVar, "newBuilder()");
                a2 = C69664n.m101061g(aaVar, "builder");
                C62940bt r4 = C62942bv.checkIsLite(C39822z.f104715d);
                koVar.mo58887l(r4);
                Object l = koVar.f169962ag.mo58854l(r4.f169971d);
                if (l == null) {
                    obj3 = r4.f169969b;
                } else {
                    obj3 = r4.mo58889c(l);
                }
                C69664n.m101060f(obj3, "event.getExtension(Hotwo…cognitionStarted.startId)");
                C39822z zVar = (C39822z) obj3;
                C69664n.m101061g(zVar, "value");
                C34525aa aaVar2 = a2.f91764a;
                aaVar2.copyOnWrite();
                C34526ab abVar2 = (C34526ab) aaVar2.instance;
                zVar.getClass();
                abVar2.f91763b = zVar;
                abVar2.f91762a = 1;
            } while (!cyVar.mo62808g(e2, a2.mo39383a()));
        }
        C62940bt r02 = C62942bv.checkIsLite(C39253ac.f103397d);
        koVar.mo58887l(r02);
        if (koVar.f169962ag.mo58857o(r02.f169971d)) {
            C71548cy cyVar2 = this.f91769a.f91829e;
            do {
                e = cyVar2.mo62784e();
                C34526ab abVar3 = (C34526ab) e;
                C34525aa aaVar3 = (C34525aa) C34526ab.f91759c.createBuilder();
                C69664n.m101060f(aaVar3, "newBuilder()");
                a = C69664n.m101061g(aaVar3, "builder");
                C62940bt r42 = C62942bv.checkIsLite(C39253ac.f103397d);
                koVar.mo58887l(r42);
                Object l2 = koVar.f169962ag.mo58854l(r42.f169971d);
                if (l2 == null) {
                    obj2 = r42.f169969b;
                } else {
                    obj2 = r42.mo58889c(l2);
                }
                C69664n.m101060f(obj2, "event.getExtension(Hotwo…ecognitionStopped.stopId)");
                a.mo39384b((C39253ac) obj2);
            } while (!cyVar2.mo62808g(e, a.mo39383a()));
        }
        C62940bt r03 = C62942bv.checkIsLite(C39260aj.f103415g);
        koVar.mo58887l(r03);
        if (koVar.f169962ag.mo58857o(r03.f169971d)) {
            C69626l lVar = this.f91769a.f91827c;
            C62940bt r1 = C62942bv.checkIsLite(C39260aj.f103415g);
            koVar.mo58887l(r1);
            Object l3 = koVar.f169962ag.mo58854l(r1.f169971d);
            if (l3 == null) {
                obj = r1.f169969b;
            } else {
                obj = r1.mo58889c(l3);
            }
            C69664n.m101060f(obj, "event.getExtension(HotwordTriggeredEvent.eventId)");
            lVar.mo5761a(obj);
        }
    }
}
