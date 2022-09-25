package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j;

import com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123976m;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.p4522b.C58495hd;
import com.google.protobuf.C63088z;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.j.l */
/* compiled from: PG */
public final /* synthetic */ class C131402l implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C131377ai f359205a;

    /* renamed from: b */
    public final /* synthetic */ C58495hd f359206b;

    public /* synthetic */ C131402l(C131377ai aiVar, C58495hd hdVar) {
        this.f359205a = aiVar;
        this.f359206b = hdVar;
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
        C131377ai aiVar = this.f359205a;
        C58495hd hdVar = this.f359206b;
        C123976m mVar = (C123976m) obj;
        C52568wo woVar = mVar.mo106207b().f137950f;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        C51012dc dcVar = woVar.f138004k;
        if (dcVar == null) {
            dcVar = C51012dc.f132813k;
        }
        C63088z zVar = (C63088z) hdVar.get(dcVar.f132817c);
        if (zVar != null && !zVar.mo59173M()) {
            mVar.mo106215j(zVar);
            return true;
        } else if (!dcVar.f132819e.mo59173M()) {
            return true;
        } else {
            aiVar.f359118a.mo41706u();
            return false;
        }
    }
}
