package com.google.android.apps.search.assistant.platform.pcp.p9337g;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.g.t */
/* compiled from: PG */
final class C124024t {
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0130, code lost:
        if (r12 != null) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x018f, code lost:
        if (r12 != null) goto L_0x0132;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final void m203397a(com.google.assistant.p3994s.p3995a.C53126ci r10, boolean r11, com.google.android.libraries.storage.p3315b.C42847bf r12, java.util.Map r13, java.util.Map r14, com.google.android.apps.search.assistant.platform.pcp.p9337g.C124025u r15) {
        /*
            java.lang.String r0 = "PCP.SyncResponse"
            int r1 = r10.f139233c
            r2 = 11
            r3 = 1
            if (r1 == r3) goto L_0x0110
            r12 = 7
            if (r1 == r12) goto L_0x01c7
            r12 = 9
            if (r1 == r12) goto L_0x01c7
            r12 = 110(0x6e, float:1.54E-43)
            if (r1 != r12) goto L_0x0016
            goto L_0x01c7
        L_0x0016:
            r12 = 18
            if (r1 != r12) goto L_0x0209
            com.google.assistant.s.a.di r12 = r10.f139234d
            if (r12 != 0) goto L_0x0020
            com.google.assistant.s.a.di r12 = com.google.assistant.p3994s.p3995a.C53153di.f139315c
        L_0x0020:
            com.google.protobuf.bt r0 = com.google.assistant.p3994s.p3995a.C53190es.f139394t
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r12.mo58887l(r0)
            com.google.protobuf.bf r12 = r12.f169962ag
            com.google.protobuf.bs r1 = r0.f169971d
            java.lang.Object r12 = r12.mo58854l(r1)
            if (r12 != 0) goto L_0x0036
            java.lang.Object r12 = r0.f169969b
            goto L_0x003a
        L_0x0036:
            java.lang.Object r12 = r0.mo58889c(r12)
        L_0x003a:
            com.google.assistant.s.a.es r12 = (com.google.assistant.p3994s.p3995a.C53190es) r12
            int r12 = r12.f139396a
            r12 = r12 & r3
            if (r12 == 0) goto L_0x0209
            com.google.assistant.s.a.di r12 = r10.f139234d
            if (r12 != 0) goto L_0x0047
            com.google.assistant.s.a.di r12 = com.google.assistant.p3994s.p3995a.C53153di.f139315c
        L_0x0047:
            com.google.protobuf.bt r0 = com.google.assistant.p3994s.p3995a.C53190es.f139394t
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r12.mo58887l(r0)
            com.google.protobuf.bf r12 = r12.f169962ag
            com.google.protobuf.bs r1 = r0.f169971d
            java.lang.Object r12 = r12.mo58854l(r1)
            if (r12 != 0) goto L_0x005d
            java.lang.Object r12 = r0.f169969b
            goto L_0x0061
        L_0x005d:
            java.lang.Object r12 = r0.mo58889c(r12)
        L_0x0061:
            com.google.assistant.s.a.es r12 = (com.google.assistant.p3994s.p3995a.C53190es) r12
            com.google.assistant.s.a.ep r12 = r12.f139401f
            if (r12 != 0) goto L_0x0069
            com.google.assistant.s.a.ep r12 = com.google.assistant.p3994s.p3995a.C53187ep.f139383h
        L_0x0069:
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            java.lang.String r1 = "UTC"
            java.util.TimeZone r1 = p3186j$.util.DesugarTimeZone.getTimeZone(r1)
            int r4 = r12.f139390f
            r5 = 60000(0xea60, float:8.4078E-41)
            int r4 = r4 * r5
            r1.setRawOffset(r4)
            com.google.cg.d r4 = r12.f139389e
            if (r4 != 0) goto L_0x0083
            com.google.cg.d r4 = com.google.p4479cg.C58072d.f155218d
        L_0x0083:
            int r4 = r4.f155220a
            r0.set(r3, r4)
            com.google.cg.d r3 = r12.f139389e
            if (r3 != 0) goto L_0x008e
            com.google.cg.d r3 = com.google.p4479cg.C58072d.f155218d
        L_0x008e:
            int r3 = r3.f155221b
            int r3 = r3 + -1
            r4 = 2
            r0.set(r4, r3)
            com.google.cg.d r3 = r12.f139389e
            if (r3 != 0) goto L_0x009c
            com.google.cg.d r3 = com.google.p4479cg.C58072d.f155218d
        L_0x009c:
            r4 = 5
            int r3 = r3.f155222c
            r0.set(r4, r3)
            com.google.cg.m r3 = r12.f139388d
            if (r3 != 0) goto L_0x00a8
            com.google.cg.m r3 = com.google.p4479cg.C58081m.f155254e
        L_0x00a8:
            int r3 = r3.f155256a
            r0.set(r2, r3)
            com.google.cg.m r2 = r12.f139388d
            if (r2 != 0) goto L_0x00b3
            com.google.cg.m r2 = com.google.p4479cg.C58081m.f155254e
        L_0x00b3:
            r3 = 12
            int r2 = r2.f155257b
            r0.set(r3, r2)
            com.google.cg.m r12 = r12.f139388d
            if (r12 != 0) goto L_0x00c0
            com.google.cg.m r12 = com.google.p4479cg.C58081m.f155254e
        L_0x00c0:
            r2 = 13
            int r12 = r12.f155258c
            r0.set(r2, r12)
            r12 = 14
            r2 = 0
            r0.set(r12, r2)
            r0.setTimeZone(r1)
            long r0 = r0.getTimeInMillis()
            java.util.List r12 = r15.mo106234b(r10, r0)
            java.util.Iterator r12 = r12.iterator()
        L_0x00dc:
            boolean r15 = r12.hasNext()
            if (r15 == 0) goto L_0x0209
            java.lang.Object r15 = r12.next()
            com.google.android.apps.search.assistant.platform.pcp.validity.r r15 = (com.google.android.apps.search.assistant.platform.pcp.validity.C124169r) r15
            com.google.android.apps.search.assistant.platform.pcp.i.a r0 = new com.google.android.apps.search.assistant.platform.pcp.i.a
            r0.<init>()
            int r1 = r15.mo106298a()
            com.google.assistant.s.a.j r1 = com.google.assistant.p3994s.p3995a.C53306j.m86809a(r1)
            r0.mo106246b(r1)
            int r1 = r10.f139233c
            r0.mo106248d(r1)
            java.lang.String r1 = r10.f139232b
            r0.mo106247c(r1)
            com.google.android.apps.search.assistant.platform.pcp.i.aj r0 = r0.mo106245a()
            if (r11 == 0) goto L_0x010c
            r13.put(r0, r15)
            goto L_0x00dc
        L_0x010c:
            r14.put(r0, r15)
            goto L_0x00dc
        L_0x0110:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89846n(r1)
            com.google.assistant.s.a.j r3 = com.google.assistant.p3994s.p3995a.C53306j.OPA_SMARTSPACE
            com.google.android.libraries.storage.b.ay r1 = com.google.android.apps.search.assistant.platform.pcp.p9325b.C123611ad.m202953l(r1, r3)
            android.database.Cursor r12 = r12.mo45932d(r1)     // Catch:{ InterruptedException -> 0x01b3, ct -> 0x019e }
            boolean r1 = r12.moveToNext()     // Catch:{ all -> 0x0192 }
            if (r1 == 0) goto L_0x018f
            java.lang.String r1 = "data_content"
            int r1 = r12.getColumnIndex(r1)     // Catch:{ all -> 0x0192 }
            if (r1 >= 0) goto L_0x0137
            if (r12 == 0) goto L_0x01c7
        L_0x0132:
            r12.close()     // Catch:{ InterruptedException -> 0x01b3, ct -> 0x019e }
            goto L_0x01c7
        L_0x0137:
            byte[] r5 = r12.getBlob(r1)     // Catch:{ all -> 0x0192 }
            java.lang.String r4 = "weather_current"
            com.google.android.libraries.f.a r1 = r15.f342565e     // Catch:{ all -> 0x0192 }
            long r8 = r1.mo26870b()     // Catch:{ all -> 0x0192 }
            r3 = 7
            r6 = 0
            r7 = 0
            com.google.android.apps.search.assistant.platform.pcp.f.bk r1 = com.google.android.apps.search.assistant.platform.pcp.p9325b.C123612ae.m202972f(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0192 }
            com.google.assistant.s.a.di r3 = r10.f139234d     // Catch:{ all -> 0x0192 }
            if (r3 != 0) goto L_0x0150
            com.google.assistant.s.a.di r3 = com.google.assistant.p3994s.p3995a.C53153di.f139315c     // Catch:{ all -> 0x0192 }
        L_0x0150:
            com.google.protobuf.bt r4 = com.google.assistant.p3994s.p3995a.C53245gt.f139565o     // Catch:{ all -> 0x0192 }
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)     // Catch:{ all -> 0x0192 }
            r3.mo58887l(r4)     // Catch:{ all -> 0x0192 }
            com.google.protobuf.bf r3 = r3.f169962ag     // Catch:{ all -> 0x0192 }
            com.google.protobuf.bs r5 = r4.f169971d     // Catch:{ all -> 0x0192 }
            java.lang.Object r3 = r3.mo58854l(r5)     // Catch:{ all -> 0x0192 }
            if (r3 != 0) goto L_0x0166
            java.lang.Object r3 = r4.f169969b     // Catch:{ all -> 0x0192 }
            goto L_0x016a
        L_0x0166:
            java.lang.Object r3 = r4.mo58889c(r3)     // Catch:{ all -> 0x0192 }
        L_0x016a:
            com.google.assistant.s.a.gt r3 = (com.google.assistant.p3994s.p3995a.C53245gt) r3     // Catch:{ all -> 0x0192 }
            com.google.android.apps.search.assistant.platform.pcp.i.co r4 = r15.f342574n     // Catch:{ all -> 0x0192 }
            int r5 = r1.f341808c     // Catch:{ all -> 0x0192 }
            if (r5 != r2) goto L_0x0177
            java.lang.Object r1 = r1.f341809d     // Catch:{ all -> 0x0192 }
            com.google.assistant.s.a.gt r1 = (com.google.assistant.p3994s.p3995a.C53245gt) r1     // Catch:{ all -> 0x0192 }
            goto L_0x0179
        L_0x0177:
            com.google.assistant.s.a.gt r1 = com.google.assistant.p3994s.p3995a.C53245gt.f139564n     // Catch:{ all -> 0x0192 }
        L_0x0179:
            com.google.android.libraries.f.a r2 = r15.f342565e     // Catch:{ all -> 0x0192 }
            long r5 = r2.mo26870b()     // Catch:{ all -> 0x0192 }
            j$.time.Instant r2 = p3186j$.time.Instant.ofEpochMilli(r5)     // Catch:{ all -> 0x0192 }
            boolean r1 = r4.mo106294a(r1, r3, r2)     // Catch:{ all -> 0x0192 }
            if (r1 != 0) goto L_0x018f
            if (r12 == 0) goto L_0x018e
            r12.close()     // Catch:{ InterruptedException -> 0x01b3, ct -> 0x019e }
        L_0x018e:
            return
        L_0x018f:
            if (r12 == 0) goto L_0x01c7
            goto L_0x0132
        L_0x0192:
            r1 = move-exception
            if (r12 == 0) goto L_0x019d
            r12.close()     // Catch:{ all -> 0x0199 }
            goto L_0x019d
        L_0x0199:
            r12 = move-exception
            com.google.android.apps.search.assistant.platform.pcp.p9337g.C124019o.m203394a(r1, r12)     // Catch:{ InterruptedException -> 0x01b3, ct -> 0x019e }
        L_0x019d:
            throw r1     // Catch:{ InterruptedException -> 0x01b3, ct -> 0x019e }
        L_0x019e:
            r12 = move-exception
            com.google.common.f.e r1 = com.google.android.apps.search.assistant.platform.pcp.p9337g.C124025u.f342561a
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r0)
            java.lang.String r0 = "Checking db invalid proto."
            r2 = 35370(0x8a2a, float:4.9564E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r12)).mo56372aa(r2)).mo56386p(r0)
            goto L_0x01c7
        L_0x01b3:
            r12 = move-exception
            com.google.common.f.e r1 = com.google.android.apps.search.assistant.platform.pcp.p9337g.C124025u.f342561a
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r0)
            java.lang.String r0 = "Checking db interrupted."
            r2 = 35369(0x8a29, float:4.9563E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r12)).mo56372aa(r2)).mo56386p(r0)
        L_0x01c7:
            com.google.android.libraries.f.a r12 = r15.f342565e
            long r0 = r12.mo26870b()
            java.util.List r12 = r15.mo106234b(r10, r0)
            java.util.Iterator r12 = r12.iterator()
        L_0x01d5:
            boolean r15 = r12.hasNext()
            if (r15 == 0) goto L_0x0209
            java.lang.Object r15 = r12.next()
            com.google.android.apps.search.assistant.platform.pcp.validity.r r15 = (com.google.android.apps.search.assistant.platform.pcp.validity.C124169r) r15
            com.google.android.apps.search.assistant.platform.pcp.i.a r0 = new com.google.android.apps.search.assistant.platform.pcp.i.a
            r0.<init>()
            int r1 = r15.mo106298a()
            com.google.assistant.s.a.j r1 = com.google.assistant.p3994s.p3995a.C53306j.m86809a(r1)
            r0.mo106246b(r1)
            int r1 = r10.f139233c
            r0.mo106248d(r1)
            java.lang.String r1 = r10.f139232b
            r0.mo106247c(r1)
            com.google.android.apps.search.assistant.platform.pcp.i.aj r0 = r0.mo106245a()
            if (r11 == 0) goto L_0x0205
            r13.put(r0, r15)
            goto L_0x01d5
        L_0x0205:
            r14.put(r0, r15)
            goto L_0x01d5
        L_0x0209:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.pcp.p9337g.C124024t.m203397a(com.google.assistant.s.a.ci, boolean, com.google.android.libraries.storage.b.bf, java.util.Map, java.util.Map, com.google.android.apps.search.assistant.platform.pcp.g.u):void");
    }
}
