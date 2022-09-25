package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m;

import android.content.pm.ShortcutInfo;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.m.t */
/* compiled from: PG */
public final /* synthetic */ class C111595t implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f310330a;

    public /* synthetic */ C111595t(C58528ij ijVar) {
        this.f310330a = ijVar;
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
        ShortcutInfo shortcutInfo = (ShortcutInfo) obj;
        return shortcutInfo.isDynamic() || !this.f310330a.contains(shortcutInfo.getPackage());
    }
}
