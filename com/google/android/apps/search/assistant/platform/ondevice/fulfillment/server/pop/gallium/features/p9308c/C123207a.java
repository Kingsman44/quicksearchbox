package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.p9308c;

import com.google.assistant.p3825an.p3830c.p3831a.C49330g;
import java.util.List;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.c.a */
/* compiled from: PG */
public final /* synthetic */ class C123207a implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ List f340915a;

    public /* synthetic */ C123207a(List list) {
        this.f340915a = list;
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
        return this.f340915a.contains(((C49330g) obj).f127491b);
    }
}
