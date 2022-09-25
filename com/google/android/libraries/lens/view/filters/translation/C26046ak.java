package com.google.android.libraries.lens.view.filters.translation;

import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.ak */
/* compiled from: PG */
public final /* synthetic */ class C26046ak implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C26046ak f70768a = new C26046ak();

    private /* synthetic */ C26046ak() {
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
        return C26059ax.f70785b.contains(((Map.Entry) obj).getValue());
    }
}
