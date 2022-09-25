package com.google.android.libraries.p10915aa.p10920b;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.aa.b.am */
/* compiled from: PG */
public final /* synthetic */ class C146665am implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C146672at f396098a;

    /* renamed from: b */
    public final /* synthetic */ Optional f396099b;

    public /* synthetic */ C146665am(C146672at atVar, Optional optional) {
        this.f396098a = atVar;
        this.f396099b = optional;
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
        return ((C146668ap) obj).mo123450g(this.f396098a, this.f396099b);
    }
}
