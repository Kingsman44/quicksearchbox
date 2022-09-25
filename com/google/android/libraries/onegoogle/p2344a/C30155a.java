package com.google.android.libraries.onegoogle.p2344a;

/* renamed from: com.google.android.libraries.onegoogle.a.a */
/* compiled from: PG */
public final class C30155a {

    /* renamed from: a */
    private static volatile Boolean f81531a;

    private C30155a() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        f81531a = false;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x003c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m56016a(android.content.Context r4, androidx.core.p097i.C1978m r5, java.lang.Object r6) {
        /*
            java.lang.Boolean r0 = f81531a
            if (r0 != 0) goto L_0x0047
            java.lang.Class<com.google.android.libraries.onegoogle.a.a> r0 = com.google.android.libraries.onegoogle.p2344a.C30155a.class
            monitor-enter(r0)
            java.lang.Boolean r1 = f81531a     // Catch:{ all -> 0x0044 }
            if (r1 != 0) goto L_0x0042
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ all -> 0x0044 }
            r2 = 0
            java.lang.String r4 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x003c }
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r4 = r1.getPackageInfo(r4, r3)     // Catch:{ NameNotFoundException -> 0x003c }
            if (r4 == 0) goto L_0x0034
            android.content.pm.ApplicationInfo r1 = r4.applicationInfo     // Catch:{ NameNotFoundException -> 0x003c }
            if (r1 == 0) goto L_0x0034
            android.content.pm.ApplicationInfo r1 = r4.applicationInfo     // Catch:{ NameNotFoundException -> 0x003c }
            android.os.Bundle r1 = r1.metaData     // Catch:{ NameNotFoundException -> 0x003c }
            if (r1 == 0) goto L_0x0034
            android.content.pm.ApplicationInfo r4 = r4.applicationInfo     // Catch:{ NameNotFoundException -> 0x003c }
            android.os.Bundle r4 = r4.metaData     // Catch:{ NameNotFoundException -> 0x003c }
            java.lang.String r1 = "com.google.android.libraries.onegoogle.flags.disabled"
            boolean r4 = r4.getBoolean(r1, r2)     // Catch:{ NameNotFoundException -> 0x003c }
            if (r4 == 0) goto L_0x0034
            r4 = 1
            goto L_0x0035
        L_0x0034:
            r4 = 0
        L_0x0035:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ NameNotFoundException -> 0x003c }
            f81531a = r4     // Catch:{ NameNotFoundException -> 0x003c }
            goto L_0x0042
        L_0x003c:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0044 }
            f81531a = r4     // Catch:{ all -> 0x0044 }
        L_0x0042:
            monitor-exit(r0)     // Catch:{ all -> 0x0044 }
            goto L_0x0047
        L_0x0044:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0044 }
            throw r4
        L_0x0047:
            java.lang.Boolean r4 = f81531a
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0050
            return r6
        L_0x0050:
            java.lang.Object r4 = r5.mo5129a()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.onegoogle.p2344a.C30155a.m56016a(android.content.Context, androidx.core.i.m, java.lang.Object):java.lang.Object");
    }
}
