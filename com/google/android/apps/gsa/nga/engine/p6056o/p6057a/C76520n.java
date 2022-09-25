package com.google.android.apps.gsa.nga.engine.p6056o.p6057a;

import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.understanding.C78983aj;
import com.google.android.apps.gsa.nga.engine.understanding.C79330v;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80513b;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90048d;
import com.google.knowledge.p4661a.p4662a.C61752n;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.a.n */
/* compiled from: PG */
public final /* synthetic */ class C76520n implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C76524r f211741a;

    /* renamed from: b */
    public final /* synthetic */ C78983aj f211742b;

    public /* synthetic */ C76520n(C76524r rVar, C78983aj ajVar) {
        this.f211741a = rVar;
        this.f211742b = ajVar;
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
        C76524r rVar = this.f211741a;
        C78983aj ajVar = this.f211742b;
        C76591c cVar = (C76591c) obj;
        if (rVar.f211750c.mo85405j(C90014bt.f247382gB) && C76524r.f211748a.contains(cVar.mo71711a().mo72253e().orElse(null))) {
            return false;
        }
        C61752n nVar = ((C80513b) ajVar.mo73747b().get()).f221016a;
        if (nVar == null) {
            nVar = C61752n.f166808f;
        }
        C90048d dVar = (C90048d) cVar.mo71711a().mo72251c().get(C79330v.m127277b(nVar.f166811b));
        if (dVar == null) {
            return true;
        }
        return rVar.f211750c.mo85405j(dVar);
    }
}
