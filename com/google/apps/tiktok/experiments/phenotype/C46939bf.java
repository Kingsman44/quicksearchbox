package com.google.apps.tiktok.experiments.phenotype;

import com.google.apps.tiktok.experiments.C46889a;
import com.google.apps.tiktok.p3648i.p3649a.C47151b;
import com.google.common.util.concurrent.C60887da;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import java.util.Map;
import java.util.Set;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.bf */
/* compiled from: PG */
public final class C46939bf implements C68220f {
    /* renamed from: a */
    public static C46917ak m83588a(C46918al alVar, C46925as asVar, C47151b bVar, C60887da daVar, C47065s sVar, Map map, Set set) {
        C47151b bVar2 = bVar;
        C47065s sVar2 = sVar;
        Set set2 = set;
        C69664n.m101061g(alVar, "factory");
        C69664n.m101061g(bVar, "pathFactory");
        C60887da daVar2 = daVar;
        C69664n.m101061g(daVar2, "blockingExecutor");
        C69664n.m101061g(sVar2, "updater");
        Map map2 = map;
        C69664n.m101061g(map2, "defaultExperimentFlagValues");
        C69664n.m101061g(set2, "directBootPackages");
        C46925as asVar2 = asVar;
        C46917ak a = alVar.mo50922a(C46889a.DEVICE, new C46927au(set2, bVar), daVar2, map2, C46928av.f122412a, C46929aw.f122413a, new C46930ax(asVar), new C46931ay(sVar2));
        C68225k.m98532d(a);
        return a;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
