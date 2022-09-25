package com.google.android.apps.gsa.nga.engine.p6029g.p6030a;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.account.data.C46167as;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.g.a.s */
/* compiled from: PG */
public final /* synthetic */ class C76067s implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C76043ar f210954a;

    public /* synthetic */ C76067s(C76043ar arVar) {
        this.f210954a = arVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        Optional optional;
        C60870cx cxVar;
        C76043ar arVar = this.f210954a;
        C58833ax axVar = (C58833ax) obj;
        C22871g gVar = arVar.f210904e;
        if (axVar.mo56113h()) {
            optional = Optional.m71637of((String) axVar.mo56107c());
        } else {
            optional = Optional.empty();
        }
        C47538ax c = arVar.f210910k.mo51613c("NGA");
        try {
            if (optional.isPresent()) {
                C76036ak akVar = new C76036ak(arVar);
                cxVar = C60846c.m92879h(arVar.f210907h.mo37990a((String) optional.get()), C46167as.class, C47810es.m84966f(akVar), arVar.f210911l);
            } else {
                cxVar = arVar.f210906g.mo50254a();
            }
            if (c != null) {
                c.close();
            }
            return gVar.mo28209i(C60846c.m92878g(C60922j.m93044g(C60838bs.m92859i(cxVar), C76037al.f210889a, C60826bg.f164896a), C46167as.class, C76038am.f210890a, C60826bg.f164896a), "[NGA] NgaConfigurationManager get AccountId", new C76035aj(arVar, axVar));
        } catch (Throwable th) {
            C76059k.m122629a(th, th);
        }
        throw th;
    }
}
