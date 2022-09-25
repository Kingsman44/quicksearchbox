package androidx.p182p.p185c;

/* renamed from: androidx.p.c.b */
/* compiled from: PG */
public final class C3940b {
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0099, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009a, code lost:
        p5462h.p5472e.C69598b.m101013a(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009d, code lost:
        throw r6;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.database.Cursor m11293a(androidx.p182p.C3925ah r4, androidx.p186q.p187a.C4056k r5, boolean r6, android.os.CancellationSignal r7) {
        /*
            java.lang.String r0 = "sqLiteQuery"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r0)
            android.database.Cursor r4 = r4.mo8166J(r5, r7)
            if (r6 == 0) goto L_0x009e
            boolean r5 = r4 instanceof android.database.AbstractWindowedCursor
            if (r5 == 0) goto L_0x009e
            r5 = r4
            android.database.AbstractWindowedCursor r5 = (android.database.AbstractWindowedCursor) r5
            int r6 = r5.getCount()
            boolean r7 = r5.hasWindow()
            if (r7 == 0) goto L_0x0025
            android.database.CursorWindow r5 = r5.getWindow()
            int r5 = r5.getNumRows()
            goto L_0x0026
        L_0x0025:
            r5 = r6
        L_0x0026:
            if (r5 >= r6) goto L_0x009e
            java.lang.String r5 = "c"
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r5)
            android.database.MatrixCursor r5 = new android.database.MatrixCursor     // Catch:{ all -> 0x0097 }
            java.lang.String[] r6 = r4.getColumnNames()     // Catch:{ all -> 0x0097 }
            int r7 = r4.getCount()     // Catch:{ all -> 0x0097 }
            r5.<init>(r6, r7)     // Catch:{ all -> 0x0097 }
        L_0x003a:
            boolean r6 = r4.moveToNext()     // Catch:{ all -> 0x0097 }
            r7 = 0
            if (r6 == 0) goto L_0x0093
            int r6 = r4.getColumnCount()     // Catch:{ all -> 0x0097 }
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0097 }
            int r0 = r4.getColumnCount()     // Catch:{ all -> 0x0097 }
            r1 = 0
        L_0x004c:
            if (r1 >= r0) goto L_0x008f
            int r2 = r4.getType(r1)     // Catch:{ all -> 0x0097 }
            if (r2 == 0) goto L_0x008a
            r3 = 1
            if (r2 == r3) goto L_0x007f
            r3 = 2
            if (r2 == r3) goto L_0x0074
            r3 = 3
            if (r2 == r3) goto L_0x006d
            r3 = 4
            if (r2 != r3) goto L_0x0067
            byte[] r2 = r4.getBlob(r1)     // Catch:{ all -> 0x0097 }
            r6[r1] = r2     // Catch:{ all -> 0x0097 }
            goto L_0x008c
        L_0x0067:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0097 }
            r5.<init>()     // Catch:{ all -> 0x0097 }
            throw r5     // Catch:{ all -> 0x0097 }
        L_0x006d:
            java.lang.String r2 = r4.getString(r1)     // Catch:{ all -> 0x0097 }
            r6[r1] = r2     // Catch:{ all -> 0x0097 }
            goto L_0x008c
        L_0x0074:
            double r2 = r4.getDouble(r1)     // Catch:{ all -> 0x0097 }
            java.lang.Double r2 = java.lang.Double.valueOf(r2)     // Catch:{ all -> 0x0097 }
            r6[r1] = r2     // Catch:{ all -> 0x0097 }
            goto L_0x008c
        L_0x007f:
            long r2 = r4.getLong(r1)     // Catch:{ all -> 0x0097 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0097 }
            r6[r1] = r2     // Catch:{ all -> 0x0097 }
            goto L_0x008c
        L_0x008a:
            r6[r1] = r7     // Catch:{ all -> 0x0097 }
        L_0x008c:
            int r1 = r1 + 1
            goto L_0x004c
        L_0x008f:
            r5.addRow(r6)     // Catch:{ all -> 0x0097 }
            goto L_0x003a
        L_0x0093:
            p5462h.p5472e.C69598b.m101013a(r4, r7)
            return r5
        L_0x0097:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0099 }
        L_0x0099:
            r6 = move-exception
            p5462h.p5472e.C69598b.m101013a(r4, r5)
            throw r6
        L_0x009e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p182p.p185c.C3940b.m11293a(androidx.p.ah, androidx.q.a.k, boolean, android.os.CancellationSignal):android.database.Cursor");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
        p5462h.p5472e.C69598b.m101013a(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0061, code lost:
        throw r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m11294b(androidx.p186q.p187a.C4049d r4) {
        /*
            h.a.a.c r0 = new h.a.a.c
            r1 = 10
            r0.<init>(r1)
            java.lang.String r1 = "SELECT name FROM sqlite_master WHERE type = 'trigger'"
            android.database.Cursor r1 = r4.mo8242b(r1)
            java.lang.String r2 = "db.query(\"SELECT name FR… WHERE type = 'trigger'\")"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
        L_0x0012:
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x0021
            r2 = 0
            java.lang.String r2 = r1.getString(r2)     // Catch:{ all -> 0x005a }
            r0.add(r2)     // Catch:{ all -> 0x005a }
            goto L_0x0012
        L_0x0021:
            r2 = 0
            p5462h.p5472e.C69598b.m101013a(r1, r2)
            java.util.List r0 = p5462h.p5463a.C69540x.m100943a(r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x002d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0059
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "triggerName"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            java.lang.String r2 = "room_fts_content_sync_"
            boolean r2 = p5462h.p5483m.C69764m.m101234m(r1, r2)
            if (r2 == 0) goto L_0x002d
            r2 = r4
            androidx.q.a.a.d r2 = (androidx.p186q.p187a.p188a.C4035d) r2
            android.database.sqlite.SQLiteDatabase r2 = r2.f12902a
            java.lang.String r3 = "DROP TRIGGER IF EXISTS "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r1 = r3.concat(r1)
            r2.execSQL(r1)
            goto L_0x002d
        L_0x0059:
            return
        L_0x005a:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x005c }
        L_0x005c:
            r0 = move-exception
            p5462h.p5472e.C69598b.m101013a(r1, r4)
            goto L_0x0062
        L_0x0061:
            throw r0
        L_0x0062:
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p182p.p185c.C3940b.m11294b(androidx.q.a.d):void");
    }
}
