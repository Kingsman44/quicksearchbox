package com.google.android.libraries.lens.view.p2067ak;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.ak.cd */
/* compiled from: PG */
public final /* synthetic */ class C25252cd implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C25252cd f68715a = new C25252cd();

    private /* synthetic */ C25252cd() {
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
        return ((String) obj).startsWith("lens_hats_survey_shown_");
    }
}
