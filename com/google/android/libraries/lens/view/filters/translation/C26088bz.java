package com.google.android.libraries.lens.view.filters.translation;

import com.google.android.libraries.lens.view.p2069am.C25327c;
import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.bz */
/* compiled from: PG */
public final /* synthetic */ class C26088bz implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Predicate f70898a;

    public /* synthetic */ C26088bz(Predicate predicate) {
        this.f70898a = predicate;
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
        return this.f70898a.test((C25327c) ((Map.Entry) obj).getValue());
    }
}
