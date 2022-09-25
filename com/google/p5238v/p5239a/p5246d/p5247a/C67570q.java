package com.google.p5238v.p5239a.p5246d.p5247a;

import com.google.p5238v.p5239a.p5259m.C67836ai;
import com.google.p5238v.p5239a.p5259m.C67886p;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

/* renamed from: com.google.v.a.d.a.q */
/* compiled from: PG */
final class C67570q implements C67561h {

    /* renamed from: a */
    private final C67556c f183497a;

    /* renamed from: b */
    private final int f183498b;

    private C67570q(C67556c cVar, int i) {
        this.f183497a = cVar;
        this.f183498b = i;
    }

    /* renamed from: c */
    static C67570q m97709c(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return new C67570q(new C67556c("HmacSha256"), 1);
        }
        if (i2 != 1) {
            return new C67570q(new C67556c("HmacSha512"), 3);
        }
        return new C67570q(new C67556c("HmacSha384"), 2);
    }

    /* renamed from: a */
    public final C67562i mo59928a(byte[] bArr) {
        KeyPair c = C67836ai.m98002c(C67836ai.m98011l(this.f183498b));
        byte[] h = C67836ai.m98007h((ECPrivateKey) c.getPrivate(), C67836ai.m98013n(C67836ai.m98011l(this.f183498b), bArr));
        int i = this.f183498b;
        byte[] m = C67836ai.m98012m(C67836ai.m98011l(i).getCurve(), 1, ((ECPublicKey) c.getPublic()).getW());
        byte[] c2 = C67886p.m98135c(m, bArr);
        byte[] d = C67569p.m97706d(mo59929b());
        C67556c cVar = this.f183497a;
        return new C67562i(cVar.mo59925e(h, c2, d, cVar.mo59921a()), m);
    }

    /* renamed from: b */
    public final byte[] mo59929b() {
        int i = this.f183498b - 1;
        if (i == 0) {
            return C67569p.f183484c;
        }
        if (i != 1) {
            return C67569p.f183486e;
        }
        return C67569p.f183485d;
    }
}
