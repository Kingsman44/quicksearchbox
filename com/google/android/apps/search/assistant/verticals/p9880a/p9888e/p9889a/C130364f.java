package com.google.android.apps.search.assistant.verticals.p9880a.p9888e.p9889a;

import com.google.assistant.p3931f.p3939c.C52828e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.e.a.f */
/* compiled from: PG */
public final /* synthetic */ class C130364f implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C130364f f357285a = new C130364f();

    private /* synthetic */ C130364f() {
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
        return "messageMode".equals(((C52828e) obj).f138604a);
    }
}
