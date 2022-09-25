package com.google.knowledge.cerebra.sense.textclassifier.tclib;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.al */
/* compiled from: PG */
public final class C61875al {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0124 A[LOOP:1: B:53:0x011e->B:55:0x0124, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01ca  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List m94540a(android.content.ContentResolver r18) {
        /*
            java.lang.String[] r0 = com.google.knowledge.cerebra.sense.textclassifier.tclib.C61874ak.f167318a
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.TreeSet r8 = new java.util.TreeSet
            r8.<init>()
            r1 = 0
            r9 = 3
            r10 = 2
            r11 = 1
            android.net.Uri r13 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ SecurityException -> 0x0109 }
            java.lang.String[] r14 = com.google.knowledge.cerebra.sense.textclassifier.tclib.C61874ak.f167318a     // Catch:{ SecurityException -> 0x0109 }
            r15 = 0
            r16 = 0
            r17 = 0
            r12 = r18
            android.database.Cursor r12 = r12.query(r13, r14, r15, r16, r17)     // Catch:{ SecurityException -> 0x0109 }
        L_0x0024:
            if (r12 == 0) goto L_0x0100
            boolean r1 = r12.moveToNext()     // Catch:{ SecurityException -> 0x00fe, all -> 0x00fa }
            if (r1 == 0) goto L_0x0100
            java.lang.String r1 = "account_type"
            int r1 = r12.getColumnIndex(r1)     // Catch:{ SecurityException -> 0x00fe, all -> 0x00fa }
            if (r1 < 0) goto L_0x0051
            boolean r2 = r12.isNull(r1)     // Catch:{ SecurityException -> 0x00fe, all -> 0x00fa }
            if (r2 != 0) goto L_0x0051
            java.lang.String r2 = "com.google"
            java.lang.String r1 = r12.getString(r1)     // Catch:{ SecurityException -> 0x00fe, all -> 0x00fa }
            boolean r1 = r2.equals(r1)     // Catch:{ SecurityException -> 0x00fe, all -> 0x00fa }
            if (r1 == 0) goto L_0x0051
            java.lang.String r1 = "sourceid"
            r2 = 8
            r3 = r12
            r4 = r0
            r5 = r7
            r6 = r8
            com.google.knowledge.cerebra.sense.textclassifier.tclib.C61874ak.m94539b(r1, r2, r3, r4, r5, r6)     // Catch:{ SecurityException -> 0x00fe, all -> 0x00fa }
        L_0x0051:
            java.lang.String r1 = "account_type"
            r2 = 9
            r3 = r12
            r4 = r0
            r5 = r7
            r6 = r8
            com.google.knowledge.cerebra.sense.textclassifier.tclib.C61874ak.m94539b(r1, r2, r3, r4, r5, r6)     // Catch:{ SecurityException -> 0x00fe, all -> 0x00fa }
            java.lang.String r1 = "account_name"
            r2 = 10
            r3 = r12
            r4 = r0
            r5 = r7
            r6 = r8
            com.google.knowledge.cerebra.sense.textclassifier.tclib.C61874ak.m94539b(r1, r2, r3, r4, r5, r6)     // Catch:{ SecurityException -> 0x00fe, all -> 0x00fa }
            java.lang.String r1 = "mimetype"
            int r1 = r12.getColumnIndex(r1)     // Catch:{ SecurityException -> 0x00fe, all -> 0x00fa }
            java.lang.String r1 = r12.getString(r1)     // Catch:{ SecurityException -> 0x00fe, all -> 0x00fa }
            int r2 = r1.hashCode()     // Catch:{ SecurityException -> 0x00fe, all -> 0x00fa }
            switch(r2) {
                case -1569536764: goto L_0x0097;
                case -1079224304: goto L_0x008d;
                case 684173810: goto L_0x0083;
                case 2034973555: goto L_0x0079;
                default: goto L_0x0078;
            }
        L_0x0078:
            goto L_0x00a1
        L_0x0079:
            java.lang.String r2 = "vnd.android.cursor.item/nickname"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00a1
            r1 = 1
            goto L_0x00a2
        L_0x0083:
            java.lang.String r2 = "vnd.android.cursor.item/phone_v2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00a1
            r1 = 3
            goto L_0x00a2
        L_0x008d:
            java.lang.String r2 = "vnd.android.cursor.item/name"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00a1
            r1 = 0
            goto L_0x00a2
        L_0x0097:
            java.lang.String r2 = "vnd.android.cursor.item/email_v2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00a1
            r1 = 2
            goto L_0x00a2
        L_0x00a1:
            r1 = -1
        L_0x00a2:
            if (r1 == 0) goto L_0x00d0
            if (r1 == r11) goto L_0x00c4
            if (r1 == r10) goto L_0x00b8
            if (r1 == r9) goto L_0x00ac
            goto L_0x0024
        L_0x00ac:
            java.lang.String r1 = "data1"
            r2 = 7
            r3 = r12
            r4 = r0
            r5 = r7
            r6 = r8
            com.google.knowledge.cerebra.sense.textclassifier.tclib.C61874ak.m94539b(r1, r2, r3, r4, r5, r6)     // Catch:{ SecurityException -> 0x00fe, all -> 0x00fa }
            goto L_0x0024
        L_0x00b8:
            java.lang.String r1 = "data1"
            r2 = 6
            r3 = r12
            r4 = r0
            r5 = r7
            r6 = r8
            com.google.knowledge.cerebra.sense.textclassifier.tclib.C61874ak.m94539b(r1, r2, r3, r4, r5, r6)     // Catch:{ SecurityException -> 0x00fe, all -> 0x00fa }
            goto L_0x0024
        L_0x00c4:
            java.lang.String r1 = "data1"
            r2 = 5
            r3 = r12
            r4 = r0
            r5 = r7
            r6 = r8
            com.google.knowledge.cerebra.sense.textclassifier.tclib.C61874ak.m94539b(r1, r2, r3, r4, r5, r6)     // Catch:{ SecurityException -> 0x00fe, all -> 0x00fa }
            goto L_0x0024
        L_0x00d0:
            java.lang.String r1 = "display_name"
            r2 = 2
            r3 = r12
            r4 = r0
            r5 = r7
            r6 = r8
            com.google.knowledge.cerebra.sense.textclassifier.tclib.C61874ak.m94539b(r1, r2, r3, r4, r5, r6)     // Catch:{ SecurityException -> 0x00fe, all -> 0x00fa }
            java.lang.String r1 = "data1"
            r2 = 1
            r3 = r12
            r4 = r0
            r5 = r7
            r6 = r8
            com.google.knowledge.cerebra.sense.textclassifier.tclib.C61874ak.m94539b(r1, r2, r3, r4, r5, r6)     // Catch:{ SecurityException -> 0x00fe, all -> 0x00fa }
            java.lang.String r1 = "data2"
            r2 = 3
            r3 = r12
            r4 = r0
            r5 = r7
            r6 = r8
            com.google.knowledge.cerebra.sense.textclassifier.tclib.C61874ak.m94539b(r1, r2, r3, r4, r5, r6)     // Catch:{ SecurityException -> 0x00fe, all -> 0x00fa }
            java.lang.String r1 = "data3"
            r2 = 4
            r3 = r12
            r4 = r0
            r5 = r7
            r6 = r8
            com.google.knowledge.cerebra.sense.textclassifier.tclib.C61874ak.m94539b(r1, r2, r3, r4, r5, r6)     // Catch:{ SecurityException -> 0x00fe, all -> 0x00fa }
            goto L_0x0024
        L_0x00fa:
            r0 = move-exception
            r1 = r12
            goto L_0x01c8
        L_0x00fe:
            r1 = r12
            goto L_0x0109
        L_0x0100:
            if (r12 == 0) goto L_0x0115
            r12.close()
            goto L_0x0115
        L_0x0106:
            r0 = move-exception
            goto L_0x01c8
        L_0x0109:
            java.lang.String r2 = "ContactListBuilder"
            java.lang.String r3 = "Permission to read contacts not granted."
            android.util.Log.w(r2, r3)     // Catch:{ all -> 0x0106 }
            if (r1 == 0) goto L_0x0115
            r1.close()
        L_0x0115:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r8.iterator()
        L_0x011e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01c7
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            com.google.knowledge.cerebra.sense.textclassifier.b.c r4 = com.google.knowledge.cerebra.sense.textclassifier.p4678b.C61845c.f167104m
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.knowledge.cerebra.sense.textclassifier.b.b r4 = (com.google.knowledge.cerebra.sense.textclassifier.p4678b.C61844b) r4
            p3186j$.util.Objects.requireNonNull(r4)
            com.google.knowledge.cerebra.sense.textclassifier.tclib.y r5 = new com.google.knowledge.cerebra.sense.textclassifier.tclib.y
            r5.<init>(r4)
            com.google.knowledge.cerebra.sense.textclassifier.tclib.C61874ak.m94538a(r3, r11, r5, r0)
            p3186j$.util.Objects.requireNonNull(r4)
            com.google.knowledge.cerebra.sense.textclassifier.tclib.z r5 = new com.google.knowledge.cerebra.sense.textclassifier.tclib.z
            r5.<init>(r4)
            com.google.knowledge.cerebra.sense.textclassifier.tclib.C61874ak.m94538a(r3, r10, r5, r0)
            p3186j$.util.Objects.requireNonNull(r4)
            com.google.knowledge.cerebra.sense.textclassifier.tclib.aa r5 = new com.google.knowledge.cerebra.sense.textclassifier.tclib.aa
            r5.<init>(r4)
            com.google.knowledge.cerebra.sense.textclassifier.tclib.C61874ak.m94538a(r3, r9, r5, r0)
            p3186j$.util.Objects.requireNonNull(r4)
            com.google.knowledge.cerebra.sense.textclassifier.tclib.ab r5 = new com.google.knowledge.cerebra.sense.textclassifier.tclib.ab
            r5.<init>(r4)
            r6 = 4
            com.google.knowledge.cerebra.sense.textclassifier.tclib.C61874ak.m94538a(r3, r6, r5, r0)
            p3186j$.util.Objects.requireNonNull(r4)
            com.google.knowledge.cerebra.sense.textclassifier.tclib.ac r5 = new com.google.knowledge.cerebra.sense.textclassifier.tclib.ac
            r5.<init>(r4)
            r6 = 5
            com.google.knowledge.cerebra.sense.textclassifier.tclib.C61874ak.m94538a(r3, r6, r5, r0)
            p3186j$.util.Objects.requireNonNull(r4)
            com.google.knowledge.cerebra.sense.textclassifier.tclib.ad r5 = new com.google.knowledge.cerebra.sense.textclassifier.tclib.ad
            r5.<init>(r4)
            r6 = 6
            com.google.knowledge.cerebra.sense.textclassifier.tclib.C61874ak.m94538a(r3, r6, r5, r0)
            p3186j$.util.Objects.requireNonNull(r4)
            com.google.knowledge.cerebra.sense.textclassifier.tclib.ae r5 = new com.google.knowledge.cerebra.sense.textclassifier.tclib.ae
            r5.<init>(r4)
            r6 = 7
            com.google.knowledge.cerebra.sense.textclassifier.tclib.C61874ak.m94538a(r3, r6, r5, r0)
            p3186j$.util.Objects.requireNonNull(r4)
            com.google.knowledge.cerebra.sense.textclassifier.tclib.af r5 = new com.google.knowledge.cerebra.sense.textclassifier.tclib.af
            r5.<init>(r4)
            r6 = 8
            com.google.knowledge.cerebra.sense.textclassifier.tclib.C61874ak.m94538a(r3, r6, r5, r0)
            p3186j$.util.Objects.requireNonNull(r4)
            com.google.knowledge.cerebra.sense.textclassifier.tclib.ag r5 = new com.google.knowledge.cerebra.sense.textclassifier.tclib.ag
            r5.<init>(r4)
            r6 = 9
            com.google.knowledge.cerebra.sense.textclassifier.tclib.C61874ak.m94538a(r3, r6, r5, r0)
            p3186j$.util.Objects.requireNonNull(r4)
            com.google.knowledge.cerebra.sense.textclassifier.tclib.ah r5 = new com.google.knowledge.cerebra.sense.textclassifier.tclib.ah
            r5.<init>(r4)
            r6 = 10
            com.google.knowledge.cerebra.sense.textclassifier.tclib.C61874ak.m94538a(r3, r6, r5, r0)
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.knowledge.cerebra.sense.textclassifier.b.c r5 = (com.google.knowledge.cerebra.sense.textclassifier.p4678b.C61845c) r5
            r3.getClass()
            int r6 = r5.f167106a
            r6 = r6 | 512(0x200, float:7.175E-43)
            r5.f167106a = r6
            r5.f167116k = r3
            com.google.protobuf.bv r3 = r4.build()
            com.google.knowledge.cerebra.sense.textclassifier.b.c r3 = (com.google.knowledge.cerebra.sense.textclassifier.p4678b.C61845c) r3
            r1.add(r3)
            goto L_0x011e
        L_0x01c7:
            return r1
        L_0x01c8:
            if (r1 == 0) goto L_0x01cd
            r1.close()
        L_0x01cd:
            goto L_0x01cf
        L_0x01ce:
            throw r0
        L_0x01cf:
            goto L_0x01ce
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.knowledge.cerebra.sense.textclassifier.tclib.C61875al.m94540a(android.content.ContentResolver):java.util.List");
    }
}
