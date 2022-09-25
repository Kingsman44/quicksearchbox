package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import com.google.android.apps.gsa.nga.shared.p6275aa.C80143bu;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80167cp;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80172cu;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80275dd;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.bn */
/* compiled from: PG */
public final /* synthetic */ class C103692bn implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C103692bn f288802a = new C103692bn();

    private /* synthetic */ C103692bn() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C80143bu buVar = (C80143bu) C80275dd.f220288c.createBuilder();
        C80167cp cpVar = (C80167cp) C80172cu.f219987b.createBuilder();
        C103691bm bmVar = new C103691bm((C58485gu) obj);
        cpVar.copyOnWrite();
        C80172cu cuVar = (C80172cu) cpVar.instance;
        C62971cq cqVar = cuVar.f219989a;
        if (!cqVar.mo58948c()) {
            cuVar.f219989a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) bmVar, (List) cuVar.f219989a);
        buVar.copyOnWrite();
        C80275dd ddVar = (C80275dd) buVar.instance;
        C80172cu cuVar2 = (C80172cu) cpVar.build();
        cuVar2.getClass();
        ddVar.f220291b = cuVar2;
        ddVar.f220290a = 5;
        return (C80275dd) buVar.build();
    }
}
