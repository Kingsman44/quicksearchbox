package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.cp */
/* compiled from: PG */
public final /* synthetic */ class C123362cp implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Set f341126a;

    public /* synthetic */ C123362cp(Set set) {
        this.f341126a = set;
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
        return Collection.EL.stream(this.f341126a).anyMatch(new C123350cd((String) obj));
    }
}
