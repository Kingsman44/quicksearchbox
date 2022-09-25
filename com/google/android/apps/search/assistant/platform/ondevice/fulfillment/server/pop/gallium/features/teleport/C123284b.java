package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport;

import com.google.knowledge.p4661a.p4662a.C61746h;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.b */
/* compiled from: PG */
public final /* synthetic */ class C123284b implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C123284b f341015a = new C123284b();

    private /* synthetic */ C123284b() {
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
        int i = C123522k.f341328b;
        return ((C61746h) obj).f166796d.equals("isAssistedBrowse");
    }
}
