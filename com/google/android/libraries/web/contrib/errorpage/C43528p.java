package com.google.android.libraries.web.contrib.errorpage;

import com.google.common.p4522b.C58528ij;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.web.contrib.errorpage.p */
/* compiled from: PG */
public final /* synthetic */ class C43528p implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f113655a;

    public /* synthetic */ C43528p(C58528ij ijVar) {
        this.f113655a = ijVar;
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
        return this.f113655a.contains((C43514b) obj);
    }
}
