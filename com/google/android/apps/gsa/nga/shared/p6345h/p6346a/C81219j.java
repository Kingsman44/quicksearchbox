package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import com.google.android.apps.gsa.nga.shared.p6345h.C81237ab;
import com.google.android.apps.gsa.nga.shared.p6345h.C81328x;
import com.google.common.base.C58817ah;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.j */
/* compiled from: PG */
public final /* synthetic */ class C81219j implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Instant f222361a;

    public /* synthetic */ C81219j(Instant instant) {
        this.f222361a = instant;
    }

    public final Object apply(Object obj) {
        Instant instant = this.f222361a;
        C81237ab abVar = (C81237ab) obj;
        long j = abVar.f222393l;
        if (j <= 0) {
            j = Long.MAX_VALUE;
        }
        if (instant.toEpochMilli() < j) {
            j = instant.toEpochMilli();
        }
        C81328x xVar = (C81328x) abVar.toBuilder();
        xVar.copyOnWrite();
        C81237ab abVar2 = (C81237ab) xVar.instance;
        abVar2.f222382a |= 64;
        abVar2.f222393l = j;
        return (C81237ab) xVar.build();
    }
}
