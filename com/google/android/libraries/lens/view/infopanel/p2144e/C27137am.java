package com.google.android.libraries.lens.view.infopanel.p2144e;

import com.google.android.libraries.lens.view.filters.translation.C26059ax;
import com.google.android.libraries.lens.view.filters.translation.C26232z;
import java.util.Locale;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.infopanel.e.am */
/* compiled from: PG */
public final /* synthetic */ class C27137am implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C26059ax f74152a;

    public /* synthetic */ C27137am(C26059ax axVar) {
        this.f74152a = axVar;
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
        return this.f74152a.mo31267v((Locale) obj, C26232z.f71278a);
    }
}
