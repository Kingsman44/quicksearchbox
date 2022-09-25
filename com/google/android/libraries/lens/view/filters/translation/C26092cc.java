package com.google.android.libraries.lens.view.filters.translation;

import com.google.android.libraries.lens.view.p2069am.C25327c;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.cc */
/* compiled from: PG */
public final /* synthetic */ class C26092cc implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C26092cc f70904a = new C26092cc();

    private /* synthetic */ C26092cc() {
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
        return ((C25327c) obj).equals(C25327c.DOWNLOADED);
    }
}
