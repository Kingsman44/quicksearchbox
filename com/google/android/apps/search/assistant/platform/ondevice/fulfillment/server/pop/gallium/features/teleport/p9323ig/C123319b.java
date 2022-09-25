package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.android.apps.gsa.nga.shared.p6274a.C80080z;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.b */
/* compiled from: PG */
public final /* synthetic */ class C123319b implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C123319b f341071a = new C123319b();

    private /* synthetic */ C123319b() {
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
        C80080z a = C80080z.m128077a(((C80047aa) obj).f219659c);
        if (a == null) {
            a = C80080z.UNRECOGNIZED;
        }
        return a.equals(C80080z.WEBREF);
    }
}
