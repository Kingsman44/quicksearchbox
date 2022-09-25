package com.google.android.apps.search.googleapp.discover.p10166a.p10168b.p10170b;

import com.google.android.libraries.storage.p3315b.C42844bc;

/* renamed from: com.google.android.apps.search.googleapp.discover.a.b.b.g */
/* compiled from: PG */
final class C133959g implements C42844bc {

    /* renamed from: a */
    final /* synthetic */ int f364878a;

    public C133959g(int i) {
        this.f364878a = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0070, code lost:
        p5462h.p5472e.C69598b.m101013a(r10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0074, code lost:
        throw r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object mo45922a(com.google.android.libraries.storage.p3315b.C42847bf r10) {
        /*
            r9 = this;
            com.google.android.libraries.storage.b.az r0 = new com.google.android.libraries.storage.b.az
            r0.<init>()
            java.lang.StringBuilder r1 = r0.f112130a
            java.lang.String r2 = "\n            SELECT \n              id, \n              feed_action, \n              upload_attempt_count \n            FROM action_table\n          "
            r1.append(r2)
            com.google.android.libraries.storage.b.ay r0 = r0.mo45920a()
            com.google.common.b.gp r1 = new com.google.common.b.gp
            r2 = 4
            r1.<init>(r2)
            android.database.Cursor r10 = r10.mo45932d(r0)
            int r0 = r9.f364878a
            r2 = 0
            r3 = 0
        L_0x001e:
            boolean r4 = r10.moveToNext()     // Catch:{ all -> 0x006d }
            if (r4 == 0) goto L_0x0055
            if (r3 >= r0) goto L_0x0055
            java.lang.String r4 = "cursor"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r4)     // Catch:{ all -> 0x006d }
            com.google.android.apps.search.googleapp.discover.a.b.b.n r4 = new com.google.android.apps.search.googleapp.discover.a.b.b.n     // Catch:{ all -> 0x006d }
            int r5 = r10.getInt(r2)     // Catch:{ all -> 0x006d }
            r6 = 1
            byte[] r6 = r10.getBlob(r6)     // Catch:{ all -> 0x006d }
            com.google.protobuf.ba r7 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ all -> 0x006d }
            com.google.bv.e.b.c.a.ba r8 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57246ba.f152819d     // Catch:{ all -> 0x006d }
            com.google.protobuf.bv r6 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r8, (byte[]) r6, (com.google.protobuf.C62921ba) r7)     // Catch:{ all -> 0x006d }
            com.google.bv.e.b.c.a.ba r6 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57246ba) r6     // Catch:{ all -> 0x006d }
            java.lang.String r7 = "parseFrom(cursor.getBlob…e.getGeneratedRegistry())"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)     // Catch:{ all -> 0x006d }
            r7 = 2
            int r7 = r10.getInt(r7)     // Catch:{ all -> 0x006d }
            r4.<init>(r5, r6, r7)     // Catch:{ all -> 0x006d }
            r1.mo55395g(r4)     // Catch:{ all -> 0x006d }
            int r3 = r3 + 1
            goto L_0x001e
        L_0x0055:
            int r0 = r10.getCount()     // Catch:{ all -> 0x006d }
            r2 = 0
            p5462h.p5472e.C69598b.m101013a(r10, r2)
            com.google.common.b.gu r10 = r1.mo55394f()
            java.lang.String r1 = "storedBuilder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r1)
            com.google.android.apps.search.googleapp.discover.a.b.b.o r1 = new com.google.android.apps.search.googleapp.discover.a.b.b.o
            int r0 = r0 - r3
            r1.<init>(r10, r0)
            return r1
        L_0x006d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x006f }
        L_0x006f:
            r1 = move-exception
            p5462h.p5472e.C69598b.m101013a(r10, r0)
            goto L_0x0075
        L_0x0074:
            throw r1
        L_0x0075:
            goto L_0x0074
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10166a.p10168b.p10170b.C133959g.mo45922a(com.google.android.libraries.storage.b.bf):java.lang.Object");
    }
}
