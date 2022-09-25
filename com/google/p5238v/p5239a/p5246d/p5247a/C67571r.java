package com.google.p5238v.p5239a.p5246d.p5247a;

import com.google.p5238v.p5239a.p5259m.C67871bq;
import com.google.p5238v.p5239a.p5259m.C67886p;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.v.a.d.a.r */
/* compiled from: PG */
final class C67571r implements C67561h {

    /* renamed from: a */
    private final C67556c f183499a;

    public C67571r(C67556c cVar) {
        this.f183499a = cVar;
    }

    /* renamed from: a */
    public final C67562i mo59928a(byte[] bArr) {
        byte[] b = C67871bq.m98089b();
        byte[] a = C67871bq.m98088a(b, bArr);
        byte[] c = C67871bq.m98090c(b);
        byte[] c2 = C67886p.m98135c(c, bArr);
        byte[] d = C67569p.m97706d(C67569p.f183483b);
        C67556c cVar = this.f183499a;
        return new C67562i(cVar.mo59925e(a, c2, d, cVar.mo59921a()), c);
    }

    /* renamed from: b */
    public final byte[] mo59929b() {
        if (Arrays.equals(this.f183499a.mo59924d(), C67569p.f183487f)) {
            return C67569p.f183483b;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
