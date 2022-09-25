package com.google.p5238v.p5239a.p5246d.p5247a;

import com.google.p5238v.p5239a.C67620g;
import com.google.p5238v.p5239a.p5255j.C67718cu;
import com.google.p5238v.p5239a.p5259m.C67886p;
import java.math.BigInteger;

/* renamed from: com.google.v.a.d.a.g */
/* compiled from: PG */
final class C67560g implements C67620g {

    /* renamed from: a */
    private static final byte[] f183475a = new byte[0];

    /* renamed from: b */
    private final C67718cu f183476b;

    /* renamed from: c */
    private final C67561h f183477c;

    /* renamed from: d */
    private final C67557d f183478d;

    /* renamed from: e */
    private final C67556c f183479e;

    public C67560g(C67718cu cuVar, C67561h hVar, C67556c cVar, C67557d dVar) {
        this.f183476b = cuVar;
        this.f183477c = hVar;
        this.f183479e = cVar;
        this.f183478d = dVar;
    }

    /* renamed from: a */
    public final byte[] mo59927a(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        C67718cu cuVar = this.f183476b;
        C67561h hVar = this.f183477c;
        C67556c cVar = this.f183479e;
        C67557d dVar = this.f183478d;
        C67562i a = hVar.mo59928a(cuVar.f183731c.mo59174N());
        byte[] bArr3 = a.f183481b;
        byte[] bArr4 = a.f183480a;
        byte[] b = C67569p.m97704b(hVar.mo59929b(), cVar.mo59924d(), dVar.mo59919c());
        byte[] c = C67886p.m98135c(C67569p.f183482a, cVar.mo59923c(C67569p.m97707e("psk_id_hash", C67558e.f183468a, b), C67569p.f183493l), cVar.mo59923c(C67569p.m97707e("info_hash", bArr2, b), C67569p.f183493l));
        byte[] c2 = cVar.mo59923c(C67569p.m97707e("secret", C67558e.f183468a, b), bArr4);
        int a2 = dVar.mo59917a();
        byte[] b2 = cVar.mo59922b(c2, C67569p.m97708f("key", c, b, a2), a2);
        int b3 = dVar.mo59918b();
        C67558e eVar = new C67558e(bArr3, b2, cVar.mo59922b(c2, C67569p.m97708f("base_nonce", c, b, b3), b3), BigInteger.ONE.shiftLeft(dVar.mo59918b() * 8).subtract(BigInteger.ONE), dVar);
        byte[] bArr5 = f183475a;
        return C67886p.m98135c(eVar.f183471d, eVar.f183469b.mo59920d(eVar.f183470c, eVar.mo59926a(), bArr, bArr5));
    }
}
