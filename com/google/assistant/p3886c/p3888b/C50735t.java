package com.google.assistant.p3886c.p3888b;

import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.assistant.c.b.t */
/* compiled from: PG */
public final class C50735t {

    /* renamed from: a */
    private final C50732q f132026a;

    public C50735t(C50732q qVar) {
        this.f132026a = qVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C50733r mo53442a() {
        C62942bv build = this.f132026a.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C50733r) build;
    }

    /* renamed from: b */
    public final void mo53443b(C50731p pVar) {
        C69664n.m101061g(pVar, "value");
        C50732q qVar = this.f132026a;
        qVar.copyOnWrite();
        C50733r rVar = (C50733r) qVar.instance;
        C50733r rVar2 = C50733r.f132021d;
        rVar.f132024b = pVar.f132020d;
        rVar.f132023a |= 1;
    }

    /* renamed from: c */
    public final void mo53444c(String str) {
        C69664n.m101061g(str, "value");
        C50732q qVar = this.f132026a;
        qVar.copyOnWrite();
        C50733r rVar = (C50733r) qVar.instance;
        C50733r rVar2 = C50733r.f132021d;
        str.getClass();
        rVar.f132023a |= 2;
        rVar.f132025c = str;
    }
}
