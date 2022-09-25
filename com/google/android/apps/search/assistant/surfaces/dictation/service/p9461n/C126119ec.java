package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.ec */
/* compiled from: PG */
public final /* synthetic */ class C126119ec implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C126119ec f347550a = new C126119ec();

    private /* synthetic */ C126119ec() {
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
