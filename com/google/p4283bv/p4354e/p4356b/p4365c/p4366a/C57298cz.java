package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.protobuf.C62917ay;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.bv.e.b.c.a.cz */
/* compiled from: PG */
public final class C57298cz {

    /* renamed from: a */
    public final C57300da f152948a;

    public C57298cz(C57300da daVar) {
        this.f152948a = daVar;
    }

    /* renamed from: a */
    public final C57294cv mo54464a() {
        C57294cv cvVar = ((C57303dd) this.f152948a.instance).f152961c;
        if (cvVar == null) {
            cvVar = C57294cv.f152940d;
        }
        C69664n.m101060f(cvVar, "_builder.getRequestContext()");
        return cvVar;
    }

    /* renamed from: b */
    public final /* synthetic */ C57303dd mo54465b() {
        C62942bv build = this.f152948a.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C57303dd) build;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo54466c(C62917ay ayVar, Object obj) {
        C69664n.m101061g(ayVar, "extension");
        C69664n.m101061g(obj, "value");
        this.f152948a.mo58885m(ayVar, obj);
    }

    /* renamed from: d */
    public final void mo54467d(C57294cv cvVar) {
        C69664n.m101061g(cvVar, "value");
        C57300da daVar = this.f152948a;
        daVar.copyOnWrite();
        C57303dd ddVar = (C57303dd) daVar.instance;
        C57303dd ddVar2 = C57303dd.f152957d;
        cvVar.getClass();
        ddVar.f152961c = cvVar;
        ddVar.f152959a |= 2;
    }
}
