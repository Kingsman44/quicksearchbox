package com.google.android.libraries.search.assistant.invocation.p2655o.p2662e;

import com.google.android.libraries.search.assistant.p2697j.p2698a.C34747o;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71471ab;
import kotlinx.coroutines.p5574b.C71477ah;
import kotlinx.coroutines.p5574b.C71553dc;
import kotlinx.coroutines.p5574b.C71561dk;
import kotlinx.coroutines.p5574b.C71562dl;
import kotlinx.coroutines.p5574b.C71587n;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.e.bj */
/* compiled from: PG */
public final class C34191bj extends C34199j {

    /* renamed from: a */
    private final C71553dc f91010a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34191bj(C34155aa aaVar, C71422aw awVar, C69585o oVar) {
        super(oVar);
        C69664n.m101061g(aaVar, "invocationRoutingOracle");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(oVar, "lightweightContext");
        C71587n a = C71471ab.m104286a(new C34190bi(aaVar.mo39235a()));
        int i = C71562dl.f190976a;
        this.f91010a = C34747o.m63497a(a, awVar, C71561dk.m104450a(1));
    }

    /* renamed from: b */
    public final C71587n mo39244b(C34193d dVar) {
        C69664n.m101061g(dVar, "request");
        return C71477ah.m104295b(C71477ah.m104296c(this.f91010a, new C34186be((C69577g) null)), new C34187bf((C69577g) null));
    }
}
