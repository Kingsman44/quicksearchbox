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

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.bu */
/* compiled from: PG */
public final /* synthetic */ class C114429bu implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C114464db f317286a;

    /* renamed from: b */
    public final /* synthetic */ aas f317287b;

    public /* synthetic */ C114429bu(C114464db dbVar, aas aas) {
        this.f317286a = dbVar;
        this.f317287b = aas;
    }

    public final Object apply(Object obj) {
        C114464db dbVar = this.f317286a;
        aas aas = this.f317287b;
        C59104x c = C114464db.f317374a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ProactiveNotifications");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Throwable) obj)).mo56372aa(29036)).mo56386p("Internal error");
        if (dbVar.mo101334n()) {
            dbVar.f317399t.mo101317a(aas, ajy.CLIENT_OP, C51962fo.INTERNAL_ERROR, (String) null, 0);
        }
        C51960fm fmVar = (C51960fm) C51963fp.f136365c.createBuilder();
        C51962fo foVar = C51962fo.INTERNAL_ERROR;
        fmVar.copyOnWrite();
        C51963fp fpVar = (C51963fp) fmVar.instance;
        fpVar.f136368b = foVar.f136364u;
        fpVar.f136367a |= 1;
        return (C51963fp) fmVar.build();
    }
}
