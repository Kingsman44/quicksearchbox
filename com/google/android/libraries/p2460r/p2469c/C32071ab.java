package com.google.android.libraries.p2460r.p2469c;

import com.google.p4283bv.p4354e.p4367c.p4368a.C57362an;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57368at;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57369au;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57376ba;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57383bh;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57404cb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.libraries.r.c.ab */
/* compiled from: PG */
final class C32071ab extends C32140r {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C32071ab(android.content.Context r5, com.google.android.libraries.p2460r.p2469c.C32127e r6) {
        /*
            r4 = this;
            com.google.android.libraries.r.c.ac r0 = r6.f86274c
            com.google.android.libraries.r.c.a.b r0 = r0.f86117a
            com.google.android.libraries.r.b.a.b r0 = r0.f86114e
            com.google.android.libraries.r.c.b.g r1 = new com.google.android.libraries.r.c.b.g
            r1.<init>(r5, r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r2 = -1
            r3 = -2
            r0.<init>(r2, r3)
            r1.setLayoutParams(r0)
            r0 = 0
            r1.setBaselineAligned(r0)
            r1.setClipToPadding(r0)
            com.google.android.libraries.r.c.av r0 = com.google.android.libraries.p2460r.p2469c.C32070aa.f86178a
            r4.<init>(r5, r6, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p2460r.p2469c.C32071ab.<init>(android.content.Context, com.google.android.libraries.r.c.e):void");
    }

    /* renamed from: t */
    static final List m59756t(C57383bh bhVar) {
        ArrayList arrayList = new ArrayList();
        for (C57376ba baVar : bhVar.f153292a) {
            C57362an anVar = baVar.f153281d;
            if (anVar == null) {
                anVar = C57362an.f153241c;
            }
            arrayList.add(anVar);
        }
        arrayList.trimToSize();
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ List mo37851p(Object obj) {
        return m59756t((C57383bh) obj);
    }

    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: type inference failed for: r6v34 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r6v2, types: [boolean, int] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x019c A[SYNTHETIC] */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo37853w(java.lang.Object r18, com.google.android.libraries.p2460r.p2469c.C32148z r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = r18
            com.google.bv.e.c.a.bh r2 = (com.google.p4283bv.p4354e.p4367c.p4368a.C57383bh) r2
            java.util.List r3 = m59756t(r2)
            super.mo37952r(r3, r1)
            com.google.protobuf.cq r3 = r2.f153292a
            int r3 = r3.size()
            int[] r4 = r0.f86321n
            int r4 = r4.length
            r5 = 0
            r6 = 1
            if (r3 != r4) goto L_0x001e
            r3 = 1
            goto L_0x001f
        L_0x001e:
            r3 = 0
        L_0x001f:
            r4 = 2
            java.lang.Object[] r7 = new java.lang.Object[r4]
            com.google.protobuf.cq r8 = r2.f153292a
            int r8 = r8.size()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r5] = r8
            int[] r8 = r0.f86321n
            int r8 = r8.length
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r6] = r8
            java.lang.String r8 = "Mismatch between number of cells (%s) and adaptersPerContent (%s); problem in creation?"
            com.google.android.libraries.p2460r.p2464b.C32050a.m59726a(r3, r8, r7)
            r3 = 0
            r7 = 0
        L_0x003e:
            com.google.protobuf.cq r8 = r2.f153292a
            int r8 = r8.size()
            if (r3 >= r8) goto L_0x01b1
            com.google.protobuf.cq r8 = r2.f153292a
            java.lang.Object r8 = r8.get(r3)
            com.google.bv.e.c.a.ba r8 = (com.google.p4283bv.p4354e.p4367c.p4368a.C57376ba) r8
            r9 = 0
        L_0x004f:
            int[] r10 = r0.f86321n
            r10 = r10[r3]
            if (r9 >= r10) goto L_0x01a9
            java.util.List r10 = r0.f86320a
            java.lang.Object r10 = r10.get(r7)
            com.google.android.libraries.r.c.p r10 = (com.google.android.libraries.p2460r.p2469c.C32138p) r10
            int r11 = r8.f153279b
            r12 = 4
            if (r11 != r12) goto L_0x0067
            java.lang.Object r11 = r8.f153280c
            com.google.bv.e.c.a.bf r11 = (com.google.p4283bv.p4354e.p4367c.p4368a.C57381bf) r11
            goto L_0x0092
        L_0x0067:
            r12 = 5
            if (r11 != r12) goto L_0x0091
            java.lang.Object r11 = r8.f153280c
            com.google.bv.e.c.a.u r11 = (com.google.p4283bv.p4354e.p4367c.p4368a.C57513u) r11
            java.util.Map r12 = r1.f86341h
            java.lang.String r11 = r11.f153628a
            java.lang.Object r11 = r12.get(r11)
            com.google.bv.e.c.a.ak r11 = (com.google.p4283bv.p4354e.p4367c.p4368a.C57359ak) r11
            if (r11 == 0) goto L_0x0084
            int r12 = r11.f153235a
            r12 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r12 == 0) goto L_0x0084
            com.google.bv.e.c.a.ak r11 = com.google.android.libraries.p2460r.p2469c.p2470a.C32063f.m59746a(r11)
        L_0x0084:
            if (r11 == 0) goto L_0x0091
            int r12 = r11.f153236b
            r14 = 9
            if (r12 != r14) goto L_0x0091
            java.lang.Object r11 = r11.f153237c
            com.google.bv.e.c.a.bf r11 = (com.google.p4283bv.p4354e.p4367c.p4368a.C57381bf) r11
            goto L_0x0092
        L_0x0091:
            r11 = 0
        L_0x0092:
            r12 = -2
            r14 = 0
            if (r11 == 0) goto L_0x00a8
            int r15 = r11.f153286a
            int r15 = com.google.p4283bv.p4354e.p4367c.p4368a.C57380be.m88336a(r15)
            if (r15 == r4) goto L_0x00a8
            boolean r15 = r11.f153288c
            if (r15 == 0) goto L_0x00a8
            com.google.android.libraries.r.c.b.f r15 = new com.google.android.libraries.r.c.b.f
            r15.<init>(r12, r14, r6)
            goto L_0x00af
        L_0x00a8:
            com.google.android.libraries.r.c.b.f r15 = new com.google.android.libraries.r.c.b.f
            r13 = 1065353216(0x3f800000, float:1.0)
            r15.<init>(r5, r13, r5)
        L_0x00af:
            if (r11 == 0) goto L_0x0179
            int r13 = r11.f153286a
            int r16 = com.google.p4283bv.p4354e.p4367c.p4368a.C57380be.m88336a(r13)
            int r12 = r16 + -1
            if (r16 == 0) goto L_0x0177
            if (r12 == 0) goto L_0x0158
            if (r12 == r6) goto L_0x0144
            java.lang.String r13 = "Invalid content width: %s"
            r14 = 3
            if (r12 == r4) goto L_0x00eb
            com.google.bv.e.c.a.cb r12 = com.google.p4283bv.p4354e.p4367c.p4368a.C57404cb.ERR_GRID_CELL_WIDTH_WITHOUT_CONTENTS
            java.lang.Object[] r4 = new java.lang.Object[r6]
            int r6 = r11.f153286a
            if (r6 != r14) goto L_0x00da
            java.lang.Object r6 = r11.f153287b
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r6 = com.google.p4283bv.p4354e.p4367c.p4368a.C57379bd.m88335b(r6)
            if (r6 != 0) goto L_0x00db
        L_0x00da:
            r6 = 1
        L_0x00db:
            java.lang.String r6 = com.google.p4283bv.p4354e.p4367c.p4368a.C57379bd.m88334a(r6)
            r4[r5] = r6
            java.lang.String r4 = java.lang.String.format(r13, r4)
            r6 = 2
            r1.mo37967i(r6, r12, r4)
            goto L_0x0179
        L_0x00eb:
            r4 = 0
            r15.weight = r4
            r4 = -2
            r15.width = r4
            int r4 = r11.f153286a
            if (r4 != r14) goto L_0x0103
            java.lang.Object r4 = r11.f153287b
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r4 = com.google.p4283bv.p4354e.p4367c.p4368a.C57379bd.m88335b(r4)
            if (r4 != 0) goto L_0x0104
        L_0x0103:
            r4 = 1
        L_0x0104:
            r6 = -1
            int r4 = r4 + r6
            r6 = 1
            if (r4 == r6) goto L_0x0130
            com.google.bv.e.c.a.cb r4 = com.google.p4283bv.p4354e.p4367c.p4368a.C57404cb.ERR_GRID_CELL_WIDTH_WITHOUT_CONTENTS
            java.lang.Object[] r12 = new java.lang.Object[r6]
            int r6 = r11.f153286a
            if (r6 != r14) goto L_0x011f
            java.lang.Object r6 = r11.f153287b
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r6 = com.google.p4283bv.p4354e.p4367c.p4368a.C57379bd.m88335b(r6)
            if (r6 != 0) goto L_0x0120
        L_0x011f:
            r6 = 1
        L_0x0120:
            java.lang.String r6 = com.google.p4283bv.p4354e.p4367c.p4368a.C57379bd.m88334a(r6)
            r12[r5] = r6
            java.lang.String r6 = java.lang.String.format(r13, r12)
            r12 = 2
            r1.mo37967i(r12, r4, r6)
            r6 = -1
            goto L_0x017b
        L_0x0130:
            r12 = 2
            int r4 = r10.f86308l
            r6 = -1
            if (r4 != r6) goto L_0x013e
            com.google.bv.e.c.a.cb r4 = com.google.p4283bv.p4354e.p4367c.p4368a.C57404cb.ERR_UNSUPPORTED_FEATURE
            java.lang.String r11 = "FIT_PARENT width is invalid for CONTENT_WIDTH cell contents."
            r1.mo37967i(r12, r4, r11)
            goto L_0x017b
        L_0x013e:
            r11 = -3
            if (r4 == r11) goto L_0x017b
            r15.width = r4
            goto L_0x017b
        L_0x0144:
            r6 = -1
            r12 = 2
            if (r13 != r12) goto L_0x0151
            java.lang.Object r4 = r11.f153287b
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            goto L_0x0152
        L_0x0151:
            r4 = 0
        L_0x0152:
            float r4 = (float) r4
            r15.weight = r4
            r15.width = r5
            goto L_0x017b
        L_0x0158:
            r4 = 0
            r6 = -1
            r12 = 2
            r15.weight = r4
            int r4 = r11.f153286a
            r13 = 1
            if (r4 != r13) goto L_0x016b
            java.lang.Object r4 = r11.f153287b
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            goto L_0x016c
        L_0x016b:
            r4 = 0
        L_0x016c:
            float r4 = (float) r4
            android.content.Context r11 = r0.f86298b
            float r4 = com.google.android.libraries.p2460r.p2464b.p2468d.C32056a.m59733a(r4, r11)
            int r4 = (int) r4
            r15.width = r4
            goto L_0x017c
        L_0x0177:
            r4 = 0
            throw r4
        L_0x0179:
            r6 = -1
            r12 = 2
        L_0x017b:
            r13 = 1
        L_0x017c:
            int r4 = r10.f86309m
            r11 = -3
            if (r4 != r11) goto L_0x0182
            r4 = -1
        L_0x0182:
            r15.height = r4
            com.google.android.libraries.r.c.ay r4 = r10.mo37940f()
            android.content.Context r6 = r0.f86298b
            r4.mo37878h(r6, r15)
            java.lang.Object r4 = r10.f86301e
            r6 = 48
            if (r4 != 0) goto L_0x0194
            goto L_0x019c
        L_0x0194:
            com.google.android.libraries.r.c.ay r4 = r10.mo37940f()
            int r6 = r4.mo37871b(r6)
        L_0x019c:
            r15.gravity = r6
            r10.mo37944j(r15)
            int r7 = r7 + 1
            int r9 = r9 + 1
            r4 = 2
            r6 = 1
            goto L_0x004f
        L_0x01a9:
            r12 = 2
            r13 = 1
            int r3 = r3 + 1
            r4 = 2
            r6 = 1
            goto L_0x003e
        L_0x01b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p2460r.p2469c.C32071ab.mo37853w(java.lang.Object, com.google.android.libraries.r.c.z):void");
    }

    /* renamed from: v */
    public final /* bridge */ /* synthetic */ Object mo37852v(C57369au auVar) {
        if (auVar.f153257b == 5) {
            return (C57383bh) auVar.f153258c;
        }
        throw new C32083an(C57404cb.ERR_MISSING_ELEMENT_CONTENTS, String.format("Missing GridRow; has %s", new Object[]{C57368at.m88332a(C57368at.m88333b(auVar.f153257b))}));
    }
}
