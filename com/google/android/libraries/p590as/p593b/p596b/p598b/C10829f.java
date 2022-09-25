package com.google.android.libraries.p590as.p593b.p596b.p598b;

import com.google.android.libraries.p590as.p593b.p596b.C10882h;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Collection;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.as.b.b.b.f */
/* compiled from: PG */
public final /* synthetic */ class C10829f implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f35871a;

    public /* synthetic */ C10829f(C58485gu guVar) {
        this.f35871a = guVar;
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
        C10882h hVar = (C10882h) obj;
        boolean noneMatch = Collection.EL.stream(this.f35871a).noneMatch(new C10834k(hVar));
        if (noneMatch) {
            ((C58970a) ((C58970a) C10844u.f35894a.mo56224b()).mo56372aa(54002)).mo56389s("Rolling back previously requested pack that is no longer available: %s", hVar);
        }
        return noneMatch;
    }
}
