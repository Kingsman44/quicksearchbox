package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.common.base.C58817ah;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57303dd;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.u.fe */
/* compiled from: PG */
final class C135085fe implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ C135022cx f367914a;

    /* renamed from: b */
    final /* synthetic */ C57303dd f367915b;

    public C135085fe(C135022cx cxVar, C57303dd ddVar) {
        this.f367914a = cxVar;
        this.f367915b = ddVar;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C135020cv cvVar = (C135020cv) obj;
        C135022cx cxVar = this.f367914a;
        C57303dd ddVar = this.f367915b;
        C135019cu cuVar = (C135019cu) C135020cv.f367673d.createBuilder();
        C69664n.m101060f(cuVar, "newBuilder()");
        C69664n.m101061g(cuVar, "builder");
        C69664n.m101061g(cxVar, "value");
        cuVar.copyOnWrite();
        C135020cv cvVar2 = (C135020cv) cuVar.instance;
        cvVar2.f367676b = cxVar.f367686f;
        cvVar2.f367675a |= 1;
        C69664n.m101061g(ddVar, "value");
        cuVar.copyOnWrite();
        C135020cv cvVar3 = (C135020cv) cuVar.instance;
        ddVar.getClass();
        cvVar3.f367677c = ddVar;
        cvVar3.f367675a |= 2;
        C62942bv build = cuVar.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C135020cv) build;
    }
}
