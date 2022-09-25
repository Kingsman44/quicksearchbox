package com.google.android.libraries.lens.ondevice.p2031h;

import com.google.android.libraries.lens.ondevice.p2026f.p2029b.C24473a;
import com.google.android.libraries.lens.ondevice.p2037n.C24795f;
import com.google.android.libraries.lens.ondevice.p2037n.C24803n;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.Collections;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.libraries.lens.ondevice.h.i */
/* compiled from: PG */
public final /* synthetic */ class C24513i implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C24519o f67139a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f67140b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f67141c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f67142d;

    /* renamed from: e */
    public final /* synthetic */ C58528ij f67143e;

    /* renamed from: f */
    public final /* synthetic */ C24795f f67144f;

    public /* synthetic */ C24513i(C24519o oVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, C58528ij ijVar, C24795f fVar) {
        this.f67139a = oVar;
        this.f67140b = cxVar;
        this.f67141c = cxVar2;
        this.f67142d = cxVar3;
        this.f67143e = ijVar;
        this.f67144f = fVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C24519o oVar = this.f67139a;
        C60870cx cxVar = this.f67140b;
        C60870cx cxVar2 = this.f67141c;
        C60870cx cxVar3 = this.f67142d;
        C58528ij ijVar = this.f67143e;
        C24795f fVar = this.f67144f;
        C58838bb.m90883r(cxVar.isDone());
        C58838bb.m90883r(cxVar2.isDone());
        C58838bb.m90883r(cxVar3.isDone());
        C58495hd hdVar = (C58495hd) C60856cj.m92909r(cxVar3);
        C58800sl lA = hdVar.values().iterator();
        while (lA.hasNext()) {
            oVar.f67151b.putAll(Collections.unmodifiableMap(C24473a.m45546e((C24803n) lA.next()).f170861a));
        }
        try {
            C60856cj.m92909r(cxVar);
            C60856cj.m92909r(cxVar2);
            return oVar.f67155f.mo29998b(ijVar, hdVar, oVar.f67156g, fVar);
        } catch (ExecutionException unused) {
            return oVar.f67155f.mo29998b(ijVar, hdVar, oVar.f67156g, fVar);
        }
    }
}
