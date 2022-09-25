package com.google.android.apps.gsa.staticplugins.p8019j;

import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.assistant.p3897e.p3921j.C51697ay;
import com.google.assistant.p3897e.p3921j.C51704bb;
import com.google.assistant.p3897e.p3921j.C51705bc;
import com.google.assistant.p3897e.p3921j.C51714bl;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.assistant.p3897e.p3921j.C51753cf;
import com.google.assistant.p3897e.p3921j.C51754cg;
import com.google.assistant.p3897e.p3921j.C51756ci;
import com.google.assistant.p3897e.p3921j.C51771cx;
import com.google.assistant.p3897e.p3921j.C51772cy;
import com.google.assistant.p3897e.p3921j.C51773cz;
import com.google.assistant.p3897e.p3921j.C51785da;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.aa */
/* compiled from: PG */
public final /* synthetic */ class C102539aa implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C102550al f286168a;

    /* renamed from: b */
    public final /* synthetic */ C51714bl f286169b;

    /* renamed from: c */
    public final /* synthetic */ Query f286170c;

    public /* synthetic */ C102539aa(C102550al alVar, C51714bl blVar, Query query) {
        this.f286168a = alVar;
        this.f286169b = blVar;
        this.f286170c = query;
    }

    public final C60870cx apply(Object obj) {
        C102550al alVar = this.f286168a;
        C51714bl blVar = this.f286169b;
        Query query = this.f286170c;
        Boolean bool = (Boolean) obj;
        C51705bc bcVar = ((C51715bm) blVar.instance).f135668e;
        if (bcVar == null) {
            bcVar = C51705bc.f135639e;
        }
        C51704bb bbVar = (C51704bb) bcVar.toBuilder();
        C51697ay ayVar = C51697ay.AUTHENTICATED_USER_ONLY;
        bbVar.copyOnWrite();
        C51705bc bcVar2 = (C51705bc) bbVar.instance;
        bcVar2.f135643c = ayVar.f135627c;
        bcVar2.f135641a |= 2;
        C51705bc bcVar3 = (C51705bc) bbVar.build();
        blVar.copyOnWrite();
        C51715bm bmVar = (C51715bm) blVar.instance;
        bcVar3.getClass();
        bmVar.f135668e = bcVar3;
        bmVar.f135664a |= 8;
        if (query.mo84364bx("is-in-driving-mode") && query.mo84363bw("is-in-driving-mode")) {
            blVar.copyOnWrite();
            C51715bm bmVar2 = (C51715bm) blVar.instance;
            bmVar2.f135677n = 1;
            bmVar2.f135664a |= C89885b.S3REQUEST_VALUE;
        }
        if (((C89656k) alVar.f286209i.mo27525b()).mo83561p()) {
            C51756ci ciVar = C51756ci.NO_PERSONAL_DATA;
            if (bool.booleanValue()) {
                ciVar = C51756ci.ALL_PERSONAL_DATA;
            }
            C51753cf cfVar = (C51753cf) C51754cg.f135778e.createBuilder();
            cfVar.copyOnWrite();
            C51754cg cgVar = (C51754cg) cfVar.instance;
            cgVar.f135781b = ciVar.f135790e;
            cgVar.f135780a |= 1;
            blVar.copyOnWrite();
            C51715bm bmVar3 = (C51715bm) blVar.instance;
            C51754cg cgVar2 = (C51754cg) cfVar.build();
            cgVar2.getClass();
            bmVar3.f135672i = cgVar2;
            bmVar3.f135664a |= 256;
            C102550al.m170056o(blVar);
            C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
            czVar.copyOnWrite();
            C51785da daVar = (C51785da) czVar.instance;
            daVar.f135877a |= 1;
            daVar.f135878b = "device.WAIT_FOR_AUTHENTICATION";
            czVar.copyOnWrite();
            C51785da daVar2 = (C51785da) czVar.instance;
            daVar2.f135877a |= 2;
            daVar2.f135879c = 1;
            C51785da daVar3 = (C51785da) czVar.build();
            C51772cy cyVar = ((C51715bm) blVar.instance).f135671h;
            if (cyVar == null) {
                cyVar = C51772cy.f135824p;
            }
            C51771cx cxVar = (C51771cx) cyVar.toBuilder();
            cxVar.copyOnWrite();
            C51772cy cyVar2 = (C51772cy) cxVar.instance;
            daVar3.getClass();
            cyVar2.mo53724a();
            cyVar2.f135827b.add(daVar3);
            blVar.copyOnWrite();
            C51715bm bmVar4 = (C51715bm) blVar.instance;
            C51772cy cyVar3 = (C51772cy) cxVar.build();
            cyVar3.getClass();
            bmVar4.f135671h = cyVar3;
            bmVar4.f135664a |= 128;
        }
        C58976aa aaVar = C58975e.f156826a;
        return C60856cj.m92900i(blVar);
    }
}
