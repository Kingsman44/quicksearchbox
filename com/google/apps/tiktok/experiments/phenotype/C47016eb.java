package com.google.apps.tiktok.experiments.phenotype;

import com.google.apps.tiktok.experiments.C46889a;
import com.google.apps.tiktok.p3648i.p3649a.C47151b;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.eb */
/* compiled from: PG */
public final class C47016eb implements C68220f {
    /* renamed from: a */
    public static C46917ak m83671a(C46925as asVar, C46918al alVar, C47151b bVar, Map map, Executor executor, C47065s sVar, Set set) {
        C47151b bVar2 = bVar;
        C47065s sVar2 = sVar;
        Set set2 = set;
        C69664n.m101061g(alVar, "factory");
        C69664n.m101061g(bVar, "pathFactory");
        Map map2 = map;
        C69664n.m101061g(map2, "defaultFlagValues");
        Executor executor2 = executor;
        C69664n.m101061g(executor2, "uiExecutor");
        C69664n.m101061g(sVar2, "updater");
        C69664n.m101061g(set2, "directBootPackages");
        C46925as asVar2 = asVar;
        C46917ak a = alVar.mo50922a(C46889a.UI_DEVICE, new C47005dr(set2, bVar), executor2, map2, C47006ds.f122551a, C47007dt.f122552a, new C47008du(asVar), new C47009dv(sVar2));
        C68225k.m98532d(a);
        return a;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
