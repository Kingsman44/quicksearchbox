package com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2672d;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34059bv;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34060bw;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2662e.C34155aa;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2662e.C34174at;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2662e.C34175au;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34231an;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34254bj;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2668a.C34354a;
import com.google.android.libraries.search.assistant.p2697j.p2698a.C34743k;
import com.google.common.p4526f.C59071e;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71471ab;
import kotlinx.coroutines.p5574b.C71506bj;
import kotlinx.coroutines.p5574b.C71536cm;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71594u;
import kotlinx.coroutines.p5574b.C71598y;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.h.d.n */
/* compiled from: PG */
public final class C34449n {

    /* renamed from: a */
    public static final C59071e f91543a = C59071e.m91331h();

    /* renamed from: b */
    public final C34354a f91544b;

    /* renamed from: c */
    public final C34231an f91545c;

    /* renamed from: d */
    public final C69585o f91546d;

    /* renamed from: e */
    private final C71587n f91547e;

    /* renamed from: f */
    private final C71587n f91548f;

    public C34449n(C34354a aVar, C34231an anVar, C34254bj bjVar, C34155aa aaVar, C71422aw awVar) {
        C69664n.m101061g(aVar, "connection");
        C69664n.m101061g(anVar, "invocationSourceDefinitions");
        C69664n.m101061g(bjVar, "invocationSourceStateProvider");
        C69664n.m101061g(aaVar, "invocationRoutingOracle");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f91544b = aVar;
        this.f91545c = anVar;
        C71587n a = C71471ab.m104286a(C71506bj.m104339e(new C34442g(C34743k.m63490a(aVar.mo39323d(), aaVar.mo39235a()), this), new C34443h((C69577g) null, bjVar, this)));
        this.f91547e = a;
        C71587n a2 = C71471ab.m104286a(C71598y.m104523c(new C34446k(a, this)));
        this.f91548f = a2;
        C34059bv bvVar = (C34059bv) C34060bw.f90762f.createBuilder();
        C69664n.m101060f(bvVar, "newBuilder()");
        this.f91546d = C71594u.m104517d(C71536cm.m104384b(C71536cm.m104384b(C34743k.m63492c(a2, C69664n.m101061g(bvVar, "builder").mo39199a()), new C34447l(this, (C69577g) null)), new C34448m(this, (C69577g) null)), awVar);
    }

    /* renamed from: a */
    public final Set mo39355a(C34174at atVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : atVar.mo39238b()) {
            if (C69664n.m101066l(((C34175au) entry.getValue()).f90971a, this.f91544b)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.keySet();
    }
}
