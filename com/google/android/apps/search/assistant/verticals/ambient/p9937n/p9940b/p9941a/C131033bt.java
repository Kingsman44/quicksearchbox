package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.p9941a;

import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130701b;
import p3186j$.time.Duration;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.b.a.bt */
/* compiled from: PG */
public final /* synthetic */ class C131033bt implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f358443a;

    public /* synthetic */ C131033bt(String str) {
        this.f358443a = str;
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
        String str = this.f358443a;
        Duration duration = C131043cc.f358455a;
        return ((C130701b) obj).mo109797h().equals(str);
    }
}
