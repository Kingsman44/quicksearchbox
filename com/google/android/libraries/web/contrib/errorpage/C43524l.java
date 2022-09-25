package com.google.android.libraries.web.contrib.errorpage;

import com.google.android.libraries.web.p3353c.C43362g;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.web.contrib.errorpage.l */
/* compiled from: PG */
public final /* synthetic */ class C43524l implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C43525m f113644a;

    public /* synthetic */ C43524l(C43525m mVar) {
        this.f113644a = mVar;
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
        return this.f113644a.f113645a.test((C43362g) obj);
    }
}
