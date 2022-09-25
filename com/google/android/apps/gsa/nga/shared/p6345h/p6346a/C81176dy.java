package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import com.google.android.apps.gsa.nga.shared.p6345h.C81321q;
import com.google.android.apps.gsa.nga.shared.p6345h.C81322r;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.dy */
/* compiled from: PG */
public final /* synthetic */ class C81176dy implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Long f222314a;

    public /* synthetic */ C81176dy(Long l) {
        this.f222314a = l;
    }

    public final Object apply(Object obj) {
        Long l = this.f222314a;
        C81321q qVar = (C81321q) ((C81322r) obj).toBuilder();
        long longValue = l.longValue();
        qVar.copyOnWrite();
        C81322r rVar = (C81322r) qVar.instance;
        rVar.f222598a |= 1;
        rVar.f222599b = longValue;
        return (C81322r) qVar.build();
    }
}
