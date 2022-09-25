package com.google.android.apps.gsa.staticplugins.opa.p8332bd.p8333a.p8334a;

import android.content.ComponentName;
import androidx.p104d.p105a.C2164c;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123728av;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.p395al.p422e.p423a.p424a.p425a.p426a.C8601a;
import com.google.p395al.p422e.p423a.p424a.p425a.p426a.C8602b;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4403c.p4404a.p4405a.C57737a;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4403c.p4404a.p4405a.C57738b;
import com.google.protobuf.C63088z;
import com.google.protos.youtube.elements.C66179cx;
import com.google.protos.youtube.elements.C66180cy;
import com.google.protos.youtube.elements.C66181cz;
import com.google.protos.youtube.elements.C66187da;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bd.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C107957a implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C107970n f300392a;

    /* renamed from: b */
    public final /* synthetic */ C53306j f300393b;

    /* renamed from: c */
    public final /* synthetic */ C58833ax f300394c;

    /* renamed from: d */
    public final /* synthetic */ C2164c f300395d;

    public /* synthetic */ C107957a(C107970n nVar, C53306j jVar, C58833ax axVar, C2164c cVar) {
        this.f300392a = nVar;
        this.f300393b = jVar;
        this.f300394c = axVar;
        this.f300395d = cVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C2164c cVar;
        C57738b bVar;
        Iterator it;
        C58833ax axVar;
        C107970n nVar;
        C107970n nVar2;
        C2164c cVar2;
        Iterator it2;
        Iterator it3;
        C58833ax axVar2;
        C58833ax axVar3;
        String str;
        boolean z;
        C107970n nVar3 = this.f300392a;
        C53306j jVar = this.f300393b;
        C58833ax axVar4 = this.f300394c;
        C2164c cVar3 = this.f300395d;
        ArrayList arrayList = new ArrayList();
        Iterator it4 = ((List) obj).iterator();
        int i = 0;
        while (true) {
            if (!it4.hasNext()) {
                cVar = cVar3;
                C57737a aVar = (C57737a) C57738b.f154252b.createBuilder();
                aVar.mo54527a(arrayList);
                bVar = (C57738b) aVar.build();
                break;
            }
            C123728av avVar = (C123728av) it4.next();
            String str2 = avVar.f341756b;
            ((C59052c) ((C59052c) C107970n.f300422a.mo56224b()).mo56372aa(26911)).mo56352E("MediaItem from App {%s} size (%d}", str2, avVar.f341758d.size());
            if ((axVar4.mo56113h() && !((ComponentName) axVar4.mo56107c()).getPackageName().equals(avVar.f341756b)) || avVar.f341758d.isEmpty()) {
                ((C59052c) ((C59052c) C107970n.f300422a.mo56224b()).mo56372aa(26913)).mo56359L("Prefer app {%s} skipped cached app (%s} size {%d}", ((ComponentName) axVar4.mo56107c()).getPackageName(), avVar.f341756b, Integer.valueOf(avVar.f341758d.size()));
            } else if ((!nVar3.f300435n.contains(jVar.name()) || nVar3.f300429h.mo81719a(str2)) && !avVar.f341758d.isEmpty()) {
                C58833ax b = nVar3.mo96348b(str2);
                C58833ax a = nVar3.mo96347a(nVar3.f300436o, new ComponentName(str2, avVar.f341757c));
                C58833ax c = C107970n.m179252c(nVar3.f300423b, str2);
                Iterator it5 = avVar.f341758d.iterator();
                while (it5.hasNext()) {
                    C52560wg wgVar = (C52560wg) it5.next();
                    if (wgVar.f137952h.isEmpty() || (wgVar.f137945a & 8) == 0) {
                        nVar2 = nVar3;
                        axVar2 = axVar4;
                        cVar2 = cVar3;
                        it3 = it4;
                        it2 = it5;
                        ((C59052c) ((C59052c) C107970n.f300422a.mo56226d()).mo56372aa(26906)).mo56386p("Media ID or Metadata is empty or NULL");
                        axVar3 = C58836b.f156633a;
                    } else {
                        C52568wo woVar = wgVar.f137950f;
                        if (woVar == null) {
                            woVar = C52568wo.f137992v;
                        }
                        String str3 = woVar.f137998e;
                        if (!woVar.f138002i.isEmpty()) {
                            axVar2 = axVar4;
                            str = woVar.f138002i;
                        } else if (woVar.f138011r.isEmpty()) {
                            str = BuildConfig.FLAVOR;
                            axVar2 = axVar4;
                        } else {
                            axVar2 = axVar4;
                            str = (String) woVar.f138011r.get(0);
                        }
                        C51012dc dcVar = woVar.f138004k;
                        if (dcVar == null) {
                            dcVar = C51012dc.f132813k;
                        }
                        String str4 = dcVar.f132817c;
                        it3 = it4;
                        C51012dc dcVar2 = woVar.f138004k;
                        if (dcVar2 == null) {
                            dcVar2 = C51012dc.f132813k;
                        }
                        if ((dcVar2.f132815a & 8) != 0) {
                            it2 = it5;
                            z = true;
                        } else {
                            it2 = it5;
                            z = false;
                        }
                        if (!woVar.f137998e.isEmpty() && !str.isEmpty() && (woVar.f137994a & 1024) != 0) {
                            C51012dc dcVar3 = woVar.f138004k;
                            if (dcVar3 == null) {
                                dcVar3 = C51012dc.f132813k;
                            }
                            if (dcVar3.f132817c.isEmpty()) {
                                if (z) {
                                    z = true;
                                }
                            }
                            C8601a aVar2 = (C8601a) C8602b.f29817k.createBuilder();
                            aVar2.copyOnWrite();
                            cVar2 = cVar3;
                            C8602b bVar2 = (C8602b) aVar2.instance;
                            str3.getClass();
                            nVar2 = nVar3;
                            bVar2.f29819a |= 1;
                            bVar2.f29824f = str3;
                            aVar2.copyOnWrite();
                            C8602b bVar3 = (C8602b) aVar2.instance;
                            str.getClass();
                            bVar3.f29819a |= 32;
                            bVar3.f29825g = str;
                            aVar2.copyOnWrite();
                            C8602b bVar4 = (C8602b) aVar2.instance;
                            str4.getClass();
                            bVar4.f29820b = 4;
                            bVar4.f29821c = str4;
                            String d = C107970n.m179253d(str2, wgVar.f137952h);
                            aVar2.copyOnWrite();
                            C8602b bVar5 = (C8602b) aVar2.instance;
                            d.getClass();
                            bVar5.f29819a |= 256;
                            bVar5.f29826h = d;
                            if (jVar != null && jVar.equals(C53306j.MAIN_APP)) {
                                aVar2.copyOnWrite();
                                C8602b bVar6 = (C8602b) aVar2.instance;
                                bVar6.f29819a |= 512;
                                bVar6.f29827i = 101571;
                            }
                            if (z) {
                                C66179cx cxVar = (C66179cx) C66180cy.f179956b.createBuilder();
                                C66181cz czVar = (C66181cz) C66187da.f179977f.createBuilder();
                                C51012dc dcVar4 = woVar.f138004k;
                                if (dcVar4 == null) {
                                    dcVar4 = C51012dc.f132813k;
                                }
                                C63088z zVar = dcVar4.f132819e;
                                czVar.copyOnWrite();
                                C66187da daVar = (C66187da) czVar.instance;
                                zVar.getClass();
                                daVar.f179980b = 2;
                                daVar.f179981c = zVar;
                                cxVar.mo59444a(czVar);
                                aVar2.copyOnWrite();
                                C8602b bVar7 = (C8602b) aVar2.instance;
                                C66180cy cyVar = (C66180cy) cxVar.build();
                                cyVar.getClass();
                                bVar7.f29821c = cyVar;
                                bVar7.f29820b = 16;
                            }
                            if (c.mo56113h()) {
                                String str5 = (String) c.mo56107c();
                                aVar2.copyOnWrite();
                                C8602b bVar8 = (C8602b) aVar2.instance;
                                str5.getClass();
                                bVar8.f29819a |= 4096;
                                bVar8.f29828j = str5;
                            }
                            if (b.mo56113h() && !((String) b.mo56107c()).isEmpty()) {
                                String str6 = (String) b.mo56107c();
                                aVar2.copyOnWrite();
                                C8602b bVar9 = (C8602b) aVar2.instance;
                                str6.getClass();
                                bVar9.f29822d = 9;
                                bVar9.f29823e = str6;
                            }
                            if (((C8602b) aVar2.instance).f29822d != 9 && a.mo56113h()) {
                                C66179cx cxVar2 = (C66179cx) C66180cy.f179956b.createBuilder();
                                C66181cz czVar2 = (C66181cz) C66187da.f179977f.createBuilder();
                                C63088z A = C63088z.m96139A((byte[]) a.mo56107c());
                                czVar2.copyOnWrite();
                                C66187da daVar2 = (C66187da) czVar2.instance;
                                daVar2.f179980b = 2;
                                daVar2.f179981c = A;
                                cxVar2.mo59444a(czVar2);
                                aVar2.copyOnWrite();
                                C8602b bVar10 = (C8602b) aVar2.instance;
                                C66180cy cyVar2 = (C66180cy) cxVar2.build();
                                cyVar2.getClass();
                                bVar10.f29823e = cyVar2;
                                bVar10.f29822d = 14;
                            }
                            axVar3 = C58833ax.m90834k((C8602b) aVar2.build());
                        }
                        nVar2 = nVar3;
                        cVar2 = cVar3;
                        ((C59052c) ((C59052c) C107970n.f300422a.mo56226d()).mo56372aa(26908)).mo56389s("Missing key description content {%s}.", wgVar.f137952h);
                        axVar3 = C58836b.f156633a;
                    }
                    if (axVar3.mo56113h()) {
                        arrayList.add((C8602b) axVar3.mo56107c());
                    }
                    axVar4 = axVar2;
                    it4 = it3;
                    it5 = it2;
                    cVar3 = cVar2;
                    nVar3 = nVar2;
                }
                axVar = axVar4;
                cVar = cVar3;
                it = it4;
                i++;
                nVar = nVar3;
                if (i >= nVar.f300434m) {
                    C57737a aVar3 = (C57737a) C57738b.f154252b.createBuilder();
                    aVar3.mo54527a(arrayList);
                    bVar = (C57738b) aVar3.build();
                    break;
                }
                nVar3 = nVar;
                axVar4 = axVar;
                it4 = it;
                cVar3 = cVar;
            }
            nVar = nVar3;
            axVar = axVar4;
            cVar = cVar3;
            it = it4;
            nVar3 = nVar;
            axVar4 = axVar;
            it4 = it;
            cVar3 = cVar;
        }
        bVar.f154254a.size();
        cVar.mo5437b(bVar);
    }
}
