package com.google.android.apps.search.googleapp.discover.p10244v;

import java.util.Set;

/* renamed from: com.google.android.apps.search.googleapp.discover.v.aq */
/* compiled from: PG */
final class C135145aq implements C135202v {

    /* renamed from: a */
    final /* synthetic */ C135157bb f368100a;

    /* renamed from: b */
    final /* synthetic */ Set f368101b;

    /* renamed from: c */
    final /* synthetic */ String f368102c;

    public C135145aq(C135157bb bbVar, Set set, String str) {
        this.f368100a = bbVar;
        this.f368101b = set;
        this.f368102c = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0156, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0157, code lost:
        p5462h.p5472e.C69598b.m101013a(r1, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x015b, code lost:
        throw r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo112131a(com.google.android.apps.search.googleapp.discover.p10244v.C135205y r8) {
        /*
            r7 = this;
            com.google.android.apps.search.googleapp.discover.v.bb r0 = r7.f368100a
            com.google.android.apps.search.googleapp.discover.streamui.h.f r0 = r0.f368141g
            java.util.Set r1 = r7.f368101b
            com.google.common.b.hd r8 = r8.mo112163a(r0, r1)
            com.google.android.apps.search.googleapp.discover.v.bb r0 = r7.f368100a
            java.lang.String r1 = "Parse Content"
            com.google.apps.tiktok.tracing.bi r1 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r1)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0154 }
            r3 = r8
            com.google.common.b.pv r3 = (com.google.common.p4522b.C58729pv) r3     // Catch:{ all -> 0x0154 }
            int r3 = r3.f156487c     // Catch:{ all -> 0x0154 }
            int r3 = p5462h.p5463a.C69505av.m100860b(r3)     // Catch:{ all -> 0x0154 }
            r2.<init>(r3)     // Catch:{ all -> 0x0154 }
            com.google.common.b.ij r8 = r8.entrySet()     // Catch:{ all -> 0x0154 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0154 }
        L_0x0028:
            boolean r3 = r8.hasNext()     // Catch:{ all -> 0x0154 }
            if (r3 == 0) goto L_0x004c
            java.lang.Object r3 = r8.next()     // Catch:{ all -> 0x0154 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0154 }
            java.lang.Object r4 = r3.getKey()     // Catch:{ all -> 0x0154 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0154 }
            com.google.protobuf.z r3 = (com.google.protobuf.C63088z) r3     // Catch:{ all -> 0x0154 }
            com.google.protobuf.ba r5 = r0.f368137c     // Catch:{ all -> 0x0154 }
            com.google.android.apps.search.googleapp.discover.s.ay r6 = com.google.android.apps.search.googleapp.discover.p10214s.C134560ay.f366453g     // Catch:{ all -> 0x0154 }
            com.google.protobuf.bv r3 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r6, (com.google.protobuf.C63088z) r3, (com.google.protobuf.C62921ba) r5)     // Catch:{ all -> 0x0154 }
            com.google.android.apps.search.googleapp.discover.s.ay r3 = (com.google.android.apps.search.googleapp.discover.p10214s.C134560ay) r3     // Catch:{ all -> 0x0154 }
            r2.put(r4, r3)     // Catch:{ all -> 0x0154 }
            goto L_0x0028
        L_0x004c:
            java.util.Map r8 = p5462h.p5463a.C69505av.m100876r(r2)     // Catch:{ all -> 0x0154 }
            r0 = 0
            p5462h.p5472e.C69598b.m101013a(r1, r0)
            h.a.ao r0 = p5462h.p5463a.C69498ao.f185920a
            int r1 = r8.size()
            java.util.Set r2 = r7.f368101b
            int r2 = r2.size()
            if (r1 == r2) goto L_0x012f
            java.util.Set r0 = r7.f368101b
            java.util.Set r1 = r8.keySet()
            com.google.common.b.qv r0 = com.google.common.p4522b.C58758qx.m90645c(r0, r1)
            com.google.android.apps.search.googleapp.discover.v.bb r1 = r7.f368100a
            com.google.android.apps.search.googleapp.discover.v.b r1 = r1.f368140f
            java.lang.String r2 = r7.f368102c
            java.lang.String r3 = "sessionId"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r3)
            java.lang.Object r3 = r1.f368128b
            monitor-enter(r3)
            java.util.List r1 = r1.f368130d     // Catch:{ all -> 0x012c }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x012c }
            r4.<init>()     // Catch:{ all -> 0x012c }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x012c }
        L_0x0085:
            boolean r5 = r1.hasNext()     // Catch:{ all -> 0x012c }
            if (r5 == 0) goto L_0x009e
            java.lang.Object r5 = r1.next()     // Catch:{ all -> 0x012c }
            r6 = r5
            com.google.android.apps.search.googleapp.discover.v.c r6 = (com.google.android.apps.search.googleapp.discover.p10244v.C135182c) r6     // Catch:{ all -> 0x012c }
            java.lang.String r6 = r6.f368222a     // Catch:{ all -> 0x012c }
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r6, r2)     // Catch:{ all -> 0x012c }
            if (r6 == 0) goto L_0x0085
            r4.add(r5)     // Catch:{ all -> 0x012c }
            goto L_0x0085
        L_0x009e:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x012c }
            r1.<init>()     // Catch:{ all -> 0x012c }
            java.util.Iterator r2 = r4.iterator()     // Catch:{ all -> 0x012c }
        L_0x00a7:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x012c }
            if (r4 == 0) goto L_0x00b9
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x012c }
            com.google.android.apps.search.googleapp.discover.v.c r4 = (com.google.android.apps.search.googleapp.discover.p10244v.C135182c) r4     // Catch:{ all -> 0x012c }
            com.google.common.b.gu r4 = r4.f368224c     // Catch:{ all -> 0x012c }
            p5462h.p5463a.C69540x.m100811r(r1, r4)     // Catch:{ all -> 0x012c }
            goto L_0x00a7
        L_0x00b9:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x012c }
            r2.<init>()     // Catch:{ all -> 0x012c }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x012c }
        L_0x00c2:
            boolean r4 = r1.hasNext()     // Catch:{ all -> 0x012c }
            if (r4 == 0) goto L_0x00e7
            java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x012c }
            r5 = r4
            com.google.android.apps.search.googleapp.discover.s.ac r5 = (com.google.android.apps.search.googleapp.discover.p10214s.C134538ac) r5     // Catch:{ all -> 0x012c }
            int r6 = r5.f366378a     // Catch:{ all -> 0x012c }
            r6 = r6 & 2
            if (r6 == 0) goto L_0x00c2
            com.google.android.apps.search.googleapp.discover.s.bk r5 = r5.f366379b     // Catch:{ all -> 0x012c }
            if (r5 != 0) goto L_0x00db
            com.google.android.apps.search.googleapp.discover.s.bk r5 = com.google.android.apps.search.googleapp.discover.p10214s.C134573bk.f366497h     // Catch:{ all -> 0x012c }
        L_0x00db:
            java.lang.String r5 = r5.f366501c     // Catch:{ all -> 0x012c }
            boolean r5 = r0.contains(r5)     // Catch:{ all -> 0x012c }
            if (r5 == 0) goto L_0x00c2
            r2.add(r4)     // Catch:{ all -> 0x012c }
            goto L_0x00c2
        L_0x00e7:
            r1 = 10
            int r1 = p5462h.p5463a.C69540x.m100804k(r2, r1)     // Catch:{ all -> 0x012c }
            int r1 = p5462h.p5463a.C69505av.m100860b(r1)     // Catch:{ all -> 0x012c }
            r4 = 16
            if (r1 >= r4) goto L_0x00f7
            r1 = 16
        L_0x00f7:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap     // Catch:{ all -> 0x012c }
            r4.<init>(r1)     // Catch:{ all -> 0x012c }
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x012c }
        L_0x0100:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x012c }
            if (r2 == 0) goto L_0x0127
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x012c }
            com.google.android.apps.search.googleapp.discover.s.ac r2 = (com.google.android.apps.search.googleapp.discover.p10214s.C134538ac) r2     // Catch:{ all -> 0x012c }
            com.google.android.apps.search.googleapp.discover.s.bk r5 = r2.f366379b     // Catch:{ all -> 0x012c }
            if (r5 != 0) goto L_0x0112
            com.google.android.apps.search.googleapp.discover.s.bk r5 = com.google.android.apps.search.googleapp.discover.p10214s.C134573bk.f366497h     // Catch:{ all -> 0x012c }
        L_0x0112:
            java.lang.String r5 = r5.f366501c     // Catch:{ all -> 0x012c }
            com.google.android.apps.search.googleapp.discover.s.ay r2 = r2.f366380c     // Catch:{ all -> 0x012c }
            if (r2 != 0) goto L_0x011a
            com.google.android.apps.search.googleapp.discover.s.ay r2 = com.google.android.apps.search.googleapp.discover.p10214s.C134560ay.f366453g     // Catch:{ all -> 0x012c }
        L_0x011a:
            h.i r6 = new h.i     // Catch:{ all -> 0x012c }
            r6.<init>(r5, r2)     // Catch:{ all -> 0x012c }
            java.lang.Object r2 = r6.f186052a     // Catch:{ all -> 0x012c }
            java.lang.Object r5 = r6.f186053b     // Catch:{ all -> 0x012c }
            r4.put(r2, r5)     // Catch:{ all -> 0x012c }
            goto L_0x0100
        L_0x0127:
            monitor-exit(r3)
            r8.putAll(r4)
            goto L_0x012f
        L_0x012c:
            r8 = move-exception
            monitor-exit(r3)
            throw r8
        L_0x012f:
            int r1 = r8.size()
            java.util.Set r2 = r7.f368101b
            int r2 = r2.size()
            if (r1 == r2) goto L_0x0153
            com.google.common.f.e r1 = com.google.android.apps.search.googleapp.discover.p10244v.C135157bb.f368135a
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.common.f.n r2 = new com.google.common.f.n
            r3 = 40413(0x9ddd, float:5.663E-41)
            r2.<init>(r3)
            r1.mo56379ah(r2)
            java.lang.String r2 = "Failed to find content for contentIds %s "
            r1.mo56389s(r2, r0)
        L_0x0153:
            return r8
        L_0x0154:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x0156 }
        L_0x0156:
            r0 = move-exception
            p5462h.p5472e.C69598b.m101013a(r1, r8)
            goto L_0x015c
        L_0x015b:
            throw r0
        L_0x015c:
            goto L_0x015b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10244v.C135145aq.mo112131a(com.google.android.apps.search.googleapp.discover.v.y):java.lang.Object");
    }
}
