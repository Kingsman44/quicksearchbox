package com.google.android.apps.search.googleapp.promomanager.p10372b.p10373a;

import android.content.pm.ShortcutInfo;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.a.s */
/* compiled from: PG */
public final /* synthetic */ class C136917s implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C136917s f372646a = new C136917s();

    private /* synthetic */ C136917s() {
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
        int i = C136918t.f372647a;
        return ((ShortcutInfo) obj).getId().startsWith("Weather");
    }
}
