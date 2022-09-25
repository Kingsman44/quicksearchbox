package com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5095a.p5096a.p5097a.p5098a;

import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.p4746a.C62883b;
import java.util.Collections;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.protos.j.a.a.a.b.a.b.a.a.a.a.a.l */
/* compiled from: PG */
public final class C65503l {

    /* renamed from: a */
    private final C65492a f178062a;

    public C65503l(C65492a aVar) {
        this.f178062a = aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C65497f mo59391a() {
        C62942bv build = this.f178062a.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C65497f) build;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo59392b(C65496e eVar) {
        C69664n.m101061g(eVar, "value");
        C65492a aVar = this.f178062a;
        aVar.copyOnWrite();
        C65497f fVar = (C65497f) aVar.instance;
        C65497f fVar2 = C65497f.f178057b;
        eVar.getClass();
        C62971cq cqVar = fVar.f178059a;
        if (!cqVar.mo58948c()) {
            fVar.f178059a = C62942bv.mutableCopy(cqVar);
        }
        fVar.f178059a.add(eVar);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo59393c() {
        List unmodifiableList = Collections.unmodifiableList(((C65497f) this.f178062a.instance).f178059a);
        C69664n.m101060f(unmodifiableList, "_builder.getChipsList()");
        new C62883b(unmodifiableList);
    }
}
