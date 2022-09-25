package com.google.android.libraries.search.assistant.notification.p2709a.p2710a;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.notification.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C34838a implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C34838a f92407a = new C34838a();

    private /* synthetic */ C34838a() {
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
