package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel.r */
/* compiled from: PG */
public final /* synthetic */ class C106838r implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C106838r f297713a = new C106838r();

    private /* synthetic */ C106838r() {
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
        return ((Optional) obj).isPresent();
    }
}
