package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.android.libraries.search.assistant.proactive.C36334o;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.ajy;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.bz */
/* compiled from: PG */
public final /* synthetic */ class C114434bz implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C114464db f317300a;

    /* renamed from: b */
    public final /* synthetic */ aas f317301b;

    /* renamed from: c */
    public final /* synthetic */ C36334o f317302c;

    public /* synthetic */ C114434bz(C114464db dbVar, aas aas, C36334o oVar) {
        this.f317300a = dbVar;
        this.f317301b = aas;
        this.f317302c = oVar;
    }

    public final C60870cx apply(Object obj) {
        C114464db dbVar = this.f317300a;
        aas aas = this.f317301b;
        C36334o oVar = this.f317302c;
        Throwable th = (Throwable) obj;
        C58976aa aaVar = C58975e.f156826a;
        return dbVar.mo101330h(aas, oVar, ajy.GCM);
    }
}
