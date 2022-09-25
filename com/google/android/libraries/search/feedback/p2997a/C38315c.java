package com.google.android.libraries.search.feedback.p2997a;

import java.util.Map;
import p3186j$.util.Objects;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.feedback.a.c */
/* compiled from: PG */
public final /* synthetic */ class C38315c implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C38315c f101489a = new C38315c();

    private /* synthetic */ C38315c() {
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
        return Objects.nonNull((Map) obj);
    }
}
