package com.google.ads.interactivemedia.p367v3.internal;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.ads.interactivemedia.v3.internal.apo */
/* compiled from: PG */
public final class apo {

    /* renamed from: a */
    private final apm f21358a;

    public apo(apm apm) {
        this.f21358a = apm;
    }

    /* renamed from: a */
    public final byte[] mo15147a(byte[] bArr, String str) {
        if (bArr.length == 16) {
            try {
                byte[] a = this.f21358a.mo15132a(str);
                int length = a.length;
                if (length > 16) {
                    ByteBuffer allocate = ByteBuffer.allocate(length);
                    allocate.put(a);
                    allocate.flip();
                    byte[] bArr2 = new byte[16];
                    byte[] bArr3 = new byte[(length - 16)];
                    allocate.get(bArr2);
                    allocate.get(bArr3);
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                    Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
                    instance.init(2, secretKeySpec, new IvParameterSpec(bArr2));
                    return instance.doFinal(bArr3);
                }
                throw new apn();
            } catch (NoSuchAlgorithmException e) {
                throw new apn(e);
            } catch (InvalidKeyException e2) {
                throw new apn(e2);
            } catch (IllegalBlockSizeException e3) {
                throw new apn(e3);
            } catch (NoSuchPaddingException e4) {
                throw new apn(e4);
            } catch (BadPaddingException e5) {
                throw new apn(e5);
            } catch (InvalidAlgorithmParameterException e6) {
                throw new apn(e6);
            } catch (IllegalArgumentException e7) {
                throw new apn(e7);
            }
        } else {
            throw new apn();
        }
    }

    /* renamed from: b */
    public final byte[] mo15148b() {
        try {
            byte[] a = this.f21358a.mo15132a("dmFUD4yixjCLeIFssMn8+bpXZchyM7ZZjdHVe+zeIw0=");
            if (a.length == 32) {
                byte[] bArr = new byte[16];
                ByteBuffer.wrap(a, 4, 16).get(bArr);
                for (int i = 0; i < 16; i++) {
                    bArr[i] = (byte) (bArr[i] ^ 68);
                }
                return bArr;
            }
            throw new apn();
        } catch (IllegalArgumentException e) {
            throw new apn(e);
        }
    }
}
