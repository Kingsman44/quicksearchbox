package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.p9941a;

import com.google.assistant.p3886c.p3887a.C50678n;
import p3186j$.time.Duration;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.b.a.ar */
/* compiled from: PG */
public final /* synthetic */ class C131004ar implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C131004ar f358402a = new C131004ar();

    private /* synthetic */ C131004ar() {
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
        return ((C50678n) obj).f131838b.size() > 0;
    }
}
