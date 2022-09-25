package com.google.assistant.p3861at;

import com.google.protobuf.C62942bv;
import com.google.protobuf.p4746a.C62883b;
import java.util.Collections;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.assistant.at.oe */
/* compiled from: PG */
public final class C50198oe {

    /* renamed from: a */
    private final C50192nz f130494a;

    public C50198oe(C50192nz nzVar) {
        this.f130494a = nzVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C50194oa mo53383a() {
        C62942bv build = this.f130494a.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C50194oa) build;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo53384b(C50183nq nqVar) {
        C69664n.m101061g(nqVar, "value");
        this.f130494a.mo53382a(nqVar);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo53385c() {
        List unmodifiableList = Collections.unmodifiableList(((C50194oa) this.f130494a.instance).f130487a);
        C69664n.m101060f(unmodifiableList, "_builder.getProviderUpdateList()");
        new C62883b(unmodifiableList);
    }
}
