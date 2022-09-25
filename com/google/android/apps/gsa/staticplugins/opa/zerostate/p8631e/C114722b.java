package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8631e;

import com.google.android.libraries.gsa.p1876k.C22870f;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.e.b */
/* compiled from: PG */
public final /* synthetic */ class C114722b implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C114723c f318326a;

    public /* synthetic */ C114722b(C114723c cVar) {
        this.f318326a = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x023e A[Catch:{ IllegalArgumentException -> 0x0243 }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0265 A[Catch:{ all -> 0x02cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x027d A[Catch:{ all -> 0x02cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02a2 A[Catch:{ all -> 0x02cb }, LOOP:1: B:73:0x01e2->B:130:0x02a2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x02a1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02a5 A[EDGE_INSN: B:166:0x02a5->B:131:0x02a5 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01b1 A[Catch:{ all -> 0x019f, all -> 0x01a7, IllegalArgumentException -> 0x01b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01e8 A[Catch:{ all -> 0x02cb }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r28 = this;
            java.lang.String r1 = "display_name"
            java.lang.String r2 = "ZSCallManager"
            r3 = r28
            com.google.android.apps.gsa.staticplugins.opa.zerostate.e.c r4 = r3.f318326a
            com.google.android.apps.gsa.shared.util.permissions.d r0 = r4.f318331e
            com.google.android.apps.gsa.shared.util.permissions.a.a r0 = r0.f254356c
            java.lang.String r5 = "android.permission.READ_CALL_LOG"
            boolean r0 = r0.mo85346a(r5)
            if (r0 != 0) goto L_0x002a
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.common.util.concurrent.SettableFuture r0 = r4.f318336j
            boolean r0 = r0.isDone()
            if (r0 == 0) goto L_0x0020
            goto L_0x02f8
        L_0x0020:
            com.google.common.util.concurrent.SettableFuture r0 = r4.f318336j
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89845m()
            r0.mo57356n(r1)
            return
        L_0x002a:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            com.google.common.b.gp r6 = new com.google.common.b.gp
            r7 = 4
            r6.<init>(r7)
            java.lang.String[] r10 = new java.lang.String[r7]
            r14 = 0
            java.lang.String r15 = "type"
            r10[r14] = r15
            r13 = 1
            java.lang.String r12 = "number"
            r10[r13] = r12
            r11 = 2
            java.lang.String r9 = "name"
            r10[r11] = r9
            r8 = 3
            java.lang.String r7 = "date"
            r10[r8] = r7
            java.lang.Object[] r0 = new java.lang.Object[r13]
            java.lang.String r16 = "date DESC"
            r0[r14] = r16
            java.lang.String r8 = "%s limit 30 "
            java.lang.String r0 = java.lang.String.format(r8, r0)
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MINUTES
            com.google.android.apps.gsa.search.core.i.t r11 = r4.f318330d
            com.google.android.apps.gsa.shared.m.f r13 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247807oC
            r18 = r15
            long r14 = r11.mo79743a(r13)
            long r13 = r8.toMillis(r14)
            java.lang.Long r8 = java.lang.Long.valueOf(r13)
            long r13 = r4.f318329c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r13)
            java.lang.String r13 = "-date<"
            r11.append(r13)
            r11.append(r8)
            java.lang.String r11 = r11.toString()
            android.content.Context r8 = r4.f318328b     // Catch:{ IllegalArgumentException -> 0x02f9 }
            android.content.ContentResolver r8 = r8.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x02f9 }
            android.net.Uri r13 = android.provider.CallLog.Calls.CONTENT_URI     // Catch:{ IllegalArgumentException -> 0x02f9 }
            r14 = 0
            r15 = 3
            r15 = r9
            r9 = r13
            r13 = 2
            r3 = r12
            r12 = r14
            r14 = 2
            r13 = r0
            android.database.Cursor r8 = r8.query(r9, r10, r11, r12, r13)     // Catch:{ IllegalArgumentException -> 0x02f9 }
            if (r8 == 0) goto L_0x02f8
            r13 = 1
        L_0x0099:
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x02ea }
            if (r0 == 0) goto L_0x02e4
            int r0 = r8.getColumnIndex(r3)     // Catch:{ all -> 0x02ea }
            java.lang.String r0 = r8.getString(r0)     // Catch:{ all -> 0x02ea }
            java.lang.String r9 = "+"
            boolean r9 = r0.startsWith(r9)     // Catch:{ all -> 0x02ea }
            if (r9 == 0) goto L_0x00ba
            java.lang.String r0 = r0.substring(r14)     // Catch:{ all -> 0x00b4 }
            goto L_0x00ba
        L_0x00b4:
            r0 = move-exception
            r1 = r0
            r20 = r8
            goto L_0x02ee
        L_0x00ba:
            boolean r9 = com.google.common.base.C58837ba.m90859h(r0)     // Catch:{ all -> 0x02ea }
            java.lang.String r10 = ""
            if (r9 == 0) goto L_0x00c4
            r9 = r10
            goto L_0x00ca
        L_0x00c4:
            java.lang.String r9 = "[\\D]"
            java.lang.String r9 = r0.replaceAll(r9, r10)     // Catch:{ all -> 0x02ea }
        L_0x00ca:
            boolean r11 = com.google.common.base.C58837ba.m90859h(r9)     // Catch:{ all -> 0x02ea }
            if (r11 != 0) goto L_0x02cd
            int r11 = r8.getColumnIndex(r15)     // Catch:{ all -> 0x02ea }
            java.lang.String r11 = r8.getString(r11)     // Catch:{ all -> 0x02ea }
            r12 = r18
            int r14 = r8.getColumnIndex(r12)     // Catch:{ all -> 0x02ea }
            int r14 = r8.getInt(r14)     // Catch:{ all -> 0x02ea }
            r18 = r3
            int r3 = r8.getColumnIndex(r7)     // Catch:{ all -> 0x02ea }
            java.lang.String r3 = r8.getString(r3)     // Catch:{ all -> 0x02ea }
            r19 = r7
            r20 = r8
            long r7 = java.lang.Long.parseLong(r3)     // Catch:{ all -> 0x02cb }
            r3 = 2
            if (r14 == r3) goto L_0x02c1
            r3 = 1
            if (r14 != r3) goto L_0x00fc
            goto L_0x02c1
        L_0x00fc:
            r3 = 3
            if (r14 != r3) goto L_0x02ba
            boolean r14 = r5.contains(r9)     // Catch:{ all -> 0x02cb }
            if (r14 != 0) goto L_0x02ba
            com.google.android.apps.gsa.contacts.cn r14 = r4.f318333g     // Catch:{ all -> 0x02cb }
            java.util.List r14 = r14.a(r9)     // Catch:{ all -> 0x02cb }
            com.google.common.b.gu r14 = com.google.common.p4522b.C58485gu.m89842j(r14)     // Catch:{ all -> 0x02cb }
            boolean r16 = r14.isEmpty()     // Catch:{ all -> 0x02cb }
            if (r16 == 0) goto L_0x0119
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x02cb }
            goto L_0x02ba
        L_0x0119:
            com.google.android.apps.gsa.assistant.shared.l.z r16 = com.google.android.apps.gsa.assistant.shared.l.z.j     // Catch:{ all -> 0x02cb }
            com.google.protobuf.bn r16 = r16.createBuilder()     // Catch:{ all -> 0x02cb }
            r3 = r16
            com.google.android.apps.gsa.assistant.shared.l.y r3 = (com.google.android.apps.gsa.assistant.shared.l.y) r3     // Catch:{ all -> 0x02cb }
            java.lang.String r11 = com.google.common.base.C58837ba.m90858g(r11)     // Catch:{ all -> 0x02cb }
            r3.copyOnWrite()     // Catch:{ all -> 0x02cb }
            r16 = r10
            com.google.protobuf.bv r10 = r3.instance     // Catch:{ all -> 0x02cb }
            com.google.android.apps.gsa.assistant.shared.l.z r10 = (com.google.android.apps.gsa.assistant.shared.l.z) r10     // Catch:{ all -> 0x02cb }
            r21 = r12
            int r12 = r10.a     // Catch:{ all -> 0x02cb }
            r17 = 2
            r12 = r12 | 2
            r10.a = r12     // Catch:{ all -> 0x02cb }
            r10.c = r11     // Catch:{ all -> 0x02cb }
            r3.copyOnWrite()     // Catch:{ all -> 0x02cb }
            com.google.protobuf.bv r10 = r3.instance     // Catch:{ all -> 0x02cb }
            com.google.android.apps.gsa.assistant.shared.l.z r10 = (com.google.android.apps.gsa.assistant.shared.l.z) r10     // Catch:{ all -> 0x02cb }
            int r11 = r10.a     // Catch:{ all -> 0x02cb }
            r11 = r11 | 16
            r10.a = r11     // Catch:{ all -> 0x02cb }
            r10.f = r7     // Catch:{ all -> 0x02cb }
            r3.copyOnWrite()     // Catch:{ all -> 0x02cb }
            com.google.protobuf.bv r7 = r3.instance     // Catch:{ all -> 0x02cb }
            com.google.android.apps.gsa.assistant.shared.l.z r7 = (com.google.android.apps.gsa.assistant.shared.l.z) r7     // Catch:{ all -> 0x02cb }
            r9.getClass()     // Catch:{ all -> 0x02cb }
            int r8 = r7.a     // Catch:{ all -> 0x02cb }
            r10 = 1
            r8 = r8 | r10
            r7.a = r8     // Catch:{ all -> 0x02cb }
            r7.b = r9     // Catch:{ all -> 0x02cb }
            r3.copyOnWrite()     // Catch:{ all -> 0x02cb }
            com.google.protobuf.bv r7 = r3.instance     // Catch:{ all -> 0x02cb }
            com.google.android.apps.gsa.assistant.shared.l.z r7 = (com.google.android.apps.gsa.assistant.shared.l.z) r7     // Catch:{ all -> 0x02cb }
            r0.getClass()     // Catch:{ all -> 0x02cb }
            int r8 = r7.a     // Catch:{ all -> 0x02cb }
            r8 = r8 | 128(0x80, float:1.794E-43)
            r7.a = r8     // Catch:{ all -> 0x02cb }
            r7.i = r0     // Catch:{ all -> 0x02cb }
            if (r13 == 0) goto L_0x02a5
            android.net.Uri r0 = android.provider.ContactsContract.PhoneLookup.CONTENT_FILTER_URI     // Catch:{ all -> 0x02cb }
            java.lang.String r7 = android.net.Uri.encode(r9)     // Catch:{ all -> 0x02cb }
            android.net.Uri r9 = android.net.Uri.withAppendedPath(r0, r7)     // Catch:{ all -> 0x02cb }
            android.content.Context r0 = r4.f318328b     // Catch:{ IllegalArgumentException -> 0x01b6 }
            android.content.ContentResolver r8 = r0.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x01b6 }
            r7 = 1
            java.lang.String[] r10 = new java.lang.String[r7]     // Catch:{ IllegalArgumentException -> 0x01b6 }
            r7 = 0
            r10[r7] = r1     // Catch:{ IllegalArgumentException -> 0x01b6 }
            r11 = 0
            r12 = 0
            r13 = 0
            android.database.Cursor r7 = r8.query(r9, r10, r11, r12, r13)     // Catch:{ IllegalArgumentException -> 0x01b6 }
            if (r7 == 0) goto L_0x01ad
            boolean r0 = r7.moveToFirst()     // Catch:{ all -> 0x019f }
            if (r0 == 0) goto L_0x01ad
            int r0 = r7.getColumnIndex(r1)     // Catch:{ all -> 0x019f }
            java.lang.String r0 = r7.getString(r0)     // Catch:{ all -> 0x019f }
            goto L_0x01af
        L_0x019f:
            r0 = move-exception
            r8 = r0
            if (r7 == 0) goto L_0x01ac
            r7.close()     // Catch:{ all -> 0x01a7 }
            goto L_0x01ac
        L_0x01a7:
            r0 = move-exception
            r7 = r0
            com.google.android.apps.gsa.staticplugins.opa.zerostate.p8631e.C114721a.m190167a(r8, r7)     // Catch:{ IllegalArgumentException -> 0x01b6 }
        L_0x01ac:
            throw r8     // Catch:{ IllegalArgumentException -> 0x01b6 }
        L_0x01ad:
            r0 = r16
        L_0x01af:
            if (r7 == 0) goto L_0x01b4
            r7.close()     // Catch:{ IllegalArgumentException -> 0x01b6 }
        L_0x01b4:
            r10 = r0
            goto L_0x01cb
        L_0x01b6:
            r0 = move-exception
            com.google.common.f.e r7 = com.google.android.apps.gsa.staticplugins.opa.zerostate.p8631e.C114723c.f318327a     // Catch:{ all -> 0x02cb }
            com.google.common.f.x r7 = r7.mo56225c()     // Catch:{ all -> 0x02cb }
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x02cb }
            r7.mo56378ag(r8, r2)     // Catch:{ all -> 0x02cb }
            java.lang.String r8 = "Error reading params from Contact ContentProvider"
            r9 = 29363(0x72b3, float:4.1146E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56382g(r0)).mo56372aa(r9)).mo56386p(r8)     // Catch:{ all -> 0x02cb }
            r10 = r16
        L_0x01cb:
            r3.copyOnWrite()     // Catch:{ all -> 0x02cb }
            com.google.protobuf.bv r0 = r3.instance     // Catch:{ all -> 0x02cb }
            com.google.android.apps.gsa.assistant.shared.l.z r0 = (com.google.android.apps.gsa.assistant.shared.l.z) r0     // Catch:{ all -> 0x02cb }
            r10.getClass()     // Catch:{ all -> 0x02cb }
            int r7 = r0.a     // Catch:{ all -> 0x02cb }
            r8 = 4
            r7 = r7 | r8
            r0.a = r7     // Catch:{ all -> 0x02cb }
            r0.d = r10     // Catch:{ all -> 0x02cb }
            r7 = 0
            com.google.common.b.sm r9 = r14.listIterator(r7)     // Catch:{ all -> 0x02cb }
        L_0x01e2:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x02cb }
            if (r0 == 0) goto L_0x02a5
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x02cb }
            com.google.android.apps.gsa.search.shared.contact.Contact r0 = (com.google.android.apps.gsa.search.shared.contact.Contact) r0     // Catch:{ all -> 0x02cb }
            android.net.Uri r7 = android.provider.ContactsContract.Contacts.CONTENT_URI     // Catch:{ all -> 0x02cb }
            long r10 = r0.f236351b     // Catch:{ all -> 0x02cb }
            android.net.Uri r7 = android.content.ContentUris.withAppendedId(r7, r10)     // Catch:{ all -> 0x02cb }
            java.lang.String r0 = "photo"
            android.net.Uri r0 = android.net.Uri.withAppendedPath(r7, r0)     // Catch:{ all -> 0x02cb }
            r10 = 0
            android.content.Context r11 = r4.f318328b     // Catch:{ IllegalArgumentException -> 0x0247 }
            android.content.ContentResolver r22 = r11.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x0247 }
            r11 = 1
            java.lang.String[] r12 = new java.lang.String[r11]     // Catch:{ IllegalArgumentException -> 0x0245 }
            java.lang.String r13 = "data15"
            r14 = 0
            r12[r14] = r13     // Catch:{ IllegalArgumentException -> 0x0243 }
            r25 = 0
            r26 = 0
            r27 = 0
            r23 = r0
            r24 = r12
            android.database.Cursor r12 = r22.query(r23, r24, r25, r26, r27)     // Catch:{ IllegalArgumentException -> 0x0245 }
            if (r12 == 0) goto L_0x023b
            boolean r13 = r12.moveToFirst()     // Catch:{ all -> 0x022e }
            if (r13 == 0) goto L_0x023b
            r14 = 0
            byte[] r13 = r12.getBlob(r14)     // Catch:{ all -> 0x022c }
            if (r13 == 0) goto L_0x023c
            r12.close()     // Catch:{ IllegalArgumentException -> 0x0243 }
            goto L_0x025d
        L_0x022c:
            r0 = move-exception
            goto L_0x0230
        L_0x022e:
            r0 = move-exception
            r14 = 0
        L_0x0230:
            r13 = r0
            r12.close()     // Catch:{ all -> 0x0235 }
            goto L_0x023a
        L_0x0235:
            r0 = move-exception
            r12 = r0
            com.google.android.apps.gsa.staticplugins.opa.zerostate.p8631e.C114721a.m190167a(r13, r12)     // Catch:{ IllegalArgumentException -> 0x0243 }
        L_0x023a:
            throw r13     // Catch:{ IllegalArgumentException -> 0x0243 }
        L_0x023b:
            r14 = 0
        L_0x023c:
            if (r12 == 0) goto L_0x0241
            r12.close()     // Catch:{ IllegalArgumentException -> 0x0243 }
        L_0x0241:
            r0 = r10
            goto L_0x025d
        L_0x0243:
            r0 = move-exception
            goto L_0x024a
        L_0x0245:
            r0 = move-exception
            goto L_0x0249
        L_0x0247:
            r0 = move-exception
            r11 = 1
        L_0x0249:
            r14 = 0
        L_0x024a:
            com.google.common.f.e r12 = com.google.android.apps.gsa.staticplugins.opa.zerostate.p8631e.C114723c.f318327a     // Catch:{ all -> 0x02cb }
            com.google.common.f.x r12 = r12.mo56226d()     // Catch:{ all -> 0x02cb }
            com.google.common.f.aa r13 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x02cb }
            r12.mo56378ag(r13, r2)     // Catch:{ all -> 0x02cb }
            java.lang.String r13 = "Error reading params from Contact photo ContentProvider"
            r8 = 29362(0x72b2, float:4.1145E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56382g(r0)).mo56372aa(r8)).mo56386p(r13)     // Catch:{ all -> 0x02cb }
            goto L_0x0241
        L_0x025d:
            java.lang.String r8 = "display_photo"
            android.net.Uri r7 = android.net.Uri.withAppendedPath(r7, r8)     // Catch:{ all -> 0x02cb }
            if (r7 == 0) goto L_0x027b
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x02cb }
            r3.copyOnWrite()     // Catch:{ all -> 0x02cb }
            com.google.protobuf.bv r8 = r3.instance     // Catch:{ all -> 0x02cb }
            com.google.android.apps.gsa.assistant.shared.l.z r8 = (com.google.android.apps.gsa.assistant.shared.l.z) r8     // Catch:{ all -> 0x02cb }
            r7.getClass()     // Catch:{ all -> 0x02cb }
            int r10 = r8.a     // Catch:{ all -> 0x02cb }
            r10 = r10 | 32
            r8.a = r10     // Catch:{ all -> 0x02cb }
            r8.g = r7     // Catch:{ all -> 0x02cb }
        L_0x027b:
            if (r0 == 0) goto L_0x0293
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x02cb }
            r3.copyOnWrite()     // Catch:{ all -> 0x02cb }
            com.google.protobuf.bv r7 = r3.instance     // Catch:{ all -> 0x02cb }
            com.google.android.apps.gsa.assistant.shared.l.z r7 = (com.google.android.apps.gsa.assistant.shared.l.z) r7     // Catch:{ all -> 0x02cb }
            r0.getClass()     // Catch:{ all -> 0x02cb }
            int r8 = r7.a     // Catch:{ all -> 0x02cb }
            r8 = r8 | 64
            r7.a = r8     // Catch:{ all -> 0x02cb }
            r7.h = r0     // Catch:{ all -> 0x02cb }
        L_0x0293:
            com.google.protobuf.bv r0 = r3.instance     // Catch:{ all -> 0x02cb }
            com.google.android.apps.gsa.assistant.shared.l.z r0 = (com.google.android.apps.gsa.assistant.shared.l.z) r0     // Catch:{ all -> 0x02cb }
            int r0 = r0.a     // Catch:{ all -> 0x02cb }
            r7 = r0 & 32
            if (r7 == 0) goto L_0x02a2
            r0 = r0 & 64
            if (r0 == 0) goto L_0x02a2
            goto L_0x02a7
        L_0x02a2:
            r8 = 4
            goto L_0x01e2
        L_0x02a5:
            r11 = 1
            r14 = 0
        L_0x02a7:
            com.google.protobuf.bv r0 = r3.build()     // Catch:{ all -> 0x02cb }
            com.google.android.apps.gsa.assistant.shared.l.z r0 = (com.google.android.apps.gsa.assistant.shared.l.z) r0     // Catch:{ all -> 0x02cb }
            r6.mo55395g(r0)     // Catch:{ all -> 0x02cb }
            r3 = r18
            r7 = r19
            r8 = r20
            r18 = r21
            r13 = 0
            goto L_0x02e1
        L_0x02ba:
            r21 = r12
            r11 = 1
            r14 = 0
            r17 = 2
            goto L_0x02d9
        L_0x02c1:
            r21 = r12
            r11 = 1
            r14 = 0
            r17 = 2
            r5.add(r9)     // Catch:{ all -> 0x02cb }
            goto L_0x02d9
        L_0x02cb:
            r0 = move-exception
            goto L_0x02ed
        L_0x02cd:
            r19 = r7
            r20 = r8
            r21 = r18
            r11 = 1
            r14 = 0
            r17 = 2
            r18 = r3
        L_0x02d9:
            r3 = r18
            r7 = r19
            r8 = r20
            r18 = r21
        L_0x02e1:
            r14 = 2
            goto L_0x0099
        L_0x02e4:
            r20 = r8
            r20.close()     // Catch:{ IllegalArgumentException -> 0x02f9 }
            goto L_0x030c
        L_0x02ea:
            r0 = move-exception
            r20 = r8
        L_0x02ed:
            r1 = r0
        L_0x02ee:
            r20.close()     // Catch:{ all -> 0x02f2 }
            goto L_0x02f7
        L_0x02f2:
            r0 = move-exception
            r3 = r0
            com.google.android.apps.gsa.staticplugins.opa.zerostate.p8631e.C114721a.m190167a(r1, r3)     // Catch:{ IllegalArgumentException -> 0x02f9 }
        L_0x02f7:
            throw r1     // Catch:{ IllegalArgumentException -> 0x02f9 }
        L_0x02f8:
            return
        L_0x02f9:
            r0 = move-exception
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.opa.zerostate.p8631e.C114723c.f318327a
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r3, r2)
            java.lang.String r2 = "Error reading params from ContentProvider"
            r3 = 29365(0x72b5, float:4.1149E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r3)).mo56386p(r2)
        L_0x030c:
            com.google.common.util.concurrent.SettableFuture r0 = r4.f318336j
            boolean r0 = r0.isDone()
            if (r0 == 0) goto L_0x031d
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.common.util.concurrent.SettableFuture r0 = new com.google.common.util.concurrent.SettableFuture
            r0.<init>()
            r4.f318336j = r0
        L_0x031d:
            com.google.common.util.concurrent.SettableFuture r0 = r4.f318336j
            com.google.common.b.gu r1 = r6.mo55394f()
            r0.mo57356n(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.zerostate.p8631e.C114722b.run():void");
    }
}
