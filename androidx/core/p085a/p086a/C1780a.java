package androidx.core.p085a.p086a;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;

/* renamed from: androidx.core.a.a.a */
/* compiled from: PG */
public final class C1780a {
    /* renamed from: a */
    static FingerprintManager.CryptoObject m4895a(Object obj) {
        return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
    }

    /* renamed from: b */
    public static FingerprintManager.CryptoObject m4896b(C1781b bVar) {
        if (bVar == null) {
            return null;
        }
        if (bVar.f5553b != null) {
            return new FingerprintManager.CryptoObject(bVar.f5553b);
        }
        if (bVar.f5552a != null) {
            return new FingerprintManager.CryptoObject(bVar.f5552a);
        }
        if (bVar.f5554c != null) {
            return new FingerprintManager.CryptoObject(bVar.f5554c);
        }
        return null;
    }

    /* renamed from: c */
    public static FingerprintManager m4897c(Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        return null;
    }

    /* renamed from: d */
    public static C1781b m4898d(Object obj) {
        FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
        if (cryptoObject == null) {
            return null;
        }
        if (cryptoObject.getCipher() != null) {
            return new C1781b(cryptoObject.getCipher());
        }
        if (cryptoObject.getSignature() != null) {
            return new C1781b(cryptoObject.getSignature());
        }
        if (cryptoObject.getMac() != null) {
            return new C1781b(cryptoObject.getMac());
        }
        return null;
    }

    /* renamed from: e */
    static void m4899e(Object obj, Object obj2, CancellationSignal cancellationSignal, int i, Object obj3, Handler handler) {
        ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i, (FingerprintManager.AuthenticationCallback) obj3, handler);
    }

    /* renamed from: f */
    public static boolean m4900f(Object obj) {
        return ((FingerprintManager) obj).hasEnrolledFingerprints();
    }

    /* renamed from: g */
    public static boolean m4901g(Object obj) {
        return ((FingerprintManager) obj).isHardwareDetected();
    }
}
