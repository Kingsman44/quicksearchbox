package com.google.android.apps.search.googleapp.p10117aa;

import com.google.apps.tiktok.dataservice.C46690ah;
import java.util.Set;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.googleapp.aa.ae */
/* compiled from: PG */
public final /* synthetic */ class C133087ae implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Set f362852a;

    public /* synthetic */ C133087ae(Set set) {
        this.f362852a = set;
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
        Set set = this.f362852a;
        C46690ah ahVar = C133103au.f362875a;
        return !set.contains(((C133125j) obj).f362925e);
    }
}
