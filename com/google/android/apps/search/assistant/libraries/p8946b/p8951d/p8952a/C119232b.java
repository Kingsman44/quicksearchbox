package com.google.android.apps.search.assistant.libraries.p8946b.p8951d.p8952a;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.libraries.b.d.a.b */
/* compiled from: PG */
public final /* synthetic */ class C119232b implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C119232b f332513a = new C119232b();

    private /* synthetic */ C119232b() {
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
