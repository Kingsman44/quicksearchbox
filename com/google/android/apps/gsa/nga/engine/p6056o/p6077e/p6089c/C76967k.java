package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6089c;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.c.k */
/* compiled from: PG */
public final /* synthetic */ class C76967k implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C76974r f212485a;

    public /* synthetic */ C76967k(C76974r rVar) {
        this.f212485a = rVar;
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
        ActivityInfo activityInfo;
        ResolveInfo resolveActivity = this.f212485a.f212490a.resolveActivity((Intent) obj, 0);
        if (resolveActivity == null || (activityInfo = resolveActivity.activityInfo) == null || activityInfo.packageName == null || activityInfo.name == null) {
            return false;
        }
        return true;
    }
}
