package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9922b.p9923a;

import com.google.android.apps.search.assistant.verticals.ambient.p9916f.C130605a;
import com.google.android.apps.search.assistant.verticals.ambient.p9916f.C130606b;
import com.google.assistant.p3860as.C49742ae;
import com.google.assistant.p3860as.C49752ao;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63070h;
import com.google.protobuf.p4750c.C62950b;
import com.google.protobuf.p4750c.C62953e;
import com.google.protos.p4985f.p5030q.p5032b.C65033ar;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import com.google.protos.p5129p.p5131b.C65768az;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.b.a.x */
/* compiled from: PG */
public final /* synthetic */ class C130729x implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C130704aa f357918a;

    public /* synthetic */ C130729x(C130704aa aaVar) {
        this.f357918a = aaVar;
    }

    public final Object apply(Object obj) {
        Optional optional;
        Object obj2;
        C130704aa aaVar = this.f357918a;
        C58480gp e = C58485gu.m89837e();
        for (C65768az azVar : ((C65033ar) obj).f176113a) {
            C49742ae aeVar = C49742ae.f128440a;
            try {
                C63070h hVar = azVar.f178799e;
                if (hVar == null) {
                    hVar = C63070h.f170215c;
                }
                C49742ae aeVar2 = (C49742ae) C62942bv.parseFrom((C62942bv) C49742ae.f128440a, hVar.f170218b, C62921ba.m95368a());
                C62940bt r4 = C62942bv.checkIsLite(C49752ao.f128476d);
                aeVar2.mo58887l(r4);
                if (aeVar2.f169962ag.mo58857o(r4.f169971d)) {
                    C62940bt r42 = C62942bv.checkIsLite(C49752ao.f128476d);
                    aeVar2.mo58887l(r42);
                    Object l = aeVar2.f169962ag.mo58854l(r42.f169971d);
                    if (l == null) {
                        obj2 = r42.f169969b;
                    } else {
                        obj2 = r42.mo58889c(l);
                    }
                    C49752ao aoVar = (C49752ao) obj2;
                    C65139d dVar = azVar.f178796b;
                    if (dVar == null) {
                        dVar = C65139d.f176307e;
                    }
                    e.mo55395g(new C130605a(aoVar, C62953e.m95483h(dVar.f176310b)));
                }
            } catch (C62974ct e2) {
                ((C58970a) ((C58970a) ((C58970a) aaVar.f357873a.mo56225c()).mo56382g(e2)).mo56372aa(38954)).mo56386p("Proto parsing failed");
            }
        }
        if (e.mo55394f().isEmpty()) {
            optional = Optional.empty();
        } else {
            optional = Optional.m71637of((C130606b) e.mo55394f().get(0));
        }
        aaVar.f357875c.mo109938k("HP_MEDIA_PROFILE", optional.isPresent());
        if (optional.isPresent()) {
            aaVar.f357875c.mo109936i(Duration.between(C62950b.m95474e(((C130606b) optional.get()).mo109741a()), aaVar.f357876d.mo57444a()));
        }
        return optional;
    }
}
