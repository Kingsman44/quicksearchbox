package org.chromium.net.impl;

/* renamed from: org.chromium.net.impl.ct */
/* compiled from: PG */
public final class C72514ct {

    /* renamed from: a */
    private static final Object f192959a = new Object();

    /* renamed from: b */
    private static int f192960b;

    /* JADX WARNING: Can't wrap try/catch for region: R(7:5|6|7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m107222a(android.content.Context r4) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r4.getPackageName()
            r0.append(r1)
            r1 = 47
            r0.append(r1)
            java.lang.Object r1 = f192959a
            monitor-enter(r1)
            int r2 = f192960b     // Catch:{ all -> 0x007a }
            if (r2 != 0) goto L_0x0032
            android.content.pm.PackageManager r2 = r4.getPackageManager()     // Catch:{ all -> 0x007a }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ all -> 0x007a }
            r3 = 0
            android.content.pm.PackageInfo r4 = r2.getPackageInfo(r4, r3)     // Catch:{ NameNotFoundException -> 0x002a }
            int r2 = r4.versionCode     // Catch:{ NameNotFoundException -> 0x002a }
            f192960b = r2     // Catch:{ NameNotFoundException -> 0x002a }
            goto L_0x0032
        L_0x002a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007a }
            java.lang.String r0 = "Cannot determine package version"
            r4.<init>(r0)     // Catch:{ all -> 0x007a }
            throw r4     // Catch:{ all -> 0x007a }
        L_0x0032:
            monitor-exit(r1)     // Catch:{ all -> 0x007a }
            r0.append(r2)
            java.lang.String r4 = " (Linux; U; Android "
            r0.append(r4)
            java.lang.String r4 = android.os.Build.VERSION.RELEASE
            r0.append(r4)
            java.lang.String r4 = "; "
            r0.append(r4)
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r4 = android.os.Build.MODEL
            int r1 = r4.length()
            if (r1 <= 0) goto L_0x0060
            java.lang.String r1 = "; "
            r0.append(r1)
            r0.append(r4)
        L_0x0060:
            java.lang.String r4 = android.os.Build.ID
            int r1 = r4.length()
            if (r1 <= 0) goto L_0x0070
            java.lang.String r1 = "; Build/"
            r0.append(r1)
            r0.append(r4)
        L_0x0070:
            java.lang.String r4 = "; Cronet/107.0.5284.2)"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
        L_0x007a:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x007a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.C72514ct.m107222a(android.content.Context):java.lang.String");
    }
}
