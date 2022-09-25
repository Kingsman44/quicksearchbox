package com.google.android.apps.search.googleapp.p10370p;

import com.google.android.libraries.search.logging.p3034a.C38768q;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protos.p5145v.C65913q;
import com.google.protos.p5145v.C65916t;
import com.google.protos.p5145v.C65917u;
import com.google.protos.p5145v.C65918v;
import com.google.protos.p5145v.C65921y;
import java.util.List;

/* renamed from: com.google.android.apps.search.googleapp.p.ai */
/* compiled from: PG */
public final /* synthetic */ class C136842ai implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C136848ao f372466a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f372467b;

    public /* synthetic */ C136842ai(C136848ao aoVar, C58485gu guVar) {
        this.f372466a = aoVar;
        this.f372467b = guVar;
    }

    public final C60870cx apply(Object obj) {
        C136848ao aoVar = this.f372466a;
        C58485gu guVar = this.f372467b;
        C65913q qVar = (C65913q) obj;
        if (!aoVar.f372485k || qVar != C65913q.NO_ACTIVITY) {
            C38768q qVar2 = (C38768q) aoVar.f372481g.mo17428b();
            C62940bt btVar = C65917u.f179262d;
            C65916t tVar = (C65916t) C65917u.f179261c.createBuilder();
            C65918v vVar = (C65918v) C65921y.f179280b.createBuilder();
            vVar.copyOnWrite();
            C65921y yVar = (C65921y) vVar.instance;
            C62971cq cqVar = yVar.f179282a;
            if (!cqVar.mo58948c()) {
                yVar.f179282a = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) guVar, (List) yVar.f179282a);
            C65921y yVar2 = (C65921y) vVar.build();
            tVar.copyOnWrite();
            C65917u uVar = (C65917u) tVar.instance;
            yVar2.getClass();
            uVar.f179265b = yVar2;
            uVar.f179264a |= 1;
            qVar2.mo41589a(btVar, (C65917u) tVar.build());
        } else {
            ((C59052c) ((C59052c) C136848ao.f372475a.mo56224b()).mo56372aa(40688)).mo56386p("#logGrowthTrackingUsageInfo account not active, usege info not logged");
        }
        return C60866ct.f164955a;
    }
}
