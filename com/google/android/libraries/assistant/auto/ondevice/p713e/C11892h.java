package com.google.android.libraries.assistant.auto.ondevice.p713e;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.e.h */
/* compiled from: PG */
public final /* synthetic */ class C11892h implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ long f38256a;

    public /* synthetic */ C11892h(long j) {
        this.f38256a = j;
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
        long j = this.f38256a;
        int i = C11896l.f38261d;
        return ((C11903s) obj).f38279a == j;
    }
}
