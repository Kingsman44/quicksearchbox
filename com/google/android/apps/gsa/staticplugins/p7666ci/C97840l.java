package com.google.android.apps.gsa.staticplugins.p7666ci;

import android.content.ComponentName;
import com.google.common.p4526f.C59071e;
import java.util.Set;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.l */
/* compiled from: PG */
public final /* synthetic */ class C97840l implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Set f273207a;

    public /* synthetic */ C97840l(Set set) {
        this.f273207a = set;
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
        Set set = this.f273207a;
        C59071e eVar = C97846r.f273217a;
        return !set.contains(((ComponentName) obj).getPackageName());
    }
}
