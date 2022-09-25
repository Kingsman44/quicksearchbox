package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62942bv;
import com.google.protobuf.p4746a.C62883b;
import java.util.Collections;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.assistant.e.j.pp */
/* compiled from: PG */
public final class C52380pp {

    /* renamed from: a */
    private final C52079el f137455a;

    public C52380pp(C52079el elVar) {
        this.f137455a = elVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C52081en mo53843a() {
        C62942bv build = this.f137455a.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C52081en) build;
    }

    /* renamed from: b */
    public final void mo53844b(C52091ex exVar) {
        C69664n.m101061g(exVar, "value");
        C52079el elVar = this.f137455a;
        elVar.copyOnWrite();
        C52081en enVar = (C52081en) elVar.instance;
        C52081en enVar2 = C52081en.f136679i;
        exVar.getClass();
        enVar.f136685e = exVar;
        enVar.f136681a |= 16;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo53845c(C52083ep epVar) {
        C69664n.m101061g(epVar, "value");
        this.f137455a.mo53786c(epVar);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo53846d() {
        List unmodifiableList = Collections.unmodifiableList(((C52081en) this.f137455a.instance).f136684d);
        C69664n.m101060f(unmodifiableList, "_builder.getInteractionDeltaList()");
        new C62883b(unmodifiableList);
    }
}
