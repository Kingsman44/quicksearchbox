package com.google.apps.tiktok.experiments.phenotype;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.p3606d.C46092j;
import com.google.apps.tiktok.experiments.C46889a;
import com.google.common.util.concurrent.C60887da;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.ff */
/* compiled from: PG */
public final class C47048ff {
    /* renamed from: a */
    public static final C46917ak m83703a(C46918al alVar, C60887da daVar, AccountId accountId, C47023ei eiVar, C46092j jVar, C47065s sVar, Map map) {
        AccountId accountId2 = accountId;
        C47023ei eiVar2 = eiVar;
        C47065s sVar2 = sVar;
        C69664n.m101061g(alVar, "factory");
        C69664n.m101061g(daVar, "blockingExecutor");
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(eiVar2, "committer");
        C69664n.m101061g(sVar2, "updater");
        Map map2 = map;
        C69664n.m101061g(map2, "defaultExperimentFlagValues");
        return alVar.mo50922a(C46889a.USER, new C47043fa(jVar), daVar, map2, C47044fb.f122623a, C47045fc.f122624a, new C47046fd(eiVar2, accountId), new C47047fe(sVar2, accountId));
    }
}
