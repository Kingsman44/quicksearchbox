package com.google.android.libraries.search.assistant.p2786t.p2790b.p2796f;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.t.b.f.h */
/* compiled from: PG */
public final /* synthetic */ class C36512h implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C36512h f95282a = new C36512h();

    private /* synthetic */ C36512h() {
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
