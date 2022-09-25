package com.google.speech.recognizer.p5233a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.speech.recognizer.a.w */
/* compiled from: PG */
public final class C67475w extends C62934bn implements C63001dt {
    public C67475w() {
        super(C67476x.f183390i);
    }

    /* renamed from: a */
    public final void mo59874a(C67468p pVar) {
        copyOnWrite();
        C67476x xVar = (C67476x) this.instance;
        C67476x xVar2 = C67476x.f183390i;
        pVar.getClass();
        C62971cq cqVar = xVar.f183396e;
        if (!cqVar.mo58948c()) {
            xVar.f183396e = C62942bv.mutableCopy(cqVar);
        }
        xVar.f183396e.add(pVar);
    }

    /* renamed from: b */
    public final void mo59875b(C67473u uVar) {
        copyOnWrite();
        C67476x xVar = (C67476x) this.instance;
        C67474v vVar = (C67474v) uVar.build();
        C67476x xVar2 = C67476x.f183390i;
        vVar.getClass();
        C62971cq cqVar = xVar.f183393b;
        if (!cqVar.mo58948c()) {
            xVar.f183393b = C62942bv.mutableCopy(cqVar);
        }
        xVar.f183393b.add(vVar);
    }
}
