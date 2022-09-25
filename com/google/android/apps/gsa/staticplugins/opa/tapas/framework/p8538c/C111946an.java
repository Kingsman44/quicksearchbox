package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112705m;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8581e.C113389c;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.an */
/* compiled from: PG */
public final /* synthetic */ class C111946an implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C111948ap f311004a;

    /* renamed from: b */
    public final /* synthetic */ C48672ag f311005b;

    /* renamed from: c */
    public final /* synthetic */ C113405ep f311006c;

    /* renamed from: d */
    public final /* synthetic */ long f311007d;

    public /* synthetic */ C111946an(C111948ap apVar, C48672ag agVar, C113405ep epVar, long j) {
        this.f311004a = apVar;
        this.f311005b = agVar;
        this.f311006c = epVar;
        this.f311007d = j;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C111948ap apVar = this.f311004a;
        C48672ag agVar = this.f311005b;
        C113405ep epVar = this.f311006c;
        long j = this.f311007d;
        CancellationException cancellationException = (CancellationException) obj;
        if (agVar.equals(C48672ag.TAPAS_SERVER)) {
            ((C112705m) apVar.f311013b.mo27525b()).mo99680o(epVar.mo100033p(), epVar.mo100016a(), 4);
        }
        ((C113389c) apVar.f311015d.mo27525b()).mo99641p(epVar.mo100016a(), agVar, 4, 0);
        apVar.mo99309c(C113408es.f314036b, epVar, j, agVar.name(), 5, cancellationException);
    }
}
