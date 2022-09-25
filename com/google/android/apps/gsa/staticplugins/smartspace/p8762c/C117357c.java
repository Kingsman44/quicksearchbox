package com.google.android.apps.gsa.staticplugins.smartspace.p8762c;

import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.c.c */
/* compiled from: PG */
public final /* synthetic */ class C117357c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C117358d f325789a;

    public /* synthetic */ C117357c(C117358d dVar) {
        this.f325789a = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x012e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r13) {
        /*
            r12 = this;
            com.google.android.apps.gsa.staticplugins.smartspace.c.d r0 = r12.f325789a
            com.google.common.base.ax r13 = (com.google.common.base.C58833ax) r13
            boolean r1 = r13.mo56113h()
            if (r1 == 0) goto L_0x01e0
            java.lang.Object r13 = r13.mo56107c()
            com.google.assistant.c.do r13 = (com.google.assistant.p3886c.C50818do) r13
            com.google.protobuf.bn r1 = r13.toBuilder()
            com.google.assistant.c.cn r1 = (com.google.assistant.p3886c.C50790cn) r1
            int r2 = r13.f132304a
            r3 = 33554432(0x2000000, float:9.403955E-38)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0126
            com.google.assistant.c.dj r2 = r13.f132329z
            if (r2 != 0) goto L_0x0023
            com.google.assistant.c.dj r2 = com.google.assistant.p3886c.C50813dj.f132278a
        L_0x0023:
            com.google.protobuf.bt r3 = com.google.assistant.p3886c.C50749bn.f132064d
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)
            r2.mo58887l(r3)
            com.google.protobuf.bf r2 = r2.f169962ag
            com.google.protobuf.bs r3 = r3.f169971d
            boolean r2 = r2.mo58857o(r3)
            if (r2 == 0) goto L_0x0126
            com.google.assistant.c.dj r2 = r13.f132329z
            if (r2 != 0) goto L_0x003c
            com.google.assistant.c.dj r2 = com.google.assistant.p3886c.C50813dj.f132278a
        L_0x003c:
            com.google.protobuf.bt r3 = com.google.assistant.p3886c.C50749bn.f132064d
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)
            r2.mo58887l(r3)
            com.google.protobuf.bf r2 = r2.f169962ag
            com.google.protobuf.bs r4 = r3.f169971d
            java.lang.Object r2 = r2.mo58854l(r4)
            if (r2 != 0) goto L_0x0052
            java.lang.Object r2 = r3.f169969b
            goto L_0x0056
        L_0x0052:
            java.lang.Object r2 = r3.mo58889c(r2)
        L_0x0056:
            com.google.assistant.c.bn r2 = (com.google.assistant.p3886c.C50749bn) r2
            int r3 = r2.f132066a
            r4 = 2
            r5 = 1
            if (r3 != r5) goto L_0x007c
            java.lang.Object r2 = r2.f132067b
            com.google.android.apps.gsa.shared.h.h r2 = (com.google.android.apps.gsa.shared.p7041h.C89776h) r2
            long r6 = r2.f242985e
            int r3 = r2.f242981a
            r8 = r3 & 16
            if (r8 == 0) goto L_0x006d
            long r8 = r2.f242986f
            goto L_0x006e
        L_0x006d:
            r8 = r6
        L_0x006e:
            r3 = r3 & 32
            if (r3 == 0) goto L_0x0079
            java.lang.String r2 = r2.f242987g
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
            goto L_0x009b
        L_0x0079:
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a
            goto L_0x009b
        L_0x007c:
            if (r3 != r4) goto L_0x0123
            java.lang.Object r2 = r2.f132067b
            com.google.android.apps.search.assistant.platform.pcp.f.p r2 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123787p) r2
            long r6 = r2.f341954e
            int r3 = r2.f341950a
            r8 = r3 & 16
            if (r8 == 0) goto L_0x008d
            long r8 = r2.f341955f
            goto L_0x008e
        L_0x008d:
            r8 = r6
        L_0x008e:
            r3 = r3 & 32
            if (r3 == 0) goto L_0x0099
            java.lang.String r2 = r2.f341956g
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
            goto L_0x009b
        L_0x0099:
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a
        L_0x009b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS
            long r6 = r10.toMillis(r6)
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS
            long r8 = r10.toMillis(r8)
            android.content.Context r10 = r0.f325790a
            r11 = 0
            java.lang.CharSequence r10 = com.google.android.apps.gsa.shared.p7019bc.C89407a.m145418a(r10, r6, r11, r11)
            boolean r6 = com.google.android.apps.gsa.shared.util.C90769bm.m148270b(r6, r8)
            if (r6 == 0) goto L_0x00c0
            android.content.Context r6 = r0.f325790a
            java.lang.String r6 = android.text.format.DateUtils.formatDateTime(r6, r8, r5)
            goto L_0x00c6
        L_0x00c0:
            android.content.Context r6 = r0.f325790a
            java.lang.CharSequence r6 = com.google.android.apps.gsa.shared.p7019bc.C89407a.m145418a(r6, r8, r11, r11)
        L_0x00c6:
            android.content.Context r0 = r0.f325790a
            java.lang.Object[] r7 = new java.lang.Object[r4]
            r7[r11] = r10
            r7[r5] = r6
            r6 = 2132085531(0x7f150b1b, float:1.9811263E38)
            java.lang.String r0 = r0.getString(r6, r7)
            r3.append(r0)
            boolean r0 = r2.mo56113h()
            if (r0 == 0) goto L_0x00ec
            java.lang.String r0 = " · "
            r3.append(r0)
            java.lang.Object r0 = r2.mo56107c()
            java.lang.String r0 = (java.lang.String) r0
            r3.append(r0)
        L_0x00ec:
            com.google.assistant.c.b.h r0 = com.google.assistant.p3886c.p3888b.C50723h.f131999e
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.c.b.a r0 = (com.google.assistant.p3886c.p3888b.C50716a) r0
            java.lang.String r2 = r3.toString()
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.assistant.c.b.h r3 = (com.google.assistant.p3886c.p3888b.C50723h) r3
            int r6 = r3.f132001a
            r5 = r5 | r6
            r3.f132001a = r5
            r3.f132002b = r2
            com.google.assistant.c.b.g r2 = com.google.assistant.p3886c.p3888b.C50722g.END
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.assistant.c.b.h r3 = (com.google.assistant.p3886c.p3888b.C50723h) r3
            int r2 = r2.f131998e
            r3.f132003c = r2
            int r2 = r3.f132001a
            r2 = r2 | r4
            r3.f132001a = r2
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.c.b.h r0 = (com.google.assistant.p3886c.p3888b.C50723h) r0
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x0128
        L_0x0123:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x0128
        L_0x0126:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x0128:
            boolean r2 = r0.mo56113h()
            if (r2 == 0) goto L_0x01d6
            java.lang.Object r0 = r0.mo56107c()
            com.google.assistant.c.b.h r0 = (com.google.assistant.p3886c.p3888b.C50723h) r0
            com.google.assistant.c.cz r2 = r13.f132309f
            if (r2 != 0) goto L_0x013a
            com.google.assistant.c.cz r2 = com.google.assistant.p3886c.C50802cz.f132236g
        L_0x013a:
            com.google.protobuf.bn r2 = r2.toBuilder()
            com.google.assistant.c.cy r2 = (com.google.assistant.p3886c.C50801cy) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.assistant.c.cz r3 = (com.google.assistant.p3886c.C50802cz) r3
            r0.getClass()
            r3.f132241d = r0
            int r4 = r3.f132238a
            r4 = r4 | 4
            r3.f132238a = r4
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.c.cz r2 = (com.google.assistant.p3886c.C50802cz) r2
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.assistant.c.do r3 = (com.google.assistant.p3886c.C50818do) r3
            r2.getClass()
            r3.f132309f = r2
            int r2 = r3.f132304a
            r2 = r2 | 16
            r3.f132304a = r2
            com.google.assistant.c.cz r2 = r13.f132311h
            if (r2 != 0) goto L_0x0170
            com.google.assistant.c.cz r2 = com.google.assistant.p3886c.C50802cz.f132236g
        L_0x0170:
            com.google.protobuf.bn r2 = r2.toBuilder()
            com.google.assistant.c.cy r2 = (com.google.assistant.p3886c.C50801cy) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.assistant.c.cz r3 = (com.google.assistant.p3886c.C50802cz) r3
            r0.getClass()
            r3.f132241d = r0
            int r4 = r3.f132238a
            r4 = r4 | 4
            r3.f132238a = r4
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.c.cz r2 = (com.google.assistant.p3886c.C50802cz) r2
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.assistant.c.do r3 = (com.google.assistant.p3886c.C50818do) r3
            r2.getClass()
            r3.f132311h = r2
            int r2 = r3.f132304a
            r2 = r2 | 64
            r3.f132304a = r2
            com.google.assistant.c.cz r13 = r13.f132308e
            if (r13 != 0) goto L_0x01a6
            com.google.assistant.c.cz r13 = com.google.assistant.p3886c.C50802cz.f132236g
        L_0x01a6:
            com.google.protobuf.bn r13 = r13.toBuilder()
            com.google.assistant.c.cy r13 = (com.google.assistant.p3886c.C50801cy) r13
            r13.copyOnWrite()
            com.google.protobuf.bv r2 = r13.instance
            com.google.assistant.c.cz r2 = (com.google.assistant.p3886c.C50802cz) r2
            r0.getClass()
            r2.f132241d = r0
            int r0 = r2.f132238a
            r0 = r0 | 4
            r2.f132238a = r0
            com.google.protobuf.bv r13 = r13.build()
            com.google.assistant.c.cz r13 = (com.google.assistant.p3886c.C50802cz) r13
            r1.copyOnWrite()
            com.google.protobuf.bv r0 = r1.instance
            com.google.assistant.c.do r0 = (com.google.assistant.p3886c.C50818do) r0
            r13.getClass()
            r0.f132308e = r13
            int r13 = r0.f132304a
            r13 = r13 | 8
            r0.f132304a = r13
        L_0x01d6:
            com.google.protobuf.bv r13 = r1.build()
            com.google.assistant.c.do r13 = (com.google.assistant.p3886c.C50818do) r13
            com.google.common.base.ax r13 = com.google.common.base.C58833ax.m90834k(r13)
        L_0x01e0:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.smartspace.p8762c.C117357c.apply(java.lang.Object):java.lang.Object");
    }
}
