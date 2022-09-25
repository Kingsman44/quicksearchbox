package com.google.assistant.p3886c.p3888b;

import com.google.protobuf.C62942bv;
import com.google.protobuf.p4746a.C62883b;
import java.util.Collections;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.assistant.c.b.j */
/* compiled from: PG */
public final class C50725j {

    /* renamed from: a */
    private final C50716a f132005a;

    public C50725j(C50716a aVar) {
        this.f132005a = aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C50723h mo53432a() {
        C62942bv build = this.f132005a.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C50723h) build;
    }

    /* renamed from: b */
    public final void mo53433b(String str) {
        C69664n.m101061g(str, "value");
        C50716a aVar = this.f132005a;
        aVar.copyOnWrite();
        C50723h hVar = (C50723h) aVar.instance;
        C50723h hVar2 = C50723h.f131999e;
        str.getClass();
        hVar.f132001a |= 1;
        hVar.f132002b = str;
    }

    /* renamed from: c */
    public final void mo53434c(C50722g gVar) {
        C69664n.m101061g(gVar, "value");
        C50716a aVar = this.f132005a;
        aVar.copyOnWrite();
        C50723h hVar = (C50723h) aVar.instance;
        C50723h hVar2 = C50723h.f131999e;
        hVar.f132003c = gVar.f131998e;
        hVar.f132001a |= 2;
    }

    /* renamed from: d */
    public final /* synthetic */ void mo53435d(C50720e eVar) {
        C69664n.m101061g(eVar, "value");
        this.f132005a.mo53428a(eVar);
    }

    /* renamed from: e */
    public final /* synthetic */ void mo53436e() {
        List unmodifiableList = Collections.unmodifiableList(((C50723h) this.f132005a.instance).f132004d);
        C69664n.m101060f(unmodifiableList, "_builder.getFormatParamList()");
        new C62883b(unmodifiableList);
    }
}
