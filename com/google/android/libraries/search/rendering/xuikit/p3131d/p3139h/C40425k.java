package com.google.android.libraries.search.rendering.xuikit.p3131d.p3139h;

import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40364q;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.protobuf.C62934bn;
import com.google.protos.p4895aw.p4903c.p4904a.p4929b.p4930a.C64252a;
import com.google.protos.p4895aw.p4903c.p4904a.p4929b.p4930a.C64253b;
import com.google.protos.p4895aw.p4903c.p4904a.p4929b.p4930a.C64255d;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.d.h.k */
/* compiled from: PG */
final class C40425k extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C40433s f106111a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40425k(C40433s sVar) {
        super(1);
        this.f106111a = sVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5761a(Object obj) {
        Throwable th = (Throwable) obj;
        if (th != null) {
            C59052c cVar = (C59052c) ((C59052c) C40433s.f106138a.mo56225c()).mo56382g(th);
            C58976aa aaVar = C40364q.f106014a;
            C64253b a = this.f106111a.f106142e.mo42422a();
            C40433s sVar = this.f106111a;
            C62934bn builder = a.toBuilder();
            C69664n.m101060f(builder, "this.toBuilder()");
            C64255d a2 = C69664n.m101061g((C64252a) builder, "builder");
            a2.mo59265b(sVar.f106139b);
            cVar.mo56378ag(aaVar, a2.mo59264a());
            cVar.mo56379ah(new C59094n(53332));
            cVar.mo56386p("Error evicting from disk cache");
        }
        return C69788q.f186170a;
    }
}
