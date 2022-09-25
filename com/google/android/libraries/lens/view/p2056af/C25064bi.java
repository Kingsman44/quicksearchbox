package com.google.android.libraries.lens.view.p2056af;

import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.acw;
import com.google.common.p4552o.ade;
import com.google.common.p4552o.adj;
import com.google.common.p4552o.adl;
import com.google.common.p4552o.adm;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.lens.view.af.bi */
/* compiled from: PG */
public final /* synthetic */ class C25064bi implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f68309a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f68310b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f68311c;

    public /* synthetic */ C25064bi(C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f68309a = cxVar;
        this.f68310b = cxVar2;
        this.f68311c = cxVar3;
    }

    public final Object call() {
        C60870cx cxVar = this.f68309a;
        C60870cx cxVar2 = this.f68310b;
        C60870cx cxVar3 = this.f68311c;
        C58974d dVar = C25068bm.f68315a;
        acw acw = (acw) adm.f158382e.createBuilder();
        adj adj = (adj) C60856cj.m92909r(cxVar);
        acw.copyOnWrite();
        adm adm = (adm) acw.instance;
        adj.getClass();
        adm.f158385b = adj;
        adm.f158384a |= 1;
        ade ade = (ade) C60856cj.m92909r(cxVar2);
        acw.copyOnWrite();
        adm adm2 = (adm) acw.instance;
        ade.getClass();
        adm2.f158386c = ade;
        adm2.f158384a |= 2;
        adl adl = (adl) C60856cj.m92909r(cxVar3);
        acw.copyOnWrite();
        adm adm3 = (adm) acw.instance;
        adl.getClass();
        adm3.f158387d = adl;
        adm3.f158384a |= 8;
        return (adm) acw.build();
    }
}
