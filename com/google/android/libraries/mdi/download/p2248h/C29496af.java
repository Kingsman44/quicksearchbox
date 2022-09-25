package com.google.android.libraries.mdi.download.p2248h;

import com.google.android.libraries.mdi.download.C28708an;
import com.google.android.libraries.mdi.download.C28725bc;
import com.google.android.libraries.mdi.download.C28728bf;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.p2257l.C29670b;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.mdi.download.h.af */
/* compiled from: PG */
public final /* synthetic */ class C29496af implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29514ax f79925a;

    /* renamed from: b */
    public final /* synthetic */ C29409fd f79926b;

    public /* synthetic */ C29496af(C29514ax axVar, C29409fd fdVar) {
        this.f79925a = axVar;
        this.f79926b = fdVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C28728bf bfVar = (C28728bf) obj;
        C29494ad adVar = new C29494ad(this.f79926b, this.f79925a.f79985e, C58485gu.m89845m());
        if (adVar.f79923b.mo56113h()) {
            cxVar = ((C29495ae) adVar.f79923b.mo56107c()).mo19281a(C29494ad.m54458a(bfVar));
        } else {
            ArrayList arrayList = new ArrayList();
            for (C28725bc bcVar : C29494ad.m54458a(bfVar).f78046b) {
                C28708an anVar = bcVar.f78038c;
                if (anVar == null) {
                    anVar = C28708an.f77994l;
                }
                arrayList.add(anVar);
            }
            cxVar = C60856cj.m92900i(arrayList);
        }
        C29670b g = C29670b.m54719g(cxVar);
        Objects.requireNonNull(adVar);
        return g.mo34822i(new C29491aa(adVar), C60826bg.f164896a);
    }
}
