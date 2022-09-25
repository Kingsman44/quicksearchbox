package com.google.android.apps.gsa.nga.engine.understanding.p6236c;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80420al;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80421am;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.c.ab */
/* compiled from: PG */
public final /* synthetic */ class C79011ab implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f217298a;

    public /* synthetic */ C79011ab(String str) {
        this.f217298a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f217298a;
        C58485gu guVar = (C58485gu) obj;
        C80420al alVar = (C80420al) C80421am.f220723d.createBuilder();
        alVar.copyOnWrite();
        C80421am amVar = (C80421am) alVar.instance;
        str.getClass();
        amVar.f220725a |= 1;
        amVar.f220726b = str;
        alVar.copyOnWrite();
        C80421am amVar2 = (C80421am) alVar.instance;
        C62971cq cqVar = amVar2.f220727c;
        if (!cqVar.mo58948c()) {
            amVar2.f220727c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) guVar, (List) amVar2.f220727c);
        return Optional.m71637of((C80421am) alVar.build());
    }
}
