package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113291bp;
import p3186j$.util.Objects;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.bg */
/* compiled from: PG */
public final /* synthetic */ class C111869bg implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C111869bg f310864a = new C111869bg();

    private /* synthetic */ C111869bg() {
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
        return Objects.nonNull((C113291bp) obj);
    }
}
