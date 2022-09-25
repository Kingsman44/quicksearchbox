package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9970e;

import android.content.pm.PackageManager;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.e.b */
/* compiled from: PG */
public final /* synthetic */ class C131305b implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C131311h f358981a;

    public /* synthetic */ C131305b(C131311h hVar) {
        this.f358981a = hVar;
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
            this.f358981a.f358991b.getPackageManager().getApplicationInfo((String) obj, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
