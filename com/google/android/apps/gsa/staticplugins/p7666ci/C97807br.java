package com.google.android.apps.gsa.staticplugins.p7666ci;

import android.os.Bundle;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87694ac;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87696ae;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.staticplugins.p7666ci.p7670d.C97823a;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.br */
/* compiled from: PG */
public final /* synthetic */ class C97807br implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C97808bs f273102a;

    /* renamed from: b */
    public final /* synthetic */ C87696ae f273103b;

    public /* synthetic */ C97807br(C97808bs bsVar, C87696ae aeVar) {
        this.f273102a = bsVar;
        this.f273103b = aeVar;
    }

    public final void run() {
        C97808bs bsVar = this.f273102a;
        C87696ae aeVar = this.f273103b;
        C97823a aVar = bsVar.f273105b.f273130k;
        C58976aa aaVar = C58975e.f156826a;
        C87673aa aaVar2 = aVar.f273183a;
        if (!aaVar2.mo81951w()) {
            aaVar2.mo81932c();
        }
        C87673aa aaVar3 = aVar.f273183a;
        if (!aaVar3.mo81953y()) {
            aaVar3.mo81947s((Bundle) null);
        }
        C97823a aVar2 = bsVar.f273105b.f273130k;
        C88489j jVar = new C88489j(C87739bu.ASSISTANT_CLIENT_SYNC_START);
        jVar.mo82014b(C87694ac.f237131a, aeVar);
        aVar2.f273183a.mo81937i(jVar.mo82013a());
    }
}
