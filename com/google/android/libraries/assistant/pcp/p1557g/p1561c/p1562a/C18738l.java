package com.google.android.libraries.assistant.pcp.p1557g.p1561c.p1562a;

import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.pcp.g.c.a.l */
/* compiled from: PG */
public final /* synthetic */ class C18738l implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C18742p f52835a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f52836b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f52837c;

    public /* synthetic */ C18738l(C18742p pVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f52835a = pVar;
        this.f52836b = cxVar;
        this.f52837c = cxVar2;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C18742p pVar = this.f52835a;
        C60870cx cxVar = this.f52836b;
        C60870cx cxVar2 = this.f52837c;
        Optional optional = (Optional) C60856cj.m92909r(cxVar);
        Optional optional2 = (Optional) C60856cj.m92909r(cxVar2);
        if (!optional.isEmpty() && !optional2.isEmpty() && ((Boolean) optional2.get()).booleanValue()) {
            return pVar.f52844c.mo24192a(C18742p.f52843b, (C53306j) optional.get(), C58485gu.m89845m());
        }
        ((C59052c) ((C59052c) C18742p.f52842a.mo56224b()).mo56372aa(47345)).mo56354G("Insufficient context to provide on device podcast recommendations. Client type : %s. Personal results enabled: %s", optional, optional2);
        return C60856cj.m92900i(C58836b.f156633a);
    }
}
