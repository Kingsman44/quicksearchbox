package com.google.android.apps.search.googleapp.promomanager.p10372b;

import android.content.pm.ShortcutInfo;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.z */
/* compiled from: PG */
public final /* synthetic */ class C137031z implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C137031z f372923a = new C137031z();

    private /* synthetic */ C137031z() {
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
        return ((ShortcutInfo) obj).getId().startsWith("Weather");
    }
}
