package com.google.android.apps.gsa.staticplugins.p7327ac;

import com.google.android.apps.gsa.configuration.p5844a.C74466b;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.ac.k */
/* compiled from: PG */
public final class C92704k extends C74466b {

    /* renamed from: a */
    private final C92711r f258779a;

    /* renamed from: b */
    private final C86610af f258780b;

    /* renamed from: c */
    private final Object f258781c = new Object();

    /* renamed from: f */
    private C60870cx f258782f = C60866ct.f164955a;

    public C92704k(C92711r rVar, C86610af afVar) {
        this.f258779a = rVar;
        this.f258780b = afVar;
    }

    /* renamed from: e */
    private final C60870cx m152683e(C60870cx cxVar, long j) {
        C60870cx c = C118826c.m197213c(cxVar);
        this.f258780b.mo80225f(c, j, 0);
        return c;
    }

    /* renamed from: a */
    public final C60870cx mo79097a(long j) {
        C92711r rVar = this.f258779a;
        return m152683e(rVar.f258792d.mo28207g("Commit phenotype", new C92708o(rVar)), j);
    }

    /* renamed from: c */
    public final C60870cx mo79098c(long j) {
        C60870cx e;
        synchronized (this.f258781c) {
            if (this.f258782f.isDone()) {
                C92711r rVar = this.f258779a;
                this.f258782f = rVar.f258793e.mo28209i(rVar.f258792d.mo28202b("Build PH properties", new C92709p(rVar)), "Request Phenotype to sync", new C92710q(rVar));
            }
            e = m152683e(this.f258782f, j);
        }
        return e;
    }

    /* renamed from: gu */
    public final C60870cx mo79099gu(long j) {
        C92711r rVar = this.f258779a;
        return m152683e(rVar.f258793e.mo28209i(rVar.f258792d.mo28202b("Build PH properties", new C92706m(rVar)), "Register Phenotype", new C92707n(rVar)), j);
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
