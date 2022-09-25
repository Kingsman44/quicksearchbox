package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122394am;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122419bk;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122430bv;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122445cj;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122454i;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122460o;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122461p;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9282a.C122561k;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9287d.p9288a.C122811k;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9289e.C122859d;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9289e.C122865j;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9289e.C122867l;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123001av;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123061i;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123062j;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123064l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3921j.C52090ew;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p4985f.p4988b.p4995e.C64802b;
import com.google.protos.p4985f.p5030q.C65190ex;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p3186j$.util.Objects;
import p5488io.grpc.Status;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.dc */
/* compiled from: PG */
public final /* synthetic */ class C122831dc implements C122853dy {

    /* renamed from: a */
    public final /* synthetic */ C122870ea f340211a;

    /* renamed from: b */
    public final /* synthetic */ C122430bv f340212b;

    public /* synthetic */ C122831dc(C122870ea eaVar, C122430bv bvVar) {
        this.f340211a = eaVar;
        this.f340212b = bvVar;
    }

    /* renamed from: a */
    public final Status mo105758a(C122811k kVar, C122419bk bkVar) {
        C122394am amVar;
        C122852dx dxVar;
        C122461p pVar;
        C122859d dVar;
        int i;
        String str;
        C65190ex exVar;
        C122445cj cjVar;
        C122870ea eaVar = this.f340211a;
        C122430bv bvVar = this.f340212b;
        if (bvVar.f339421a == 2) {
            amVar = (C122394am) bvVar.f339422b;
        } else {
            amVar = C122394am.f339314f;
        }
        int i2 = amVar.f339317b;
        C59052c cVar = (C59052c) eaVar.f340302c.mo105764c().mo56372aa(34852);
        String str2 = "FulfillmentRequest";
        try {
            JSONObject put = new JSONObject().put("client_id", amVar.f339317b);
            C52091ex exVar2 = amVar.f339318c;
            if (exVar2 == null) {
                exVar2 = C52091ex.f136710b;
            }
            JSONObject put2 = put.put("params", C122865j.m202187d(exVar2));
            int b = C64802b.m96464b(amVar.f339320e);
            if (b != 0) {
                switch (b) {
                    case 2:
                        str = "UNKNOWN_INTERACTION_TYPE";
                        break;
                    case 3:
                        str = "VOICE_ONLY";
                        break;
                    case 4:
                        str = "VOICE_FORWARD";
                        break;
                    case 5:
                        str = "INTERMODAL";
                        break;
                    case 6:
                        str = "VISUAL_ONLY";
                        break;
                    case 7:
                        str = "VISUAL_FORWARD";
                        break;
                }
            }
            str = "UNRECOGNIZED";
            JSONObject put3 = put2.put("interaction", str);
            C122461p pVar2 = amVar.f339316a;
            if (pVar2 == null) {
                pVar2 = C122461p.f339487e;
            }
            int a = C122460o.m201902a(pVar2.f339490b);
            String str3 = a != 1 ? a != 2 ? a != 3 ? "null" : "INPUT_NOT_SET" : "STRUCTURED_INPUT" : "QUERY_INPUT";
            if (a != 0) {
                JSONObject put4 = put3.put("input", str3);
                C122461p pVar3 = amVar.f339316a;
                if ((pVar3 == null ? C122461p.f339487e : pVar3).f339490b == 1) {
                    if (pVar3 == null) {
                        pVar3 = C122461p.f339487e;
                    }
                    if (pVar3.f339490b == 1) {
                        cjVar = (C122445cj) pVar3.f339491c;
                    } else {
                        cjVar = C122445cj.f339450b;
                    }
                    put4.put("query_len", cjVar.f339452a.length());
                } else {
                    if ((pVar3 == null ? C122461p.f339487e : pVar3).f339490b == 2) {
                        if (pVar3 == null) {
                            pVar3 = C122461p.f339487e;
                        }
                        if (pVar3.f339490b == 2) {
                            exVar = (C65190ex) pVar3.f339491c;
                        } else {
                            exVar = C65190ex.f176421b;
                        }
                        put4.put("interactions_len", exVar.f176423a.size());
                    }
                }
                str2 = C122865j.m202184a(put4, str2);
                cVar.mo56389s("Received fulfillment request %s", str2);
                Map map = eaVar.f340317r;
                Integer valueOf = Integer.valueOf(i2);
                if (map.containsKey(valueOf)) {
                    return Status.f186906d.withDescription(String.format(Locale.US, "Duplicate client_request_id value %d", new Object[]{valueOf}));
                }
                C122859d a2 = C122867l.m202189a(eaVar.f340302c, i2);
                C122461p pVar4 = amVar.f339316a;
                if (pVar4 == null) {
                    pVar4 = C122461p.f339487e;
                }
                C122461p pVar5 = pVar4;
                C52091ex exVar3 = amVar.f339318c;
                if (exVar3 == null) {
                    exVar3 = C52091ex.f136710b;
                }
                C122454i iVar = amVar.f339319d;
                if (iVar == null) {
                    iVar = C122454i.f339472b;
                }
                C122454i iVar2 = iVar;
                int b2 = C64802b.m96464b(amVar.f339320e);
                int i3 = b2 == 0 ? 1 : b2;
                Iterator it = eaVar.f340317r.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        C122852dx dxVar2 = (C122852dx) entry.getValue();
                        if (((Integer) entry.getKey()).intValue() == dxVar2.f340276d && pVar5.equals(dxVar2.f340273a)) {
                            dxVar2.f340277e++;
                            ((C59052c) a2.mo105764c().mo56372aa(34839)).mo56387q("Reused fulfillment results from request %s", dxVar2.f340276d);
                            dxVar = dxVar2;
                            pVar = pVar5;
                            dVar = a2;
                            i = i2;
                        }
                    } else {
                        ((C59052c) a2.mo105764c().mo56372aa(34838)).mo56386p("Starting a new fulfillment flow");
                        C123001av a3 = eaVar.f340307h.mo105822a();
                        C122561k a4 = eaVar.f340318s.mo105669a(i2, a3, a2);
                        C52091ex exVar4 = bkVar.f339396c;
                        if (exVar4 == null) {
                            exVar4 = C52091ex.f136710b;
                        }
                        HashMap hashMap = new HashMap();
                        C123062j.m202403a(exVar4, hashMap);
                        C123062j.m202403a(exVar3, hashMap);
                        ArrayList arrayList = new ArrayList();
                        for (String str4 : hashMap.keySet()) {
                            C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
                            kbVar.copyOnWrite();
                            C52232kc kcVar = (C52232kc) kbVar.instance;
                            str4.getClass();
                            kcVar.f137064a |= 1;
                            kcVar.f137065b = str4;
                            C52230ka kaVar = (C52230ka) hashMap.get(str4);
                            kbVar.copyOnWrite();
                            C52232kc kcVar2 = (C52232kc) kbVar.instance;
                            kaVar.getClass();
                            kcVar2.f137066c = kaVar;
                            kcVar2.f137064a |= 2;
                            arrayList.add((C52232kc) kbVar.build());
                        }
                        Collections.sort(arrayList, C123061i.f340623a);
                        C52090ew ewVar = (C52090ew) C52091ex.f136710b.createBuilder();
                        ewVar.mo53790c(arrayList);
                        C52091ex exVar5 = (C52091ex) ewVar.build();
                        C122851dw dwVar = r1;
                        C122851dw dwVar2 = new C122851dw(eaVar, pVar5, bkVar, exVar5, kVar, iVar2, a2);
                        C60870cx c = a3.mo105820c(1003, dwVar);
                        Objects.requireNonNull(kVar);
                        C60870cx c2 = a3.mo105820c(1004, new C122786ct(kVar));
                        C122870ea eaVar2 = eaVar;
                        C60870cx h = C60922j.m93045h(eaVar.f340303d.mo105841a(), C47810es.m84966f(new C122785cs(eaVar2, bkVar, exVar5, pVar5, c)), C60826bg.f164896a);
                        C122787cu cuVar = new C122787cu(eaVar2, c2, a4, i3, bkVar, a2, a3);
                        C122461p pVar6 = pVar5;
                        C123001av avVar = a3;
                        C60870cx h2 = C60922j.m93045h(h, C47810es.m84966f(cuVar), C60826bg.f164896a);
                        pVar = pVar5;
                        C122561k kVar2 = a4;
                        dVar = a2;
                        i = i2;
                        dxVar = new C122852dx(pVar6, h2, kVar2, avVar, i2);
                    }
                }
                eaVar.f340317r.put(Integer.valueOf(i), dxVar);
                C122870ea eaVar3 = eaVar;
                C122859d dVar2 = dVar;
                C123064l.m202406a(C47633f.m84733g(dxVar.f340274b).mo51516i(new C122843do(eaVar3, dVar2, bkVar, dxVar, kVar, pVar, i), eaVar.f340308i).mo51513e(Throwable.class, new C122845dq(eaVar3, dVar2, dxVar, bkVar, i, kVar), eaVar.f340308i), eaVar.f340301b, "callback");
                return Status.f186902OK;
            }
            throw null;
        } catch (JSONException unused) {
        }
    }
}
