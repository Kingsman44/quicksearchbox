package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import com.google.android.apps.gsa.nga.shared.p6345h.C81237ab;
import com.google.android.apps.gsa.nga.shared.p6345h.C81281bl;
import com.google.android.apps.gsa.nga.shared.p6345h.C81282bm;
import com.google.android.apps.gsa.nga.shared.p6345h.C81283bn;
import com.google.android.apps.gsa.nga.shared.p6345h.C81284bo;
import com.google.android.apps.gsa.nga.shared.p6345h.C81328x;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.be */
/* compiled from: PG */
public final /* synthetic */ class C81102be implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Instant f222221a;

    /* renamed from: b */
    public final /* synthetic */ int f222222b;

    /* renamed from: c */
    public final /* synthetic */ boolean f222223c;

    public /* synthetic */ C81102be(Instant instant, int i, boolean z) {
        this.f222221a = instant;
        this.f222222b = i;
        this.f222223c = z;
    }

    public final Object apply(Object obj) {
        Instant instant = this.f222221a;
        int i = this.f222222b;
        boolean z = this.f222223c;
        C81237ab abVar = (C81237ab) obj;
        C81328x xVar = (C81328x) abVar.toBuilder();
        C81283bn bnVar = (C81283bn) C81284bo.f222515b.createBuilder();
        C81284bo boVar = abVar.f222396o;
        if (boVar == null) {
            boVar = C81284bo.f222515b;
        }
        C62971cq cqVar = boVar.f222517a;
        C81281bl blVar = (C81281bl) C81282bm.f222509e.createBuilder();
        long epochMilli = instant.toEpochMilli();
        blVar.copyOnWrite();
        C81282bm bmVar = (C81282bm) blVar.instance;
        bmVar.f222511a |= 1;
        bmVar.f222512b = epochMilli;
        blVar.copyOnWrite();
        C81282bm bmVar2 = (C81282bm) blVar.instance;
        bmVar2.f222511a |= 2;
        bmVar2.f222513c = i;
        blVar.copyOnWrite();
        C81282bm bmVar3 = (C81282bm) blVar.instance;
        bmVar3.f222511a |= 4;
        bmVar3.f222514d = z;
        C58485gu ah = C81122by.m129052ah(cqVar, (C81282bm) blVar.build());
        bnVar.copyOnWrite();
        C81284bo boVar2 = (C81284bo) bnVar.instance;
        C62971cq cqVar2 = boVar2.f222517a;
        if (!cqVar2.mo58948c()) {
            boVar2.f222517a = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) ah, (List) boVar2.f222517a);
        xVar.copyOnWrite();
        C81237ab abVar2 = (C81237ab) xVar.instance;
        C81284bo boVar3 = (C81284bo) bnVar.build();
        boVar3.getClass();
        abVar2.f222396o = boVar3;
        abVar2.f222382a |= 512;
        return (C81237ab) xVar.build();
    }
}
