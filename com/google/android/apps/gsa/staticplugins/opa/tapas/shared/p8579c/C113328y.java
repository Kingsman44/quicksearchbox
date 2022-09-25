package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c;

import android.text.TextUtils;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.y */
/* compiled from: PG */
public final /* synthetic */ class C113328y implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C113328y f313852a = new C113328y();

    private /* synthetic */ C113328y() {
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
        return !TextUtils.isEmpty((String) obj);
    }
}
