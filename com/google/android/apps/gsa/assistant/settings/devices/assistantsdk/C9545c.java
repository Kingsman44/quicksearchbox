package com.google.android.apps.gsa.assistant.settings.devices.assistantsdk;

import com.google.android.apps.gsa.assistant.settings.base.C9506h;
import com.google.android.apps.gsa.assistant.settings.shared.o;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C49891cv;
import com.google.assistant.p3861at.C49893cx;
import com.google.assistant.p3861at.C50097kl;
import com.google.assistant.p3861at.C50098km;
import com.google.assistant.p3861at.act;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.assistantsdk.c */
/* compiled from: PG */
final class C9545c extends C9506h {

    /* renamed from: a */
    final /* synthetic */ C9549g f33076a;

    public C9545c(C9549g gVar) {
        this.f33076a = gVar;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo17818b(Object obj) {
        C49893cx cxVar;
        act act = (act) obj;
        o oVar = this.f33076a.f33081j;
        C49875cf cfVar = C49875cf.ASSISTANT_SDK;
        String str = this.f33076a.f33082k;
        if ((act.f128894a & 64) != 0) {
            cxVar = act.f128900g;
            if (cxVar == null) {
                cxVar = C49893cx.f129688b;
            }
        } else {
            cxVar = null;
        }
        C49891cv c = oVar.c(cfVar, str, cxVar);
        if (c == null) {
            C59104x d = C9549g.f33080i.mo56226d();
            d.mo56378ag(C58975e.f156826a, "DevIdSDKSCntrl");
            ((C59052c) ((C59052c) d).mo56372aa(338)).mo56389s("Invalid device ID: %s", this.f33076a.f33082k);
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        C50097kl klVar = (C50097kl) C50098km.f130243c.createBuilder();
        String str2 = c.f129686y;
        klVar.copyOnWrite();
        C50098km kmVar = (C50098km) klVar.instance;
        str2.getClass();
        C62971cq cqVar = kmVar.f130245a;
        if (!cqVar.mo58948c()) {
            kmVar.f130245a = C62942bv.mutableCopy(cqVar);
        }
        kmVar.f130245a.add(str2);
        int i = c.f129687z;
        klVar.copyOnWrite();
        C50098km kmVar2 = (C50098km) klVar.instance;
        C62961ch chVar = kmVar2.f130246b;
        if (!chVar.mo58948c()) {
            kmVar2.f130246b = C62942bv.mutableCopy(chVar);
        }
        kmVar2.f130246b.mo58916g(i);
        C50098km kmVar3 = (C50098km) klVar.build();
        acu acu = (acu) acv.f128920X.createBuilder();
        acu.copyOnWrite();
        acv acv = (acv) acu.instance;
        kmVar3.getClass();
        acv.f128924C = kmVar3;
        acv.f128946b |= 16;
        this.f33076a.mo17813x(acu, new C9544b(this, c, act), false);
    }
}
