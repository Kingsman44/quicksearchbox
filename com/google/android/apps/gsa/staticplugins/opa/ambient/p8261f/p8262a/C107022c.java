package com.google.android.apps.gsa.staticplugins.opa.ambient.p8261f.p8262a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8265a.C107043b;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.f.a.c */
/* compiled from: PG */
public final /* synthetic */ class C107022c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C107035p f298039a;

    public /* synthetic */ C107022c(C107035p pVar) {
        this.f298039a = pVar;
    }

    public final Object call() {
        C107035p pVar = this.f298039a;
        ((C58970a) ((C58970a) pVar.f298064f.mo56224b()).mo56372aa(23450)).mo56386p("Restarting :search trigger sources");
        for (C107034o oVar : (Set) pVar.f298059a.mo6453a()) {
            C107043b.m177757a(oVar.f298058c.f298064f, oVar.f298056a.mo95578c(oVar.f298057b), "stopMonitoring.onFailure(): triggerMonitor removeListener call failed.", new Object[0]);
        }
        pVar.mo95740e();
        return C118826c.f331422a;
    }
}
