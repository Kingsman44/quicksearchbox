package com.google.android.libraries.assistant.pcp.p1583o;

import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.pcp.o.e */
/* compiled from: PG */
public final /* synthetic */ class C19028e implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f53414a;

    public /* synthetic */ C19028e(C58528ij ijVar) {
        this.f53414a = ijVar;
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
        return this.f53414a.contains((C53306j) obj);
    }
}
