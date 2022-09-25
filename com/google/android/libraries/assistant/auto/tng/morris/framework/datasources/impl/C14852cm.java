package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import android.content.ComponentName;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123728av;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123730ax;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123742bi;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.p9330a.C123704b;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.p9330a.C123706d;
import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14782b;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14216b;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14290dt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14292dv;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14626qe;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.assistant.p3745ab.C48258bo;
import com.google.assistant.p3745ab.C48260bq;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.assistant.p3980n.p3985c.C53020k;
import com.google.assistant.p3980n.p3985c.C53024o;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59710cy;
import com.google.common.p4552o.C59711cz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C63037fb;
import com.google.protobuf.C63063ga;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.cm */
/* compiled from: PG */
public final /* synthetic */ class C14852cm implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C14856cq f44711a;

    /* renamed from: b */
    public final /* synthetic */ String f44712b;

    public /* synthetic */ C14852cm(C14856cq cqVar, String str) {
        this.f44711a = cqVar;
        this.f44712b = str;
    }

    public final C60870cx apply(Object obj) {
        C123730ax axVar;
        C123730ax axVar2;
        C51016dg dgVar;
        C14856cq cqVar = this.f44711a;
        String str = this.f44712b;
        C123746bm bmVar = (C123746bm) obj;
        for (C123744bk bkVar : bmVar.f341820a) {
            C58976aa aaVar = C58975e.f156826a;
            int i = bkVar.f341815j;
            int i2 = bkVar.f341810e;
            if (bkVar.f341808c == 5) {
                for (C123728av avVar : ((C123730ax) bkVar.f341809d).f341769a) {
                    String k = C14856cq.m31239k(avVar.f341756b, avVar.f341757c);
                    avVar.f341758d.size();
                    List l = cqVar.mo21778l(k);
                    for (C52560wg wgVar : avVar.f341758d) {
                        if (!wgVar.f137952h.isEmpty()) {
                            l.add(cqVar.mo21777j(wgVar));
                        }
                    }
                    cqVar.f44722h.put(k, l);
                }
            }
            if (bkVar.f341808c == 6) {
                C123742bi biVar = (C123742bi) bkVar.f341809d;
                biVar.f341802a.size();
                if (C14856cq.m31240n(str)) {
                    List l2 = cqVar.mo21778l(str);
                    for (C53020k kVar : biVar.f341802a) {
                        C53024o oVar = kVar.f138973b;
                        if (oVar == null) {
                            oVar = C53024o.f138977d;
                        }
                        int i3 = oVar.f138981c;
                        String str2 = oVar.f138980b;
                        kVar.f138974c.size();
                        for (C52560wg wgVar2 : kVar.f138974c) {
                            if (wgVar2.f137952h.isEmpty()) {
                                if (wgVar2.f137946b == 16) {
                                    dgVar = (C51016dg) wgVar2.f137947c;
                                } else {
                                    dgVar = C51016dg.f132827g;
                                }
                                if ((dgVar.f132829a & 8) == 0 && (wgVar2.f137945a & 32) == 0) {
                                }
                            }
                            l2.add(cqVar.mo21777j(wgVar2));
                        }
                    }
                    cqVar.f44722h.put(str, l2);
                }
            }
        }
        if (cqVar.f44722h.isEmpty()) {
            C59104x c = C14856cq.f44715a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.MediaPcpDataSrc");
            ((C59052c) ((C59052c) c).mo56372aa(45626)).mo56386p("#buildAppListAndSetAppInfo() failed, app map is empty");
        } else {
            for (Map.Entry entry : cqVar.f44722h.entrySet()) {
                String str3 = (String) entry.getKey();
                if (C14856cq.m31240n(str3)) {
                    ArrayList arrayList = new ArrayList();
                    for (C14292dv dvVar : (List) entry.getValue()) {
                        C14216b bVar = dvVar.f43239e;
                        if (bVar == null) {
                            bVar = C14216b.f43007f;
                        }
                        String str4 = bVar.f43011c;
                        String str5 = bVar.f43012d;
                        if ((bVar.f43009a == 4 ? (String) bVar.f43010b : BuildConfig.FLAVOR).isEmpty() && bVar.f43009a != 3 && !str4.isEmpty()) {
                            bVar = cqVar.mo21776f(str4, str5);
                        }
                        C14290dt dtVar = (C14290dt) dvVar.toBuilder();
                        dtVar.copyOnWrite();
                        bVar.getClass();
                        ((C14292dv) dtVar.instance).f43239e = bVar;
                        arrayList.add((C14292dv) dtVar.build());
                    }
                    cqVar.f44722h.put(str3, arrayList);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    ComponentName unflattenFromString = ComponentName.unflattenFromString(str3);
                    unflattenFromString.getClass();
                    C14216b f = cqVar.mo21776f(unflattenFromString.getPackageName(), unflattenFromString.getClassName());
                    C58976aa aaVar2 = C58975e.f156826a;
                    for (C14292dv builder : (List) entry.getValue()) {
                        C14290dt dtVar2 = (C14290dt) builder.toBuilder();
                        dtVar2.copyOnWrite();
                        f.getClass();
                        ((C14292dv) dtVar2.instance).f43239e = f;
                        arrayList2.add((C14292dv) dtVar2.build());
                    }
                    cqVar.f44722h.put(str3, arrayList2);
                }
            }
        }
        if (cqVar.f44721g.mo79746e(C90051dc.f248856bK)) {
            C58976aa aaVar3 = C58975e.f156826a;
            bmVar.f341820a.size();
            C14626qe qeVar = C14626qe.STATUS_UNKNOWN;
            Iterator it = bmVar.f341820a.iterator();
            loop8:
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C123744bk bkVar2 = (C123744bk) it.next();
                if (bkVar2.f341808c == 5) {
                    int size = ((C123730ax) bkVar2.f341809d).f341769a.size();
                    if (size <= 1) {
                        if (bkVar2.f341808c == 5) {
                            axVar2 = (C123730ax) bkVar2.f341809d;
                        } else {
                            axVar2 = C123730ax.f341767b;
                        }
                        Iterator it2 = axVar2.f341769a.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                continue;
                                break;
                            }
                            C123728av avVar2 = (C123728av) it2.next();
                            if (!"com.google.android.apps.youtube.music".equals(avVar2.f341756b)) {
                                break loop8;
                            }
                            C63037fb fbVar = avVar2.f341763i;
                            if (fbVar == null) {
                                fbVar = C63037fb.f170144b;
                            }
                            Map unmodifiableMap = Collections.unmodifiableMap(fbVar.f170146a);
                            if (unmodifiableMap.containsKey("com.google.android.apps.youtube.music.mediabrowser.user_has_premium_entitlement")) {
                                C63063ga gaVar = (C63063ga) unmodifiableMap.get("com.google.android.apps.youtube.music.mediabrowser.user_has_premium_entitlement");
                                gaVar.getClass();
                                qeVar = (gaVar.f170181a != 4 || !((Boolean) gaVar.f170182b).booleanValue()) ? C14626qe.YOUTUBE_FREE_USER : C14626qe.YOUTUBE_PREMIUM_USER;
                            }
                        }
                    } else {
                        C59104x d = C14856cq.f44715a.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "Morris.MediaPcpDataSrc");
                        ((C59052c) ((C59052c) d).mo56372aa(45629)).mo56387q("#logPcpResult OnDeviceDataCount: %d should not happen", size);
                        break;
                    }
                }
            }
            cqVar.f44723i.set(qeVar);
        }
        C58976aa aaVar4 = C58975e.f156826a;
        bmVar.f341820a.size();
        int i4 = 1;
        int i5 = 1;
        for (C123744bk bkVar3 : bmVar.f341820a) {
            if (bkVar3.f341808c == 5) {
                int size2 = ((C123730ax) bkVar3.f341809d).f341769a.size();
                if (size2 != 1) {
                    C59104x d2 = C14856cq.f44715a.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "Morris.MediaPcpDataSrc");
                    ((C59052c) ((C59052c) d2).mo56372aa(45632)).mo56387q("#logPcpResult OnDeviceDataCount: %d should not happen", size2);
                } else {
                    if (bkVar3.f341808c == 5) {
                        axVar = (C123730ax) bkVar3.f341809d;
                    } else {
                        axVar = C123730ax.f341767b;
                    }
                    for (C123728av avVar3 : axVar.f341769a) {
                        int b = C123706d.m203075b(avVar3.f341761g);
                        if (b == 0) {
                            b = 1;
                        }
                        int a = C123704b.m203073a(avVar3.f341762h);
                        if (a == 0) {
                            a = 1;
                        }
                        String str6 = avVar3.f341756b;
                        String str7 = avVar3.f341757c;
                        i4 = b;
                        i5 = a;
                    }
                }
            }
            int i6 = bkVar3.f341808c;
        }
        C37215b bVar2 = cqVar.f44719e;
        C37252a c2 = C37182a.f97786aR.mo40779c();
        C62940bt btVar = C59711cz.f160208s;
        C59710cy cyVar = (C59710cy) C59711cz.f160207r.createBuilder();
        C48258bo boVar = (C48258bo) C48260bq.f124825o.createBuilder();
        boVar.copyOnWrite();
        C48260bq bqVar = (C48260bq) boVar.instance;
        bqVar.f124833g = i4 - 1;
        bqVar.f124827a |= 32;
        boVar.copyOnWrite();
        C48260bq bqVar2 = (C48260bq) boVar.instance;
        bqVar2.f124834h = i5 - 1;
        bqVar2.f124827a |= 64;
        cyVar.copyOnWrite();
        C59711cz czVar = (C59711cz) cyVar.instance;
        C48260bq bqVar3 = (C48260bq) boVar.build();
        bqVar3.getClass();
        czVar.f160214e = bqVar3;
        czVar.f160210a |= 32;
        ((C37253b) c2).mo40792p(btVar, (C59711cz) cyVar.build());
        bVar2.mo19974a(c2);
        return C60856cj.m92900i(C14782b.SUCCESS);
    }
}
