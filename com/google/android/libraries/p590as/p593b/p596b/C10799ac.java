package com.google.android.libraries.p590as.p593b.p596b;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.speech.p5218j.C66964g;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.function.BiPredicate;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.as.b.b.ac */
/* compiled from: PG */
public final /* synthetic */ class C10799ac implements BiPredicate {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f35830a;

    public /* synthetic */ C10799ac(C58485gu guVar) {
        this.f35830a = guVar;
    }

    public final /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
        return BiPredicate.CC.$default$and(this, biPredicate);
    }

    public final /* synthetic */ BiPredicate negate() {
        return BiPredicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ BiPredicate mo19296or(BiPredicate biPredicate) {
        return BiPredicate.CC.$default$or(this, biPredicate);
    }

    public final boolean test(Object obj, Object obj2) {
        C66964g gVar = (C66964g) obj;
        C58528ij ijVar = (C58528ij) obj2;
        Stream stream = Collection.EL.stream(this.f35830a);
        Objects.requireNonNull(ijVar);
        return stream.allMatch(new C10802af(ijVar));
    }
}
