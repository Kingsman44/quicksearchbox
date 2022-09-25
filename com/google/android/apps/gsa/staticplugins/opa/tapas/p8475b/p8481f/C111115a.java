package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8481f;

import java.util.List;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.f.a */
/* compiled from: PG */
public final /* synthetic */ class C111115a implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C111115a f309364a = new C111115a();

    private /* synthetic */ C111115a() {
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
        return !((List) obj).isEmpty();
    }
}
