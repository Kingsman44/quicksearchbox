package com.google.android.libraries.lens.view.p2152n;

import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.n.c */
/* compiled from: PG */
public final /* synthetic */ class C27450c implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C27450c f75097a = new C27450c();

    private /* synthetic */ C27450c() {
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
        return ((C60870cx) obj).isDone();
    }
}
