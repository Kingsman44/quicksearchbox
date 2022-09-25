package com.google.apps.tiktok.inject;

import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.apps.tiktok.inject.k */
/* compiled from: PG */
public final /* synthetic */ class C47271k implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C47272l f122914a;

    /* renamed from: b */
    public final /* synthetic */ boolean f122915b;

    public /* synthetic */ C47271k(C47272l lVar, boolean z) {
        this.f122914a = lVar;
        this.f122915b = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060 A[SYNTHETIC, Splitter:B:20:0x0060] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063 A[Catch:{ all -> 0x007e, IOException -> 0x0093 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo18058a() {
        /*
            r7 = this;
            com.google.apps.tiktok.inject.l r0 = r7.f122914a
            boolean r1 = r7.f122915b
            g.a.a r2 = r0.f122920e     // Catch:{ IOException -> 0x0093 }
            java.lang.Object r2 = r2.mo17428b()     // Catch:{ IOException -> 0x0093 }
            android.content.pm.PackageInfo r2 = (android.content.pm.PackageInfo) r2     // Catch:{ IOException -> 0x0093 }
            int r3 = r2.versionCode     // Catch:{ IOException -> 0x0093 }
            android.content.pm.ApplicationInfo r4 = r2.applicationInfo     // Catch:{ IOException -> 0x0093 }
            java.lang.String r4 = r4.dataDir     // Catch:{ IOException -> 0x0093 }
            if (r4 == 0) goto L_0x008b
            java.io.File r4 = new java.io.File     // Catch:{ IOException -> 0x0093 }
            android.content.pm.ApplicationInfo r2 = r2.applicationInfo     // Catch:{ IOException -> 0x0093 }
            java.lang.String r2 = r2.dataDir     // Catch:{ IOException -> 0x0093 }
            java.lang.String r5 = "files"
            r4.<init>(r2, r5)     // Catch:{ IOException -> 0x0093 }
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x0093 }
            java.lang.String r5 = "tiktok"
            r2.<init>(r4, r5)     // Catch:{ IOException -> 0x0093 }
            r2.mkdirs()     // Catch:{ IOException -> 0x0093 }
            java.io.File r4 = new java.io.File     // Catch:{ IOException -> 0x0093 }
            java.lang.String r5 = "103243289"
            r4.<init>(r2, r5)     // Catch:{ IOException -> 0x0093 }
            boolean r2 = r4.createNewFile()     // Catch:{ IOException -> 0x0093 }
            boolean r5 = r4.exists()     // Catch:{ IOException -> 0x0093 }
            if (r5 == 0) goto L_0x0083
            boolean r5 = r4.isFile()     // Catch:{ IOException -> 0x0093 }
            if (r5 == 0) goto L_0x0083
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0093 }
            java.lang.String r6 = "rw"
            r5.<init>(r4, r6)     // Catch:{ IOException -> 0x0093 }
            if (r2 != 0) goto L_0x0055
            int r2 = com.google.apps.tiktok.inject.C47272l.m84080b(r5)     // Catch:{ all -> 0x007e }
            if (r3 == r2) goto L_0x0050
            goto L_0x0055
        L_0x0050:
            r5.close()     // Catch:{ IOException -> 0x0093 }
            r2 = 0
            goto L_0x005e
        L_0x0055:
            r2 = -1
            com.google.apps.tiktok.inject.C47272l.m84081d(r5, r2)     // Catch:{ all -> 0x007e }
            com.google.apps.tiktok.inject.i r2 = new com.google.apps.tiktok.inject.i     // Catch:{ all -> 0x007e }
            r2.<init>(r0, r5, r3)     // Catch:{ all -> 0x007e }
        L_0x005e:
            if (r2 != 0) goto L_0x0063
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a     // Catch:{ IOException -> 0x0093 }
            goto L_0x00b7
        L_0x0063:
            dagger.a r3 = r0.f122919d     // Catch:{ IOException -> 0x0093 }
            java.lang.Object r3 = r3.mo27525b()     // Catch:{ IOException -> 0x0093 }
            com.google.apps.tiktok.concurrent.k r3 = (com.google.apps.tiktok.concurrent.C46459k) r3     // Catch:{ IOException -> 0x0093 }
            com.google.common.util.concurrent.da r4 = r0.f122918c     // Catch:{ IOException -> 0x0093 }
            java.util.concurrent.Callable r2 = com.google.apps.tiktok.tracing.C47810es.m84978r(r2)     // Catch:{ IOException -> 0x0093 }
            com.google.common.util.concurrent.cx r2 = r4.mo19399b(r2)     // Catch:{ IOException -> 0x0093 }
            java.lang.String r4 = com.google.apps.tiktok.tracing.C47831fm.m85015j()     // Catch:{ IOException -> 0x0093 }
            r3.mo50456d(r2, r4)     // Catch:{ IOException -> 0x0093 }
            r0 = r2
            goto L_0x00b7
        L_0x007e:
            r2 = move-exception
            r5.close()     // Catch:{ IOException -> 0x0093 }
            throw r2     // Catch:{ IOException -> 0x0093 }
        L_0x0083:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0093 }
            java.lang.String r3 = "Something went wrong creating file to store package version. Will not run package replaced listeners. Will try again on next startup."
            r2.<init>(r3)     // Catch:{ IOException -> 0x0093 }
            throw r2     // Catch:{ IOException -> 0x0093 }
        L_0x008b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0093 }
            java.lang.String r3 = "PackageInfo was invalid."
            r2.<init>(r3)     // Catch:{ IOException -> 0x0093 }
            throw r2     // Catch:{ IOException -> 0x0093 }
        L_0x0093:
            r2 = move-exception
            java.lang.String r3 = "StartupAfterPkgReplaced"
            if (r1 == 0) goto L_0x00b0
            android.content.Context r1 = r0.f122916a
            boolean r1 = com.google.android.libraries.directboot.C20674d.m38856e(r1)
            if (r1 != 0) goto L_0x00a5
            java.lang.String r1 = "StartupAfterPackageReplaced failed, device was locked. Will reschedule."
            android.util.Log.w(r3, r1, r2)
        L_0x00a5:
            android.content.Context r1 = r0.f122916a
            com.google.apps.tiktok.inject.j r2 = new com.google.apps.tiktok.inject.j
            r2.<init>(r0)
            com.google.android.libraries.directboot.C20674d.m38853b(r1, r2)
            goto L_0x00b5
        L_0x00b0:
            java.lang.String r0 = "StartupAfterPackageReplaced failed, will try again next startup: "
            android.util.Log.e(r3, r0, r2)
        L_0x00b5:
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
        L_0x00b7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.tiktok.inject.C47271k.mo18058a():com.google.common.util.concurrent.cx");
    }
}
