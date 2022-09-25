package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.knowledge.p4671b.C61790ai;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.assistant.e.i.a.fj */
/* compiled from: PG */
public final class C51375fj {

    /* renamed from: a */
    public final C51376fk f133806a;

    public C51375fj(C51376fk fkVar) {
        this.f133806a = fkVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C51379fn mo53607a() {
        C62942bv build = this.f133806a.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C51379fn) build;
    }

    /* renamed from: b */
    public final C61790ai mo53608b() {
        C61790ai aiVar = ((C51379fn) this.f133806a.instance).f133817b;
        if (aiVar == null) {
            aiVar = C61790ai.f166898o;
        }
        C69664n.m101060f(aiVar, "_builder.getDisplay()");
        return aiVar;
    }

    /* renamed from: c */
    public final void mo53609c(C61790ai aiVar) {
        C69664n.m101061g(aiVar, "value");
        C51376fk fkVar = this.f133806a;
        fkVar.copyOnWrite();
        C51379fn fnVar = (C51379fn) fkVar.instance;
        C51379fn fnVar2 = C51379fn.f133814i;
        aiVar.getClass();
        fnVar.f133817b = aiVar;
        fnVar.f133816a |= 1;
    }
}
