package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import java.util.Set;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.bu */
/* compiled from: PG */
public final /* synthetic */ class C111883bu implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Set f310884a;

    public /* synthetic */ C111883bu(Set set) {
        this.f310884a = set;
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
        return this.f310884a.contains((C48672ag) obj);
    }
}
