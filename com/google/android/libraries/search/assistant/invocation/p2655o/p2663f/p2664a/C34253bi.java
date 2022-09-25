package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34704n;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62917ay;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71477ah;
import kotlinx.coroutines.p5574b.C71486aq;
import kotlinx.coroutines.p5574b.C71536cm;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71594u;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.a.bi */
/* compiled from: PG */
public final class C34253bi implements C34704n {

    /* renamed from: a */
    public static final C59071e f91124a = C59071e.m91331h();

    /* renamed from: b */
    public final C34278cg f91125b;

    /* renamed from: c */
    private final C34231an f91126c;

    /* renamed from: d */
    private final C71422aw f91127d;

    public C34253bi(C34231an anVar, C34278cg cgVar, C71422aw awVar) {
        C69664n.m101061g(anVar, "invocationSourceDefinitions");
        C69664n.m101061g(cgVar, "stub");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f91126c = anVar;
        this.f91125b = cgVar;
        this.f91127d = awVar;
    }

    /* renamed from: a */
    public final C69585o mo39285a(C34043bf bfVar, C71587n nVar) {
        C69664n.m101061g(bfVar, "id");
        C69664n.m101061g(nVar, "flow");
        C62917ay a = this.f91126c.mo39277a(bfVar);
        if (a != null) {
            return C71594u.m104517d(C71477ah.m104295b(C71486aq.m104308b(C71536cm.m104384b(new C34248bd(nVar, bfVar, a), new C34249be(this, (C69577g) null)), new C34250bf(bfVar, (C69577g) null)), new C34252bh(this, bfVar, (C69577g) null)), this.f91127d);
        }
        throw new C34285cn(bfVar);
    }
}
