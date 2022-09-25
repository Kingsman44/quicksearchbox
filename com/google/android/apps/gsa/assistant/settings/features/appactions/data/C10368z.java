package com.google.android.apps.gsa.assistant.settings.features.appactions.data;

import com.google.android.apps.gsa.assistant.shared.appactions.g.f;
import com.google.android.apps.gsa.shared.p7038f.p7039a.C89757q;
import com.google.android.apps.gsa.shared.p7066m.C90019by;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3825an.p3830c.p3831a.C49266al;
import com.google.assistant.p3825an.p3830c.p3831a.C49267am;
import com.google.assistant.p3861at.C49836au;
import com.google.assistant.p3861at.C49838aw;
import com.google.assistant.p3861at.C49847be;
import com.google.assistant.p3861at.C49855bm;
import com.google.assistant.p3861at.C50355u;
import com.google.assistant.p3861at.act;
import com.google.common.p4522b.C58729pv;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.data.z */
/* compiled from: PG */
public final /* synthetic */ class C10368z implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C10325al f35054a;

    public /* synthetic */ C10368z(C10325al alVar) {
        this.f35054a = alVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C49855bm bmVar;
        C60870cx cxVar;
        C10325al alVar = this.f35054a;
        C50355u uVar = ((act) obj).f128882I;
        if (uVar == null) {
            uVar = C50355u.f131056c;
        }
        if (uVar.f131058a == 1) {
            bmVar = (C49855bm) uVar.f131059b;
        } else {
            bmVar = C49855bm.f129559b;
        }
        C22871g gVar = alVar.f34992g;
        C62971cq<C49836au> cqVar = bmVar.f129561a;
        f fVar = alVar.f34988c;
        if (!fVar.d.mo79746e(C90019by.f248092z)) {
            cxVar = C60856cj.m92900i(C58729pv.f156485a);
        } else {
            C89757q qVar = fVar.b;
            HashMap hashMap = new HashMap();
            for (C49836au auVar : cqVar) {
                C49838aw awVar = auVar.f129499a;
                if (awVar == null) {
                    awVar = C49838aw.f129504g;
                }
                String str = awVar.f129507b;
                if (!hashMap.containsKey(str)) {
                    hashMap.put(str, new ArrayList());
                }
                for (C49847be beVar : auVar.f129502d) {
                    C49267am amVar = beVar.f129544a;
                    if (amVar == null) {
                        amVar = C49267am.f127346f;
                    }
                    C49266al alVar2 = (C49266al) amVar.toBuilder();
                    alVar2.copyOnWrite();
                    C49267am amVar2 = (C49267am) alVar2.instance;
                    amVar2.f127348a |= 4;
                    amVar2.f127351d = 1;
                    alVar2.copyOnWrite();
                    C49267am amVar3 = (C49267am) alVar2.instance;
                    amVar3.f127348a |= 8;
                    amVar3.f127352e = 10;
                    ((List) hashMap.get(str)).add((C49267am) alVar2.build());
                }
            }
            cxVar = qVar.mo83621a(hashMap).mo83620a();
        }
        return gVar.mo28209i(gVar.mo28209i(cxVar, "Create Shortcuts from the appUiList and the Personal-Inventory Results", new C10316ac(alVar, cqVar)), "convert AppUi List -> FullPageData", C10367y.f35053a);
    }
}
