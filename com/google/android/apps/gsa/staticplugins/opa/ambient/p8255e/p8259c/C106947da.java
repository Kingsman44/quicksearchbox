package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.da */
/* compiled from: PG */
public final /* synthetic */ class C106947da implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C106947da f297896a = new C106947da();

    private /* synthetic */ C106947da() {
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
        return ((Map) obj).containsKey("com.google.android.apps.youtube.music.mediabrowser.user_has_premium_entitlement");
    }
}
