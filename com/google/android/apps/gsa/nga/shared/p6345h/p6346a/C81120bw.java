package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import com.google.android.apps.gsa.nga.shared.p6345h.C81237ab;
import com.google.android.apps.gsa.nga.shared.p6345h.C81290bu;
import com.google.android.apps.gsa.nga.shared.p6345h.C81291bv;
import com.google.android.apps.gsa.nga.shared.p6345h.C81292bw;
import com.google.android.apps.gsa.nga.shared.p6345h.C81328x;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.bw */
/* compiled from: PG */
public final /* synthetic */ class C81120bw implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ boolean f222242a;

    /* renamed from: b */
    public final /* synthetic */ C81290bu f222243b;

    public /* synthetic */ C81120bw(boolean z, C81290bu buVar) {
        this.f222242a = z;
        this.f222243b = buVar;
    }

    public final Object apply(Object obj) {
        boolean z = this.f222242a;
        C81290bu buVar = this.f222243b;
        C81237ab abVar = (C81237ab) obj;
        if (z) {
            C81328x xVar = (C81328x) abVar.toBuilder();
            C81291bv bvVar = (C81291bv) C81292bw.f222532c.createBuilder();
            C81292bw bwVar = abVar.f222394m;
            if (bwVar == null) {
                bwVar = C81292bw.f222532c;
            }
            bvVar.mo74984b(bwVar.f222534a);
            C81292bw bwVar2 = abVar.f222394m;
            if (bwVar2 == null) {
                bwVar2 = C81292bw.f222532c;
            }
            bvVar.mo74983a(C81122by.m129052ah(bwVar2.f222535b, buVar));
            xVar.copyOnWrite();
            C81237ab abVar2 = (C81237ab) xVar.instance;
            C81292bw bwVar3 = (C81292bw) bvVar.build();
            bwVar3.getClass();
            abVar2.f222394m = bwVar3;
            abVar2.f222382a |= 128;
            return (C81237ab) xVar.build();
        }
        C81328x xVar2 = (C81328x) abVar.toBuilder();
        C81291bv bvVar2 = (C81291bv) C81292bw.f222532c.createBuilder();
        C81292bw bwVar4 = abVar.f222394m;
        if (bwVar4 == null) {
            bwVar4 = C81292bw.f222532c;
        }
        bvVar2.mo74983a(bwVar4.f222535b);
        C81292bw bwVar5 = abVar.f222394m;
        if (bwVar5 == null) {
            bwVar5 = C81292bw.f222532c;
        }
        bvVar2.mo74984b(C81122by.m129052ah(bwVar5.f222534a, buVar));
        xVar2.copyOnWrite();
        C81237ab abVar3 = (C81237ab) xVar2.instance;
        C81292bw bwVar6 = (C81292bw) bvVar2.build();
        bwVar6.getClass();
        abVar3.f222394m = bwVar6;
        abVar3.f222382a |= 128;
        return (C81237ab) xVar2.build();
    }
}
