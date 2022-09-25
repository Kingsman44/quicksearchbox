package com.google.android.libraries.assistant.pcp.p1557g.p1561c.p1562a;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.pcp.g.c.a.ac */
/* compiled from: PG */
public final /* synthetic */ class C18722ac implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C18722ac f52802a = new C18722ac();

    private /* synthetic */ C18722ac() {
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
        return ((Optional) obj).isPresent();
    }
}
