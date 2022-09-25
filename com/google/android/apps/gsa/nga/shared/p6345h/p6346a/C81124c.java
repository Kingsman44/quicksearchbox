package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import com.google.android.apps.gsa.nga.shared.p6345h.C81237ab;
import com.google.android.apps.gsa.nga.shared.p6345h.C81286bq;
import com.google.android.apps.gsa.nga.shared.p6345h.C81287br;
import com.google.android.apps.gsa.nga.shared.p6345h.C81288bs;
import com.google.android.apps.gsa.nga.shared.p6345h.C81328x;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.c */
/* compiled from: PG */
public final /* synthetic */ class C81124c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C81286bq f222248a;

    public /* synthetic */ C81124c(C81286bq bqVar) {
        this.f222248a = bqVar;
    }

    public final Object apply(Object obj) {
        C81286bq bqVar = this.f222248a;
        C81237ab abVar = (C81237ab) obj;
        C81328x xVar = (C81328x) abVar.toBuilder();
        C81287br brVar = (C81287br) C81288bs.f222523c.createBuilder();
        C81288bs bsVar = abVar.f222395n;
        if (bsVar == null) {
            bsVar = C81288bs.f222523c;
        }
        brVar.mo74981a(bsVar.f222526b);
        C81288bs bsVar2 = abVar.f222395n;
        if (bsVar2 == null) {
            bsVar2 = C81288bs.f222523c;
        }
        brVar.mo74982b(C81122by.m129052ah(bsVar2.f222525a, bqVar));
        xVar.copyOnWrite();
        C81237ab abVar2 = (C81237ab) xVar.instance;
        C81288bs bsVar3 = (C81288bs) brVar.build();
        bsVar3.getClass();
        abVar2.f222395n = bsVar3;
        abVar2.f222382a |= 256;
        return (C81237ab) xVar.build();
    }
}
