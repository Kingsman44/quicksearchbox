package com.google.p5238v.p5239a.p5259m;

import com.google.p5238v.p5239a.C67537ah;
import com.google.p5238v.p5239a.p5243b.p5244a.C67543a;
import com.google.p5238v.p5239a.p5260n.C67898a;
import java.security.GeneralSecurityException;

/* renamed from: com.google.v.a.m.ah */
/* compiled from: PG */
public final class C67835ah implements C67537ah {

    /* renamed from: a */
    private final C67898a f183944a;

    public C67835ah(byte[] bArr) {
        if (!C67543a.m97645a(1)) {
            throw new IllegalStateException(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
        } else if (bArr.length == 32) {
            this.f183944a = C67898a.m98152a(bArr);
        } else {
            throw new IllegalArgumentException(String.format("Given public key's length is not %s.", new Object[]{32}));
        }
    }

    /* renamed from: a */
    public final void mo59912a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 64) {
            throw new GeneralSecurityException(String.format("The length of the signature is not %s.", new Object[]{64}));
        } else if (!C67831ad.m97986e(bArr2, bArr, this.f183944a.mo60031b())) {
            throw new GeneralSecurityException("Signature check failed.");
        }
    }
}
