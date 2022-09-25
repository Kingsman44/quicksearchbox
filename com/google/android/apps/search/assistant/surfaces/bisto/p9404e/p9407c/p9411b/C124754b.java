package com.google.android.apps.search.assistant.surfaces.bisto.p9404e.p9407c.p9411b;

import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.account.data.p3613b.C46180e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.speech.p5208h.C66607ce;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.e.c.b.b */
/* compiled from: PG */
public final /* synthetic */ class C124754b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C124755c f344155a;

    /* renamed from: b */
    public final /* synthetic */ C66607ce f344156b;

    public /* synthetic */ C124754b(C124755c cVar, C66607ce ceVar) {
        this.f344155a = cVar;
        this.f344156b = ceVar;
    }

    public final C60870cx apply(Object obj) {
        C124755c cVar = this.f344155a;
        C66607ce ceVar = this.f344156b;
        C46108a aVar = (C46108a) obj;
        if (!"pseudonymous".equals(aVar.mo50210b().f121165j) && !C46180e.m82417b(aVar)) {
            return C47633f.m84733g(cVar.f344160d.mo51025b(cVar.f344159c)).mo51515h(new C124753a(ceVar), cVar.f344158b);
        }
        C59104x b = C124755c.f344157a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoInitialS3RequestMutator");
        ((C59052c) ((C59052c) b).mo56372aa(36280)).mo56386p("User is either logged out or incognito so cannot fetch auth token.");
        return C60856cj.m92899h(new Exception("User is either logged out or incognito so cannot fetch auth token."));
    }
}
