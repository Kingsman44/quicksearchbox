package com.google.android.libraries.search.assistant.p2828y.p2852m;

import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.y.m.b */
/* compiled from: PG */
public final /* synthetic */ class C37002b implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ long f96370a;

    public /* synthetic */ C37002b(long j) {
        this.f96370a = j;
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
        return (this.f96370a & ((Long) ((Map.Entry) obj).getKey()).longValue()) != 0;
    }
}
