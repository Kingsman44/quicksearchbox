package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import com.google.android.apps.gsa.nga.shared.p6275aa.C80143bu;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80177cz;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80272da;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80275dd;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.bu */
/* compiled from: PG */
public final /* synthetic */ class C103699bu implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C103699bu f288818a = new C103699bu();

    private /* synthetic */ C103699bu() {
    }

    public final Object apply(Object obj) {
        C58485gu guVar = (C58485gu) obj;
        C80143bu buVar = (C80143bu) C80275dd.f220288c.createBuilder();
        C80177cz czVar = (C80177cz) C80272da.f220278b.createBuilder();
        czVar.copyOnWrite();
        C80272da daVar = (C80272da) czVar.instance;
        C62971cq cqVar = daVar.f220280a;
        if (!cqVar.mo58948c()) {
            daVar.f220280a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) guVar, (List) daVar.f220280a);
        buVar.copyOnWrite();
        C80275dd ddVar = (C80275dd) buVar.instance;
        C80272da daVar2 = (C80272da) czVar.build();
        daVar2.getClass();
        ddVar.f220291b = daVar2;
        ddVar.f220290a = 15;
        return (C80275dd) buVar.build();
    }
}
