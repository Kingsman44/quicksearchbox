package com.google.android.gms.analytics.internal;

import com.google.android.gms.analytics.p10733a.C142680a;

/* renamed from: com.google.android.gms.analytics.internal.t */
/* compiled from: PG */
public final class C142750t extends C142737g {

    /* renamed from: a */
    public final C142680a f387374a = new C142680a();

    public C142750t(C142740j jVar) {
        super(jVar);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        android.util.Log.e("GAv4", "Error retrieving package info: appName set to " + r4);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004b */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo117488a() {
        /*
            r8 = this;
            java.lang.String r0 = "Error retrieving package info: appName set to "
            com.google.android.gms.analytics.internal.j r1 = r8.f387328e
            com.google.android.gms.analytics.q r1 = r1.mo117542b()
            com.google.android.gms.analytics.a.a r2 = r1.f387402e
            if (r2 != 0) goto L_0x0067
            monitor-enter(r1)
            com.google.android.gms.analytics.a.a r2 = r1.f387402e     // Catch:{ all -> 0x0064 }
            if (r2 != 0) goto L_0x0062
            com.google.android.gms.analytics.a.a r2 = new com.google.android.gms.analytics.a.a     // Catch:{ all -> 0x0064 }
            r2.<init>()     // Catch:{ all -> 0x0064 }
            android.content.Context r3 = r1.f387399b     // Catch:{ all -> 0x0064 }
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch:{ all -> 0x0064 }
            android.content.Context r4 = r1.f387399b     // Catch:{ all -> 0x0064 }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ all -> 0x0064 }
            r2.f387171c = r4     // Catch:{ all -> 0x0064 }
            java.lang.String r5 = r3.getInstallerPackageName(r4)     // Catch:{ all -> 0x0064 }
            r2.f387172d = r5     // Catch:{ all -> 0x0064 }
            r5 = 0
            android.content.Context r6 = r1.f387399b     // Catch:{ NameNotFoundException -> 0x004b }
            java.lang.String r6 = r6.getPackageName()     // Catch:{ NameNotFoundException -> 0x004b }
            r7 = 0
            android.content.pm.PackageInfo r6 = r3.getPackageInfo(r6, r7)     // Catch:{ NameNotFoundException -> 0x004b }
            if (r6 == 0) goto L_0x005c
            android.content.pm.ApplicationInfo r7 = r6.applicationInfo     // Catch:{ NameNotFoundException -> 0x004b }
            java.lang.CharSequence r3 = r3.getApplicationLabel(r7)     // Catch:{ NameNotFoundException -> 0x004b }
            boolean r7 = android.text.TextUtils.isEmpty(r3)     // Catch:{ NameNotFoundException -> 0x004b }
            if (r7 != 0) goto L_0x0048
            java.lang.String r4 = r3.toString()     // Catch:{ NameNotFoundException -> 0x004b }
        L_0x0048:
            java.lang.String r5 = r6.versionName     // Catch:{ NameNotFoundException -> 0x004b }
            goto L_0x005c
        L_0x004b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0064 }
            r3.<init>(r0)     // Catch:{ all -> 0x0064 }
            r3.append(r4)     // Catch:{ all -> 0x0064 }
            java.lang.String r0 = "GAv4"
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0064 }
            android.util.Log.e(r0, r3)     // Catch:{ all -> 0x0064 }
        L_0x005c:
            r2.f387169a = r4     // Catch:{ all -> 0x0064 }
            r2.f387170b = r5     // Catch:{ all -> 0x0064 }
            r1.f387402e = r2     // Catch:{ all -> 0x0064 }
        L_0x0062:
            monitor-exit(r1)     // Catch:{ all -> 0x0064 }
            goto L_0x0067
        L_0x0064:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0064 }
            throw r0
        L_0x0067:
            com.google.android.gms.analytics.a.a r0 = r1.f387402e
            com.google.android.gms.analytics.a.a r1 = r8.f387374a
            r0.mo117461b(r1)
            com.google.android.gms.analytics.internal.j r0 = r8.f387328e
            com.google.android.gms.analytics.internal.bb r0 = r0.mo117550j()
            r0.mo117537k()
            java.lang.String r1 = r0.f387319b
            if (r1 == 0) goto L_0x007f
            com.google.android.gms.analytics.a.a r2 = r8.f387374a
            r2.f387169a = r1
        L_0x007f:
            r0.mo117537k()
            java.lang.String r0 = r0.f387318a
            if (r0 == 0) goto L_0x008a
            com.google.android.gms.analytics.a.a r1 = r8.f387374a
            r1.f387170b = r0
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.internal.C142750t.mo117488a():void");
    }
}
