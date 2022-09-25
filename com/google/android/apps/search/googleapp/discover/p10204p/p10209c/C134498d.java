package com.google.android.apps.search.googleapp.discover.p10204p.p10209c;

import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.p4746a.C62883b;
import java.util.Collections;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.p.c.d */
/* compiled from: PG */
public final class C134498d {

    /* renamed from: a */
    private final C134493a f366283a;

    public C134498d(C134493a aVar) {
        this.f366283a = aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C134496b mo111802a() {
        C62942bv build = this.f366283a.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C134496b) build;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo111803b(Iterable iterable) {
        C69664n.m101061g(iterable, "values");
        C134493a aVar = this.f366283a;
        aVar.copyOnWrite();
        C134496b bVar = (C134496b) aVar.instance;
        C134496b bVar2 = C134496b.f366280b;
        C62971cq cqVar = bVar.f366282a;
        if (!cqVar.mo58948c()) {
            bVar.f366282a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) bVar.f366282a);
    }

    /* renamed from: c */
    public final void mo111804c() {
        List unmodifiableList = Collections.unmodifiableList(((C134496b) this.f366283a.instance).f366282a);
        C69664n.m101060f(unmodifiableList, "_builder.getGenreList()");
        new C62883b(unmodifiableList);
    }
}
