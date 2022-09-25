package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.protobuf.C62942bv;
import com.google.protobuf.p4746a.C62883b;
import java.util.Collections;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.assistant.e.j.e.ec */
/* compiled from: PG */
public final class C51923ec {

    /* renamed from: a */
    public final C51934en f136205a;

    public C51923ec(C51934en enVar) {
        this.f136205a = enVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C51953ff mo53740a() {
        C62942bv build = this.f136205a.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C51953ff) build;
    }

    /* renamed from: b */
    public final void mo53741b(C51936ep epVar) {
        C69664n.m101061g(epVar, "value");
        C51934en enVar = this.f136205a;
        enVar.copyOnWrite();
        C51953ff ffVar = (C51953ff) enVar.instance;
        C51953ff ffVar2 = C51953ff.f136315l;
        ffVar.f136323g = epVar.f136236u;
        ffVar.f136317a |= 32;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo53742c(C51948fa faVar) {
        C69664n.m101061g(faVar, "value");
        this.f136205a.mo53755b(faVar);
    }

    /* renamed from: d */
    public final void mo53743d() {
        C51934en enVar = this.f136205a;
        enVar.copyOnWrite();
        C51953ff ffVar = (C51953ff) enVar.instance;
        C51953ff ffVar2 = C51953ff.f136315l;
        ffVar.f136317a |= 16;
        ffVar.f136322f = true;
    }

    /* renamed from: e */
    public final /* synthetic */ void mo53744e() {
        List unmodifiableList = Collections.unmodifiableList(((C51953ff) this.f136205a.instance).f136319c);
        C69664n.m101060f(unmodifiableList, "_builder.getSubSectionsList()");
        new C62883b(unmodifiableList);
    }
}
