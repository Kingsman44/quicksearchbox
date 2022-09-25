package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.p9941a;

import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130701b;
import p3186j$.time.Duration;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.b.a.ak */
/* compiled from: PG */
public final /* synthetic */ class C130997ak implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C130997ak f358395a = new C130997ak();

    private /* synthetic */ C130997ak() {
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
        Duration duration = C131043cc.f358455a;
        return ((C130701b) obj).mo109795f().isPresent();
    }
}
