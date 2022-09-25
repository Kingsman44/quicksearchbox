package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9186b.p9187a.p9188a;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.b.a.a.b */
/* compiled from: PG */
public final /* synthetic */ class C121289b implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C121289b f336862a = new C121289b();

    private /* synthetic */ C121289b() {
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
