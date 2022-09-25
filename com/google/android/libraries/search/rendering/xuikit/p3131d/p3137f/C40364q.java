package com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f;

import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57695ab;
import com.google.protos.p4895aw.p4903c.p4904a.p4929b.p4930a.C64252a;
import com.google.protos.p4895aw.p4903c.p4904a.p4929b.p4930a.C64253b;
import com.google.protos.p4895aw.p4903c.p4904a.p4929b.p4930a.C64255d;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.d.f.q */
/* compiled from: PG */
public final class C40364q {

    /* renamed from: a */
    public static final C58976aa f106014a = C58976aa.m91139c("xuikit_metadata", C64253b.class);

    /* renamed from: b */
    public final C58833ax f106015b;

    /* renamed from: c */
    public final C58833ax f106016c;

    public C40364q(C58833ax axVar, C58833ax axVar2) {
        C69664n.m101061g(axVar, "clientIdOptional");
        C69664n.m101061g(axVar2, "featureIdOptional");
        this.f106015b = axVar;
        this.f106016c = axVar2;
    }

    /* renamed from: a */
    public final C64253b mo42422a() {
        C64252a aVar = (C64252a) C64253b.f173731g.createBuilder();
        C69664n.m101060f(aVar, "newBuilder()");
        C64255d a = C69664n.m101061g(aVar, "builder");
        C57695ab abVar = (C57695ab) this.f106015b.mo56111f();
        if (abVar != null) {
            a.mo59265b(abVar);
        }
        C40354g gVar = (C40354g) this.f106016c.mo56111f();
        if (gVar != null) {
            int i = gVar.f105991a;
            C64252a aVar2 = a.f173739a;
            aVar2.copyOnWrite();
            C64253b bVar = (C64253b) aVar2.instance;
            bVar.f173733a |= 4;
            bVar.f173736d = i;
        }
        return a.mo59264a();
    }
}
