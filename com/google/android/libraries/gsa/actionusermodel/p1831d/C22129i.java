package com.google.android.libraries.gsa.actionusermodel.p1831d;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.d.i */
/* compiled from: PG */
public final /* synthetic */ class C22129i implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C22129i f60973a = new C22129i();

    private /* synthetic */ C22129i() {
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
        return ((String) obj).startsWith("productivity_settings#productivity_account#");
    }
}
