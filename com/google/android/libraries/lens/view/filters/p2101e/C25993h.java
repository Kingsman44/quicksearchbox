package com.google.android.libraries.lens.view.filters.p2101e;

import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25980d;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25981e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.filters.e.h */
/* compiled from: PG */
public final /* synthetic */ class C25993h implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C25980d f70647a;

    public /* synthetic */ C25993h(C25980d dVar) {
        this.f70647a = dVar;
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
        return ((C25981e) obj).mo31185d().equals(this.f70647a);
    }
}
