package com.google.apps.tiktok.experiments.phenotype;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import java.util.concurrent.Callable;
import p5462h.p5463a.C69505av;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.dl */
/* compiled from: PG */
final class C46999dl implements Callable {

    /* renamed from: a */
    final /* synthetic */ C60870cx f122536a;

    /* renamed from: b */
    final /* synthetic */ C60870cx f122537b;

    public C46999dl(C60870cx cxVar, C60870cx cxVar2) {
        this.f122536a = cxVar;
        this.f122537b = cxVar2;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        Object r = C60856cj.m92909r(this.f122536a);
        C69664n.m101060f(r, "getDone(uiServerTokens)");
        Object r2 = C60856cj.m92909r(this.f122537b);
        C69664n.m101060f(r2, "getDone(serverTokens)");
        return C69505av.m100872n((Map) r, (Map) r2);
    }
}
