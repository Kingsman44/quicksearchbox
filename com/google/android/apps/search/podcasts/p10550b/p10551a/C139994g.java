package com.google.android.apps.search.podcasts.p10550b.p10551a;

import com.google.android.libraries.storage.p3315b.C42844bc;

/* renamed from: com.google.android.apps.search.podcasts.b.a.g */
/* compiled from: PG */
public final class C139994g implements C42844bc {

    /* renamed from: a */
    public static final C139994g f380505a = new C139994g();

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0043, code lost:
        p5462h.p5472e.C69598b.m101013a(r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        throw r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo45922a(com.google.android.libraries.storage.p3315b.C42847bf r7) {
        /*
            r6 = this;
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]
            com.google.android.libraries.storage.p3315b.C42847bf.m75694g()
            java.lang.String r2 = "\n      SELECT COUNT(*) FROM episode_metadata\n    "
            r3 = 2
            java.lang.String r4 = "ASQLDB"
            boolean r3 = android.util.Log.isLoggable(r4, r3)
            if (r3 == 0) goto L_0x0020
            android.database.sqlite.SQLiteDatabase r3 = r7.f112138b
            java.lang.String r5 = "EXPLAIN QUERY PLAN \n      SELECT COUNT(*) FROM episode_metadata\n    "
            android.database.Cursor r3 = r3.rawQuery(r5, r1)
            java.lang.String r3 = com.google.android.libraries.storage.p3315b.C42847bf.m75693f(r3)
            android.util.Log.v(r4, r3)
        L_0x0020:
            java.lang.String r3 = "Query: \n      SELECT COUNT(*) FROM episode_metadata\n    "
            com.google.apps.tiktok.tracing.bi r3 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r3)
            android.database.sqlite.SQLiteDatabase r4 = r7.f112138b     // Catch:{ all -> 0x0096 }
            android.os.CancellationSignal r5 = r7.f112137a     // Catch:{ all -> 0x0096 }
            android.database.Cursor r1 = r4.rawQuery(r2, r1, r5)     // Catch:{ all -> 0x0096 }
            r3.close()
            r2 = 0
            if (r1 == 0) goto L_0x0047
            boolean r4 = r1.moveToFirst()     // Catch:{ all -> 0x0040 }
            if (r4 == 0) goto L_0x0047
            long r2 = r1.getLong(r0)     // Catch:{ all -> 0x0040 }
            goto L_0x0047
        L_0x0040:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r0 = move-exception
            p5462h.p5472e.C69598b.m101013a(r1, r7)
            throw r0
        L_0x0047:
            r0 = 0
            p5462h.p5472e.C69598b.m101013a(r1, r0)
            r0 = 10000(0x2710, double:4.9407E-320)
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x0091
            com.google.android.libraries.storage.b.ax r0 = new com.google.android.libraries.storage.b.ax
            java.lang.String r1 = "episode_metadata"
            r0.<init>(r1)
            java.lang.StringBuilder r1 = r0.f112125a
            java.lang.String r4 = "rowid IN (SELECT rowid FROM episode_metadata ORDER BY update_time_ms ASC LIMIT ?)"
            r1.append(r4)
            r4 = -10000(0xffffffffffffd8f0, double:NaN)
            long r4 = r4 + r2
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.util.ArrayList r4 = r0.f112126b
            r4.add(r1)
            com.google.android.libraries.storage.b.aw r0 = r0.mo45919a()
            int r0 = r7.mo45929a(r0)
            com.google.android.libraries.storage.b.aw r1 = com.google.android.apps.search.podcasts.p10550b.p10551a.C140005r.f380528a
            int r7 = r7.mo45929a(r1)
            com.google.common.f.e r1 = com.google.android.apps.search.podcasts.p10550b.p10551a.C139997j.f380511a
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.common.f.n r4 = new com.google.common.f.n
            r5 = 41513(0xa229, float:5.8172E-41)
            r4.<init>(r5)
            r1.mo56379ah(r4)
            java.lang.String r4 = "Deleted %d episodes and %s shows."
            r1.mo56393w(r4, r0, r7)
        L_0x0091:
            java.lang.Long r7 = java.lang.Long.valueOf(r2)
            return r7
        L_0x0096:
            r7 = move-exception
            r3.close()     // Catch:{ all -> 0x009b }
            goto L_0x009f
        L_0x009b:
            r0 = move-exception
            com.google.android.libraries.storage.p3315b.C42842ba.m75685a(r7, r0)
        L_0x009f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.podcasts.p10550b.p10551a.C139994g.mo45922a(com.google.android.libraries.storage.b.bf):java.lang.Object");
    }
}
