package com.google.android.libraries.assistant.pcp.p1554e;

import com.google.assistant.p3803ag.p3809c.C49040ef;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.function.Predicate;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.assistant.pcp.e.ao */
/* compiled from: PG */
public final /* synthetic */ class C18645ao implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f52671a;

    public /* synthetic */ C18645ao(C58528ij ijVar) {
        this.f52671a = ijVar;
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
        C58528ij ijVar = this.f52671a;
        Stream map = Collection.EL.stream(((C49040ef) obj).f126840d).map(C18663n.f52695a);
        Objects.requireNonNull(ijVar);
        return map.anyMatch(new C18658i(ijVar));
    }
}
