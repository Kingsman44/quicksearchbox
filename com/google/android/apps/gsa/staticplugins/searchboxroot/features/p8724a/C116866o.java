package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8724a;

import android.content.pm.ShortcutInfo;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.a.o */
/* compiled from: PG */
public final /* synthetic */ class C116866o implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C116866o f324347a = new C116866o();

    private /* synthetic */ C116866o() {
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
        return ((ShortcutInfo) obj).isEnabled();
    }
}
