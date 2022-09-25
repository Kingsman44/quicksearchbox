package com.google.android.apps.gsa.staticplugins.p8019j;

import com.google.android.apps.search.assistant.verticals.p9880a.p9883b.C130332g;
import com.google.assistant.p3897e.p3921j.C51714bl;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.assistant.p3897e.p3921j.C51771cx;
import com.google.assistant.p3897e.p3921j.C51772cy;
import com.google.common.base.C58817ah;
import java.util.Collections;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.ah */
/* compiled from: PG */
public final /* synthetic */ class C102546ah implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C51714bl f286192a;

    public /* synthetic */ C102546ah(C51714bl blVar) {
        this.f286192a = blVar;
    }

    public final Object apply(Object obj) {
        C51714bl blVar = this.f286192a;
        C130332g gVar = (C130332g) obj;
        C51772cy cyVar = ((C51715bm) blVar.instance).f135671h;
        if (cyVar == null) {
            cyVar = C51772cy.f135824p;
        }
        C51771cx cxVar = (C51771cx) cyVar.toBuilder();
        Map.EL.forEach(Collections.unmodifiableMap(gVar.f357232a), new C102601x(cxVar));
        C51772cy cyVar2 = (C51772cy) cxVar.build();
        blVar.copyOnWrite();
        C51715bm bmVar = (C51715bm) blVar.instance;
        cyVar2.getClass();
        bmVar.f135671h = cyVar2;
        bmVar.f135664a |= 128;
        return blVar;
    }
}
