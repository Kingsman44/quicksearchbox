package com.google.android.apps.search.assistant.verticals.p9880a.p9888e.p9889a;

import com.google.assistant.p3781ad.p3789d.p3791b.C48734p;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.e.a.c */
/* compiled from: PG */
public final /* synthetic */ class C130361c implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f357282a;

    public /* synthetic */ C130361c(String str) {
        this.f357282a = str;
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
        return ((C48734p) obj).f126114h.equals(this.f357282a);
    }
}
