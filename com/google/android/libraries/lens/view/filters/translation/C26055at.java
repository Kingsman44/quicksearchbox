package com.google.android.libraries.lens.view.filters.translation;

import java.util.Locale;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.at */
/* compiled from: PG */
public final /* synthetic */ class C26055at implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Locale f70778a;

    public /* synthetic */ C26055at(Locale locale) {
        this.f70778a = locale;
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
        return !((Locale) obj).equals(this.f70778a);
    }
}
