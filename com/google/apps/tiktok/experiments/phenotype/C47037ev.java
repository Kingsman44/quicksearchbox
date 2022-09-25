package com.google.apps.tiktok.experiments.phenotype;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.ev */
/* compiled from: PG */
final class C47037ev implements C60931s {

    /* renamed from: a */
    final /* synthetic */ C47038ew f122611a;

    /* renamed from: b */
    final /* synthetic */ AccountId f122612b;

    public C47037ev(C47038ew ewVar, AccountId accountId) {
        this.f122611a = ewVar;
        this.f122612b = accountId;
    }

    public final /* bridge */ /* synthetic */ C60870cx apply(Object obj) {
        C47064r rVar = (C47064r) obj;
        C69664n.m101061g(rVar, "result");
        if (rVar.f122655a) {
            return C60856cj.m92900i(rVar);
        }
        C47060n nVar = new C47060n();
        C58833ax hk = ((C47033er) C47245e.m84045a(this.f122611a.f122613a, C47033er.class, this.f122612b)).mo50984hk();
        if (hk.mo56113h()) {
            ((C46941bh) hk.mo56107c()).mo50933a();
        }
        throw nVar;
    }
}
