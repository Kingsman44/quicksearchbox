package com.google.android.apps.search.googleapp.promomanager.p10372b;

import com.google.android.apps.search.googleapp.promomanager.p10374c.C137046o;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C63042fg;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63895ai;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63907au;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63915bb;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63921bh;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63923bj;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.cg */
/* compiled from: PG */
public final /* synthetic */ class C136979cg implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C137003dd f372791a;

    /* renamed from: b */
    public final /* synthetic */ C63915bb f372792b;

    /* renamed from: c */
    public final /* synthetic */ C137009dj f372793c;

    /* renamed from: d */
    public final /* synthetic */ C137046o f372794d;

    public /* synthetic */ C136979cg(C137003dd ddVar, C63915bb bbVar, C137009dj djVar, C137046o oVar) {
        this.f372791a = ddVar;
        this.f372792b = bbVar;
        this.f372793c = djVar;
        this.f372794d = oVar;
    }

    public final C60870cx apply(Object obj) {
        C137003dd ddVar = this.f372791a;
        C63915bb bbVar = this.f372792b;
        C137009dj djVar = this.f372793c;
        C137046o oVar = this.f372794d;
        if (!((C137007dh) obj).equals(C137007dh.f372869h)) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        C137020o oVar2 = ddVar.f372847j;
        C63042fg fgVar = djVar.f372883c;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        C63042fg fgVar2 = ((C136945b) oVar2.f372899c).f372706b;
        C63042fg fgVar3 = oVar.f372965b;
        if (fgVar3 == null) {
            fgVar3 = C63042fg.f170152c;
        }
        if (C137019n.m222705c(fgVar2, fgVar3)) {
            C63907au auVar = oVar.f372967d;
            if (auVar == null) {
                auVar = C63907au.f172809d;
            }
            C63895ai aiVar = auVar.f172811a;
            if (aiVar == null) {
                aiVar = C63895ai.f172768f;
            }
            oVar2.f372900d = aiVar;
            C63921bh bhVar = auVar.f172813c;
            if (bhVar == null) {
                bhVar = C63921bh.f172854b;
            }
            C63923bj bjVar = auVar.f172812b;
            if (bjVar == null) {
                bjVar = C63923bj.f172858c;
            }
            oVar2.f372899c = oVar2.mo113478a(bhVar, bjVar.f172861b, fgVar);
        }
        return oVar2.mo113479b(bbVar, djVar, fgVar, ((C136945b) oVar2.f372899c).f372705a);
    }
}
