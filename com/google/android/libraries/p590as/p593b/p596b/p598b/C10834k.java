package com.google.android.libraries.p590as.p593b.p596b.p598b;

import com.google.android.libraries.p590as.p593b.p596b.C10882h;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.as.b.b.b.k */
/* compiled from: PG */
public final /* synthetic */ class C10834k implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C10882h f35876a;

    public /* synthetic */ C10834k(C10882h hVar) {
        this.f35876a = hVar;
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
        C10882h hVar = this.f35876a;
        C10882h hVar2 = (C10882h) obj;
        C58974d dVar = C10844u.f35894a;
        if (!hVar2.mo19333l(hVar)) {
            return false;
        }
        int h = hVar2.mo19290h();
        int h2 = hVar.mo19290h();
        if (h != 0) {
            return h == h2;
        }
        throw null;
    }
}
