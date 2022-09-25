package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

import android.content.ContentResolver;
import com.google.android.apps.gsa.search.shared.contact.C87515c;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C51810dz;
import com.google.assistant.p3897e.p3921j.C52068ea;
import com.google.assistant.p3897e.p3921j.C52069eb;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52233kd;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.assistant.p3897e.p3921j.C52292mi;
import com.google.assistant.p3897e.p3921j.C52296mm;
import com.google.assistant.p3897e.p3921j.C52297mn;
import com.google.assistant.p3897e.p3921j.C52378pn;
import com.google.assistant.p3897e.p3921j.ade;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62963cj;
import com.google.protobuf.C63088z;
import dagger.C68214a;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.e */
/* compiled from: PG */
public final class C93033e extends C22538o {

    /* renamed from: a */
    public final ContentResolver f259513a;

    /* renamed from: b */
    public final C68214a f259514b;

    /* renamed from: c */
    private final C22871g f259515c;

    public C93033e(ContentResolver contentResolver, C68214a aVar, C22871g gVar) {
        this.f259513a = contentResolver;
        this.f259514b = aVar;
        this.f259515c = gVar;
    }

    /* renamed from: b */
    public static C52070ec m153100b(C52296mm mmVar) {
        C51810dz dzVar = (C51810dz) C52070ec.f136651d.createBuilder();
        C52233kd kdVar = (C52233kd) C52236kg.f137089d.createBuilder();
        C52235kf kfVar = C52235kf.OK;
        kdVar.copyOnWrite();
        C52236kg kgVar = (C52236kg) kdVar.instance;
        kgVar.f137092b = kfVar.f137088t;
        kgVar.f137091a |= 1;
        dzVar.copyOnWrite();
        C52070ec ecVar = (C52070ec) dzVar.instance;
        C52236kg kgVar2 = (C52236kg) kdVar.build();
        kgVar2.getClass();
        ecVar.f136654b = kgVar2;
        ecVar.f136653a |= 1;
        C52068ea eaVar = (C52068ea) C52069eb.f136648b.createBuilder();
        C63088z byteString = mmVar.toByteString();
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "contact_query_result";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar.f137059a |= 2;
        kaVar.f137061c = byteString;
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        kaVar2.f137059a |= 1;
        kaVar2.f137060b = "assistant.api.client_op.CallHistoryContactQueryResult";
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        eaVar.mo53780b((C52232kc) kbVar.build());
        dzVar.copyOnWrite();
        C52070ec ecVar2 = (C52070ec) dzVar.instance;
        C52069eb ebVar = (C52069eb) eaVar.build();
        ebVar.getClass();
        ecVar2.f136655c = ebVar;
        ecVar2.f136653a |= 2;
        return (C52070ec) dzVar.build();
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        C58759qy qyVar;
        String str;
        if ("contact.CALL_HISTORY_LOOKUP".equals(dyVar.f135936b)) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C52292mi miVar = (C52292mi) m41992m(dwVar, "contact_query_args", C52292mi.f137270e.getParserForType());
            ArrayList arrayList = new ArrayList();
            C52378pn pnVar = miVar.f137272a;
            if (pnVar == null) {
                pnVar = C52378pn.f137444j;
            }
            if ((pnVar.f137446a & 2) != 0) {
                C52378pn pnVar2 = miVar.f137272a;
                if (pnVar2 == null) {
                    pnVar2 = C52378pn.f137444j;
                }
                arrayList.add(pnVar2.f137450e);
            }
            C52378pn pnVar3 = miVar.f137272a;
            if (pnVar3 == null) {
                pnVar3 = C52378pn.f137444j;
            }
            ade ade = pnVar3.f137449d;
            if (ade == null) {
                ade = ade.f134877h;
            }
            if ((ade.f134879a & 8) != 0) {
                C52378pn pnVar4 = miVar.f137272a;
                if (pnVar4 == null) {
                    pnVar4 = C52378pn.f137444j;
                }
                ade ade2 = pnVar4.f137449d;
                if (ade2 == null) {
                    ade2 = ade.f134877h;
                }
                arrayList.add(ade2.f134883e);
            }
            C52378pn pnVar5 = miVar.f137272a;
            if (pnVar5 == null) {
                pnVar5 = C52378pn.f137444j;
            }
            ade ade3 = pnVar5.f137449d;
            if (ade3 == null) {
                ade3 = ade.f134877h;
            }
            arrayList.addAll(ade3.f134884f);
            ArrayList arrayList2 = new ArrayList();
            for (C51098gh ghVar : miVar.f137273b) {
                if (ghVar.f133012b == 1) {
                    arrayList2.add((C51058ev) ghVar.f133013c);
                }
            }
            if (arrayList2.isEmpty()) {
                qyVar = new C58759qy(C87515c.PHONE_NUMBER);
            } else {
                qyVar = C58528ij.m90011K(C87515c.PHONE_NUMBER, C87515c.APP_SPECIFIC_ENDPOINT_ID);
            }
            C62963cj cjVar = new C62963cj(miVar.f137274c, C52292mi.f137269d);
            if (cjVar.isEmpty() || (cjVar.size() == 1 && ((C52297mn) cjVar.get(0)).equals(C52297mn.UNKNOWN_TYPE))) {
                return C60856cj.m92900i(C22402a.m41822b(C52235kf.INVALID_ARGUMENT, "CallHistoryType is not set."));
            }
            if (arrayList.isEmpty()) {
                return this.f259515c.mo28201a("findMostRecentContact", new C93031c(this, cjVar));
            }
            C52378pn pnVar6 = miVar.f137272a;
            if (((pnVar6 == null ? C52378pn.f137444j : pnVar6).f137446a & 32) != 0) {
                if (pnVar6 == null) {
                    pnVar6 = C52378pn.f137444j;
                }
                str = pnVar6.f137452g;
            } else {
                str = null;
            }
            return this.f259515c.mo28201a("findAllByDisplayName", new C93032d(this, qyVar, arrayList, arrayList2, str, cjVar));
        }
        throw new C22428d(dyVar);
    }
}
