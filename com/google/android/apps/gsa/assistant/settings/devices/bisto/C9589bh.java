package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.accounts.Account;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89635f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124552h;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124620am;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3861at.C49894cy;
import com.google.assistant.p3861at.C49895cz;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.bh */
/* compiled from: PG */
public final /* synthetic */ class C9589bh implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C9619ck f33195a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f33196b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f33197c;

    public /* synthetic */ C9589bh(C9619ck ckVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f33195a = ckVar;
        this.f33196b = cxVar;
        this.f33197c = cxVar2;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C9619ck ckVar = this.f33195a;
        C60870cx cxVar = this.f33196b;
        C60870cx cxVar2 = this.f33197c;
        List list = (List) obj;
        C58976aa aaVar = C58975e.f156826a;
        C124552h hVar = (C124552h) C60856cj.m92909r(cxVar);
        ckVar.f33290x = hVar.mo106529a();
        ckVar.f33291y = hVar.mo106530b();
        ckVar.f33292z = ((Integer) C60856cj.m92909r(cxVar2)).intValue();
        if (C9619ck.m24301R(ckVar.f33290x)) {
            ckVar.mo17898G();
        } else {
            ckVar.mo17904M();
            C124548d dVar = ckVar.f33290x;
            Account a = ckVar.f33281o.mo79668a();
            if (a == null || C58837ba.m90859h(a.name)) {
                C59104x d = C9619ck.f33236i.mo56226d();
                d.mo56378ag(C58975e.f156826a, "DevIdBistoSCntrl");
                ((C59052c) ((C59052c) d).mo56372aa(394)).mo56386p("No account");
            } else {
                C124620am o = dVar.mo106517o(a);
                if (o.f343764b.isEmpty()) {
                    C59104x b = C9619ck.f33236i.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "DevIdBistoSCntrl");
                    ((C59052c) ((C59052c) b).mo56372aa(395)).mo56386p("Missing DUSI");
                } else {
                    C89635f fVar = ckVar.f33239C;
                    acu acu = (acu) acv.f128920X.createBuilder();
                    acu.copyOnWrite();
                    acv acv = (acv) acu.instance;
                    acv.f128945a |= 512;
                    acv.f128954j = true;
                    C49894cy cyVar = (C49894cy) C49895cz.f129691h.createBuilder();
                    cyVar.copyOnWrite();
                    C49895cz czVar = (C49895cz) cyVar.instance;
                    czVar.f129693a |= 16;
                    czVar.f129698f = true;
                    acu.copyOnWrite();
                    acv acv2 = (acv) acu.instance;
                    C49895cz czVar2 = (C49895cz) cyVar.build();
                    czVar2.getClass();
                    acv2.f128955k = czVar2;
                    acv2.f128945a |= 1024;
                    ckVar.f33238B = ckVar.f33278l.mo28209i(fVar.mo83517a((acv) acu.build()), "getDevice", new C9580az(ckVar, o, a));
                }
            }
            ckVar.mo17800k();
        }
        return hVar;
    }
}
