package com.google.android.apps.search.googleapp.saves.savefeature.p10392a;

import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c.C137244b;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c.C137245c;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c.C137246d;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c.C137248f;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c.C137249g;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c.C137250h;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10396d.C137262a;
import com.google.apps.tiktok.dataservice.C46688af;
import com.google.common.base.C58817ah;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57578av;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57665z;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.a.m */
/* compiled from: PG */
public final /* synthetic */ class C137271m implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C137273o f373444a;

    /* renamed from: b */
    public final /* synthetic */ C137244b f373445b;

    public /* synthetic */ C137271m(C137273o oVar, C137244b bVar) {
        this.f373444a = oVar;
        this.f373445b = bVar;
    }

    public final Object apply(Object obj) {
        C137273o oVar = this.f373444a;
        C137244b bVar = this.f373445b;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            return C46688af.f121976a;
        }
        C137245c cVar = (C137245c) C137246d.f373390b.createBuilder();
        C137250h hVar = (C137250h) optional.get();
        C57665z a = C57665z.m88512a(bVar.f373388a);
        if (a == null) {
            a = C57665z.UNRECOGNIZED;
        }
        if (!a.equals(C57665z.UNKNOWN_ITEM_TYPE)) {
            C137249g gVar = (C137249g) C137250h.f373398b.createBuilder();
            for (C137248f fVar : hVar.f373400a) {
                C57578av avVar = fVar.f373396a;
                if (avVar != null && C137262a.m223022a(avVar, a)) {
                    gVar.mo113599a(fVar);
                }
            }
            hVar = (C137250h) gVar.build();
        }
        cVar.copyOnWrite();
        hVar.getClass();
        ((C137246d) cVar.instance).f373392a = hVar;
        return C46688af.m83205b((C137246d) cVar.build(), oVar.f373448b.f373457i.mo26870b());
    }
}
