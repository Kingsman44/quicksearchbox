package com.google.apps.tiktok.experiments.phenotype;

import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.phenotype.client.C31667f;
import com.google.android.libraries.phenotype.client.C31676o;
import com.google.android.libraries.phenotype.client.p2420a.C31634b;
import com.google.android.libraries.phenotype.client.p2420a.C31638f;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.android.libraries.storage.protostore.C42984dt;
import com.google.android.libraries.storage.protostore.p3317b.C42902a;
import com.google.android.p10905k.C146606e;
import com.google.apps.tiktok.experiments.C46889a;
import com.google.apps.tiktok.experiments.C46890b;
import com.google.apps.tiktok.experiments.C46891c;
import com.google.apps.tiktok.experiments.C46893e;
import com.google.apps.tiktok.experiments.C46894f;
import com.google.apps.tiktok.experiments.C46895g;
import com.google.apps.tiktok.experiments.C46896h;
import com.google.apps.tiktok.experiments.C46903o;
import com.google.apps.tiktok.experiments.C46904p;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4535g.C59203do;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60871cy;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import com.google.protobuf.p4746a.C62883b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;
import p5462h.C69677g;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5474a.C69631q;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.ak */
/* compiled from: PG */
public final class C46917ak {

    /* renamed from: a */
    private final C58833ax f122397a;

    /* renamed from: b */
    private final Map f122398b;

    /* renamed from: c */
    private final C46919am f122399c;

    public C46917ak(C46967cg cgVar, Map map, C46919am amVar, C60887da daVar, Set set, C42813k kVar, C58833ax axVar, Map map2, C46889a aVar, C69626l lVar, Executor executor, Map map3, C69630p pVar, C69630p pVar2, C69631q qVar, C60931s sVar) {
        C46919am amVar2 = amVar;
        C60887da daVar2 = daVar;
        Set set2 = set;
        C58833ax axVar2 = axVar;
        C46889a aVar2 = aVar;
        Map map4 = map3;
        C69664n.m101061g(cgVar, "mendelFactory");
        C69664n.m101061g(map, "packagesMap");
        C69664n.m101061g(amVar2, "subpackager");
        C69664n.m101061g(daVar2, "blockingExecutor");
        C69664n.m101061g(set2, "freshnessPackages");
        C69664n.m101061g(kVar, "fileApi");
        C69664n.m101061g(axVar2, "hermeticOverrides");
        C69664n.m101061g(map2, "unused");
        C69664n.m101061g(aVar2, "tier");
        C69664n.m101061g(executor, "snapshotExecutor");
        C69664n.m101061g(map4, "defaultExperimentFlagValues");
        this.f122399c = amVar2;
        this.f122397a = axVar2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((C46889a) entry.getValue()) == aVar2) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        int b = C69505av.m100860b(C69540x.m100804k(keySet, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(b < 16 ? 16 : b);
        for (Object next : keySet) {
            String str = (String) next;
            String c = (aVar2 == C46889a.USER || aVar2 == C46889a.UI_USER) ? C31676o.m59021c(str) : str;
            C46977cq cqVar = new C46977cq(daVar2);
            String b2 = C31676o.m59020b(str);
            C69630p pVar3 = true != set2.contains(str) ? pVar2 : pVar;
            C69464a aVar3 = (C69464a) map4.get(b2);
            if (aVar3 == null) {
                aVar3 = C46910ad.f122383a;
            }
            C46977cq cqVar2 = cqVar;
            String str2 = str;
            C58881cr a = C58886cw.m90973a(new C46912af(str, cqVar, kVar, lVar, c));
            C69664n.m101060f(a, "memoize { createPds(::getStaticConfigPackage) }");
            String str3 = str2;
            linkedHashMap2.put(next, cgVar.mo50944a(str3, cqVar2, pVar3, aVar3, executor, a, m83564a(str2, cqVar2, kVar, lVar, c, C46914ah.f122392a), qVar, new C46913ag(sVar, str3)));
            C46967cg cgVar2 = cgVar;
            C42813k kVar2 = kVar;
        }
        this.f122398b = linkedHashMap2;
    }

    /* renamed from: a */
    public static final C42876ab m83564a(String str, C46977cq cqVar, C42813k kVar, C69626l lVar, String str2, C69626l lVar2) {
        C60871cy cyVar = new C60871cy((Callable) new C46915ai(lVar, lVar2, str2));
        cqVar.f122489a.add(cyVar);
        C46890b bVar = (C46890b) C46891c.f122341i.createBuilder();
        C69664n.m101060f(bVar, "newBuilder()");
        return C42984dt.m75881a(str, cyVar, C69664n.m101061g(bVar, "builder").mo50900a(), new C46916aj(cqVar), C42902a.f112243a, kVar);
    }

    /* renamed from: b */
    public final C46904p mo50915b(String str) {
        int B = C69764m.m101185B(str, ' ', 0, 6);
        if (B <= 0 || B >= str.length() - 1) {
            throw new IllegalStateException("Bad flag format for ".concat(str));
        }
        String substring = str.substring(0, B);
        C69664n.m101060f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String substring2 = str.substring(B + 1);
        C69664n.m101060f(substring2, "this as java.lang.String).substring(startIndex)");
        C47070x xVar = new C47070x(substring, substring2);
        String a = this.f122399c.mo50923a(xVar.f122661a);
        if (this.f122397a.mo56113h()) {
            Object c = this.f122397a.mo56107c();
            C69664n.m101060f(c, "hermeticOverrides.get()");
            C31667f fVar = (C31667f) c;
            Uri a2 = C31676o.m59019a(xVar.f122661a);
            Object obj = this.f122398b.get(a);
            C69664n.m101058d(obj);
            C46966cf cfVar = (C46966cf) obj;
            String str2 = xVar.f122662b;
            C69664n.m101061g(str2, "name");
            C46904p pVar = (C46904p) ((Map) cfVar.f122473g.mo17428b()).get(str2);
            if (pVar != null) {
                Boolean bool = null;
                String a3 = fVar.mo37313a(a2, (String) null, (String) null, xVar.f122662b);
                if (a3 == null) {
                    return pVar;
                }
                C46895g gVar = pVar.f122373c;
                C46895g gVar2 = C46895g.LONG_VALUE;
                switch (gVar.ordinal()) {
                    case 0:
                        return C46903o.m83544d(Long.parseLong(a3));
                    case 1:
                        if (C146606e.f395968c.matcher(a3).matches()) {
                            bool = true;
                        } else if (C146606e.f395969d.matcher(a3).matches()) {
                            bool = false;
                        }
                        if (bool == null) {
                            bool = Boolean.valueOf(pVar.mo50907f());
                        }
                        return C46903o.m83541a(bool.booleanValue());
                    case 2:
                        return C46903o.m83543c(Double.parseDouble(a3));
                    case 3:
                        return C46903o.m83546f(a3);
                    case 4:
                        return C46903o.m83542b(new C47072z(a3));
                    case 5:
                        try {
                            C46907aa aaVar = new C46907aa(pVar, a3);
                            MessageLite messageLite = pVar.f122374d;
                            C69664n.m101058d(messageLite);
                            return C46903o.m83545e(aaVar, messageLite);
                        } catch (C62974ct unused) {
                            return pVar;
                        }
                    case 6:
                        throw new IllegalArgumentException("No default value for " + a + " " + xVar);
                    default:
                        throw new C69677g();
                }
            } else {
                Set keySet = ((Map) cfVar.f122473g.mo17428b()).keySet();
                throw new IllegalArgumentException("No known flag " + str2 + ", known flags: " + keySet);
            }
        } else {
            Object obj2 = this.f122398b.get(a);
            C69664n.m101058d(obj2);
            String str3 = xVar.f122662b;
            C69664n.m101061g(str3, "name");
            return ((C46966cf) obj2).mo50939a().mo50927a(str3);
        }
    }

    /* renamed from: c */
    public final C60870cx mo50916c() {
        Map map = this.f122398b;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            C60870cx c = ((C46966cf) entry.getValue()).mo50941c();
            C46957bx bxVar = C46957bx.f122453a;
            C60870cx g = C60922j.m93044g(c, C47810es.m84963c(bxVar), C60826bg.f164896a);
            C46909ac acVar = new C46909ac((String) entry.getKey());
            arrayList.add(C60922j.m93044g(g, C47810es.m84963c(acVar), C60826bg.f164896a));
        }
        return C47638k.m84752c(arrayList).mo51520a(new C46908ab(arrayList), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final C60870cx mo50917d(String str, C31634b bVar) {
        C63088z zVar;
        C63088z zVar2;
        C69664n.m101061g(bVar, "configuration");
        Object obj = this.f122398b.get(str);
        C69664n.m101058d(obj);
        C46966cf cfVar = (C46966cf) obj;
        C69664n.m101061g(bVar, "configuration");
        C46890b bVar2 = (C46890b) C46891c.f122341i.createBuilder();
        C69664n.m101060f(bVar2, "newBuilder()");
        C46893e a = C69664n.m101061g(bVar2, "builder");
        int i = cfVar.f122467a;
        C46890b bVar3 = a.f122351a;
        bVar3.copyOnWrite();
        C46891c cVar = (C46891c) bVar3.instance;
        cVar.f122343a |= 8;
        cVar.f122349g = i;
        if ((bVar.f85109a & 2) != 0) {
            C63088z zVar3 = bVar.f85111c;
            C69664n.m101060f(zVar3, "configuration.experimentToken");
            C69664n.m101061g(zVar3, "value");
            C46890b bVar4 = a.f122351a;
            bVar4.copyOnWrite();
            C46891c cVar2 = (C46891c) bVar4.instance;
            zVar3.getClass();
            cVar2.f122343a |= 4;
            cVar2.f122346d = zVar3;
        }
        String str2 = bVar.f85110b;
        C69664n.m101060f(str2, "configuration.snapshotToken");
        C69664n.m101061g(str2, "value");
        C46890b bVar5 = a.f122351a;
        bVar5.copyOnWrite();
        C46891c cVar3 = (C46891c) bVar5.instance;
        str2.getClass();
        cVar3.f122343a |= 2;
        cVar3.f122345c = str2;
        String str3 = bVar.f85112d;
        C69664n.m101060f(str3, "configuration.serverToken");
        C69664n.m101061g(str3, "value");
        C46890b bVar6 = a.f122351a;
        bVar6.copyOnWrite();
        C46891c cVar4 = (C46891c) bVar6.instance;
        str3.getClass();
        cVar4.f122343a |= 1;
        cVar4.f122344b = str3;
        long b = cfVar.f122469c.mo26870b();
        C46890b bVar7 = a.f122351a;
        bVar7.copyOnWrite();
        C46891c cVar5 = (C46891c) bVar7.instance;
        cVar5.f122343a |= 16;
        cVar5.f122350h = b;
        C62971cq<C31638f> cqVar = bVar.f85113e;
        C69664n.m101060f(cqVar, "configuration.flagList");
        for (C31638f fVar : cqVar) {
            C46904p pVar = (C46904p) ((Map) cfVar.f122473g.mo17428b()).get(fVar.f85132d);
            if (pVar != null) {
                List unmodifiableList = Collections.unmodifiableList(((C46891c) a.f122351a.instance).f122347e);
                C69664n.m101060f(unmodifiableList, "_builder.getFlagValueList()");
                new C62883b(unmodifiableList);
                C69664n.m101060f(fVar, "gcoreFlag");
                C46894f fVar2 = (C46894f) C46896h.f122360e.createBuilder();
                C69664n.m101060f(fVar2, "newBuilder()");
                C69664n.m101061g(fVar2, "builder");
                String str4 = fVar.f85132d;
                C69664n.m101060f(str4, "newFlag.name");
                C69664n.m101061g(str4, "value");
                fVar2.copyOnWrite();
                C46896h hVar = (C46896h) fVar2.instance;
                str4.getClass();
                hVar.f122362a |= 1;
                hVar.f122365d = str4;
                C46895g gVar = pVar.f122373c;
                C46895g gVar2 = C46895g.LONG_VALUE;
                switch (gVar.ordinal()) {
                    case 0:
                        long longValue = fVar.f85130b == 1 ? ((Long) fVar.f85131c).longValue() : 0;
                        fVar2.copyOnWrite();
                        C46896h hVar2 = (C46896h) fVar2.instance;
                        hVar2.f122363b = 1;
                        hVar2.f122364c = Long.valueOf(longValue);
                        break;
                    case 1:
                        boolean booleanValue = fVar.f85130b == 2 ? ((Boolean) fVar.f85131c).booleanValue() : false;
                        fVar2.copyOnWrite();
                        C46896h hVar3 = (C46896h) fVar2.instance;
                        hVar3.f122363b = 2;
                        hVar3.f122364c = Boolean.valueOf(booleanValue);
                        break;
                    case 2:
                        double doubleValue = fVar.f85130b == 3 ? ((Double) fVar.f85131c).doubleValue() : C59203do.f157270a;
                        fVar2.copyOnWrite();
                        C46896h hVar4 = (C46896h) fVar2.instance;
                        hVar4.f122363b = 3;
                        hVar4.f122364c = Double.valueOf(doubleValue);
                        break;
                    case 3:
                        String str5 = fVar.f85130b == 4 ? (String) fVar.f85131c : BuildConfig.FLAVOR;
                        C69664n.m101060f(str5, "newFlag.stringValue");
                        C69664n.m101061g(str5, "value");
                        fVar2.copyOnWrite();
                        C46896h hVar5 = (C46896h) fVar2.instance;
                        str5.getClass();
                        hVar5.f122363b = 4;
                        hVar5.f122364c = str5;
                        break;
                    case 4:
                        if (fVar.f85130b == 5) {
                            zVar = (C63088z) fVar.f85131c;
                        } else {
                            zVar = C63088z.f170246b;
                        }
                        C69664n.m101060f(zVar, "newFlag.bytesValue");
                        C69664n.m101061g(zVar, "value");
                        fVar2.copyOnWrite();
                        C46896h hVar6 = (C46896h) fVar2.instance;
                        zVar.getClass();
                        hVar6.f122363b = 5;
                        hVar6.f122364c = zVar;
                        break;
                    case 5:
                        if (fVar.f85130b == 5) {
                            zVar2 = (C63088z) fVar.f85131c;
                        } else {
                            zVar2 = C63088z.f170246b;
                        }
                        C69664n.m101060f(zVar2, "newFlag.bytesValue");
                        C69664n.m101061g(zVar2, "value");
                        fVar2.copyOnWrite();
                        C46896h hVar7 = (C46896h) fVar2.instance;
                        zVar2.getClass();
                        hVar7.f122363b = 6;
                        hVar7.f122364c = zVar2;
                        break;
                    case 6:
                        throw new IllegalStateException("No known flag type");
                }
                C62942bv build = fVar2.build();
                C69664n.m101060f(build, "_builder.build()");
                C46896h hVar8 = (C46896h) build;
                C69664n.m101061g(hVar8, "value");
                C46890b bVar8 = a.f122351a;
                bVar8.copyOnWrite();
                C46891c cVar6 = (C46891c) bVar8.instance;
                hVar8.getClass();
                C62971cq cqVar2 = cVar6.f122347e;
                if (!cqVar2.mo58948c()) {
                    cVar6.f122347e = C62942bv.mutableCopy(cqVar2);
                }
                cVar6.f122347e.add(hVar8);
            }
        }
        List unmodifiableList2 = Collections.unmodifiableList(((C46891c) a.f122351a.instance).f122348f);
        C69664n.m101060f(unmodifiableList2, "_builder.getDeleteFlagList()");
        new C62883b(unmodifiableList2);
        C62971cq cqVar3 = bVar.f85114f;
        C69664n.m101060f(cqVar3, "configuration.deleteFlagList");
        Object b2 = cfVar.f122473g.mo17428b();
        C69664n.m101060f(b2, "defaultMap.get()");
        Map map = (Map) b2;
        ArrayList arrayList = new ArrayList();
        for (Object next : cqVar3) {
            if (map.containsKey((String) next)) {
                arrayList.add(next);
            }
        }
        C46890b bVar9 = a.f122351a;
        bVar9.copyOnWrite();
        C46891c cVar7 = (C46891c) bVar9.instance;
        C62971cq cqVar4 = cVar7.f122348f;
        if (!cqVar4.mo58948c()) {
            cVar7.f122348f = C62942bv.mutableCopy(cqVar4);
        }
        C62947c.addAll((Iterable) arrayList, (List) cVar7.f122348f);
        C46891c a2 = a.mo50900a();
        try {
            return C60922j.m93045h(cfVar.f122471e.mo50957a(new C46964cd(cfVar, a2)), C47810es.m84966f(new C46959bz(cfVar.mo50940b(a2), a2, cfVar)), cfVar.f122474h);
        } catch (C62974ct e) {
            return C60856cj.m92899h(e);
        }
    }

    /* renamed from: e */
    public final List mo50918e() {
        Map map = this.f122398b;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            C60870cx c = ((C46966cf) entry.getValue()).mo50941c();
            C46965ce ceVar = C46965ce.f122466a;
            C60870cx g = C60922j.m93044g(c, C47810es.m84963c(ceVar), C60826bg.f164896a);
            C46966cf cfVar = (C46966cf) entry.getValue();
            C63088z zVar = null;
            if (cfVar.f122480n.f121487d.isDone()) {
                try {
                    zVar = ((C46940bg) C60856cj.m92909r(cfVar.f122480n.mo50395b())).mo50928b().f122437c;
                } catch (ExecutionException unused) {
                }
            }
            arrayList.add(new C47071y(str, g, zVar));
        }
        return arrayList;
    }

    /* renamed from: f */
    public final Map mo50919f() {
        C58490gz gzVar = new C58490gz(4);
        for (Map.Entry entry : this.f122398b.entrySet()) {
            String str = (String) entry.getKey();
            for (Map.Entry entry2 : ((C46966cf) entry.getValue()).mo50939a().mo50929c().entrySet()) {
                gzVar.mo55429h(str + " " + ((String) entry2.getKey()), (C46904p) entry2.getValue());
            }
        }
        return gzVar.mo55427f(true);
    }

    /* renamed from: g */
    public final void mo50920g() {
        C19559g.m37304c();
        for (C46966cf cfVar : this.f122398b.values()) {
            if (cfVar.mo50943e()) {
                try {
                    C46940bg bgVar = (C46940bg) C60856cj.m92909r(cfVar.f122480n.mo50395b());
                    bgVar.mo50930d();
                    cfVar.mo50942d(bgVar.mo50928b().f122436b, bgVar.mo50928b().f122437c);
                } catch (ExecutionException e) {
                    throw new RuntimeException(e.getCause());
                }
            }
        }
    }

    /* renamed from: h */
    public final boolean mo50921h() {
        Collection<C46966cf> values = this.f122398b.values();
        if ((values instanceof Collection) && values.isEmpty()) {
            return false;
        }
        for (C46966cf e : values) {
            if (e.mo50943e()) {
                return true;
            }
        }
        return false;
    }
}
