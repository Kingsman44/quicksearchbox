package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112705m;
import com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112976k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8581e.C113389c;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.am */
/* compiled from: PG */
public final /* synthetic */ class C111822am implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C111823an f310756a;

    public /* synthetic */ C111822am(C111823an anVar) {
        this.f310756a = anVar;
    }

    public final Object apply(Object obj) {
        C111823an anVar = this.f310756a;
        C113408es esVar = (C113408es) obj;
        anVar.f310761d.f310787u.mo99803d(anVar.f310759b.mo100016a(), C112976k.ON_DEVICE_RANKING);
        C112705m mVar = (C112705m) anVar.f310761d.f310782p.mo27525b();
        long a = anVar.f310759b.mo100016a();
        C89849ae aeVar = C89849ae.TAPAS_ENGINE_END_RANKING;
        mVar.mo99676k(a, aeVar);
        mVar.mo99674i(aeVar, a);
        ((C113389c) anVar.f310761d.f310790x.mo27525b()).mo99630e(anVar.f310759b.mo100016a(), "Ranking end");
        return esVar;
    }
}
