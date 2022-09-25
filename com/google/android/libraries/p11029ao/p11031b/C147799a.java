package com.google.android.libraries.p11029ao.p11031b;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.ArraySet;
import java.util.Collections;

/* renamed from: com.google.android.libraries.ao.b.a */
/* compiled from: PG */
public final class C147799a {
    /* renamed from: a */
    public static int m240899a(PackageManager packageManager, int i, int i2) {
        String[] packagesForUid;
        int checkSignatures = packageManager.checkSignatures(i, i2);
        if (checkSignatures != -3) {
            return checkSignatures;
        }
        if (Build.VERSION.SDK_INT > 29) {
            return -3;
        }
        String[] packagesForUid2 = packageManager.getPackagesForUid(i);
        if (packagesForUid2 == null || packagesForUid2.length == 0 || (packagesForUid = packageManager.getPackagesForUid(i2)) == null || packagesForUid.length == 0) {
            return -4;
        }
        return m240901c(packageManager, packagesForUid2, packagesForUid);
    }

    /* renamed from: b */
    public static int m240900b(PackageManager packageManager, String str, String str2) {
        int checkSignatures = packageManager.checkSignatures(str, str2);
        if (checkSignatures != -3) {
            return checkSignatures;
        }
        if (Build.VERSION.SDK_INT > 29) {
            return -3;
        }
        return m240901c(packageManager, new String[]{str}, new String[]{str2});
    }

    /* renamed from: c */
    static int m240901c(PackageManager packageManager, String[] strArr, String[] strArr2) {
        ArraySet arraySet = new ArraySet();
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(strArr[i], 134217728);
                if (packageInfo == null) {
                    return -4;
                }
                if (packageInfo.signingInfo == null || packageInfo.signingInfo.getApkContentsSigners() == null || packageInfo.signingInfo.getApkContentsSigners().length == 0) {
                    return -1;
                }
                if (packageInfo.signingInfo.getApkContentsSigners().length == 1) {
                    arraySet.add(packageInfo.signingInfo.getApkContentsSigners()[0]);
                    if (packageInfo.signingInfo.getSigningCertificateHistory() != null && packageInfo.signingInfo.getSigningCertificateHistory().length > 0) {
                        Collections.addAll(arraySet, packageInfo.signingInfo.getSigningCertificateHistory());
                    }
                }
                i++;
            } catch (PackageManager.NameNotFoundException unused) {
                return -4;
            }
        }
        int length2 = strArr2.length;
        int i2 = 0;
        while (i2 < length2) {
            try {
                PackageInfo packageInfo2 = packageManager.getPackageInfo(strArr2[i2], 134217728);
                if (packageInfo2 == null) {
                    return -4;
                }
                if (packageInfo2.signingInfo == null || packageInfo2.signingInfo.getApkContentsSigners() == null || packageInfo2.signingInfo.getApkContentsSigners().length == 0) {
                    return -2;
                }
                if (packageInfo2.signingInfo.getApkContentsSigners() != null && packageInfo2.signingInfo.getApkContentsSigners().length == 1) {
                    if (!arraySet.contains(packageInfo2.signingInfo.getApkContentsSigners()[0])) {
                        if (packageInfo2.signingInfo.getSigningCertificateHistory() != null) {
                            Signature[] signingCertificateHistory = packageInfo2.signingInfo.getSigningCertificateHistory();
                            int length3 = signingCertificateHistory.length;
                            int i3 = 0;
                            while (i3 < length3) {
                                if (!arraySet.contains(signingCertificateHistory[i3])) {
                                    i3++;
                                }
                            }
                            continue;
                        } else {
                            continue;
                        }
                    }
                    return 0;
                }
                i2++;
            } catch (PackageManager.NameNotFoundException unused2) {
                return -4;
            }
        }
        return -3;
    }
}
