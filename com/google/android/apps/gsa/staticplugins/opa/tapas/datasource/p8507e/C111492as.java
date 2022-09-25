package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8507e;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.e.as */
/* compiled from: PG */
final class C111492as implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C111493at f310137a;

    public C111492as(C111493at atVar) {
        this.f310137a = atVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C60870cx cxVar = this.f310137a.f310141d;
        if (cxVar != null) {
            cxVar.cancel(true);
            this.f310137a.f310141d = null;
        }
        this.f310137a.mo57358p(C60856cj.m92900i(C113408es.f314036b));
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C60870cx cxVar;
        C113408es esVar = (C113408es) obj;
        C60870cx cxVar2 = this.f310137a.f310141d;
        if (cxVar2 != null) {
            cxVar2.cancel(true);
            this.f310137a.f310141d = null;
        }
        C111493at atVar = this.f310137a;
        if (esVar == null) {
            cxVar = C60856cj.m92900i(C113408es.f314036b);
        } else {
            cxVar = C60856cj.m92900i(esVar);
        }
        atVar.mo57358p(cxVar);
    }
}
