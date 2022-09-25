package com.google.android.libraries.p590as.p593b.p596b.p598b;

import com.google.android.libraries.p590as.p593b.p596b.C10882h;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.as.b.b.b.l */
/* compiled from: PG */
public final /* synthetic */ class C10835l implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f35877a;

    public /* synthetic */ C10835l(C58485gu guVar) {
        this.f35877a = guVar;
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
        return this.f35877a.contains((C10882h) obj);
    }
}
