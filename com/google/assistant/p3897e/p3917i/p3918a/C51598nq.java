package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62942bv;
import com.google.protobuf.p4746a.C62883b;
import java.util.Collections;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.assistant.e.i.a.nq */
/* compiled from: PG */
public final class C51598nq {

    /* renamed from: a */
    private final C51603nv f134482a;

    public C51598nq(C51603nv nvVar) {
        this.f134482a = nvVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C51606ny mo53654a() {
        C62942bv build = this.f134482a.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C51606ny) build;
    }

    /* renamed from: b */
    public final void mo53655b(C51605nx nxVar) {
        C69664n.m101061g(nxVar, "value");
        C51603nv nvVar = this.f134482a;
        nvVar.copyOnWrite();
        C51606ny nyVar = (C51606ny) nvVar.instance;
        C51606ny nyVar2 = C51606ny.f134497d;
        nyVar.f134501c = nxVar.f134496e;
        nyVar.f134499a |= 1;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo53656c(C51602nu nuVar) {
        C69664n.m101061g(nuVar, "value");
        C51603nv nvVar = this.f134482a;
        nvVar.copyOnWrite();
        C51606ny nyVar = (C51606ny) nvVar.instance;
        C51606ny nyVar2 = C51606ny.f134497d;
        nuVar.getClass();
        nyVar.mo53662a();
        nyVar.f134500b.add(nuVar);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo53657d() {
        List unmodifiableList = Collections.unmodifiableList(((C51606ny) this.f134482a.instance).f134500b);
        C69664n.m101060f(unmodifiableList, "_builder.getTopContactsList()");
        new C62883b(unmodifiableList);
    }
}
