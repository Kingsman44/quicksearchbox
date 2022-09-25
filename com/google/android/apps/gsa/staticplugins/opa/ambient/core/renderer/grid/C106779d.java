package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.grid;

import android.util.Pair;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.grid.d */
/* compiled from: PG */
public final /* synthetic */ class C106779d implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C106779d f297565a = new C106779d();

    private /* synthetic */ C106779d() {
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
        return ((Optional) ((Pair) obj).second).isPresent();
    }
}
