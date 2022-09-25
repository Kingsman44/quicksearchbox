package com.google.assistant.p3897e.p3908d.p3909a;

import com.google.protobuf.C62942bv;
import com.google.protobuf.p4746a.C62883b;
import java.util.Collections;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.assistant.e.d.a.d */
/* compiled from: PG */
public final class C51173d {

    /* renamed from: a */
    public final C51178i f133204a;

    public C51173d(C51178i iVar) {
        this.f133204a = iVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C51181l mo53527a() {
        C62942bv build = this.f133204a.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C51181l) build;
    }

    /* renamed from: b */
    public final void mo53528b(C51180k kVar) {
        C69664n.m101061g(kVar, "value");
        C51178i iVar = this.f133204a;
        iVar.copyOnWrite();
        C51181l lVar = (C51181l) iVar.instance;
        C51181l lVar2 = C51181l.f133221d;
        lVar.f133224b = kVar.f133220f;
        lVar.f133223a |= 1;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo53529c() {
        List unmodifiableList = Collections.unmodifiableList(((C51181l) this.f133204a.instance).f133225c);
        C69664n.m101060f(unmodifiableList, "_builder.getBbArgsList()");
        new C62883b(unmodifiableList);
    }
}
