package com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10393a;

import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c.C137248f;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57563ag;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57566aj;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57578av;
import java.util.List;
import p3186j$.util.function.IntPredicate;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.a.a.b */
/* compiled from: PG */
public final /* synthetic */ class C137235b implements IntPredicate {

    /* renamed from: a */
    public final /* synthetic */ List f373375a;

    public /* synthetic */ C137235b(List list) {
        this.f373375a = list;
    }

    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return IntPredicate.CC.$default$and(this, intPredicate);
    }

    public final /* synthetic */ IntPredicate negate() {
        return IntPredicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ IntPredicate mo19598or(IntPredicate intPredicate) {
        return IntPredicate.CC.$default$or(this, intPredicate);
    }

    public final boolean test(int i) {
        C57563ag agVar;
        List list = this.f373375a;
        long j = C137238e.f373379a;
        C137248f fVar = (C137248f) list.get(i);
        C57578av avVar = fVar.f373396a;
        if (avVar == null) {
            avVar = C57578av.f153822h;
        }
        if (avVar.f153824a != null) {
            C57578av avVar2 = fVar.f373396a;
            if (avVar2 == null) {
                avVar2 = C57578av.f153822h;
            }
            C57566aj ajVar = avVar2.f153824a;
            if (ajVar == null) {
                ajVar = C57566aj.f153791e;
            }
            agVar = C57563ag.m88496a(ajVar.f153794b);
            if (agVar == null) {
                agVar = C57563ag.UNRECOGNIZED;
            }
        } else {
            agVar = C57563ag.UNKNOWN_LIST_CLASS;
        }
        return agVar == C57563ag.CUSTOM;
    }
}
