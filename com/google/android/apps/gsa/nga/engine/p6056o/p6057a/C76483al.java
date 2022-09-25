package com.google.android.apps.gsa.nga.engine.p6056o.p6057a;

import com.google.android.apps.gsa.nga.engine.p6056o.C77426t;
import com.google.android.apps.gsa.nga.engine.p6056o.p6095g.C77402o;
import com.google.android.apps.gsa.nga.engine.understanding.C79156n;
import com.google.android.apps.gsa.nga.engine.understanding.C79158p;
import com.google.android.apps.gsa.nga.engine.understanding.C79330v;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80375e;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80377g;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80381k;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80383m;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80386p;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80426f;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80517f;
import com.google.common.base.C58839bc;
import com.google.common.p4522b.C58565jt;
import com.google.common.p4522b.C58759qy;
import com.google.p4242bp.p4257f.p4262c.C56340b;
import com.google.protobuf.C62963cj;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.a.al */
/* compiled from: PG */
public final /* synthetic */ class C76483al implements C58839bc {

    /* renamed from: a */
    public final /* synthetic */ C77402o f211666a;

    public /* synthetic */ C76483al(C77402o oVar) {
        this.f211666a = oVar;
    }

    /* renamed from: a */
    public final boolean mo5941a(Object obj) {
        C80386p a = this.f211666a.mo72540a((C77426t) obj);
        C80383m mVar = a.f220582c;
        if (mVar == null) {
            mVar = C80383m.f220568e;
        }
        C80517f a2 = C80517f.m128187a(mVar.f220570a);
        if (a2 == null) {
            a2 = C80517f.UNRECOGNIZED;
        }
        if (a2 != C80517f.GENIE) {
            return true;
        }
        C80377g gVar = a.f220583d;
        if (gVar == null) {
            gVar = C80377g.f220548e;
        }
        C80375e eVar = gVar.f220553d;
        if (eVar == null) {
            eVar = C80375e.f220543c;
        }
        if (C79158p.m127102c(eVar.f220545a)) {
            return false;
        }
        C80381k kVar = a.f220584e;
        if (kVar == null) {
            kVar = C80381k.f220564b;
        }
        C80375e eVar2 = kVar.f220566a;
        if (eVar2 == null) {
            eVar2 = C80375e.f220543c;
        }
        C80377g gVar2 = a.f220583d;
        if (gVar2 == null) {
            gVar2 = C80377g.f220548e;
        }
        C80375e eVar3 = gVar2.f220553d;
        if (eVar3 == null) {
            eVar3 = C80375e.f220543c;
        }
        C79330v b = C79330v.m127277b(eVar3.f220545a);
        if (!b.mo73901d(eVar2.f220545a)) {
            return true;
        }
        C58565jt jtVar = new C58565jt(((C58759qy) C79158p.f217605a).f156534a);
        while (true) {
            if (jtVar.hasNext()) {
                if (b.mo73901d((String) jtVar.next())) {
                    break;
                }
            } else if (!Collection.EL.stream(eVar3.f220546b).allMatch(new C79156n(eVar2))) {
                return true;
            }
        }
        C80383m mVar2 = a.f220582c;
        if (mVar2 == null) {
            mVar2 = C80383m.f220568e;
        }
        C80426f fVar = mVar2.f220572c;
        if (fVar == null) {
            fVar = C80426f.f220738f;
        }
        if (new C62963cj(fVar.f220740a, C80426f.f220736b).contains(C56340b.REPEAT)) {
            return true;
        }
        return false;
    }
}
