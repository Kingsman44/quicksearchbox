package com.google.android.libraries.p590as.p593b.p596b;

import com.google.common.p4522b.C58528ij;
import com.google.protos.p4934ay.p4935a.p4936a.C64272b;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.as.b.b.af */
/* compiled from: PG */
public final /* synthetic */ class C10802af implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f35833a;

    public /* synthetic */ C10802af(C58528ij ijVar) {
        this.f35833a = ijVar;
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
        return this.f35833a.contains((C64272b) obj);
    }
}
