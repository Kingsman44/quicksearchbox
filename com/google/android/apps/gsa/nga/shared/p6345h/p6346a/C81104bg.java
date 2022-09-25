package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import com.google.android.apps.gsa.nga.shared.p6345h.C81237ab;
import com.google.android.apps.gsa.nga.shared.p6345h.C81328x;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.bg */
/* compiled from: PG */
public final /* synthetic */ class C81104bg implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ long f222225a;

    public /* synthetic */ C81104bg(long j) {
        this.f222225a = j;
    }

    public final Object apply(Object obj) {
        long j = this.f222225a;
        C81237ab abVar = (C81237ab) obj;
        C81328x xVar = (C81328x) abVar.toBuilder();
        int i = abVar.f222389h;
        xVar.copyOnWrite();
        C81237ab abVar2 = (C81237ab) xVar.instance;
        abVar2.f222382a |= 4;
        abVar2.f222389h = i + 1;
        xVar.copyOnWrite();
        ((C81237ab) xVar.instance).f222391j = C81237ab.emptyLongList();
        xVar.mo74996a(C81122by.m129052ah(abVar.f222391j, Long.valueOf(j)));
        int i2 = ((C81237ab) xVar.instance).f222389h;
        return (C81237ab) xVar.build();
    }
}
