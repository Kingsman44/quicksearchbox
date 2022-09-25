package com.google.android.gms.droidguard.p10790a;

/* renamed from: com.google.android.gms.droidguard.a.k */
/* compiled from: PG */
public final class C144110k {

    /* renamed from: a */
    public static final C144102c f390390a = new C144102c();

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m234313a(java.io.File r5, com.google.android.gms.droidguard.p10790a.C144101b r6) {
        /*
            r0 = 0
            java.lang.String r1 = r5.getAbsolutePath()     // Catch:{ GeneralSecurityException -> 0x005e }
            java.security.cert.X509Certificate[][] r1 = com.android.p270g.C5150h.m14065a(r1)     // Catch:{ e -> 0x0055, IOException -> 0x004c, RuntimeException -> 0x004a }
            int r2 = r1.length     // Catch:{ GeneralSecurityException -> 0x005e }
            r3 = 1
            if (r2 != r3) goto L_0x0042
            r1 = r1[r0]     // Catch:{ GeneralSecurityException -> 0x005e }
            r1 = r1[r0]     // Catch:{ GeneralSecurityException -> 0x005e }
            java.lang.String r2 = "SHA-256"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)     // Catch:{ GeneralSecurityException -> 0x005e }
            byte[] r1 = r1.getEncoded()     // Catch:{ GeneralSecurityException -> 0x005e }
            byte[] r1 = r2.digest(r1)     // Catch:{ GeneralSecurityException -> 0x005e }
            r2 = r6
            com.google.android.gms.droidguard.a.e r2 = (com.google.android.gms.droidguard.p10790a.C144104e) r2     // Catch:{ GeneralSecurityException -> 0x005e }
            byte[] r2 = r2.f390385d     // Catch:{ GeneralSecurityException -> 0x005e }
            boolean r2 = java.util.Arrays.equals(r2, r1)     // Catch:{ GeneralSecurityException -> 0x005e }
            if (r2 != 0) goto L_0x0040
            java.lang.String r2 = "user"
            java.lang.String r4 = android.os.Build.TYPE     // Catch:{ GeneralSecurityException -> 0x005e }
            boolean r2 = r2.equals(r4)     // Catch:{ GeneralSecurityException -> 0x005e }
            if (r2 != 0) goto L_0x0041
            com.google.android.gms.droidguard.a.e r6 = (com.google.android.gms.droidguard.p10790a.C144104e) r6     // Catch:{ GeneralSecurityException -> 0x005e }
            byte[] r6 = r6.f390384c     // Catch:{ GeneralSecurityException -> 0x005e }
            boolean r5 = java.util.Arrays.equals(r6, r1)     // Catch:{ GeneralSecurityException -> 0x005e }
            if (r5 == 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            return r0
        L_0x0040:
            r0 = 1
        L_0x0041:
            return r0
        L_0x0042:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException     // Catch:{ GeneralSecurityException -> 0x005e }
            java.lang.String r1 = "APK has more than one signature."
            r6.<init>(r1)     // Catch:{ GeneralSecurityException -> 0x005e }
            throw r6     // Catch:{ GeneralSecurityException -> 0x005e }
        L_0x004a:
            r6 = move-exception
            goto L_0x004d
        L_0x004c:
            r6 = move-exception
        L_0x004d:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch:{ GeneralSecurityException -> 0x005e }
            java.lang.String r2 = "Failed to verify signatures"
            r1.<init>(r2, r6)     // Catch:{ GeneralSecurityException -> 0x005e }
            throw r1     // Catch:{ GeneralSecurityException -> 0x005e }
        L_0x0055:
            r6 = move-exception
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch:{ GeneralSecurityException -> 0x005e }
            java.lang.String r2 = "Package is not signed"
            r1.<init>(r2, r6)     // Catch:{ GeneralSecurityException -> 0x005e }
            throw r1     // Catch:{ GeneralSecurityException -> 0x005e }
        L_0x005e:
            r6 = move-exception
            java.lang.String r5 = r5.getAbsolutePath()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "APK at "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = " failed signature verification"
            r1.append(r5)
            java.lang.String r5 = "DG"
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r5, r1, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.droidguard.p10790a.C144110k.m234313a(java.io.File, com.google.android.gms.droidguard.a.b):boolean");
    }
}
