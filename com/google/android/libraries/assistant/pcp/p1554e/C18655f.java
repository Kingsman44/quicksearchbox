package com.google.android.libraries.assistant.pcp.p1554e;

import com.google.assistant.p3803ag.p3809c.C49039ee;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.pcp.e.f */
/* compiled from: PG */
public final /* synthetic */ class C18655f implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f52686a;

    public /* synthetic */ C18655f(C58528ij ijVar) {
        this.f52686a = ijVar;
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
        return this.f52686a.contains(((C49039ee) obj).f126832a);
    }
}
