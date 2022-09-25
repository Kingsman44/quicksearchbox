package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.chip;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80784fe;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80859e;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80872r;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80873s;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.impl.C81743av;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.impl.C81772bx;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81564g;
import com.google.protos.p4985f.p5042u.C65342d;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.chip.x */
/* compiled from: PG */
public final /* synthetic */ class C81718x implements C81698d {

    /* renamed from: a */
    public final /* synthetic */ ChipsCarousel f223478a;

    public /* synthetic */ C81718x(ChipsCarousel chipsCarousel) {
        this.f223478a = chipsCarousel;
    }

    /* renamed from: a */
    public final void mo75245a(C80784fe feVar) {
        C81698d dVar = this.f223478a.f223376f;
        if (dVar != null) {
            C81772bx bxVar = ((C81743av) dVar).f223591a;
            if (!feVar.mo74606d().equals(C65342d.f176699e)) {
                C81564g gVar = bxVar.f223666r;
                C80859e eVar = (C80859e) C80831aj.f221751c.createBuilder();
                C80872r rVar = (C80872r) C80873s.f221822b.createBuilder();
                C65342d d = feVar.mo74606d();
                rVar.copyOnWrite();
                d.getClass();
                ((C80873s) rVar.instance).f221824a = d;
                C80873s sVar = (C80873s) rVar.build();
                eVar.copyOnWrite();
                C80831aj ajVar = (C80831aj) eVar.instance;
                sVar.getClass();
                ajVar.f221754b = sVar;
                ajVar.f221753a = 21;
                gVar.mo73552a((C80831aj) eVar.build());
            }
        }
    }
}
