package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8504b;

import com.android.launcher3.compat.LauncherActivityInfoCompat;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113178ci;
import com.google.common.base.C58869cf;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.b.aa */
/* compiled from: PG */
public final /* synthetic */ class C111392aa implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C111392aa f309938a = new C111392aa();

    private /* synthetic */ C111392aa() {
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
        C58869cf cfVar = C111396ae.f309944a;
        return C113178ci.m187199b(((LauncherActivityInfoCompat) obj).getComponentName().getPackageName());
    }
}
