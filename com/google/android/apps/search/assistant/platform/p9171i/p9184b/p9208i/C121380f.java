package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9208i;

import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121241e;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121253q;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121255s;
import com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9208i.p9209a.C121375a;
import com.google.assistant.p3781ad.p3789d.p3790a.C48552e;
import com.google.assistant.p3781ad.p3789d.p3790a.C48553f;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.assistant.p3781ad.p3789d.p3791b.C48689ax;
import com.google.assistant.p3781ad.p3789d.p3791b.C48691az;
import com.google.assistant.p3781ad.p3789d.p3791b.C48693ba;
import com.google.assistant.p3781ad.p3789d.p3791b.C48694bb;
import com.google.assistant.p3781ad.p3789d.p3791b.C48695bc;
import com.google.assistant.p3781ad.p3789d.p3791b.C48696bd;
import com.google.assistant.p3781ad.p3789d.p3791b.C48697be;
import com.google.assistant.p3781ad.p3789d.p3791b.C48698bf;
import com.google.assistant.p3781ad.p3789d.p3791b.C48699bg;
import com.google.assistant.p3781ad.p3789d.p3791b.C48700bh;
import com.google.assistant.p3781ad.p3789d.p3791b.C48701bi;
import com.google.assistant.p3781ad.p3789d.p3791b.C48702bj;
import com.google.assistant.p3781ad.p3789d.p3791b.C48703bk;
import com.google.assistant.p3781ad.p3789d.p3791b.C48704bl;
import com.google.assistant.p3781ad.p3789d.p3791b.C48705bm;
import com.google.assistant.p3781ad.p3789d.p3791b.C48706bn;
import com.google.assistant.p3781ad.p3789d.p3791b.C48707bo;
import com.google.assistant.p3781ad.p3789d.p3791b.C48708bp;
import com.google.assistant.p3781ad.p3789d.p3791b.C48709bq;
import com.google.assistant.p3781ad.p3789d.p3791b.C48710br;
import com.google.assistant.p3825an.p3830c.p3831a.C49270ap;
import com.google.assistant.p3825an.p3830c.p3831a.C49271aq;
import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import com.google.assistant.p3825an.p3830c.p3831a.C49308c;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.p4129b.p4136c.C54761i;
import com.google.protobuf.C62995dn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.i.f */
/* compiled from: PG */
public final class C121380f implements C121375a {
    /* renamed from: a */
    public final C58485gu mo105117a(Map map, Map map2) {
        Iterator it;
        C58485gu f;
        map.size();
        map2.size();
        C58480gp e = C58485gu.m89837e();
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            C49301bt btVar = (C49301bt) map2.get(entry.getKey());
            if (btVar == null) {
                entry.getKey();
            } else {
                C121241e eVar = (C121241e) entry.getValue();
                C58480gp e2 = C58485gu.m89837e();
                C49271aq aqVar = btVar.f127428d;
                if (aqVar == null) {
                    aqVar = C49271aq.f127363b;
                }
                Iterator it3 = aqVar.f127365a.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        it = it2;
                        f = e2.mo55394f();
                        break;
                    }
                    C49270ap apVar = (C49270ap) it3.next();
                    String str = apVar.f127356b;
                    C54761i iVar = btVar.f127429e;
                    if (iVar == null) {
                        iVar = C54761i.f143683c;
                    }
                    if (Collection.EL.stream(iVar.f143685a).filter(new C121374a(apVar)).map(C121376b.f337006a).findFirst().isEmpty()) {
                        C49308c cVar = apVar.f127359e;
                        if (cVar == null) {
                            cVar = C49308c.f127443c;
                        }
                        String str2 = cVar.f127445a;
                        f = C58485gu.m89845m();
                        it = it2;
                    } else {
                        C49308c cVar2 = apVar.f127359e;
                        if (cVar2 == null) {
                            cVar2 = C49308c.f127443c;
                        }
                        Map map3 = (Map) Collection.EL.stream(Collections.unmodifiableMap(cVar2.f127446b).entrySet()).collect(C58370cn.m89403c(C121377c.f337007a, C121378d.f337008a, C121379e.f337009a));
                        C48707bo boVar = (C48707bo) C48708bp.f126010g.createBuilder();
                        C48672ag agVar = C48672ag.APP_ACTIONS_SHORTCUT;
                        boVar.copyOnWrite();
                        C48708bp bpVar = (C48708bp) boVar.instance;
                        bpVar.f126013b = agVar.f125915O;
                        bpVar.f126012a |= 1;
                        C48709bq bqVar = (C48709bq) C48710br.f126019d.createBuilder();
                        bqVar.mo53171a(eVar.f336786c);
                        bqVar.mo53172b(str);
                        boVar.copyOnWrite();
                        C48708bp bpVar2 = (C48708bp) boVar.instance;
                        C48710br brVar = (C48710br) bqVar.build();
                        brVar.getClass();
                        bpVar2.f126014c = brVar;
                        bpVar2.f126012a |= 2;
                        C48705bm bmVar = (C48705bm) C48706bn.f126002f.createBuilder();
                        C48552e eVar2 = (C48552e) C48553f.f125431e.createBuilder();
                        if ((eVar.f336784a & 4) != 0) {
                            String str3 = eVar.f336787d;
                            eVar2.copyOnWrite();
                            C48553f fVar = (C48553f) eVar2.instance;
                            str3.getClass();
                            fVar.f125434b = 1;
                            fVar.f125435c = str3;
                            eVar2.copyOnWrite();
                            C48553f fVar2 = (C48553f) eVar2.instance;
                            fVar2.f125436d = 1;
                            fVar2.f125433a |= 4;
                        } else {
                            String str4 = eVar.f336785b;
                            eVar2.copyOnWrite();
                            C48553f fVar3 = (C48553f) eVar2.instance;
                            str4.getClass();
                            fVar3.f125434b = 2;
                            fVar3.f125435c = str4;
                            eVar2.copyOnWrite();
                            C48553f fVar4 = (C48553f) eVar2.instance;
                            fVar4.f125436d = 3;
                            fVar4.f125433a |= 4;
                        }
                        C48701bi biVar = (C48701bi) C48702bj.f125992e.createBuilder();
                        String str5 = eVar.f336786c;
                        biVar.copyOnWrite();
                        C48702bj bjVar = (C48702bj) biVar.instance;
                        str5.getClass();
                        Iterator it4 = it2;
                        bjVar.f125994a |= 1;
                        bjVar.f125995b = str5;
                        String str6 = eVar.f336785b;
                        biVar.copyOnWrite();
                        C48702bj bjVar2 = (C48702bj) biVar.instance;
                        str6.getClass();
                        bjVar2.f125994a |= 2;
                        bjVar2.f125996c = str6;
                        biVar.copyOnWrite();
                        C48702bj bjVar3 = (C48702bj) biVar.instance;
                        C48553f fVar5 = (C48553f) eVar2.build();
                        fVar5.getClass();
                        bjVar3.f125997d = fVar5;
                        bjVar3.f125994a |= 4;
                        C48702bj bjVar4 = (C48702bj) biVar.build();
                        bmVar.copyOnWrite();
                        C48706bn bnVar = (C48706bn) bmVar.instance;
                        bjVar4.getClass();
                        bnVar.f126005b = bjVar4;
                        bnVar.f126004a |= 1;
                        C48697be beVar = (C48697be) C48698bf.f125984c.createBuilder();
                        beVar.copyOnWrite();
                        C48698bf bfVar = (C48698bf) beVar.instance;
                        str.getClass();
                        bfVar.f125986a |= 1;
                        bfVar.f125987b = str;
                        bmVar.copyOnWrite();
                        C48706bn bnVar2 = (C48706bn) bmVar.instance;
                        C48698bf bfVar2 = (C48698bf) beVar.build();
                        bfVar2.getClass();
                        bnVar2.f126006c = bfVar2;
                        bnVar2.f126004a |= 2;
                        boVar.copyOnWrite();
                        C48708bp bpVar3 = (C48708bp) boVar.instance;
                        C48706bn bnVar3 = (C48706bn) bmVar.build();
                        bnVar3.getClass();
                        bpVar3.f126016e = bnVar3;
                        bpVar3.f126012a |= 8;
                        C48695bc bcVar = (C48695bc) C48696bd.f125977e.createBuilder();
                        C48689ax axVar = (C48689ax) C48691az.f125967d.createBuilder();
                        C49308c cVar3 = apVar.f127359e;
                        if (cVar3 == null) {
                            cVar3 = C49308c.f127443c;
                        }
                        String str7 = cVar3.f127445a;
                        axVar.copyOnWrite();
                        C48691az azVar = (C48691az) axVar.instance;
                        str7.getClass();
                        azVar.f125969a |= 1;
                        azVar.f125970b = str7;
                        axVar.copyOnWrite();
                        C48691az azVar2 = (C48691az) axVar.instance;
                        C62995dn dnVar = azVar2.f125971c;
                        if (!dnVar.f170058b) {
                            azVar2.f125971c = dnVar.mo58980a();
                        }
                        azVar2.f125971c.putAll(map3);
                        bcVar.copyOnWrite();
                        C48696bd bdVar = (C48696bd) bcVar.instance;
                        C48691az azVar3 = (C48691az) axVar.build();
                        azVar3.getClass();
                        bdVar.f125982d = azVar3;
                        bdVar.f125979a |= 8;
                        boVar.copyOnWrite();
                        C48708bp bpVar4 = (C48708bp) boVar.instance;
                        C48696bd bdVar2 = (C48696bd) bcVar.build();
                        bdVar2.getClass();
                        bpVar4.f126017f = bdVar2;
                        bpVar4.f126012a |= 16;
                        e2.mo55395g((C48708bp) boVar.build());
                        it2 = it4;
                    }
                }
                e.mo55396h(f);
                it2 = it;
            }
        }
        return e.mo55394f();
    }

    /* renamed from: b */
    public final List mo105118b(Map map, Map map2, int i) {
        ArrayList arrayList = new ArrayList();
        int i2 = i;
        if (i2 != 2) {
            i2 = 3;
        }
        map.size();
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            C121241e eVar = (C121241e) map.get(str);
            if (eVar != null) {
                for (C121253q qVar : ((C121255s) entry.getValue()).f336819a) {
                    String str2 = (qVar.f336809a & 2) != 0 ? qVar.f336811c : qVar.f336812d;
                    C48705bm bmVar = (C48705bm) C48706bn.f126002f.createBuilder();
                    C48701bi biVar = (C48701bi) C48702bj.f125992e.createBuilder();
                    String str3 = eVar.f336786c;
                    biVar.copyOnWrite();
                    C48702bj bjVar = (C48702bj) biVar.instance;
                    str3.getClass();
                    bjVar.f125994a |= 1;
                    bjVar.f125995b = str3;
                    String str4 = (String) entry.getKey();
                    biVar.copyOnWrite();
                    C48702bj bjVar2 = (C48702bj) biVar.instance;
                    str4.getClass();
                    bjVar2.f125994a |= 2;
                    bjVar2.f125996c = str4;
                    C48702bj bjVar3 = (C48702bj) biVar.build();
                    bmVar.copyOnWrite();
                    C48706bn bnVar = (C48706bn) bmVar.instance;
                    bjVar3.getClass();
                    bnVar.f126005b = bjVar3;
                    bnVar.f126004a |= 1;
                    if (i2 == 3) {
                        C48699bg bgVar = (C48699bg) C48700bh.f125988c.createBuilder();
                        bgVar.copyOnWrite();
                        C48700bh bhVar = (C48700bh) bgVar.instance;
                        str2.getClass();
                        bhVar.f125990a |= 1;
                        bhVar.f125991b = str2;
                        C48700bh bhVar2 = (C48700bh) bgVar.build();
                        bmVar.copyOnWrite();
                        C48706bn bnVar2 = (C48706bn) bmVar.instance;
                        bhVar2.getClass();
                        bnVar2.f126008e = bhVar2;
                        bnVar2.f126004a |= 8;
                    } else {
                        C48703bk bkVar = (C48703bk) C48704bl.f125998c.createBuilder();
                        bkVar.copyOnWrite();
                        C48704bl blVar = (C48704bl) bkVar.instance;
                        str2.getClass();
                        blVar.f126000a |= 1;
                        blVar.f126001b = str2;
                        C48704bl blVar2 = (C48704bl) bkVar.build();
                        bmVar.copyOnWrite();
                        C48706bn bnVar3 = (C48706bn) bmVar.instance;
                        blVar2.getClass();
                        bnVar3.f126007d = blVar2;
                        bnVar3.f126004a |= 4;
                    }
                    C48707bo boVar = (C48707bo) C48708bp.f126010g.createBuilder();
                    C48672ag agVar = C48672ag.APP_SHORTCUTS;
                    boVar.copyOnWrite();
                    C48708bp bpVar = (C48708bp) boVar.instance;
                    bpVar.f126013b = agVar.f125915O;
                    bpVar.f126012a |= 1;
                    C48709bq bqVar = (C48709bq) C48710br.f126019d.createBuilder();
                    bqVar.mo53171a(eVar.f336786c);
                    bqVar.mo53172b(str2);
                    boVar.copyOnWrite();
                    C48708bp bpVar2 = (C48708bp) boVar.instance;
                    C48710br brVar = (C48710br) bqVar.build();
                    brVar.getClass();
                    bpVar2.f126014c = brVar;
                    bpVar2.f126012a |= 2;
                    boVar.copyOnWrite();
                    C48708bp bpVar3 = (C48708bp) boVar.instance;
                    C48706bn bnVar4 = (C48706bn) bmVar.build();
                    bnVar4.getClass();
                    bpVar3.f126016e = bnVar4;
                    bpVar3.f126012a |= 8;
                    C48695bc bcVar = (C48695bc) C48696bd.f125977e.createBuilder();
                    C48693ba baVar = (C48693ba) C48694bb.f125972d.createBuilder();
                    String str5 = qVar.f336813e;
                    baVar.copyOnWrite();
                    C48694bb bbVar = (C48694bb) baVar.instance;
                    str5.getClass();
                    bbVar.f125974a |= 1;
                    bbVar.f125975b = str5;
                    baVar.copyOnWrite();
                    C48694bb bbVar2 = (C48694bb) baVar.instance;
                    str.getClass();
                    bbVar2.f125974a |= 2;
                    bbVar2.f125976c = str;
                    bcVar.copyOnWrite();
                    C48696bd bdVar = (C48696bd) bcVar.instance;
                    C48694bb bbVar3 = (C48694bb) baVar.build();
                    bbVar3.getClass();
                    bdVar.f125981c = bbVar3;
                    bdVar.f125979a |= 4;
                    boVar.copyOnWrite();
                    C48708bp bpVar4 = (C48708bp) boVar.instance;
                    C48696bd bdVar2 = (C48696bd) bcVar.build();
                    bdVar2.getClass();
                    bpVar4.f126017f = bdVar2;
                    bpVar4.f126012a |= 16;
                    arrayList.add((C48708bp) boVar.build());
                }
            }
        }
        arrayList.size();
        return arrayList;
    }
}
