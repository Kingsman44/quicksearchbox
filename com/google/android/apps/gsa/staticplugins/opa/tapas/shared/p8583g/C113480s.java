package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112976k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112982q;
import com.google.assistant.p3858ar.p3859a.C49733w;
import com.google.assistant.p3858ar.p3859a.C49734x;
import com.google.assistant.p4001w.p4002a.C53499f;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66607ce;
import com.google.speech.p5208h.p5209a.C66532c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.g.s */
/* compiled from: PG */
final class C113480s implements C58817ah {

    /* renamed from: a */
    final C66607ce f314207a;

    /* renamed from: b */
    boolean f314208b = true;

    /* renamed from: c */
    final Optional f314209c;

    /* renamed from: d */
    final C112982q f314210d;

    public C113480s(C66607ce ceVar, Optional optional, C112982q qVar) {
        this.f314207a = ceVar;
        this.f314209c = optional;
        this.f314210d = qVar;
    }

    /* renamed from: a */
    private final void m187916a(C66607ce ceVar, C89849ae aeVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C66532c.f180949a);
        ceVar.mo58887l(r0);
        if (ceVar.f169962ag.mo58857o(r0.f169971d)) {
            C62940bt r02 = C62942bv.checkIsLite(C66532c.f180949a);
            ceVar.mo58887l(r02);
            Object l = ceVar.f169962ag.mo58854l(r02.f169971d);
            if (l == null) {
                obj = r02.f169969b;
            } else {
                obj = r02.mo58889c(l);
            }
            C49734x xVar = (C49734x) obj;
            this.f314209c.ifPresent(new C113479r(xVar, aeVar));
            if (aeVar == C89849ae.TAPAS_STREAMING_SEND_INITIAL_REQUEST) {
                this.f314210d.mo99804e(xVar.f128413b, C112976k.S3_INITIAL_STREAMING_REQUEST);
            } else {
                this.f314210d.mo99804e(xVar.f128413b, C112976k.S3_STREAMING_REQUEST);
            }
        }
    }

    public final /* synthetic */ Object apply(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        C66607ce ceVar = (C66607ce) obj;
        if (ceVar.equals(C66607ce.f181191f) || !this.f314208b) {
            m187916a(ceVar, C89849ae.TAPAS_STREAMING_SEND_REQUEST);
        } else {
            this.f314208b = false;
            m187916a(ceVar, C89849ae.TAPAS_STREAMING_SEND_INITIAL_REQUEST);
            C66607ce ceVar2 = this.f314207a;
            C58976aa aaVar = C58975e.f156826a;
            C66606cd cdVar = (C66606cd) ceVar2.toBuilder();
            C62940bt r2 = C62942bv.checkIsLite(C66532c.f180949a);
            ceVar.mo58887l(r2);
            Object l = ceVar.f169962ag.mo58854l(r2.f169971d);
            if (l == null) {
                obj2 = r2.f169969b;
            } else {
                obj2 = r2.mo58889c(l);
            }
            C49733w wVar = (C49733w) ((C49734x) obj2).toBuilder();
            C62940bt r3 = C62942bv.checkIsLite(C66532c.f180949a);
            ceVar2.mo58887l(r3);
            Object l2 = ceVar2.f169962ag.mo58854l(r3.f169971d);
            if (l2 == null) {
                obj3 = r3.f169969b;
            } else {
                obj3 = r3.mo58889c(l2);
            }
            boolean z = ((C49734x) obj3).f128415d;
            wVar.copyOnWrite();
            C49734x xVar = (C49734x) wVar.instance;
            xVar.f128412a |= 8;
            xVar.f128415d = z;
            cdVar.mo58885m(C66532c.f180949a, (C49734x) wVar.build());
            C62940bt r0 = C62942bv.checkIsLite(C53499f.f140393h);
            ceVar.mo58887l(r0);
            if (ceVar.f169962ag.mo58857o(r0.f169971d)) {
                C62940bt r02 = C62942bv.checkIsLite(C53499f.f140393h);
                ceVar.mo58887l(r02);
                Object l3 = ceVar.f169962ag.mo58854l(r02.f169971d);
                if (l3 == null) {
                    obj4 = r02.f169969b;
                } else {
                    obj4 = r02.mo58889c(l3);
                }
                cdVar.mo58885m(C53499f.f140393h, (C53499f) obj4);
            }
            ceVar = (C66607ce) cdVar.build();
        }
        C58976aa aaVar2 = C58975e.f156826a;
        return ceVar;
    }
}
