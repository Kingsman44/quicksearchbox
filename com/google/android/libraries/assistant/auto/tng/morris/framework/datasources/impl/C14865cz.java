package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.common.p4526f.C59071e;

@Deprecated
/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.cz */
/* compiled from: PG */
public final class C14865cz {

    /* renamed from: a */
    public static final C59071e f44747a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.cz");

    /* renamed from: b */
    private final C86124t f44748b;

    public C14865cz(C86124t tVar) {
        this.f44748b = tVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p3186j$.util.Optional mo21784a(com.google.assistant.p3897e.p3921j.p3926e.C51953ff r19) {
        /*
            r18 = this;
            r0 = r19
            com.google.assistant.e.j.e.ep r1 = com.google.assistant.p3897e.p3921j.p3926e.C51936ep.MESSAGE
            int r2 = r0.f136323g
            com.google.assistant.e.j.e.ep r2 = com.google.assistant.p3897e.p3921j.p3926e.C51936ep.m86435a(r2)
            if (r2 != 0) goto L_0x000e
            com.google.assistant.e.j.e.ep r2 = com.google.assistant.p3897e.p3921j.p3926e.C51936ep.DEFAULT
        L_0x000e:
            boolean r1 = r1.equals(r2)
            java.lang.String r2 = "contact_form_field_id"
            r5 = 1
            if (r1 == 0) goto L_0x032a
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            boolean r1 = r0.f136322f
            if (r1 == 0) goto L_0x0039
            r1 = r18
            com.google.android.apps.gsa.search.core.i.t r0 = r1.f44748b
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248842ax
            boolean r0 = r0.mo79746e(r2)
            if (r0 == 0) goto L_0x0033
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r0 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14741k.m31042d()
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x0329
        L_0x0033:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            goto L_0x0329
        L_0x0039:
            r1 = r18
            com.google.protobuf.cq r0 = r0.f136319c
            java.util.Iterator r0 = r0.iterator()
            r8 = 0
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x0048:
            boolean r15 = r0.hasNext()
            if (r15 == 0) goto L_0x0187
            java.lang.Object r15 = r0.next()
            com.google.assistant.e.j.e.fa r15 = (com.google.assistant.p3897e.p3921j.p3926e.C51948fa) r15
            com.google.protobuf.cq r15 = r15.f136299d
            java.util.Iterator r15 = r15.iterator()
        L_0x005a:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L_0x0048
            java.lang.Object r16 = r15.next()
            r7 = r16
            com.google.assistant.e.j.e.ew r7 = (com.google.assistant.p3897e.p3921j.p3926e.C51943ew) r7
            com.google.protobuf.cq r7 = r7.f136288b
            java.util.Iterator r7 = r7.iterator()
        L_0x006e:
            boolean r16 = r7.hasNext()
            if (r16 == 0) goto L_0x005a
            java.lang.Object r16 = r7.next()
            r4 = r16
            com.google.assistant.e.j.e.eu r4 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r4
            java.lang.String r6 = r4.f136279g
            int r17 = r6.hashCode()
            switch(r17) {
                case -1853819460: goto L_0x00a4;
                case -1129697858: goto L_0x009a;
                case -1065052621: goto L_0x0090;
                case 1283970937: goto L_0x0086;
                default: goto L_0x0085;
            }
        L_0x0085:
            goto L_0x00ac
        L_0x0086:
            java.lang.String r3 = "change_button_id"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x00ac
            r3 = 2
            goto L_0x00ad
        L_0x0090:
            java.lang.String r3 = "reply_button_id"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x00ac
            r3 = 3
            goto L_0x00ad
        L_0x009a:
            java.lang.String r3 = "confirmation_button_id"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x00ac
            r3 = 1
            goto L_0x00ad
        L_0x00a4:
            boolean r3 = r6.equals(r2)
            if (r3 == 0) goto L_0x00ac
            r3 = 0
            goto L_0x00ad
        L_0x00ac:
            r3 = -1
        L_0x00ad:
            if (r3 == 0) goto L_0x014d
            r6 = 17
            if (r3 == r5) goto L_0x011d
            r5 = 2
            if (r3 == r5) goto L_0x00ec
            r5 = 3
            if (r3 == r5) goto L_0x00bb
            goto L_0x0184
        L_0x00bb:
            int r3 = r4.f136277e
            if (r3 != r6) goto L_0x00c4
            java.lang.Object r3 = r4.f136278f
            com.google.assistant.e.c.c.ah r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r3
            goto L_0x00c6
        L_0x00c4:
            com.google.assistant.e.c.c.ah r3 = com.google.assistant.p3897e.p3902c.p3907c.C50936ah.f132593m
        L_0x00c6:
            boolean r3 = r3.f132600f
            if (r3 == 0) goto L_0x0184
            int r3 = r4.f136277e
            if (r3 != r6) goto L_0x00d3
            java.lang.Object r3 = r4.f136278f
            com.google.assistant.e.c.c.ah r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r3
            goto L_0x00d5
        L_0x00d3:
            com.google.assistant.e.c.c.ah r3 = com.google.assistant.p3897e.p3902c.p3907c.C50936ah.f132593m
        L_0x00d5:
            int r5 = r3.f132598d
            r6 = 3
            if (r5 != r6) goto L_0x00df
            java.lang.Object r3 = r3.f132599e
            com.google.assistant.e.c.c.dg r3 = (com.google.assistant.p3897e.p3902c.p3907c.C51016dg) r3
            goto L_0x00e1
        L_0x00df:
            com.google.assistant.e.c.c.dg r3 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x00e1:
            com.google.assistant.e.j.du r3 = r3.f132833e
            if (r3 != 0) goto L_0x00e7
            com.google.assistant.e.j.du r3 = com.google.assistant.p3897e.p3921j.C51805du.f135924e
        L_0x00e7:
            int r12 = r4.f136283k
            r11 = r3
            goto L_0x0184
        L_0x00ec:
            int r3 = r4.f136277e
            if (r3 != r6) goto L_0x00f5
            java.lang.Object r3 = r4.f136278f
            com.google.assistant.e.c.c.ah r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r3
            goto L_0x00f7
        L_0x00f5:
            com.google.assistant.e.c.c.ah r3 = com.google.assistant.p3897e.p3902c.p3907c.C50936ah.f132593m
        L_0x00f7:
            boolean r3 = r3.f132600f
            if (r3 == 0) goto L_0x0184
            int r3 = r4.f136277e
            if (r3 != r6) goto L_0x0104
            java.lang.Object r3 = r4.f136278f
            com.google.assistant.e.c.c.ah r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r3
            goto L_0x0106
        L_0x0104:
            com.google.assistant.e.c.c.ah r3 = com.google.assistant.p3897e.p3902c.p3907c.C50936ah.f132593m
        L_0x0106:
            int r5 = r3.f132598d
            r6 = 3
            if (r5 != r6) goto L_0x0110
            java.lang.Object r3 = r3.f132599e
            com.google.assistant.e.c.c.dg r3 = (com.google.assistant.p3897e.p3902c.p3907c.C51016dg) r3
            goto L_0x0112
        L_0x0110:
            com.google.assistant.e.c.c.dg r3 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x0112:
            com.google.assistant.e.j.du r3 = r3.f132833e
            if (r3 != 0) goto L_0x0118
            com.google.assistant.e.j.du r3 = com.google.assistant.p3897e.p3921j.C51805du.f135924e
        L_0x0118:
            int r13 = r4.f136283k
            r9 = r3
            goto L_0x0184
        L_0x011d:
            int r3 = r4.f136277e
            if (r3 != r6) goto L_0x0126
            java.lang.Object r3 = r4.f136278f
            com.google.assistant.e.c.c.ah r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r3
            goto L_0x0128
        L_0x0126:
            com.google.assistant.e.c.c.ah r3 = com.google.assistant.p3897e.p3902c.p3907c.C50936ah.f132593m
        L_0x0128:
            boolean r3 = r3.f132600f
            if (r3 == 0) goto L_0x0184
            int r3 = r4.f136277e
            if (r3 != r6) goto L_0x0135
            java.lang.Object r3 = r4.f136278f
            com.google.assistant.e.c.c.ah r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r3
            goto L_0x0137
        L_0x0135:
            com.google.assistant.e.c.c.ah r3 = com.google.assistant.p3897e.p3902c.p3907c.C50936ah.f132593m
        L_0x0137:
            int r5 = r3.f132598d
            r6 = 3
            if (r5 != r6) goto L_0x0141
            java.lang.Object r3 = r3.f132599e
            com.google.assistant.e.c.c.dg r3 = (com.google.assistant.p3897e.p3902c.p3907c.C51016dg) r3
            goto L_0x0143
        L_0x0141:
            com.google.assistant.e.c.c.dg r3 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x0143:
            com.google.assistant.e.j.du r3 = r3.f132833e
            if (r3 != 0) goto L_0x0149
            com.google.assistant.e.j.du r3 = com.google.assistant.p3897e.p3921j.C51805du.f135924e
        L_0x0149:
            int r14 = r4.f136283k
            r10 = r3
            goto L_0x0184
        L_0x014d:
            int r3 = r4.f136277e
            r5 = 16
            if (r3 != r5) goto L_0x0158
            java.lang.Object r3 = r4.f136278f
            com.google.assistant.e.c.c.bn r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50969bn) r3
            goto L_0x015a
        L_0x0158:
            com.google.assistant.e.c.c.bn r3 = com.google.assistant.p3897e.p3902c.p3907c.C50969bn.f132678i
        L_0x015a:
            com.google.assistant.e.c.c.bj r3 = r3.f132682c
            if (r3 != 0) goto L_0x0160
            com.google.assistant.e.c.c.bj r3 = com.google.assistant.p3897e.p3902c.p3907c.C50965bj.f132670e
        L_0x0160:
            int r4 = r3.f132675d
            int r5 = com.google.assistant.p3897e.p3902c.p3907c.C50964bi.m85996a(r4)
            if (r5 != 0) goto L_0x0169
            goto L_0x016c
        L_0x0169:
            r6 = 5
            if (r5 == r6) goto L_0x0177
        L_0x016c:
            int r4 = com.google.assistant.p3897e.p3902c.p3907c.C50964bi.m85996a(r4)
            if (r4 != 0) goto L_0x0173
            goto L_0x0184
        L_0x0173:
            r5 = 8
            if (r4 != r5) goto L_0x0184
        L_0x0177:
            int r4 = r3.f132673b
            r5 = 3
            if (r4 != r5) goto L_0x0181
            java.lang.Object r3 = r3.f132674c
            com.google.assistant.e.c.c.hx r3 = (com.google.assistant.p3897e.p3902c.p3907c.C51141hx) r3
            goto L_0x0183
        L_0x0181:
            com.google.assistant.e.c.c.hx r3 = com.google.assistant.p3897e.p3902c.p3907c.C51141hx.f133119h
        L_0x0183:
            r8 = r3
        L_0x0184:
            r5 = 1
            goto L_0x006e
        L_0x0187:
            if (r8 != 0) goto L_0x01c5
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r0 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf.f43796e
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.gt r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt) r0
            com.google.android.libraries.assistant.auto.tng.morris.e.gn r2 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14365gn.f43466q
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.gk r2 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14362gk) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.gn r3 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14365gn) r3
            r4 = 15
            r3.f43468a = r4
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r3 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf) r3
            com.google.protobuf.bv r2 = r2.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.gn r2 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14365gn) r2
            r2.getClass()
            r3.f43801d = r2
            r2 = 3
            r3.f43800c = r2
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf) r0
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x0329
        L_0x01c5:
            java.lang.String r0 = ""
            if (r10 == 0) goto L_0x0252
            if (r9 == 0) goto L_0x0252
            int r2 = r8.f133122b
            r3 = 1
            if (r2 != r3) goto L_0x01d4
            java.lang.Object r0 = r8.f133123c
            java.lang.String r0 = (java.lang.String) r0
        L_0x01d4:
            com.google.assistant.e.c.c.dc r2 = r8.f133126f
            if (r2 != 0) goto L_0x01da
            com.google.assistant.e.c.c.dc r2 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x01da:
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r3 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf.f43796e
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.gt r3 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt) r3
            com.google.android.libraries.assistant.auto.tng.morris.e.iv r4 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14427iv.f43643o
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.iu r4 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14426iu) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.iv r5 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14427iv) r5
            r6 = 11
            r5.f43645a = r6
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.iv r5 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14427iv) r5
            r2.getClass()
            r5.f43650f = r2
            r4.copyOnWrite()
            com.google.protobuf.bv r2 = r4.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.iv r2 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14427iv) r2
            r0.getClass()
            r2.f43647c = r0
            r4.copyOnWrite()
            com.google.protobuf.bv r0 = r4.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.iv r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14427iv) r0
            r0.f43651g = r9
            r4.copyOnWrite()
            com.google.protobuf.bv r0 = r4.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.iv r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14427iv) r0
            r0.f43652h = r10
            r4.copyOnWrite()
            com.google.protobuf.bv r0 = r4.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.iv r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14427iv) r0
            r0.f43657m = r13
            r4.copyOnWrite()
            com.google.protobuf.bv r0 = r4.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.iv r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14427iv) r0
            r0.f43658n = r14
            r3.copyOnWrite()
            com.google.protobuf.bv r0 = r3.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf) r0
            com.google.protobuf.bv r2 = r4.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.iv r2 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14427iv) r2
            r2.getClass()
            r0.f43801d = r2
            r2 = 5
            r0.f43800c = r2
            com.google.protobuf.bv r0 = r3.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf) r0
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x0329
        L_0x0252:
            if (r11 == 0) goto L_0x02c8
            int r2 = r8.f133122b
            r3 = 1
            if (r2 != r3) goto L_0x025d
            java.lang.Object r0 = r8.f133123c
            java.lang.String r0 = (java.lang.String) r0
        L_0x025d:
            com.google.assistant.e.c.c.dc r2 = r8.f133126f
            if (r2 != 0) goto L_0x0263
            com.google.assistant.e.c.c.dc r2 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x0263:
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r3 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf.f43796e
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.gt r3 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt) r3
            com.google.android.libraries.assistant.auto.tng.morris.e.iv r4 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14427iv.f43643o
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.iu r4 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14426iu) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.iv r5 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14427iv) r5
            r6 = 14
            r5.f43645a = r6
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.iv r5 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14427iv) r5
            r2.getClass()
            r5.f43650f = r2
            r4.copyOnWrite()
            com.google.protobuf.bv r2 = r4.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.iv r2 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14427iv) r2
            r0.getClass()
            r2.f43647c = r0
            r4.copyOnWrite()
            com.google.protobuf.bv r0 = r4.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.iv r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14427iv) r0
            r0.f43654j = r11
            r4.copyOnWrite()
            com.google.protobuf.bv r0 = r4.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.iv r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14427iv) r0
            r0.f43656l = r12
            r3.copyOnWrite()
            com.google.protobuf.bv r0 = r3.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf) r0
            com.google.protobuf.bv r2 = r4.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.iv r2 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14427iv) r2
            r2.getClass()
            r0.f43801d = r2
            r2 = 5
            r0.f43800c = r2
            com.google.protobuf.bv r0 = r3.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf) r0
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x0329
        L_0x02c8:
            int r2 = r8.f133122b
            r3 = 1
            if (r2 != r3) goto L_0x02d1
            java.lang.Object r0 = r8.f133123c
            java.lang.String r0 = (java.lang.String) r0
        L_0x02d1:
            com.google.assistant.e.c.c.dc r2 = r8.f133126f
            if (r2 != 0) goto L_0x02d7
            com.google.assistant.e.c.c.dc r2 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x02d7:
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r3 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf.f43796e
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.gt r3 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt) r3
            com.google.android.libraries.assistant.auto.tng.morris.e.iv r4 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14427iv.f43643o
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.iu r4 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14426iu) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.iv r5 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14427iv) r5
            r6 = 10
            r5.f43645a = r6
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.iv r5 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14427iv) r5
            r2.getClass()
            r5.f43650f = r2
            r4.copyOnWrite()
            com.google.protobuf.bv r2 = r4.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.iv r2 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14427iv) r2
            r0.getClass()
            r2.f43647c = r0
            r3.copyOnWrite()
            com.google.protobuf.bv r0 = r3.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf) r0
            com.google.protobuf.bv r2 = r4.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.iv r2 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14427iv) r2
            r2.getClass()
            r0.f43801d = r2
            r2 = 5
            r0.f43800c = r2
            com.google.protobuf.bv r0 = r3.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf) r0
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
        L_0x0329:
            return r0
        L_0x032a:
            r1 = r18
            r3 = 1
            com.google.assistant.e.j.e.ep r4 = com.google.assistant.p3897e.p3921j.p3926e.C51936ep.CALL
            int r5 = r0.f136323g
            com.google.assistant.e.j.e.ep r5 = com.google.assistant.p3897e.p3921j.p3926e.C51936ep.m86435a(r5)
            if (r5 != 0) goto L_0x0339
            com.google.assistant.e.j.e.ep r5 = com.google.assistant.p3897e.p3921j.p3926e.C51936ep.DEFAULT
        L_0x0339:
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x03fa
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.protobuf.cq r0 = r0.f136319c
            java.util.Iterator r0 = r0.iterator()
        L_0x0347:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x03f5
            java.lang.Object r4 = r0.next()
            com.google.assistant.e.j.e.fa r4 = (com.google.assistant.p3897e.p3921j.p3926e.C51948fa) r4
            com.google.protobuf.cq r4 = r4.f136299d
            java.util.Iterator r4 = r4.iterator()
        L_0x0359:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0347
            java.lang.Object r5 = r4.next()
            com.google.assistant.e.j.e.ew r5 = (com.google.assistant.p3897e.p3921j.p3926e.C51943ew) r5
            com.google.protobuf.cq r5 = r5.f136288b
            java.util.Iterator r5 = r5.iterator()
        L_0x036b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0359
            java.lang.Object r6 = r5.next()
            com.google.assistant.e.j.e.eu r6 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r6
            java.lang.String r7 = r6.f136279g
            boolean r7 = r2.equals(r7)
            if (r7 == 0) goto L_0x03ed
            int r7 = r6.f136277e
            r8 = 16
            if (r7 != r8) goto L_0x038a
            java.lang.Object r7 = r6.f136278f
            com.google.assistant.e.c.c.bn r7 = (com.google.assistant.p3897e.p3902c.p3907c.C50969bn) r7
            goto L_0x038c
        L_0x038a:
            com.google.assistant.e.c.c.bn r7 = com.google.assistant.p3897e.p3902c.p3907c.C50969bn.f132678i
        L_0x038c:
            int r7 = r7.f132680a
            r9 = 2
            r7 = r7 & r9
            if (r7 == 0) goto L_0x036b
            int r7 = r6.f136277e
            if (r7 != r8) goto L_0x039b
            java.lang.Object r6 = r6.f136278f
            com.google.assistant.e.c.c.bn r6 = (com.google.assistant.p3897e.p3902c.p3907c.C50969bn) r6
            goto L_0x039d
        L_0x039b:
            com.google.assistant.e.c.c.bn r6 = com.google.assistant.p3897e.p3902c.p3907c.C50969bn.f132678i
        L_0x039d:
            com.google.assistant.e.c.c.bj r6 = r6.f132682c
            if (r6 != 0) goto L_0x03a3
            com.google.assistant.e.c.c.bj r6 = com.google.assistant.p3897e.p3902c.p3907c.C50965bj.f132670e
        L_0x03a3:
            int r6 = r6.f132675d
            int r6 = com.google.assistant.p3897e.p3902c.p3907c.C50964bi.m85996a(r6)
            if (r6 != 0) goto L_0x03ac
            r6 = 1
        L_0x03ac:
            r7 = 6
            if (r6 == r7) goto L_0x03b2
            r7 = 2
            if (r6 != r7) goto L_0x036b
        L_0x03b2:
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r0 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf.f43796e
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.gt r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt) r0
            com.google.android.libraries.assistant.auto.tng.morris.e.gn r2 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14365gn.f43466q
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.gk r2 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14362gk) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.gn r3 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14365gn) r3
            r8 = 16
            r3.f43468a = r8
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r3 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf) r3
            com.google.protobuf.bv r2 = r2.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.gn r2 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14365gn) r2
            r2.getClass()
            r3.f43801d = r2
            r9 = 3
            r3.f43800c = r9
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf) r0
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x03f9
        L_0x03ed:
            r7 = 2
            r8 = 16
            r9 = 3
            java.lang.String r6 = r6.f136279g
            goto L_0x036b
        L_0x03f5:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
        L_0x03f9:
            return r0
        L_0x03fa:
            com.google.common.f.e r2 = f44747a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r4 = "Morris.NativeFormHdlr"
            r2.mo56378ag(r3, r4)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            r3 = 45659(0xb25b, float:6.3982E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            int r0 = r0.f136323g
            com.google.assistant.e.j.e.ep r0 = com.google.assistant.p3897e.p3921j.p3926e.C51936ep.m86435a(r0)
            if (r0 != 0) goto L_0x041c
            com.google.assistant.e.j.e.ep r0 = com.google.assistant.p3897e.p3921j.p3926e.C51936ep.DEFAULT
        L_0x041c:
            java.lang.String r3 = "#getMorrisEventForClientOp(). Not handling show_native_form_args with FeatureType: %s"
            java.lang.String r0 = r0.name()
            r2.mo56389s(r3, r0)
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.C14865cz.mo21784a(com.google.assistant.e.j.e.ff):j$.util.Optional");
    }
}
