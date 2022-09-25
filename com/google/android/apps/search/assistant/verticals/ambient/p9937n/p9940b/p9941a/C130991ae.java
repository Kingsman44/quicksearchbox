package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.p9941a;

import com.google.assistant.p3886c.p3887a.C50682r;
import p3186j$.time.Instant;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.b.a.ae */
/* compiled from: PG */
public final /* synthetic */ class C130991ae implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Instant f358382a;

    public /* synthetic */ C130991ae(Instant instant) {
        this.f358382a = instant;
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
        return Instant.ofEpochMilli(((C50682r) obj).f131857c).isAfter(this.f358382a);
    }
}
