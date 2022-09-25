package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.ei */
/* compiled from: PG */
public final /* synthetic */ class C123409ei implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C80047aa f341172a;

    public /* synthetic */ C123409ei(C80047aa aaVar) {
        this.f341172a = aaVar;
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
        C80047aa aaVar = this.f341172a;
        C123381dh dhVar = (C123381dh) obj;
        int i = 0;
        while (true) {
            C58485gu guVar = dhVar.f341146a;
            if (i >= ((C58724pq) guVar).f156474d) {
                return false;
            }
            if (dhVar.mo105994b(((C123380dg) guVar.get(i)).mo105963a().mo105932b()) == aaVar.f219660d && dhVar.mo105994b(((C123380dg) dhVar.f341146a.get(i)).mo105963a().mo105931a()) == aaVar.f219661e) {
                return true;
            }
            i++;
        }
    }
}
