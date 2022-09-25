package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8631e;

import com.google.android.libraries.gsa.p1876k.C22870f;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.e.g */
/* compiled from: PG */
public final /* synthetic */ class C114727g implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C114728h f318360a;

    public /* synthetic */ C114727g(C114728h hVar) {
        this.f318360a = hVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:32|38|39|40|45|46) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0178 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r18 = this;
            r1 = r18
            com.google.android.apps.gsa.staticplugins.opa.zerostate.e.h r2 = r1.f318360a
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r0 = "1"
            com.google.android.apps.gsa.shared.util.permissions.d r4 = r2.f318364d
            com.google.android.apps.gsa.shared.util.permissions.a.a r4 = r4.f254356c
            java.lang.String r5 = "android.permission.READ_SMS"
            boolean r4 = r4.mo85346a(r5)
            if (r4 != 0) goto L_0x0029
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.common.util.concurrent.SettableFuture r0 = r2.f318366f
            boolean r0 = r0.isDone()
            if (r0 == 0) goto L_0x0023
            goto L_0x0179
        L_0x0023:
            com.google.common.util.concurrent.SettableFuture r0 = r2.f318366f
            r0.mo57356n(r3)
            return
        L_0x0029:
            r4 = 4
            java.lang.String[] r7 = new java.lang.String[r4]
            r11 = 0
            java.lang.String r12 = "date"
            r7[r11] = r12
            r13 = 1
            java.lang.String r14 = "address"
            r7[r13] = r14
            r15 = 2
            java.lang.String r10 = "body"
            r7[r15] = r10
            r5 = 3
            java.lang.String r9 = "read"
            r7[r5] = r9
            java.lang.Object[] r5 = new java.lang.Object[r15]
            java.lang.String r6 = "date DESC"
            r5[r11] = r6
            r6 = 100
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r13] = r6
            java.lang.String r6 = "%s limit %d "
            java.lang.String r16 = java.lang.String.format(r6, r5)
            android.content.Context r5 = r2.f318362b     // Catch:{ IllegalArgumentException -> 0x017a }
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x017a }
            android.net.Uri r6 = android.provider.Telephony.Sms.Inbox.CONTENT_URI     // Catch:{ IllegalArgumentException -> 0x017a }
            r8 = 0
            r17 = 0
            r11 = r9
            r9 = r17
            r15 = r10
            r10 = r16
            android.database.Cursor r5 = r5.query(r6, r7, r8, r9, r10)     // Catch:{ IllegalArgumentException -> 0x017a }
            if (r5 == 0) goto L_0x0179
        L_0x006b:
            boolean r6 = r5.moveToNext()     // Catch:{ all -> 0x0157 }
            if (r6 == 0) goto L_0x0152
            int r6 = r5.getColumnIndex(r14)     // Catch:{ all -> 0x0157 }
            java.lang.String r6 = r5.getString(r6)     // Catch:{ all -> 0x0157 }
            int r7 = r5.getColumnIndex(r12)     // Catch:{ all -> 0x0157 }
            java.lang.String r7 = r5.getString(r7)     // Catch:{ all -> 0x0157 }
            int r8 = r5.getColumnIndex(r15)     // Catch:{ all -> 0x0157 }
            java.lang.String r8 = r5.getString(r8)     // Catch:{ all -> 0x0157 }
            int r9 = r5.getColumnIndex(r11)     // Catch:{ all -> 0x0157 }
            java.lang.String r9 = r5.getString(r9)     // Catch:{ all -> 0x0157 }
            boolean r10 = com.google.common.base.C58837ba.m90859h(r6)     // Catch:{ all -> 0x0157 }
            if (r10 != 0) goto L_0x0145
            boolean r9 = r9.equals(r0)     // Catch:{ all -> 0x0157 }
            if (r9 == 0) goto L_0x009f
            goto L_0x0145
        L_0x009f:
            boolean r9 = r3.containsKey(r6)     // Catch:{ all -> 0x0157 }
            if (r9 == 0) goto L_0x00e4
            java.lang.Object r7 = r3.get(r6)     // Catch:{ all -> 0x00df }
            com.google.android.apps.gsa.assistant.shared.l.ab r7 = (com.google.android.apps.gsa.assistant.shared.l.ab) r7     // Catch:{ all -> 0x00df }
            com.google.protobuf.bn r9 = r7.toBuilder()     // Catch:{ all -> 0x00df }
            com.google.android.apps.gsa.assistant.shared.l.aa r9 = (com.google.android.apps.gsa.assistant.shared.l.aa) r9     // Catch:{ all -> 0x00df }
            int r7 = r7.d     // Catch:{ all -> 0x00df }
            int r7 = r7 + r13
            r9.copyOnWrite()     // Catch:{ all -> 0x00df }
            com.google.protobuf.bv r10 = r9.instance     // Catch:{ all -> 0x00df }
            com.google.android.apps.gsa.assistant.shared.l.ab r10 = (com.google.android.apps.gsa.assistant.shared.l.ab) r10     // Catch:{ all -> 0x00df }
            int r13 = r10.a     // Catch:{ all -> 0x00df }
            r13 = r13 | r4
            r10.a = r13     // Catch:{ all -> 0x00df }
            r10.d = r7     // Catch:{ all -> 0x00df }
            java.lang.String r7 = com.google.common.base.C58837ba.m90858g(r8)     // Catch:{ all -> 0x00df }
            r9.copyOnWrite()     // Catch:{ all -> 0x00df }
            com.google.protobuf.bv r8 = r9.instance     // Catch:{ all -> 0x00df }
            com.google.android.apps.gsa.assistant.shared.l.ab r8 = (com.google.android.apps.gsa.assistant.shared.l.ab) r8     // Catch:{ all -> 0x00df }
            r8.a()     // Catch:{ all -> 0x00df }
            com.google.protobuf.cq r8 = r8.e     // Catch:{ all -> 0x00df }
            r8.add(r7)     // Catch:{ all -> 0x00df }
            com.google.protobuf.bv r7 = r9.build()     // Catch:{ all -> 0x00df }
            com.google.android.apps.gsa.assistant.shared.l.ab r7 = (com.google.android.apps.gsa.assistant.shared.l.ab) r7     // Catch:{ all -> 0x00df }
            r3.put(r6, r7)     // Catch:{ all -> 0x00df }
            goto L_0x014d
        L_0x00df:
            r0 = move-exception
            r4 = r0
            r13 = r5
            goto L_0x015a
        L_0x00e4:
            com.google.android.apps.gsa.assistant.shared.l.ab r9 = com.google.android.apps.gsa.assistant.shared.l.ab.i     // Catch:{ all -> 0x0157 }
            com.google.protobuf.bn r9 = r9.createBuilder()     // Catch:{ all -> 0x0157 }
            com.google.android.apps.gsa.assistant.shared.l.aa r9 = (com.google.android.apps.gsa.assistant.shared.l.aa) r9     // Catch:{ all -> 0x0157 }
            r13 = r5
            long r4 = java.lang.Long.parseLong(r7)     // Catch:{ all -> 0x0150 }
            r9.copyOnWrite()     // Catch:{ all -> 0x0150 }
            com.google.protobuf.bv r7 = r9.instance     // Catch:{ all -> 0x0150 }
            com.google.android.apps.gsa.assistant.shared.l.ab r7 = (com.google.android.apps.gsa.assistant.shared.l.ab) r7     // Catch:{ all -> 0x0150 }
            int r10 = r7.a     // Catch:{ all -> 0x0150 }
            r17 = 2
            r10 = r10 | 2
            r7.a = r10     // Catch:{ all -> 0x0150 }
            r7.c = r4     // Catch:{ all -> 0x0150 }
            r9.copyOnWrite()     // Catch:{ all -> 0x0150 }
            com.google.protobuf.bv r4 = r9.instance     // Catch:{ all -> 0x0150 }
            com.google.android.apps.gsa.assistant.shared.l.ab r4 = (com.google.android.apps.gsa.assistant.shared.l.ab) r4     // Catch:{ all -> 0x0150 }
            int r5 = r4.a     // Catch:{ all -> 0x0150 }
            r7 = 4
            r5 = r5 | r7
            r4.a = r5     // Catch:{ all -> 0x0150 }
            r5 = 1
            r4.d = r5     // Catch:{ all -> 0x0150 }
            r9.copyOnWrite()     // Catch:{ all -> 0x0150 }
            com.google.protobuf.bv r4 = r9.instance     // Catch:{ all -> 0x0150 }
            com.google.android.apps.gsa.assistant.shared.l.ab r4 = (com.google.android.apps.gsa.assistant.shared.l.ab) r4     // Catch:{ all -> 0x0150 }
            r6.getClass()     // Catch:{ all -> 0x0150 }
            int r5 = r4.a     // Catch:{ all -> 0x0150 }
            r10 = 1
            r5 = r5 | r10
            r4.a = r5     // Catch:{ all -> 0x0150 }
            r4.b = r6     // Catch:{ all -> 0x0150 }
            java.lang.String r4 = com.google.common.base.C58837ba.m90858g(r8)     // Catch:{ all -> 0x0150 }
            com.google.common.b.gu r4 = com.google.common.p4522b.C58485gu.m89846n(r4)     // Catch:{ all -> 0x0150 }
            r9.copyOnWrite()     // Catch:{ all -> 0x0150 }
            com.google.protobuf.bv r5 = r9.instance     // Catch:{ all -> 0x0150 }
            com.google.android.apps.gsa.assistant.shared.l.ab r5 = (com.google.android.apps.gsa.assistant.shared.l.ab) r5     // Catch:{ all -> 0x0150 }
            r5.a()     // Catch:{ all -> 0x0150 }
            com.google.protobuf.cq r5 = r5.e     // Catch:{ all -> 0x0150 }
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r4, (java.util.List) r5)     // Catch:{ all -> 0x0150 }
            com.google.protobuf.bv r4 = r9.build()     // Catch:{ all -> 0x0150 }
            com.google.android.apps.gsa.assistant.shared.l.ab r4 = (com.google.android.apps.gsa.assistant.shared.l.ab) r4     // Catch:{ all -> 0x0150 }
            r3.put(r6, r4)     // Catch:{ all -> 0x0150 }
            goto L_0x014b
        L_0x0145:
            r13 = r5
            r7 = 4
            r17 = 2
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0150 }
        L_0x014b:
            r5 = r13
            r4 = 4
        L_0x014d:
            r13 = 1
            goto L_0x006b
        L_0x0150:
            r0 = move-exception
            goto L_0x0159
        L_0x0152:
            r13 = r5
            r13.close()     // Catch:{ IllegalArgumentException -> 0x017a }
            goto L_0x018f
        L_0x0157:
            r0 = move-exception
            r13 = r5
        L_0x0159:
            r4 = r0
        L_0x015a:
            r13.close()     // Catch:{ all -> 0x015e }
            goto L_0x0178
        L_0x015e:
            r0 = move-exception
            r5 = r0
            r6 = 1
            java.lang.Class[] r0 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x0178 }
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            r7 = 0
            r0[r7] = r6     // Catch:{ Exception -> 0x0178 }
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            java.lang.String r8 = "addSuppressed"
            java.lang.reflect.Method r0 = r6.getDeclaredMethod(r8, r0)     // Catch:{ Exception -> 0x0178 }
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0178 }
            r6[r7] = r5     // Catch:{ Exception -> 0x0178 }
            r0.invoke(r4, r6)     // Catch:{ Exception -> 0x0178 }
        L_0x0178:
            throw r4     // Catch:{ IllegalArgumentException -> 0x017a }
        L_0x0179:
            return
        L_0x017a:
            r0 = move-exception
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.opa.zerostate.p8631e.C114728h.f318361a
            com.google.common.f.x r4 = r4.mo56225c()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r6 = "ZSSmsManager"
            r4.mo56378ag(r5, r6)
            java.lang.String r5 = "Error reading params from ContentProvider"
            r6 = 29378(0x72c2, float:4.1167E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56382g(r0)).mo56372aa(r6)).mo56386p(r5)
        L_0x018f:
            com.google.common.util.concurrent.SettableFuture r0 = r2.f318366f
            r0.mo57356n(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.zerostate.p8631e.C114727g.run():void");
    }
}
