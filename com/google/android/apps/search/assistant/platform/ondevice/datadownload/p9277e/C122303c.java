package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9277e;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.e.c */
/* compiled from: PG */
public final /* synthetic */ class C122303c implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C122303c f339152a = new C122303c();

    private /* synthetic */ C122303c() {
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
