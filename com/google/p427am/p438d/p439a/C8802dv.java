package com.google.p427am.p438d.p439a;

import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.p4746a.C62883b;
import java.util.Collections;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.am.d.a.dv */
/* compiled from: PG */
public final class C8802dv {

    /* renamed from: a */
    private final C8799ds f30180a;

    public C8802dv(C8799ds dsVar) {
        this.f30180a = dsVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C8800dt mo17238a() {
        C62942bv build = this.f30180a.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C8800dt) build;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo17239b(C8775cv cvVar) {
        C69664n.m101061g(cvVar, "value");
        C8799ds dsVar = this.f30180a;
        dsVar.copyOnWrite();
        C8800dt dtVar = (C8800dt) dsVar.instance;
        C8800dt dtVar2 = C8800dt.f30177b;
        cvVar.getClass();
        C62971cq cqVar = dtVar.f30179a;
        if (!cqVar.mo58948c()) {
            dtVar.f30179a = C62942bv.mutableCopy(cqVar);
        }
        dtVar.f30179a.add(cvVar);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo17240c() {
        List unmodifiableList = Collections.unmodifiableList(((C8800dt) this.f30180a.instance).f30179a);
        C69664n.m101060f(unmodifiableList, "_builder.getStateInfosList()");
        new C62883b(unmodifiableList);
    }
}
