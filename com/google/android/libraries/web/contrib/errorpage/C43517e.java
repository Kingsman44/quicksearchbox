package com.google.android.libraries.web.contrib.errorpage;

import com.google.android.libraries.web.p3353c.C43362g;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.web.contrib.errorpage.e */
/* compiled from: PG */
public final /* synthetic */ class C43517e implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Predicate f113637a;

    public /* synthetic */ C43517e(Predicate predicate) {
        this.f113637a = predicate;
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
        return this.f113637a.test(C43514b.m76780a((C43362g) obj));
    }
}
