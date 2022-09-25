package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import com.google.common.p4522b.C58485gu;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.t */
/* compiled from: PG */
public final /* synthetic */ class C124134t implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f342822a;

    public /* synthetic */ C124134t(C58485gu guVar) {
        this.f342822a = guVar;
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
        return this.f342822a.contains((Integer) obj);
    }
}
