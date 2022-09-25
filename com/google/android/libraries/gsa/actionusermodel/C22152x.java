package com.google.android.libraries.gsa.actionusermodel;

import com.google.android.libraries.gsa.actionusermodel.p1830c.C22102e;
import com.google.android.libraries.gsa.p1876k.C22864c;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.x */
/* compiled from: PG */
public final /* synthetic */ class C22152x implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C22153y f61115a;

    /* renamed from: b */
    public final /* synthetic */ C22102e f61116b;

    /* renamed from: c */
    public final /* synthetic */ boolean f61117c;

    public /* synthetic */ C22152x(C22153y yVar, C22102e eVar, boolean z) {
        this.f61115a = yVar;
        this.f61116b = eVar;
        this.f61117c = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e0, code lost:
        if (r12.f124799a == 6) goto L_0x00e2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0116  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo17879a(java.lang.Object r12) {
        /*
            r11 = this;
            com.google.android.libraries.gsa.actionusermodel.y r0 = r11.f61115a
            com.google.android.libraries.gsa.actionusermodel.c.e r1 = r11.f61116b
            boolean r2 = r11.f61117c
            com.google.protos.f.a.au r12 = (com.google.protos.p4985f.p4986a.C64667au) r12
            com.google.protos.f.a.au r2 = com.google.android.libraries.gsa.actionusermodel.C22063au.m41304g(r12, r2)
            com.google.android.libraries.gsa.actionusermodel.az r0 = r0.f61119b
            byte[] r2 = r2.toByteArray()
            com.google.android.libraries.gsa.actionusermodel.AumNativeResolverImpl r0 = (com.google.android.libraries.gsa.actionusermodel.AumNativeResolverImpl) r0
            byte[] r0 = r0.nativeGetContact(r2)
            r2 = 0
            if (r0 != 0) goto L_0x001c
            goto L_0x0039
        L_0x001c:
            com.google.protobuf.ba r3 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ Exception -> 0x002a }
            com.google.protos.f.a.v r4 = com.google.protos.p4985f.p4986a.C64712v.f175417e     // Catch:{ Exception -> 0x002a }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r4, (byte[]) r0, (com.google.protobuf.C62921ba) r3)     // Catch:{ Exception -> 0x002a }
            com.google.protos.f.a.v r0 = (com.google.protos.p4985f.p4986a.C64712v) r0     // Catch:{ Exception -> 0x002a }
            r2 = r0
            goto L_0x0039
        L_0x002a:
            r0 = move-exception
            com.google.common.f.a.d r3 = com.google.android.libraries.gsa.actionusermodel.AumNativeResolverImpl.f60740a
            com.google.common.f.x r3 = r3.mo56226d()
            java.lang.String r4 = "Failed to parse ActionUserModelOutput from native code."
            r5 = 48203(0xbc4b, float:6.7547E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56382g(r0)).mo56372aa(r5)).mo56386p(r4)
        L_0x0039:
            java.lang.String.valueOf(r2)
            r0 = 0
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L_0x01ed
            com.google.protobuf.cq r5 = r2.f175420b
            int r5 = r5.size()
            if (r5 != 0) goto L_0x004b
            goto L_0x01ed
        L_0x004b:
            com.google.protobuf.cq r12 = r2.f175420b
            java.util.Iterator r12 = r12.iterator()
        L_0x0051:
            boolean r5 = r12.hasNext()
            if (r5 == 0) goto L_0x0089
            java.lang.Object r5 = r12.next()
            com.google.protos.f.a.x r5 = (com.google.protos.p4985f.p4986a.C64714x) r5
            int r6 = r5.f175426a
            r6 = r6 & r3
            if (r6 == 0) goto L_0x0051
            int r6 = r5.f175428c
            com.google.android.libraries.gsa.actionusermodel.c.d r7 = r1.mo27354a(r6)
            com.google.protobuf.bn r7 = r7.toBuilder()
            com.google.android.libraries.gsa.actionusermodel.c.c r7 = (com.google.android.libraries.gsa.actionusermodel.p1830c.C22100c) r7
            float r5 = r5.f175427b
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.android.libraries.gsa.actionusermodel.c.d r8 = (com.google.android.libraries.gsa.actionusermodel.p1830c.C22101d) r8
            int r9 = r8.f60916a
            r9 = r9 | r4
            r8.f60916a = r9
            double r9 = (double) r5
            r8.f60918c = r9
            com.google.protobuf.bv r5 = r7.build()
            com.google.android.libraries.gsa.actionusermodel.c.d r5 = (com.google.android.libraries.gsa.actionusermodel.p1830c.C22101d) r5
            r1.mo27357d(r6, r5)
            goto L_0x0051
        L_0x0089:
            int r12 = r2.f175419a
            r5 = 8
            r12 = r12 & r5
            r6 = 3
            if (r12 == 0) goto L_0x00e4
            com.google.assistant.ab.d r12 = r2.f175422d
            if (r12 != 0) goto L_0x0097
            com.google.assistant.ab.d r12 = com.google.assistant.p3745ab.C48299d.f124920b
        L_0x0097:
            r1.copyOnWrite()
            com.google.protobuf.bv r7 = r1.instance
            com.google.android.libraries.gsa.actionusermodel.c.g r7 = (com.google.android.libraries.gsa.actionusermodel.p1830c.C22104g) r7
            com.google.android.libraries.gsa.actionusermodel.c.g r8 = com.google.android.libraries.gsa.actionusermodel.p1830c.C22104g.f60920i
            r12.getClass()
            r7.f60929h = r12
            int r12 = r7.f60922a
            r12 = r12 | 32
            r7.f60922a = r12
            com.google.assistant.ab.d r12 = r2.f175422d
            if (r12 != 0) goto L_0x00b2
            com.google.assistant.ab.d r7 = com.google.assistant.p3745ab.C48299d.f124920b
            goto L_0x00b3
        L_0x00b2:
            r7 = r12
        L_0x00b3:
            com.google.assistant.ab.f r7 = r7.f124922a
            if (r7 == 0) goto L_0x00e4
            if (r12 != 0) goto L_0x00bb
            com.google.assistant.ab.d r12 = com.google.assistant.p3745ab.C48299d.f124920b
        L_0x00bb:
            com.google.assistant.ab.f r12 = r12.f124922a
            if (r12 != 0) goto L_0x00c1
            com.google.assistant.ab.f r12 = com.google.assistant.p3745ab.C48322f.f124964b
        L_0x00c1:
            com.google.assistant.ab.b r12 = r12.f124966a
            if (r12 != 0) goto L_0x00c7
            com.google.assistant.ab.b r12 = com.google.assistant.p3745ab.C48241b.f124797b
        L_0x00c7:
            int r12 = r12.f124799a
            if (r12 == r6) goto L_0x00e2
            com.google.assistant.ab.d r12 = r2.f175422d
            if (r12 != 0) goto L_0x00d1
            com.google.assistant.ab.d r12 = com.google.assistant.p3745ab.C48299d.f124920b
        L_0x00d1:
            com.google.assistant.ab.f r12 = r12.f124922a
            if (r12 != 0) goto L_0x00d7
            com.google.assistant.ab.f r12 = com.google.assistant.p3745ab.C48322f.f124964b
        L_0x00d7:
            com.google.assistant.ab.b r12 = r12.f124966a
            if (r12 != 0) goto L_0x00dd
            com.google.assistant.ab.b r12 = com.google.assistant.p3745ab.C48241b.f124797b
        L_0x00dd:
            int r12 = r12.f124799a
            r7 = 6
            if (r12 != r7) goto L_0x00e4
        L_0x00e2:
            r12 = 1
            goto L_0x00e5
        L_0x00e4:
            r12 = 0
        L_0x00e5:
            com.google.protobuf.cq r7 = r2.f175420b
            java.lang.Object r0 = r7.get(r0)
            com.google.protos.f.a.x r0 = (com.google.protos.p4985f.p4986a.C64714x) r0
            if (r12 != 0) goto L_0x0116
            int r12 = r0.f175426a
            r12 = r12 & r3
            if (r12 == 0) goto L_0x0116
            float r12 = r0.f175427b
            double r7 = (double) r12
            r9 = 4606732058837280358(0x3fee666666666666, double:0.95)
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 >= 0) goto L_0x0116
            r1.copyOnWrite()
            com.google.protobuf.bv r12 = r1.instance
            com.google.android.libraries.gsa.actionusermodel.c.g r12 = (com.google.android.libraries.gsa.actionusermodel.p1830c.C22104g) r12
            com.google.android.libraries.gsa.actionusermodel.c.g r0 = com.google.android.libraries.gsa.actionusermodel.p1830c.C22104g.f60920i
            int r0 = com.google.assistant.p3745ab.C48313dl.m85218a(r4)
            r12.f60924c = r0
            int r0 = r12.f60922a
            r0 = r0 | r4
            r12.f60922a = r0
            goto L_0x01e6
        L_0x0116:
            int r12 = r0.f175428c
            r1.copyOnWrite()
            com.google.protobuf.bv r7 = r1.instance
            com.google.android.libraries.gsa.actionusermodel.c.g r7 = (com.google.android.libraries.gsa.actionusermodel.p1830c.C22104g) r7
            com.google.android.libraries.gsa.actionusermodel.c.g r8 = com.google.android.libraries.gsa.actionusermodel.p1830c.C22104g.f60920i
            int r8 = r7.f60922a
            r8 = r8 | 4
            r7.f60922a = r8
            r7.f60925d = r12
            boolean r12 = r2.f175421c
            if (r12 != 0) goto L_0x0141
            r1.copyOnWrite()
            com.google.protobuf.bv r12 = r1.instance
            com.google.android.libraries.gsa.actionusermodel.c.g r12 = (com.google.android.libraries.gsa.actionusermodel.p1830c.C22104g) r12
            int r0 = com.google.assistant.p3745ab.C48313dl.m85218a(r5)
            r12.f60924c = r0
            int r0 = r12.f60922a
            r0 = r0 | r4
            r12.f60922a = r0
            goto L_0x01e6
        L_0x0141:
            com.google.protos.ar.a.b r12 = r0.f175429d
            if (r12 != 0) goto L_0x0147
            com.google.protos.ar.a.b r12 = com.google.protos.p4881ar.p4882a.C63771b.f172510a
        L_0x0147:
            com.google.protobuf.bt r0 = com.google.protos.p4985f.p4986a.C64665as.f175276c
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r12.mo58887l(r0)
            com.google.protobuf.bf r12 = r12.f169962ag
            com.google.protobuf.bs r2 = r0.f169971d
            java.lang.Object r12 = r12.mo58854l(r2)
            if (r12 != 0) goto L_0x015d
            java.lang.Object r12 = r0.f169969b
            goto L_0x0161
        L_0x015d:
            java.lang.Object r12 = r0.mo58889c(r12)
        L_0x0161:
            com.google.protos.f.a.as r12 = (com.google.protos.p4985f.p4986a.C64665as) r12
            com.google.protos.f.a.ak r12 = r12.f175278a
            if (r12 != 0) goto L_0x0169
            com.google.protos.f.a.ak r12 = com.google.protos.p4985f.p4986a.C64657ak.f175259b
        L_0x0169:
            int r12 = r12.f175261a
            int r12 = com.google.protos.p4985f.p4986a.C64659am.m96425a(r12)
            if (r12 != 0) goto L_0x0172
            r12 = 1
        L_0x0172:
            int r12 = r12 + -1
            if (r12 == r3) goto L_0x01c3
            if (r12 == r4) goto L_0x019f
            if (r12 == r6) goto L_0x017b
            goto L_0x01e6
        L_0x017b:
            r1.copyOnWrite()
            com.google.protobuf.bv r12 = r1.instance
            com.google.android.libraries.gsa.actionusermodel.c.g r12 = (com.google.android.libraries.gsa.actionusermodel.p1830c.C22104g) r12
            r12.f60928g = r6
            int r0 = r12.f60922a
            r0 = r0 | 16
            r12.f60922a = r0
            r1.copyOnWrite()
            com.google.protobuf.bv r12 = r1.instance
            com.google.android.libraries.gsa.actionusermodel.c.g r12 = (com.google.android.libraries.gsa.actionusermodel.p1830c.C22104g) r12
            r0 = 13
            int r0 = com.google.assistant.p3745ab.C48313dl.m85218a(r0)
            r12.f60924c = r0
            int r0 = r12.f60922a
            r0 = r0 | r4
            r12.f60922a = r0
            goto L_0x01e6
        L_0x019f:
            r1.copyOnWrite()
            com.google.protobuf.bv r12 = r1.instance
            com.google.android.libraries.gsa.actionusermodel.c.g r12 = (com.google.android.libraries.gsa.actionusermodel.p1830c.C22104g) r12
            r12.f60928g = r4
            int r0 = r12.f60922a
            r0 = r0 | 16
            r12.f60922a = r0
            r1.copyOnWrite()
            com.google.protobuf.bv r12 = r1.instance
            com.google.android.libraries.gsa.actionusermodel.c.g r12 = (com.google.android.libraries.gsa.actionusermodel.p1830c.C22104g) r12
            r0 = 14
            int r0 = com.google.assistant.p3745ab.C48313dl.m85218a(r0)
            r12.f60924c = r0
            int r0 = r12.f60922a
            r0 = r0 | r4
            r12.f60922a = r0
            goto L_0x01e6
        L_0x01c3:
            r1.copyOnWrite()
            com.google.protobuf.bv r12 = r1.instance
            com.google.android.libraries.gsa.actionusermodel.c.g r12 = (com.google.android.libraries.gsa.actionusermodel.p1830c.C22104g) r12
            r12.f60928g = r3
            int r0 = r12.f60922a
            r0 = r0 | 16
            r12.f60922a = r0
            r1.copyOnWrite()
            com.google.protobuf.bv r12 = r1.instance
            com.google.android.libraries.gsa.actionusermodel.c.g r12 = (com.google.android.libraries.gsa.actionusermodel.p1830c.C22104g) r12
            r0 = 12
            int r0 = com.google.assistant.p3745ab.C48313dl.m85218a(r0)
            r12.f60924c = r0
            int r0 = r12.f60922a
            r0 = r0 | r4
            r12.f60922a = r0
        L_0x01e6:
            com.google.protobuf.bv r12 = r1.build()
            com.google.android.libraries.gsa.actionusermodel.c.g r12 = (com.google.android.libraries.gsa.actionusermodel.p1830c.C22104g) r12
            goto L_0x0240
        L_0x01ed:
            com.google.protos.f.a.r r12 = r12.f175285d
            if (r12 != 0) goto L_0x01f3
            com.google.protos.f.a.r r12 = com.google.protos.p4985f.p4986a.C64708r.f175399l
        L_0x01f3:
            com.google.protobuf.cq r12 = r12.f175411k
            int r12 = r12.size()
            if (r12 != r3) goto L_0x0226
            r1.copyOnWrite()
            com.google.protobuf.bv r12 = r1.instance
            com.google.android.libraries.gsa.actionusermodel.c.g r12 = (com.google.android.libraries.gsa.actionusermodel.p1830c.C22104g) r12
            com.google.android.libraries.gsa.actionusermodel.c.g r2 = com.google.android.libraries.gsa.actionusermodel.p1830c.C22104g.f60920i
            r2 = 7
            int r2 = com.google.assistant.p3745ab.C48313dl.m85218a(r2)
            r12.f60924c = r2
            int r2 = r12.f60922a
            r2 = r2 | r4
            r12.f60922a = r2
            r1.copyOnWrite()
            com.google.protobuf.bv r12 = r1.instance
            com.google.android.libraries.gsa.actionusermodel.c.g r12 = (com.google.android.libraries.gsa.actionusermodel.p1830c.C22104g) r12
            int r2 = r12.f60922a
            r2 = r2 | 4
            r12.f60922a = r2
            r12.f60925d = r0
            com.google.protobuf.bv r12 = r1.build()
            com.google.android.libraries.gsa.actionusermodel.c.g r12 = (com.google.android.libraries.gsa.actionusermodel.p1830c.C22104g) r12
            goto L_0x0240
        L_0x0226:
            r1.copyOnWrite()
            com.google.protobuf.bv r12 = r1.instance
            com.google.android.libraries.gsa.actionusermodel.c.g r12 = (com.google.android.libraries.gsa.actionusermodel.p1830c.C22104g) r12
            com.google.android.libraries.gsa.actionusermodel.c.g r0 = com.google.android.libraries.gsa.actionusermodel.p1830c.C22104g.f60920i
            int r0 = com.google.assistant.p3745ab.C48313dl.m85218a(r4)
            r12.f60924c = r0
            int r0 = r12.f60922a
            r0 = r0 | r4
            r12.f60922a = r0
            com.google.protobuf.bv r12 = r1.build()
            com.google.android.libraries.gsa.actionusermodel.c.g r12 = (com.google.android.libraries.gsa.actionusermodel.p1830c.C22104g) r12
        L_0x0240:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.gsa.actionusermodel.C22152x.mo17879a(java.lang.Object):java.lang.Object");
    }
}
