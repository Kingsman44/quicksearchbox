package com.google.android.libraries.lens.ondevice.p2024d;

import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4701g.C62306cb;
import com.google.lens.p4701g.C62307cc;
import com.google.lens.p4701g.C62308cd;
import com.google.lens.p4701g.C62321cq;
import com.google.lens.p4701g.C62324ct;
import com.google.lens.p4701g.C62329cy;
import com.google.lens.p4701g.C62332da;
import com.google.lens.p4701g.C62333db;
import com.google.lens.p4705i.p4706a.C62377h;
import com.google.lens.p4705i.p4706a.C62383n;
import dagger.p5295b.C68283d;

/* renamed from: com.google.android.libraries.lens.ondevice.d.eb */
/* compiled from: PG */
public final class C24403eb {

    /* renamed from: a */
    public static final C58974d f66820a = C58974d.m91135i("ProactiveOrchProducer");

    /* renamed from: a */
    static C62308cd m45459a(C62383n nVar, C62306cb cbVar, C62333db dbVar, C62324ct ctVar, C62377h hVar) {
        C62307cc ccVar = (C62307cc) C62308cd.f168200g.createBuilder();
        ccVar.copyOnWrite();
        C62308cd cdVar = (C62308cd) ccVar.instance;
        nVar.getClass();
        cdVar.f168205d = nVar;
        cdVar.f168202a |= 8;
        ccVar.copyOnWrite();
        C62308cd cdVar2 = (C62308cd) ccVar.instance;
        cbVar.getClass();
        cdVar2.f168207f = cbVar;
        cdVar2.f168202a |= 32;
        ccVar.copyOnWrite();
        C62308cd cdVar3 = (C62308cd) ccVar.instance;
        hVar.getClass();
        cdVar3.f168206e = hVar;
        cdVar3.f168202a |= 16;
        ccVar.copyOnWrite();
        C62308cd cdVar4 = (C62308cd) ccVar.instance;
        dbVar.getClass();
        cdVar4.f168203b = dbVar;
        cdVar4.f168202a |= 2;
        ccVar.copyOnWrite();
        C62308cd cdVar5 = (C62308cd) ccVar.instance;
        ctVar.getClass();
        cdVar5.f168204c = ctVar;
        cdVar5.f168202a |= 4;
        return (C62308cd) ccVar.build();
    }

    /* renamed from: b */
    static C60870cx m45460b(C62333db dbVar, C62324ct ctVar, C68283d dVar) {
        int a = C62332da.m94769a(dbVar.f168278c);
        if ((a == 0 || a != 2) && !dbVar.f168277b) {
            ((C58970a) ((C58970a) f66820a.mo56224b()).mo56372aa(48784)).mo56386p("maybeRunSalientRegionDetection: image is not shoppable.");
            return C60856cj.m92900i(C62377h.f168391c);
        } else if (ctVar.f168240b) {
            ((C58970a) ((C58970a) f66820a.mo56224b()).mo56372aa(48783)).mo56386p("maybeRunSalientRegionDetection: image is sensitive.");
            return C60856cj.m92900i(C62377h.f168391c);
        } else {
            ((C58970a) ((C58970a) f66820a.mo56224b()).mo56372aa(48782)).mo56386p("maybeRunSalienctRegionDetection: execute salient region detection.");
            return dVar.mo60297gq();
        }
    }

    /* renamed from: c */
    static C60870cx m45461c(C62333db dbVar, C68283d dVar) {
        int a;
        if (dbVar.f168277b || ((a = C62332da.m94769a(dbVar.f168278c)) != 0 && a == 2)) {
            ((C58970a) ((C58970a) f66820a.mo56224b()).mo56372aa(48785)).mo56386p("maybeRunSensitivityClassifier: shoppable image or bypassed");
            return dVar.mo60297gq();
        }
        C62321cq cqVar = (C62321cq) C62324ct.f168237e.createBuilder();
        cqVar.copyOnWrite();
        C62324ct ctVar = (C62324ct) cqVar.instance;
        ctVar.f168241c = 2;
        ctVar.f168239a = 2 | ctVar.f168239a;
        return C60856cj.m92900i((C62324ct) cqVar.build());
    }

    /* renamed from: d */
    static C60870cx m45462d(C62383n nVar, C68283d dVar) {
        if ((nVar.f168405a & 1) == 0 || !nVar.f168406b) {
            ((C58970a) ((C58970a) f66820a.mo56224b()).mo56372aa(48786)).mo56386p("maybeRunShoppingClassifier: application in allowlist; executing");
            return dVar.mo60297gq();
        }
        ((C58970a) ((C58970a) f66820a.mo56224b()).mo56372aa(48787)).mo56386p("maybeRunShoppingClassifier: application not in allowlist");
        C62329cy cyVar = (C62329cy) C62333db.f168274e.createBuilder();
        cyVar.copyOnWrite();
        C62333db dbVar = (C62333db) cyVar.instance;
        dbVar.f168278c = 2;
        dbVar.f168276a |= 16;
        return C60856cj.m92900i((C62333db) cyVar.build());
    }
}
