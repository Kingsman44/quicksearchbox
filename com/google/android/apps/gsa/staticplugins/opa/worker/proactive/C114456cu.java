package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.android.apps.gsa.search.core.p6491a.C84373s;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.search.assistant.proactive.p2775g.C36281b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.p3926e.C51962fo;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.ajy;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.cu */
/* compiled from: PG */
public final /* synthetic */ class C114456cu implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C114464db f317357a;

    /* renamed from: b */
    public final /* synthetic */ C84373s f317358b;

    public /* synthetic */ C114456cu(C114464db dbVar, C84373s sVar) {
        this.f317357a = dbVar;
        this.f317358b = sVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C60870cx cxVar;
        C60870cx cxVar2;
        C114464db dbVar = this.f317357a;
        C84373s sVar = this.f317358b;
        aas aas = (aas) obj;
        C58976aa aaVar = C58975e.f156826a;
        if (!dbVar.f317388i.mo101321a(aas)) {
            cxVar = C60856cj.m92899h(new C114463da(C51962fo.NOT_TARGETING_THIS_DEVICE));
        } else if ((aas.f134663a & 2048) == 0 || aas.f134674l.equals(dbVar.f317389j.mo79673g())) {
            if ((aas.f134663a & 65536) != 0) {
                C60870cx b = ((C36281b) dbVar.f317397r.mo27525b()).mo40090b(aas);
                C114431bw bwVar = C114431bw.f317291a;
                cxVar2 = C60922j.m93044g(b, C47810es.m84963c(bwVar), C60826bg.f164896a);
            } else {
                cxVar2 = C60856cj.m92900i(false);
            }
            C114439cd cdVar = new C114439cd(dbVar, aas, sVar);
            cxVar = C60922j.m93045h(cxVar2, C47810es.m84966f(cdVar), C60826bg.f164896a);
        } else {
            cxVar = C60856cj.m92899h(new C114463da(C51962fo.NOT_TARGETING_THIS_USER));
        }
        return dbVar.mo101328e(cxVar, aas, ajy.GCM);
    }
}
