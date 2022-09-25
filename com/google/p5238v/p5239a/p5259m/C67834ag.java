package com.google.p5238v.p5239a.p5259m;

import com.google.p5238v.p5239a.C67536ag;
import com.google.p5238v.p5239a.p5243b.p5244a.C67543a;
import java.security.GeneralSecurityException;

/* renamed from: com.google.v.a.m.ag */
/* compiled from: PG */
public final class C67834ag implements C67536ag {

    /* renamed from: a */
    private final byte[] f183943a;

    public C67834ag(byte[] bArr) {
        if (!C67543a.m97645a(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        } else if (bArr.length == 32) {
            byte[] f = C67831ad.m97987f(bArr);
            this.f183943a = f;
            C67831ad.m97983b(f).mo59992a();
        } else {
            throw new IllegalArgumentException(String.format("Given private key's length is not %s", new Object[]{32}));
        }
    }
}
