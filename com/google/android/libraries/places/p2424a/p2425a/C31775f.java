package com.google.android.libraries.places.p2424a.p2425a;

import android.content.Context;
import android.os.DropBoxManager;
import java.util.LinkedHashMap;

/* renamed from: com.google.android.libraries.places.a.a.f */
/* compiled from: PG */
public final class C31775f {

    /* renamed from: a */
    private static DropBoxManager f85385a;

    /* renamed from: b */
    private static final LinkedHashMap f85386b = new C31774e();

    /* renamed from: c */
    private static String f85387c;

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c1, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m59130a(java.lang.Throwable r17) {
        /*
            java.lang.Class<com.google.android.libraries.places.a.a.f> r1 = com.google.android.libraries.places.p2424a.p2425a.C31775f.class
            monitor-enter(r1)
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00c2 }
            long r2 = r0.getId()     // Catch:{ all -> 0x00c2 }
            int r0 = r17.hashCode()     // Catch:{ all -> 0x00c2 }
            java.util.LinkedHashMap r4 = f85386b     // Catch:{ all -> 0x00c2 }
            java.lang.Long r5 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x00c2 }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x00c2 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x00c2 }
            if (r4 == 0) goto L_0x0026
            int r4 = r4.intValue()     // Catch:{ all -> 0x00c2 }
            if (r4 == r0) goto L_0x0024
            goto L_0x0026
        L_0x0024:
            monitor-exit(r1)
            return
        L_0x0026:
            android.os.DropBoxManager r4 = f85385a     // Catch:{ all -> 0x00c2 }
            if (r4 == 0) goto L_0x00c0
            java.lang.String r5 = "system_app_crash"
            boolean r4 = r4.isTagEnabled(r5)     // Catch:{ all -> 0x00c2 }
            if (r4 == 0) goto L_0x00c0
            android.os.DropBoxManager r4 = f85385a     // Catch:{ all -> 0x00c2 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            r5.<init>()     // Catch:{ all -> 0x00c2 }
            r6 = 3
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x00c2 }
            java.lang.String r8 = f85387c     // Catch:{ all -> 0x00c2 }
            r9 = 0
            r7[r9] = r8     // Catch:{ all -> 0x00c2 }
            com.google.common.base.m r8 = new com.google.common.base.m     // Catch:{ all -> 0x00c2 }
            r10 = 46
            r8.<init>(r10)     // Catch:{ all -> 0x00c2 }
            com.google.common.base.cf r8 = com.google.common.base.C58869cf.m90936b(r8)     // Catch:{ all -> 0x00c2 }
            java.lang.String r10 = "2.7.0"
            java.util.List r8 = r8.mo56155i(r10)     // Catch:{ all -> 0x00c2 }
            int r10 = r8.size()     // Catch:{ all -> 0x00c2 }
            if (r10 == r6) goto L_0x005b
        L_0x0058:
            r11 = -1
            goto L_0x0078
        L_0x005b:
            r13 = 0
            r6 = 0
        L_0x005e:
            int r10 = r8.size()     // Catch:{ NumberFormatException -> 0x0058 }
            if (r6 >= r10) goto L_0x0077
            r15 = 100
            long r13 = r13 * r15
            java.lang.Object r10 = r8.get(r6)     // Catch:{ NumberFormatException -> 0x0058 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ NumberFormatException -> 0x0058 }
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ NumberFormatException -> 0x0058 }
            long r11 = (long) r10
            long r13 = r13 + r11
            int r6 = r6 + 1
            goto L_0x005e
        L_0x0077:
            r11 = r13
        L_0x0078:
            java.lang.Long r6 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x00c2 }
            r8 = 1
            r7[r8] = r6     // Catch:{ all -> 0x00c2 }
            java.lang.String r6 = "2.7.0"
            r10 = 2
            r7[r10] = r6     // Catch:{ all -> 0x00c2 }
            java.lang.String r6 = "Package: %s v%d (%s)\n"
            java.lang.String r6 = java.lang.String.format(r6, r7)     // Catch:{ all -> 0x00c2 }
            r5.append(r6)     // Catch:{ all -> 0x00c2 }
            java.lang.Object[] r6 = new java.lang.Object[r8]     // Catch:{ all -> 0x00c2 }
            java.lang.String r7 = android.os.Build.FINGERPRINT     // Catch:{ all -> 0x00c2 }
            r6[r9] = r7     // Catch:{ all -> 0x00c2 }
            java.lang.String r7 = "Build: %s\n"
            java.lang.String r6 = java.lang.String.format(r7, r6)     // Catch:{ all -> 0x00c2 }
            r5.append(r6)     // Catch:{ all -> 0x00c2 }
            java.lang.String r6 = "\n"
            r5.append(r6)     // Catch:{ all -> 0x00c2 }
            java.lang.String r6 = android.util.Log.getStackTraceString(r17)     // Catch:{ all -> 0x00c2 }
            r5.append(r6)     // Catch:{ all -> 0x00c2 }
            java.lang.String r6 = "system_app_crash"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00c2 }
            r4.addText(r6, r5)     // Catch:{ all -> 0x00c2 }
            java.util.LinkedHashMap r4 = f85386b     // Catch:{ all -> 0x00c2 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x00c2 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00c2 }
            r4.put(r2, r0)     // Catch:{ all -> 0x00c2 }
            monitor-exit(r1)
            return
        L_0x00c0:
            monitor-exit(r1)
            return
        L_0x00c2:
            r0 = move-exception
            monitor-exit(r1)
            goto L_0x00c6
        L_0x00c5:
            throw r0
        L_0x00c6:
            goto L_0x00c5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.p2424a.p2425a.C31775f.m59130a(java.lang.Throwable):void");
    }

    /* renamed from: b */
    public static synchronized void m59131b(Context context) {
        synchronized (C31775f.class) {
            if (f85385a == null) {
                f85385a = (DropBoxManager) context.getApplicationContext().getSystemService("dropbox");
                f85387c = "com.google.android.libraries.places";
            }
        }
    }
}
