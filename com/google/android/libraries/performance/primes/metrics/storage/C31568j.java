package com.google.android.libraries.performance.primes.metrics.storage;

import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.performance.primes.metrics.storage.j */
/* compiled from: PG */
final class C31568j {

    /* renamed from: a */
    private static final C59071e f85000a = C59071e.m91332i("com.google.android.libraries.performance.primes.metrics.storage.j");

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ef, code lost:
        r12 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f1, code lost:
        r12 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0078 A[SYNTHETIC, Splitter:B:22:0x0078] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ef A[ExcHandler: Error (e java.lang.Error), Splitter:B:5:0x001f] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0036 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.content.pm.PackageStats m58856a(android.content.Context r12) {
        /*
            com.google.android.libraries.p1623at.p1632e.C19559g.m37303b()
            java.lang.Class<android.os.storage.StorageManager> r0 = android.os.storage.StorageManager.class
            java.lang.Object r0 = r12.getSystemService(r0)
            android.os.storage.StorageManager r0 = (android.os.storage.StorageManager) r0
            r1 = 0
            if (r0 != 0) goto L_0x001d
            com.google.common.f.e r12 = f85000a
            com.google.common.f.x r12 = r12.mo56225c()
            java.lang.String r0 = "StorageManager is not available"
            r2 = 50434(0xc502, float:7.0673E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r2)).mo56386p(r0)
            return r1
        L_0x001d:
            java.lang.Class<android.app.usage.StorageStatsManager> r2 = android.app.usage.StorageStatsManager.class
            java.lang.Object r2 = r12.getSystemService(r2)     // Catch:{ RuntimeException -> 0x00f1, Error -> 0x00ef }
            android.app.usage.StorageStatsManager r2 = (android.app.usage.StorageStatsManager) r2     // Catch:{ RuntimeException -> 0x00f1, Error -> 0x00ef }
            java.lang.String r12 = r12.getPackageName()     // Catch:{ RuntimeException -> 0x00f1, Error -> 0x00ef }
            android.content.pm.PackageStats r3 = new android.content.pm.PackageStats     // Catch:{ RuntimeException -> 0x00f1, Error -> 0x00ef }
            r3.<init>(r12)     // Catch:{ RuntimeException -> 0x00f1, Error -> 0x00ef }
            java.util.List r0 = r0.getStorageVolumes()     // Catch:{ RuntimeException -> 0x00f1, Error -> 0x00ef }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ RuntimeException -> 0x00f1, Error -> 0x00ef }
        L_0x0036:
            boolean r4 = r0.hasNext()     // Catch:{ RuntimeException -> 0x00f1, Error -> 0x00ef }
            if (r4 == 0) goto L_0x00ee
            java.lang.Object r4 = r0.next()     // Catch:{ RuntimeException -> 0x00f1, Error -> 0x00ef }
            android.os.storage.StorageVolume r4 = (android.os.storage.StorageVolume) r4     // Catch:{ RuntimeException -> 0x00f1, Error -> 0x00ef }
            java.lang.String r5 = r4.getState()     // Catch:{ RuntimeException -> 0x00f1, Error -> 0x00ef }
            java.lang.String r6 = "mounted"
            boolean r5 = r5.equals(r6)     // Catch:{ RuntimeException -> 0x00f1, Error -> 0x00ef }
            if (r5 == 0) goto L_0x0036
            java.lang.String r4 = r4.getUuid()     // Catch:{ RuntimeException -> 0x00f1, Error -> 0x00ef }
            java.lang.String r5 = "1AEF-1A1E"
            boolean r5 = r5.equals(r4)     // Catch:{ RuntimeException -> 0x00f1, Error -> 0x00ef }
            if (r5 == 0) goto L_0x005c
        L_0x005a:
            r4 = r1
            goto L_0x0076
        L_0x005c:
            if (r4 != 0) goto L_0x0061
            java.util.UUID r4 = android.os.storage.StorageManager.UUID_DEFAULT     // Catch:{ IllegalArgumentException -> 0x0066 }
            goto L_0x0076
        L_0x0061:
            java.util.UUID r4 = java.util.UUID.fromString(r4)     // Catch:{ IllegalArgumentException -> 0x0066 }
            goto L_0x0076
        L_0x0066:
            r5 = move-exception
            com.google.common.f.e r6 = f85000a     // Catch:{ RuntimeException -> 0x00f1, Error -> 0x00ef }
            com.google.common.f.x r6 = r6.mo56226d()     // Catch:{ RuntimeException -> 0x00f1, Error -> 0x00ef }
            java.lang.String r7 = "Invalid UUID format: '%s'"
            r8 = 50436(0xc504, float:7.0676E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56382g(r5)).mo56372aa(r8)).mo56389s(r7, r4)     // Catch:{ RuntimeException -> 0x00f1, Error -> 0x00ef }
            goto L_0x005a
        L_0x0076:
            if (r4 == 0) goto L_0x0036
            android.os.UserHandle r5 = android.os.Process.myUserHandle()     // Catch:{ NameNotFoundException -> 0x00cf, IOException -> 0x00cd, RuntimeException -> 0x00cb, Error -> 0x00ef }
            android.app.usage.StorageStats r5 = r2.queryStatsForPackage(r4, r12, r5)     // Catch:{ NameNotFoundException -> 0x00cf, IOException -> 0x00cd, RuntimeException -> 0x00cb, Error -> 0x00ef }
            java.util.UUID r6 = android.os.storage.StorageManager.UUID_DEFAULT     // Catch:{ NameNotFoundException -> 0x00cf, IOException -> 0x00cd, RuntimeException -> 0x00cb, Error -> 0x00ef }
            boolean r4 = r6.equals(r4)     // Catch:{ NameNotFoundException -> 0x00cf, IOException -> 0x00cd, RuntimeException -> 0x00cb, Error -> 0x00ef }
            if (r4 == 0) goto L_0x00a9
            long r6 = r3.codeSize     // Catch:{ NameNotFoundException -> 0x00cf, IOException -> 0x00cd, RuntimeException -> 0x00cb, Error -> 0x00ef }
            long r8 = r5.getAppBytes()     // Catch:{ NameNotFoundException -> 0x00cf, IOException -> 0x00cd, RuntimeException -> 0x00cb, Error -> 0x00ef }
            long r6 = r6 + r8
            r3.codeSize = r6     // Catch:{ NameNotFoundException -> 0x00cf, IOException -> 0x00cd, RuntimeException -> 0x00cb, Error -> 0x00ef }
            long r6 = r3.dataSize     // Catch:{ NameNotFoundException -> 0x00cf, IOException -> 0x00cd, RuntimeException -> 0x00cb, Error -> 0x00ef }
            long r8 = r5.getDataBytes()     // Catch:{ NameNotFoundException -> 0x00cf, IOException -> 0x00cd, RuntimeException -> 0x00cb, Error -> 0x00ef }
            long r10 = r5.getCacheBytes()     // Catch:{ NameNotFoundException -> 0x00cf, IOException -> 0x00cd, RuntimeException -> 0x00cb, Error -> 0x00ef }
            long r8 = r8 - r10
            long r6 = r6 + r8
            r3.dataSize = r6     // Catch:{ NameNotFoundException -> 0x00cf, IOException -> 0x00cd, RuntimeException -> 0x00cb, Error -> 0x00ef }
            long r6 = r3.cacheSize     // Catch:{ NameNotFoundException -> 0x00cf, IOException -> 0x00cd, RuntimeException -> 0x00cb, Error -> 0x00ef }
            long r4 = r5.getCacheBytes()     // Catch:{ NameNotFoundException -> 0x00cf, IOException -> 0x00cd, RuntimeException -> 0x00cb, Error -> 0x00ef }
            long r6 = r6 + r4
            r3.cacheSize = r6     // Catch:{ NameNotFoundException -> 0x00cf, IOException -> 0x00cd, RuntimeException -> 0x00cb, Error -> 0x00ef }
            goto L_0x0036
        L_0x00a9:
            long r6 = r3.externalCodeSize     // Catch:{ NameNotFoundException -> 0x00cf, IOException -> 0x00cd, RuntimeException -> 0x00cb, Error -> 0x00ef }
            long r8 = r5.getAppBytes()     // Catch:{ NameNotFoundException -> 0x00cf, IOException -> 0x00cd, RuntimeException -> 0x00cb, Error -> 0x00ef }
            long r6 = r6 + r8
            r3.externalCodeSize = r6     // Catch:{ NameNotFoundException -> 0x00cf, IOException -> 0x00cd, RuntimeException -> 0x00cb, Error -> 0x00ef }
            long r6 = r3.externalDataSize     // Catch:{ NameNotFoundException -> 0x00cf, IOException -> 0x00cd, RuntimeException -> 0x00cb, Error -> 0x00ef }
            long r8 = r5.getDataBytes()     // Catch:{ NameNotFoundException -> 0x00cf, IOException -> 0x00cd, RuntimeException -> 0x00cb, Error -> 0x00ef }
            long r10 = r5.getCacheBytes()     // Catch:{ NameNotFoundException -> 0x00cf, IOException -> 0x00cd, RuntimeException -> 0x00cb, Error -> 0x00ef }
            long r8 = r8 - r10
            long r6 = r6 + r8
            r3.externalDataSize = r6     // Catch:{ NameNotFoundException -> 0x00cf, IOException -> 0x00cd, RuntimeException -> 0x00cb, Error -> 0x00ef }
            long r6 = r3.externalCacheSize     // Catch:{ NameNotFoundException -> 0x00cf, IOException -> 0x00cd, RuntimeException -> 0x00cb, Error -> 0x00ef }
            long r4 = r5.getCacheBytes()     // Catch:{ NameNotFoundException -> 0x00cf, IOException -> 0x00cd, RuntimeException -> 0x00cb, Error -> 0x00ef }
            long r6 = r6 + r4
            r3.externalCacheSize = r6     // Catch:{ NameNotFoundException -> 0x00cf, IOException -> 0x00cd, RuntimeException -> 0x00cb, Error -> 0x00ef }
            goto L_0x0036
        L_0x00cb:
            r4 = move-exception
            goto L_0x00d0
        L_0x00cd:
            r4 = move-exception
            goto L_0x00d0
        L_0x00cf:
            r4 = move-exception
        L_0x00d0:
            com.google.common.f.e r5 = f85000a     // Catch:{ RuntimeException -> 0x00f1, Error -> 0x00ef }
            com.google.common.f.x r5 = r5.mo56226d()     // Catch:{ RuntimeException -> 0x00f1, Error -> 0x00ef }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ RuntimeException -> 0x00f1, Error -> 0x00ef }
            com.google.common.f.x r4 = r5.mo56382g(r4)     // Catch:{ RuntimeException -> 0x00f1, Error -> 0x00ef }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ RuntimeException -> 0x00f1, Error -> 0x00ef }
            r5 = 50432(0xc500, float:7.067E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)     // Catch:{ RuntimeException -> 0x00f1, Error -> 0x00ef }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ RuntimeException -> 0x00f1, Error -> 0x00ef }
            java.lang.String r5 = "queryStatsForPackage() call failed"
            r4.mo56386p(r5)     // Catch:{ RuntimeException -> 0x00f1, Error -> 0x00ef }
            goto L_0x0036
        L_0x00ee:
            return r3
        L_0x00ef:
            r12 = move-exception
            goto L_0x00f2
        L_0x00f1:
            r12 = move-exception
        L_0x00f2:
            com.google.common.f.e r0 = f85000a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r2 = "StorageStatsManager is not available"
            r3 = 50433(0xc501, float:7.0672E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r12)).mo56372aa(r3)).mo56386p(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.performance.primes.metrics.storage.C31568j.m58856a(android.content.Context):android.content.pm.PackageStats");
    }
}
