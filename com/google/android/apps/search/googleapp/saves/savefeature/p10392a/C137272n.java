package com.google.android.apps.search.googleapp.saves.savefeature.p10392a;

import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10393a.C137237d;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10393a.C137238e;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c.C137247e;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c.C137248f;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c.C137249g;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c.C137250h;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57575as;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57578av;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.a.n */
/* compiled from: PG */
public final /* synthetic */ class C137272n implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C137273o f373446a;

    public /* synthetic */ C137272n(C137273o oVar) {
        this.f373446a = oVar;
    }

    public final C60870cx apply(Object obj) {
        C137238e eVar = this.f373446a.f373448b.f373453e;
        C62971cq<C57578av> cqVar = ((C57575as) obj).f153819a;
        C137249g gVar = (C137249g) C137250h.f373398b.createBuilder();
        for (C57578av avVar : cqVar) {
            C137247e eVar2 = (C137247e) C137248f.f373394b.createBuilder();
            eVar2.copyOnWrite();
            avVar.getClass();
            ((C137248f) eVar2.instance).f373396a = avVar;
            gVar.mo113599a((C137248f) eVar2.build());
        }
        return eVar.f373381c.mo46039a(new C137237d(eVar, (C137250h) gVar.build()), C60826bg.f164896a);
    }
}
