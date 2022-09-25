package com.google.android.libraries.assistant.pcp.p1544c.p1545a;

import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58758qx;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.pcp.c.a.m */
/* compiled from: PG */
public final /* synthetic */ class C18566m implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C18571r f52578a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f52579b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f52580c;

    public /* synthetic */ C18566m(C18571r rVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f52578a = rVar;
        this.f52579b = cxVar;
        this.f52580c = cxVar2;
    }

    public final Object call() {
        C18571r rVar = this.f52578a;
        C60870cx cxVar = this.f52579b;
        C60870cx cxVar2 = this.f52580c;
        C58495hd hdVar = (C58495hd) C60856cj.m92909r(cxVar);
        return (C58495hd) Collection.EL.stream(C58758qx.m90647e(hdVar.keySet(), (C58528ij) Collection.EL.stream((C58528ij) C60856cj.m92909r(cxVar2)).filter(new C18570q(rVar)).collect(C58370cn.f155947b))).map(new C18555b(hdVar)).filter(C18556c.f52568a).map(C18557d.f52569a).collect(C58370cn.m89403c(C18558e.f52570a, C18559f.f52571a, C18560g.f52572a));
    }
}
