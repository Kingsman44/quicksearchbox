package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.android.libraries.search.assistant.proactive.C36206ab;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.aao;
import com.google.assistant.p3897e.p3921j.aap;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.ajw;
import com.google.common.p4552o.ajz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.cr */
/* compiled from: PG */
public final /* synthetic */ class C114453cr implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C114464db f317347a;

    /* renamed from: b */
    public final /* synthetic */ aas f317348b;

    public /* synthetic */ C114453cr(C114464db dbVar, aas aas) {
        this.f317347a = dbVar;
        this.f317348b = aas;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C114464db dbVar = this.f317347a;
        aas aas = this.f317348b;
        C58976aa aaVar = C58975e.f156826a;
        if (((Throwable) obj) instanceof C114475n) {
            C114418bj bjVar = dbVar.f317399t;
            aap aap = aas.f134676n;
            if (aap == null) {
                aap = aap.f134650h;
            }
            int a = aao.m86268a(aap.f134658g);
            boolean z = a != 0 && a == 2;
            ajw b = C36206ab.m64606b(aas);
            boolean d = bjVar.mo101319d();
            b.copyOnWrite();
            ajz ajz = (ajz) b.instance;
            ajz ajz2 = ajz.f158928q;
            ajz.f158932a |= 2048;
            ajz.f158945n = d;
            ajz ajz3 = (ajz) b.build();
            if (bjVar.f317263i.f94583a) {
                if (z) {
                    cxVar = bjVar.f317259e.mo50254a();
                } else {
                    cxVar = bjVar.f317257c.mo79697b();
                }
                C46459k.m82829b(C60922j.m93044g(cxVar, C47810es.m84963c(new C114413be(bjVar, aas, ajz3)), bjVar.f317260f), "GilNotificationLogger.logGenerationFailure", new Object[0]);
            } else {
                C114418bj.m189711c(C36206ab.m64612h(107929, aas), ajz3, z);
            }
        }
        return C60856cj.m92899h(new Exception("Client generation failed"));
    }
}
