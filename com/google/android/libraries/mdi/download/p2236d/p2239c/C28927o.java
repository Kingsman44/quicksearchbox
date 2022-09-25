package com.google.android.libraries.mdi.download.p2236d.p2239c;

import android.net.Uri;
import com.google.android.libraries.mdi.download.C28736bn;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.C29327dk;
import com.google.android.libraries.mdi.download.C29328dl;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29099m;
import com.google.android.libraries.storage.p3304a.C42813k;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.libraries.mdi.download.d.c.o */
/* compiled from: PG */
public final class C28927o {

    /* renamed from: a */
    private static final char[] f78581a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static String m53846a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length + length)];
        int i = 0;
        for (byte b : bArr) {
            byte b2 = b & 255;
            int i2 = i + 1;
            char[] cArr2 = f78581a;
            cArr[i] = cArr2[b2 >>> 4];
            i = i2 + 1;
            cArr[i2] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:25|26) */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0055 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m53847b(com.google.android.libraries.storage.p3304a.C42813k r7, android.net.Uri r8) {
        /*
            java.lang.String r0 = ""
            com.google.android.libraries.storage.a.f.n r1 = new com.google.android.libraries.storage.a.f.n     // Catch:{ IOException -> 0x0056 }
            r1.<init>()     // Catch:{ IOException -> 0x0056 }
            java.lang.Object r7 = r7.mo45889c(r8, r1)     // Catch:{ IOException -> 0x0056 }
            java.io.InputStream r7 = (java.io.InputStream) r7     // Catch:{ IOException -> 0x0056 }
            r1 = 0
            java.security.MessageDigest r2 = m53849d()     // Catch:{ all -> 0x0037 }
            if (r2 != 0) goto L_0x0016
            r1 = r0
            goto L_0x0031
        L_0x0016:
            r3 = 8192(0x2000, float:1.14794E-41)
            byte[] r3 = new byte[r3]     // Catch:{ all -> 0x0037 }
            int r4 = r7.read(r3)     // Catch:{ all -> 0x0037 }
        L_0x001e:
            r5 = -1
            if (r4 == r5) goto L_0x0029
            r2.update(r3, r1, r4)     // Catch:{ all -> 0x0037 }
            int r4 = r7.read(r3)     // Catch:{ all -> 0x0037 }
            goto L_0x001e
        L_0x0029:
            byte[] r2 = r2.digest()     // Catch:{ all -> 0x0037 }
            java.lang.String r1 = m53846a(r2)     // Catch:{ all -> 0x0037 }
        L_0x0031:
            if (r7 == 0) goto L_0x0036
            r7.close()     // Catch:{ IOException -> 0x0056 }
        L_0x0036:
            return r1
        L_0x0037:
            r2 = move-exception
            if (r7 == 0) goto L_0x0055
            r7.close()     // Catch:{ all -> 0x003e }
            goto L_0x0055
        L_0x003e:
            r7 = move-exception
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0055 }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            r4[r1] = r5     // Catch:{ Exception -> 0x0055 }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r4 = r5.getDeclaredMethod(r6, r4)     // Catch:{ Exception -> 0x0055 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0055 }
            r3[r1] = r7     // Catch:{ Exception -> 0x0055 }
            r4.invoke(r2, r3)     // Catch:{ Exception -> 0x0055 }
        L_0x0055:
            throw r2     // Catch:{ IOException -> 0x0056 }
        L_0x0056:
            java.lang.String r7 = "%s: Failed to open file, uri = %s"
            java.lang.String r1 = "FileValidator"
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53936h(r7, r1, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.mdi.download.p2236d.p2239c.C28927o.m53847b(com.google.android.libraries.storage.a.k, android.net.Uri):java.lang.String");
    }

    /* renamed from: c */
    public static void m53848c(C42813k kVar, C29328dl dlVar, Uri uri, String str) {
        try {
            if (kVar.mo45894h(uri)) {
                int a = C29327dk.m54216a(dlVar.f79476e);
                if (a != 0) {
                    if (a == 2) {
                        return;
                    }
                }
                if (!m53847b(kVar, uri).equals(str)) {
                    C29045l.m53937i("%s: Downloaded file at uri = %s, checksum = %s verification failed", "FileValidator", uri, str);
                    C28736bn bnVar = new C28736bn();
                    bnVar.f78062a = C28737bo.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR;
                    throw bnVar.mo34334a();
                }
                return;
            }
            C29045l.m53937i("%s: Downloaded file %s is not present at %s", "FileValidator", C29099m.m54009e(dlVar), uri);
            C28736bn bnVar2 = new C28736bn();
            bnVar2.f78062a = C28737bo.DOWNLOADED_FILE_NOT_FOUND_ERROR;
            throw bnVar2.mo34334a();
        } catch (IOException e) {
            C29045l.m53938j(e, "%s: Failed to validate download file %s", "FileValidator", C29099m.m54009e(dlVar));
            C28736bn bnVar3 = new C28736bn();
            bnVar3.f78062a = C28737bo.UNABLE_TO_VALIDATE_DOWNLOAD_FILE_ERROR;
            bnVar3.f78064c = e;
            throw bnVar3.mo34334a();
        }
    }

    /* renamed from: d */
    public static MessageDigest m53849d() {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA1");
            if (instance != null) {
                return instance;
            }
            return null;
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
