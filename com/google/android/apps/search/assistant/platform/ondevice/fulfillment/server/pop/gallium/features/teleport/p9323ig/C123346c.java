package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.c */
/* compiled from: PG */
public final /* synthetic */ class C123346c implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C123454g f341109a;

    public /* synthetic */ C123346c(C123454g gVar) {
        this.f341109a = gVar;
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
        C123305am amVar = (C123305am) this.f341109a;
        C123305am amVar2 = (C123305am) C123454g.m202802c(aaVar.f219660d, aaVar.f219661e);
        return amVar.f341044a <= amVar2.f341044a && amVar2.f341045b <= amVar.f341045b;
    }
}
