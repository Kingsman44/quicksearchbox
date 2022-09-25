package com.google.android.libraries.web.weblayer.contrib.p3452a;

import java.util.List;
import org.chromium.weblayer.C72587aw;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.web.weblayer.contrib.a.g */
/* compiled from: PG */
public final /* synthetic */ class C44149g implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ List f114888a;

    public /* synthetic */ C44149g(List list) {
        this.f114888a = list;
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
        return !this.f114888a.contains(((C72587aw) obj).f193121c);
    }
}
