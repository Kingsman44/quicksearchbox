package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel;

import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.C106740b;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.pcp.C106818o;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel.h */
/* compiled from: PG */
public final /* synthetic */ class C106828h implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C106828h f297700a = new C106828h();

    private /* synthetic */ C106828h() {
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
        return ((C106740b) obj) instanceof C106818o;
    }
}
