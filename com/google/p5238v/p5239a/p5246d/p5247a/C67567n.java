package com.google.p5238v.p5239a.p5246d.p5247a;

import com.google.p5238v.p5239a.p5250f.C67612s;
import com.google.p5238v.p5239a.p5255j.C67714cq;
import com.google.p5238v.p5239a.p5255j.C67718cu;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.v.a.d.a.n */
/* compiled from: PG */
final class C67567n extends C67612s {
    public C67567n(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo59896a(MessageLite messageLite) {
        C67718cu cuVar = (C67718cu) messageLite;
        if (!cuVar.f183731c.mo59173M()) {
            C67714cq cqVar = cuVar.f183730b;
            if (cqVar == null) {
                cqVar = C67714cq.f183717d;
            }
            return new C67560g(cuVar, C67563j.m97685b(cqVar), C67563j.m97686c(cqVar), C67563j.m97684a(cqVar));
        }
        throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
    }
}
