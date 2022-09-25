package com.google.android.apps.gsa.staticplugins.p7864du.p7866b;

import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.du.b.bs */
/* compiled from: PG */
final class C100167bs {

    /* renamed from: a */
    private static final C59071e f280097a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.du.b.bs");

    /* JADX WARNING: Code restructure failed: missing block: B:153:0x039e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03dd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03de, code lost:
        r2 = r0;
        r1 = r20;
        r3 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03e5, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03e6, code lost:
        r1 = r20;
        r3 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0437, code lost:
        r32.mo103754e(com.google.android.apps.gsa.tasks.C118522by.TRIM_FROM_DISK, com.google.android.apps.gsa.tasks.C118472ag.f328819i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0441, code lost:
        r2 = f280097a.mo56225c();
        r2.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, r3);
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r0)).mo56372aa(33222)).mo56386p("Unknown exception within transaction");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0466, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0468, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0469, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:?, code lost:
        r0 = f280097a.mo56225c();
        r0.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, r3);
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r2)).mo56372aa(33223)).mo56386p(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x048a, code lost:
        com.google.android.apps.gsa.p8885y.C118837d.m197249c(r33, r34);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x048d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0149, code lost:
        r22 = r4;
        r20 = r5;
        r21 = r6;
        r17 = r9;
        r23 = r10;
        r0 = r14.f328393b;
        r4 = ((com.google.common.p4522b.C58724pq) r0).f156474d;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x015b, code lost:
        if (r5 >= r4) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x015d, code lost:
        r6 = (com.google.android.apps.gsa.store.C118333v) r0.get(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0165, code lost:
        if (r6.f328466c == null) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0168, code lost:
        r8 = r7.rawQuery("SELECT _ID FROM blob_table WHERE blob_key = ?", new java.lang.String[]{r6.f328465b});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x017a, code lost:
        if (r8.getCount() != 1) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x017c, code lost:
        r9 = r8.getColumnIndexOrThrow("_ID");
        r8.moveToNext();
        r9 = com.google.common.base.C58833ax.m90834k(java.lang.Long.valueOf(r8.getLong(r9)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0195, code lost:
        r8.close();
        r9 = com.google.common.base.C58836b.f156633a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x019e, code lost:
        if (r9.mo56113h() != false) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b4, code lost:
        if (com.google.android.apps.gsa.staticplugins.p7864du.p7866b.C100145ax.m165970a(r7, ((java.lang.Long) r9.mo56107c()).longValue(), r6.f328464a) != false) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01b7, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:171:0x03eb, B:194:0x0462, B:199:0x046a] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03dd A[ExcHandler: all (r0v45 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r20 r21 
      PHI: (r20v4 java.lang.String) = (r20v6 java.lang.String), (r20v8 java.lang.String), (r20v8 java.lang.String), (r20v8 java.lang.String), (r20v8 java.lang.String), (r20v8 java.lang.String), (r20v8 java.lang.String), (r20v8 java.lang.String), (r20v8 java.lang.String), (r20v8 java.lang.String), (r20v8 java.lang.String), (r20v10 java.lang.String), (r20v10 java.lang.String), (r20v13 java.lang.String), (r20v13 java.lang.String), (r20v13 java.lang.String), (r20v13 java.lang.String), (r20v13 java.lang.String), (r20v13 java.lang.String), (r20v13 java.lang.String), (r20v13 java.lang.String) binds: [B:14:0x0039, B:146:0x037b, B:155:0x03a0, B:147:?, B:149:0x037e, B:150:?, B:92:0x01d1, B:134:0x0352, B:139:0x035a, B:135:?, B:114:0x027a, B:72:0x0176, B:76:0x0191, B:26:0x0075, B:27:?, B:53:0x00fd, B:55:0x0101, B:38:0x00b1, B:40:0x00c8, B:43:0x00ce, B:31:0x008a] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r21v4 java.lang.String) = (r21v5 java.lang.String), (r21v7 java.lang.String), (r21v7 java.lang.String), (r21v7 java.lang.String), (r21v7 java.lang.String), (r21v7 java.lang.String), (r21v7 java.lang.String), (r21v7 java.lang.String), (r21v7 java.lang.String), (r21v7 java.lang.String), (r21v7 java.lang.String), (r21v9 java.lang.String), (r21v9 java.lang.String), (r21v12 java.lang.String), (r21v12 java.lang.String), (r21v12 java.lang.String), (r21v12 java.lang.String), (r21v12 java.lang.String), (r21v12 java.lang.String), (r21v12 java.lang.String), (r21v12 java.lang.String) binds: [B:14:0x0039, B:146:0x037b, B:155:0x03a0, B:147:?, B:149:0x037e, B:150:?, B:92:0x01d1, B:134:0x0352, B:139:0x035a, B:135:?, B:114:0x027a, B:72:0x0176, B:76:0x0191, B:26:0x0075, B:27:?, B:53:0x00fd, B:55:0x0101, B:38:0x00b1, B:40:0x00c8, B:43:0x00ce, B:31:0x008a] A[DONT_GENERATE, DONT_INLINE], Splitter:B:38:0x00b1] */
    /* JADX WARNING: Removed duplicated region for block: B:182:? A[ExcHandler: SQLiteDatabaseCorruptException | SQLiteDiskIOException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:171:0x03eb] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0437 A[Catch:{ all -> 0x0493 }] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0441 A[Catch:{ all -> 0x0493 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:194:0x0462=Splitter:B:194:0x0462, B:171:0x03eb=Splitter:B:171:0x03eb} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Boolean m165993a(com.google.android.apps.gsa.staticplugins.p7864du.p7866b.C100125ad r27, com.google.android.libraries.p1730f.C21370a r28, com.google.android.apps.gsa.store.C118309ag[] r29, com.google.android.apps.gsa.staticplugins.p7864du.p7866b.C100180f r30, com.google.android.apps.gsa.staticplugins.p7864du.p7866b.C100181g r31, com.google.android.apps.gsa.tasks.C118561t r32, com.google.android.apps.gsa.p8885y.p8886a.C118831d r33, long r34) {
        /*
            r0 = r29
            r1 = r31
            java.lang.String r2 = "Error during delete"
            java.lang.String r3 = "Error during insert"
            java.lang.String r4 = "Error during delete all"
            java.lang.String r5 = "Unknown exception in endTransaction"
            java.lang.String r6 = "SqliteOperations"
            android.database.sqlite.SQLiteDatabase r7 = r27.mo91758b()
            r8 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r8)
            if (r7 == 0) goto L_0x04db
            boolean r10 = r7.isOpen()
            if (r10 != 0) goto L_0x0021
            goto L_0x04db
        L_0x0021:
            boolean r10 = r7.isReadOnly()
            if (r10 == 0) goto L_0x0028
            return r9
        L_0x0028:
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r11 = r28.mo26870b()
            long r10 = r10.toSeconds(r11)
            r7.beginTransaction()     // Catch:{ SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException -> 0x04db, Exception -> 0x04c5 }
            int r9 = r0.length     // Catch:{ d -> 0x042b, all -> 0x0426 }
            r12 = 0
        L_0x0037:
            if (r12 >= r9) goto L_0x03d0
            r14 = r0[r12]     // Catch:{ d -> 0x03c7, all -> 0x03c1 }
            int r15 = r14.f328395d     // Catch:{ d -> 0x03c7, all -> 0x03c1 }
            r8 = 4
            java.lang.String r13 = "blob_table"
            if (r15 != r8) goto L_0x01c2
            com.google.common.b.gu r8 = r14.f328393b     // Catch:{ d -> 0x042b, all -> 0x03c1 }
            r15 = r8
            com.google.common.b.pq r15 = (com.google.common.p4522b.C58724pq) r15     // Catch:{ d -> 0x042b, all -> 0x03c1 }
            int r15 = r15.f156474d     // Catch:{ d -> 0x042b, all -> 0x03c1 }
            r0 = 0
        L_0x004a:
            if (r0 >= r15) goto L_0x0149
            java.lang.Object r17 = r8.get(r0)     // Catch:{ d -> 0x042b, all -> 0x03c1 }
            r18 = r8
            r8 = r17
            com.google.android.apps.gsa.store.v r8 = (com.google.android.apps.gsa.store.C118333v) r8     // Catch:{ d -> 0x042b, all -> 0x03c1 }
            r17 = r9
            byte[] r9 = r8.f328466c     // Catch:{ d -> 0x042b, all -> 0x03c1 }
            if (r9 != 0) goto L_0x0068
            r22 = r4
            r20 = r5
            r21 = r6
            r23 = r10
            r19 = r15
            goto L_0x0116
        L_0x0068:
            r19 = r15
            android.content.ContentValues r15 = new android.content.ContentValues     // Catch:{ d -> 0x042b, all -> 0x03c1 }
            r15.<init>()     // Catch:{ d -> 0x042b, all -> 0x03c1 }
            r20 = r5
            java.lang.String r5 = "blob_key"
            r21 = r6
            java.lang.String r6 = r8.f328465b     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r15.put(r5, r6)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            long r5 = r8.f328467d     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r22 = r4
            java.lang.String r4 = "expire"
            r23 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r25 = (r5 > r23 ? 1 : (r5 == r23 ? 0 : -1))
            if (r25 == 0) goto L_0x0092
            long r5 = r5 + r10
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r15.put(r4, r5)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            goto L_0x0099
        L_0x0092:
            java.lang.Long r5 = java.lang.Long.valueOf(r23)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r15.put(r4, r5)     // Catch:{ d -> 0x0371, all -> 0x03dd }
        L_0x0099:
            java.lang.String r4 = "size_b"
            int r5 = r9.length     // Catch:{ d -> 0x0371, all -> 0x03dd }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r15.put(r4, r5)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r4 = r30
            java.io.File r5 = r4.mo91742a(r8)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            java.lang.String r6 = "blob_path"
            java.lang.String r4 = "blob"
            if (r5 == 0) goto L_0x00f3
            r23 = r10
        L_0x00b1:
            java.io.File r10 = r1.mo91784b(r5)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r25 = r5
            r11 = 1
            java.lang.String[] r5 = new java.lang.String[r11]     // Catch:{ d -> 0x0371, all -> 0x03dd }
            java.lang.String r11 = r10.getAbsolutePath()     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r26 = 0
            r5[r26] = r11     // Catch:{ d -> 0x0371, all -> 0x03dd }
            java.lang.String r11 = "SELECT _ID FROM blob_table WHERE blob_path = ?"
            android.database.Cursor r5 = r7.rawQuery(r11, r5)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            int r11 = r5.getCount()     // Catch:{ all -> 0x00ed }
            if (r11 != 0) goto L_0x00e7
            r5.close()     // Catch:{ d -> 0x0371, all -> 0x03dd }
            boolean r5 = r1.mo91786d(r10, r9)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            if (r5 == 0) goto L_0x01a0
            r5 = 0
            r9 = r5
            byte[] r9 = (byte[]) r9     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r15.put(r4, r5)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            java.lang.String r4 = r10.getAbsolutePath()     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r15.put(r6, r4)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r4 = 0
            goto L_0x00fc
        L_0x00e7:
            r5.close()     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r5 = r25
            goto L_0x00b1
        L_0x00ed:
            r0 = move-exception
            r1 = r0
            r5.close()     // Catch:{ d -> 0x0371, all -> 0x03dd }
            throw r1     // Catch:{ d -> 0x0371, all -> 0x03dd }
        L_0x00f3:
            r23 = r10
            r15.put(r4, r9)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r4 = 0
            r15.put(r6, r4)     // Catch:{ d -> 0x0371, all -> 0x03dd }
        L_0x00fc:
            r5 = 5
            long r5 = r7.insertWithOnConflict(r13, r4, r15, r5)     // Catch:{ Exception -> 0x0128, all -> 0x03dd }
            r15.clear()     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r9 = -1
            int r4 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x010c
            goto L_0x01a0
        L_0x010c:
            java.util.ArrayList r4 = r8.f328464a     // Catch:{ d -> 0x0371, all -> 0x03dd }
            boolean r4 = com.google.android.apps.gsa.staticplugins.p7864du.p7866b.C100145ax.m165970a(r7, r5, r4)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            if (r4 != 0) goto L_0x0116
            goto L_0x01a0
        L_0x0116:
            int r0 = r0 + 1
            r9 = r17
            r8 = r18
            r15 = r19
            r5 = r20
            r6 = r21
            r4 = r22
            r10 = r23
            goto L_0x004a
        L_0x0128:
            r0 = move-exception
            r1 = r0
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.p7864du.p7866b.C100145ax.f280032a     // Catch:{ d -> 0x0371, all -> 0x03dd }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r2 = 33215(0x81bf, float:4.6544E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r1)).mo56372aa(r2)).mo56386p(r3)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            com.google.android.apps.gsa.store.d r0 = new com.google.android.apps.gsa.store.d     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r0.<init>(r3, r1)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            throw r0     // Catch:{ d -> 0x0371, all -> 0x03dd }
        L_0x013c:
            r0 = move-exception
            r2 = r0
            r3 = r6
            r1 = r20
            goto L_0x0495
        L_0x0143:
            r0 = move-exception
            r3 = r6
            r1 = r20
            goto L_0x042e
        L_0x0149:
            r22 = r4
            r20 = r5
            r21 = r6
            r17 = r9
            r23 = r10
            com.google.common.b.gu r0 = r14.f328393b     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r4 = r0
            com.google.common.b.pq r4 = (com.google.common.p4522b.C58724pq) r4     // Catch:{ d -> 0x0371, all -> 0x03dd }
            int r4 = r4.f156474d     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r5 = 0
        L_0x015b:
            if (r5 >= r4) goto L_0x01bf
            java.lang.Object r6 = r0.get(r5)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            com.google.android.apps.gsa.store.v r6 = (com.google.android.apps.gsa.store.C118333v) r6     // Catch:{ d -> 0x0371, all -> 0x03dd }
            byte[] r8 = r6.f328466c     // Catch:{ d -> 0x0371, all -> 0x03dd }
            if (r8 == 0) goto L_0x0168
            goto L_0x01b7
        L_0x0168:
            java.lang.String r8 = r6.f328465b     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r9 = 1
            java.lang.String[] r10 = new java.lang.String[r9]     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r11 = 0
            r10[r11] = r8     // Catch:{ d -> 0x0371, all -> 0x03dd }
            java.lang.String r8 = "SELECT _ID FROM blob_table WHERE blob_key = ?"
            android.database.Cursor r8 = r7.rawQuery(r8, r10)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            int r10 = r8.getCount()     // Catch:{ all -> 0x01ba }
            if (r10 != r9) goto L_0x0195
            java.lang.String r9 = "_ID"
            int r9 = r8.getColumnIndexOrThrow(r9)     // Catch:{ all -> 0x01ba }
            r8.moveToNext()     // Catch:{ all -> 0x01ba }
            long r9 = r8.getLong(r9)     // Catch:{ all -> 0x01ba }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x01ba }
            com.google.common.base.ax r9 = com.google.common.base.C58833ax.m90834k(r9)     // Catch:{ all -> 0x01ba }
            r8.close()     // Catch:{ d -> 0x0371, all -> 0x03dd }
            goto L_0x019a
        L_0x0195:
            r8.close()     // Catch:{ d -> 0x0371, all -> 0x03dd }
            com.google.common.base.b r9 = com.google.common.base.C58836b.f156633a     // Catch:{ d -> 0x0371, all -> 0x03dd }
        L_0x019a:
            boolean r8 = r9.mo56113h()     // Catch:{ d -> 0x0371, all -> 0x03dd }
            if (r8 != 0) goto L_0x01a4
        L_0x01a0:
            r5 = 0
            r13 = 0
            goto L_0x03d7
        L_0x01a4:
            java.lang.Object r8 = r9.mo56107c()     // Catch:{ d -> 0x0371, all -> 0x03dd }
            java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ d -> 0x0371, all -> 0x03dd }
            long r8 = r8.longValue()     // Catch:{ d -> 0x0371, all -> 0x03dd }
            java.util.ArrayList r6 = r6.f328464a     // Catch:{ d -> 0x0371, all -> 0x03dd }
            boolean r6 = com.google.android.apps.gsa.staticplugins.p7864du.p7866b.C100145ax.m165970a(r7, r8, r6)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            if (r6 != 0) goto L_0x01b7
            goto L_0x01a0
        L_0x01b7:
            int r5 = r5 + 1
            goto L_0x015b
        L_0x01ba:
            r0 = move-exception
            r8.close()     // Catch:{ d -> 0x0371, all -> 0x03dd }
            throw r0     // Catch:{ d -> 0x0371, all -> 0x03dd }
        L_0x01bf:
            r5 = 0
            goto L_0x038b
        L_0x01c2:
            r22 = r4
            r20 = r5
            r21 = r6
            r17 = r9
            r23 = r10
            java.lang.String r4 = "DeleteOperation"
            r0 = 1
            if (r15 != r0) goto L_0x0378
            com.google.common.b.gu r0 = r14.f328394c     // Catch:{ d -> 0x0371, all -> 0x03dd }
            boolean r0 = r0.isEmpty()     // Catch:{ d -> 0x0371, all -> 0x03dd }
            if (r0 != 0) goto L_0x0239
            com.google.common.b.gp r0 = com.google.common.p4522b.C58485gu.m89837e()     // Catch:{ d -> 0x0371, all -> 0x03dd }
            com.google.common.b.gu r5 = r14.f328394c     // Catch:{ d -> 0x0371, all -> 0x03dd }
            com.google.common.base.ah r6 = com.google.android.apps.gsa.store.C118308af.f328391f     // Catch:{ d -> 0x0371, all -> 0x03dd }
            java.util.List r5 = com.google.common.p4522b.C58597ky.m90217h(r5, r6)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            com.google.android.apps.gsa.store.r r5 = com.google.android.apps.gsa.store.C118328s.m196513e(r5)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            com.google.common.b.gu r5 = r5.f328453a     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r6 = 0
            com.google.common.b.sm r5 = r5.listIterator(r6)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r6 = 999(0x3e7, float:1.4E-42)
            com.google.common.b.sl r5 = com.google.common.p4522b.C58570jy.m90170v(r5, r6)     // Catch:{ d -> 0x0371, all -> 0x03dd }
        L_0x01f6:
            boolean r6 = r5.hasNext()     // Catch:{ d -> 0x0371, all -> 0x03dd }
            if (r6 == 0) goto L_0x0233
            java.lang.Object r6 = r5.next()     // Catch:{ d -> 0x0371, all -> 0x03dd }
            java.util.List r6 = (java.util.List) r6     // Catch:{ d -> 0x0371, all -> 0x03dd }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r8.<init>()     // Catch:{ d -> 0x0371, all -> 0x03dd }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r9.<init>()     // Catch:{ d -> 0x0371, all -> 0x03dd }
            com.google.android.apps.gsa.store.r r6 = com.google.android.apps.gsa.store.C118328s.m196513e(r6)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            com.google.android.apps.gsa.store.r r6 = com.google.android.apps.gsa.store.C118328s.m196512d(r6)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r10 = 0
            com.google.android.apps.gsa.staticplugins.du.b.bj r6 = com.google.android.apps.gsa.staticplugins.p7864du.p7866b.C100164bp.m165989b(r6, r10)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            com.google.common.base.ax r10 = com.google.common.base.C58833ax.m90834k(r13)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            com.google.common.base.b r11 = com.google.common.base.C58836b.f156633a     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r6.mo91779a(r10, r11, r8, r9)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            com.google.android.apps.gsa.staticplugins.du.b.av r6 = new com.google.android.apps.gsa.staticplugins.du.b.av     // Catch:{ d -> 0x0371, all -> 0x03dd }
            java.lang.String r8 = r8.toString()     // Catch:{ d -> 0x0371, all -> 0x03dd }
            com.google.common.b.gu r9 = com.google.common.p4522b.C58485gu.m89842j(r9)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r6.<init>(r8, r9)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r0.mo55395g(r6)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            goto L_0x01f6
        L_0x0233:
            com.google.common.b.gu r0 = r0.mo55394f()     // Catch:{ d -> 0x0371, all -> 0x03dd }
            goto L_0x033a
        L_0x0239:
            java.lang.String r0 = "_ID IN ("
            com.google.android.apps.gsa.staticplugins.du.b.m r5 = new com.google.android.apps.gsa.staticplugins.du.b.m     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r5.<init>()     // Catch:{ d -> 0x0371, all -> 0x03dd }
            com.google.common.b.gu r6 = r14.f328392a     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r8 = r6
            com.google.common.b.pq r8 = (com.google.common.p4522b.C58724pq) r8     // Catch:{ d -> 0x0371, all -> 0x03dd }
            int r8 = r8.f156474d     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r9 = 0
            r10 = 0
            r16 = 0
        L_0x024b:
            if (r9 >= r8) goto L_0x0267
            java.lang.Object r11 = r6.get(r9)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            com.google.android.apps.gsa.store.r r11 = (com.google.android.apps.gsa.store.C118327r) r11     // Catch:{ d -> 0x0371, all -> 0x03dd }
            com.google.android.apps.gsa.store.r r10 = com.google.android.apps.gsa.store.C118328s.m196515g(r10, r11)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r5.mo91795c(r11)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            if (r16 != 0) goto L_0x0264
            boolean r11 = com.google.android.apps.gsa.staticplugins.p7864du.p7866b.C100144aw.m165969a(r11)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            if (r11 == 0) goto L_0x0264
            r16 = r13
        L_0x0264:
            int r9 = r9 + 1
            goto L_0x024b
        L_0x0267:
            android.util.SparseArray r6 = r5.f280211a     // Catch:{ d -> 0x0371, all -> 0x03dd }
            int r6 = r6.size()     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r8 = 24
            if (r6 > r8) goto L_0x0273
            r6 = 1
            goto L_0x0274
        L_0x0273:
            r6 = 0
        L_0x0274:
            com.google.common.base.C58838bb.m90883r(r6)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r10.getClass()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r6.<init>()     // Catch:{ d -> 0x0371, all -> 0x03dd }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r8.<init>()     // Catch:{ d -> 0x0371, all -> 0x03dd }
            com.google.android.apps.gsa.staticplugins.du.b.cb r9 = new com.google.android.apps.gsa.staticplugins.du.b.cb     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r9.<init>()     // Catch:{ d -> 0x0371, all -> 0x03dd }
            com.google.common.base.ax r11 = com.google.common.base.C58833ax.m90834k(r5)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r9.f280118c = r11     // Catch:{ d -> 0x0371, all -> 0x03dd }
            android.util.SparseArray r11 = r5.f280211a     // Catch:{ d -> 0x0371, all -> 0x03dd }
            int r11 = r11.size()     // Catch:{ d -> 0x0371, all -> 0x03dd }
            if (r11 <= 0) goto L_0x02da
            android.util.SparseArray r11 = r5.f280211a     // Catch:{ d -> 0x0371, all -> 0x03dd }
            int r11 = r11.size()     // Catch:{ d -> 0x0371, all -> 0x03dd }
            if (r11 <= 0) goto L_0x02a1
            r11 = 1
            goto L_0x02a2
        L_0x02a1:
            r11 = 0
        L_0x02a2:
            com.google.common.base.C58838bb.m90883r(r11)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r11 = 0
            int r14 = r5.mo91793a(r11)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            com.google.android.apps.gsa.store.a r11 = com.google.android.apps.gsa.store.C118302a.m196461a(r14)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            com.google.android.apps.gsa.store.r r11 = com.google.android.apps.gsa.store.C118328s.m196510b(r11)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r14 = r11
            r11 = 1
        L_0x02b4:
            android.util.SparseArray r15 = r5.f280211a     // Catch:{ d -> 0x0371, all -> 0x03dd }
            int r15 = r15.size()     // Catch:{ d -> 0x0371, all -> 0x03dd }
            if (r11 >= r15) goto L_0x02cf
            int r15 = r5.mo91793a(r11)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            com.google.android.apps.gsa.store.a r15 = com.google.android.apps.gsa.store.C118302a.m196461a(r15)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            com.google.android.apps.gsa.store.r r15 = com.google.android.apps.gsa.store.C118328s.m196510b(r15)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            com.google.android.apps.gsa.store.r r14 = r14.mo103664a(r15)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            int r11 = r11 + 1
            goto L_0x02b4
        L_0x02cf:
            com.google.android.apps.gsa.store.r r10 = r14.mo103664a(r10)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            com.google.common.base.ax r10 = com.google.common.base.C58833ax.m90834k(r10)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r9.f280117b = r10     // Catch:{ d -> 0x0371, all -> 0x03dd }
            goto L_0x02e0
        L_0x02da:
            com.google.common.base.ax r10 = com.google.common.base.C58833ax.m90834k(r10)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r9.f280117b = r10     // Catch:{ d -> 0x0371, all -> 0x03dd }
        L_0x02e0:
            if (r16 == 0) goto L_0x02fc
            com.google.common.base.ax r5 = com.google.common.base.C58833ax.m90834k(r16)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r9.f280119d = r5     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r5 = 1
            com.google.android.apps.gsa.store.y[] r10 = new com.google.android.apps.gsa.store.C118336y[r5]     // Catch:{ d -> 0x0371, all -> 0x03dd }
            com.google.android.apps.gsa.store.y r11 = com.google.android.apps.gsa.store.C118308af.f328388c     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r14 = 0
            r10[r14] = r11     // Catch:{ d -> 0x0371, all -> 0x03dd }
            java.util.List r10 = java.util.Arrays.asList(r10)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            com.google.android.apps.gsa.store.r r10 = com.google.android.apps.gsa.store.C118328s.m196513e(r10)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r9.mo91782b(r10, r5)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            goto L_0x031a
        L_0x02fc:
            r10 = 1
            com.google.android.apps.gsa.store.y[] r11 = new com.google.android.apps.gsa.store.C118336y[r10]     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r10 = 0
            int r5 = r5.mo91793a(r10)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            com.google.android.apps.gsa.store.a r5 = com.google.android.apps.gsa.store.C118302a.m196461a(r5)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            com.google.android.apps.gsa.store.y r5 = com.google.android.apps.gsa.store.C118308af.m196467a(r5)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r11[r10] = r5     // Catch:{ d -> 0x0371, all -> 0x03dd }
            java.util.List r5 = java.util.Arrays.asList(r11)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            com.google.android.apps.gsa.store.r r5 = com.google.android.apps.gsa.store.C118328s.m196513e(r5)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r10 = 1
            r9.mo91782b(r5, r10)     // Catch:{ d -> 0x0371, all -> 0x03dd }
        L_0x031a:
            r6.append(r0)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            java.lang.String r0 = r9.mo91781a(r8)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r6.append(r0)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            java.lang.String r0 = ")"
            r6.append(r0)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            com.google.android.apps.gsa.staticplugins.du.b.av r0 = new com.google.android.apps.gsa.staticplugins.du.b.av     // Catch:{ d -> 0x0371, all -> 0x03dd }
            java.lang.String r5 = r6.toString()     // Catch:{ d -> 0x0371, all -> 0x03dd }
            com.google.common.b.gu r6 = com.google.common.p4522b.C58485gu.m89842j(r8)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r0.<init>(r5, r6)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89846n(r0)     // Catch:{ d -> 0x0371, all -> 0x03dd }
        L_0x033a:
            r5 = r0
            com.google.common.b.pq r5 = (com.google.common.p4522b.C58724pq) r5     // Catch:{ d -> 0x0371, all -> 0x03dd }
            int r5 = r5.f156474d     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r6 = 0
        L_0x0340:
            if (r6 >= r5) goto L_0x01bf
            java.lang.Object r8 = r0.get(r6)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            com.google.android.apps.gsa.staticplugins.du.b.av r8 = (com.google.android.apps.gsa.staticplugins.p7864du.p7866b.C100143av) r8     // Catch:{ d -> 0x0371, all -> 0x03dd }
            java.lang.String r9 = r8.f280029a     // Catch:{ d -> 0x0371, all -> 0x03dd }
            com.google.common.b.gu r8 = r8.f280030b     // Catch:{ d -> 0x0371, all -> 0x03dd }
            java.lang.String[] r8 = com.google.android.apps.gsa.store.C118308af.m196480n(r8)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r7.delete(r13, r9, r8)     // Catch:{ Exception -> 0x0358, all -> 0x03dd }
            int r6 = r6 + 1
            goto L_0x0340
        L_0x0358:
            r0 = move-exception
            r1 = r0
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.p7864du.p7866b.C100144aw.f280031a     // Catch:{ d -> 0x0371, all -> 0x03dd }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ d -> 0x0371, all -> 0x03dd }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r0.mo56378ag(r3, r4)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r3 = 33214(0x81be, float:4.6543E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r1)).mo56372aa(r3)).mo56386p(r2)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            com.google.android.apps.gsa.store.d r0 = new com.google.android.apps.gsa.store.d     // Catch:{ d -> 0x0371, all -> 0x03dd }
            r0.<init>(r2, r1)     // Catch:{ d -> 0x0371, all -> 0x03dd }
            throw r0     // Catch:{ d -> 0x0371, all -> 0x03dd }
        L_0x0371:
            r0 = move-exception
            r1 = r20
            r3 = r21
            goto L_0x042e
        L_0x0378:
            r0 = 2
            if (r15 != r0) goto L_0x03b9
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ Exception -> 0x039e, all -> 0x03dd }
            r5 = 0
            java.lang.String[] r0 = new java.lang.String[r5]     // Catch:{ Exception -> 0x039c, all -> 0x03dd }
            r6 = 0
            r7.delete(r13, r6, r0)     // Catch:{ Exception -> 0x039c, all -> 0x03dd }
            java.lang.String r0 = "attribute_table"
            java.lang.String[] r8 = new java.lang.String[r5]     // Catch:{ Exception -> 0x039c, all -> 0x03dd }
            r7.delete(r0, r6, r8)     // Catch:{ Exception -> 0x039c, all -> 0x03dd }
        L_0x038b:
            int r12 = r12 + 1
            r0 = r29
            r9 = r17
            r5 = r20
            r6 = r21
            r4 = r22
            r10 = r23
            r8 = 0
            goto L_0x0037
        L_0x039c:
            r0 = move-exception
            goto L_0x03a0
        L_0x039e:
            r0 = move-exception
            r5 = 0
        L_0x03a0:
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.p7864du.p7866b.C100144aw.f280031a     // Catch:{ d -> 0x03e5, all -> 0x03dd }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ d -> 0x03e5, all -> 0x03dd }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ d -> 0x03e5, all -> 0x03dd }
            r1.mo56378ag(r2, r4)     // Catch:{ d -> 0x03e5, all -> 0x03dd }
            r2 = 33212(0x81bc, float:4.654E-41)
            r3 = r22
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r2)).mo56386p(r3)     // Catch:{ d -> 0x03e5, all -> 0x03dd }
            com.google.android.apps.gsa.store.d r1 = new com.google.android.apps.gsa.store.d     // Catch:{ d -> 0x03e5, all -> 0x03dd }
            r1.<init>(r3, r0)     // Catch:{ d -> 0x03e5, all -> 0x03dd }
            throw r1     // Catch:{ d -> 0x03e5, all -> 0x03dd }
        L_0x03b9:
            r5 = 0
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ d -> 0x03e5, all -> 0x03dd }
            r0.<init>()     // Catch:{ d -> 0x03e5, all -> 0x03dd }
            r0 = 0
            throw r0     // Catch:{ d -> 0x03e5, all -> 0x03dd }
        L_0x03c1:
            r0 = move-exception
            r2 = r0
            r1 = r5
            r3 = r6
            goto L_0x0495
        L_0x03c7:
            r0 = move-exception
            r20 = r5
            r5 = 0
            r3 = r6
            r1 = r20
            goto L_0x042f
        L_0x03d0:
            r20 = r5
            r21 = r6
            r5 = 0
            r10 = 1
            r13 = 1
        L_0x03d7:
            if (r13 == 0) goto L_0x03eb
            r7.setTransactionSuccessful()     // Catch:{ d -> 0x03e5, all -> 0x03dd }
            goto L_0x03eb
        L_0x03dd:
            r0 = move-exception
            r2 = r0
            r1 = r20
            r3 = r21
            goto L_0x0495
        L_0x03e5:
            r0 = move-exception
            r1 = r20
            r3 = r21
            goto L_0x042f
        L_0x03eb:
            r7.endTransaction()     // Catch:{ SQLiteDatabaseCorruptException | SQLiteDiskIOException -> 0x0420, Exception -> 0x03f6 }
            com.google.android.apps.gsa.p8885y.C118837d.m197249c(r33, r34)
            r8 = r13
            goto L_0x048e
        L_0x03f4:
            r0 = move-exception
            goto L_0x041c
        L_0x03f6:
            r0 = move-exception
            r1 = r0
            com.google.common.f.e r0 = f280097a     // Catch:{ all -> 0x03f4 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x03f4 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x03f4 }
            r3 = r21
            r0.mo56378ag(r2, r3)     // Catch:{ all -> 0x03f4 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x03f4 }
            com.google.common.f.x r0 = r0.mo56382g(r1)     // Catch:{ all -> 0x03f4 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x03f4 }
            r1 = 33221(0x81c5, float:4.6553E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ all -> 0x03f4 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x03f4 }
            r1 = r20
            r0.mo56386p(r1)     // Catch:{ all -> 0x03f4 }
            goto L_0x0420
        L_0x041c:
            com.google.android.apps.gsa.p8885y.C118837d.m197249c(r33, r34)
            throw r0
        L_0x0420:
            com.google.android.apps.gsa.p8885y.C118837d.m197249c(r33, r34)
            r8 = 0
            goto L_0x048e
        L_0x0426:
            r0 = move-exception
            r1 = r5
            r3 = r6
        L_0x0429:
            r2 = r0
            goto L_0x0495
        L_0x042b:
            r0 = move-exception
            r1 = r5
            r3 = r6
        L_0x042e:
            r5 = 0
        L_0x042f:
            java.lang.Throwable r2 = r0.getCause()     // Catch:{ all -> 0x0493 }
            boolean r2 = r2 instanceof android.database.sqlite.SQLiteFullException     // Catch:{ all -> 0x0493 }
            if (r2 == 0) goto L_0x0441
            com.google.android.apps.gsa.tasks.by r0 = com.google.android.apps.gsa.tasks.C118522by.TRIM_FROM_DISK     // Catch:{ all -> 0x0493 }
            com.google.android.apps.gsa.tasks.ag r2 = com.google.android.apps.gsa.tasks.C118472ag.f328819i     // Catch:{ all -> 0x0493 }
            r4 = r32
            r4.mo103754e(r0, r2)     // Catch:{ all -> 0x0493 }
            goto L_0x0462
        L_0x0441:
            com.google.common.f.e r2 = f280097a     // Catch:{ all -> 0x0493 }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ all -> 0x0493 }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0493 }
            r2.mo56378ag(r4, r3)     // Catch:{ all -> 0x0493 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0493 }
            com.google.common.f.x r0 = r2.mo56382g(r0)     // Catch:{ all -> 0x0493 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0493 }
            r2 = 33222(0x81c6, float:4.6554E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)     // Catch:{ all -> 0x0493 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0493 }
            java.lang.String r2 = "Unknown exception within transaction"
            r0.mo56386p(r2)     // Catch:{ all -> 0x0493 }
        L_0x0462:
            r7.endTransaction()     // Catch:{ SQLiteDatabaseCorruptException | SQLiteDiskIOException -> 0x0420, SQLiteDatabaseCorruptException | SQLiteDiskIOException -> 0x0420, Exception -> 0x0468 }
            goto L_0x0420
        L_0x0466:
            r0 = move-exception
            goto L_0x048a
        L_0x0468:
            r0 = move-exception
            r2 = r0
            com.google.common.f.e r0 = f280097a     // Catch:{ all -> 0x0466 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x0466 }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0466 }
            r0.mo56378ag(r4, r3)     // Catch:{ all -> 0x0466 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0466 }
            com.google.common.f.x r0 = r0.mo56382g(r2)     // Catch:{ all -> 0x0466 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0466 }
            r2 = 33223(0x81c7, float:4.6555E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)     // Catch:{ all -> 0x0466 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0466 }
            r0.mo56386p(r1)     // Catch:{ all -> 0x0466 }
            goto L_0x0420
        L_0x048a:
            com.google.android.apps.gsa.p8885y.C118837d.m197249c(r33, r34)
            throw r0
        L_0x048e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            return r0
        L_0x0493:
            r0 = move-exception
            goto L_0x0429
        L_0x0495:
            r7.endTransaction()     // Catch:{ SQLiteDatabaseCorruptException | SQLiteDiskIOException -> 0x0498, Exception -> 0x049e }
        L_0x0498:
            com.google.android.apps.gsa.p8885y.C118837d.m197249c(r33, r34)
            goto L_0x04c4
        L_0x049c:
            r0 = move-exception
            goto L_0x04c0
        L_0x049e:
            r0 = move-exception
            r4 = r0
            com.google.common.f.e r0 = f280097a     // Catch:{ all -> 0x049c }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x049c }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x049c }
            r0.mo56378ag(r5, r3)     // Catch:{ all -> 0x049c }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x049c }
            com.google.common.f.x r0 = r0.mo56382g(r4)     // Catch:{ all -> 0x049c }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x049c }
            r3 = 33224(0x81c8, float:4.6557E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r3)     // Catch:{ all -> 0x049c }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x049c }
            r0.mo56386p(r1)     // Catch:{ all -> 0x049c }
            goto L_0x0498
        L_0x04c0:
            com.google.android.apps.gsa.p8885y.C118837d.m197249c(r33, r34)
            throw r0
        L_0x04c4:
            throw r2
        L_0x04c5:
            r0 = move-exception
            r3 = r6
            r1 = r0
            com.google.common.f.e r0 = f280097a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r2, r3)
            java.lang.String r2 = "Unknown exception in beginTransaction"
            r3 = 33225(0x81c9, float:4.6558E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r1)).mo56372aa(r3)).mo56386p(r2)
        L_0x04db:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7864du.p7866b.C100167bs.m165993a(com.google.android.apps.gsa.staticplugins.du.b.ad, com.google.android.libraries.f.a, com.google.android.apps.gsa.store.ag[], com.google.android.apps.gsa.staticplugins.du.b.f, com.google.android.apps.gsa.staticplugins.du.b.g, com.google.android.apps.gsa.tasks.t, com.google.android.apps.gsa.y.a.d, long):java.lang.Boolean");
    }
}
