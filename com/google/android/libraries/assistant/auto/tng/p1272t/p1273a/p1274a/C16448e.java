package com.google.android.libraries.assistant.auto.tng.p1272t.p1273a.p1274a;

import com.google.common.p4522b.C58370cn;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.assistant.auto.tng.t.a.a.e */
/* compiled from: PG */
public final /* synthetic */ class C16448e implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f48353a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f48354b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f48355c;

    public /* synthetic */ C16448e(C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f48353a = cxVar;
        this.f48354b = cxVar2;
        this.f48355c = cxVar3;
    }

    public final Object call() {
        C60870cx cxVar = this.f48353a;
        C60870cx cxVar2 = this.f48354b;
        C60870cx cxVar3 = this.f48355c;
        List c = C16451h.m33405c(cxVar);
        List c2 = C16451h.m33405c(cxVar2);
        List c3 = C16451h.m33405c(cxVar3);
        C58976aa aaVar = C58975e.f156826a;
        c.size();
        c2.size();
        c3.size();
        return (List) Stream.CC.m71936of((T[]) new Stream[]{Collection.EL.stream(c), Collection.EL.stream(c2), Collection.EL.stream(c3)}).flatMap(C16449f.f48356a).filter(C16450g.f48357a).collect(C58370cn.f155946a);
    }
}
