package com.google.p5238v.p5239a.p5259m;

import com.google.p5238v.p5239a.C67486a;
import com.google.p5238v.p5239a.p5240a.p5241a.C67490c;
import com.google.p5238v.p5239a.p5243b.p5244a.C67543a;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;

/* renamed from: com.google.v.a.m.l */
/* compiled from: PG */
public final class C67882l implements C67486a {

    /* renamed from: a */
    private final C67490c f184047a;

    public C67882l(byte[] bArr) {
        if (C67543a.m97645a(2)) {
            this.f184047a = new C67490c(bArr, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    /* renamed from: a */
    public final byte[] mo59877a(byte[] bArr, byte[] bArr2) {
        int i = 12;
        byte[] copyOf = Arrays.copyOf(bArr, 12);
        C67490c cVar = this.f184047a;
        if (copyOf.length == 12) {
            boolean z = cVar.f183427c;
            int i2 = true != z ? 16 : 28;
            int length = bArr.length;
            if (length < i2) {
                throw new GeneralSecurityException("ciphertext too short");
            } else if (!z || ByteBuffer.wrap(copyOf).equals(ByteBuffer.wrap(bArr, 0, 12))) {
                ((Cipher) C67490c.f183425a.get()).init(2, cVar.f183426b, C67490c.m97489b(copyOf));
                boolean z2 = cVar.f183427c;
                if (true != z2) {
                    i = 0;
                }
                if (z2) {
                    length -= 12;
                }
                return ((Cipher) C67490c.f183425a.get()).doFinal(bArr, i, length);
            } else {
                throw new GeneralSecurityException("iv does not match prepended iv");
            }
        } else {
            throw new GeneralSecurityException("iv is wrong size");
        }
    }

    /* renamed from: b */
    public final byte[] mo59878b(byte[] bArr, byte[] bArr2) {
        return this.f184047a.mo59880a(C67859be.m98062a(12), bArr);
    }
}
