package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.ajy;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.cj */
/* compiled from: PG */
public final /* synthetic */ class C114445cj implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C114464db f317330a;

    /* renamed from: b */
    public final /* synthetic */ aas f317331b;

    /* renamed from: c */
    public final /* synthetic */ ajy f317332c;

    public /* synthetic */ C114445cj(C114464db dbVar, aas aas, ajy ajy) {
        this.f317330a = dbVar;
        this.f317331b = aas;
        this.f317332c = ajy;
    }

    public final Object apply(Object obj) {
        C114464db dbVar = this.f317330a;
        aas aas = this.f317331b;
        ajy ajy = this.f317332c;
        C114463da daVar = (C114463da) obj;
        C59104x b = C114464db.f317374a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ProactiveNotifications");
        ((C59052c) ((C59052c) b).mo56372aa(29028)).mo56389s("Notification suppressed: %s", daVar.f317371a.name());
        dbVar.f317399t.mo101317a(aas, ajy, daVar.f317371a, daVar.f317372b, daVar.f317373c);
        return C118826c.f331422a;
    }
}
