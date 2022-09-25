package com.google.speech.p5218j.p5219a;

import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.p4746a.C62883b;
import java.util.Collections;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.speech.j.a.bj */
/* compiled from: PG */
public final class C66733bj {

    /* renamed from: a */
    private final C66726bc f181520a;

    public C66733bj(C66726bc bcVar) {
        this.f181520a = bcVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C66727bd mo59722a() {
        C62942bv build = this.f181520a.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C66727bd) build;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo59723b(C66707ak akVar) {
        C69664n.m101061g(akVar, "value");
        C66726bc bcVar = this.f181520a;
        bcVar.copyOnWrite();
        C66727bd bdVar = (C66727bd) bcVar.instance;
        C66727bd bdVar2 = C66727bd.f181507b;
        akVar.getClass();
        C62971cq cqVar = bdVar.f181509a;
        if (!cqVar.mo58948c()) {
            bdVar.f181509a = C62942bv.mutableCopy(cqVar);
        }
        bdVar.f181509a.add(akVar);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo59724c() {
        List unmodifiableList = Collections.unmodifiableList(((C66727bd) this.f181520a.instance).f181509a);
        C69664n.m101060f(unmodifiableList, "_builder.getContextList()");
        new C62883b(unmodifiableList);
    }
}
