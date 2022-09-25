package com.google.android.apps.gsa.shared.bisto;

import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17046am;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.shared.bisto.aj */
/* compiled from: PG */
public final /* synthetic */ class C89612aj implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C89612aj f242675a = new C89612aj();

    private /* synthetic */ C89612aj() {
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
        return (((C17046am) obj).f49657a & 1) != 0;
    }
}
