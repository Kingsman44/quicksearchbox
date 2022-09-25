package com.google.android.apps.gsa.nga.engine.understanding.p6238e;

import com.google.android.apps.gsa.nga.engine.p5913am.p5922i.C74920l;
import com.google.android.apps.gsa.nga.engine.understanding.C78981ah;
import com.google.android.apps.gsa.nga.engine.understanding.C79074e;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80513b;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.e.d */
/* compiled from: PG */
public final /* synthetic */ class C79090d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C79086ak f217467a;

    public /* synthetic */ C79090d(C79086ak akVar) {
        this.f217467a = akVar;
    }

    public final Object apply(Object obj) {
        C79086ak akVar = this.f217467a;
        C78981ah ahVar = (C78981ah) obj;
        C58480gp e = C58485gu.m89837e();
        C79074e eVar = new C79074e();
        eVar.mo73745b(ahVar.mo73741a());
        e.mo55395g(eVar.mo73744a());
        if (ahVar.mo73743c().isPresent()) {
            if (akVar.f217446b.isPresent()) {
                ahVar.mo73741a();
                C80513b bVar = (C80513b) ahVar.mo73743c().get();
                ((C74920l) akVar.f217446b.get()).mo71298b();
            }
            e.mo55395g(C79086ak.m127021c((C80513b) ahVar.mo73743c().get(), ahVar.mo73741a()));
        }
        return e.mo55394f();
    }
}
