package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import com.google.android.apps.gsa.nga.shared.p6345h.C81237ab;
import com.google.android.apps.gsa.nga.shared.p6345h.C81328x;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.an */
/* compiled from: PG */
public final /* synthetic */ class C81084an implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ int f222203a;

    public /* synthetic */ C81084an(int i) {
        this.f222203a = i;
    }

    public final Object apply(Object obj) {
        int i = this.f222203a;
        C81237ab abVar = (C81237ab) obj;
        C81328x xVar = (C81328x) abVar.toBuilder();
        xVar.copyOnWrite();
        ((C81237ab) xVar.instance).f222397p = C81237ab.emptyIntList();
        C58485gu ah = C81122by.m129052ah(abVar.f222397p, Integer.valueOf(i));
        xVar.copyOnWrite();
        C81237ab abVar2 = (C81237ab) xVar.instance;
        C62961ch chVar = abVar2.f222397p;
        if (!chVar.mo58948c()) {
            abVar2.f222397p = C62942bv.mutableCopy(chVar);
        }
        C62947c.addAll((Iterable) ah, (List) abVar2.f222397p);
        return (C81237ab) xVar.build();
    }
}
