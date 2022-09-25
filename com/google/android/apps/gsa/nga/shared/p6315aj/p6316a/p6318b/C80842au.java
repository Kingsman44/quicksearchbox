package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.b.au */
/* compiled from: PG */
public final /* synthetic */ class C80842au implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C80842au f221774a = new C80842au();

    private /* synthetic */ C80842au() {
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
