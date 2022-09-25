package com.google.p5238v.p5239a.p5246d.p5247a;

import com.google.p5238v.p5239a.p5255j.C67708ck;
import com.google.p5238v.p5239a.p5255j.C67709cl;
import com.google.p5238v.p5239a.p5255j.C67710cm;
import com.google.p5238v.p5239a.p5255j.C67714cq;

/* renamed from: com.google.v.a.d.a.j */
/* compiled from: PG */
final class C67563j {
    /* renamed from: a */
    static C67557d m97684a(C67714cq cqVar) {
        int i = cqVar.f183721c;
        int a = C67708ck.m97843a(i);
        if (a != 0 && a == 3) {
            return new C67554a(16);
        }
        int a2 = C67708ck.m97843a(i);
        if (a2 != 0 && a2 == 4) {
            return new C67554a(32);
        }
        int a3 = C67708ck.m97843a(i);
        if (a3 != 0 && a3 == 5) {
            return new C67555b();
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    /* renamed from: b */
    static C67561h m97685b(C67714cq cqVar) {
        int i = cqVar.f183719a;
        int b = C67710cm.m97846b(i);
        if (b != 0 && b == 3) {
            return new C67571r(new C67556c("HmacSha256"));
        }
        int b2 = C67710cm.m97846b(i);
        if (b2 != 0 && b2 == 4) {
            return C67570q.m97709c(1);
        }
        int b3 = C67710cm.m97846b(i);
        if (b3 != 0 && b3 == 5) {
            return C67570q.m97709c(2);
        }
        int b4 = C67710cm.m97846b(i);
        if (b4 != 0 && b4 == 6) {
            return C67570q.m97709c(3);
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }

    /* renamed from: c */
    static C67556c m97686c(C67714cq cqVar) {
        int i = cqVar.f183720b;
        int a = C67709cl.m97844a(i);
        if (a != 0 && a == 3) {
            return new C67556c("HmacSha256");
        }
        int a2 = C67709cl.m97844a(i);
        if (a2 != 0 && a2 == 4) {
            return new C67556c("HmacSha384");
        }
        int a3 = C67709cl.m97844a(i);
        if (a3 != 0 && a3 == 5) {
            return new C67556c("HmacSha512");
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }
}
