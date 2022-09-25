package com.google.android.libraries.assistant.auto.ondevice.p713e;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.e.k */
/* compiled from: PG */
public final /* synthetic */ class C11895k implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ long f38260a;

    public /* synthetic */ C11895k(long j) {
        this.f38260a = j;
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
        long j = this.f38260a;
        int i = C11896l.f38261d;
        return ((C11903s) obj).f38279a == j;
    }
}
