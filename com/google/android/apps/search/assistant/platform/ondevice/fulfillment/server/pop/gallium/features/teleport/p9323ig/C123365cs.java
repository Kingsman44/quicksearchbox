package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.cs */
/* compiled from: PG */
public final /* synthetic */ class C123365cs implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Set f341129a;

    public /* synthetic */ C123365cs(Set set) {
        this.f341129a = set;
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
        return Collection.EL.stream(this.f341129a).anyMatch(new C123349cc((C80047aa) obj));
    }
}
