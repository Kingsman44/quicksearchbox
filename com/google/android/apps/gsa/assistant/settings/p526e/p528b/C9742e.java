package com.google.android.apps.gsa.assistant.settings.p526e.p528b;

import com.google.android.apps.gsa.shared.util.p7184t.C91096f;

/* renamed from: com.google.android.apps.gsa.assistant.settings.e.b.e */
/* compiled from: PG */
public final /* synthetic */ class C9742e implements C91096f {

    /* renamed from: a */
    public final /* synthetic */ C9743f f33639a;

    public /* synthetic */ C9742e(C9743f fVar) {
        this.f33639a = fVar;
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: hg */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo17703hg(int r10, android.content.Intent r11, android.content.Context r12) {
        /*
            r9 = this;
            com.google.android.apps.gsa.assistant.settings.e.b.f r10 = r9.f33639a
            r12 = 1
            if (r11 != 0) goto L_0x0007
            goto L_0x01bf
        L_0x0007:
            android.net.Uri r1 = r11.getData()
            r11 = 0
            if (r1 != 0) goto L_0x0011
        L_0x000e:
            r12 = 0
            goto L_0x01bf
        L_0x0011:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            android.content.ContentResolver r0 = r10.f33642c
            java.lang.String[] r2 = com.google.android.apps.gsa.assistant.settings.p526e.p528b.C9743f.f33640a
            r3 = 0
            r4 = 0
            r5 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5)
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L_0x01bb
            boolean r3 = r0.moveToFirst()
            if (r3 != 0) goto L_0x002a
            goto L_0x01bb
        L_0x002a:
            com.google.assistant.at.za r3 = com.google.assistant.p3861at.C50491za.f131389g
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.at.yx r3 = (com.google.assistant.p3861at.C50487yx) r3
            java.lang.String r4 = "photo_uri"
            int r4 = r0.getColumnIndex(r4)
            if (r4 < 0) goto L_0x004f
            java.lang.String r4 = r0.getString(r4)
            if (r4 == 0) goto L_0x004f
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.assistant.at.za r5 = (com.google.assistant.p3861at.C50491za) r5
            int r6 = r5.f131391a
            r6 = r6 | 4
            r5.f131391a = r6
            r5.f131394d = r4
        L_0x004f:
            java.lang.String r4 = "_id"
            int r4 = r0.getColumnIndex(r4)
            if (r4 < 0) goto L_0x01bb
            boolean r5 = r0.isNull(r4)
            if (r5 != 0) goto L_0x01bb
            long r4 = r0.getLong(r4)
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r0.close()
            com.google.android.apps.gsa.contacts.m r0 = r10.f33643d
            long r4 = r2.longValue()
            com.google.common.b.hd r2 = com.google.common.p4522b.C58729pv.f156485a
            com.google.android.apps.gsa.search.shared.contact.c r6 = com.google.android.apps.gsa.search.shared.contact.C87515c.PERSON
            com.google.android.apps.gsa.search.shared.contact.c r7 = com.google.android.apps.gsa.search.shared.contact.C87515c.EMAIL
            com.google.android.apps.gsa.search.shared.contact.c r8 = com.google.android.apps.gsa.search.shared.contact.C87515c.PHONE_NUMBER
            com.google.common.b.ij r6 = com.google.common.p4522b.C58528ij.m90012L(r6, r7, r8)
            java.util.Map r2 = com.google.android.apps.gsa.contacts.cl.d(r2)
            com.google.android.apps.gsa.search.shared.contact.Person r0 = r0.a(r4, r2, r6)
            if (r0 == 0) goto L_0x0195
            java.util.List r2 = r0.f236378i
            com.google.common.b.gu r2 = com.google.common.p4522b.C58485gu.m89842j(r2)
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x00b5
            java.util.List r2 = r0.f236378i
            com.google.common.b.gu r2 = com.google.common.p4522b.C58485gu.m89842j(r2)
            java.lang.Object r2 = r2.get(r11)
            com.google.android.apps.gsa.search.shared.contact.Contact r2 = (com.google.android.apps.gsa.search.shared.contact.Contact) r2
            java.lang.String r2 = r2.f236354e
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L_0x00b5
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.assistant.at.za r4 = (com.google.assistant.p3861at.C50491za) r4
            r2.getClass()
            int r5 = r4.f131391a
            r5 = r5 | r12
            r4.f131391a = r5
            r4.f131392b = r2
        L_0x00b5:
            java.lang.String r2 = r0.f236373d
            if (r2 == 0) goto L_0x00cd
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L_0x00cd
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.assistant.at.za r4 = (com.google.assistant.p3861at.C50491za) r4
            int r5 = r4.f131391a
            r5 = r5 | r1
            r4.f131391a = r5
            r4.f131393c = r2
        L_0x00cd:
            java.util.List r2 = r0.f236375f
            com.google.common.b.gu r2 = com.google.common.p4522b.C58485gu.m89842j(r2)
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0115
            java.util.List r2 = r0.f236375f
            com.google.common.b.gu r2 = com.google.common.p4522b.C58485gu.m89842j(r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x00e3:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0115
            java.lang.Object r4 = r2.next()
            com.google.android.apps.gsa.search.shared.contact.Contact r4 = (com.google.android.apps.gsa.search.shared.contact.Contact) r4
            java.lang.String r4 = r4.f236354e
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x00e3
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.assistant.at.za r5 = (com.google.assistant.p3861at.C50491za) r5
            r4.getClass()
            com.google.protobuf.cq r6 = r5.f131395e
            boolean r7 = r6.mo58948c()
            if (r7 != 0) goto L_0x010f
            com.google.protobuf.cq r6 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r6)
            r5.f131395e = r6
        L_0x010f:
            com.google.protobuf.cq r5 = r5.f131395e
            r5.add(r4)
            goto L_0x00e3
        L_0x0115:
            java.util.List r2 = r0.f236374e
            com.google.common.b.gu r2 = com.google.common.p4522b.C58485gu.m89842j(r2)
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0195
            java.util.List r0 = r0.f236374e
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89842j(r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x012b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0195
            java.lang.Object r2 = r0.next()
            com.google.android.apps.gsa.search.shared.contact.Contact r2 = (com.google.android.apps.gsa.search.shared.contact.Contact) r2
            java.lang.String r4 = r2.f236354e
            java.lang.String r2 = r2.f236355f
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x012b
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 != 0) goto L_0x012b
            com.google.assistant.at.yz r5 = com.google.assistant.p3861at.C50489yz.f131384d
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.at.yy r5 = (com.google.assistant.p3861at.C50488yy) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.assistant.at.yz r6 = (com.google.assistant.p3861at.C50489yz) r6
            r4.getClass()
            int r7 = r6.f131386a
            r7 = r7 | r12
            r6.f131386a = r7
            r6.f131387b = r4
            r5.copyOnWrite()
            com.google.protobuf.bv r4 = r5.instance
            com.google.assistant.at.yz r4 = (com.google.assistant.p3861at.C50489yz) r4
            r2.getClass()
            int r6 = r4.f131386a
            r6 = r6 | r1
            r4.f131386a = r6
            r4.f131388c = r2
            com.google.protobuf.bv r2 = r5.build()
            com.google.assistant.at.yz r2 = (com.google.assistant.p3861at.C50489yz) r2
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.assistant.at.za r4 = (com.google.assistant.p3861at.C50491za) r4
            r2.getClass()
            com.google.protobuf.cq r5 = r4.f131396f
            boolean r6 = r5.mo58948c()
            if (r6 != 0) goto L_0x018f
            com.google.protobuf.cq r5 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r5)
            r4.f131396f = r5
        L_0x018f:
            com.google.protobuf.cq r4 = r4.f131396f
            r4.add(r2)
            goto L_0x012b
        L_0x0195:
            com.google.assistant.at.zc r0 = com.google.assistant.p3861at.C50493zc.f131397c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.at.zb r0 = (com.google.assistant.p3861at.C50492zb) r0
            com.google.protobuf.bv r2 = r3.build()
            com.google.assistant.at.za r2 = (com.google.assistant.p3861at.C50491za) r2
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.assistant.at.zc r3 = (com.google.assistant.p3861at.C50493zc) r3
            r2.getClass()
            r3.f131400b = r2
            int r2 = r3.f131399a
            r2 = r2 | r12
            r3.f131399a = r2
            com.google.protobuf.bv r0 = r0.build()
            r2 = r0
            com.google.assistant.at.zc r2 = (com.google.assistant.p3861at.C50493zc) r2
        L_0x01bb:
            if (r2 != 0) goto L_0x01c0
            goto L_0x000e
        L_0x01bf:
            return r12
        L_0x01c0:
            com.google.android.apps.gsa.assistant.settings.e.c r10 = r10.f33641b
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r3 = "contactPickerNativeInterface"
            r0[r11] = r3
            byte[] r11 = r2.toByteArray()
            java.lang.String r11 = android.util.Base64.encodeToString(r11, r1)
            r0[r12] = r11
            java.lang.String r11 = "%s.onContactSelected('%s')"
            java.lang.String r11 = java.lang.String.format(r11, r0)
            r10.mo18014a(r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.p526e.p528b.C9742e.mo17703hg(int, android.content.Intent, android.content.Context):boolean");
    }
}
