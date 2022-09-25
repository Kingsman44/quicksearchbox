package com.google.android.apps.search.assistant.verticals.p10050e.p10051a;

import com.google.android.libraries.storage.p3315b.C42844bc;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.verticals.e.a.g */
/* compiled from: PG */
public final /* synthetic */ class C132093g implements C42844bc {

    /* renamed from: a */
    public final /* synthetic */ List f360477a;

    public /* synthetic */ C132093g(List list) {
        this.f360477a = list;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        throw r4;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0086 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo45922a(com.google.android.libraries.storage.p3315b.C42847bf r9) {
        /*
            r8 = this;
            java.util.List r0 = r8.f360477a
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.google.android.libraries.storage.b.az r2 = new com.google.android.libraries.storage.b.az     // Catch:{ InterruptedException -> 0x0087 }
            r2.<init>()     // Catch:{ InterruptedException -> 0x0087 }
            java.lang.StringBuilder r3 = r2.f112130a     // Catch:{ InterruptedException -> 0x0087 }
            java.lang.String r4 = "SELECT query, data FROM deeplinks WHERE query IN ("
            r3.append(r4)     // Catch:{ InterruptedException -> 0x0087 }
            r3 = 0
            r4 = 0
        L_0x0015:
            int r5 = r0.size()     // Catch:{ InterruptedException -> 0x0087 }
            if (r4 >= r5) goto L_0x003d
            java.lang.StringBuilder r5 = r2.f112130a     // Catch:{ InterruptedException -> 0x0087 }
            java.lang.String r6 = "?"
            r5.append(r6)     // Catch:{ InterruptedException -> 0x0087 }
            java.lang.Object r5 = r0.get(r4)     // Catch:{ InterruptedException -> 0x0087 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ InterruptedException -> 0x0087 }
            java.util.ArrayList r6 = r2.f112131b     // Catch:{ InterruptedException -> 0x0087 }
            r6.add(r5)     // Catch:{ InterruptedException -> 0x0087 }
            int r4 = r4 + 1
            int r5 = r0.size()     // Catch:{ InterruptedException -> 0x0087 }
            if (r4 >= r5) goto L_0x0015
            java.lang.StringBuilder r5 = r2.f112130a     // Catch:{ InterruptedException -> 0x0087 }
            java.lang.String r6 = ", "
            r5.append(r6)     // Catch:{ InterruptedException -> 0x0087 }
            goto L_0x0015
        L_0x003d:
            java.lang.StringBuilder r4 = r2.f112130a     // Catch:{ InterruptedException -> 0x0087 }
            java.lang.String r5 = ")"
            r4.append(r5)     // Catch:{ InterruptedException -> 0x0087 }
            com.google.android.libraries.storage.b.ay r2 = r2.mo45920a()     // Catch:{ InterruptedException -> 0x0087 }
            android.database.Cursor r9 = r9.mo45932d(r2)     // Catch:{ InterruptedException -> 0x0087 }
        L_0x004c:
            r2 = 1
            boolean r4 = r9.moveToNext()     // Catch:{ all -> 0x0069 }
            if (r4 == 0) goto L_0x0063
            java.lang.String r4 = r9.getString(r3)     // Catch:{ all -> 0x0069 }
            byte[] r5 = r9.getBlob(r2)     // Catch:{ all -> 0x0069 }
            if (r4 == 0) goto L_0x004c
            if (r5 == 0) goto L_0x004c
            p3186j$.util.Map.EL.putIfAbsent(r1, r4, r5)     // Catch:{ all -> 0x0069 }
            goto L_0x004c
        L_0x0063:
            if (r9 == 0) goto L_0x0096
            r9.close()     // Catch:{ InterruptedException -> 0x0087 }
            goto L_0x0096
        L_0x0069:
            r4 = move-exception
            if (r9 == 0) goto L_0x0086
            r9.close()     // Catch:{ all -> 0x0070 }
            goto L_0x0086
        L_0x0070:
            r9 = move-exception
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0086 }
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            r5[r3] = r6     // Catch:{ Exception -> 0x0086 }
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            java.lang.String r7 = "addSuppressed"
            java.lang.reflect.Method r5 = r6.getDeclaredMethod(r7, r5)     // Catch:{ Exception -> 0x0086 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0086 }
            r2[r3] = r9     // Catch:{ Exception -> 0x0086 }
            r5.invoke(r4, r2)     // Catch:{ Exception -> 0x0086 }
        L_0x0086:
            throw r4     // Catch:{ InterruptedException -> 0x0087 }
        L_0x0087:
            r9 = move-exception
            com.google.common.f.a.d r2 = com.google.android.apps.search.assistant.verticals.p10050e.p10051a.C132094h.f360478a
            com.google.common.f.x r2 = r2.mo56225c()
            java.lang.String r3 = "Error while reading deeplink cache"
            r4 = 39776(0x9b60, float:5.5738E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56382g(r9)).mo56372aa(r4)).mo56386p(r3)
        L_0x0096:
            com.google.common.b.gp r9 = com.google.common.p4522b.C58485gu.m89837e()
            java.util.Iterator r0 = r0.iterator()
        L_0x009e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00e1
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = r1.containsKey(r2)
            if (r3 != 0) goto L_0x00b6
            com.google.assistant.av.g.a.a.d r2 = com.google.assistant.p3863av.p3876g.p3877a.p3878a.C50582d.f131626e
            r9.mo55395g(r2)
            goto L_0x009e
        L_0x00b6:
            java.lang.Object r2 = r1.get(r2)     // Catch:{ ct -> 0x00cc }
            byte[] r2 = (byte[]) r2     // Catch:{ ct -> 0x00cc }
            com.google.protobuf.ba r3 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x00cc }
            com.google.assistant.av.g.a.a.d r4 = com.google.assistant.p3863av.p3876g.p3877a.p3878a.C50582d.f131626e     // Catch:{ ct -> 0x00cc }
            com.google.protobuf.bv r2 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r4, (byte[]) r2, (com.google.protobuf.C62921ba) r3)     // Catch:{ ct -> 0x00cc }
            com.google.assistant.av.g.a.a.d r2 = (com.google.assistant.p3863av.p3876g.p3877a.p3878a.C50582d) r2     // Catch:{ ct -> 0x00cc }
            r9.mo55395g(r2)     // Catch:{ ct -> 0x00cc }
            goto L_0x009e
        L_0x00cc:
            r2 = move-exception
            com.google.common.f.a.d r3 = com.google.android.apps.search.assistant.verticals.p10050e.p10051a.C132094h.f360478a
            com.google.common.f.x r3 = r3.mo56225c()
            java.lang.String r4 = "Error parsing database data"
            r5 = 39775(0x9b5f, float:5.5737E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56382g(r2)).mo56372aa(r5)).mo56386p(r4)
            com.google.assistant.av.g.a.a.d r2 = com.google.assistant.p3863av.p3876g.p3877a.p3878a.C50582d.f131626e
            r9.mo55395g(r2)
            goto L_0x009e
        L_0x00e1:
            com.google.common.b.gu r9 = r9.mo55394f()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.p10050e.p10051a.C132093g.mo45922a(com.google.android.libraries.storage.b.bf):java.lang.Object");
    }
}
