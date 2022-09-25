package com.google.android.libraries.appactions.serviceengine.p11037a;

import android.content.pm.ApplicationInfo;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.appactions.serviceengine.a.b */
/* compiled from: PG */
public final /* synthetic */ class C147864b implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C147864b f398891a = new C147864b();

    private /* synthetic */ C147864b() {
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
        return ((ApplicationInfo) obj).icon != 0;
    }
}
