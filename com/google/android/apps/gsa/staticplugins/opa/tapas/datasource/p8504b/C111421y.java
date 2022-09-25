package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8504b;

import android.os.Process;
import com.android.launcher3.compat.UserHandleCompat;
import com.google.common.base.C58869cf;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.b.y */
/* compiled from: PG */
public final /* synthetic */ class C111421y implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C111421y f309992a = new C111421y();

    private /* synthetic */ C111421y() {
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
        UserHandleCompat userHandleCompat = (UserHandleCompat) obj;
        C58869cf cfVar = C111396ae.f309944a;
        return userHandleCompat.getUser() != null && !Process.myUserHandle().equals(userHandleCompat.getUser());
    }
}
