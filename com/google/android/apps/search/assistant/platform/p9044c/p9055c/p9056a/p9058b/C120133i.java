package com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9058b;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.assistant.platform.c.c.a.b.i */
/* compiled from: PG */
final class C120133i extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C120125a f334368a;

    /* renamed from: b */
    final /* synthetic */ C120135k f334369b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120133i(C120125a aVar, C120135k kVar) {
        super(0);
        this.f334368a = aVar;
        this.f334369b = kVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5672a() {
        C59052c cVar = (C59052c) C120135k.f334374a.mo56224b();
        C120125a aVar = this.f334368a;
        cVar.mo56379ah(new C59094n(34659));
        cVar.mo56389s("Legacy special assistant experience(%s) is inactive.", aVar);
        if (this.f334369b.f334375b.mo62808g(this.f334368a, C120125a.NONE)) {
            return C69788q.f186170a;
        }
        throw new IllegalStateException("Inconsistent legacy special assistant experience stream state.");
    }
}
