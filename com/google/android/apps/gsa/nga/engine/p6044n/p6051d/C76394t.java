package com.google.android.apps.gsa.nga.engine.p6044n.p6051d;

import android.content.Intent;
import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.assistant.p3897e.p3921j.C51809dy;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.d.t */
/* compiled from: PG */
public final /* synthetic */ class C76394t implements Predicate {
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
        C51809dy dyVar = (C51809dy) obj;
        if (!C76396v.f211535a.contains(dyVar.f135936b)) {
            return false;
        }
        if ("provider.OPEN".equals(dyVar.f135936b)) {
            Optional t = t.t(dyVar);
            if (t.isPresent()) {
                return ((Intent) t.get()).getBooleanExtra("handled_by_nga", false);
            }
        }
        return true;
    }
}
