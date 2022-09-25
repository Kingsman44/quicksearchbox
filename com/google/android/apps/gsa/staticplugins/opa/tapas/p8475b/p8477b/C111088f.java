package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8477b;

import android.content.pm.ApplicationInfo;
import com.google.common.base.C58837ba;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.b.f */
/* compiled from: PG */
public final /* synthetic */ class C111088f implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C111090h f309317a;

    public /* synthetic */ C111088f(C111090h hVar) {
        this.f309317a = hVar;
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
        ApplicationInfo applicationInfo = (ApplicationInfo) obj;
        return applicationInfo != null && !C58837ba.m90859h(applicationInfo.packageName) && applicationInfo.enabled && this.f309317a.f309320b.mo99856o(applicationInfo);
    }
}
