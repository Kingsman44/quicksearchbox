package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p768a.p770b;

import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.a.b.e */
/* compiled from: PG */
public final /* synthetic */ class C12208e implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f38925a;

    public /* synthetic */ C12208e(C58528ij ijVar) {
        this.f38925a = ijVar;
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
        return this.f38925a.contains(((C52232kc) obj).f137065b);
    }
}
