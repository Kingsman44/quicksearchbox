package com.google.android.libraries.assistant.pcp.p1554e;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.pcp.e.aq */
/* compiled from: PG */
public final /* synthetic */ class C18647aq implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C18647aq f52673a = new C18647aq();

    private /* synthetic */ C18647aq() {
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
        return ((Optional) obj).isPresent();
    }
}
