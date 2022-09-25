package com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e;

import android.util.Base64;
import com.google.common.p4575r.C60747d;
import com.google.common.util.C60789b;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.q.e.n */
/* compiled from: PG */
public final class C131245n {
    /* renamed from: a */
    public static String m213736a(byte[] bArr) {
        try {
            return new String(Base64.encode(m213737b(C60789b.m92791a(bArr, bArr.length)), 2), "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: b */
    private static byte[] m213737b(byte[] bArr) {
        try {
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[16];
            SecureRandom secureRandom = new SecureRandom();
            secureRandom.nextBytes(bArr2);
            secureRandom.nextBytes(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(1, secretKeySpec, new IvParameterSpec(bArr3));
            byte[] doFinal = instance.doFinal(bArr);
            Cipher instance2 = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            instance2.init(1, KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxRt9L3nEnWLb+gbnAO6JqLajkWNcEYy/JGcvRK5KPw9ziaX1iFVLb+jD0miVIdilupp6MYE0uKgLqQ3Q/uZipLvotVA9TghWZuF0oYIHPWUWvxvvCLrm9Q4JR4Xn/BnR3N+DzR1mC8Lmp1fsegI/Qla8mJzYVak6lQRMRST0yX0rwNCtnDfoDwiXIhWFADvPco9C4NbaHsZVgibziPVNRTOO9IDvhqNV/rjzGx31E6YXnNcaagIRn7n/D/mtiN3htmtY4JtkhVvakoA60B46LcEKyYFzTN11zG8xa+kdDDXlnWV1JaoMsMtEtyo9WUF1qYu4JS3nmUuq9b0eR26SGwIDAQAB", 0))));
            instance2.update(bArr2);
            return C60747d.m92721c(instance2.doFinal(bArr3), doFinal);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new IllegalStateException("Encryption error", e);
        }
    }
}
