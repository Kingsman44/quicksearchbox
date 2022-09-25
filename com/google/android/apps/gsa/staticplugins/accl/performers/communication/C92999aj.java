package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

import android.content.pm.PackageManager;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.contact.C87515c;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.accl.performers.p7352m.C93223a;
import com.google.android.libraries.gsa.conversation.clientop.C22371a;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52370pf;
import com.google.assistant.p3897e.p3921j.C52378pn;
import com.google.assistant.p3897e.p3921j.C52621yn;
import com.google.assistant.p3897e.p3921j.C52623yp;
import com.google.assistant.p3897e.p3921j.ade;
import com.google.assistant.p3897e.p3921j.adm;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62974ct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.aj */
/* compiled from: PG */
public final /* synthetic */ class C92999aj implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C93003an f259430a;

    /* renamed from: b */
    public final /* synthetic */ C51809dy f259431b;

    /* renamed from: c */
    public final /* synthetic */ C22434e f259432c;

    public /* synthetic */ C92999aj(C93003an anVar, C51809dy dyVar, C22434e eVar) {
        this.f259430a = anVar;
        this.f259431b = dyVar;
        this.f259432c = eVar;
    }

    public final C60870cx apply(Object obj) {
        boolean z;
        C58528ij ijVar;
        String str;
        Boolean bool;
        C93003an anVar = this.f259430a;
        C51809dy dyVar = this.f259431b;
        C22434e eVar = this.f259432c;
        if (((Boolean) obj).booleanValue()) {
            try {
                C51807dw dwVar = dyVar.f135938d;
                if (dwVar == null) {
                    dwVar = C51807dw.f135930b;
                }
                C52370pf pfVar = (C52370pf) C93003an.m41992m(dwVar, "contact_query_args", C52370pf.f137425e.getParserForType());
                ArrayList arrayList = new ArrayList();
                C52378pn pnVar = pfVar.f137427a;
                if (pnVar == null) {
                    pnVar = C52378pn.f137444j;
                }
                if ((pnVar.f137446a & 2) != 0) {
                    C52378pn pnVar2 = pfVar.f137427a;
                    if (pnVar2 == null) {
                        pnVar2 = C52378pn.f137444j;
                    }
                    arrayList.add(pnVar2.f137450e);
                }
                C52378pn pnVar3 = pfVar.f137427a;
                if (pnVar3 == null) {
                    pnVar3 = C52378pn.f137444j;
                }
                ade ade = pnVar3.f137449d;
                if (ade == null) {
                    ade = ade.f134877h;
                }
                if ((ade.f134879a & 8) != 0) {
                    C52378pn pnVar4 = pfVar.f137427a;
                    if (pnVar4 == null) {
                        pnVar4 = C52378pn.f137444j;
                    }
                    ade ade2 = pnVar4.f137449d;
                    if (ade2 == null) {
                        ade2 = ade.f134877h;
                    }
                    arrayList.add(ade2.f134883e);
                }
                C52378pn pnVar5 = pfVar.f137427a;
                if (pnVar5 == null) {
                    pnVar5 = C52378pn.f137444j;
                }
                ade ade3 = pnVar5.f137449d;
                if (ade3 == null) {
                    ade3 = ade.f134877h;
                }
                Iterator it = ade3.f134885g.iterator();
                while (true) {
                    z = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    adm adm = (adm) it.next();
                    C52623yp ypVar = adm.f134892b;
                    if (ypVar == null) {
                        ypVar = C52623yp.f138162g;
                    }
                    if (!ypVar.f138166c.isEmpty()) {
                        C52623yp ypVar2 = adm.f134892b;
                        if (ypVar2 == null) {
                            ypVar2 = C52623yp.f138162g;
                        }
                        arrayList.add(((C52621yn) ypVar2.f138166c.get(0)).f138158c);
                    }
                }
                C52378pn pnVar6 = pfVar.f137427a;
                if (pnVar6 == null) {
                    pnVar6 = C52378pn.f137444j;
                }
                ade ade4 = pnVar6.f137449d;
                if (ade4 == null) {
                    ade4 = ade.f134877h;
                }
                arrayList.addAll(ade4.f134884f);
                List<C51098gh> arrayList2 = new ArrayList<>();
                C52378pn pnVar7 = pfVar.f137427a;
                if (((pnVar7 == null ? C52378pn.f137444j : pnVar7).f137446a & 16) != 0) {
                    if (pnVar7 == null) {
                        pnVar7 = C52378pn.f137444j;
                    }
                    C51098gh ghVar = pnVar7.f137451f;
                    if (ghVar == null) {
                        ghVar = C51098gh.f133009e;
                    }
                    arrayList2.add(ghVar);
                } else {
                    arrayList2 = pfVar.f137428b;
                }
                ArrayList arrayList3 = new ArrayList();
                for (C51098gh ghVar2 : arrayList2) {
                    if (ghVar2.f133012b == 1) {
                        arrayList3.add((C51058ev) ghVar2.f133013c);
                    }
                }
                if (arrayList3.isEmpty()) {
                    ijVar = new C58759qy(C87515c.PHONE_NUMBER);
                } else {
                    ijVar = C58528ij.m90011K(C87515c.PHONE_NUMBER, C87515c.APP_SPECIFIC_ENDPOINT_ID);
                }
                if (!arrayList.isEmpty()) {
                    C93223a.m153296b(anVar.f259449h, eVar, dyVar.f135936b, "SUCCESS");
                    C52378pn pnVar8 = pfVar.f137427a;
                    if (((pnVar8 == null ? C52378pn.f137444j : pnVar8).f137446a & 32) != 0) {
                        if (pnVar8 == null) {
                            pnVar8 = C52378pn.f137444j;
                        }
                        str = pnVar8.f137452g;
                    } else {
                        str = null;
                    }
                    if (((C86124t) anVar.f259446e.mo27525b()).mo79746e(C90014bt.f247712mN) && pfVar.f137429c) {
                        try {
                            bool = Boolean.valueOf(anVar.f259445d.getPackageManager().getApplicationInfo("com.whatsapp", 0).enabled);
                        } catch (PackageManager.NameNotFoundException unused) {
                            bool = false;
                        }
                        if (bool.booleanValue()) {
                            z = true;
                        }
                    }
                    return anVar.f259444c.mo28201a("findAllByDisplayName", new C93002am(anVar, ijVar, arrayList, arrayList3, str, pfVar, z));
                }
                C93223a.m153296b(anVar.f259449h, eVar, dyVar.f135936b, "SUCCESS");
                if (anVar.f259448g == 5) {
                    anVar.f259447f.mo19974a(C37176a.f97089ev.mo40805c(C62722b.OK));
                }
                return C60856cj.m92900i(C93003an.m153064b(ade.f134877h, pfVar));
            } catch (C22371a | C62974ct e) {
                C93223a.m153296b(anVar.f259449h, eVar, dyVar.f135936b, "INVALID_ARGS");
                if (anVar.f259448g == 5) {
                    anVar.f259447f.mo19974a(C37176a.f97089ev.mo40805c(C62722b.INVALID_ARGUMENT));
                }
                throw e;
            }
        } else {
            if (anVar.f259448g == 5) {
                anVar.f259447f.mo19974a(C37176a.f97089ev.mo40805c(C62722b.PERMISSION_DENIED));
            }
            C93223a.m153296b(anVar.f259449h, eVar, dyVar.f135936b, "PERMISSION_DENIED");
            return C60856cj.m92900i(C22402a.m41822b(C52235kf.PERMISSION_DENIED, (String) null));
        }
    }
}
