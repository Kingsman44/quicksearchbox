package com.google.android.apps.gsa.staticplugins.nga.p8044a.p8045a;

import com.google.android.apps.gsa.search.core.google.gaia.C86053n;
import com.google.common.p4552o.C60470rb;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.a.a.s */
/* compiled from: PG */
public final /* synthetic */ class C102990s implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C102990s f287569a = new C102990s();

    private /* synthetic */ C102990s() {
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
        return C60470rb.USER_RECOVERABLE_ERROR.equals(((C86053n) obj).f232633b);
    }
}
