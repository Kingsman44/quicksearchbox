package com.google.android.apps.gsa.staticplugins.p7887eb;

import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.eb.z */
/* compiled from: PG */
public final /* synthetic */ class C100380z implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C100380z f280675a = new C100380z();

    private /* synthetic */ C100380z() {
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
        return ((Boolean) ((Map.Entry) obj).getValue()).booleanValue();
    }
}
