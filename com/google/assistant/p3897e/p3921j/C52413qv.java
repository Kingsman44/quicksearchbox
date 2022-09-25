package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.assistant.e.j.qv */
/* compiled from: PG */
public final class C52413qv {

    /* renamed from: a */
    public final C51714bl f137536a;

    public C52413qv(C51714bl blVar) {
        this.f137536a = blVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C51715bm mo53859a() {
        C62942bv build = this.f137536a.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C51715bm) build;
    }

    /* renamed from: b */
    public final C51772cy mo53860b() {
        C51772cy cyVar = ((C51715bm) this.f137536a.instance).f135671h;
        if (cyVar == null) {
            cyVar = C51772cy.f135824p;
        }
        C69664n.m101060f(cyVar, "_builder.getSoftware()");
        return cyVar;
    }

    /* renamed from: c */
    public final void mo53861c(C52428rj rjVar) {
        C69664n.m101061g(rjVar, "value");
        C51714bl blVar = this.f137536a;
        blVar.copyOnWrite();
        C51715bm bmVar = (C51715bm) blVar.instance;
        C51715bm bmVar2 = C51715bm.f135662t;
        rjVar.getClass();
        bmVar.f135665b = rjVar;
        bmVar.f135664a |= 1;
    }

    /* renamed from: d */
    public final void mo53862d(C51772cy cyVar) {
        C69664n.m101061g(cyVar, "value");
        C51714bl blVar = this.f137536a;
        blVar.copyOnWrite();
        C51715bm bmVar = (C51715bm) blVar.instance;
        C51715bm bmVar2 = C51715bm.f135662t;
        cyVar.getClass();
        bmVar.f135671h = cyVar;
        bmVar.f135664a |= 128;
    }

    /* renamed from: e */
    public final void mo53863e(String str) {
        C69664n.m101061g(str, "value");
        C51714bl blVar = this.f137536a;
        blVar.copyOnWrite();
        C51715bm bmVar = (C51715bm) blVar.instance;
        C51715bm bmVar2 = C51715bm.f135662t;
        str.getClass();
        bmVar.f135664a |= 2;
        bmVar.f135666c = str;
    }
}
