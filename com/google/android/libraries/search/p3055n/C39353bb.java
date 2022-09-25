package com.google.android.libraries.search.p3055n;

import com.google.protobuf.C62942bv;
import com.google.protobuf.p4746a.C62883b;
import java.util.Collections;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.n.bb */
/* compiled from: PG */
public final class C39353bb {

    /* renamed from: a */
    private final C39275ay f103635a;

    public C39353bb(C39275ay ayVar) {
        this.f103635a = ayVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C39276az mo41780a() {
        C62942bv build = this.f103635a.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C39276az) build;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo41781b(String str) {
        C69664n.m101061g(str, "value");
        this.f103635a.mo41753a(str);
    }

    /* renamed from: c */
    public final void mo41782c() {
        List unmodifiableList = Collections.unmodifiableList(((C39276az) this.f103635a.instance).f103458a);
        C69664n.m101060f(unmodifiableList, "_builder.getLocaleList()");
        new C62883b(unmodifiableList);
    }
}
