package com.google.android.libraries.lens.view.filters.translation.languagepicker;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.languagepicker.ai */
/* compiled from: PG */
public final /* synthetic */ class C26140ai implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C26138ag f71043a;

    public /* synthetic */ C26140ai(C26138ag agVar) {
        this.f71043a = agVar;
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
        return C26146ao.m48285a((C26136ae) obj, ((C26180g) this.f71043a).f71133b) >= 0;
    }
}
