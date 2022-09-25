package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.android.apps.gsa.nga.shared.p6274a.C80080z;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.cr */
/* compiled from: PG */
public final /* synthetic */ class C123364cr implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C123364cr f341128a = new C123364cr();

    private /* synthetic */ C123364cr() {
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
        C80047aa aaVar = (C80047aa) obj;
        int i = C123377dd.f341141a;
        C80080z a = C80080z.m128077a(aaVar.f219659c);
        if (a == null) {
            a = C80080z.UNRECOGNIZED;
        }
        if (a.equals(C80080z.APP)) {
            return true;
        }
        C80080z a2 = C80080z.m128077a(aaVar.f219659c);
        if (a2 == null) {
            a2 = C80080z.UNRECOGNIZED;
        }
        if (a2.equals(C80080z.URL)) {
            return true;
        }
        C80080z a3 = C80080z.m128077a(aaVar.f219659c);
        if (a3 == null) {
            a3 = C80080z.UNRECOGNIZED;
        }
        return a3.equals(C80080z.WEBREF);
    }
}
