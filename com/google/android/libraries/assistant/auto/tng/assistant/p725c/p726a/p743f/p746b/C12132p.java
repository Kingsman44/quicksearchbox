package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p746b;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.f.b.p */
/* compiled from: PG */
public final /* synthetic */ class C12132p implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ int f38783a;

    public /* synthetic */ C12132p(int i) {
        this.f38783a = i;
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
        int i = this.f38783a;
        C12133q qVar = C12133q.AMR_MONO;
        return ((C12133q) obj).f38790f != i;
    }
}
