package com.google.android.apps.gsa.staticplugins.opa.tapas.p8567o;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113291bp;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.function.Predicate;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.o.c */
/* compiled from: PG */
public final /* synthetic */ class C113001c implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C113023i f313171a;

    public /* synthetic */ C113001c(C113023i iVar) {
        this.f313171a = iVar;
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
        return !((List) Collection.EL.stream(((C113291bp) obj).f313754b).filter(new C113020f(this.f313171a)).collect(Collectors.toList())).isEmpty();
    }
}
