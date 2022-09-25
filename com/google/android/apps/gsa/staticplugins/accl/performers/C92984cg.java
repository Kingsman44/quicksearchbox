package com.google.android.apps.gsa.staticplugins.accl.performers;

import android.util.Log;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.internal.C143918bg;
import com.google.android.gms.googlehelp.C144280a;
import com.google.android.gms.googlehelp.C144293i;
import com.google.android.gms.googlehelp.C144336n;
import com.google.android.gms.googlehelp.SupportRequestHelp;
import com.google.android.gms.googlehelp.internal.common.C144320o;
import com.google.android.gms.googlehelp.internal.common.C144323r;
import com.google.android.libraries.gcoreclient.p1782o.p1783a.C21596h;
import com.google.android.libraries.gcoreclient.p1782o.p1783a.C21597i;
import com.google.android.libraries.gcoreclient.p1782o.p1783a.C21598j;
import com.google.android.libraries.gcoreclient.p1782o.p1783a.C21599k;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.alp;
import com.google.assistant.p3897e.p3921j.alq;
import com.google.assistant.p3897e.p3921j.alu;
import com.google.assistant.p3897e.p3921j.alv;
import com.google.assistant.p3897e.p3921j.alx;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.C62995dn;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.cg */
/* compiled from: PG */
public final class C92984cg extends C22538o {

    /* renamed from: a */
    private final C92983cf f259381a;

    public C92984cg(C92983cf cfVar) {
        this.f259381a = cfVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        SettableFuture settableFuture;
        String str = dyVar.f135936b;
        if (str.equals("support.DIRECT_SUPPORT_REQUEST")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            alq alq = (alq) m41992m(dwVar, "direct_support_request_args", alq.f135335j.getParserForType());
            C92983cf cfVar = this.f259381a;
            if (!cfVar.f259379c.mo79666M()) {
                return C60856cj.m92900i(C22402a.m41822b(C52235kf.UNAUTHENTICATED, (String) null));
            }
            int i = alq.f135338b;
            int a = alp.m86326a(i);
            if (a == 0 || a != 2) {
                int a2 = alp.m86326a(i);
                if (a2 == 0 || a2 != 3) {
                    return C60856cj.m92900i(C22402a.m41822b(C52235kf.INVALID_ARGUMENT, (String) null));
                }
                if (alq.f135342f.isEmpty()) {
                    return C60856cj.m92900i(C22402a.m41822b(C52235kf.INVALID_ARGUMENT, (String) null));
                }
                C21596h b = cfVar.mo87499b(alq);
                settableFuture = new SettableFuture();
                C144336n nVar = new C144336n(cfVar.f259377a);
                C92981cd cdVar = new C92981cd(settableFuture);
                SupportRequestHelp a3 = C21599k.m40712a(b);
                C21597i iVar = new C21597i(cdVar);
                try {
                    C144280a aVar = a3.f390789a.f390749L;
                    C143851w wVar = C144293i.m234538b(nVar.f390899a).f389929D;
                    C144323r rVar = new C144323r(wVar, iVar, a3);
                    wVar.mo119159d(rVar);
                    C143918bg.m233956b(rVar);
                } catch (Exception e) {
                    Log.e("GcoreSupportRequester", "C2C support request failed", e);
                    iVar.f59974a.mo87496a();
                }
            } else if (alq.f135340d.isEmpty()) {
                return C60856cj.m92900i(C22402a.m41822b(C52235kf.INVALID_ARGUMENT, (String) null));
            } else {
                C21596h b2 = cfVar.mo87499b(alq);
                settableFuture = new SettableFuture();
                C144336n nVar2 = new C144336n(cfVar.f259377a);
                C92982ce ceVar = new C92982ce(settableFuture);
                SupportRequestHelp a4 = C21599k.m40712a(b2);
                C21598j jVar = new C21598j(ceVar);
                try {
                    C144280a aVar2 = a4.f390789a.f390749L;
                    C143851w wVar2 = C144293i.m234538b(nVar2.f390899a).f389929D;
                    C144320o oVar = new C144320o(wVar2, jVar, a4);
                    wVar2.mo119159d(oVar);
                    C143918bg.m233956b(oVar);
                } catch (Exception e2) {
                    Log.e("GcoreSupportRequester", "Chat support request failed", e2);
                    jVar.f59975a.mo87497a();
                }
            }
            return settableFuture;
        } else if (str.equals("support.GET_TROUBLESHOOTER_SIGNALS")) {
            C51807dw dwVar2 = dyVar.f135938d;
            if (dwVar2 == null) {
                dwVar2 = C51807dw.f135930b;
            }
            alu alu = (alu) m41992m(dwVar2, "get_troubleshooter_signals_args", alu.f135350b.getParserForType());
            C92983cf cfVar2 = this.f259381a;
            alv alv = (alv) alx.f135354b.createBuilder();
            Map a5 = cfVar2.mo87498a();
            C58495hd r = ((C86124t) cfVar2.f259378b.mo27525b()).mo79752r(C90014bt.f247364fk);
            if (r != null && !r.isEmpty()) {
                HashMap hashMap = new HashMap(a5);
                hashMap.putAll(r);
                a5 = hashMap;
            }
            if (a5.isEmpty()) {
                return C60856cj.m92900i(C22402a.m41822b(C52235kf.UNIMPLEMENTED, "Null or empty cursor"));
            }
            HashSet hashSet = new HashSet(alu.f135352a);
            for (Map.Entry entry : a5.entrySet()) {
                if (hashSet.contains(entry.getKey())) {
                    String str2 = (String) entry.getKey();
                    String str3 = (String) entry.getValue();
                    str2.getClass();
                    str3.getClass();
                    alv.copyOnWrite();
                    alx alx = (alx) alv.instance;
                    C62995dn dnVar = alx.f135356a;
                    if (!dnVar.f170058b) {
                        alx.f135356a = dnVar.mo58980a();
                    }
                    alx.f135356a.put(str2, str3);
                }
            }
            return C60856cj.m92900i(C22402a.m41821a("get_troubleshooter_signals_result", "assistant.api.client_op.GetTroubleshooterSignalsResult", alv.build()));
        } else {
            throw new C22428d(dyVar);
        }
    }
}
