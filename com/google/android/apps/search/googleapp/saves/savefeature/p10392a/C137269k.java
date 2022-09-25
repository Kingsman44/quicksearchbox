package com.google.android.apps.search.googleapp.saves.savefeature.p10392a;

import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10393a.C137236c;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10393a.C137238e;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c.C137247e;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c.C137248f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57578av;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.a.k */
/* compiled from: PG */
public final /* synthetic */ class C137269k implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C137274p f373442a;

    public /* synthetic */ C137269k(C137274p pVar) {
        this.f373442a = pVar;
    }

    public final C60870cx apply(Object obj) {
        C137274p pVar = this.f373442a;
        C57578av avVar = (C57578av) obj;
        C137238e eVar = pVar.f373453e;
        C137247e eVar2 = (C137247e) C137248f.f373394b.createBuilder();
        eVar2.copyOnWrite();
        avVar.getClass();
        ((C137248f) eVar2.instance).f373396a = avVar;
        C60870cx a = eVar.f373381c.mo46039a(new C137236c((C137248f) eVar2.build()), C60826bg.f164896a);
        C137266h hVar = new C137266h(avVar);
        C60870cx g = C60922j.m93044g(a, C47810es.m84963c(hVar), pVar.f373458j);
        pVar.f373456h.mo50787a(g, "SaveFeatureContentKey");
        return g;
    }
}
