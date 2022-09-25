package com.google.android.apps.gsa.staticplugins.opa;

import com.google.assistant.p4008y.p4009a.C53567b;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.nx */
/* compiled from: PG */
public final /* synthetic */ class C109750nx implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C109750nx f305769a = new C109750nx();

    private /* synthetic */ C109750nx() {
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
        return !((C53567b) obj).f140593a.isEmpty();
    }
}
