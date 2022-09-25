package com.google.android.libraries.p1657ba.p1664c.p1665a;

/* renamed from: com.google.android.libraries.ba.c.a.b */
/* compiled from: PG */
public final class C19645b {
    /* JADX WARNING: Can't wrap try/catch for region: R(2:42|43) */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        throw r13;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x00eb */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m37474a(android.content.Context r13, java.lang.String r14) {
        /*
            java.lang.Class<com.google.android.libraries.ba.c.a.b> r0 = com.google.android.libraries.p1657ba.p1664c.p1665a.C19645b.class
            java.lang.String r1 = "No assets exist in this folder: "
            r2 = 1
            r3 = 0
            android.content.res.AssetManager r4 = r13.getAssets()     // Catch:{ IOException -> 0x0126 }
            java.lang.String[] r5 = r4.list(r14)     // Catch:{ IOException -> 0x0126 }
            if (r5 == 0) goto L_0x0114
            int r1 = r5.length     // Catch:{ IOException -> 0x0126 }
            if (r1 != 0) goto L_0x001c
            com.google.android.libraries.ba.c.a.c r6 = com.google.android.libraries.p1657ba.p1664c.p1665a.C19646c.f54650a     // Catch:{ IOException -> 0x0126 }
            java.lang.String r7 = "Attempted to copy files from empty asset subfolder: %s."
            java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch:{ IOException -> 0x0126 }
            r6.mo24970d(r7, r14, r8)     // Catch:{ IOException -> 0x0126 }
        L_0x001c:
            r6 = 0
        L_0x001d:
            java.lang.String r7 = "/"
            if (r6 >= r1) goto L_0x00f9
            r8 = r5[r6]     // Catch:{ IOException -> 0x0126 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0126 }
            r9.<init>()     // Catch:{ IOException -> 0x0126 }
            r9.append(r14)     // Catch:{ IOException -> 0x0126 }
            r9.append(r7)     // Catch:{ IOException -> 0x0126 }
            r9.append(r8)     // Catch:{ IOException -> 0x0126 }
            java.lang.String r8 = r9.toString()     // Catch:{ IOException -> 0x0126 }
            java.lang.String[] r9 = r4.list(r8)     // Catch:{ IOException -> 0x0126 }
            int r9 = r9.length     // Catch:{ IOException -> 0x0126 }
            if (r9 <= 0) goto L_0x0041
            m37474a(r13, r8)     // Catch:{ IOException -> 0x0126 }
            goto L_0x00ca
        L_0x0041:
            android.content.res.AssetManager r9 = r13.getAssets()     // Catch:{ IOException -> 0x0126 }
            java.lang.String r10 = "file:///android_asset/"
            boolean r10 = r8.startsWith(r10)     // Catch:{ IOException -> 0x0126 }
            if (r10 == 0) goto L_0x0053
            r10 = 22
            java.lang.String r8 = r8.substring(r10)     // Catch:{ IOException -> 0x0126 }
        L_0x0053:
            com.google.android.libraries.ba.c.a.c r10 = com.google.android.libraries.p1657ba.p1664c.p1665a.C19646c.f54650a     // Catch:{ IOException -> 0x0126 }
            java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x0126 }
            r11[r3] = r8     // Catch:{ IOException -> 0x0126 }
            java.lang.String r12 = "Asset to copy: %s"
            r10.mo24969c(r0, r12, r11)     // Catch:{ IOException -> 0x0126 }
            java.io.File r10 = r13.getFilesDir()     // Catch:{ IOException -> 0x0126 }
            java.lang.String r10 = r10.getAbsolutePath()     // Catch:{ IOException -> 0x0126 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0126 }
            r11.<init>()     // Catch:{ IOException -> 0x0126 }
            r11.append(r10)     // Catch:{ IOException -> 0x0126 }
            r11.append(r7)     // Catch:{ IOException -> 0x0126 }
            r11.append(r8)     // Catch:{ IOException -> 0x0126 }
            java.lang.String r7 = r11.toString()     // Catch:{ IOException -> 0x0126 }
            java.io.InputStream r8 = r9.open(r8)     // Catch:{ IOException -> 0x00ec }
            java.io.File r9 = new java.io.File     // Catch:{ all -> 0x00ce }
            r9.<init>(r7)     // Catch:{ all -> 0x00ce }
            boolean r10 = r9.exists()     // Catch:{ all -> 0x00ce }
            if (r10 == 0) goto L_0x0091
            com.google.android.libraries.ba.c.a.c r9 = com.google.android.libraries.p1657ba.p1664c.p1665a.C19646c.f54650a     // Catch:{ all -> 0x00ce }
            java.lang.String r10 = "A file already exists at the toPath.  Copy cancelled to prevent overwrite."
            java.lang.Object[] r11 = new java.lang.Object[r3]     // Catch:{ all -> 0x00ce }
            r9.mo24969c(r0, r10, r11)     // Catch:{ all -> 0x00ce }
            goto L_0x00ba
        L_0x0091:
            java.io.File r10 = new java.io.File     // Catch:{ all -> 0x00ce }
            java.lang.String r11 = r9.getParent()     // Catch:{ all -> 0x00ce }
            r10.<init>(r11)     // Catch:{ all -> 0x00ce }
            r10.mkdirs()     // Catch:{ all -> 0x00ce }
            r9.createNewFile()     // Catch:{ all -> 0x00ce }
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ all -> 0x00ce }
            r9.<init>(r7)     // Catch:{ all -> 0x00ce }
            r10 = 1024(0x400, float:1.435E-42)
            byte[] r10 = new byte[r10]     // Catch:{ all -> 0x00ce }
        L_0x00a9:
            int r11 = r8.read(r10)     // Catch:{ all -> 0x00ce }
            r12 = -1
            if (r11 == r12) goto L_0x00b4
            r9.write(r10, r3, r11)     // Catch:{ all -> 0x00ce }
            goto L_0x00a9
        L_0x00b4:
            r9.flush()     // Catch:{ all -> 0x00ce }
            r9.close()     // Catch:{ all -> 0x00ce }
        L_0x00ba:
            if (r8 == 0) goto L_0x00bf
            r8.close()     // Catch:{ IOException -> 0x00ec }
        L_0x00bf:
            com.google.android.libraries.ba.c.a.c r8 = com.google.android.libraries.p1657ba.p1664c.p1665a.C19646c.f54650a     // Catch:{ IOException -> 0x0126 }
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x0126 }
            r9[r3] = r7     // Catch:{ IOException -> 0x0126 }
            java.lang.String r7 = "Copied asset to %s"
            r8.mo24969c(r0, r7, r9)     // Catch:{ IOException -> 0x0126 }
        L_0x00ca:
            int r6 = r6 + 1
            goto L_0x001d
        L_0x00ce:
            r13 = move-exception
            if (r8 == 0) goto L_0x00eb
            r8.close()     // Catch:{ all -> 0x00d5 }
            goto L_0x00eb
        L_0x00d5:
            r0 = move-exception
            java.lang.Class[] r1 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x00eb }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r1[r3] = r4     // Catch:{ Exception -> 0x00eb }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r5 = "addSuppressed"
            java.lang.reflect.Method r1 = r4.getDeclaredMethod(r5, r1)     // Catch:{ Exception -> 0x00eb }
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00eb }
            r4[r3] = r0     // Catch:{ Exception -> 0x00eb }
            r1.invoke(r13, r4)     // Catch:{ Exception -> 0x00eb }
        L_0x00eb:
            throw r13     // Catch:{ IOException -> 0x00ec }
        L_0x00ec:
            r13 = move-exception
            com.google.android.libraries.ba.c.a.c r0 = com.google.android.libraries.p1657ba.p1664c.p1665a.C19646c.f54650a     // Catch:{ IOException -> 0x0126 }
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x0126 }
            r1[r3] = r7     // Catch:{ IOException -> 0x0126 }
            java.lang.String r4 = "Failed to copy asset: %s"
            r0.mo24968b(r13, r4, r1)     // Catch:{ IOException -> 0x0126 }
            throw r13     // Catch:{ IOException -> 0x0126 }
        L_0x00f9:
            java.io.File r13 = r13.getFilesDir()
            java.lang.String r13 = r13.getAbsolutePath()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r13)
            r0.append(r7)
            r0.append(r14)
            java.lang.String r13 = r0.toString()
            return r13
        L_0x0114:
            java.io.FileNotFoundException r13 = new java.io.FileNotFoundException     // Catch:{ IOException -> 0x0126 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0126 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0126 }
            r0.append(r14)     // Catch:{ IOException -> 0x0126 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0126 }
            r13.<init>(r0)     // Catch:{ IOException -> 0x0126 }
            throw r13     // Catch:{ IOException -> 0x0126 }
        L_0x0126:
            r13 = move-exception
            com.google.android.libraries.ba.c.a.c r0 = com.google.android.libraries.p1657ba.p1664c.p1665a.C19646c.f54650a
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r14
            java.lang.String r14 = "Failed to copy asset sub folder: %s."
            r0.mo24968b(r13, r14, r1)
            goto L_0x0134
        L_0x0133:
            throw r13
        L_0x0134:
            goto L_0x0133
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p1657ba.p1664c.p1665a.C19645b.m37474a(android.content.Context, java.lang.String):java.lang.String");
    }
}
