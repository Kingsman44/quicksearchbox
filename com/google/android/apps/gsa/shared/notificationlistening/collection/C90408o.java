package com.google.android.apps.gsa.shared.notificationlistening.collection;

import com.google.android.apps.gsa.shared.notificationlistening.common.C90421b;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.o */
/* compiled from: PG */
public final /* synthetic */ class C90408o implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ boolean f252490a;

    public /* synthetic */ C90408o(boolean z) {
        this.f252490a = z;
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
        boolean z = this.f252490a;
        int i = C90409p.f252491a;
        return !C90418y.m147064a((C90421b) obj) || z;
    }
}
