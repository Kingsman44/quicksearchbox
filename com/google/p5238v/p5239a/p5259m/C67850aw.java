package com.google.p5238v.p5239a.p5259m;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.v.a.m.aw */
/* compiled from: PG */
public final class C67850aw {
    /* renamed from: a */
    public static byte[] m98042a(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        Mac mac = (Mac) C67838ak.f183949b.mo59993a(str);
        if (i <= mac.getMacLength() * PrivateKeyType.INVALID) {
            if (bArr2 == null || bArr2.length == 0) {
                mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
            } else {
                mac.init(new SecretKeySpec(bArr2, str));
            }
            byte[] bArr4 = new byte[i];
            mac.init(new SecretKeySpec(mac.doFinal(bArr), str));
            byte[] bArr5 = new byte[0];
            int i2 = 1;
            int i3 = 0;
            while (true) {
                mac.update(bArr5);
                mac.update(bArr3);
                mac.update((byte) i2);
                bArr5 = mac.doFinal();
                int length = bArr5.length;
                int i4 = i3 + length;
                if (i4 < i) {
                    System.arraycopy(bArr5, 0, bArr4, i3, length);
                    i2++;
                    i3 = i4;
                } else {
                    System.arraycopy(bArr5, 0, bArr4, i3, i - i3);
                    return bArr4;
                }
            }
        } else {
            throw new GeneralSecurityException("size too large");
        }
    }
}
