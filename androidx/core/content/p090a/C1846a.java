package androidx.core.content.p090a;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;

/* renamed from: androidx.core.content.a.a */
/* compiled from: PG */
public final class C1846a {
    /* renamed from: a */
    public static long m5060a(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    /* renamed from: b */
    public static boolean m5061b(SigningInfo signingInfo) {
        return signingInfo.hasMultipleSigners();
    }

    /* renamed from: c */
    static boolean m5062c(PackageManager packageManager, String str, byte[] bArr, int i) {
        return packageManager.hasSigningCertificate(str, bArr, i);
    }

    /* renamed from: d */
    public static Signature[] m5063d(SigningInfo signingInfo) {
        return signingInfo.getApkContentsSigners();
    }

    /* renamed from: e */
    public static Signature[] m5064e(SigningInfo signingInfo) {
        return signingInfo.getSigningCertificateHistory();
    }
}
