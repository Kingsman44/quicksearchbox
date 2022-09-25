package com.google.android.apps.search.podcasts.p10576l;

import com.google.android.apps.gsa.p8867w.p8882j.C118820b;
import com.google.android.apps.gsa.p8867w.p8882j.C118821c;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4017at.p4082j.p4083a.C54362bo;

/* renamed from: com.google.android.apps.search.podcasts.l.l */
/* compiled from: PG */
public final /* synthetic */ class C140500l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C118820b f381600a;

    public /* synthetic */ C140500l(C118820b bVar) {
        this.f381600a = bVar;
    }

    public final C60870cx apply(Object obj) {
        C54362bo boVar;
        C118821c cVar = this.f381600a.f331400a;
        C140448aj ajVar = (C140448aj) cVar.mo104006a((String) obj).toBuilder();
        C140442ad adVar = (C140442ad) C140443ae.f381490d.createBuilder();
        if (cVar.mo104007c()) {
            C86338r rVar = cVar.f331403a;
            rVar.getClass();
            if (rVar.contains("PersonalizedRecommendationsEnabled")) {
                C86338r rVar2 = cVar.f331403a;
                rVar2.getClass();
                if (rVar2.getBoolean("PersonalizedRecommendationsEnabled", true)) {
                    boVar = C54362bo.ENABLE_PERSONALIZATION;
                } else {
                    boVar = C54362bo.DISABLE_PERSONALIZATION;
                }
                adVar.copyOnWrite();
                ((C140443ae) adVar.instance).f381492a = boVar.getNumber();
                ajVar.copyOnWrite();
                C140443ae aeVar = (C140443ae) adVar.build();
                aeVar.getClass();
                ((C140450al) ajVar.instance).f381519e = aeVar;
                return C60856cj.m92900i((C140450al) ajVar.build());
            }
        }
        boVar = C54362bo.UNSET;
        adVar.copyOnWrite();
        ((C140443ae) adVar.instance).f381492a = boVar.getNumber();
        ajVar.copyOnWrite();
        C140443ae aeVar2 = (C140443ae) adVar.build();
        aeVar2.getClass();
        ((C140450al) ajVar.instance).f381519e = aeVar2;
        return C60856cj.m92900i((C140450al) ajVar.build());
    }
}
