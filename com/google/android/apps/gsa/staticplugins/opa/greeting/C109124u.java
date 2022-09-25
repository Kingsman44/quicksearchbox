package com.google.android.apps.gsa.staticplugins.opa.greeting;

import com.google.common.p4526f.C59071e;
import java.util.Set;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.greeting.u */
/* compiled from: PG */
public final /* synthetic */ class C109124u implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Set f303884a;

    public /* synthetic */ C109124u(Set set) {
        this.f303884a = set;
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
        C59071e eVar = C109100ar.f303734a;
        return !this.f303884a.contains((String) obj);
    }
}
