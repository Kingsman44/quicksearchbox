package com.google.android.libraries.p11002ag.p11004b.p11006b;

import java.util.Map;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.ag.b.b.a */
/* compiled from: PG */
public final class C147560a implements C147566g {

    /* renamed from: a */
    private final C147567h f398260a;

    /* renamed from: b */
    private final Map f398261b = new ConcurrentHashMap();

    public C147560a(C147567h hVar) {
        this.f398260a = hVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0082 A[SYNTHETIC, Splitter:B:41:0x0082] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0086 A[Catch:{ IllegalArgumentException | IllegalStateException -> 0x008a }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m240595b(java.lang.String r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.Map r0 = r6.f398261b     // Catch:{ all -> 0x009f }
            boolean r0 = r0.containsKey(r7)     // Catch:{ all -> 0x009f }
            if (r0 != 0) goto L_0x009d
            java.lang.Class<com.google.android.libraries.ag.b.a.a> r0 = com.google.android.libraries.p11002ag.p11004b.p11005a.C147558a.class
            java.io.InputStream r0 = r0.getResourceAsStream(r7)     // Catch:{ IllegalArgumentException -> 0x008c, IllegalStateException -> 0x008a }
            if (r0 != 0) goto L_0x0024
            java.util.logging.Logger r1 = com.google.android.libraries.p11002ag.p11004b.p11005a.C147558a.f398258a     // Catch:{ IllegalArgumentException -> 0x008c, IllegalStateException -> 0x008a }
            java.util.logging.Level r2 = java.util.logging.Level.WARNING     // Catch:{ IllegalArgumentException -> 0x008c, IllegalStateException -> 0x008a }
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ IllegalArgumentException -> 0x008c, IllegalStateException -> 0x008a }
            r4 = 0
            r3[r4] = r7     // Catch:{ IllegalArgumentException -> 0x008c, IllegalStateException -> 0x008a }
            java.lang.String r4 = "File %s not found"
            java.lang.String r3 = java.lang.String.format(r4, r3)     // Catch:{ IllegalArgumentException -> 0x008c, IllegalStateException -> 0x008a }
            r1.log(r2, r3)     // Catch:{ IllegalArgumentException -> 0x008c, IllegalStateException -> 0x008a }
        L_0x0024:
            if (r0 != 0) goto L_0x002b
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ IllegalArgumentException -> 0x008c, IllegalStateException -> 0x008a }
            goto L_0x0046
        L_0x002b:
            r1 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x0074, all -> 0x0072 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0074, all -> 0x0072 }
            com.google.android.libraries.ag.j r1 = new com.google.android.libraries.ag.j     // Catch:{ IOException -> 0x0070 }
            r1.<init>()     // Catch:{ IOException -> 0x0070 }
            r1.readExternal(r2)     // Catch:{ IOException -> 0x0070 }
            java.util.List r3 = r1.f398362a     // Catch:{ IOException -> 0x0070 }
            boolean r3 = r3.isEmpty()     // Catch:{ IOException -> 0x0070 }
            if (r3 != 0) goto L_0x0063
            java.util.List r0 = r1.f398362a     // Catch:{ IOException -> 0x0070 }
            com.google.android.libraries.p11002ag.p11004b.p11005a.C147559b.m240594a(r2)     // Catch:{ IllegalArgumentException -> 0x008c, IllegalStateException -> 0x008a }
        L_0x0046:
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x009f }
        L_0x004a:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x009f }
            if (r1 == 0) goto L_0x005c
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x009f }
            com.google.android.libraries.ag.i r1 = (com.google.android.libraries.p11002ag.C147579i) r1     // Catch:{ all -> 0x009f }
            com.google.android.libraries.ag.b.b.h r2 = r6.f398260a     // Catch:{ all -> 0x009f }
            r2.mo124311a(r1)     // Catch:{ all -> 0x009f }
            goto L_0x004a
        L_0x005c:
            java.util.Map r0 = r6.f398261b     // Catch:{ all -> 0x009f }
            r0.put(r7, r7)     // Catch:{ all -> 0x009f }
            monitor-exit(r6)
            return
        L_0x0063:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0070 }
            java.lang.String r3 = "Empty metadata"
            r1.<init>(r3)     // Catch:{ IOException -> 0x0070 }
            throw r1     // Catch:{ IOException -> 0x0070 }
        L_0x006b:
            r1 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
            goto L_0x0080
        L_0x0070:
            r1 = move-exception
            goto L_0x0078
        L_0x0072:
            r2 = move-exception
            goto L_0x0080
        L_0x0074:
            r2 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
        L_0x0078:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x006b }
            java.lang.String r4 = "Unable to parse metadata file"
            r3.<init>(r4, r1)     // Catch:{ all -> 0x006b }
            throw r3     // Catch:{ all -> 0x006b }
        L_0x0080:
            if (r1 == 0) goto L_0x0086
            com.google.android.libraries.p11002ag.p11004b.p11005a.C147559b.m240594a(r1)     // Catch:{ IllegalArgumentException -> 0x008c, IllegalStateException -> 0x008a }
            goto L_0x0089
        L_0x0086:
            com.google.android.libraries.p11002ag.p11004b.p11005a.C147559b.m240594a(r0)     // Catch:{ IllegalArgumentException -> 0x008c, IllegalStateException -> 0x008a }
        L_0x0089:
            throw r2     // Catch:{ IllegalArgumentException -> 0x008c, IllegalStateException -> 0x008a }
        L_0x008a:
            r0 = move-exception
            goto L_0x008d
        L_0x008c:
            r0 = move-exception
        L_0x008d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x009f }
            java.lang.String r2 = "Failed to read file "
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x009f }
            java.lang.String r7 = r2.concat(r7)     // Catch:{ all -> 0x009f }
            r1.<init>(r7, r0)     // Catch:{ all -> 0x009f }
            throw r1     // Catch:{ all -> 0x009f }
        L_0x009d:
            monitor-exit(r6)
            return
        L_0x009f:
            r7 = move-exception
            monitor-exit(r6)
            goto L_0x00a3
        L_0x00a2:
            throw r7
        L_0x00a3:
            goto L_0x00a2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p11002ag.p11004b.p11006b.C147560a.m240595b(java.lang.String):void");
    }

    /* renamed from: a */
    public final C147567h mo124310a(String str) {
        if (!this.f398261b.containsKey(str)) {
            m240595b(str);
        }
        return this.f398260a;
    }
}
