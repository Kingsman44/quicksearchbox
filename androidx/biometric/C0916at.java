package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/* renamed from: androidx.biometric.at */
/* compiled from: PG */
public final class C0916at {
    /* renamed from: a */
    public static BiometricPrompt.CryptoObject m2836a(C0902af afVar) {
        PresentationSession presentationSession;
        IdentityCredential identityCredential;
        if (afVar == null) {
            return null;
        }
        Cipher cipher = afVar.f2984b;
        if (cipher != null) {
            return C0913aq.m2827b(cipher);
        }
        Signature signature = afVar.f2983a;
        if (signature != null) {
            return C0913aq.m2826a(signature);
        }
        Mac mac = afVar.f2985c;
        if (mac != null) {
            return C0913aq.m2828c(mac);
        }
        if (Build.VERSION.SDK_INT >= 30 && (identityCredential = afVar.f2986d) != null) {
            return C0914ar.m2832a(identityCredential);
        }
        if (Build.VERSION.SDK_INT < 33 || (presentationSession = afVar.f2987e) == null) {
            return null;
        }
        return C0915as.m2834a(presentationSession);
    }

    /* renamed from: b */
    public static C0902af m2837b() {
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            KeyGenParameterSpec.Builder a = C0912ap.m2821a("androidxBiometric", 3);
            C0912ap.m2824d(a);
            C0912ap.m2825e(a);
            KeyGenerator instance2 = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            C0912ap.m2823c(instance2, C0912ap.m2822b(a));
            instance2.generateKey();
            Cipher instance3 = Cipher.getInstance("AES/CBC/PKCS7Padding");
            instance3.init(1, (SecretKey) instance.getKey("androidxBiometric", (char[]) null));
            return new C0902af(instance3);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e) {
            Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e);
            return null;
        }
    }
}
