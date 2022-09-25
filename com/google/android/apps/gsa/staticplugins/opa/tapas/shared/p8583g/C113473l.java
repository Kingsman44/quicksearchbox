package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g;

import com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112976k;
import com.google.assistant.p3858ar.p3859a.C49734x;
import com.google.p4449cd.p4456g.C57974a;
import com.google.p4449cd.p4456g.C57996c;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5208h.C66607ce;
import com.google.speech.p5208h.p5209a.C66532c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.g.l */
/* compiled from: PG */
final class C113473l implements C57974a {

    /* renamed from: a */
    final /* synthetic */ C113474m f314191a;

    public C113473l(C113474m mVar) {
        this.f314191a = mVar;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20337c(Object obj) {
        Object obj2;
        C66607ce ceVar = (C66607ce) obj;
        C62940bt r0 = C62942bv.checkIsLite(C66532c.f180949a);
        ceVar.mo58887l(r0);
        if (ceVar.f169962ag.mo58857o(r0.f169971d)) {
            C62940bt r02 = C62942bv.checkIsLite(C66532c.f180949a);
            ceVar.mo58887l(r02);
            Object l = ceVar.f169962ag.mo58854l(r02.f169971d);
            if (l == null) {
                obj2 = r02.f169969b;
            } else {
                obj2 = r02.mo58889c(l);
            }
            C49734x xVar = (C49734x) obj2;
            this.f314191a.f314194c.ifPresent(new C113472k(xVar));
            this.f314191a.f314195d.mo99804e(xVar.f128413b, C112976k.S3_STREAMING_REQUEST);
        }
        this.f314191a.mo54591h(ceVar);
    }

    /* renamed from: d */
    public final void mo20338d(C57996c cVar) {
    }

    /* renamed from: gQ */
    public final void mo20339gQ(boolean z) {
        this.f314191a.mo54589f(z);
    }

    /* renamed from: gR */
    public final void mo20340gR(Throwable th) {
        this.f314191a.mo54590g(th);
    }
}
