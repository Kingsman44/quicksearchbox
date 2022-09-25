package com.google.android.libraries.social.populous.storage;

import com.google.android.libraries.social.populous.logging.C42591z;

/* renamed from: com.google.android.libraries.social.populous.storage.ae */
/* compiled from: PG */
final class C42604ae {

    /* renamed from: a */
    public final C42591z f111794a;

    /* renamed from: b */
    private final C42682db f111795b;

    public C42604ae(C42591z zVar, C42682db dbVar) {
        this.f111794a = zVar;
        this.f111795b = dbVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:29|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        throw r15;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00ce */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45706a(androidx.p186q.p187a.C4049d r15) {
        /*
            r14 = this;
            com.google.android.libraries.social.populous.logging.z r0 = r14.f111794a
            r1 = 0
            if (r0 != 0) goto L_0x0007
            r0 = r1
            goto L_0x000b
        L_0x0007:
            com.google.common.base.ci r0 = r0.mo45632b()
        L_0x000b:
            r2 = r15
            androidx.q.a.a.d r2 = (androidx.p186q.p187a.p188a.C4035d) r2
            android.database.sqlite.SQLiteDatabase r3 = r2.f12902a
            java.lang.String r4 = "DROP TABLE Tokens"
            r3.execSQL(r4)
            android.database.sqlite.SQLiteDatabase r3 = r2.f12902a
            java.lang.String r4 = "CREATE VIRTUAL TABLE IF NOT EXISTS `Tokens` USING FTS4(`contact_id` INTEGER NOT NULL, `value` TEXT, `affinity` REAL NOT NULL, `field_type` TEXT, tokenize=unicode61 `tokenchars=@.-`, notindexed=`contact_id`, notindexed=`affinity`, notindexed=`field_type`, prefix=`1`)"
            r3.execSQL(r4)
            androidx.q.a.b r3 = new androidx.q.a.b
            java.lang.String r4 = "SELECT * FROM Contacts ORDER BY id ASC"
            r3.<init>(r4, r1)
            android.database.Cursor r3 = r15.mo8241a(r3)     // Catch:{ ct -> 0x00cf }
            r4 = 1
            java.lang.String r5 = "id"
            int r5 = r3.getColumnIndex(r5)     // Catch:{ all -> 0x00b0 }
            java.lang.String r6 = "proto_bytes"
            int r6 = r3.getColumnIndex(r6)     // Catch:{ all -> 0x00b0 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x00b0 }
            r7.<init>()     // Catch:{ all -> 0x00b0 }
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ all -> 0x00b0 }
            r8.<init>()     // Catch:{ all -> 0x00b0 }
        L_0x003e:
            boolean r9 = r3.moveToNext()     // Catch:{ all -> 0x00b0 }
            if (r9 == 0) goto L_0x00aa
            boolean r9 = r3.isNull(r6)     // Catch:{ all -> 0x00b0 }
            if (r9 != 0) goto L_0x003e
            long r9 = r3.getLong(r5)     // Catch:{ all -> 0x00b0 }
            byte[] r11 = r3.getBlob(r6)     // Catch:{ all -> 0x00b0 }
            com.google.protobuf.ba r12 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ all -> 0x00b0 }
            com.google.bi.i r13 = com.google.p4181bi.C55847i.f147358c     // Catch:{ all -> 0x00b0 }
            com.google.protobuf.bv r11 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r13, (byte[]) r11, (com.google.protobuf.C62921ba) r12)     // Catch:{ all -> 0x00b0 }
            com.google.bi.i r11 = (com.google.p4181bi.C55847i) r11     // Catch:{ all -> 0x00b0 }
            com.google.android.libraries.social.populous.storage.db r12 = r14.f111795b     // Catch:{ all -> 0x00b0 }
            r12.mo45782a(r7, r9, r11)     // Catch:{ all -> 0x00b0 }
            java.util.Iterator r9 = r7.iterator()     // Catch:{ all -> 0x00b0 }
        L_0x0067:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x00b0 }
            if (r10 == 0) goto L_0x00a6
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x00b0 }
            com.google.android.libraries.social.populous.storage.da r10 = (com.google.android.libraries.social.populous.storage.C42681da) r10     // Catch:{ all -> 0x00b0 }
            java.lang.String r11 = "contact_id"
            long r12 = r10.f111896a     // Catch:{ all -> 0x00b0 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x00b0 }
            r8.put(r11, r12)     // Catch:{ all -> 0x00b0 }
            java.lang.String r11 = "value"
            java.lang.String r12 = r10.f111897b     // Catch:{ all -> 0x00b0 }
            r8.put(r11, r12)     // Catch:{ all -> 0x00b0 }
            java.lang.String r11 = "affinity"
            double r12 = r10.f111898c     // Catch:{ all -> 0x00b0 }
            java.lang.Double r12 = java.lang.Double.valueOf(r12)     // Catch:{ all -> 0x00b0 }
            r8.put(r11, r12)     // Catch:{ all -> 0x00b0 }
            java.lang.String r11 = "field_type"
            com.google.android.libraries.social.populous.storage.cv r10 = r10.f111899d     // Catch:{ all -> 0x00b0 }
            java.lang.String r10 = com.google.android.libraries.social.populous.storage.C42681da.m75377b(r10)     // Catch:{ all -> 0x00b0 }
            r8.put(r11, r10)     // Catch:{ all -> 0x00b0 }
            java.lang.String r10 = "Tokens"
            r11 = r15
            androidx.q.a.a.d r11 = (androidx.p186q.p187a.p188a.C4035d) r11     // Catch:{ all -> 0x00b0 }
            android.database.sqlite.SQLiteDatabase r11 = r11.f12902a     // Catch:{ all -> 0x00b0 }
            r11.insertWithOnConflict(r10, r1, r8, r4)     // Catch:{ all -> 0x00b0 }
            goto L_0x0067
        L_0x00a6:
            r7.clear()     // Catch:{ all -> 0x00b0 }
            goto L_0x003e
        L_0x00aa:
            if (r3 == 0) goto L_0x0106
            r3.close()     // Catch:{ ct -> 0x00cf }
            goto L_0x0106
        L_0x00b0:
            r15 = move-exception
            if (r3 == 0) goto L_0x00ce
            r3.close()     // Catch:{ all -> 0x00b7 }
            goto L_0x00ce
        L_0x00b7:
            r1 = move-exception
            java.lang.Class[] r3 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x00ce }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            r6 = 0
            r3[r6] = r5     // Catch:{ Exception -> 0x00ce }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            java.lang.String r7 = "addSuppressed"
            java.lang.reflect.Method r3 = r5.getDeclaredMethod(r7, r3)     // Catch:{ Exception -> 0x00ce }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x00ce }
            r4[r6] = r1     // Catch:{ Exception -> 0x00ce }
            r3.invoke(r15, r4)     // Catch:{ Exception -> 0x00ce }
        L_0x00ce:
            throw r15     // Catch:{ ct -> 0x00cf }
        L_0x00cf:
            r15 = move-exception
            java.lang.String r1 = "DatabaseMigrations"
            java.lang.String r3 = "Error parsing contact proto bytes."
            android.util.Log.e(r1, r3, r15)
            com.google.android.libraries.social.populous.logging.z r1 = r14.f111794a
            if (r1 == 0) goto L_0x00f1
            com.google.android.libraries.social.populous.logging.k r3 = com.google.android.libraries.social.populous.logging.C42576k.f111734a
            com.google.android.libraries.social.populous.logging.n r1 = r1.mo45631a(r3)
            r3 = 14
            r1.mo45673h(r3)
            r3 = 21
            r1.mo45674i(r3)
            r1.mo45670e(r15)
            r1.mo45666a()
        L_0x00f1:
            android.database.sqlite.SQLiteDatabase r15 = r2.f12902a
            java.lang.String r1 = "DELETE FROM CacheInfo"
            r15.execSQL(r1)
            android.database.sqlite.SQLiteDatabase r15 = r2.f12902a
            java.lang.String r1 = "DELETE FROM Contacts"
            r15.execSQL(r1)
            android.database.sqlite.SQLiteDatabase r15 = r2.f12902a
            java.lang.String r1 = "DELETE FROM Tokens"
            r15.execSQL(r1)
        L_0x0106:
            com.google.android.libraries.social.populous.logging.z r15 = r14.f111794a
            if (r15 == 0) goto L_0x0113
            if (r0 == 0) goto L_0x0113
            r1 = 64
            com.google.android.libraries.social.populous.logging.k r2 = com.google.android.libraries.social.populous.logging.C42576k.f111734a
            r15.mo45638h(r1, r0, r2)
        L_0x0113:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.storage.C42604ae.mo45706a(androidx.q.a.d):void");
    }
}
