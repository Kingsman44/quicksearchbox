package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9989r;

import android.content.pm.PackageManager;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.r.a */
/* compiled from: PG */
public final /* synthetic */ class C131540a implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C131545f f359419a;

    public /* synthetic */ C131540a(C131545f fVar) {
        this.f359419a = fVar;
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
            this.f359419a.f359424a.getPackageManager().getApplicationInfo((String) obj, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
