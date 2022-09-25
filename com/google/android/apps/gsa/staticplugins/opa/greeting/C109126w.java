package com.google.android.apps.gsa.staticplugins.opa.greeting;

import com.google.common.p4526f.C59071e;
import java.util.Set;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.greeting.w */
/* compiled from: PG */
public final /* synthetic */ class C109126w implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f303887a;

    /* renamed from: b */
    public final /* synthetic */ Set f303888b;

    public /* synthetic */ C109126w(String str, Set set) {
        this.f303887a = str;
        this.f303888b = set;
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
        String str = this.f303887a;
        Set set = this.f303888b;
        String str2 = (String) obj;
        C59071e eVar = C109100ar.f303734a;
        return !str2.equals(str) && !set.contains(str2);
    }
}
