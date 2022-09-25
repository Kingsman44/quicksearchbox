package com.google.android.libraries.p590as.p593b.p596b.p607i;

import com.google.android.libraries.p590as.p593b.p596b.C10882h;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.as.b.b.i.s */
/* compiled from: PG */
public final /* synthetic */ class C10940s implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C10882h f36056a;

    public /* synthetic */ C10940s(C10882h hVar) {
        this.f36056a = hVar;
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
        C10882h hVar = this.f36056a;
        C58974d dVar = C10905af.f35995a;
        return ((Long) obj).longValue() == ((long) hVar.mo19282a());
    }
}
