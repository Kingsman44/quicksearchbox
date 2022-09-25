package com.google.android.libraries.lens.view.gallery.p2111d;

import com.google.android.libraries.lens.view.gallery.data.C26403v;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.gallery.d.p */
/* compiled from: PG */
public final /* synthetic */ class C26370p implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C26370p f71727a = new C26370p();

    private /* synthetic */ C26370p() {
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
        C26403v vVar = (C26403v) obj;
        return !C26403v.f71834a.equals(vVar) && !C26403v.f71835b.equals(vVar) && !C26403v.f71836c.equals(vVar);
    }
}
