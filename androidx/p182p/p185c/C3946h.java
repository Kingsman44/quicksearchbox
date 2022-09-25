package androidx.p182p.p185c;

/* renamed from: androidx.p.c.h */
/* compiled from: PG */
public final class C3946h {
    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0301 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0306 A[SYNTHETIC, Splitter:B:88:0x0306] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.p182p.p185c.C3950l m11299a(androidx.p186q.p187a.C4049d r29, java.lang.String r30) {
        /*
            r0 = r29
            r1 = r30
            java.lang.String r2 = "seq"
            java.lang.String r3 = "id"
            java.lang.String r4 = "type"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "PRAGMA table_info(`"
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r6 = "`)"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.database.Cursor r5 = r0.mo8242b(r5)
            java.lang.String r7 = "database.query(\"PRAGMA table_info(`$tableName`)\")"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r7)
            int r7 = r5.getColumnCount()     // Catch:{ all -> 0x034e }
            java.lang.String r10 = "name"
            r11 = 0
            if (r7 > 0) goto L_0x0035
            h.a.an r4 = p5462h.p5463a.C69497an.f185919a     // Catch:{ all -> 0x034e }
            p5462h.p5472e.C69598b.m101013a(r5, r11)
            goto L_0x009b
        L_0x0035:
            int r7 = r5.getColumnIndex(r10)     // Catch:{ all -> 0x034e }
            int r12 = r5.getColumnIndex(r4)     // Catch:{ all -> 0x034e }
            java.lang.String r13 = "notnull"
            int r13 = r5.getColumnIndex(r13)     // Catch:{ all -> 0x034e }
            java.lang.String r14 = "pk"
            int r14 = r5.getColumnIndex(r14)     // Catch:{ all -> 0x034e }
            java.lang.String r15 = "dflt_value"
            int r15 = r5.getColumnIndex(r15)     // Catch:{ all -> 0x034e }
            h.a.a.k r8 = new h.a.a.k     // Catch:{ all -> 0x034e }
            r9 = 8
            r8.<init>(r9)     // Catch:{ all -> 0x034e }
        L_0x0056:
            boolean r9 = r5.moveToNext()     // Catch:{ all -> 0x034e }
            if (r9 == 0) goto L_0x0093
            java.lang.String r9 = r5.getString(r7)     // Catch:{ all -> 0x034e }
            java.lang.String r11 = r5.getString(r12)     // Catch:{ all -> 0x034e }
            int r16 = r5.getInt(r13)     // Catch:{ all -> 0x034e }
            if (r16 == 0) goto L_0x006d
            r19 = 1
            goto L_0x006f
        L_0x006d:
            r19 = 0
        L_0x006f:
            int r20 = r5.getInt(r14)     // Catch:{ all -> 0x034e }
            java.lang.String r21 = r5.getString(r15)     // Catch:{ all -> 0x034e }
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r10)     // Catch:{ all -> 0x034e }
            r23 = r7
            androidx.p.c.g r7 = new androidx.p.c.g     // Catch:{ all -> 0x034e }
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r4)     // Catch:{ all -> 0x034e }
            r22 = 2
            r16 = r7
            r17 = r9
            r18 = r11
            r16.<init>(r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x034e }
            r8.put(r9, r7)     // Catch:{ all -> 0x034e }
            r7 = r23
            r11 = 0
            goto L_0x0056
        L_0x0093:
            java.util.Map r4 = p5462h.p5463a.C69505av.m100861c(r8)     // Catch:{ all -> 0x034e }
            r7 = 0
            p5462h.p5472e.C69598b.m101013a(r5, r7)
        L_0x009b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "PRAGMA foreign_key_list(`"
            r5.<init>(r7)
            r5.append(r1)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.database.Cursor r5 = r0.mo8242b(r5)
            java.lang.String r7 = "database.query(\"PRAGMA f…_key_list(`$tableName`)\")"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r7)
            int r7 = r5.getColumnIndex(r3)     // Catch:{ all -> 0x0345 }
            int r8 = r5.getColumnIndex(r2)     // Catch:{ all -> 0x0345 }
            java.lang.String r9 = "table"
            int r9 = r5.getColumnIndex(r9)     // Catch:{ all -> 0x0345 }
            java.lang.String r11 = "on_delete"
            int r11 = r5.getColumnIndex(r11)     // Catch:{ all -> 0x0345 }
            java.lang.String r12 = "on_update"
            int r12 = r5.getColumnIndex(r12)     // Catch:{ all -> 0x0345 }
            int r3 = r5.getColumnIndex(r3)     // Catch:{ all -> 0x0345 }
            int r2 = r5.getColumnIndex(r2)     // Catch:{ all -> 0x0345 }
            java.lang.String r13 = "from"
            int r13 = r5.getColumnIndex(r13)     // Catch:{ all -> 0x0345 }
            java.lang.String r14 = "to"
            int r14 = r5.getColumnIndex(r14)     // Catch:{ all -> 0x0345 }
            h.a.a.c r15 = new h.a.a.c     // Catch:{ all -> 0x0345 }
            r16 = r4
            r4 = 10
            r15.<init>(r4)     // Catch:{ all -> 0x0345 }
        L_0x00ec:
            boolean r4 = r5.moveToNext()     // Catch:{ all -> 0x0345 }
            if (r4 == 0) goto L_0x0129
            androidx.p.c.j r4 = new androidx.p.c.j     // Catch:{ all -> 0x0345 }
            r17 = r10
            int r10 = r5.getInt(r3)     // Catch:{ all -> 0x0345 }
            r18 = r3
            int r3 = r5.getInt(r2)     // Catch:{ all -> 0x0345 }
            r19 = r2
            java.lang.String r2 = r5.getString(r13)     // Catch:{ all -> 0x0345 }
            r20 = r13
            java.lang.String r13 = "cursor.getString(fromColumnIndex)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r13)     // Catch:{ all -> 0x0345 }
            java.lang.String r13 = r5.getString(r14)     // Catch:{ all -> 0x0345 }
            r21 = r14
            java.lang.String r14 = "cursor.getString(toColumnIndex)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r14)     // Catch:{ all -> 0x0345 }
            r4.<init>(r10, r3, r2, r13)     // Catch:{ all -> 0x0345 }
            r15.add(r4)     // Catch:{ all -> 0x0345 }
            r10 = r17
            r3 = r18
            r2 = r19
            r13 = r20
            r14 = r21
            goto L_0x00ec
        L_0x0129:
            r17 = r10
            java.util.List r2 = p5462h.p5463a.C69540x.m100943a(r15)     // Catch:{ all -> 0x0345 }
            java.util.List r2 = p5462h.p5463a.C69540x.m100836R(r2)     // Catch:{ all -> 0x0345 }
            r3 = -1
            r5.moveToPosition(r3)     // Catch:{ all -> 0x0345 }
            h.a.a.q r4 = new h.a.a.q     // Catch:{ all -> 0x0345 }
            r4.<init>()     // Catch:{ all -> 0x0345 }
        L_0x013c:
            boolean r10 = r5.moveToNext()     // Catch:{ all -> 0x0345 }
            if (r10 == 0) goto L_0x01ce
            int r10 = r5.getInt(r8)     // Catch:{ all -> 0x0345 }
            if (r10 != 0) goto L_0x013c
            int r10 = r5.getInt(r7)     // Catch:{ all -> 0x0345 }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x0345 }
            r13.<init>()     // Catch:{ all -> 0x0345 }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0345 }
            r14.<init>()     // Catch:{ all -> 0x0345 }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x0345 }
            r15.<init>()     // Catch:{ all -> 0x0345 }
            java.util.Iterator r18 = r2.iterator()     // Catch:{ all -> 0x0345 }
        L_0x015f:
            boolean r19 = r18.hasNext()     // Catch:{ all -> 0x0345 }
            if (r19 == 0) goto L_0x0179
            java.lang.Object r3 = r18.next()     // Catch:{ all -> 0x0345 }
            r20 = r2
            r2 = r3
            androidx.p.c.j r2 = (androidx.p182p.p185c.C3948j) r2     // Catch:{ all -> 0x0345 }
            int r2 = r2.f12626a     // Catch:{ all -> 0x0345 }
            if (r2 != r10) goto L_0x0175
            r15.add(r3)     // Catch:{ all -> 0x0345 }
        L_0x0175:
            r2 = r20
            r3 = -1
            goto L_0x015f
        L_0x0179:
            r20 = r2
            java.util.Iterator r2 = r15.iterator()     // Catch:{ all -> 0x0345 }
        L_0x017f:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0345 }
            if (r3 == 0) goto L_0x0196
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0345 }
            androidx.p.c.j r3 = (androidx.p182p.p185c.C3948j) r3     // Catch:{ all -> 0x0345 }
            java.lang.String r10 = r3.f12627b     // Catch:{ all -> 0x0345 }
            r13.add(r10)     // Catch:{ all -> 0x0345 }
            java.lang.String r3 = r3.f12628c     // Catch:{ all -> 0x0345 }
            r14.add(r3)     // Catch:{ all -> 0x0345 }
            goto L_0x017f
        L_0x0196:
            androidx.p.c.i r2 = new androidx.p.c.i     // Catch:{ all -> 0x0345 }
            java.lang.String r3 = r5.getString(r9)     // Catch:{ all -> 0x0345 }
            java.lang.String r10 = "cursor.getString(tableColumnIndex)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r10)     // Catch:{ all -> 0x0345 }
            java.lang.String r10 = r5.getString(r11)     // Catch:{ all -> 0x0345 }
            java.lang.String r15 = "cursor.getString(onDeleteColumnIndex)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r15)     // Catch:{ all -> 0x0345 }
            java.lang.String r15 = r5.getString(r12)     // Catch:{ all -> 0x0345 }
            r18 = r7
            java.lang.String r7 = "cursor.getString(onUpdateColumnIndex)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r15, r7)     // Catch:{ all -> 0x0345 }
            r23 = r2
            r24 = r3
            r25 = r10
            r26 = r15
            r27 = r13
            r28 = r14
            r23.<init>(r24, r25, r26, r27, r28)     // Catch:{ all -> 0x0345 }
            r4.add(r2)     // Catch:{ all -> 0x0345 }
            r7 = r18
            r2 = r20
            r3 = -1
            goto L_0x013c
        L_0x01ce:
            h.a.a.k r2 = r4.f185913a     // Catch:{ all -> 0x0345 }
            r2.mo61117j()     // Catch:{ all -> 0x0345 }
            r2 = 0
            p5462h.p5472e.C69598b.m101013a(r5, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "PRAGMA index_list(`"
            r2.<init>(r3)
            r2.append(r1)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            android.database.Cursor r2 = r0.mo8242b(r2)
            java.lang.String r3 = "database.query(\"PRAGMA index_list(`$tableName`)\")"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            r3 = r17
            int r5 = r2.getColumnIndex(r3)     // Catch:{ all -> 0x033c }
            java.lang.String r7 = "origin"
            int r7 = r2.getColumnIndex(r7)     // Catch:{ all -> 0x033c }
            java.lang.String r8 = "unique"
            int r8 = r2.getColumnIndex(r8)     // Catch:{ all -> 0x033c }
            r9 = -1
            if (r5 == r9) goto L_0x032f
            if (r7 == r9) goto L_0x032f
            if (r8 != r9) goto L_0x020c
            goto L_0x032f
        L_0x020c:
            h.a.a.q r9 = new h.a.a.q     // Catch:{ all -> 0x033c }
            r9.<init>()     // Catch:{ all -> 0x033c }
        L_0x0211:
            boolean r10 = r2.moveToNext()     // Catch:{ all -> 0x033c }
            if (r10 == 0) goto L_0x0324
            java.lang.String r10 = "c"
            java.lang.String r11 = r2.getString(r7)     // Catch:{ all -> 0x033c }
            boolean r10 = p5462h.p5473f.p5475b.C69664n.m101066l(r10, r11)     // Catch:{ all -> 0x033c }
            if (r10 == 0) goto L_0x0320
            java.lang.String r10 = r2.getString(r5)     // Catch:{ all -> 0x033c }
            int r11 = r2.getInt(r8)     // Catch:{ all -> 0x033c }
            r12 = 1
            if (r11 != r12) goto L_0x0230
            r11 = 1
            goto L_0x0231
        L_0x0230:
            r11 = 0
        L_0x0231:
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r3)     // Catch:{ all -> 0x033c }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x033c }
            r13.<init>()     // Catch:{ all -> 0x033c }
            java.lang.String r14 = "PRAGMA index_xinfo(`"
            r13.append(r14)     // Catch:{ all -> 0x033c }
            r13.append(r10)     // Catch:{ all -> 0x033c }
            r13.append(r6)     // Catch:{ all -> 0x033c }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x033c }
            android.database.Cursor r13 = r0.mo8242b(r13)     // Catch:{ all -> 0x033c }
            java.lang.String r14 = "database.query(\"PRAGMA index_xinfo(`$name`)\")"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r14)     // Catch:{ all -> 0x033c }
            java.lang.String r14 = "seqno"
            int r14 = r13.getColumnIndex(r14)     // Catch:{ all -> 0x0317 }
            java.lang.String r15 = "cid"
            int r15 = r13.getColumnIndex(r15)     // Catch:{ all -> 0x0317 }
            int r12 = r13.getColumnIndex(r3)     // Catch:{ all -> 0x0317 }
            java.lang.String r0 = "desc"
            int r0 = r13.getColumnIndex(r0)     // Catch:{ all -> 0x0317 }
            r17 = r3
            r3 = -1
            if (r14 == r3) goto L_0x02f2
            if (r15 == r3) goto L_0x02f2
            if (r12 == r3) goto L_0x02f2
            if (r0 != r3) goto L_0x0274
            goto L_0x02f2
        L_0x0274:
            java.util.TreeMap r3 = new java.util.TreeMap     // Catch:{ all -> 0x0317 }
            r3.<init>()     // Catch:{ all -> 0x0317 }
            r18 = r5
            java.util.TreeMap r5 = new java.util.TreeMap     // Catch:{ all -> 0x0317 }
            r5.<init>()     // Catch:{ all -> 0x0317 }
        L_0x0280:
            boolean r20 = r13.moveToNext()     // Catch:{ all -> 0x0317 }
            if (r20 == 0) goto L_0x02c7
            int r20 = r13.getInt(r15)     // Catch:{ all -> 0x0317 }
            if (r20 < 0) goto L_0x0280
            int r20 = r13.getInt(r14)     // Catch:{ all -> 0x0317 }
            r21 = r6
            java.lang.String r6 = r13.getString(r12)     // Catch:{ all -> 0x0317 }
            int r22 = r13.getInt(r0)     // Catch:{ all -> 0x0317 }
            java.lang.String r23 = "DESC"
            java.lang.String r24 = "ASC"
            if (r22 <= 0) goto L_0x02a7
            r22 = r0
            r0 = r23
            r23 = r7
            goto L_0x02ad
        L_0x02a7:
            r22 = r0
            r23 = r7
            r0 = r24
        L_0x02ad:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r20)     // Catch:{ all -> 0x0317 }
            r20 = r8
            java.lang.String r8 = "columnName"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r8)     // Catch:{ all -> 0x0317 }
            r3.put(r7, r6)     // Catch:{ all -> 0x0317 }
            r5.put(r7, r0)     // Catch:{ all -> 0x0317 }
            r8 = r20
            r6 = r21
            r0 = r22
            r7 = r23
            goto L_0x0280
        L_0x02c7:
            r21 = r6
            r23 = r7
            r20 = r8
            java.util.Collection r0 = r3.values()     // Catch:{ all -> 0x0317 }
            java.lang.String r3 = "columnsMap.values"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r3)     // Catch:{ all -> 0x0317 }
            java.util.List r0 = p5462h.p5463a.C69540x.m100840V(r0)     // Catch:{ all -> 0x0317 }
            java.util.Collection r3 = r5.values()     // Catch:{ all -> 0x0317 }
            java.lang.String r5 = "ordersMap.values"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r5)     // Catch:{ all -> 0x0317 }
            java.util.List r3 = p5462h.p5463a.C69540x.m100840V(r3)     // Catch:{ all -> 0x0317 }
            androidx.p.c.k r5 = new androidx.p.c.k     // Catch:{ all -> 0x0317 }
            r5.<init>(r10, r11, r0, r3)     // Catch:{ all -> 0x0317 }
            r0 = 0
            p5462h.p5472e.C69598b.m101013a(r13, r0)     // Catch:{ all -> 0x033c }
            r0 = 0
            goto L_0x02ff
        L_0x02f2:
            r18 = r5
            r21 = r6
            r23 = r7
            r20 = r8
            r0 = 0
            p5462h.p5472e.C69598b.m101013a(r13, r0)     // Catch:{ all -> 0x033c }
            r5 = r0
        L_0x02ff:
            if (r5 != 0) goto L_0x0306
            p5462h.p5472e.C69598b.m101013a(r2, r0)
            r11 = 0
            goto L_0x0334
        L_0x0306:
            r9.add(r5)     // Catch:{ all -> 0x033c }
            r0 = r29
            r3 = r17
            r5 = r18
            r8 = r20
            r6 = r21
            r7 = r23
            goto L_0x0211
        L_0x0317:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch:{ all -> 0x031a }
        L_0x031a:
            r0 = move-exception
            r3 = r0
            p5462h.p5472e.C69598b.m101013a(r13, r1)     // Catch:{ all -> 0x033c }
            throw r3     // Catch:{ all -> 0x033c }
        L_0x0320:
            r0 = r29
            goto L_0x0211
        L_0x0324:
            h.a.a.k r0 = r9.f185913a     // Catch:{ all -> 0x033c }
            r0.mo61117j()     // Catch:{ all -> 0x033c }
            r0 = 0
            p5462h.p5472e.C69598b.m101013a(r2, r0)
            r11 = r9
            goto L_0x0334
        L_0x032f:
            r0 = 0
            p5462h.p5472e.C69598b.m101013a(r2, r0)
            r11 = r0
        L_0x0334:
            androidx.p.c.l r0 = new androidx.p.c.l
            r2 = r16
            r0.<init>(r1, r2, r4, r11)
            return r0
        L_0x033c:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch:{ all -> 0x033f }
        L_0x033f:
            r0 = move-exception
            r3 = r0
            p5462h.p5472e.C69598b.m101013a(r2, r1)
            throw r3
        L_0x0345:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch:{ all -> 0x0348 }
        L_0x0348:
            r0 = move-exception
            r2 = r0
            p5462h.p5472e.C69598b.m101013a(r5, r1)
            throw r2
        L_0x034e:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch:{ all -> 0x0351 }
        L_0x0351:
            r0 = move-exception
            r2 = r0
            p5462h.p5472e.C69598b.m101013a(r5, r1)
            goto L_0x0358
        L_0x0357:
            throw r2
        L_0x0358:
            goto L_0x0357
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p182p.p185c.C3946h.m11299a(androidx.q.a.d, java.lang.String):androidx.p.c.l");
    }
}
