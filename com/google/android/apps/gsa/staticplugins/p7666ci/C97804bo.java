package com.google.android.apps.gsa.staticplugins.p7666ci;

import com.google.android.apps.gsa.p8839t.p8845f.C118362d;
import com.google.android.apps.gsa.p8839t.p8845f.C118363e;
import com.google.android.apps.gsa.p8839t.p8845f.C118364f;
import com.google.android.apps.gsa.p8839t.p8845f.C118365g;
import com.google.android.apps.gsa.p8839t.p8847h.C118426bs;
import com.google.android.apps.gsa.shared.p7041h.C89776h;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123787p;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.bo */
/* compiled from: PG */
public final /* synthetic */ class C97804bo implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C97811bv f273096a;

    public /* synthetic */ C97804bo(C97811bv bvVar) {
        this.f273096a = bvVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C97811bv bvVar = this.f273096a;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            return C58836b.f156633a;
        }
        C118426bs bsVar = bvVar.f273131l;
        C89776h hVar = (C89776h) axVar.mo56107c();
        C118364f fVar = (C118364f) C118365g.f328542b.createBuilder();
        try {
            C123787p pVar = (C123787p) C62942bv.parseFrom((C62942bv) C123787p.f341948n, hVar.toByteArray(), C62921ba.m95368a());
            C118362d dVar = (C118362d) C118363e.f328532h.createBuilder();
            dVar.copyOnWrite();
            C118363e eVar = (C118363e) dVar.instance;
            eVar.f328534a |= 1;
            eVar.f328537d = 12;
            dVar.copyOnWrite();
            C118363e eVar2 = (C118363e) dVar.instance;
            pVar.getClass();
            eVar2.f328536c = pVar;
            eVar2.f328535b = 14;
            fVar.mo103681c((C118363e) dVar.build());
        } catch (C62974ct e) {
            ((C58970a) ((C58970a) ((C58970a) bsVar.f328686g.mo56225c()).mo56382g(e)).mo56372aa(6971)).mo56386p("Catch InvalidProtocolBufferException");
        }
        return C58833ax.m90834k((C118365g) fVar.build());
    }
}
