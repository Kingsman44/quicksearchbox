package com.google.android.apps.gsa.nga.shared.p6407v.p6414f.p6415a;

import android.app.ActivityManager;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.f.a.a */
/* compiled from: PG */
public final /* synthetic */ class C83218a implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C83218a f226841a = new C83218a();

    private /* synthetic */ C83218a() {
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
        return ((ActivityManager.RunningAppProcessInfo) obj).processName.equals("com.google.android.googlequicksearchbox:search");
    }
}
