package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.staticplugins.opa.p8313ay.C107662av;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112705m;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113167by;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113409et;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8581e.C113389c;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Supplier;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.w */
/* compiled from: PG */
public final /* synthetic */ class C112015w implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C111825ap f311185a;

    /* renamed from: b */
    public final /* synthetic */ C113405ep f311186b;

    /* renamed from: c */
    public final /* synthetic */ C58485gu f311187c;

    public /* synthetic */ C112015w(C111825ap apVar, C113405ep epVar, C58485gu guVar) {
        this.f311185a = apVar;
        this.f311186b = epVar;
        this.f311187c = guVar;
    }

    public final Object get() {
        int i;
        C48672ag agVar;
        C111825ap apVar = this.f311185a;
        C113405ep epVar = this.f311186b;
        C58485gu guVar = this.f311187c;
        C112705m mVar = (C112705m) apVar.f310782p.mo27525b();
        if (mVar.f312433a.get()) {
            mVar.mo99666a(C89849ae.TAPAS_START_SOURCES_FETCH);
        }
        ((C113389c) apVar.f310790x.mo27525b()).mo99630e(epVar.mo100016a(), "Sources fetch start");
        boolean isEmpty = epVar.mo100033p().isEmpty();
        if (isEmpty) {
            ((C107662av) apVar.f310784r.mo27525b()).mo96205a(C89849ae.AGSA_TEXT_ZERO_PREFIX_SUGGESTIONS_START);
        } else {
            ((C107662av) apVar.f310784r.mo27525b()).mo96205a(C89849ae.AGSA_TEXT_N_PREFIX_SUGGESTIONS_START);
        }
        C58490gz gzVar = new C58490gz(4);
        C58480gp e = C58485gu.m89837e();
        apVar.f310786t.f310696a.put(Long.valueOf(epVar.mo100016a()), Long.valueOf(apVar.f310774h.mo26870b()));
        apVar.f310786t.mo99235a(epVar.mo100016a(), epVar.mo100033p());
        int size = guVar.size();
        int i2 = 0;
        while (i2 < size) {
            C48672ag agVar2 = (C48672ag) guVar.get(i2);
            C69464a b = ((C111884bv) apVar.f310770d.mo27525b()).mo99272b(agVar2);
            if (b == null) {
                i = i2;
            } else {
                C112004l lVar = r1;
                C113167by byVar = apVar.f310788v;
                C48672ag agVar3 = agVar2;
                i = i2;
                C112004l lVar2 = new C112004l(apVar, agVar2, b, isEmpty, epVar, gzVar);
                C60870cx b2 = byVar.mo99894b("fetch each source in parallel", lVar);
                if (C113409et.m187721r(agVar3)) {
                    agVar = agVar3;
                } else if (b2 != null) {
                    agVar = agVar3;
                    if (agVar != null) {
                        e.mo55395g(new C111836b(agVar, b2));
                    } else {
                        throw new NullPointerException("Null sourceType");
                    }
                } else {
                    throw new NullPointerException("Null responseFuture");
                }
                gzVar.mo55429h(agVar, b2);
            }
            i2 = i + 1;
        }
        apVar.f310789w.mo99332a(gzVar.mo55427f(false));
        return e.mo55394f();
    }
}
