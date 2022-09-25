package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g;

import com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112976k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112982q;
import com.google.assistant.p3858ar.p3859a.C49734x;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57974a;
import com.google.p4449cd.p4456g.C57981b;
import com.google.p4449cd.p4456g.p4458b.C57982a;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5208h.C66607ce;
import com.google.speech.p5208h.p5209a.C66532c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.g.m */
/* compiled from: PG */
final class C113474m extends C57982a {

    /* renamed from: a */
    final C66607ce f314192a;

    /* renamed from: b */
    final C57981b f314193b;

    /* renamed from: c */
    final Optional f314194c;

    /* renamed from: d */
    final C112982q f314195d;

    public C113474m(C66607ce ceVar, C57981b bVar, Optional optional, C112982q qVar) {
        this.f314192a = ceVar;
        this.f314193b = bVar;
        this.f314194c = optional;
        this.f314195d = qVar;
    }

    /* renamed from: jJ */
    public final C60870cx mo20440jJ(C57974a aVar) {
        C60870cx jJ;
        Object obj;
        synchronized (this.f155059g) {
            jJ = super.mo20440jJ(aVar);
            this.f314194c.ifPresent(C113471j.f314189a);
            C66607ce ceVar = this.f314192a;
            C62940bt r2 = C62942bv.checkIsLite(C66532c.f180949a);
            ceVar.mo58887l(r2);
            if (ceVar.f169962ag.mo58857o(r2.f169971d)) {
                C66607ce ceVar2 = this.f314192a;
                C62940bt r22 = C62942bv.checkIsLite(C66532c.f180949a);
                ceVar2.mo58887l(r22);
                Object l = ceVar2.f169962ag.mo58854l(r22.f169971d);
                if (l == null) {
                    obj = r22.f169969b;
                } else {
                    obj = r22.mo58889c(l);
                }
                this.f314195d.mo99804e(((C49734x) obj).f128413b, C112976k.S3_INITIAL_STREAMING_REQUEST);
            }
            mo54591h(this.f314192a);
            this.f314193b.mo20440jJ(new C113473l(this));
        }
        return jJ;
    }

    /* renamed from: jK */
    public final void mo20388jK() {
        mo54589f(true);
        this.f314193b.mo20388jK();
    }
}
