package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8533a.C111806n;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112705m;
import com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112976k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113190cu;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8581e.C113389c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121492b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.t */
/* compiled from: PG */
public final /* synthetic */ class C112012t implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C111825ap f311174a;

    /* renamed from: b */
    public final /* synthetic */ C113405ep f311175b;

    /* renamed from: c */
    public final /* synthetic */ C58485gu f311176c;

    /* renamed from: d */
    public final /* synthetic */ C111823an f311177d;

    /* renamed from: e */
    public final /* synthetic */ C121492b f311178e;

    public /* synthetic */ C112012t(C111825ap apVar, C113405ep epVar, C58485gu guVar, C111823an anVar, C121492b bVar) {
        this.f311174a = apVar;
        this.f311175b = epVar;
        this.f311176c = guVar;
        this.f311177d = anVar;
        this.f311178e = bVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C111825ap apVar = this.f311174a;
        C113405ep epVar = this.f311175b;
        C58485gu guVar = this.f311176c;
        C111823an anVar = this.f311177d;
        C121492b bVar = this.f311178e;
        List list = (List) obj;
        C112705m mVar = (C112705m) apVar.f310782p.mo27525b();
        long a = epVar.mo100016a();
        C89849ae aeVar = C89849ae.TAPAS_ENGINE_FETCHING_DONE;
        mVar.mo99676k(a, aeVar);
        mVar.mo99674i(aeVar, a);
        ((C113389c) apVar.f310790x.mo27525b()).mo99630e(epVar.mo100016a(), "Sources fetch completed");
        C58976aa aaVar = C58975e.f156826a;
        long a2 = C113190cu.m187214a(epVar, apVar.f310774h);
        apVar.f310789w.mo99333b(epVar, 1);
        ((C111806n) apVar.f310778l.mo27525b()).mo99250a(epVar.mo100016a(), epVar.mo100033p(), "Suggestion Fetching Latency", a2);
        C58526ih ihVar = new C58526ih();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == null) {
                ihVar.mo55373c(((C111824ao) guVar.get(i)).mo99255a());
            }
        }
        apVar.f310787u.mo99803d(epVar.mo100016a(), C112976k.DATA_SOURCE_FETCH);
        anVar.mo99254d((List) Collection.EL.stream(list).filter(C112009q.f311171a).collect(Collectors.toList()), ihVar.mo55486f(), new ArrayList());
        bVar.mo105191d();
    }
}
