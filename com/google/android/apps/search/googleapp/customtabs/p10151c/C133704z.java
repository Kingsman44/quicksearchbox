package com.google.android.apps.search.googleapp.customtabs.p10151c;

import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.c.z */
/* compiled from: PG */
public final /* synthetic */ class C133704z implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f364180a;

    public /* synthetic */ C133704z(String str) {
        this.f364180a = str;
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
        String str = this.f364180a;
        C59071e eVar = C133678ac.f364122a;
        return ((C133675a) obj).f364119f.equals(str);
    }
}
