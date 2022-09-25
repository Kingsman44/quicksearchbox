package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8234b;

import android.content.pm.PackageItemInfo;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.b.c */
/* compiled from: PG */
public final /* synthetic */ class C106624c implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f297265a;

    public /* synthetic */ C106624c(String str) {
        this.f297265a = str;
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
        return ((PackageItemInfo) obj).packageName.equals(this.f297265a);
    }
}
