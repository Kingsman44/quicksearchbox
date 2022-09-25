package com.google.android.libraries.phenotype.client;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.phenotype.client.m */
/* compiled from: PG */
public final class C31674m {

    /* renamed from: a */
    private static volatile C58833ax f85185a;

    private C31674m() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:63|64) */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        throw r14;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x014a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.common.base.C58833ax m59018a(android.content.Context r14) {
        /*
            java.lang.Class<com.google.android.libraries.phenotype.client.m> r0 = com.google.android.libraries.phenotype.client.C31674m.class
            monitor-enter(r0)
            com.google.common.base.ax r1 = f85185a     // Catch:{ all -> 0x0163 }
            if (r1 != 0) goto L_0x0161
            java.lang.String r1 = android.os.Build.TYPE     // Catch:{ all -> 0x0163 }
            java.lang.String r2 = android.os.Build.TAGS     // Catch:{ all -> 0x0163 }
            java.lang.String r3 = "eng"
            boolean r3 = r1.equals(r3)     // Catch:{ all -> 0x0163 }
            if (r3 != 0) goto L_0x001b
            java.lang.String r3 = "userdebug"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0163 }
            if (r1 == 0) goto L_0x002c
        L_0x001b:
            java.lang.String r1 = "dev-keys"
            boolean r1 = r2.contains(r1)     // Catch:{ all -> 0x0163 }
            if (r1 != 0) goto L_0x0031
            java.lang.String r1 = "test-keys"
            boolean r1 = r2.contains(r1)     // Catch:{ all -> 0x0163 }
            if (r1 == 0) goto L_0x002c
            goto L_0x0031
        L_0x002c:
            com.google.common.base.b r14 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x0163 }
        L_0x002e:
            r1 = r14
            goto L_0x0159
        L_0x0031:
            android.content.Context r14 = com.google.android.libraries.directboot.C20674d.m38852a(r14)     // Catch:{ all -> 0x0163 }
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ all -> 0x0163 }
            android.os.StrictMode.allowThreadDiskWrites()     // Catch:{ all -> 0x015c }
            r2 = 0
            java.io.File r3 = new java.io.File     // Catch:{ RuntimeException -> 0x0058 }
            java.lang.String r4 = "phenotype_hermetic"
            java.io.File r4 = r14.getDir(r4, r2)     // Catch:{ RuntimeException -> 0x0058 }
            java.lang.String r5 = "overrides.txt"
            r3.<init>(r4, r5)     // Catch:{ RuntimeException -> 0x0058 }
            boolean r4 = r3.exists()     // Catch:{ all -> 0x015c }
            if (r4 == 0) goto L_0x0055
            com.google.common.base.ax r3 = com.google.common.base.C58833ax.m90834k(r3)     // Catch:{ all -> 0x015c }
            goto L_0x0062
        L_0x0055:
            com.google.common.base.b r3 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x015c }
            goto L_0x0062
        L_0x0058:
            r3 = move-exception
            java.lang.String r4 = "HermeticFileOverrides"
            java.lang.String r5 = "no data dir"
            android.util.Log.e(r4, r5, r3)     // Catch:{ all -> 0x015c }
            com.google.common.base.b r3 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x015c }
        L_0x0062:
            boolean r4 = r3.mo56113h()     // Catch:{ all -> 0x015c }
            if (r4 == 0) goto L_0x0152
            java.lang.Object r3 = r3.mo56107c()     // Catch:{ all -> 0x015c }
            java.io.File r3 = (java.io.File) r3     // Catch:{ all -> 0x015c }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException -> 0x014b }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x014b }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ IOException -> 0x014b }
            r6.<init>(r3)     // Catch:{ IOException -> 0x014b }
            r5.<init>(r6)     // Catch:{ IOException -> 0x014b }
            r4.<init>(r5)     // Catch:{ IOException -> 0x014b }
            r5 = 1
            androidx.c.n r6 = new androidx.c.n     // Catch:{ all -> 0x012f }
            r6.<init>(r2)     // Catch:{ all -> 0x012f }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x012f }
            r7.<init>()     // Catch:{ all -> 0x012f }
        L_0x0088:
            java.lang.String r8 = r4.readLine()     // Catch:{ all -> 0x012f }
            if (r8 == 0) goto L_0x00fc
            java.lang.String r9 = " "
            r10 = 3
            java.lang.String[] r9 = r8.split(r9, r10)     // Catch:{ all -> 0x012f }
            int r11 = r9.length     // Catch:{ all -> 0x012f }
            if (r11 == r10) goto L_0x00af
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x012f }
            r9.<init>()     // Catch:{ all -> 0x012f }
            java.lang.String r10 = "Invalid: "
            r9.append(r10)     // Catch:{ all -> 0x012f }
            r9.append(r8)     // Catch:{ all -> 0x012f }
            java.lang.String r8 = "HermeticFileOverrides"
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x012f }
            android.util.Log.e(r8, r9)     // Catch:{ all -> 0x012f }
            goto L_0x0088
        L_0x00af:
            r8 = r9[r2]     // Catch:{ all -> 0x012f }
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x012f }
            r10.<init>(r8)     // Catch:{ all -> 0x012f }
            r8 = r9[r5]     // Catch:{ all -> 0x012f }
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x012f }
            r11.<init>(r8)     // Catch:{ all -> 0x012f }
            java.lang.String r8 = android.net.Uri.decode(r11)     // Catch:{ all -> 0x012f }
            r11 = 2
            r12 = r9[r11]     // Catch:{ all -> 0x012f }
            java.lang.Object r12 = r7.get(r12)     // Catch:{ all -> 0x012f }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x012f }
            if (r12 != 0) goto L_0x00e4
            r9 = r9[r11]     // Catch:{ all -> 0x012f }
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x012f }
            r11.<init>(r9)     // Catch:{ all -> 0x012f }
            java.lang.String r12 = android.net.Uri.decode(r11)     // Catch:{ all -> 0x012f }
            int r9 = r12.length()     // Catch:{ all -> 0x012f }
            r13 = 1024(0x400, float:1.435E-42)
            if (r9 < r13) goto L_0x00e1
            if (r12 != r11) goto L_0x00e4
        L_0x00e1:
            r7.put(r11, r12)     // Catch:{ all -> 0x012f }
        L_0x00e4:
            boolean r9 = r6.containsKey(r10)     // Catch:{ all -> 0x012f }
            if (r9 != 0) goto L_0x00f2
            androidx.c.n r9 = new androidx.c.n     // Catch:{ all -> 0x012f }
            r9.<init>(r2)     // Catch:{ all -> 0x012f }
            r6.put(r10, r9)     // Catch:{ all -> 0x012f }
        L_0x00f2:
            java.lang.Object r9 = r6.get(r10)     // Catch:{ all -> 0x012f }
            androidx.c.n r9 = (androidx.p060c.C0984n) r9     // Catch:{ all -> 0x012f }
            r9.put(r8, r12)     // Catch:{ all -> 0x012f }
            goto L_0x0088
        L_0x00fc:
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x012f }
            java.lang.String r14 = r14.getPackageName()     // Catch:{ all -> 0x012f }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x012f }
            r7.<init>()     // Catch:{ all -> 0x012f }
            java.lang.String r8 = "Parsed "
            r7.append(r8)     // Catch:{ all -> 0x012f }
            r7.append(r3)     // Catch:{ all -> 0x012f }
            java.lang.String r3 = " for Android package "
            r7.append(r3)     // Catch:{ all -> 0x012f }
            r7.append(r14)     // Catch:{ all -> 0x012f }
            java.lang.String r14 = "HermeticFileOverrides"
            java.lang.String r3 = r7.toString()     // Catch:{ all -> 0x012f }
            android.util.Log.w(r14, r3)     // Catch:{ all -> 0x012f }
            com.google.android.libraries.phenotype.client.f r14 = new com.google.android.libraries.phenotype.client.f     // Catch:{ all -> 0x012f }
            r14.<init>(r6)     // Catch:{ all -> 0x012f }
            r4.close()     // Catch:{ IOException -> 0x014b }
            com.google.common.base.ax r14 = com.google.common.base.C58833ax.m90834k(r14)     // Catch:{ all -> 0x015c }
            goto L_0x0154
        L_0x012f:
            r14 = move-exception
            r4.close()     // Catch:{ all -> 0x0134 }
            goto L_0x014a
        L_0x0134:
            r3 = move-exception
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x014a }
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            r4[r2] = r6     // Catch:{ Exception -> 0x014a }
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            java.lang.String r7 = "addSuppressed"
            java.lang.reflect.Method r4 = r6.getDeclaredMethod(r7, r4)     // Catch:{ Exception -> 0x014a }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x014a }
            r5[r2] = r3     // Catch:{ Exception -> 0x014a }
            r4.invoke(r14, r5)     // Catch:{ Exception -> 0x014a }
        L_0x014a:
            throw r14     // Catch:{ IOException -> 0x014b }
        L_0x014b:
            r14 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x015c }
            r2.<init>(r14)     // Catch:{ all -> 0x015c }
            throw r2     // Catch:{ all -> 0x015c }
        L_0x0152:
            com.google.common.base.b r14 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x015c }
        L_0x0154:
            android.os.StrictMode.setThreadPolicy(r1)     // Catch:{ all -> 0x0163 }
            goto L_0x002e
        L_0x0159:
            f85185a = r1     // Catch:{ all -> 0x0163 }
            goto L_0x0161
        L_0x015c:
            r14 = move-exception
            android.os.StrictMode.setThreadPolicy(r1)     // Catch:{ all -> 0x0163 }
            throw r14     // Catch:{ all -> 0x0163 }
        L_0x0161:
            monitor-exit(r0)     // Catch:{ all -> 0x0163 }
            return r1
        L_0x0163:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0163 }
            goto L_0x0167
        L_0x0166:
            throw r14
        L_0x0167:
            goto L_0x0166
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.phenotype.client.C31674m.m59018a(android.content.Context):com.google.common.base.ax");
    }
}
