package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8533a.C111806n;
import com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112976k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113190cu;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.aa */
/* compiled from: PG */
public final /* synthetic */ class C111810aa implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C111825ap f310740a;

    /* renamed from: b */
    public final /* synthetic */ C113405ep f310741b;

    public /* synthetic */ C111810aa(C111825ap apVar, C113405ep epVar) {
        this.f310740a = apVar;
        this.f310741b = epVar;
    }

    public final Object apply(Object obj) {
        C111825ap apVar = this.f310740a;
        C113405ep epVar = this.f310741b;
        C113408es esVar = (C113408es) obj;
        ((C111806n) apVar.f310778l.mo27525b()).mo99250a(epVar.mo100016a(), epVar.mo100033p(), "Suggestion Fetching+Ranking Latency", C113190cu.m187214a(epVar, apVar.f310774h));
        apVar.f310787u.mo99803d(epVar.mo100016a(), C112976k.SUGGESTION_FETCH);
        return esVar;
    }
}
