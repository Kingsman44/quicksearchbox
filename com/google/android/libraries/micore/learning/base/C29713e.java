package com.google.android.libraries.micore.learning.base;

import java.util.regex.Pattern;

/* renamed from: com.google.android.libraries.micore.learning.base.e */
/* compiled from: PG */
public final class C29713e implements C29720l {

    /* renamed from: a */
    private static final Pattern f80481a = Pattern.compile("VmHWM:\\s+(\\d+) kB");

    /* JADX WARNING: Can't wrap try/catch for region: R(2:19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        throw r4;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0055 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x0055=Splitter:B:19:0x0055, B:11:0x0036=Splitter:B:11:0x0036} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.libraries.micore.learning.base.C29721m mo34857a() {
        /*
            r8 = this;
            android.os.Debug$MemoryInfo r0 = new android.os.Debug$MemoryInfo
            r0.<init>()
            android.os.Debug.getMemoryInfo(r0)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "/proc/self/status"
            r1.<init>(r2)
            r2 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ IOException | SecurityException -> 0x0056 }
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ IOException | SecurityException -> 0x0056 }
            r4.<init>(r1)     // Catch:{ IOException | SecurityException -> 0x0056 }
            r3.<init>(r4)     // Catch:{ IOException | SecurityException -> 0x0056 }
        L_0x001a:
            r1 = 1
            java.lang.String r4 = r3.readLine()     // Catch:{ all -> 0x003a }
            if (r4 == 0) goto L_0x0036
            java.util.regex.Pattern r5 = f80481a     // Catch:{ all -> 0x003a }
            java.util.regex.Matcher r4 = r5.matcher(r4)     // Catch:{ all -> 0x003a }
            boolean r5 = r4.find()     // Catch:{ all -> 0x003a }
            if (r5 == 0) goto L_0x001a
            java.lang.String r4 = r4.group(r1)     // Catch:{ all -> 0x003a }
            int r1 = java.lang.Integer.parseInt(r4)     // Catch:{ all -> 0x003a }
            r2 = r1
        L_0x0036:
            r3.close()     // Catch:{ IOException | SecurityException -> 0x0056 }
            goto L_0x0056
        L_0x003a:
            r4 = move-exception
            r3.close()     // Catch:{ all -> 0x003f }
            goto L_0x0055
        L_0x003f:
            r3 = move-exception
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0055 }
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            r5[r2] = r6     // Catch:{ Exception -> 0x0055 }
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            java.lang.String r7 = "addSuppressed"
            java.lang.reflect.Method r5 = r6.getDeclaredMethod(r7, r5)     // Catch:{ Exception -> 0x0055 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0055 }
            r1[r2] = r3     // Catch:{ Exception -> 0x0055 }
            r5.invoke(r4, r1)     // Catch:{ Exception -> 0x0055 }
        L_0x0055:
            throw r4     // Catch:{ IOException | SecurityException -> 0x0056 }
        L_0x0056:
            com.google.android.libraries.micore.learning.base.m r1 = new com.google.android.libraries.micore.learning.base.m
            int r3 = r0.nativePss
            int r0 = r0.dalvikPss
            r1.<init>(r3, r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.micore.learning.base.C29713e.mo34857a():com.google.android.libraries.micore.learning.base.m");
    }
}
