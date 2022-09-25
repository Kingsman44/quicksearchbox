package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.jr */
/* compiled from: PG */
final class C145481jr implements C145327dz {

    /* renamed from: a */
    final /* synthetic */ C145488jy f393330a;

    public C145481jr(C145488jy jyVar) {
        this.f393330a = jyVar;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0170 A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0018 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01e4 A[SYNTHETIC, Splitter:B:77:0x01e4] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo120903a(java.lang.String r11, int r12, java.lang.Throwable r13, byte[] r14, java.util.Map r15) {
        /*
            r10 = this;
            java.lang.String r11 = "UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN "
            java.lang.String r15 = "SELECT COUNT(1) FROM queue WHERE rowid IN "
            java.lang.String r0 = "("
            com.google.android.gms.measurement.internal.jy r1 = r10.f393330a
            com.google.android.gms.measurement.internal.fc r2 = r1.mo120966as()
            r2.mo120904g()
            r1.mo121218n()
            r2 = 0
            if (r14 != 0) goto L_0x001b
            byte[] r14 = new byte[r2]     // Catch:{ all -> 0x0018 }
            goto L_0x001b
        L_0x0018:
            r11 = move-exception
            goto L_0x01ec
        L_0x001b:
            java.util.List r3 = r1.f393370r     // Catch:{ all -> 0x0018 }
            com.google.android.gms.common.internal.C143919bh.m233958a(r3)     // Catch:{ all -> 0x0018 }
            r4 = 0
            r1.f393370r = r4     // Catch:{ all -> 0x0018 }
            r5 = 200(0xc8, float:2.8E-43)
            r6 = 0
            if (r12 == r5) goto L_0x002f
            r5 = 204(0xcc, float:2.86E-43)
            if (r12 != r5) goto L_0x0128
            r12 = 204(0xcc, float:2.86E-43)
        L_0x002f:
            if (r13 != 0) goto L_0x0128
            com.google.android.gms.measurement.internal.iv r11 = r1.f393361i     // Catch:{ SQLiteException -> 0x00fe }
            com.google.android.gms.measurement.internal.eh r11 = r11.f393283c     // Catch:{ SQLiteException -> 0x00fe }
            com.google.android.gms.measurement.internal.ff r13 = r1.f393363k     // Catch:{ SQLiteException -> 0x00fe }
            com.google.android.gms.common.internal.C143919bh.m233958a(r13)     // Catch:{ SQLiteException -> 0x00fe }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ SQLiteException -> 0x00fe }
            r11.mo120916b(r8)     // Catch:{ SQLiteException -> 0x00fe }
            com.google.android.gms.measurement.internal.iv r11 = r1.f393361i     // Catch:{ SQLiteException -> 0x00fe }
            com.google.android.gms.measurement.internal.eh r11 = r11.f393284d     // Catch:{ SQLiteException -> 0x00fe }
            r11.mo120916b(r6)     // Catch:{ SQLiteException -> 0x00fe }
            r1.mo121202C()     // Catch:{ SQLiteException -> 0x00fe }
            com.google.android.gms.measurement.internal.dx r11 = r1.mo120965ar()     // Catch:{ SQLiteException -> 0x00fe }
            com.google.android.gms.measurement.internal.dv r11 = r11.f392803k     // Catch:{ SQLiteException -> 0x00fe }
            java.lang.String r13 = "Successful upload. Got network response. code, size"
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ SQLiteException -> 0x00fe }
            int r14 = r14.length     // Catch:{ SQLiteException -> 0x00fe }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ SQLiteException -> 0x00fe }
            r11.mo120896c(r13, r12, r14)     // Catch:{ SQLiteException -> 0x00fe }
            com.google.android.gms.measurement.internal.ah r11 = r1.f393355c     // Catch:{ SQLiteException -> 0x00fe }
            com.google.android.gms.measurement.internal.C145488jy.m236409I(r11)     // Catch:{ SQLiteException -> 0x00fe }
            r11.mo120819r()     // Catch:{ SQLiteException -> 0x00fe }
            java.util.Iterator r11 = r3.iterator()     // Catch:{ all -> 0x00f4 }
        L_0x006b:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x00f4 }
            if (r12 == 0) goto L_0x00c2
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x00f4 }
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.measurement.internal.ah r13 = r1.f393355c     // Catch:{ SQLiteException -> 0x00b5 }
            com.google.android.gms.measurement.internal.C145488jy.m236409I(r13)     // Catch:{ SQLiteException -> 0x00b5 }
            long r14 = r12.longValue()     // Catch:{ SQLiteException -> 0x00b5 }
            r13.mo120904g()     // Catch:{ SQLiteException -> 0x00b5 }
            r13.mo121194J()     // Catch:{ SQLiteException -> 0x00b5 }
            android.database.sqlite.SQLiteDatabase r0 = r13.mo120806d()     // Catch:{ SQLiteException -> 0x00b5 }
            r3 = 1
            java.lang.String[] r5 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x00b5 }
            java.lang.String r14 = java.lang.String.valueOf(r14)     // Catch:{ SQLiteException -> 0x00b5 }
            r5[r2] = r14     // Catch:{ SQLiteException -> 0x00b5 }
            java.lang.String r14 = "queue"
            java.lang.String r15 = "rowid=?"
            int r14 = r0.delete(r14, r15, r5)     // Catch:{ SQLiteException -> 0x00a6 }
            if (r14 != r3) goto L_0x009e
            goto L_0x006b
        L_0x009e:
            android.database.sqlite.SQLiteException r14 = new android.database.sqlite.SQLiteException     // Catch:{ SQLiteException -> 0x00a6 }
            java.lang.String r15 = "Deleted fewer rows from queue than expected"
            r14.<init>(r15)     // Catch:{ SQLiteException -> 0x00a6 }
            throw r14     // Catch:{ SQLiteException -> 0x00a6 }
        L_0x00a6:
            r14 = move-exception
            com.google.android.gms.measurement.internal.ff r13 = r13.f393011w     // Catch:{ SQLiteException -> 0x00b5 }
            com.google.android.gms.measurement.internal.dx r13 = r13.mo120965ar()     // Catch:{ SQLiteException -> 0x00b5 }
            com.google.android.gms.measurement.internal.dv r13 = r13.f392795c     // Catch:{ SQLiteException -> 0x00b5 }
            java.lang.String r15 = "Failed to delete a bundle in a queue table"
            r13.mo120895b(r15, r14)     // Catch:{ SQLiteException -> 0x00b5 }
            throw r14     // Catch:{ SQLiteException -> 0x00b5 }
        L_0x00b5:
            r13 = move-exception
            java.util.List r14 = r1.f393371s     // Catch:{ all -> 0x00f4 }
            if (r14 == 0) goto L_0x00c1
            boolean r12 = r14.contains(r12)     // Catch:{ all -> 0x00f4 }
            if (r12 == 0) goto L_0x00c1
            goto L_0x006b
        L_0x00c1:
            throw r13     // Catch:{ all -> 0x00f4 }
        L_0x00c2:
            com.google.android.gms.measurement.internal.ah r11 = r1.f393355c     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.measurement.internal.C145488jy.m236409I(r11)     // Catch:{ all -> 0x00f4 }
            r11.mo120824w()     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.measurement.internal.ah r11 = r1.f393355c     // Catch:{ SQLiteException -> 0x00fe }
            com.google.android.gms.measurement.internal.C145488jy.m236409I(r11)     // Catch:{ SQLiteException -> 0x00fe }
            r11.mo120821t()     // Catch:{ SQLiteException -> 0x00fe }
            r1.f393371s = r4     // Catch:{ SQLiteException -> 0x00fe }
            com.google.android.gms.measurement.internal.ec r11 = r1.f393354b     // Catch:{ SQLiteException -> 0x00fe }
            com.google.android.gms.measurement.internal.C145488jy.m236409I(r11)     // Catch:{ SQLiteException -> 0x00fe }
            boolean r11 = r11.mo120907a()     // Catch:{ SQLiteException -> 0x00fe }
            if (r11 == 0) goto L_0x00e9
            boolean r11 = r1.mo121206G()     // Catch:{ SQLiteException -> 0x00fe }
            if (r11 == 0) goto L_0x00e9
            r1.mo121204E()     // Catch:{ SQLiteException -> 0x00fe }
            goto L_0x00f0
        L_0x00e9:
            r11 = -1
            r1.f393372t = r11     // Catch:{ SQLiteException -> 0x00fe }
            r1.mo121202C()     // Catch:{ SQLiteException -> 0x00fe }
        L_0x00f0:
            r1.f393365m = r6     // Catch:{ SQLiteException -> 0x00fe }
            goto L_0x01de
        L_0x00f4:
            r11 = move-exception
            com.google.android.gms.measurement.internal.ah r12 = r1.f393355c     // Catch:{ SQLiteException -> 0x00fe }
            com.google.android.gms.measurement.internal.C145488jy.m236409I(r12)     // Catch:{ SQLiteException -> 0x00fe }
            r12.mo120821t()     // Catch:{ SQLiteException -> 0x00fe }
            throw r11     // Catch:{ SQLiteException -> 0x00fe }
        L_0x00fe:
            r11 = move-exception
            com.google.android.gms.measurement.internal.dx r12 = r1.mo120965ar()     // Catch:{ all -> 0x0018 }
            com.google.android.gms.measurement.internal.dv r12 = r12.f392795c     // Catch:{ all -> 0x0018 }
            java.lang.String r13 = "Database error while trying to delete uploaded bundles"
            r12.mo120895b(r13, r11)     // Catch:{ all -> 0x0018 }
            com.google.android.gms.measurement.internal.ff r11 = r1.f393363k     // Catch:{ all -> 0x0018 }
            com.google.android.gms.common.internal.C143919bh.m233958a(r11)     // Catch:{ all -> 0x0018 }
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0018 }
            r1.f393365m = r11     // Catch:{ all -> 0x0018 }
            com.google.android.gms.measurement.internal.dx r11 = r1.mo120965ar()     // Catch:{ all -> 0x0018 }
            com.google.android.gms.measurement.internal.dv r11 = r11.f392803k     // Catch:{ all -> 0x0018 }
            java.lang.String r12 = "Disable upload, time"
            long r13 = r1.f393365m     // Catch:{ all -> 0x0018 }
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0018 }
            r11.mo120895b(r12, r13)     // Catch:{ all -> 0x0018 }
            goto L_0x01de
        L_0x0128:
            com.google.android.gms.measurement.internal.dx r14 = r1.mo120965ar()     // Catch:{ all -> 0x0018 }
            com.google.android.gms.measurement.internal.dv r14 = r14.f392803k     // Catch:{ all -> 0x0018 }
            java.lang.String r5 = "Network upload failed. Will retry later. code, error"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0018 }
            r14.mo120896c(r5, r8, r13)     // Catch:{ all -> 0x0018 }
            com.google.android.gms.measurement.internal.iv r13 = r1.f393361i     // Catch:{ all -> 0x0018 }
            com.google.android.gms.measurement.internal.eh r13 = r13.f393284d     // Catch:{ all -> 0x0018 }
            com.google.android.gms.measurement.internal.ff r14 = r1.f393363k     // Catch:{ all -> 0x0018 }
            com.google.android.gms.common.internal.C143919bh.m233958a(r14)     // Catch:{ all -> 0x0018 }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0018 }
            r13.mo120916b(r8)     // Catch:{ all -> 0x0018 }
            r13 = 503(0x1f7, float:7.05E-43)
            if (r12 == r13) goto L_0x014f
            r13 = 429(0x1ad, float:6.01E-43)
            if (r12 != r13) goto L_0x015f
        L_0x014f:
            com.google.android.gms.measurement.internal.iv r12 = r1.f393361i     // Catch:{ all -> 0x0018 }
            com.google.android.gms.measurement.internal.eh r12 = r12.f393282b     // Catch:{ all -> 0x0018 }
            com.google.android.gms.measurement.internal.ff r13 = r1.f393363k     // Catch:{ all -> 0x0018 }
            com.google.android.gms.common.internal.C143919bh.m233958a(r13)     // Catch:{ all -> 0x0018 }
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0018 }
            r12.mo120916b(r13)     // Catch:{ all -> 0x0018 }
        L_0x015f:
            com.google.android.gms.measurement.internal.ah r12 = r1.f393355c     // Catch:{ all -> 0x0018 }
            com.google.android.gms.measurement.internal.C145488jy.m236409I(r12)     // Catch:{ all -> 0x0018 }
            r12.mo120904g()     // Catch:{ all -> 0x0018 }
            r12.mo121194J()     // Catch:{ all -> 0x0018 }
            int r13 = r3.size()     // Catch:{ all -> 0x0018 }
            if (r13 == 0) goto L_0x01e4
            boolean r13 = r12.mo120827z()     // Catch:{ all -> 0x0018 }
            if (r13 != 0) goto L_0x0177
            goto L_0x01db
        L_0x0177:
            java.lang.String r13 = ","
            java.lang.String r13 = android.text.TextUtils.join(r13, r3)     // Catch:{ all -> 0x0018 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0018 }
            r14.<init>(r0)     // Catch:{ all -> 0x0018 }
            r14.append(r13)     // Catch:{ all -> 0x0018 }
            java.lang.String r13 = ")"
            r14.append(r13)     // Catch:{ all -> 0x0018 }
            java.lang.String r13 = r14.toString()     // Catch:{ all -> 0x0018 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0018 }
            r14.<init>(r15)     // Catch:{ all -> 0x0018 }
            r14.append(r13)     // Catch:{ all -> 0x0018 }
            java.lang.String r15 = " AND retry_count =  2147483647 LIMIT 1"
            r14.append(r15)     // Catch:{ all -> 0x0018 }
            java.lang.String r14 = r14.toString()     // Catch:{ all -> 0x0018 }
            long r14 = r12.mo120803a(r14, r4)     // Catch:{ all -> 0x0018 }
            int r0 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x01b4
            com.google.android.gms.measurement.internal.ff r14 = r12.f393011w     // Catch:{ all -> 0x0018 }
            com.google.android.gms.measurement.internal.dx r14 = r14.mo120965ar()     // Catch:{ all -> 0x0018 }
            com.google.android.gms.measurement.internal.dv r14 = r14.f392798f     // Catch:{ all -> 0x0018 }
            java.lang.String r15 = "The number of upload retries exceeds the limit. Will remain unchanged."
            r14.mo120894a(r15)     // Catch:{ all -> 0x0018 }
        L_0x01b4:
            android.database.sqlite.SQLiteDatabase r14 = r12.mo120806d()     // Catch:{ SQLiteException -> 0x01cd }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x01cd }
            r15.<init>(r11)     // Catch:{ SQLiteException -> 0x01cd }
            r15.append(r13)     // Catch:{ SQLiteException -> 0x01cd }
            java.lang.String r11 = " AND (retry_count IS NULL OR retry_count < 2147483647)"
            r15.append(r11)     // Catch:{ SQLiteException -> 0x01cd }
            java.lang.String r11 = r15.toString()     // Catch:{ SQLiteException -> 0x01cd }
            r14.execSQL(r11)     // Catch:{ SQLiteException -> 0x01cd }
            goto L_0x01db
        L_0x01cd:
            r11 = move-exception
            com.google.android.gms.measurement.internal.ff r12 = r12.f393011w     // Catch:{ all -> 0x0018 }
            com.google.android.gms.measurement.internal.dx r12 = r12.mo120965ar()     // Catch:{ all -> 0x0018 }
            com.google.android.gms.measurement.internal.dv r12 = r12.f392795c     // Catch:{ all -> 0x0018 }
            java.lang.String r13 = "Error incrementing retry count. error"
            r12.mo120895b(r13, r11)     // Catch:{ all -> 0x0018 }
        L_0x01db:
            r1.mo121202C()     // Catch:{ all -> 0x0018 }
        L_0x01de:
            r1.f393369q = r2
            r1.mo121219o()
            return
        L_0x01e4:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0018 }
            java.lang.String r12 = "Given Integer is zero"
            r11.<init>(r12)     // Catch:{ all -> 0x0018 }
            throw r11     // Catch:{ all -> 0x0018 }
        L_0x01ec:
            r1.f393369q = r2
            r1.mo121219o()
            goto L_0x01f3
        L_0x01f2:
            throw r11
        L_0x01f3:
            goto L_0x01f2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145481jr.mo120903a(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }
}
