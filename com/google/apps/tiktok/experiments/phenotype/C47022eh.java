package com.google.apps.tiktok.experiments.phenotype;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.p3606d.C46092j;
import com.google.apps.tiktok.experiments.C46889a;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import java.util.Map;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.eh */
/* compiled from: PG */
public final class C47022eh implements C68220f {
    /* renamed from: a */
    public static C46917ak m83677a(C47023ei eiVar, C46918al alVar, AccountId accountId, Map map, C46092j jVar, C47065s sVar, Executor executor) {
        C47023ei eiVar2 = eiVar;
        AccountId accountId2 = accountId;
        C47065s sVar2 = sVar;
        C69664n.m101061g(eiVar, "committer");
        C69664n.m101061g(alVar, "factory");
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(sVar2, "updater");
        Executor executor2 = executor;
        C69664n.m101061g(executor2, "uiExecutor");
        C46917ak a = alVar.mo50922a(C46889a.UI_USER, new C47017ec(jVar), executor2, map, C47018ed.f122564a, C47019ee.f122565a, new C47020ef(eiVar, accountId), new C47021eg(sVar2, accountId));
        C68225k.m98532d(a);
        return a;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
