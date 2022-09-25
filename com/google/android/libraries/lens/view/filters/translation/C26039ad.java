package com.google.android.libraries.lens.view.filters.translation;

import java.util.Locale;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.ad */
/* compiled from: PG */
public final /* synthetic */ class C26039ad implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C26059ax f70760a;

    public /* synthetic */ C26039ad(C26059ax axVar) {
        this.f70760a = axVar;
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
        C26059ax axVar = this.f70760a;
        Locale locale = (Locale) obj;
        return !locale.equals(axVar.f70827q.mo3842a()) && !locale.equals(axVar.mo31249d());
    }
}
