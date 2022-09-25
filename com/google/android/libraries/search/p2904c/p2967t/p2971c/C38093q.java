package com.google.android.libraries.search.p2904c.p2967t.p2971c;

import com.google.protobuf.C62942bv;
import com.google.protobuf.p4746a.C62883b;
import java.util.Collections;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.c.t.c.q */
/* compiled from: PG */
public final class C38093q {

    /* renamed from: a */
    public final C38090n f100923a;

    public C38093q(C38090n nVar) {
        this.f100923a = nVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C38091o mo41254a() {
        C62942bv build = this.f100923a.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C38091o) build;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo41255b(C38080d dVar) {
        C69664n.m101061g(dVar, "value");
        C38090n nVar = this.f100923a;
        nVar.copyOnWrite();
        C38091o oVar = (C38091o) nVar.instance;
        C38091o oVar2 = C38091o.f100920b;
        dVar.getClass();
        oVar.mo41253a();
        oVar.f100922a.add(dVar);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo41256c() {
        List unmodifiableList = Collections.unmodifiableList(((C38091o) this.f100923a.instance).f100922a);
        C69664n.m101060f(unmodifiableList, "_builder.getDeltasList()");
        new C62883b(unmodifiableList);
    }
}
