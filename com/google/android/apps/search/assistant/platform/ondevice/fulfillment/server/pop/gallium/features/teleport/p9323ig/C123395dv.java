package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.android.apps.gsa.nga.shared.p6274a.C80053ag;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.function.Predicate;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.dv */
/* compiled from: PG */
public final /* synthetic */ class C123395dv implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f341156a;

    public /* synthetic */ C123395dv(C58528ij ijVar) {
        this.f341156a = ijVar;
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
        C80053ag agVar;
        C58528ij ijVar = this.f341156a;
        C80047aa aaVar = (C80047aa) obj;
        if (aaVar.f219657a == 10) {
            agVar = (C80053ag) aaVar.f219658b;
        } else {
            agVar = C80053ag.f219675f;
        }
        Stream stream = Collection.EL.stream(agVar.f219679c);
        Objects.requireNonNull(ijVar);
        return stream.anyMatch(new C123394du(ijVar));
    }
}
