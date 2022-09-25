package com.google.android.apps.search.assistant.verticals.ambient.p9928j;

import android.content.pm.PackageManager;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.j.f */
/* compiled from: PG */
public final /* synthetic */ class C130819f implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C130820g f358060a;

    public /* synthetic */ C130819f(C130820g gVar) {
        this.f358060a = gVar;
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
        try {
            this.f358060a.f358063c.getPackageManager().getApplicationInfo((String) obj, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
