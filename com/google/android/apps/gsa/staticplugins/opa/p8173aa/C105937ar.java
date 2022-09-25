package com.google.android.apps.gsa.staticplugins.opa.p8173aa;

import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87694ac;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87695ad;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87696ae;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.assistant.p3980n.p3981a.p3982a.C53001d;
import com.google.common.base.C58833ax;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.aa.ar */
/* compiled from: PG */
public final /* synthetic */ class C105937ar implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C105952bf f295775a;

    public /* synthetic */ C105937ar(C105952bf bfVar) {
        this.f295775a = bfVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C105952bf bfVar = this.f295775a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C88489j jVar = new C88489j(C87739bu.ASSISTANT_CLIENT_SYNC_START);
            C62940bt btVar = C87694ac.f237131a;
            C87695ad adVar = (C87695ad) C87696ae.f237132p.createBuilder();
            C53001d dVar = (C53001d) axVar.mo56107c();
            adVar.copyOnWrite();
            C87696ae aeVar = (C87696ae) adVar.instance;
            dVar.getClass();
            aeVar.f237135b = dVar;
            aeVar.f237134a |= 1;
            jVar.mo82014b(btVar, (C87696ae) adVar.build());
            bfVar.f295810f.mo96219b(jVar.mo82013a());
        }
    }
}
