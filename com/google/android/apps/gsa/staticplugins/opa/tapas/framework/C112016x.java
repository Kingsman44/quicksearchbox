package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c.C111933aa;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c.C111935ac;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c.C111936ad;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c.C111939ag;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c.C111943ak;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c.C111970bk;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c.C111971bl;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.x */
/* compiled from: PG */
public final /* synthetic */ class C112016x implements C111999g {

    /* renamed from: a */
    public final /* synthetic */ C111825ap f311188a;

    public /* synthetic */ C112016x(C111825ap apVar) {
        this.f311188a = apVar;
    }

    /* renamed from: a */
    public final C60870cx mo99334a(C113405ep epVar) {
        C111825ap apVar = this.f311188a;
        if (!apVar.f310769c.mo79746e(C90063do.f249410cx)) {
            return ((C111933aa) apVar.f310780n.mo27525b()).mo99303a(epVar);
        }
        C111943ak akVar = (C111943ak) apVar.f310781o.mo27525b();
        C111970bk b = akVar.f310989e.mo99323b(C111971bl.m185827c(epVar));
        Duration ofNanos = Duration.ofNanos(akVar.f310988d.mo26872d());
        C60870cx d = akVar.f310989e.mo99324d(epVar);
        if (epVar.mo100031n().isPresent()) {
            return d;
        }
        C111943ak.f310986b.mo105241j("hitRateLogging", new C111939ag(akVar, ofNanos, epVar, b));
        akVar.f310990f.mo28212l("issue_prefetches", new C111935ac(akVar, epVar));
        akVar.mo99305b(akVar.f310990f.mo28209i(d, "issue_prefetches", new C111936ad(akVar)));
        return d;
    }
}
