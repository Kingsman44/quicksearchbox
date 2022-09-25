package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.android.apps.gsa.shared.p7066m.C90052dd;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.search.assistant.proactive.p2775g.C36281b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.aar;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.cv */
/* compiled from: PG */
public final /* synthetic */ class C114457cv implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C114464db f317359a;

    public /* synthetic */ C114457cv(C114464db dbVar) {
        this.f317359a = dbVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C60870cx cxVar;
        int a;
        C114464db dbVar = this.f317359a;
        aas aas = (aas) obj;
        if (!dbVar.f317393n.mo79746e(C90052dd.f248930a) || (a = aar.m86269a(aas.f134664b)) == 0 || a != 5) {
            C60870cx b = ((C36281b) dbVar.f317397r.mo27525b()).mo40090b(aas);
            C114449cn cnVar = C114449cn.f317338a;
            C60870cx g = C60922j.m93044g(b, C47810es.m84963c(cnVar), C60826bg.f164896a);
            C114451cp cpVar = new C114451cp(dbVar, aas);
            cxVar = C60922j.m93045h(g, C47810es.m84966f(cpVar), C60826bg.f164896a);
        } else {
            cxVar = dbVar.mo101327d(aas);
        }
        return C60846c.m92878g(C60846c.m92878g(C60922j.m93044g(C60838bs.m92859i(cxVar), C114427bs.f317283a, C60826bg.f164896a), C114463da.class, new C114428bt(dbVar, aas), C60826bg.f164896a), Throwable.class, new C114429bu(dbVar, aas), C60826bg.f164896a);
    }
}
