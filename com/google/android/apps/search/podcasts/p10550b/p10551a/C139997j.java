package com.google.android.apps.search.podcasts.p10550b.p10551a;

import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.p3315b.C42850e;
import com.google.apps.tiktok.account.p3606d.C46087e;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p5462h.C69685i;
import p5462h.p5463a.C69496am;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.b.a.j */
/* compiled from: PG */
public final class C139997j {

    /* renamed from: a */
    public static final C59071e f380511a = C59071e.m91331h();

    /* renamed from: b */
    public final C21370a f380512b;

    /* renamed from: c */
    public final C42850e f380513c;

    /* renamed from: d */
    private final boolean f380514d;

    public C139997j(C21370a aVar, C46087e eVar, boolean z) {
        C69664n.m101061g(aVar, "clock");
        this.f380512b = aVar;
        this.f380514d = z;
        this.f380513c = eVar.mo50195a("entity_cache", C140005r.f380529b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0067, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0068, code lost:
        p5462h.p5472e.C69598b.m101013a(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006c, code lost:
        throw r7;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m227645f(com.google.android.libraries.storage.p3315b.C42847bf r5, java.util.Map r6, long r7) {
        /*
            java.lang.String r0 = "\n      INSERT OR REPLACE INTO episode_metadata (\n        feed_url,\n        guid,\n        episode_proto,\n        published_time_millis,\n        update_time_ms\n      ) VALUES (?, ?, ?, ?, ?)\n    "
            com.google.android.libraries.storage.b.bd r5 = r5.mo45933e(r0)
            java.util.Set r6 = r6.entrySet()     // Catch:{ all -> 0x0065 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0065 }
        L_0x000e:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x0060
            java.lang.Object r0 = r6.next()     // Catch:{ all -> 0x0065 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0065 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0065 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0065 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0065 }
            com.google.at.j.a.da r0 = (com.google.p4017at.p4082j.p4083a.C54402da) r0     // Catch:{ all -> 0x0065 }
            com.google.protobuf.dn r0 = r0.f142892c     // Catch:{ all -> 0x0065 }
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)     // Catch:{ all -> 0x0065 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0065 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0065 }
        L_0x0034:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0065 }
            if (r2 == 0) goto L_0x000e
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0065 }
            com.google.protos.ac.a.j r2 = (com.google.protos.p4757ac.p4758a.C63111j) r2     // Catch:{ all -> 0x0065 }
            r3 = 1
            r5.mo45925c(r3, r1)     // Catch:{ all -> 0x0065 }
            java.lang.String r3 = r2.f170356g     // Catch:{ all -> 0x0065 }
            r4 = 2
            r5.mo45925c(r4, r3)     // Catch:{ all -> 0x0065 }
            byte[] r3 = r2.toByteArray()     // Catch:{ all -> 0x0065 }
            r4 = 3
            r5.mo45923a(r4, r3)     // Catch:{ all -> 0x0065 }
            long r2 = r2.f170358i     // Catch:{ all -> 0x0065 }
            r4 = 4
            r5.mo45924b(r4, r2)     // Catch:{ all -> 0x0065 }
            r2 = 5
            r5.mo45924b(r2, r7)     // Catch:{ all -> 0x0065 }
            r5.mo45927d()     // Catch:{ all -> 0x0065 }
            goto L_0x0034
        L_0x0060:
            r6 = 0
            p5462h.p5472e.C69598b.m101013a(r5, r6)
            return
        L_0x0065:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r7 = move-exception
            p5462h.p5472e.C69598b.m101013a(r5, r6)
            goto L_0x006d
        L_0x006c:
            throw r7
        L_0x006d:
            goto L_0x006c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.podcasts.p10550b.p10551a.C139997j.m227645f(com.google.android.libraries.storage.b.bf, java.util.Map, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005b, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005c, code lost:
        p5462h.p5472e.C69598b.m101013a(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0060, code lost:
        throw r5;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m227646g(com.google.android.libraries.storage.p3315b.C42847bf r3, java.util.Map r4, long r5) {
        /*
            java.lang.String r0 = "\n      INSERT OR REPLACE INTO show_metadata (\n        feed_url,\n        show_result_proto,\n        update_time_ms\n      ) VALUES (?, ?, ?)\n    "
            com.google.android.libraries.storage.b.bd r3 = r3.mo45933e(r0)
            java.util.Set r4 = r4.entrySet()     // Catch:{ all -> 0x0059 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0059 }
        L_0x000e:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0054
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x0059 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0059 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0059 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0059 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0059 }
            com.google.at.j.a.da r0 = (com.google.p4017at.p4082j.p4083a.C54402da) r0     // Catch:{ all -> 0x0059 }
            r2 = 1
            r3.mo45925c(r2, r1)     // Catch:{ all -> 0x0059 }
            com.google.protobuf.bn r0 = r0.toBuilder()     // Catch:{ all -> 0x0059 }
            com.google.at.j.a.cx r0 = (com.google.p4017at.p4082j.p4083a.C54398cx) r0     // Catch:{ all -> 0x0059 }
            r0.copyOnWrite()     // Catch:{ all -> 0x0059 }
            com.google.protobuf.bv r1 = r0.instance     // Catch:{ all -> 0x0059 }
            com.google.at.j.a.da r1 = (com.google.p4017at.p4082j.p4083a.C54402da) r1     // Catch:{ all -> 0x0059 }
            com.google.protobuf.dn r1 = r1.mo54115a()     // Catch:{ all -> 0x0059 }
            r1.clear()     // Catch:{ all -> 0x0059 }
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ all -> 0x0059 }
            com.google.at.j.a.da r0 = (com.google.p4017at.p4082j.p4083a.C54402da) r0     // Catch:{ all -> 0x0059 }
            byte[] r0 = r0.toByteArray()     // Catch:{ all -> 0x0059 }
            r1 = 2
            r3.mo45923a(r1, r0)     // Catch:{ all -> 0x0059 }
            r0 = 3
            r3.mo45924b(r0, r5)     // Catch:{ all -> 0x0059 }
            r3.mo45927d()     // Catch:{ all -> 0x0059 }
            goto L_0x000e
        L_0x0054:
            r4 = 0
            p5462h.p5472e.C69598b.m101013a(r3, r4)
            return
        L_0x0059:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x005b }
        L_0x005b:
            r5 = move-exception
            p5462h.p5472e.C69598b.m101013a(r3, r4)
            goto L_0x0061
        L_0x0060:
            throw r5
        L_0x0061:
            goto L_0x0060
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.podcasts.p10550b.p10551a.C139997j.m227646g(com.google.android.libraries.storage.b.bf, java.util.Map, long):void");
    }

    /* renamed from: a */
    public final C60870cx mo115376a(Collection collection, C139988a aVar) {
        C69664n.m101061g(collection, "feedUrlList");
        C69664n.m101061g(aVar, "staleness");
        C60870cx a = this.f380513c.mo45937a(new C139989b(this, collection, aVar));
        C69664n.m101060f(a, "fun getShowMetadata(\n   …value.build() }\n    }\n  }");
        return a;
    }

    /* renamed from: b */
    public final C60870cx mo115377b(Map map, C139988a aVar) {
        C69664n.m101061g(map, "feedUrlToGuidMap");
        C69664n.m101061g(aVar, "staleness");
        C69664n.m101061g(map, "feedUrlToGuidsMap");
        ArrayList<C69685i> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            arrayList2.add(str);
            List V = C69540x.m100840V((Collection) entry.getValue());
            while (!V.isEmpty()) {
                if (arrayList3.size() + V.size() > 499) {
                    int size = 499 - arrayList3.size();
                    arrayList3.addAll(V.subList(0, size));
                    arrayList.add(new C69685i(arrayList2, arrayList3));
                    arrayList2 = new ArrayList();
                    arrayList2.add(str);
                    arrayList3 = new ArrayList();
                    V = V.subList(size, V.size());
                } else {
                    arrayList3.addAll(V);
                    V = C69496am.f185918a;
                }
            }
        }
        if (!arrayList2.isEmpty() && !arrayList3.isEmpty()) {
            arrayList.add(new C69685i(arrayList2, arrayList3));
        }
        ArrayList arrayList4 = new ArrayList(C69540x.m100804k(arrayList, 10));
        for (C69685i fVar : arrayList) {
            C60870cx a = this.f380513c.mo45937a(new C139993f(this, fVar, aVar));
            C69664n.m101060f(a, "private fun getShowResul…\n      showsMap\n    }\n  }");
            arrayList4.add(a);
        }
        return C140989k.m228944b(C60856cj.m92906o(arrayList4), C139992e.f380501a);
    }

    /* renamed from: c */
    public final C60870cx mo115378c(Map map) {
        C69664n.m101061g(map, "showsByFeedUrlMap");
        C60870cx b = this.f380513c.mo45938b(new C139996i(this, map));
        C69664n.m101060f(b, "fun updateEntitiesFromPa…eedUrlMap, now)\n    }\n  }");
        return b;
    }

    /* renamed from: d */
    public final Long mo115379d(C139988a aVar) {
        if (!this.f380514d || aVar == C139988a.DONT_CARE) {
            return null;
        }
        return Long.valueOf(this.f380512b.mo26870b() - aVar.f380493c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0058, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0059, code lost:
        p5462h.p5472e.C69598b.m101013a(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
        throw r7;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map mo115380e(com.google.android.libraries.storage.p3315b.C42847bf r5, java.util.Collection r6, com.google.android.apps.search.podcasts.p10550b.p10551a.C139988a r7) {
        /*
            r4 = this;
            java.lang.Long r7 = r4.mo115379d(r7)
            com.google.android.libraries.storage.b.ay r6 = com.google.android.apps.search.podcasts.p10550b.p10551a.C140006s.m227659a(r6, r7)
            android.database.Cursor r5 = r5.mo45932d(r6)
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0056 }
            r6.<init>()     // Catch:{ all -> 0x0056 }
            if (r5 == 0) goto L_0x0051
            boolean r7 = r5.moveToFirst()     // Catch:{ all -> 0x0056 }
            if (r7 == 0) goto L_0x0051
            java.lang.String r7 = "feed_url"
            int r7 = r5.getColumnIndex(r7)     // Catch:{ all -> 0x0056 }
            java.lang.String r0 = "show_result_proto"
            int r0 = r5.getColumnIndex(r0)     // Catch:{ all -> 0x0056 }
        L_0x0025:
            com.google.at.j.a.da r1 = com.google.p4017at.p4082j.p4083a.C54402da.f142888d     // Catch:{ all -> 0x0056 }
            com.google.protobuf.bn r1 = r1.createBuilder()     // Catch:{ all -> 0x0056 }
            com.google.at.j.a.cx r1 = (com.google.p4017at.p4082j.p4083a.C54398cx) r1     // Catch:{ all -> 0x0056 }
            java.lang.String r2 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)     // Catch:{ all -> 0x0056 }
            java.lang.String r2 = r5.getString(r7)     // Catch:{ all -> 0x0056 }
            java.lang.String r3 = "requestedFeedUrl"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)     // Catch:{ all -> 0x0056 }
            byte[] r3 = r5.getBlob(r0)     // Catch:{ all -> 0x0056 }
            com.google.protobuf.b r1 = r1.mergeFrom((byte[]) r3)     // Catch:{ all -> 0x0056 }
            java.lang.String r3 = "builder.mergeFrom(cursor.getBlob(columnIndex))"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r3)     // Catch:{ all -> 0x0056 }
            r6.put(r2, r1)     // Catch:{ all -> 0x0056 }
            boolean r1 = r5.moveToNext()     // Catch:{ all -> 0x0056 }
            if (r1 != 0) goto L_0x0025
        L_0x0051:
            r7 = 0
            p5462h.p5472e.C69598b.m101013a(r5, r7)
            return r6
        L_0x0056:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r7 = move-exception
            p5462h.p5472e.C69598b.m101013a(r5, r6)
            goto L_0x005e
        L_0x005d:
            throw r7
        L_0x005e:
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.podcasts.p10550b.p10551a.C139997j.mo115380e(com.google.android.libraries.storage.b.bf, java.util.Collection, com.google.android.apps.search.podcasts.b.a.a):java.util.Map");
    }
}
