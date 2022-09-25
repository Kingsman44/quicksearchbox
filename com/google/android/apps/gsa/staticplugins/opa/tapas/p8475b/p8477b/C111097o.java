package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8477b;

import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48600ap;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48601aq;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48633bv;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48635bx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.b.o */
/* compiled from: PG */
public final /* synthetic */ class C111097o implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C111098p f309333a;

    /* renamed from: b */
    public final /* synthetic */ long f309334b;

    public /* synthetic */ C111097o(C111098p pVar, long j) {
        this.f309333a = pVar;
        this.f309334b = j;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C111098p pVar = this.f309333a;
        long j = this.f309334b;
        C48633bv bvVar = (C48633bv) C48635bx.f125704d.createBuilder();
        bvVar.copyOnWrite();
        ((C48635bx) bvVar.instance).f125708c = j;
        Optional h = pVar.f309335a.mo99849h();
        if (h.isPresent()) {
            C48600ap apVar = (C48600ap) C48601aq.f125610b.createBuilder();
            Iterable iterable = (Iterable) h.get();
            apVar.copyOnWrite();
            C48601aq aqVar = (C48601aq) apVar.instance;
            C62971cq cqVar = aqVar.f125612a;
            if (!cqVar.mo58948c()) {
                aqVar.f125612a = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll(iterable, (List) aqVar.f125612a);
            bvVar.copyOnWrite();
            C48635bx bxVar = (C48635bx) bvVar.instance;
            C48601aq aqVar2 = (C48601aq) apVar.build();
            aqVar2.getClass();
            bxVar.f125707b = aqVar2;
            bxVar.f125706a = 20;
        }
        return (C48635bx) bvVar.build();
    }
}
