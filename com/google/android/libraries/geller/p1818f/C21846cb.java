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
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
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

/* renamed from: com.google.android.libraries.geller.f.cb */
/* compiled from: PG */
public final class C21846cb implements C21837bt {

    /* renamed from: d */
    private static final C59071e f60297d = C59071e.m91332i("com.google.android.libraries.geller.f.cb");

    /* renamed from: a */
    public final Object f60298a = new Object();

    /* renamed from: b */
    final Map f60299b;

    /* renamed from: c */
    final Map f60300c;

    /* renamed from: e */
    private final C58833ax f60301e;

    /* renamed from: f */
    private final C58817ah f60302f;

    /* renamed from: g */
    private final ExecutorService f60303g;

    /* renamed from: h */
    private final C21826bi f60304h;

    public C21846cb(C58833ax axVar, Geller geller, C21942ah ahVar, String str, C58817ah ahVar2, Set set, C58817ah ahVar3, C62910ar arVar, C21791aa aaVar, ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3, Map map, C58889cz czVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4) {
        this.f60301e = axVar;
        this.f60302f = ahVar3;
        this.f60303g = executorService;
        this.f60299b = new HashMap();
        this.f60300c = new HashMap();
        C21826bi biVar = r1;
        C21826bi biVar2 = new C21826bi(axVar, geller, ahVar, str, ahVar2, set, ahVar3, arVar, aaVar, executorService, executorService2, executorService3, map, czVar, axVar2, axVar3, axVar4);
        this.f60304h = biVar2;
    }

    /* renamed from: a */
    public final C60870cx mo27142a(String str, String str2, String str3, C58528ij ijVar, C65813cq cqVar, int i, boolean z) {
        C60870cx g;
        C58800sl slVar;
        C58528ij ijVar2;
        String str4 = str3;
        if (this.f60301e.mo56113h() && C58837ba.m90859h(str)) {
            return C60856cj.m92899h(new IllegalArgumentException("Empty auth token"));
        }
        if (!this.f60301e.mo56113h() && C58837ba.m90859h(str2)) {
            return C60856cj.m92899h(new IllegalArgumentException("Empty api key"));
        }
        C21758b a = C21789d.m40904a(this.f60302f, str4);
        C58526ih ihVar = new C58526ih();
        C58800sl lA = ijVar.iterator();
        while (lA.hasNext()) {
            C65753ak akVar = (C65753ak) lA.next();
            if (a.mo27093c(akVar)) {
                ihVar.mo55373c(akVar);
            } else {
                ((C59052c) ((C59052c) f60297d.mo56226d()).mo56372aa(48014)).mo56389s("Corpus: %s is disabled", akVar.name());
            }
        }
        C58528ij f = ihVar.mo55486f();
        if (f.isEmpty()) {
            return C60856cj.m92900i(C58729pv.f156485a);
        }
        HashSet hashSet = new HashSet();
        synchronized (this.f60298a) {
            TreeSet treeSet = new TreeSet();
            C58800sl lA2 = f.iterator();
            while (lA2.hasNext()) {
                C65753ak akVar2 = (C65753ak) lA2.next();
                if (this.f60300c.containsKey(akVar2)) {
                    ((C59052c) ((C59052c) f60297d.mo56224b()).mo56372aa(48016)).mo56389s("Returning existing pending sync for corpus: %s", akVar2.name());
                    hashSet.add((C60870cx) this.f60300c.get(akVar2));
                } else {
                    if (this.f60299b.containsKey(akVar2)) {
                        ((C59052c) ((C59052c) f60297d.mo56224b()).mo56372aa(48015)).mo56389s("Scheduling a pending sync for corpus: %s", akVar2.name());
                        slVar = lA2;
                        ijVar2 = f;
                        C60870cx b = C60856cj.m92892a(new C58759qy((C60870cx) this.f60299b.get(akVar2))).mo57335b(C47810es.m84965e(new C21843bz(this, akVar2, cqVar, i, z, str, str2, str3)), this.f60303g);
                        this.f60300c.put(akVar2, b);
                        hashSet.add(b);
                    } else {
                        ijVar2 = f;
                        slVar = lA2;
                        treeSet.add(akVar2);
                    }
                    lA2 = slVar;
                    f = ijVar2;
                }
            }
            C58528ij ijVar3 = f;
            if (!treeSet.isEmpty()) {
                C65719d dVar = (C65719d) C65720e.f178550l.createBuilder();
                dVar.mo59418a(treeSet);
                dVar.copyOnWrite();
                C65720e eVar = (C65720e) dVar.instance;
                eVar.f178555e = cqVar.f178923h;
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
                eVar4.f178558h = z;
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
                hashSet.add(mo27145b((C65720e) dVar.build()));
            }
            g = C60922j.m93044g(C60856cj.m92896e(hashSet), C47810es.m84963c(new C21845ca(ijVar3)), this.f60303g);
        }
        return g;
    }

    /* renamed from: b */
    public final C60870cx mo27145b(C65720e eVar) {
        C60870cx a = this.f60304h.mo27127a(eVar);
        synchronized (this.f60298a) {
            for (C65753ak put : new C62963cj(eVar.f178553b, C65720e.f178549c)) {
                this.f60299b.put(put, a);
            }
        }
        return C60856cj.m92895d(a).mo57334a(C47810es.m84978r(new C21842by(this, eVar, a)), this.f60303g);
    }
}
