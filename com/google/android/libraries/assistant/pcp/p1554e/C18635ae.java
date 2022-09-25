package com.google.android.libraries.assistant.pcp.p1554e;

import com.google.assistant.p3803ag.p3809c.C49050ep;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.pcp.e.ae */
/* compiled from: PG */
public final /* synthetic */ class C18635ae implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f52661a;

    public /* synthetic */ C18635ae(C58528ij ijVar) {
        this.f52661a = ijVar;
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
        return C18650at.m36108f(C18650at.m36106b((C49050ep) obj, this.f52661a));
    }
}
