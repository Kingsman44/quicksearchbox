package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.p3926e.C51960fm;
import com.google.assistant.p3897e.p3921j.p3926e.C51962fo;
import com.google.assistant.p3897e.p3921j.p3926e.C51963fp;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.ajy;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.bt */
/* compiled from: PG */
public final /* synthetic */ class C114428bt implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C114464db f317284a;

    /* renamed from: b */
    public final /* synthetic */ aas f317285b;

    public /* synthetic */ C114428bt(C114464db dbVar, aas aas) {
        this.f317284a = dbVar;
        this.f317285b = aas;
    }

    public final Object apply(Object obj) {
        C114464db dbVar = this.f317284a;
        aas aas = this.f317285b;
        C114463da daVar = (C114463da) obj;
        C59104x b = C114464db.f317374a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ProactiveNotifications");
        ((C59052c) ((C59052c) b).mo56372aa(29035)).mo56389s("Notification suppressed: %s", daVar.f317371a.name());
        if (dbVar.mo101334n()) {
            dbVar.f317399t.mo101317a(aas, ajy.CLIENT_OP, daVar.f317371a, daVar.f317372b, daVar.f317373c);
        }
        C51960fm fmVar = (C51960fm) C51963fp.f136365c.createBuilder();
        C51962fo foVar = daVar.f317371a;
        fmVar.copyOnWrite();
        C51963fp fpVar = (C51963fp) fmVar.instance;
        fpVar.f136368b = foVar.f136364u;
        fpVar.f136367a |= 1;
        return (C51963fp) fmVar.build();
    }
}
