package com.google.android.libraries.geller.p1818f;

import com.google.android.libraries.geller.p1814b.C21758b;
import com.google.android.libraries.geller.p1818f.p1819a.C21789d;
import com.google.android.libraries.geller.portable.C21942ah;
import com.google.android.libraries.geller.portable.Geller;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.base.C58889cz;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62963cj;
import com.google.protos.p5129p.p5130a.C65719d;
import com.google.protos.p5129p.p5130a.C65720e;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65813cq;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.libraries.geller.f.bx */
/* compiled from: PG */
public final class C21841bx implements C21837bt {

    /* renamed from: g */
    private static final C59071e f60270g = C59071e.m91332i("com.google.android.libraries.geller.f.bx");

    /* renamed from: a */
    public final C21826bi f60271a;

    /* renamed from: b */
    public final Object f60272b = new Object();

    /* renamed from: c */
    final Map f60273c;

    /* renamed from: d */
    final Map f60274d;

    /* renamed from: e */
    final Map f60275e;

    /* renamed from: f */
    final Map f60276f;

    /* renamed from: h */
    private final C58833ax f60277h;

    /* renamed from: i */
    private final C58817ah f60278i;

    /* renamed from: j */
    private final ExecutorService f60279j;

    public C21841bx(C58833ax axVar, Geller geller, C21942ah ahVar, String str, C58817ah ahVar2, Set set, C58817ah ahVar3, C62910ar arVar, C21791aa aaVar, ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3, Map map, C58889cz czVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4) {
        this.f60277h = axVar;
        this.f60278i = ahVar3;
        this.f60279j = executorService;
        this.f60273c = new HashMap();
        this.f60274d = new HashMap();
        this.f60275e = new HashMap();
        this.f60276f = new HashMap();
        C21826bi biVar = r1;
        C21826bi biVar2 = new C21826bi(axVar, geller, ahVar, str, ahVar2, set, ahVar3, arVar, aaVar, executorService, executorService2, executorService3, map, czVar, axVar2, axVar3, axVar4);
        this.f60271a = biVar2;
    }

    /* renamed from: b */
    private final C60870cx m40939b(C65720e eVar) {
        C60870cx a;
        C60870cx cxVar;
        synchronized (this.f60272b) {
            C58480gp gpVar = new C58480gp(4);
            for (C65753ak akVar : new C62963cj(eVar.f178553b, C65720e.f178549c)) {
                synchronized (this.f60272b) {
                    if (!this.f60273c.containsKey(akVar) && !this.f60275e.containsKey(akVar) && !this.f60276f.containsKey(akVar)) {
                        cxVar = C60866ct.f164955a;
                    } else if (this.f60276f.containsKey(akVar)) {
                        cxVar = (C60870cx) this.f60276f.get(akVar);
                    } else if (this.f60273c.containsKey(akVar) && !this.f60275e.containsKey(akVar)) {
                        cxVar = (C60870cx) this.f60273c.get(akVar);
                    } else if (this.f60273c.containsKey(akVar) || !this.f60275e.containsKey(akVar)) {
                        ((C59052c) ((C59052c) f60270g.mo56226d()).mo56372aa(48011)).mo56387q("There was a scheduling bug where 2 syncs ran concurrently for corpus: %s", akVar.f178757bE);
                        cxVar = C60866ct.f164955a;
                    } else {
                        cxVar = (C60870cx) this.f60275e.get(akVar);
                    }
                }
                gpVar.mo55395g(cxVar);
            }
            C60870cx b = C60856cj.m92892a(gpVar.mo55394f()).mo57335b(C47810es.m84965e(new C21839bv(this, eVar)), this.f60279j);
            a = C60856cj.m92893b(b).mo57334a(C47810es.m84978r(new C21840bw(this, eVar, b)), this.f60279j);
        }
        return a;
    }

    /* renamed from: a */
    public final C60870cx mo27142a(String str, String str2, String str3, C58528ij ijVar, C65813cq cqVar, int i, boolean z) {
        C60870cx g;
        String str4 = str3;
        C65813cq cqVar2 = cqVar;
        boolean z2 = z;
        if (this.f60277h.mo56113h() && C58837ba.m90859h(str)) {
            return C60856cj.m92899h(new IllegalArgumentException("Empty auth token"));
        }
        if (!this.f60277h.mo56113h() && C58837ba.m90859h(str2)) {
            return C60856cj.m92899h(new IllegalArgumentException("Empty api key"));
        }
        C21758b a = C21789d.m40904a(this.f60278i, str4);
        C58526ih ihVar = new C58526ih();
        C58800sl lA = ijVar.iterator();
        while (lA.hasNext()) {
            C65753ak akVar = (C65753ak) lA.next();
            if (a.mo27093c(akVar)) {
                ihVar.mo55373c(akVar);
            } else {
                ((C59052c) ((C59052c) f60270g.mo56226d()).mo56372aa(48010)).mo56389s("Corpus: %s is disabled", akVar.name());
            }
        }
        C58528ij f = ihVar.mo55486f();
        if (f.isEmpty()) {
            return C60856cj.m92900i(C58729pv.f156485a);
        }
        HashSet hashSet = new HashSet();
        synchronized (this.f60272b) {
            TreeSet treeSet = new TreeSet();
            C58800sl lA2 = f.iterator();
            while (lA2.hasNext()) {
                C65753ak akVar2 = (C65753ak) lA2.next();
                if (this.f60274d.containsKey(akVar2)) {
                    ((C59052c) ((C59052c) f60270g.mo56224b()).mo56372aa(48013)).mo56389s("Returning existing pending sync for corpus: %s", akVar2.name());
                    hashSet.add((C60870cx) this.f60274d.get(akVar2));
                } else if (this.f60273c.containsKey(akVar2)) {
                    ((C59052c) ((C59052c) f60270g.mo56224b()).mo56372aa(48012)).mo56389s("Scheduling a pending batch sync for corpus: %s", akVar2.name());
                    C65719d dVar = (C65719d) C65720e.f178550l.createBuilder();
                    dVar.mo59419b(akVar2);
                    dVar.copyOnWrite();
                    C65720e eVar = (C65720e) dVar.instance;
                    eVar.f178555e = cqVar2.f178923h;
                    eVar.f178552a |= 2;
                    dVar.copyOnWrite();
                    C65720e eVar2 = (C65720e) dVar.instance;
                    eVar2.f178556f = i - 1;
                    eVar2.f178552a |= 4;
                    dVar.copyOnWrite();
                    C65720e eVar3 = (C65720e) dVar.instance;
                    eVar3.f178557g = 3;
                    eVar3.f178552a |= 8;
                    dVar.copyOnWrite();
                    C65720e eVar4 = (C65720e) dVar.instance;
                    eVar4.f178552a |= 16;
                    eVar4.f178558h = z2;
                    String g2 = C58837ba.m90858g(str);
                    dVar.copyOnWrite();
                    C65720e eVar5 = (C65720e) dVar.instance;
                    eVar5.f178552a |= 32;
                    eVar5.f178559i = g2;
                    String g3 = C58837ba.m90858g((String) null);
                    dVar.copyOnWrite();
                    C65720e eVar6 = (C65720e) dVar.instance;
                    eVar6.f178552a |= 64;
                    eVar6.f178560j = g3;
                    String g4 = C58837ba.m90858g(str2);
                    dVar.copyOnWrite();
                    C65720e eVar7 = (C65720e) dVar.instance;
                    eVar7.f178552a |= 128;
                    eVar7.f178561k = g4;
                    if (str4 != null) {
                        dVar.copyOnWrite();
                        C65720e eVar8 = (C65720e) dVar.instance;
                        eVar8.f178552a |= 1;
                        eVar8.f178554d = str4;
                    }
                    C60870cx b = m40939b((C65720e) dVar.build());
                    this.f60274d.put(akVar2, b);
                    hashSet.add(b);
                } else {
                    treeSet.add(akVar2);
                }
            }
            if (!treeSet.isEmpty()) {
                C65719d dVar2 = (C65719d) C65720e.f178550l.createBuilder();
                dVar2.mo59418a(treeSet);
                dVar2.copyOnWrite();
                C65720e eVar9 = (C65720e) dVar2.instance;
                eVar9.f178555e = cqVar2.f178923h;
                eVar9.f178552a |= 2;
                dVar2.copyOnWrite();
                C65720e eVar10 = (C65720e) dVar2.instance;
                eVar10.f178556f = i - 1;
                eVar10.f178552a |= 4;
                dVar2.copyOnWrite();
                C65720e eVar11 = (C65720e) dVar2.instance;
                eVar11.f178557g = 3;
                eVar11.f178552a |= 8;
                dVar2.copyOnWrite();
                C65720e eVar12 = (C65720e) dVar2.instance;
                eVar12.f178552a |= 16;
                eVar12.f178558h = z2;
                String g5 = C58837ba.m90858g(str);
                dVar2.copyOnWrite();
                C65720e eVar13 = (C65720e) dVar2.instance;
                eVar13.f178552a |= 32;
                eVar13.f178559i = g5;
                String g6 = C58837ba.m90858g((String) null);
                dVar2.copyOnWrite();
                C65720e eVar14 = (C65720e) dVar2.instance;
                eVar14.f178552a |= 64;
                eVar14.f178560j = g6;
                String g7 = C58837ba.m90858g(str2);
                dVar2.copyOnWrite();
                C65720e eVar15 = (C65720e) dVar2.instance;
                eVar15.f178552a |= 128;
                eVar15.f178561k = g7;
                if (str4 != null) {
                    dVar2.copyOnWrite();
                    C65720e eVar16 = (C65720e) dVar2.instance;
                    eVar16.f178552a |= 1;
                    eVar16.f178554d = str4;
                }
                hashSet.add(m40939b((C65720e) dVar2.build()));
            }
            g = C60922j.m93044g(C60856cj.m92896e(hashSet), C47810es.m84963c(new C21838bu(f)), this.f60279j);
        }
        return g;
    }
}
