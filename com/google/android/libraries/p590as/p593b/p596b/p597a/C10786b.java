package com.google.android.libraries.p590as.p593b.p596b.p597a;

import com.google.android.libraries.p590as.p593b.p596b.C10882h;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.Collection;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.as.b.b.a.b */
/* compiled from: PG */
public final /* synthetic */ class C10786b implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f35812a;

    public /* synthetic */ C10786b(C58528ij ijVar) {
        this.f35812a = ijVar;
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
        return Collection.EL.stream(this.f35812a).noneMatch(new C10793i((C10882h) obj));
    }
}
