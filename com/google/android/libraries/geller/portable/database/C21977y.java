package com.google.android.libraries.geller.portable.database;

import com.google.android.libraries.p1963i.p1964a.C23820c;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import com.google.protos.p4985f.p5030q.p5032b.C65019ad;
import com.google.protos.p4985f.p5030q.p5032b.C65030ao;
import com.google.protos.p4985f.p5030q.p5032b.C65031ap;
import com.google.protos.p4985f.p5030q.p5032b.C65063j;
import com.google.protos.p4985f.p5030q.p5032b.C65071r;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65768az;
import com.google.protos.p5129p.p5131b.C65778bi;
import com.google.protos.p5129p.p5131b.C65779bj;
import com.google.protos.p5129p.p5131b.C65780bk;
import com.google.protos.p5129p.p5131b.C65782bm;
import com.google.protos.p5129p.p5131b.C65783bn;
import com.google.protos.p5129p.p5131b.C65785bp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.libraries.geller.portable.database.y */
/* compiled from: PG */
public final class C21977y implements C21957e {

    /* renamed from: a */
    public static final C58528ij f60610a = new C58759qy(C65753ak.ACTION_HISTORY.name());

    /* renamed from: b */
    private static final C59071e f60611b = C59071e.m91332i("com.google.android.libraries.geller.portable.database.y");

    /* renamed from: c */
    private static final Comparator f60612c = C21969q.f60596a;

    /* renamed from: d */
    private final Map f60613d;

    public C21977y(Map map) {
        this.f60613d = map;
    }

    /* renamed from: g */
    public static long m41208g(Map map, String str) {
        long j;
        if (!((C58759qy) f60610a).f156534a.equals(str)) {
            j = (long) map.size();
        } else {
            j = 0;
            for (Map.Entry value : map.entrySet()) {
                j += (long) ((C65783bn) value.getValue()).f178831a.size();
            }
        }
        map.clear();
        return j;
    }

    /* renamed from: h */
    public static long m41209h(Map map, String str, long j) {
        ArrayList arrayList = new ArrayList(((C65783bn) map.get(str)).f178831a);
        C65779bj bjVar = (C65779bj) C65780bk.f178819g.createBuilder();
        bjVar.copyOnWrite();
        C65780bk bkVar = (C65780bk) bjVar.instance;
        bkVar.f178821a |= 16;
        bkVar.f178826f = j;
        int binarySearch = Collections.binarySearch(arrayList, (C65780bk) bjVar.build(), f60612c);
        if (binarySearch < 0) {
            return 0;
        }
        arrayList.remove(binarySearch);
        C65782bm bmVar = (C65782bm) C65783bn.f178829b.createBuilder();
        bmVar.mo59425a(arrayList);
        map.put(str, (C65783bn) bmVar.build());
        return 1;
    }

    /* renamed from: i */
    public static long m41210i(Map map, List list) {
        long j = 0;
        if (list.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : m41218q(map, list).entrySet()) {
            String str = (String) entry.getKey();
            Set set = (Set) entry.getValue();
            C62971cq cqVar = ((C65783bn) map.get(str)).f178831a;
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < cqVar.size(); i++) {
                if (!set.contains(Integer.valueOf(i))) {
                    arrayList.add((C65780bk) cqVar.get(i));
                } else {
                    j++;
                }
            }
            C65782bm bmVar = (C65782bm) C65783bn.f178829b.createBuilder();
            bmVar.mo59425a(arrayList);
            map.put(str, (C65783bn) bmVar.build());
        }
        return j;
    }

    /* renamed from: j */
    public static long m41211j(Map map, String str, C58833ax axVar, C58833ax axVar2, C58833ax axVar3) {
        if (!map.containsKey(str)) {
            return 0;
        }
        ArrayList arrayList = new ArrayList(((C65783bn) map.get(str)).f178831a);
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.set(i, m41217p((C65780bk) arrayList.get(i), axVar, axVar2, axVar3));
        }
        C65782bm bmVar = (C65782bm) C65783bn.f178829b.createBuilder();
        bmVar.mo59425a(arrayList);
        return (long) ((C65783bn) map.put(str, (C65783bn) bmVar.build())).f178831a.size();
    }

    /* renamed from: k */
    public static long m41212k(Map map, String str, long j, C58833ax axVar, C58833ax axVar2, C58833ax axVar3) {
        ArrayList arrayList = new ArrayList(((C65783bn) map.get(str)).f178831a);
        C65779bj bjVar = (C65779bj) C65780bk.f178819g.createBuilder();
        bjVar.copyOnWrite();
        C65780bk bkVar = (C65780bk) bjVar.instance;
        bkVar.f178821a |= 16;
        bkVar.f178826f = j;
        int binarySearch = Collections.binarySearch(arrayList, (C65780bk) bjVar.build(), f60612c);
        if (binarySearch < 0) {
            return 0;
        }
        arrayList.set(binarySearch, m41217p((C65780bk) arrayList.get(binarySearch), axVar, axVar2, axVar3));
        C65782bm bmVar = (C65782bm) C65783bn.f178829b.createBuilder();
        bmVar.mo59425a(arrayList);
        map.put(str, (C65783bn) bmVar.build());
        return 1;
    }

    /* renamed from: l */
    public static long m41213l(Map map, List list, C58833ax axVar, C58833ax axVar2, C58833ax axVar3) {
        long j = 0;
        if (list.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : m41218q(map, list).entrySet()) {
            String str = (String) entry.getKey();
            Set<Integer> set = (Set) entry.getValue();
            ArrayList arrayList = new ArrayList(((C65783bn) map.get(str)).f178831a);
            for (Integer num : set) {
                arrayList.set(num.intValue(), m41217p((C65780bk) arrayList.get(num.intValue()), axVar, axVar2, axVar3));
            }
            j += (long) set.size();
            C65782bm bmVar = (C65782bm) C65783bn.f178829b.createBuilder();
            bmVar.mo59425a(arrayList);
            map.put(str, (C65783bn) bmVar.build());
        }
        return j;
    }

    /* renamed from: m */
    public static C60870cx m41214m(C42876ab abVar, Map map, Long l) {
        return C60922j.m93044g(C60838bs.m92859i(abVar.mo46039a(new C21973u(map), C60826bg.f164896a)), new C21974v(l), C60826bg.f164896a);
    }

    /* renamed from: n */
    public static void m41215n(List list, List<C65780bk> list2, C65031ap apVar) {
        if ((apVar.f176102a & 8) != 0) {
            if (((C58759qy) f60610a).f156534a.equals(apVar.f176107f)) {
                C65030ao aoVar = apVar.f176106e;
                if (aoVar == null) {
                    aoVar = C65030ao.f176095d;
                }
                list2 = new ArrayList(list2).subList(m41216o(list2, aoVar.f176099c, true), m41216o(list2, aoVar.f176098b, false) + 1);
            }
        }
        for (C65780bk bkVar : list2) {
            int i = apVar.f176102a;
            if ((i & 32) != 0) {
                int i2 = true != apVar.f176108g ? 1 : 2;
                int a = C65785bp.m96803a(bkVar.f178823c);
                if (a == 0) {
                    a = 1;
                }
                if (a != i2) {
                }
            }
            int i3 = 3;
            if ((i & 64) != 0) {
                int a2 = C65778bi.m96800a(bkVar.f178824d);
                if (a2 == 0) {
                    a2 = 1;
                }
                if (apVar.f176109h) {
                    if (a2 == 1) {
                    }
                } else if (a2 != 2) {
                    if (a2 == 3) {
                    }
                }
            }
            if ((i & 128) != 0) {
                if (true != apVar.f176110i) {
                    i3 = 1;
                }
                int a3 = C65785bp.m96803a(bkVar.f178825e);
                if (a3 == 0) {
                    a3 = 1;
                }
                if (a3 != i3) {
                }
            }
            C65768az azVar = bkVar.f178822b;
            if (azVar == null) {
                azVar = C65768az.f178793f;
            }
            list.add(azVar.toByteArray());
        }
    }

    /* renamed from: o */
    private static int m41216o(List list, long j, boolean z) {
        C65779bj bjVar = (C65779bj) C65780bk.f178819g.createBuilder();
        bjVar.copyOnWrite();
        C65780bk bkVar = (C65780bk) bjVar.instance;
        bkVar.f178821a |= 16;
        bkVar.f178826f = j;
        int binarySearch = Collections.binarySearch(list, (C65780bk) bjVar.build(), f60612c);
        if (binarySearch >= 0) {
            return binarySearch;
        }
        int i = 1;
        if (true != z) {
            i = 2;
        }
        return -(binarySearch + i);
    }

    /* renamed from: p */
    private static C65780bk m41217p(C65780bk bkVar, C58833ax axVar, C58833ax axVar2, C58833ax axVar3) {
        C65779bj bjVar = (C65779bj) bkVar.toBuilder();
        if (axVar.mo56113h()) {
            int i = true != ((Boolean) axVar.mo56107c()).booleanValue() ? 1 : 2;
            bjVar.copyOnWrite();
            C65780bk bkVar2 = (C65780bk) bjVar.instance;
            bkVar2.f178823c = i - 1;
            bkVar2.f178821a |= 2;
        }
        if (axVar2.mo56113h()) {
            int i2 = true != ((Boolean) axVar2.mo56107c()).booleanValue() ? 1 : 3;
            bjVar.copyOnWrite();
            C65780bk bkVar3 = (C65780bk) bjVar.instance;
            bkVar3.f178825e = i2 - 1;
            bkVar3.f178821a |= 8;
        }
        if (axVar3.mo56113h()) {
            if (((C21956d) axVar3.mo56107c()).mo27276a().booleanValue()) {
                bjVar.copyOnWrite();
                C65780bk bkVar4 = (C65780bk) bjVar.instance;
                bkVar4.f178824d = 0;
                bkVar4.f178821a |= 4;
            } else {
                int b = ((C21956d) axVar3.mo56107c()).mo27277b();
                String a = C21955c.m41135a(b);
                if (b == 0) {
                    throw null;
                } else if (a.equals("DELETION_PROCESSED")) {
                    bjVar.copyOnWrite();
                    C65780bk bkVar5 = (C65780bk) bjVar.instance;
                    bkVar5.f178824d = 2;
                    bkVar5.f178821a |= 4;
                } else if (a.equals("PENDING_DELETE")) {
                    bjVar.copyOnWrite();
                    C65780bk bkVar6 = (C65780bk) bjVar.instance;
                    bkVar6.f178824d = 1;
                    bkVar6.f178821a |= 4;
                } else {
                    bjVar.copyOnWrite();
                    C65780bk bkVar7 = (C65780bk) bjVar.instance;
                    bkVar7.f178824d = 0;
                    bkVar7.f178821a |= 4;
                }
            }
        }
        return (C65780bk) bjVar.build();
    }

    /* renamed from: q */
    private static Map m41218q(Map map, List list) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            ArrayList arrayList = new ArrayList(((C65783bn) entry.getValue()).f178831a);
            String str = (String) entry.getKey();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                C65779bj bjVar = (C65779bj) C65780bk.f178819g.createBuilder();
                bjVar.copyOnWrite();
                C65780bk bkVar = (C65780bk) bjVar.instance;
                bkVar.f178821a |= 16;
                bkVar.f178826f = longValue;
                int binarySearch = Collections.binarySearch(arrayList, (C65780bk) bjVar.build(), f60612c);
                if (binarySearch >= 0) {
                    if (!hashMap.containsKey(entry.getKey())) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(Integer.valueOf(binarySearch));
                        hashMap.put(str, hashSet);
                    } else {
                        ((Set) hashMap.get(str)).add(Integer.valueOf(binarySearch));
                    }
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public final long mo27281a(C58833ax axVar, String str, C65071r rVar) {
        if ((rVar.f176210a & 1) != 0) {
            String str2 = rVar.f176213d;
            C42876ab abVar = (C42876ab) this.f60613d.get(str2);
            try {
                return ((Long) C23820c.m44352c(C60922j.m93045h(C60838bs.m92859i(abVar.mo46042d()), C47810es.m84966f(new C21975w(rVar, str2, abVar)), C60826bg.f164896a), TimeUnit.MILLISECONDS)).longValue();
            } catch (ExecutionException | TimeoutException e) {
                ((C59052c) ((C59052c) ((C59052c) f60611b.mo56225c()).mo56382g(e)).mo56372aa(48134)).mo56389s("Failed to delete data from the protoDataStore: %s", str2);
                return 0;
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                ((C59052c) ((C59052c) ((C59052c) f60611b.mo56225c()).mo56382g(e2)).mo56372aa(48135)).mo56389s("Failed to delete data from the protoDataStore: %s", str2);
                return 0;
            }
        } else {
            throw new IllegalArgumentException("The `dataType` field is required in GellerDeleteParams.");
        }
    }

    /* renamed from: b */
    public final /* synthetic */ C65063j mo27282b(C58833ax axVar, Set set) {
        return C65063j.f176192d;
    }

    /* renamed from: c */
    public final byte[][] mo27283c(C58833ax axVar, C65031ap apVar) {
        List arrayList = new ArrayList();
        String str = apVar.f176107f;
        try {
            arrayList = (List) C23820c.m44352c(C60922j.m93044g(((C42876ab) this.f60613d.get(str)).mo46042d(), C47810es.m84963c(new C21970r(apVar)), C60826bg.f164896a), TimeUnit.MILLISECONDS);
        } catch (ExecutionException | TimeoutException e) {
            ((C59052c) ((C59052c) ((C59052c) f60611b.mo56225c()).mo56382g(e)).mo56372aa(48143)).mo56389s("Failed to read data from the protoDataStore: %s", str);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            ((C59052c) ((C59052c) ((C59052c) f60611b.mo56225c()).mo56382g(e2)).mo56372aa(48144)).mo56389s("Failed to read data from the protoDataStore: %s", str);
        }
        return (byte[][]) arrayList.toArray(new byte[0][]);
    }

    /* renamed from: d */
    public final String[] mo27284d(C58833ax axVar, String str) {
        String[] strArr = new String[0];
        try {
            return (String[]) ((ArrayList) C23820c.m44352c(C60922j.m93044g(((C42876ab) this.f60613d.get(str)).mo46042d(), C47810es.m84963c(C21967o.f60594a), C60826bg.f164896a), TimeUnit.MILLISECONDS)).toArray(new String[0]);
        } catch (ExecutionException | TimeoutException e) {
            ((C59052c) ((C59052c) ((C59052c) f60611b.mo56225c()).mo56382g(e)).mo56372aa(48141)).mo56389s("Failed to read keys from the protoDataStore: %s", str);
            return strArr;
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            ((C59052c) ((C59052c) ((C59052c) f60611b.mo56225c()).mo56382g(e2)).mo56372aa(48142)).mo56389s("Failed to read keys from the protoDataStore: %s", str);
            return strArr;
        }
    }

    /* renamed from: e */
    public final long mo27285e(C58833ax axVar, String str, C65019ad adVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4) {
        C42876ab abVar = (C42876ab) this.f60613d.get(str);
        try {
            return ((Long) C23820c.m44352c(C60922j.m93045h(C60838bs.m92859i(abVar.mo46042d()), C47810es.m84966f(new C21971s(adVar, axVar2, axVar3, axVar4, abVar)), C60826bg.f164896a), TimeUnit.MILLISECONDS)).longValue();
        } catch (ExecutionException | TimeoutException e) {
            ((C59052c) ((C59052c) ((C59052c) f60611b.mo56225c()).mo56382g(e)).mo56372aa(48136)).mo56389s("Failed to update status of the protoDataStore: %s", str);
            return 0;
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            ((C59052c) ((C59052c) ((C59052c) f60611b.mo56225c()).mo56382g(e2)).mo56372aa(48137)).mo56389s("Failed to update status of the protoDataStore: %s", str);
            return 0;
        }
    }

    /* renamed from: f */
    public final boolean mo27286f(C58833ax axVar, String str, String[] strArr, long j, boolean z, byte[] bArr) {
        try {
            Void voidR = (Void) C23820c.m44352c(((C42876ab) this.f60613d.get(str)).mo46039a(new C21966n((C65768az) C62942bv.parseFrom((C62942bv) C65768az.f178793f, bArr, C62921ba.m95368a()), j, z, str), C60826bg.f164896a), TimeUnit.MILLISECONDS);
            return true;
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f60611b.mo56225c()).mo56382g(e)).mo56372aa(48138)).mo56389s("Failed to parse the element: %s", str);
            return false;
        } catch (ExecutionException | TimeoutException e2) {
            ((C59052c) ((C59052c) ((C59052c) f60611b.mo56225c()).mo56382g(e2)).mo56372aa(48139)).mo56389s("Failed to write to the protoDataStore: %s", str);
            return false;
        } catch (InterruptedException e3) {
            Thread.currentThread().interrupt();
            ((C59052c) ((C59052c) ((C59052c) f60611b.mo56225c()).mo56382g(e3)).mo56372aa(48140)).mo56389s("Failed to write to the protoDataStore %s", str);
            return false;
        }
    }
}
