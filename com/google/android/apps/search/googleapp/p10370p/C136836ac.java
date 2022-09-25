package com.google.android.apps.search.googleapp.p10370p;

import com.google.common.p4526f.C59071e;
import p3186j$.time.Instant;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.googleapp.p.ac */
/* compiled from: PG */
public final /* synthetic */ class C136836ac implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Instant f372458a;

    public /* synthetic */ C136836ac(Instant instant) {
        this.f372458a = instant;
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
        Instant instant = this.f372458a;
        C59071e eVar = C136848ao.f372475a;
        return Instant.ofEpochMilli(((Long) obj).longValue()).isBefore(instant);
    }
}
