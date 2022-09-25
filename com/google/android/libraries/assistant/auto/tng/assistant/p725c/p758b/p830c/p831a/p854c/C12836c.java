package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p854c;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.C12866j;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.C12867k;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p868d.C12897a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p868d.C12898b;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p868d.C12899c;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p868d.C12900d;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52654zt;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.c.c */
/* compiled from: PG */
public final /* synthetic */ class C12836c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C12842i f40062a;

    public /* synthetic */ C12836c(C12842i iVar) {
        this.f40062a = iVar;
    }

    public final C60870cx apply(Object obj) {
        C12842i iVar = this.f40062a;
        List list = (List) obj;
        C12866j jVar = (C12866j) C12867k.f40128d.createBuilder();
        C12897a aVar = (C12897a) C12900d.f40164b.createBuilder();
        C12834a aVar2 = (C12834a) iVar;
        C58800sl lA = aVar2.f40058a.keySet().iterator();
        while (lA.hasNext()) {
            Integer num = (Integer) lA.next();
            C60870cx cxVar = (C60870cx) aVar2.f40058a.get(num);
            if (cxVar != null) {
                C52070ec ecVar = (C52070ec) C60856cj.m92909r(cxVar);
                C58976aa aaVar = C58975e.f156826a;
                C12898b bVar = (C12898b) C12899c.f40159d.createBuilder();
                int intValue = num.intValue();
                bVar.copyOnWrite();
                C12899c cVar = (C12899c) bVar.instance;
                cVar.f40161a |= 1;
                cVar.f40162b = intValue;
                bVar.copyOnWrite();
                C12899c cVar2 = (C12899c) bVar.instance;
                ecVar.getClass();
                cVar2.f40163c = ecVar;
                cVar2.f40161a |= 2;
                aVar.mo20839a((C12899c) bVar.build());
            } else {
                C59104x c = C12844k.f40077a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "ConvDeltaStreamProc");
                ((C59052c) ((C59052c) c).mo56372aa(44501)).mo56389s("Adding clientOp execution failed for future with interactionId %d. Future is null.", num);
            }
        }
        if (aVar2.f40059b.isPresent()) {
            C58976aa aaVar2 = C58975e.f156826a;
            C52654zt ztVar = (C52654zt) aVar2.f40059b.get();
            jVar.copyOnWrite();
            C12867k kVar = (C12867k) jVar.instance;
            ztVar.getClass();
            kVar.f40132c = ztVar;
            kVar.f40130a |= 2;
        }
        C12900d dVar = (C12900d) aVar.build();
        jVar.copyOnWrite();
        C12867k kVar2 = (C12867k) jVar.instance;
        dVar.getClass();
        kVar2.f40131b = dVar;
        kVar2.f40130a |= 1;
        C58976aa aaVar3 = C58975e.f156826a;
        return C60856cj.m92900i((C12867k) jVar.build());
    }
}
