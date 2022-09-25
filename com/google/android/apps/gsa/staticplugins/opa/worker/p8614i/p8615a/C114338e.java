package com.google.android.apps.gsa.staticplugins.opa.worker.p8614i.p8615a;

import com.google.android.apps.gsa.search.shared.service.p6935b.C88346yg;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88347yh;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112976k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112982q;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8581e.C113388b;
import com.google.assistant.p3858ar.p3859a.C49736z;
import com.google.assistant.p4001w.p4002a.C53499f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60873d;
import com.google.p4449cd.p4456g.C57974a;
import com.google.p4449cd.p4456g.C57996c;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5208h.C66611ci;
import com.google.speech.p5208h.p5209a.C66532c;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.i.a.e */
/* compiled from: PG */
public final class C114338e extends C60873d implements C57974a {

    /* renamed from: a */
    private static final Object f317009a = new Object();

    /* renamed from: b */
    private final Optional f317010b;

    /* renamed from: c */
    private final C112982q f317011c;

    /* renamed from: d */
    private C57996c f317012d;

    public C114338e(Optional optional, C112982q qVar) {
        this.f317010b = optional;
        this.f317011c = qVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo46268a() {
        synchronized (f317009a) {
            C57996c cVar = this.f317012d;
            if (cVar != null) {
                cVar.mo21018g();
            }
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo20337c(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        C66611ci ciVar = (C66611ci) obj;
        C62940bt r0 = C62942bv.checkIsLite(C66532c.f180950b);
        ciVar.mo58887l(r0);
        if (ciVar.f169962ag.mo58857o(r0.f169971d)) {
            C88346yg ygVar = (C88346yg) C88347yh.f238923d.createBuilder();
            C62940bt r1 = C62942bv.checkIsLite(C66532c.f180950b);
            ciVar.mo58887l(r1);
            Object l = ciVar.f169962ag.mo58854l(r1.f169971d);
            if (l == null) {
                obj2 = r1.f169969b;
            } else {
                obj2 = r1.mo58889c(l);
            }
            C49736z zVar = (C49736z) obj2;
            ygVar.copyOnWrite();
            C88347yh yhVar = (C88347yh) ygVar.instance;
            zVar.getClass();
            yhVar.f238926b = zVar;
            yhVar.f238925a |= 1;
            C112982q qVar = this.f317011c;
            long j = zVar.f128423b;
            C62940bt r5 = C62942bv.checkIsLite(C53499f.f140394i);
            ciVar.mo58887l(r5);
            Object l2 = ciVar.f169962ag.mo58854l(r5.f169971d);
            if (l2 == null) {
                obj3 = r5.f169969b;
            } else {
                obj3 = r5.mo58889c(l2);
            }
            qVar.mo99802c(j, C112976k.S3_UNARY_REQUEST, (C53499f) obj3);
            C58976aa aaVar = C58975e.f156826a;
            C49736z zVar2 = ((C88347yh) ygVar.instance).f238926b;
            if (this.f317010b.isPresent()) {
                ((C113388b) ((C68214a) this.f317010b.get()).mo27525b()).mo99675j(zVar.f128423b, C89849ae.TAPAS_SINK_S3_RESPONSE_NEXT);
                C62940bt r12 = C62942bv.checkIsLite(C53499f.f140394i);
                ciVar.mo58887l(r12);
                if (ciVar.f169962ag.mo58857o(r12.f169971d)) {
                    C62940bt r13 = C62942bv.checkIsLite(C53499f.f140394i);
                    ciVar.mo58887l(r13);
                    Object l3 = ciVar.f169962ag.mo58854l(r13.f169971d);
                    if (l3 == null) {
                        obj4 = r13.f169969b;
                    } else {
                        obj4 = r13.mo58889c(l3);
                    }
                    C53499f fVar = (C53499f) obj4;
                    ygVar.copyOnWrite();
                    C88347yh yhVar2 = (C88347yh) ygVar.instance;
                    fVar.getClass();
                    yhVar2.f238927c = fVar;
                    yhVar2.f238925a |= 2;
                    C53499f fVar2 = yhVar2.f238927c;
                }
            }
            mo57356n((C88347yh) ygVar.build());
        }
    }

    /* renamed from: d */
    public final void mo20338d(C57996c cVar) {
        synchronized (f317009a) {
            if (this.value instanceof C60873d.C60875b) {
                cVar.mo21018g();
            } else {
                this.f317012d = cVar;
            }
        }
    }

    /* renamed from: gQ */
    public final void mo20339gQ(boolean z) {
        mo57356n(C88347yh.f238923d);
    }

    /* renamed from: gR */
    public final void mo20340gR(Throwable th) {
        if (this.f317010b.isPresent()) {
            ((C113388b) ((C68214a) this.f317010b.get()).mo27525b()).mo99666a(C89849ae.TAPAS_SINK_S3_RESPONSE_FAILURE);
        }
        mo57357o(th);
    }
}
