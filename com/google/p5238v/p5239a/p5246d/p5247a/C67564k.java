package com.google.p5238v.p5239a.p5246d.p5247a;

import com.google.p5238v.p5239a.p5250f.C67612s;
import com.google.p5238v.p5239a.p5255j.C67710cm;
import com.google.p5238v.p5239a.p5255j.C67714cq;
import com.google.p5238v.p5239a.p5255j.C67716cs;
import com.google.p5238v.p5239a.p5255j.C67718cu;
import com.google.p5238v.p5239a.p5259m.C67836ai;
import com.google.p5238v.p5239a.p5259m.C67871bq;
import com.google.p5238v.p5239a.p5260n.C67898a;
import com.google.protobuf.MessageLite;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

/* renamed from: com.google.v.a.d.a.k */
/* compiled from: PG */
final class C67564k extends C67612s {
    public C67564k(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo59896a(MessageLite messageLite) {
        C67716cs csVar = (C67716cs) messageLite;
        C67718cu cuVar = csVar.f183725b;
        if (cuVar == null) {
            throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
        } else if (cuVar.f183730b == null) {
            throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
        } else if (!csVar.f183726c.mo59173M()) {
            C67718cu cuVar2 = csVar.f183725b;
            if (cuVar2 == null) {
                cuVar2 = C67718cu.f183727d;
            }
            C67714cq cqVar = cuVar2.f183730b;
            if (cqVar == null) {
                cqVar = C67714cq.f183717d;
            }
            C67563j.m97685b(cqVar);
            C67563j.m97686c(cqVar);
            C67563j.m97684a(cqVar);
            int b = C67710cm.m97846b(cqVar.f183719a);
            int i = 1;
            if (b == 0) {
                b = 1;
            }
            if (b - 2 == 1) {
                C67718cu cuVar3 = csVar.f183725b;
                if (cuVar3 == null) {
                    cuVar3 = C67718cu.f183727d;
                }
                C67714cq cqVar2 = cuVar3.f183730b;
                if (cqVar2 == null) {
                    cqVar2 = C67714cq.f183717d;
                }
                int b2 = C67710cm.m97846b(cqVar2.f183719a);
                if (b2 == 0) {
                    b2 = 1;
                }
                int i2 = b2 - 2;
                if (i2 == 1) {
                    byte[] N = csVar.f183726c.mo59174N();
                    byte[] c = C67871bq.m98090c(N);
                    C67898a.m98152a(N);
                    C67898a.m98152a(c);
                } else if (i2 == 2 || i2 == 3 || i2 == 4) {
                    byte[] N2 = csVar.f183726c.mo59174N();
                    C67718cu cuVar4 = csVar.f183725b;
                    if (cuVar4 == null) {
                        cuVar4 = C67718cu.f183727d;
                    }
                    byte[] N3 = cuVar4.f183731c.mo59174N();
                    C67718cu cuVar5 = csVar.f183725b;
                    if (cuVar5 == null) {
                        cuVar5 = C67718cu.f183727d;
                    }
                    C67714cq cqVar3 = cuVar5.f183730b;
                    if (cqVar3 == null) {
                        cqVar3 = C67714cq.f183717d;
                    }
                    int b3 = C67710cm.m97846b(cqVar3.f183719a);
                    if (b3 == 0) {
                        b3 = 1;
                    }
                    int i3 = b3 - 2;
                    if (i3 != 2) {
                        if (i3 == 3) {
                            i = 2;
                        } else if (i3 == 4) {
                            i = 3;
                        } else {
                            throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
                        }
                    }
                    ECPublicKey n = C67836ai.m98013n(C67836ai.m98011l(i), N3);
                    ECPrivateKey j = C67836ai.m98009j(i, N2);
                    C67836ai.m98005f(n, j);
                    C67836ai.m98003d(n.getW(), j.getParams().getCurve());
                    C67898a.m98152a(N2);
                    C67898a.m98152a(N3);
                } else {
                    throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
                }
                return new C67559f();
            }
            throw new IllegalArgumentException("Unable to determine KEM-encoding length for ".concat(C67710cm.m97845a(b)));
        } else {
            throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
        }
    }
}
