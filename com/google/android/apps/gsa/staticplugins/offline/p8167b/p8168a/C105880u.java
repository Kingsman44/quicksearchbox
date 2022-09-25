package com.google.android.apps.gsa.staticplugins.offline.p8167b.p8168a;

import java.util.Locale;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.offline.b.a.u */
/* compiled from: PG */
public final /* synthetic */ class C105880u implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Locale f295514a;

    public /* synthetic */ C105880u(Locale locale) {
        this.f295514a = locale;
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
        return Locale.forLanguageTag((String) obj).equals(this.f295514a);
    }
}
