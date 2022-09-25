package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a;

import com.google.android.apps.gsa.binaries.satin.app.aqn;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34048bk;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34049bl;
import kotlinx.coroutines.p5573a.C71387t;
import kotlinx.coroutines.p5574b.C71547cx;
import kotlinx.coroutines.p5574b.C71557dg;
import kotlinx.coroutines.p5574b.C71574dx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.a.bv */
/* compiled from: PG */
public final class C34266bv {

    /* renamed from: a */
    public final boolean f91160a;

    /* renamed from: b */
    public final C71547cx f91161b;

    /* renamed from: c */
    public final C34283cl f91162c;

    public C34266bv(C34043bf bfVar, C34217a aVar, aqn aqn) {
        C71547cx cxVar;
        C69664n.m101061g(bfVar, "source");
        C69664n.m101061g(aVar, "awaitStatePropagationSources");
        C69664n.m101061g(aqn, "timeoutFactory");
        boolean contains = aVar.contains(bfVar);
        this.f91160a = contains;
        if (contains) {
            cxVar = C71557dg.m104447e(1, 0, C71387t.DROP_OLDEST, 2);
        } else {
            C34268bx bxVar = C34268bx.f91163a;
            C34048bk bkVar = (C34048bk) C34049bl.f90749a.createBuilder();
            C69664n.m101060f(bkVar, "newBuilder()");
            cxVar = C71574dx.m104480b(new C34255bk(bxVar, C69664n.m101061g(bkVar, "builder").mo39196a()));
        }
        this.f91161b = cxVar;
        this.f91162c = new C34283cl();
    }
}
