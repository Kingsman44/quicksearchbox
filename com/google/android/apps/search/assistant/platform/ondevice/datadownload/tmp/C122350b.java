package com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.b */
/* compiled from: PG */
public final /* synthetic */ class C122350b implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C122350b f339236a = new C122350b();

    private /* synthetic */ C122350b() {
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
