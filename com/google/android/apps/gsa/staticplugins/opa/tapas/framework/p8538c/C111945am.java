package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112705m;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8581e.C113389c;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.am */
/* compiled from: PG */
public final /* synthetic */ class C111945am implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C111948ap f311000a;

    /* renamed from: b */
    public final /* synthetic */ C48672ag f311001b;

    /* renamed from: c */
    public final /* synthetic */ C113405ep f311002c;

    /* renamed from: d */
    public final /* synthetic */ long f311003d;

    public /* synthetic */ C111945am(C111948ap apVar, C48672ag agVar, C113405ep epVar, long j) {
        this.f311000a = apVar;
        this.f311001b = agVar;
        this.f311002c = epVar;
        this.f311003d = j;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C111948ap apVar = this.f311000a;
        C48672ag agVar = this.f311001b;
        C113405ep epVar = this.f311002c;
        long j = this.f311003d;
        TimeoutException timeoutException = (TimeoutException) obj;
        if (agVar.equals(C48672ag.TAPAS_SERVER)) {
            ((C112705m) apVar.f311013b.mo27525b()).mo99680o(epVar.mo100033p(), epVar.mo100016a(), 2);
        }
        apVar.mo99310e(agVar, 2, epVar, j);
        ((C113389c) apVar.f311015d.mo27525b()).mo99641p(epVar.mo100016a(), agVar, 5, 0);
        apVar.mo99309c(C113408es.f314036b, epVar, j, agVar.name(), 4, timeoutException);
    }
}
