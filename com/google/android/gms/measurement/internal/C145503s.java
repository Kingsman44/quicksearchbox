package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.p10848a.C145126ad;

/* renamed from: com.google.android.gms.measurement.internal.s */
/* compiled from: PG */
final class C145503s {

    /* renamed from: a */
    final /* synthetic */ C145507w f393411a;

    /* renamed from: b */
    private C145126ad f393412b;

    /* renamed from: c */
    private Long f393413c;

    /* renamed from: d */
    private long f393414d;

    public C145503s(C145507w wVar) {
        this.f393411a = wVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.String} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e4, code lost:
        if (r14 == null) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00fc, code lost:
        if (r14 != null) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00fe, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0101, code lost:
        r0 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01e0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.p10848a.C145126ad mo121303a(java.lang.String r18, com.google.android.gms.measurement.p10848a.C145126ad r19) {
        /*
            r17 = this;
            r1 = r17
            r3 = r18
            r8 = r19
            java.lang.String r0 = r8.f392215c
            com.google.protobuf.cq r9 = r8.f392214b
            com.google.android.gms.measurement.internal.w r2 = r1.f393411a
            com.google.android.gms.measurement.internal.jy r2 = r2.f393327l
            com.google.android.gms.measurement.internal.ka r2 = r2.f393359g
            com.google.android.gms.measurement.internal.C145488jy.m236409I(r2)
            java.lang.String r2 = "_eid"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C145491ka.m236455E(r8, r2)
            java.lang.Long r4 = (java.lang.Long) r4
            r10 = 1
            if (r4 == 0) goto L_0x022c
            java.lang.String r5 = "_ep"
            boolean r5 = r0.equals(r5)
            r6 = 0
            if (r5 == 0) goto L_0x01e4
            com.google.android.gms.measurement.internal.w r0 = r1.f393411a
            com.google.android.gms.measurement.internal.jy r0 = r0.f393327l
            com.google.android.gms.measurement.internal.ka r0 = r0.f393359g
            com.google.android.gms.measurement.internal.C145488jy.m236409I(r0)
            java.lang.String r0 = "_en"
            java.lang.Object r0 = com.google.android.gms.measurement.internal.C145491ka.m236455E(r8, r0)
            r11 = r0
            java.lang.String r11 = (java.lang.String) r11
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r5 = 0
            if (r0 == 0) goto L_0x0051
            com.google.android.gms.measurement.internal.w r0 = r1.f393411a
            com.google.android.gms.measurement.internal.ff r0 = r0.f393011w
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()
            com.google.android.gms.measurement.internal.dv r0 = r0.f392796d
            java.lang.String r2 = "Extra parameter without an event name. eventId"
            r0.mo120895b(r2, r4)
            return r5
        L_0x0051:
            com.google.android.gms.measurement.a.ad r0 = r1.f393412b
            r12 = 0
            if (r0 == 0) goto L_0x0068
            java.lang.Long r0 = r1.f393413c
            if (r0 == 0) goto L_0x0068
            long r13 = r4.longValue()
            java.lang.Long r0 = r1.f393413c
            long r15 = r0.longValue()
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x012d
        L_0x0068:
            com.google.android.gms.measurement.internal.w r0 = r1.f393411a
            com.google.android.gms.measurement.internal.jy r0 = r0.f393327l
            com.google.android.gms.measurement.internal.ah r13 = r0.f393355c
            com.google.android.gms.measurement.internal.C145488jy.m236409I(r13)
            r13.mo120904g()
            r13.mo121194J()
            android.database.sqlite.SQLiteDatabase r0 = r13.mo120806d()     // Catch:{ SQLiteException -> 0x00ed, all -> 0x00e9 }
            r14 = 2
            java.lang.String[] r14 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x00ed, all -> 0x00e9 }
            r14[r12] = r3     // Catch:{ SQLiteException -> 0x00ed, all -> 0x00e9 }
            java.lang.String r15 = r4.toString()     // Catch:{ SQLiteException -> 0x00ed, all -> 0x00e9 }
            r14[r10] = r15     // Catch:{ SQLiteException -> 0x00ed, all -> 0x00e9 }
            java.lang.String r15 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            android.database.Cursor r14 = r0.rawQuery(r15, r14)     // Catch:{ SQLiteException -> 0x00ed, all -> 0x00e9 }
            boolean r0 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x00e7 }
            if (r0 != 0) goto L_0x00a6
            com.google.android.gms.measurement.internal.ff r0 = r13.f393011w     // Catch:{ SQLiteException -> 0x00e7 }
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()     // Catch:{ SQLiteException -> 0x00e7 }
            com.google.android.gms.measurement.internal.dv r0 = r0.f392803k     // Catch:{ SQLiteException -> 0x00e7 }
            java.lang.String r15 = "Main event not found"
            r0.mo120894a(r15)     // Catch:{ SQLiteException -> 0x00e7 }
            if (r14 == 0) goto L_0x00a4
            r14.close()
        L_0x00a4:
            r0 = r5
            goto L_0x0102
        L_0x00a6:
            byte[] r0 = r14.getBlob(r12)     // Catch:{ SQLiteException -> 0x00e7 }
            long r15 = r14.getLong(r10)     // Catch:{ SQLiteException -> 0x00e7 }
            java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch:{ SQLiteException -> 0x00e7 }
            com.google.android.gms.measurement.a.ad r16 = com.google.android.gms.measurement.p10848a.C145126ad.f392211g     // Catch:{ IOException -> 0x00d2 }
            com.google.protobuf.bn r16 = r16.createBuilder()     // Catch:{ IOException -> 0x00d2 }
            r5 = r16
            com.google.android.gms.measurement.a.ac r5 = (com.google.android.gms.measurement.p10848a.C145125ac) r5     // Catch:{ IOException -> 0x00d2 }
            com.google.protobuf.ds r0 = com.google.android.gms.measurement.internal.C145491ka.m236458k(r5, r0)     // Catch:{ IOException -> 0x00d2 }
            com.google.android.gms.measurement.a.ac r0 = (com.google.android.gms.measurement.p10848a.C145125ac) r0     // Catch:{ IOException -> 0x00d2 }
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ IOException -> 0x00d2 }
            com.google.android.gms.measurement.a.ad r0 = (com.google.android.gms.measurement.p10848a.C145126ad) r0     // Catch:{ IOException -> 0x00d2 }
            android.util.Pair r0 = android.util.Pair.create(r0, r15)     // Catch:{ SQLiteException -> 0x00e7 }
            if (r14 == 0) goto L_0x0102
            r14.close()
            goto L_0x0102
        L_0x00d2:
            r0 = move-exception
            com.google.android.gms.measurement.internal.ff r5 = r13.f393011w     // Catch:{ SQLiteException -> 0x00e7 }
            com.google.android.gms.measurement.internal.dx r5 = r5.mo120965ar()     // Catch:{ SQLiteException -> 0x00e7 }
            com.google.android.gms.measurement.internal.dv r5 = r5.f392795c     // Catch:{ SQLiteException -> 0x00e7 }
            java.lang.String r15 = "Failed to merge main event. appId, eventId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r18)     // Catch:{ SQLiteException -> 0x00e7 }
            r5.mo120897d(r15, r12, r4, r0)     // Catch:{ SQLiteException -> 0x00e7 }
            if (r14 == 0) goto L_0x0101
            goto L_0x00fe
        L_0x00e7:
            r0 = move-exception
            goto L_0x00ef
        L_0x00e9:
            r0 = move-exception
            r5 = 0
            goto L_0x01de
        L_0x00ed:
            r0 = move-exception
            r14 = 0
        L_0x00ef:
            com.google.android.gms.measurement.internal.ff r5 = r13.f393011w     // Catch:{ all -> 0x01dc }
            com.google.android.gms.measurement.internal.dx r5 = r5.mo120965ar()     // Catch:{ all -> 0x01dc }
            com.google.android.gms.measurement.internal.dv r5 = r5.f392795c     // Catch:{ all -> 0x01dc }
            java.lang.String r12 = "Error selecting main event"
            r5.mo120895b(r12, r0)     // Catch:{ all -> 0x01dc }
            if (r14 == 0) goto L_0x0101
        L_0x00fe:
            r14.close()
        L_0x0101:
            r0 = 0
        L_0x0102:
            if (r0 == 0) goto L_0x01cb
            java.lang.Object r5 = r0.first
            if (r5 != 0) goto L_0x010a
            goto L_0x01cb
        L_0x010a:
            java.lang.Object r5 = r0.first
            com.google.android.gms.measurement.a.ad r5 = (com.google.android.gms.measurement.p10848a.C145126ad) r5
            r1.f393412b = r5
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r12 = r0.longValue()
            r1.f393414d = r12
            com.google.android.gms.measurement.internal.w r0 = r1.f393411a
            com.google.android.gms.measurement.internal.jy r0 = r0.f393327l
            com.google.android.gms.measurement.internal.ka r0 = r0.f393359g
            com.google.android.gms.measurement.internal.C145488jy.m236409I(r0)
            com.google.android.gms.measurement.a.ad r0 = r1.f393412b
            java.lang.Object r0 = com.google.android.gms.measurement.internal.C145491ka.m236455E(r0, r2)
            java.lang.Long r0 = (java.lang.Long) r0
            r1.f393413c = r0
        L_0x012d:
            long r12 = r1.f393414d
            r14 = -1
            long r12 = r12 + r14
            r1.f393414d = r12
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x016f
            com.google.android.gms.measurement.internal.w r0 = r1.f393411a
            com.google.android.gms.measurement.internal.jy r0 = r0.f393327l
            com.google.android.gms.measurement.internal.ah r2 = r0.f393355c
            com.google.android.gms.measurement.internal.C145488jy.m236409I(r2)
            r2.mo120904g()
            com.google.android.gms.measurement.internal.ff r0 = r2.f393011w
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()
            com.google.android.gms.measurement.internal.dv r0 = r0.f392803k
            java.lang.String r4 = "Clearing complex main event info. appId"
            r0.mo120895b(r4, r3)
            android.database.sqlite.SQLiteDatabase r0 = r2.mo120806d()     // Catch:{ SQLiteException -> 0x0160 }
            java.lang.String[] r4 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0160 }
            r5 = 0
            r4[r5] = r3     // Catch:{ SQLiteException -> 0x0160 }
            java.lang.String r3 = "delete from main_event_params where app_id=?"
            r0.execSQL(r3, r4)     // Catch:{ SQLiteException -> 0x0160 }
            goto L_0x0181
        L_0x0160:
            r0 = move-exception
            com.google.android.gms.measurement.internal.ff r2 = r2.f393011w
            com.google.android.gms.measurement.internal.dx r2 = r2.mo120965ar()
            com.google.android.gms.measurement.internal.dv r2 = r2.f392795c
            java.lang.String r3 = "Error clearing complex main event"
            r2.mo120895b(r3, r0)
            goto L_0x0181
        L_0x016f:
            com.google.android.gms.measurement.internal.w r0 = r1.f393411a
            com.google.android.gms.measurement.internal.jy r0 = r0.f393327l
            com.google.android.gms.measurement.internal.ah r2 = r0.f393355c
            com.google.android.gms.measurement.internal.C145488jy.m236409I(r2)
            long r5 = r1.f393414d
            com.google.android.gms.measurement.a.ad r7 = r1.f393412b
            r3 = r18
            r2.mo120802G(r3, r4, r5, r7)
        L_0x0181:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.measurement.a.ad r2 = r1.f393412b
            com.google.protobuf.cq r2 = r2.f392214b
            java.util.Iterator r2 = r2.iterator()
        L_0x018e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01af
            java.lang.Object r3 = r2.next()
            com.google.android.gms.measurement.a.ah r3 = (com.google.android.gms.measurement.p10848a.C145130ah) r3
            com.google.android.gms.measurement.internal.w r4 = r1.f393411a
            com.google.android.gms.measurement.internal.jy r4 = r4.f393327l
            com.google.android.gms.measurement.internal.ka r4 = r4.f393359g
            com.google.android.gms.measurement.internal.C145488jy.m236409I(r4)
            java.lang.String r4 = r3.f392227b
            com.google.android.gms.measurement.a.ah r4 = com.google.android.gms.measurement.internal.C145491ka.m236451A(r8, r4)
            if (r4 != 0) goto L_0x018e
            r0.add(r3)
            goto L_0x018e
        L_0x01af:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x01ba
            r0.addAll(r9)
            r9 = r0
            goto L_0x01c9
        L_0x01ba:
            com.google.android.gms.measurement.internal.w r0 = r1.f393411a
            com.google.android.gms.measurement.internal.ff r0 = r0.f393011w
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()
            com.google.android.gms.measurement.internal.dv r0 = r0.f392796d
            java.lang.String r2 = "No unique parameters in main event. eventName"
            r0.mo120895b(r2, r11)
        L_0x01c9:
            r0 = r11
            goto L_0x022c
        L_0x01cb:
            com.google.android.gms.measurement.internal.w r0 = r1.f393411a
            com.google.android.gms.measurement.internal.ff r0 = r0.f393011w
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()
            com.google.android.gms.measurement.internal.dv r0 = r0.f392796d
            java.lang.String r2 = "Extra parameter without existing main event. eventName, eventId"
            r0.mo120896c(r2, r11, r4)
            r2 = 0
            return r2
        L_0x01dc:
            r0 = move-exception
            r5 = r14
        L_0x01de:
            if (r5 == 0) goto L_0x01e3
            r5.close()
        L_0x01e3:
            throw r0
        L_0x01e4:
            r1.f393413c = r4
            r1.f393412b = r8
            com.google.android.gms.measurement.internal.w r2 = r1.f393411a
            com.google.android.gms.measurement.internal.jy r2 = r2.f393327l
            com.google.android.gms.measurement.internal.ka r2 = r2.f393359g
            com.google.android.gms.measurement.internal.C145488jy.m236409I(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.String r5 = "_epc"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C145491ka.m236455E(r8, r5)
            if (r5 == 0) goto L_0x01fe
            r2 = r5
        L_0x01fe:
            java.lang.Long r2 = (java.lang.Long) r2
            long r11 = r2.longValue()
            r1.f393414d = r11
            int r2 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x021a
            com.google.android.gms.measurement.internal.w r2 = r1.f393411a
            com.google.android.gms.measurement.internal.ff r2 = r2.f393011w
            com.google.android.gms.measurement.internal.dx r2 = r2.mo120965ar()
            com.google.android.gms.measurement.internal.dv r2 = r2.f392796d
            java.lang.String r3 = "Complex event with zero extra param count. eventName"
            r2.mo120895b(r3, r0)
            goto L_0x022c
        L_0x021a:
            com.google.android.gms.measurement.internal.w r2 = r1.f393411a
            com.google.android.gms.measurement.internal.jy r2 = r2.f393327l
            com.google.android.gms.measurement.internal.ah r2 = r2.f393355c
            com.google.android.gms.measurement.internal.C145488jy.m236409I(r2)
            long r5 = r1.f393414d
            r3 = r18
            r7 = r19
            r2.mo120802G(r3, r4, r5, r7)
        L_0x022c:
            com.google.protobuf.bn r2 = r19.toBuilder()
            com.google.android.gms.measurement.a.ac r2 = (com.google.android.gms.measurement.p10848a.C145125ac) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.gms.measurement.a.ad r3 = (com.google.android.gms.measurement.p10848a.C145126ad) r3
            r0.getClass()
            int r4 = r3.f392213a
            r4 = r4 | r10
            r3.f392213a = r4
            r3.f392215c = r0
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.android.gms.measurement.a.ad r0 = (com.google.android.gms.measurement.p10848a.C145126ad) r0
            com.google.protobuf.cq r3 = com.google.android.gms.measurement.p10848a.C145126ad.emptyProtobufList()
            r0.f392214b = r3
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.android.gms.measurement.a.ad r0 = (com.google.android.gms.measurement.p10848a.C145126ad) r0
            r0.mo120667a()
            com.google.protobuf.cq r0 = r0.f392214b
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r9, (java.util.List) r0)
            com.google.protobuf.bv r0 = r2.build()
            com.google.android.gms.measurement.a.ad r0 = (com.google.android.gms.measurement.p10848a.C145126ad) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145503s.mo121303a(java.lang.String, com.google.android.gms.measurement.a.ad):com.google.android.gms.measurement.a.ad");
    }
}
