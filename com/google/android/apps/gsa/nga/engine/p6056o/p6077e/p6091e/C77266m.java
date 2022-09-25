package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.android.apps.gsa.nga.shared.p6320al.C80884a;
import com.google.assistant.p3897e.p3917i.p3918a.C51473j;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.m */
/* compiled from: PG */
public final /* synthetic */ class C77266m implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Optional f213116a;

    public /* synthetic */ C77266m(Optional optional) {
        this.f213116a = optional;
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
        Optional optional = this.f213116a;
        C51473j jVar = (C51473j) obj;
        int i = C77276w.f213129a;
        return (jVar.f134092a & 64) != 0 && C80884a.m128736a(jVar.f134099h).equals(optional.get());
    }
}
