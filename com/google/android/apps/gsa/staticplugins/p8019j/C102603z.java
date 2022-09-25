package com.google.android.apps.gsa.staticplugins.p8019j;

import com.google.assistant.p3897e.p3921j.C51714bl;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.assistant.p3897e.p3921j.C51771cx;
import com.google.assistant.p3897e.p3921j.C51772cy;
import com.google.assistant.p3897e.p3921j.C52264lh;
import com.google.assistant.p3897e.p3921j.C52265li;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.z */
/* compiled from: PG */
public final /* synthetic */ class C102603z implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C102603z f286364a = new C102603z();

    private /* synthetic */ C102603z() {
    }

    public final Object apply(Object obj) {
        C51714bl blVar = (C51714bl) obj;
        C51772cy cyVar = ((C51715bm) blVar.instance).f135671h;
        if (cyVar == null) {
            cyVar = C51772cy.f135824p;
        }
        C51771cx cxVar = (C51771cx) cyVar.toBuilder();
        C52265li liVar = ((C51772cy) cxVar.instance).f135828c;
        if (liVar == null) {
            liVar = C52265li.f137167I;
        }
        C52264lh lhVar = (C52264lh) liVar.toBuilder();
        lhVar.copyOnWrite();
        C52265li liVar2 = (C52265li) lhVar.instance;
        liVar2.f137177a |= 2048;
        liVar2.f137188l = false;
        C52265li liVar3 = (C52265li) lhVar.build();
        cxVar.copyOnWrite();
        C51772cy cyVar2 = (C51772cy) cxVar.instance;
        liVar3.getClass();
        cyVar2.f135828c = liVar3;
        cyVar2.f135826a |= 1;
        blVar.copyOnWrite();
        C51715bm bmVar = (C51715bm) blVar.instance;
        C51772cy cyVar3 = (C51772cy) cxVar.build();
        cyVar3.getClass();
        bmVar.f135671h = cyVar3;
        bmVar.f135664a |= 128;
        return blVar;
    }
}
