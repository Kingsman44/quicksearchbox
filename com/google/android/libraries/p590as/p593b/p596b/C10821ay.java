package com.google.android.libraries.p590as.p593b.p596b;

import com.google.android.libraries.p590as.p593b.p596b.p604g.C10879g;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.as.b.b.ay */
/* compiled from: PG */
public final /* synthetic */ class C10821ay implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C10879g f35863a;

    public /* synthetic */ C10821ay(C10879g gVar) {
        this.f35863a = gVar;
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
        C10879g gVar = this.f35863a;
        C58974d dVar = C10846ba.f35901a;
        return !((C10879g) obj).equals(gVar);
    }
}
