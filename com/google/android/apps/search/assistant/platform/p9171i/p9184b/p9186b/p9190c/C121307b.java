package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9186b.p9190c;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.b.c.b */
/* compiled from: PG */
public final /* synthetic */ class C121307b implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C121307b f336889a = new C121307b();

    private /* synthetic */ C121307b() {
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
