package com.google.android.libraries.assistant.auto.tng.media.mediabrowser.p1064c;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.mediabrowser.c.c */
/* compiled from: PG */
public final /* synthetic */ class C14031c implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C14031c f42647a = new C14031c();

    private /* synthetic */ C14031c() {
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
