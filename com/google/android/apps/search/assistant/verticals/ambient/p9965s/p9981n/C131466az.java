package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9981n;

import com.google.android.apps.gsa.opa.smartspace.p6455d.C83778u;
import p3186j$.time.Instant;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.n.az */
/* compiled from: PG */
public final /* synthetic */ class C131466az implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Instant f359299a;

    public /* synthetic */ C131466az(Instant instant) {
        this.f359299a = instant;
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
        return Instant.ofEpochMilli(((C83778u) obj).f228349i).isAfter(this.f359299a);
    }
}
