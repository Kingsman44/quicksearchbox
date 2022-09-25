package com.google.android.libraries.search.assistant.p2825x.p2827b;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.p2825x.C36785a;
import kotlinx.coroutines.p5574b.C71587n;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.x.b.h */
/* compiled from: PG */
public final class C36828h extends C36831k {

    /* renamed from: a */
    private final C36785a f95977a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36828h(C36785a aVar, C69585o oVar) {
        super(oVar);
        C69664n.m101061g(aVar, "quickPhrasesManager");
        C69664n.m101061g(oVar, "lightweightContext");
        this.f95977a = aVar;
    }

    /* renamed from: b */
    public final C71587n mo40419b(C36822b bVar) {
        C69664n.m101061g(bVar, "request");
        C36785a aVar = this.f95977a;
        C34053bp bpVar = bVar.f95967a;
        if (bpVar == null) {
            bpVar = C34053bp.f90753a;
        }
        C69664n.m101060f(bpVar, "request.invocationToken");
        return new C36827g(aVar.mo40398a(bpVar));
    }
}
