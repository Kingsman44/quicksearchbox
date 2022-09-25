package com.google.p5238v.p5239a.p5246d.p5247a;

import com.google.p5238v.p5239a.p5240a.p5241a.C67490c;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.v.a.d.a.a */
/* compiled from: PG */
final class C67554a implements C67557d {

    /* renamed from: a */
    private final int f183466a;

    public C67554a(int i) {
        if (i == 16 || i == 32) {
            this.f183466a = i;
            return;
        }
        throw new InvalidAlgorithmParameterException("Unsupported key length: " + i);
    }

    /* renamed from: a */
    public final int mo59917a() {
        return this.f183466a;
    }

    /* renamed from: b */
    public final int mo59918b() {
        return 12;
    }

    /* renamed from: d */
    public final byte[] mo59920d(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int length = bArr.length;
        if (length == this.f183466a) {
            return new C67490c(bArr, false).mo59880a(bArr2, bArr3);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: " + length);
    }

    /* renamed from: c */
    public final byte[] mo59919c() {
        int i = this.f183466a;
        if (i == 16) {
            return C67569p.f183490i;
        }
        if (i == 32) {
            return C67569p.f183491j;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }
}
