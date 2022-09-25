package com.google.android.libraries.lens.view.p2133i;

import com.google.android.libraries.lens.view.p2133i.p2134a.C26897b;
import com.google.android.libraries.lens.view.p2133i.p2136c.C26916l;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.i.k */
/* compiled from: PG */
public final /* synthetic */ class C26926k implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C26926k f73366a = new C26926k();

    private /* synthetic */ C26926k() {
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
        return ((C26916l) obj).mo32288a() != C26897b.SENDING;
    }
}
