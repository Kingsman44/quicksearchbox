package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8724a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.searchbox.root.RootSuggestion;
import com.google.android.libraries.searchbox.shared.suggestion.C41660a;
import com.google.android.libraries.searchbox.shared.suggestion.C41663ac;
import com.google.android.libraries.searchbox.shared.suggestion.C41669ai;
import com.google.android.libraries.searchbox.shared.suggestion.C41677c;
import com.google.android.libraries.searchbox.shared.suggestion.C41678d;
import com.google.android.libraries.searchbox.shared.suggestion.C41679e;
import com.google.android.libraries.searchbox.shared.suggestion.C41693s;
import com.google.assistant.p3825an.p3830c.p3831a.C49270ap;
import com.google.assistant.p3825an.p3830c.p3831a.C49271aq;
import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import com.google.assistant.p3825an.p3830c.p3831a.C49308c;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.p4129b.p4136c.C54759g;
import com.google.p4129b.p4136c.C54761i;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.a.r */
/* compiled from: PG */
public final class C116869r {
    /* renamed from: a */
    public static final List m194185a(C49301bt btVar, RootSuggestion rootSuggestion, int i) {
        C49301bt btVar2 = btVar;
        ArrayList arrayList = new ArrayList();
        if ((btVar2.f127425a & 16) != 0) {
            C41679e eVar = rootSuggestion.f108907B;
            C41693s sVar = eVar.f109009c;
            if (sVar == null) {
                sVar = C41693s.f109053h;
            }
            String str = sVar.f109059e;
            C49271aq aqVar = btVar2.f127428d;
            if (aqVar == null) {
                aqVar = C49271aq.f127363b;
            }
            C58485gu guVar = (C58485gu) Collection.EL.stream(aqVar.f127365a).filter(C116864m.f324345a).collect(C58370cn.f155946a);
            int i2 = i + 10;
            int size = guVar.size();
            for (int i3 = 0; i3 < size; i3++) {
                C49270ap apVar = (C49270ap) guVar.get(i3);
                C54761i iVar = btVar2.f127429e;
                if (iVar == null) {
                    iVar = C54761i.f143683c;
                }
                Optional findFirst = Collection.EL.stream(iVar.f143685a).filter(new C116865n(apVar)).findFirst();
                if (findFirst.isPresent()) {
                    C54759g gVar = (C54759g) findFirst.get();
                    C54761i iVar2 = btVar2.f127429e;
                    if (iVar2 == null) {
                        iVar2 = C54761i.f143683c;
                    }
                    C58485gu j = C58485gu.m89842j(iVar2.f143686b);
                    C41678d dVar = (C41678d) C41679e.f109005p.createBuilder();
                    C41663ac acVar = eVar.f109008b;
                    if (acVar == null) {
                        acVar = C41663ac.f108934g;
                    }
                    dVar.copyOnWrite();
                    C41679e eVar2 = (C41679e) dVar.instance;
                    acVar.getClass();
                    eVar2.f109008b = acVar;
                    eVar2.f109007a |= 2;
                    C41660a aVar = (C41660a) C41677c.f108996h.createBuilder();
                    aVar.copyOnWrite();
                    C41677c cVar = (C41677c) aVar.instance;
                    str.getClass();
                    cVar.f108998a |= 2;
                    cVar.f109001d = str;
                    C49308c cVar2 = apVar.f127359e;
                    if (cVar2 == null) {
                        cVar2 = C49308c.f127443c;
                    }
                    String str2 = cVar2.f127445a;
                    aVar.copyOnWrite();
                    C41677c cVar3 = (C41677c) aVar.instance;
                    str2.getClass();
                    cVar3.f108998a |= 4;
                    cVar3.f109002e = str2;
                    aVar.copyOnWrite();
                    C41677c cVar4 = (C41677c) aVar.instance;
                    gVar.getClass();
                    cVar4.f109000c = gVar;
                    cVar4.f108998a |= 1;
                    aVar.copyOnWrite();
                    C41677c cVar5 = (C41677c) aVar.instance;
                    C62971cq cqVar = cVar5.f109003f;
                    if (!cqVar.mo58948c()) {
                        cVar5.f109003f = C62942bv.mutableCopy(cqVar);
                    }
                    C62947c.addAll((Iterable) j, (List) cVar5.f109003f);
                    C49308c cVar6 = apVar.f127359e;
                    if (cVar6 == null) {
                        cVar6 = C49308c.f127443c;
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(cVar6.f127446b);
                    aVar.copyOnWrite();
                    C41677c cVar7 = (C41677c) aVar.instance;
                    C62995dn dnVar = cVar7.f108999b;
                    if (!dnVar.f170058b) {
                        cVar7.f108999b = dnVar.mo58980a();
                    }
                    cVar7.f108999b.putAll(unmodifiableMap);
                    C41677c cVar8 = (C41677c) aVar.build();
                    dVar.copyOnWrite();
                    C41679e eVar3 = (C41679e) dVar.instance;
                    cVar8.getClass();
                    eVar3.f109021o = cVar8;
                    eVar3.f109007a |= 16384;
                    RootSuggestion rootSuggestion2 = r8;
                    RootSuggestion rootSuggestion3 = new RootSuggestion(apVar.f127356b, 27, 173, C58485gu.m89846n(474), BuildConfig.FLAVOR, C41669ai.f108959h, i2, C54228aq.f142328w, (C41679e) dVar.build());
                    arrayList.add(rootSuggestion2);
                    i2--;
                }
            }
            return arrayList;
        }
        C58976aa aaVar = C58975e.f156826a;
        return arrayList;
    }
}
