package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c;

import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.as */
/* compiled from: PG */
public final /* synthetic */ class C111951as implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C111951as f311020a = new C111951as();

    private /* synthetic */ C111951as() {
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
        return ((C60870cx) obj).isDone();
    }
}
