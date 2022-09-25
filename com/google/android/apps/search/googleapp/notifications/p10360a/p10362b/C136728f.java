package com.google.android.apps.search.googleapp.notifications.p10360a.p10362b;

import com.google.android.libraries.storage.p3315b.C42844bc;

/* renamed from: com.google.android.apps.search.googleapp.notifications.a.b.f */
/* compiled from: PG */
final class C136728f implements C42844bc {
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005d, code lost:
        p5462h.p5472e.C69598b.m101013a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0061, code lost:
        throw r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object mo45922a(com.google.android.libraries.storage.p3315b.C42847bf r6) {
        /*
            r5 = this;
            com.google.android.libraries.storage.b.az r0 = new com.google.android.libraries.storage.b.az
            r0.<init>()
            java.lang.StringBuilder r1 = r0.f112130a
            java.lang.String r2 = "\n        SELECT\n          action_bytes,\n          _id\n        FROM actions\n        ORDER BY timestamp_seconds ASC\n        "
            r1.append(r2)
            com.google.android.libraries.storage.b.ay r0 = r0.mo45920a()
            android.database.Cursor r6 = r6.mo45932d(r0)
            java.lang.String r0 = "cursor"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r0)     // Catch:{ all -> 0x005a }
            com.google.common.b.gp r0 = com.google.common.p4522b.C58485gu.m89837e()     // Catch:{ all -> 0x005a }
            boolean r1 = r6.moveToFirst()     // Catch:{ all -> 0x005a }
            if (r1 == 0) goto L_0x004c
        L_0x0023:
            r1 = 0
            byte[] r1 = r6.getBlob(r1)     // Catch:{ all -> 0x005a }
            com.google.android.apps.search.googleapp.notifications.a.b.i r2 = new com.google.android.apps.search.googleapp.notifications.a.b.i     // Catch:{ all -> 0x005a }
            com.google.protobuf.ba r3 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ all -> 0x005a }
            com.google.bv.d.l r4 = com.google.p4283bv.p4345d.C57033l.f152261f     // Catch:{ all -> 0x005a }
            com.google.protobuf.bv r1 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r4, (byte[]) r1, (com.google.protobuf.C62921ba) r3)     // Catch:{ all -> 0x005a }
            com.google.bv.d.l r1 = (com.google.p4283bv.p4345d.C57033l) r1     // Catch:{ all -> 0x005a }
            java.lang.String r3 = "parseFrom(actionBlob, Ex…e.getGeneratedRegistry())"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r3)     // Catch:{ all -> 0x005a }
            r3 = 1
            long r3 = r6.getLong(r3)     // Catch:{ all -> 0x005a }
            r2.<init>(r1, r3)     // Catch:{ all -> 0x005a }
            r0.mo55395g(r2)     // Catch:{ all -> 0x005a }
            boolean r1 = r6.moveToNext()     // Catch:{ all -> 0x005a }
            if (r1 != 0) goto L_0x0023
        L_0x004c:
            com.google.common.b.gu r0 = r0.mo55394f()     // Catch:{ all -> 0x005a }
            java.lang.String r1 = "events.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)     // Catch:{ all -> 0x005a }
            r1 = 0
            p5462h.p5472e.C69598b.m101013a(r6, r1)
            return r0
        L_0x005a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x005c }
        L_0x005c:
            r1 = move-exception
            p5462h.p5472e.C69598b.m101013a(r6, r0)
            goto L_0x0062
        L_0x0061:
            throw r1
        L_0x0062:
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.notifications.p10360a.p10362b.C136728f.mo45922a(com.google.android.libraries.storage.b.bf):java.lang.Object");
    }
}
