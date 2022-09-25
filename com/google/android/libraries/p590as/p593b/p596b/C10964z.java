package com.google.android.libraries.p590as.p593b.p596b;

import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.as.b.b.z */
/* compiled from: PG */
public final /* synthetic */ class C10964z implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C10812ap f36087a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f36088b;

    public /* synthetic */ C10964z(C10812ap apVar, C58485gu guVar) {
        this.f36087a = apVar;
        this.f36088b = guVar;
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
        C10812ap apVar = this.f36087a;
        C58485gu guVar = this.f36088b;
        C10882h hVar = (C10882h) obj;
        if (!apVar.f35850c.booleanValue()) {
            return true;
        }
        boolean anyMatch = Collection.EL.stream(guVar).anyMatch(new C10958t(hVar));
        hVar.mo19332k();
        return anyMatch;
    }
}
