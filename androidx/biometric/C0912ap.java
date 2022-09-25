package androidx.biometric;

import android.security.keystore.KeyGenParameterSpec;
import javax.crypto.KeyGenerator;

/* renamed from: androidx.biometric.ap */
/* compiled from: PG */
final class C0912ap {
    /* renamed from: a */
    static KeyGenParameterSpec.Builder m2821a(String str, int i) {
        return new KeyGenParameterSpec.Builder("androidxBiometric", 3);
    }

    /* renamed from: b */
    static KeyGenParameterSpec m2822b(KeyGenParameterSpec.Builder builder) {
        return builder.build();
    }

    /* renamed from: c */
    static void m2823c(KeyGenerator keyGenerator, KeyGenParameterSpec keyGenParameterSpec) {
        keyGenerator.init(keyGenParameterSpec);
    }

    /* renamed from: d */
    static void m2824d(KeyGenParameterSpec.Builder builder) {
        builder.setBlockModes(new String[]{"CBC"});
    }

    /* renamed from: e */
    static void m2825e(KeyGenParameterSpec.Builder builder) {
        builder.setEncryptionPaddings(new String[]{"PKCS7Padding"});
    }
}
