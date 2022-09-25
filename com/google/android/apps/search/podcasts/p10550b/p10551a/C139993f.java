package com.google.android.apps.search.podcasts.p10550b.p10551a;

import com.google.android.libraries.storage.p3315b.C42844bc;
import p5462h.C69685i;

/* renamed from: com.google.android.apps.search.podcasts.b.a.f */
/* compiled from: PG */
final class C139993f implements C42844bc {

    /* renamed from: a */
    final /* synthetic */ C139997j f380502a;

    /* renamed from: b */
    final /* synthetic */ C69685i f380503b;

    /* renamed from: c */
    final /* synthetic */ C139988a f380504c;

    public C139993f(C139997j jVar, C69685i iVar, C139988a aVar) {
        this.f380502a = jVar;
        this.f380503b = iVar;
        this.f380504c = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e8, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e9, code lost:
        p5462h.p5472e.C69598b.m101013a(r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ec, code lost:
        throw r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object mo45922a(com.google.android.libraries.storage.p3315b.C42847bf r11) {
        /*
            r10 = this;
            com.google.android.apps.search.podcasts.b.a.j r0 = r10.f380502a
            h.i r1 = r10.f380503b
            java.lang.Object r1 = r1.f186052a
            java.util.Collection r1 = (java.util.Collection) r1
            com.google.android.apps.search.podcasts.b.a.a r2 = r10.f380504c
            java.util.Map r0 = r0.mo115380e(r11, r1, r2)
            h.i r1 = r10.f380503b
            java.lang.Object r2 = r1.f186052a
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.Object r1 = r1.f186053b
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.String r3 = "feedUrlList"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r3)
            java.lang.String r3 = "guidList"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r3)
            com.google.android.libraries.storage.b.az r3 = new com.google.android.libraries.storage.b.az
            r3.<init>()
            java.lang.StringBuilder r4 = r3.f112130a
            java.lang.String r5 = "\n      SELECT\n        feed_url,\n        episode_proto\n      FROM episode_metadata\n      WHERE feed_url IN (\n    "
            r4.append(r5)
            java.util.Iterator r2 = r2.iterator()
            r4 = 0
            r5 = 0
        L_0x0034:
            boolean r6 = r2.hasNext()
            java.lang.String r7 = "?"
            java.lang.String r8 = ", ?"
            if (r6 == 0) goto L_0x005b
            java.lang.Object r6 = r2.next()
            int r9 = r5 + 1
            if (r5 >= 0) goto L_0x0049
            p5462h.p5463a.C69540x.m100952j()
        L_0x0049:
            java.lang.String r6 = (java.lang.String) r6
            if (r5 != 0) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            r7 = r8
        L_0x004f:
            java.lang.StringBuilder r5 = r3.f112130a
            r5.append(r7)
            java.util.ArrayList r5 = r3.f112131b
            r5.add(r6)
            r5 = r9
            goto L_0x0034
        L_0x005b:
            java.lang.StringBuilder r2 = r3.f112130a
            java.lang.String r5 = ")"
            r2.append(r5)
            java.lang.StringBuilder r2 = r3.f112130a
            java.lang.String r6 = " AND guid IN ("
            r2.append(r6)
            java.util.Iterator r1 = r1.iterator()
        L_0x006d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0091
            java.lang.Object r2 = r1.next()
            int r6 = r4 + 1
            if (r4 >= 0) goto L_0x007e
            p5462h.p5463a.C69540x.m100952j()
        L_0x007e:
            java.lang.String r2 = (java.lang.String) r2
            if (r4 != 0) goto L_0x0084
            r4 = r7
            goto L_0x0085
        L_0x0084:
            r4 = r8
        L_0x0085:
            java.lang.StringBuilder r9 = r3.f112130a
            r9.append(r4)
            java.util.ArrayList r4 = r3.f112131b
            r4.add(r2)
            r4 = r6
            goto L_0x006d
        L_0x0091:
            java.lang.StringBuilder r1 = r3.f112130a
            r1.append(r5)
            com.google.android.libraries.storage.b.ay r1 = r3.mo45920a()
            android.database.Cursor r11 = r11.mo45932d(r1)
            if (r11 == 0) goto L_0x00ed
            boolean r1 = r11.moveToFirst()     // Catch:{ all -> 0x00e6 }
            if (r1 == 0) goto L_0x00ed
            java.lang.String r1 = "feed_url"
            int r1 = r11.getColumnIndex(r1)     // Catch:{ all -> 0x00e6 }
            java.lang.String r2 = "episode_proto"
            int r2 = r11.getColumnIndex(r2)     // Catch:{ all -> 0x00e6 }
        L_0x00b2:
            java.lang.String r3 = r11.getString(r1)     // Catch:{ all -> 0x00e6 }
            byte[] r4 = r11.getBlob(r2)     // Catch:{ all -> 0x00e6 }
            com.google.protos.ac.a.j r5 = com.google.protos.p4757ac.p4758a.C63111j.f170348p     // Catch:{ all -> 0x00e6 }
            com.google.protobuf.MessageLite r4 = com.google.protobuf.contrib.android.ProtoParsers.m95523f(r4, r5)     // Catch:{ all -> 0x00e6 }
            com.google.protos.ac.a.j r4 = (com.google.protos.p4757ac.p4758a.C63111j) r4     // Catch:{ all -> 0x00e6 }
            java.lang.Object r5 = r0.get(r3)     // Catch:{ all -> 0x00e6 }
            com.google.at.j.a.cx r5 = (com.google.p4017at.p4082j.p4083a.C54398cx) r5     // Catch:{ all -> 0x00e6 }
            if (r5 == 0) goto L_0x00df
            com.google.protobuf.bv r5 = r5.instance     // Catch:{ all -> 0x00e6 }
            com.google.at.j.a.da r5 = (com.google.p4017at.p4082j.p4083a.C54402da) r5     // Catch:{ all -> 0x00e6 }
            com.google.protos.ac.a.l r5 = r5.f142891b     // Catch:{ all -> 0x00e6 }
            if (r5 == 0) goto L_0x00df
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x00e6 }
            com.google.at.j.a.cx r3 = (com.google.p4017at.p4082j.p4083a.C54398cx) r3     // Catch:{ all -> 0x00e6 }
            if (r3 == 0) goto L_0x00df
            java.lang.String r5 = r4.f170356g     // Catch:{ all -> 0x00e6 }
            r3.mo54114a(r5, r4)     // Catch:{ all -> 0x00e6 }
        L_0x00df:
            boolean r3 = r11.moveToNext()     // Catch:{ all -> 0x00e6 }
            if (r3 != 0) goto L_0x00b2
            goto L_0x00ed
        L_0x00e6:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00e8 }
        L_0x00e8:
            r1 = move-exception
            p5462h.p5472e.C69598b.m101013a(r11, r0)
            throw r1
        L_0x00ed:
            r1 = 0
            p5462h.p5472e.C69598b.m101013a(r11, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.podcasts.p10550b.p10551a.C139993f.mo45922a(com.google.android.libraries.storage.b.bf):java.lang.Object");
    }
}
