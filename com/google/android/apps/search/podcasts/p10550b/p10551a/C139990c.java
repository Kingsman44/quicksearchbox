package com.google.android.apps.search.podcasts.p10550b.p10551a;

import com.google.android.libraries.storage.p3315b.C42844bc;

/* renamed from: com.google.android.apps.search.podcasts.b.a.c */
/* compiled from: PG */
public final class C139990c implements C42844bc {

    /* renamed from: a */
    final /* synthetic */ String f380497a;

    /* renamed from: b */
    final /* synthetic */ C139997j f380498b;

    /* renamed from: c */
    final /* synthetic */ C139988a f380499c;

    public C139990c(String str, C139997j jVar, C139988a aVar) {
        this.f380497a = str;
        this.f380498b = jVar;
        this.f380499c = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008d, code lost:
        p5462h.p5472e.C69598b.m101013a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009f, code lost:
        p5462h.p5472e.C69598b.m101013a(r1, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a2, code lost:
        throw r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object mo45922a(com.google.android.libraries.storage.p3315b.C42847bf r6) {
        /*
            r5 = this;
            com.google.at.j.a.da r0 = com.google.p4017at.p4082j.p4083a.C54402da.f142888d
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.at.j.a.cx r0 = (com.google.p4017at.p4082j.p4083a.C54398cx) r0
            java.lang.String r1 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            java.lang.String r1 = r5.f380497a
            java.util.List r1 = p5462h.p5463a.C69540x.m100944b(r1)
            com.google.android.apps.search.podcasts.b.a.j r2 = r5.f380498b
            com.google.android.apps.search.podcasts.b.a.a r3 = r5.f380499c
            java.lang.Long r2 = r2.mo115379d(r3)
            com.google.android.libraries.storage.b.ay r1 = com.google.android.apps.search.podcasts.p10550b.p10551a.C140006s.m227659a(r1, r2)
            android.database.Cursor r1 = r6.mo45932d(r1)
            r2 = 0
            if (r1 == 0) goto L_0x00a3
            boolean r3 = r1.moveToFirst()     // Catch:{ all -> 0x009c }
            if (r3 != 0) goto L_0x002e
            goto L_0x00a3
        L_0x002e:
            java.lang.String r3 = "show_result_proto"
            int r3 = r1.getColumnIndex(r3)     // Catch:{ all -> 0x009c }
            byte[] r3 = r1.getBlob(r3)     // Catch:{ all -> 0x009c }
            com.google.protobuf.b r3 = r0.mergeFrom((byte[]) r3)     // Catch:{ all -> 0x009c }
            com.google.at.j.a.cx r3 = (com.google.p4017at.p4082j.p4083a.C54398cx) r3     // Catch:{ all -> 0x009c }
            p5462h.p5472e.C69598b.m101013a(r1, r2)
            com.google.protobuf.bv r1 = r0.instance
            com.google.at.j.a.da r1 = (com.google.p4017at.p4082j.p4083a.C54402da) r1
            com.google.protos.ac.a.l r1 = r1.f142891b
            if (r1 == 0) goto L_0x0094
            com.google.android.libraries.storage.b.az r1 = new com.google.android.libraries.storage.b.az
            r1.<init>()
            java.lang.StringBuilder r3 = r1.f112130a
            java.lang.String r4 = "\n      SELECT\n        episode_proto\n      FROM episode_metadata\n      WHERE feed_url = ?\n    "
            r3.append(r4)
            java.lang.String r3 = r5.f380497a
            java.util.ArrayList r4 = r1.f112131b
            r4.add(r3)
            com.google.android.libraries.storage.b.ay r1 = r1.mo45920a()
            android.database.Cursor r6 = r6.mo45932d(r1)
            if (r6 == 0) goto L_0x0091
            boolean r1 = r6.moveToFirst()     // Catch:{ all -> 0x008a }
            if (r1 == 0) goto L_0x0091
            java.lang.String r1 = "episode_proto"
            int r1 = r6.getColumnIndex(r1)     // Catch:{ all -> 0x008a }
        L_0x0072:
            byte[] r3 = r6.getBlob(r1)     // Catch:{ all -> 0x008a }
            com.google.protos.ac.a.j r4 = com.google.protos.p4757ac.p4758a.C63111j.f170348p     // Catch:{ all -> 0x008a }
            com.google.protobuf.MessageLite r3 = com.google.protobuf.contrib.android.ProtoParsers.m95523f(r3, r4)     // Catch:{ all -> 0x008a }
            com.google.protos.ac.a.j r3 = (com.google.protos.p4757ac.p4758a.C63111j) r3     // Catch:{ all -> 0x008a }
            java.lang.String r4 = r3.f170356g     // Catch:{ all -> 0x008a }
            r0.mo54114a(r4, r3)     // Catch:{ all -> 0x008a }
            boolean r3 = r6.moveToNext()     // Catch:{ all -> 0x008a }
            if (r3 != 0) goto L_0x0072
            goto L_0x0091
        L_0x008a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x008c }
        L_0x008c:
            r1 = move-exception
            p5462h.p5472e.C69598b.m101013a(r6, r0)
            throw r1
        L_0x0091:
            p5462h.p5472e.C69598b.m101013a(r6, r2)
        L_0x0094:
            com.google.protobuf.bv r6 = r0.build()
            r2 = r6
            com.google.at.j.a.da r2 = (com.google.p4017at.p4082j.p4083a.C54402da) r2
            goto L_0x00a6
        L_0x009c:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x009e }
        L_0x009e:
            r0 = move-exception
            p5462h.p5472e.C69598b.m101013a(r1, r6)
            throw r0
        L_0x00a3:
            p5462h.p5472e.C69598b.m101013a(r1, r2)
        L_0x00a6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.podcasts.p10550b.p10551a.C139990c.mo45922a(com.google.android.libraries.storage.b.bf):java.lang.Object");
    }
}
