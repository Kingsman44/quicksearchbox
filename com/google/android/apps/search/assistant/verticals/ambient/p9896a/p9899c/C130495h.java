package com.google.android.apps.search.assistant.verticals.ambient.p9896a.p9899c;

import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.a.c.h */
/* compiled from: PG */
public final /* synthetic */ class C130495h implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C130495h f357486a = new C130495h();

    private /* synthetic */ C130495h() {
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
        return Objects.nonNull((Optional) obj);
    }
}
