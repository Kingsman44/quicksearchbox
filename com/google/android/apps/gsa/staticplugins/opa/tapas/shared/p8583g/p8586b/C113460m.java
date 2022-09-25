package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g.p8586b;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88346yg;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88347yh;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112976k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112982q;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111248k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r;
import com.google.assistant.p3858ar.p3859a.C49736z;
import com.google.assistant.p4001w.p4002a.C53499f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4449cd.p4456g.C57974a;
import com.google.p4449cd.p4456g.C57996c;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5208h.C66611ci;
import com.google.speech.p5208h.C66622ct;
import com.google.speech.p5208h.p5209a.C66532c;
import dagger.C68214a;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.g.b.m */
/* compiled from: PG */
public final class C113460m implements C57974a {

    /* renamed from: a */
    private static final C59071e f314157a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.shared.g.b.m");

    /* renamed from: b */
    private final C113459l f314158b;

    /* renamed from: c */
    private final C113448a f314159c;

    /* renamed from: d */
    private final Optional f314160d;

    /* renamed from: e */
    private final C68214a f314161e;

    /* renamed from: f */
    private final C112982q f314162f;

    /* renamed from: g */
    private final C86124t f314163g;

    public C113460m(C113459l lVar, C113448a aVar, Optional optional, C68214a aVar2, C112982q qVar, C86124t tVar) {
        this.f314158b = lVar;
        this.f314159c = aVar;
        this.f314160d = optional;
        this.f314161e = aVar2;
        this.f314162f = qVar;
        this.f314163g = tVar;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo20337c(Object obj) {
        Optional optional;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        C66611ci ciVar = (C66611ci) obj;
        C62940bt r0 = C62942bv.checkIsLite(C66622ct.f181245b);
        ciVar.mo58887l(r0);
        if (ciVar.f169962ag.mo58857o(r0.f169971d)) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        C62940bt r02 = C62942bv.checkIsLite(C66532c.f180950b);
        ciVar.mo58887l(r02);
        if (ciVar.f169962ag.mo58857o(r02.f169971d)) {
            C62940bt r03 = C62942bv.checkIsLite(C53499f.f140394i);
            ciVar.mo58887l(r03);
            if (ciVar.f169962ag.mo58857o(r03.f169971d)) {
                C112982q qVar = this.f314162f;
                C62940bt r1 = C62942bv.checkIsLite(C66532c.f180950b);
                ciVar.mo58887l(r1);
                Object l = ciVar.f169962ag.mo58854l(r1.f169971d);
                if (l == null) {
                    obj4 = r1.f169969b;
                } else {
                    obj4 = r1.mo58889c(l);
                }
                long j = ((C49736z) obj4).f128423b;
                C62940bt r3 = C62942bv.checkIsLite(C53499f.f140394i);
                ciVar.mo58887l(r3);
                Object l2 = ciVar.f169962ag.mo58854l(r3.f169971d);
                if (l2 == null) {
                    obj5 = r3.f169969b;
                } else {
                    obj5 = r3.mo58889c(l2);
                }
                qVar.mo99802c(j, C112976k.S3_STREAMING_REQUEST, (C53499f) obj5);
            }
        }
        Optional optional2 = this.f314160d;
        C62940bt r12 = C62942bv.checkIsLite(C66532c.f180950b);
        ciVar.mo58887l(r12);
        if (!ciVar.f169962ag.mo58857o(r12.f169971d)) {
            C59104x d = C113463p.f314169a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TapasS3RespConv");
            ((C59052c) ((C59052c) d).mo56372aa(27893)).mo56386p("missing tapasServiceResponse extension");
            optional = Optional.empty();
        } else {
            C62940bt r13 = C62942bv.checkIsLite(C66532c.f180950b);
            ciVar.mo58887l(r13);
            Object l3 = ciVar.f169962ag.mo58854l(r13.f169971d);
            if (l3 == null) {
                obj2 = r13.f169969b;
            } else {
                obj2 = r13.mo58889c(l3);
            }
            C49736z zVar = (C49736z) obj2;
            C88346yg ygVar = (C88346yg) C88347yh.f238923d.createBuilder();
            ygVar.copyOnWrite();
            C88347yh yhVar = (C88347yh) ygVar.instance;
            zVar.getClass();
            yhVar.f238926b = zVar;
            yhVar.f238925a |= 1;
            if (yhVar.f238926b == null) {
                C49736z zVar2 = C49736z.f128420e;
            }
            C62940bt r32 = C62942bv.checkIsLite(C53499f.f140394i);
            ciVar.mo58887l(r32);
            if (ciVar.f169962ag.mo58857o(r32.f169971d)) {
                C62940bt r33 = C62942bv.checkIsLite(C53499f.f140394i);
                ciVar.mo58887l(r33);
                Object l4 = ciVar.f169962ag.mo58854l(r33.f169971d);
                if (l4 == null) {
                    obj3 = r33.f169969b;
                } else {
                    obj3 = r33.mo58889c(l4);
                }
                C53499f fVar = (C53499f) obj3;
                ygVar.copyOnWrite();
                C88347yh yhVar2 = (C88347yh) ygVar.instance;
                fVar.getClass();
                yhVar2.f238927c = fVar;
                yhVar2.f238925a |= 2;
            }
            C53499f fVar2 = ((C88347yh) ygVar.instance).f238927c;
            optional2.ifPresent(new C113462o(zVar));
            optional = Optional.m71637of((C88347yh) ygVar.build());
        }
        C113448a aVar = this.f314159c;
        Objects.requireNonNull(aVar);
        optional.ifPresent(new C113458k(aVar));
    }

    /* renamed from: d */
    public final void mo20338d(C57996c cVar) {
    }

    /* renamed from: gQ */
    public final void mo20339gQ(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        if (!z && this.f314163g.mo79746e(C90063do.f249319bL) && ((C111248k) this.f314161e.mo27525b()).mo99077b()) {
            ((C111248k) this.f314161e.mo27525b()).mo99076a(C111255r.STREAMING, "S3 streaming ended gracefully");
        }
        this.f314158b.mo96323a();
    }

    /* renamed from: gR */
    public final void mo20340gR(Throwable th) {
        C59104x c = f314157a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "StreamingPipelineSink");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(27887)).mo56386p("Streaming pipeline failed.");
        this.f314160d.ifPresent(C113457j.f314155a);
        if (this.f314163g.mo79746e(C90063do.f249319bL) && ((C111248k) this.f314161e.mo27525b()).mo99077b()) {
            ((C111248k) this.f314161e.mo27525b()).mo99076a(C111255r.STREAMING, "S3 streaming failed");
        }
        this.f314158b.mo96323a();
    }
}
