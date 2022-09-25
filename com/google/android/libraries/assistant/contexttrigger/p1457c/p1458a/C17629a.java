package com.google.android.libraries.assistant.contexttrigger.p1457c.p1458a;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.c.a.a */
/* compiled from: PG */
public final /* synthetic */ class C17629a implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C17629a f50746a = new C17629a();

    private /* synthetic */ C17629a() {
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
