package com.google.android.libraries.lens.view.p2092c;

import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.c.m */
/* compiled from: PG */
public final /* synthetic */ class C25717m implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ long f69920a;

    public /* synthetic */ C25717m(long j) {
        this.f69920a = j;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        long j = this.f69920a;
        C58974d dVar = C25720p.f69924a;
        return ((Long) obj).longValue() >= j;
    }
}
