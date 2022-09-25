package com.google.android.apps.gsa.nga.engine.p6056o.p6059c.p6060a;

import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.understanding.C78912a;
import com.google.android.apps.gsa.nga.engine.understanding.C79330v;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.knowledge.p4661a.p4662a.C61751m;
import com.google.knowledge.p4661a.p4662a.C61752n;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.c.a.e */
/* compiled from: PG */
public final class C76546e {

    /* renamed from: a */
    public final C76552k f211778a;

    public C76546e(C76552k kVar) {
        this.f211778a = kVar;
    }

    /* renamed from: a */
    public static C61752n m123188a(C76590bg bgVar) {
        String str = ((C78912a) C79330v.m127277b(bgVar.f211838b.toString())).f217132a;
        C61751m mVar = (C61751m) C61752n.f166808f.createBuilder();
        mVar.copyOnWrite();
        C61752n nVar = (C61752n) mVar.instance;
        nVar.f166810a |= 4;
        nVar.f166811b = str;
        mVar.mo58183b((C58485gu) Collection.EL.stream(bgVar.f211837a.f166812c).map(C76543b.f211775a).sorted(Comparator.CC.comparing(C76544c.f211776a)).collect(C58370cn.f155946a));
        return (C61752n) mVar.build();
    }
}
