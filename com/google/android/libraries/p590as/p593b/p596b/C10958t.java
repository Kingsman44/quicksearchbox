package com.google.android.libraries.p590as.p593b.p596b;

import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.as.b.b.t */
/* compiled from: PG */
public final /* synthetic */ class C10958t implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C10882h f36079a;

    public /* synthetic */ C10958t(C10882h hVar) {
        this.f36079a = hVar;
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
        C10882h hVar = this.f36079a;
        C58974d dVar = C10812ap.f35848a;
        return ((C10882h) obj).mo19333l(hVar);
    }
}
