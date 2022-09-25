package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9210j.p9215d;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121219ad;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121220ae;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121245i;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121247k;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121248l;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121251o;
import com.google.assistant.p3781ad.p3789d.p3791b.C48714bv;
import com.google.assistant.p3825an.p3830c.p3831a.C49261ag;
import com.google.assistant.p3825an.p3830c.p3831a.C49290bi;
import com.google.assistant.p3825an.p3830c.p3831a.C49291bj;
import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import com.google.common.base.C58817ah;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4535g.C59203do;
import com.google.protobuf.C62995dn;
import java.util.Collections;
import java.util.HashMap;
import p001a.p013c.C0034c;
import p001a.p013c.C0036e;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.j.d.a */
/* compiled from: PG */
public final /* synthetic */ class C121398a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C121399b f337039a;

    public /* synthetic */ C121398a(C121399b bVar) {
        this.f337039a = bVar;
    }

    public final Object apply(Object obj) {
        C121399b bVar = this.f337039a;
        C121219ad adVar = (C121219ad) C121220ae.f336741f.createBuilder();
        long epochMilli = bVar.f337040a.mo57444a().toEpochMilli();
        adVar.copyOnWrite();
        C121220ae aeVar = (C121220ae) adVar.instance;
        aeVar.f336743a |= 1;
        aeVar.f336746d = epochMilli;
        C48714bv bvVar = C48714bv.APP_NICKNAME_SIGNAL;
        adVar.copyOnWrite();
        C121220ae aeVar2 = (C121220ae) adVar.instance;
        aeVar2.f336747e = bvVar.f126042j;
        aeVar2.f336743a |= 2;
        C121245i iVar = (C121245i) C121251o.f336804b.createBuilder();
        HashMap hashMap = new HashMap();
        for (C49301bt btVar : (C58485gu) obj) {
            String str = btVar.f127426b;
            if (!str.isEmpty()) {
                C49261ag agVar = btVar.f127427c;
                if (agVar == null) {
                    agVar = C49261ag.f127334e;
                }
                for (C49291bj bjVar : agVar.f127337b) {
                    C49261ag agVar2 = btVar.f127427c;
                    if (agVar2 == null) {
                        agVar2 = C49261ag.f127334e;
                    }
                    String str2 = agVar2.f127336a;
                    String c = C58890d.m90988c(bjVar.f127397a);
                    if (!c.contains(str) && !c.contains(C58890d.m90988c(str2))) {
                        int a = C49290bi.m85405a(bjVar.f127399c);
                        if (a != 0 && a == 3) {
                            C0034c cVar = bjVar.f127398b;
                            if (cVar == null) {
                                cVar = C0034c.f98b;
                            }
                            if (Collections.unmodifiableMap(cVar.f100a).containsKey(BuildConfig.FLAVOR)) {
                                C0034c cVar2 = bjVar.f127398b;
                                if (cVar2 == null) {
                                    cVar2 = C0034c.f98b;
                                }
                                C0036e eVar = (C0036e) Collections.unmodifiableMap(cVar2.f100a).get(BuildConfig.FLAVOR);
                                double d = eVar != null ? (double) eVar.f103a : C59203do.f157270a;
                                C121247k kVar = (C121247k) C121248l.f336794f.createBuilder();
                                kVar.copyOnWrite();
                                C121248l lVar = (C121248l) kVar.instance;
                                lVar.f336796a |= 1;
                                lVar.f336797b = BuildConfig.FLAVOR;
                                kVar.copyOnWrite();
                                C121248l lVar2 = (C121248l) kVar.instance;
                                str2.getClass();
                                lVar2.f336796a |= 2;
                                lVar2.f336798c = str2;
                                kVar.copyOnWrite();
                                C121248l lVar3 = (C121248l) kVar.instance;
                                str.getClass();
                                lVar3.f336796a |= 4;
                                lVar3.f336799d = str;
                                kVar.copyOnWrite();
                                C121248l lVar4 = (C121248l) kVar.instance;
                                lVar4.f336796a |= 8;
                                lVar4.f336800e = d;
                                C121399b.m200644e(hashMap, c, (C121248l) kVar.build());
                            }
                        }
                        int a2 = C49290bi.m85405a(bjVar.f127399c);
                        if (a2 != 0 && a2 == 2) {
                            C121247k kVar2 = (C121247k) C121248l.f336794f.createBuilder();
                            kVar2.copyOnWrite();
                            C121248l lVar5 = (C121248l) kVar2.instance;
                            lVar5.f336796a |= 1;
                            lVar5.f336797b = BuildConfig.FLAVOR;
                            kVar2.copyOnWrite();
                            C121248l lVar6 = (C121248l) kVar2.instance;
                            str2.getClass();
                            lVar6.f336796a |= 2;
                            lVar6.f336798c = str2;
                            kVar2.copyOnWrite();
                            C121248l lVar7 = (C121248l) kVar2.instance;
                            str.getClass();
                            lVar7.f336796a |= 4;
                            lVar7.f336799d = str;
                            C121399b.m200644e(hashMap, c, (C121248l) kVar2.build());
                        }
                    }
                }
            }
        }
        C58976aa aaVar = C58975e.f156826a;
        hashMap.size();
        C58495hd l = C58495hd.m89898l(hashMap);
        iVar.copyOnWrite();
        C121251o oVar = (C121251o) iVar.instance;
        C62995dn dnVar = oVar.f336806a;
        if (!dnVar.f170058b) {
            oVar.f336806a = dnVar.mo58980a();
        }
        oVar.f336806a.putAll(l);
        C121251o oVar2 = (C121251o) iVar.build();
        adVar.copyOnWrite();
        C121220ae aeVar3 = (C121220ae) adVar.instance;
        oVar2.getClass();
        aeVar3.f336745c = oVar2;
        aeVar3.f336744b = 5;
        return (C121220ae) adVar.build();
    }
}
