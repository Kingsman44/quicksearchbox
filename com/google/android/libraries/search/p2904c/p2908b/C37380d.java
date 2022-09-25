package com.google.android.libraries.search.p2904c.p2908b;

import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.c.b.d */
/* compiled from: PG */
public final class C37380d {

    /* renamed from: a */
    private final C37385i f99286a;

    public C37380d(C37385i iVar) {
        this.f99286a = iVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C37386j mo40916a() {
        C62942bv build = this.f99286a.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C37386j) build;
    }

    /* renamed from: b */
    public final void mo40917b(C39226b bVar) {
        C69664n.m101061g(bVar, "value");
        C37385i iVar = this.f99286a;
        iVar.copyOnWrite();
        C37386j jVar = (C37386j) iVar.instance;
        C37386j jVar2 = C37386j.f99302d;
        jVar.f99306c = bVar.getNumber();
        jVar.f99304a |= 2;
    }

    /* renamed from: c */
    public final void mo40918c(C37388l lVar) {
        C69664n.m101061g(lVar, "value");
        C37385i iVar = this.f99286a;
        iVar.copyOnWrite();
        C37386j jVar = (C37386j) iVar.instance;
        C37386j jVar2 = C37386j.f99302d;
        lVar.getClass();
        jVar.f99305b = lVar;
        jVar.f99304a |= 1;
    }
}
