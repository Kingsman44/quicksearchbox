package com.google.android.apps.gsa.staticplugins.opa.p8365h.p8366a;

import android.app.ActivityManager;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.h.a.aa */
/* compiled from: PG */
public final /* synthetic */ class C109142aa implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C109142aa f303929a = new C109142aa();

    private /* synthetic */ C109142aa() {
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
        return "com.google.android.googlequicksearchbox:search".equals(((ActivityManager.RunningAppProcessInfo) obj).processName);
    }
}
