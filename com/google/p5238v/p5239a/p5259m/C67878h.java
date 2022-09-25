package com.google.p5238v.p5239a.p5259m;

import com.google.p5238v.p5239a.C67486a;
import com.google.p5238v.p5239a.p5243b.p5244a.C67543a;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.v.a.m.h */
/* compiled from: PG */
public final class C67878h implements C67486a {

    /* renamed from: a */
    private static final ThreadLocal f184027a = new C67876f();

    /* renamed from: b */
    private static final ThreadLocal f184028b = new C67877g();

    /* renamed from: c */
    private final byte[] f184029c;

    /* renamed from: d */
    private final byte[] f184030d;

    /* renamed from: e */
    private final SecretKeySpec f184031e;

    /* renamed from: f */
    private final int f184032f;

    public C67878h(byte[] bArr, int i) {
        if (!C67543a.m97645a(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        } else if (i == 12 || i == 16) {
            this.f184032f = i;
            C67870bp.m98083a(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.f184031e = secretKeySpec;
            Cipher cipher = (Cipher) f184027a.get();
            cipher.init(1, secretKeySpec);
            byte[] c = m98111c(cipher.doFinal(new byte[16]));
            this.f184029c = c;
            this.f184030d = m98111c(c);
        } else {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
    }

    /* renamed from: c */
    private static byte[] m98111c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            byte b = bArr[i];
            int i2 = i + 1;
            bArr2[i] = (byte) (((b + b) ^ ((bArr[i2] & 255) >>> 7)) & PrivateKeyType.INVALID);
            i = i2;
        }
        byte b2 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b2 + b2));
        return bArr2;
    }

    /* renamed from: d */
    private final byte[] m98112d(Cipher cipher, int i, byte[] bArr, int i2, int i3) {
        byte[] bArr2;
        int length;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(m98113e(bArr3, this.f184029c));
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        int i4 = 0;
        int i5 = 0;
        while (i3 - i5 > 16) {
            for (int i6 = 0; i6 < 16; i6++) {
                doFinal[i6] = (byte) (doFinal[i6] ^ bArr[(i2 + i5) + i6]);
            }
            doFinal = cipher.doFinal(doFinal);
            i5 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i5 + i2, i2 + i3);
        if (copyOfRange.length == 16) {
            bArr2 = m98113e(copyOfRange, this.f184029c);
        } else {
            byte[] copyOf = Arrays.copyOf(this.f184030d, 16);
            while (true) {
                length = copyOfRange.length;
                if (i4 >= length) {
                    break;
                }
                copyOf[i4] = (byte) (copyOf[i4] ^ copyOfRange[i4]);
                i4++;
            }
            copyOf[length] = (byte) (copyOf[length] ^ 128);
            bArr2 = copyOf;
        }
        return cipher.doFinal(m98113e(doFinal, bArr2));
    }

    /* renamed from: e */
    private static byte[] m98113e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    /* renamed from: a */
    public final byte[] mo59877a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = (length - this.f184032f) - 16;
        if (i >= 0) {
            Cipher cipher = (Cipher) f184027a.get();
            cipher.init(1, this.f184031e);
            Cipher cipher2 = cipher;
            byte[] d = m98112d(cipher2, 0, bArr, 0, this.f184032f);
            byte[] d2 = m98112d(cipher2, 1, bArr2, 0, 0);
            byte[] d3 = m98112d(cipher, 2, bArr, this.f184032f, i);
            int i2 = length - 16;
            byte b = 0;
            for (int i3 = 0; i3 < 16; i3++) {
                b = (byte) (b | (((bArr[i2 + i3] ^ d2[i3]) ^ d[i3]) ^ d3[i3]));
            }
            if (b == 0) {
                Cipher cipher3 = (Cipher) f184028b.get();
                cipher3.init(1, this.f184031e, new IvParameterSpec(d));
                return cipher3.doFinal(bArr, this.f184032f, i);
            }
            throw new AEADBadTagException("tag mismatch");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: b */
    public final byte[] mo59878b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.f184032f;
        if (length <= (Integer.MAX_VALUE - i) - 16) {
            byte[] bArr3 = new byte[(i + length + 16)];
            byte[] a = C67859be.m98062a(i);
            System.arraycopy(a, 0, bArr3, 0, this.f184032f);
            Cipher cipher = (Cipher) f184027a.get();
            cipher.init(1, this.f184031e);
            Cipher cipher2 = cipher;
            byte[] d = m98112d(cipher2, 0, a, 0, a.length);
            byte[] d2 = m98112d(cipher2, 1, bArr2, 0, 0);
            Cipher cipher3 = (Cipher) f184028b.get();
            cipher3.init(1, this.f184031e, new IvParameterSpec(d));
            cipher3.doFinal(bArr, 0, length, bArr3, this.f184032f);
            byte[] d3 = m98112d(cipher, 2, bArr3, this.f184032f, length);
            int i2 = length + this.f184032f;
            for (int i3 = 0; i3 < 16; i3++) {
                bArr3[i2 + i3] = (byte) ((d2[i3] ^ d[i3]) ^ d3[i3]);
            }
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
