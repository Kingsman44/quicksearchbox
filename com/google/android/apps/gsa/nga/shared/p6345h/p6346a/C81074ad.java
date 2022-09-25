package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import com.google.android.apps.gsa.nga.shared.p6345h.C81237ab;
import com.google.android.apps.gsa.nga.shared.p6345h.C81328x;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.ad */
/* compiled from: PG */
public final /* synthetic */ class C81074ad implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f222192a;

    public /* synthetic */ C81074ad(String str) {
        this.f222192a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f222192a;
        C81237ab abVar = (C81237ab) obj;
        C81328x xVar = (C81328x) abVar.toBuilder();
        xVar.copyOnWrite();
        ((C81237ab) xVar.instance).f222400s = C62942bv.emptyProtobufList();
        C58485gu ah = C81122by.m129052ah(abVar.f222400s, str);
        xVar.copyOnWrite();
        C81237ab abVar2 = (C81237ab) xVar.instance;
        C62971cq cqVar = abVar2.f222400s;
        if (!cqVar.mo58948c()) {
            abVar2.f222400s = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) ah, (List) abVar2.f222400s);
        return (C81237ab) xVar.build();
    }
}
