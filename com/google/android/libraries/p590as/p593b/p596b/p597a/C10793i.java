package com.google.android.libraries.p590as.p593b.p596b.p597a;

import com.google.android.libraries.p590as.p593b.p596b.C10882h;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.as.b.b.a.i */
/* compiled from: PG */
public final /* synthetic */ class C10793i implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C10882h f35821a;

    public /* synthetic */ C10793i(C10882h hVar) {
        this.f35821a = hVar;
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
        C10882h hVar = this.f35821a;
        C58974d dVar = C10795k.f35823a;
        return ((C10882h) obj).mo19333l(hVar);
    }
}
