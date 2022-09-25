package com.google.android.apps.search.assistant.verticals.ambient.p9896a.p9898b;

import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9958a.C131195b;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.a.b.b */
/* compiled from: PG */
public final /* synthetic */ class C130482b implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C130482b f357458a = new C130482b();

    private /* synthetic */ C130482b() {
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
        int i = ((C131195b) obj).f358802a;
        return ((i & 4) == 0 || (i & 1) == 0 || (i & 8) == 0) ? false : true;
    }
}
