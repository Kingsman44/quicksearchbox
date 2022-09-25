package com.google.android.apps.gsa.staticplugins.p7666ci;

import com.google.android.apps.gsa.p8839t.p8845f.C118362d;
import com.google.android.apps.gsa.p8839t.p8845f.C118363e;
import com.google.android.apps.gsa.p8839t.p8845f.C118364f;
import com.google.android.apps.gsa.p8839t.p8845f.C118365g;
import com.google.android.apps.gsa.p8839t.p8847h.C118426bs;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123709ac;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123710ad;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.bl */
/* compiled from: PG */
public final /* synthetic */ class C97801bl implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C97811bv f273080a;

    public /* synthetic */ C97801bl(C97811bv bvVar) {
        this.f273080a = bvVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        C118426bs bsVar = this.f273080a.f273131l;
        if (!axVar.mo56113h()) {
            ((C58970a) ((C58970a) bsVar.f328686g.mo56224b()).mo56372aa(6972)).mo56386p("home automation response empty");
            return C58836b.f156633a;
        }
        C118362d dVar = (C118362d) C118363e.f328532h.createBuilder();
        dVar.copyOnWrite();
        C118363e eVar = (C118363e) dVar.instance;
        eVar.f328534a |= 1;
        eVar.f328537d = 13;
        C123709ac acVar = (C123709ac) C123710ad.f341700b.createBuilder();
        Iterable iterable = (Iterable) axVar.mo56107c();
        acVar.copyOnWrite();
        C123710ad adVar = (C123710ad) acVar.instance;
        C62971cq cqVar = adVar.f341702a;
        if (!cqVar.mo58948c()) {
            adVar.f341702a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) adVar.f341702a);
        dVar.copyOnWrite();
        C118363e eVar2 = (C118363e) dVar.instance;
        C123710ad adVar2 = (C123710ad) acVar.build();
        adVar2.getClass();
        eVar2.f328536c = adVar2;
        eVar2.f328535b = 15;
        C118364f fVar = (C118364f) C118365g.f328542b.createBuilder();
        fVar.mo103681c((C118363e) dVar.build());
        return C58833ax.m90834k((C118365g) fVar.build());
    }
}
