package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112705m;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8581e.C113389c;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.ao */
/* compiled from: PG */
public final /* synthetic */ class C111947ao implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C111948ap f311008a;

    /* renamed from: b */
    public final /* synthetic */ C48672ag f311009b;

    /* renamed from: c */
    public final /* synthetic */ C113405ep f311010c;

    /* renamed from: d */
    public final /* synthetic */ long f311011d;

    public /* synthetic */ C111947ao(C111948ap apVar, C48672ag agVar, C113405ep epVar, long j) {
        this.f311008a = apVar;
        this.f311009b = agVar;
        this.f311010c = epVar;
        this.f311011d = j;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C111948ap apVar = this.f311008a;
        C48672ag agVar = this.f311009b;
        C113405ep epVar = this.f311010c;
        long j = this.f311011d;
        Exception exc = (Exception) obj;
        if (agVar.equals(C48672ag.TAPAS_SERVER)) {
            ((C112705m) apVar.f311013b.mo27525b()).mo99680o(epVar.mo100033p(), epVar.mo100016a(), 3);
        }
        ((C113389c) apVar.f311015d.mo27525b()).mo99641p(epVar.mo100016a(), agVar, 3, 0);
        C111948ap apVar2 = apVar;
        apVar2.mo99309c(C113408es.f314036b, epVar, j, agVar.name(), 3, exc);
        apVar2.mo99310e(agVar, 3, epVar, j);
    }
}
