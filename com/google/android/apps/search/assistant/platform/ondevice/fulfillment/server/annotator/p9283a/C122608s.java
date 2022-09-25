package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.p9283a;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.a.s */
/* compiled from: PG */
public final /* synthetic */ class C122608s implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C122608s f339779a = new C122608s();

    private /* synthetic */ C122608s() {
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
