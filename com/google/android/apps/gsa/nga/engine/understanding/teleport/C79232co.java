package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.common.base.C58835az;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.co */
/* compiled from: PG */
public final /* synthetic */ class C79232co implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C80047aa f217702a;

    public /* synthetic */ C79232co(C80047aa aaVar) {
        this.f217702a = aaVar;
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
        C80047aa aaVar = this.f217702a;
        C79207bq bqVar = (C79207bq) obj;
        for (int i = 0; i < bqVar.f217675a.size(); i++) {
            if (bqVar.mo73828b(((C79309g) ((C58835az) bqVar.f217675a.get(i)).f156631a).mo73869b()) == aaVar.f219660d && bqVar.mo73828b(((C79309g) ((C58835az) bqVar.f217675a.get(i)).f156631a).mo73868a()) == aaVar.f219661e) {
                return true;
            }
        }
        return false;
    }
}
