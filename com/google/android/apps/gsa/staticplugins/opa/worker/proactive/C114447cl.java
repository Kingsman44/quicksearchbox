package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.p3926e.C51962fo;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.ajy;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.cl */
/* compiled from: PG */
public final /* synthetic */ class C114447cl implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C114464db f317334a;

    /* renamed from: b */
    public final /* synthetic */ aas f317335b;

    /* renamed from: c */
    public final /* synthetic */ ajy f317336c;

    public /* synthetic */ C114447cl(C114464db dbVar, aas aas, ajy ajy) {
        this.f317334a = dbVar;
        this.f317335b = aas;
        this.f317336c = ajy;
    }

    public final Object apply(Object obj) {
        C114464db dbVar = this.f317334a;
        aas aas = this.f317335b;
        ajy ajy = this.f317336c;
        C59104x c = C114464db.f317374a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ProactiveNotifications");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Throwable) obj)).mo56372aa(29029)).mo56386p("Internal error");
        dbVar.f317399t.mo101317a(aas, ajy, C51962fo.INTERNAL_ERROR, (String) null, 0);
        return C118826c.f331422a;
    }
}
