package com.google.android.apps.gsa.assistant.settings.features.appactions.p570f;

import android.app.usage.UsageStats;
import android.util.Pair;
import com.google.android.apps.gsa.assistant.settings.features.appactions.data.C10339az;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10272q;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10273r;
import com.google.assistant.p3861at.C49823ah;
import com.google.assistant.p3861at.C49826ak;
import com.google.assistant.p3861at.C49838aw;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58584kl;
import com.google.common.p4522b.C58724pq;
import com.google.protobuf.C62942bv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.f.ae */
/* compiled from: PG */
public final class C10383ae {

    /* renamed from: a */
    public static final /* synthetic */ int f35085a = 0;

    /* renamed from: b */
    private static final Comparator f35086b = Comparator.EL.thenComparing(Comparator.EL.thenComparing(Comparator.CC.comparing(C10403u.f35110a, Comparator.CC.reverseOrder()), C10404v.f35111a, Comparator.CC.reverseOrder()), (Function) C10405w.f35112a);

    /* renamed from: c */
    private static final java.util.Comparator f35087c = Comparator.EL.thenComparing(Comparator.CC.comparing(C10404v.f35111a, Comparator.CC.reverseOrder()), (Function) C10406x.f35113a);

    /* renamed from: d */
    private static final java.util.Comparator f35088d = Comparator.CC.comparing(C10407y.f35114a, Comparator.CC.reverseOrder());

    /* renamed from: a */
    public static C10273r m25345a(C10273r rVar) {
        C49826ak akVar = rVar.f34821c;
        if (akVar == null) {
            akVar = C49826ak.f129462q;
        }
        C10272q qVar = (C10272q) rVar.toBuilder();
        C49823ah ahVar = (C49823ah) akVar.toBuilder();
        ahVar.copyOnWrite();
        ((C49826ak) ahVar.instance).f129465b = C62942bv.emptyProtobufList();
        ahVar.mo53361a(akVar.f129471h);
        C49826ak akVar2 = (C49826ak) ahVar.build();
        qVar.copyOnWrite();
        C10273r rVar2 = (C10273r) qVar.instance;
        akVar2.getClass();
        rVar2.f34821c = akVar2;
        rVar2.f34819a |= 2;
        return (C10273r) qVar.build();
    }

    /* renamed from: b */
    public static C10273r m25346b(C10273r rVar) {
        C49826ak akVar = rVar.f34821c;
        if (akVar == null) {
            akVar = C49826ak.f129462q;
        }
        C10272q qVar = (C10272q) rVar.toBuilder();
        C49823ah ahVar = (C49823ah) akVar.toBuilder();
        ahVar.copyOnWrite();
        ((C49826ak) ahVar.instance).f129465b = C62942bv.emptyProtobufList();
        C49826ak akVar2 = (C49826ak) ahVar.build();
        qVar.copyOnWrite();
        C10273r rVar2 = (C10273r) qVar.instance;
        akVar2.getClass();
        rVar2.f34821c = akVar2;
        rVar2.f34819a |= 2;
        return (C10273r) qVar.build();
    }

    /* renamed from: c */
    public static C58485gu m25347c(List list) {
        return (C58485gu) Collection.EL.stream(list).filter(C10396n.f35101a).collect(C58370cn.f155946a);
    }

    /* renamed from: d */
    public static C58485gu m25348d(C58485gu guVar, int i) {
        java.util.Comparator comparing = Comparator.CC.comparing(C10400r.f35105a);
        Set set = (Set) Collection.EL.stream(guVar).collect(Collectors.toSet());
        if (i >= set.size()) {
            return (C58485gu) Collection.EL.stream(set).sorted(comparing).collect(C58370cn.f155946a);
        }
        HashSet hashSet = new HashSet();
        C58584kl klVar = new C58584kl(12);
        Collection.EL.stream(guVar).forEach(new C10401s(klVar));
        while (hashSet.size() < i) {
            Collection.EL.stream(klVar.mo54951D()).forEach(new C10402t(klVar, hashSet, i));
        }
        return (C58485gu) Collection.EL.stream(hashSet).sorted(comparing).collect(C58370cn.f155946a);
    }

    /* renamed from: e */
    public static C58485gu m25349e(C58485gu guVar, int i, C58495hd hdVar) {
        C58485gu guVar2 = (C58485gu) Collection.EL.stream(guVar).map(new C10381ac(hdVar)).sorted(f35086b).collect(C58370cn.f155946a);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = guVar2.size();
        for (int i2 = 0; i2 < size; i2++) {
            C10382ad adVar = (C10382ad) guVar2.get(i2);
            C49838aw awVar = adVar.mo18464b().f34820b;
            if (awVar == null) {
                awVar = C49838aw.f129504g;
            }
            if (hashSet.add(awVar.f129507b)) {
                arrayList.add(adVar);
            } else {
                arrayList2.add(adVar);
            }
        }
        C58485gu o = C58485gu.m89847o(C58485gu.m89842j(arrayList), C58485gu.m89842j(arrayList2));
        C58485gu m = o.isEmpty() ? C58485gu.m89845m() : (C58485gu) o.get(0);
        if (m.size() >= i) {
            return (C58485gu) Collection.EL.stream(m.subList(0, i)).map(C10397o.f35102a).collect(C58370cn.f155946a);
        }
        C58485gu m2 = ((C58724pq) o).f156474d < 2 ? C58485gu.m89845m() : (C58485gu) o.get(1);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(m);
        arrayList3.addAll(m2.subList(0, i - m.size()));
        return (C58485gu) Collection.EL.stream(arrayList3).sorted(f35087c).map(C10397o.f35102a).collect(C58370cn.f155946a);
    }

    /* renamed from: f */
    public static C58485gu m25350f(C58485gu guVar, C58495hd hdVar) {
        if (hdVar.isEmpty()) {
            return guVar;
        }
        ArrayList arrayList = new ArrayList();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C10273r rVar = (C10273r) guVar.get(i);
            C49838aw awVar = rVar.f34820b;
            if (awVar == null) {
                awVar = C49838aw.f129504g;
            }
            String str = awVar.f129507b;
            arrayList.add(new Pair(rVar, Long.valueOf(hdVar.containsKey(str) ? ((UsageStats) hdVar.get(str)).getTotalTimeInForeground() : 0)));
        }
        Collections.sort(arrayList, C10398p.f35103a);
        return (C58485gu) Collection.EL.stream(arrayList).map(C10399q.f35104a).collect(C58370cn.f155946a);
    }

    /* renamed from: g */
    public static C58485gu m25351g(C58485gu guVar) {
        return (C58485gu) Collection.EL.stream(guVar).sorted(f35088d).collect(C58370cn.f155946a);
    }

    /* renamed from: h */
    public static C58485gu m25352h(List list) {
        return (C58485gu) Collection.EL.stream(list).filter(C10408z.f35115a).collect(C58370cn.f155946a);
    }

    /* renamed from: i */
    public static List m25353i(C10339az azVar) {
        return (List) Collection.EL.stream(azVar.mo18434d()).map(new C10379aa(azVar)).collect(Collectors.toCollection(C10380ab.f35083a));
    }

    /* renamed from: j */
    public static List m25354j(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.addAll(m25353i((C10339az) it.next()));
        }
        return arrayList;
    }

    /* renamed from: k */
    public static boolean m25355k(C10273r rVar) {
        C49826ak akVar = rVar.f34821c;
        if (akVar == null) {
            akVar = C49826ak.f129462q;
        }
        return !akVar.f129465b.isEmpty();
    }
}
