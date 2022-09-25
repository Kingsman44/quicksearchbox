package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.br */
/* compiled from: PG */
public final /* synthetic */ class C96559br implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C96561bt f270143a;

    /* renamed from: b */
    public final /* synthetic */ boolean f270144b;

    public /* synthetic */ C96559br(C96561bt btVar, boolean z) {
        this.f270143a = btVar;
        this.f270144b = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:137:0x033a  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x01c2 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17870a(java.lang.Object r25) {
        /*
            r24 = this;
            r0 = r24
            com.google.android.apps.gsa.staticplugins.bisto.w.bt r1 = r0.f270143a
            boolean r2 = r0.f270144b
            r3 = r25
            java.util.Map r3 = (java.util.Map) r3
            boolean r4 = com.google.android.apps.gsa.staticplugins.bisto.p7531w.C96561bt.m159974s(r3)
            java.lang.String r5 = "OtaStateChecking"
            if (r4 != 0) goto L_0x0517
            if (r2 == 0) goto L_0x0015
            goto L_0x0030
        L_0x0015:
            com.google.android.apps.search.assistant.surfaces.bisto.c.b.d r4 = r1.f270134l
            com.google.android.apps.search.assistant.surfaces.bisto.d.az r4 = r4.mo106520r()
            com.google.android.apps.search.assistant.surfaces.bisto.d.az r6 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az.OOBE_FINISHED
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x0030
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.staticplugins.bisto.g.bf r2 = r1.f270138p
            r2.mo89270k()
            com.google.android.apps.search.assistant.surfaces.bisto.d.ar r2 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124625ar.UNKNOWN_INTERNAL_OTA_STATE
            r1.mo90240o(r2)
            return
        L_0x0030:
            java.util.EnumMap r4 = new java.util.EnumMap
            java.lang.Class<com.google.android.apps.search.assistant.surfaces.bisto.d.at> r6 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124627at.class
            r4.<init>(r6)
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            com.google.android.d.bc r7 = r1.f270150e
            com.google.protobuf.cq r7 = r7.f386123i
            int r7 = r7.size()
            r9 = 0
        L_0x0045:
            int r10 = r3.size()
            java.lang.String r11 = ""
            if (r9 >= r10) goto L_0x018d
            com.google.android.d.bw r10 = com.google.android.p10712d.C142344bw.f386209i
            if (r7 <= 0) goto L_0x0066
            com.google.android.d.bc r14 = r1.f270150e
            com.google.protobuf.cq r14 = r14.f386123i
            int r14 = r14.size()
            if (r9 >= r14) goto L_0x0070
            com.google.android.d.bc r10 = r1.f270150e
            com.google.protobuf.cq r10 = r10.f386123i
            java.lang.Object r10 = r10.get(r9)
            com.google.android.d.bw r10 = (com.google.android.p10712d.C142344bw) r10
            goto L_0x0070
        L_0x0066:
            if (r9 != 0) goto L_0x0070
            com.google.android.d.bc r9 = r1.f270150e
            com.google.android.d.bw r9 = r9.f386121g
            if (r9 == 0) goto L_0x006f
            r10 = r9
        L_0x006f:
            r9 = 0
        L_0x0070:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r9)
            java.lang.Object r15 = r3.get(r14)
            com.google.android.d.gl r15 = (com.google.android.p10712d.C142468gl) r15
            if (r15 != 0) goto L_0x0090
            com.google.common.f.e r10 = com.google.android.apps.gsa.staticplugins.bisto.p7531w.C96561bt.f270146a
            com.google.common.f.x r10 = r10.mo56225c()
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r11, r5)
            java.lang.String r11 = "no sub device for index=%d"
            r12 = 16641(0x4101, float:2.3319E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r12)).mo56387q(r11, r9)
            goto L_0x0187
        L_0x0090:
            int r8 = r15.f386626e
            com.google.android.apps.search.assistant.surfaces.bisto.d.bp r16 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp.f343890p
            com.google.protobuf.bn r16 = r16.createBuilder()
            r12 = r16
            com.google.android.apps.search.assistant.surfaces.bisto.d.bo r12 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124649bo) r12
            r12.copyOnWrite()
            com.google.protobuf.bv r13 = r12.instance
            com.google.android.apps.search.assistant.surfaces.bisto.d.bp r13 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp) r13
            int r0 = r13.f343892a
            r16 = 1
            r0 = r0 | 1
            r13.f343892a = r0
            r13.f343893b = r8
            int r0 = r10.f386211a
            r8 = 2
            r0 = r0 & r8
            if (r0 == 0) goto L_0x00c6
            java.lang.String r0 = r10.f386213c
            r12.copyOnWrite()
            com.google.protobuf.bv r10 = r12.instance
            com.google.android.apps.search.assistant.surfaces.bisto.d.bp r10 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp) r10
            r0.getClass()
            int r13 = r10.f343892a
            r8 = r8 | r13
            r10.f343892a = r8
            r10.f343894c = r0
        L_0x00c6:
            int r0 = r15.f386622a
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x00cd
            goto L_0x00db
        L_0x00cd:
            com.google.android.apps.search.assistant.surfaces.bisto.d.q r0 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q.CAR_ACCESSORY
            com.google.android.apps.search.assistant.surfaces.bisto.c.b.d r8 = r1.f270134l
            com.google.android.apps.search.assistant.surfaces.bisto.d.q r8 = r8.mo106513k()
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x017e
        L_0x00db:
            int r0 = r15.f386622a
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x00f5
            java.lang.String r0 = r15.f386631j
            r12.copyOnWrite()
            com.google.protobuf.bv r8 = r12.instance
            com.google.android.apps.search.assistant.surfaces.bisto.d.bp r8 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp) r8
            r0.getClass()
            int r10 = r8.f343892a
            r10 = r10 | 2048(0x800, float:2.87E-42)
            r8.f343892a = r10
            r8.f343904m = r0
        L_0x00f5:
            com.google.android.apps.gsa.shared.bisto.ad r0 = r1.f270149d
            java.lang.String r0 = r0.mo83457c()
            com.google.android.apps.gsa.shared.bisto.u r8 = r1.f270147b
            com.google.android.apps.search.assistant.surfaces.bisto.c.b.d r10 = r1.f270134l
            com.google.android.apps.search.assistant.surfaces.bisto.d.q r10 = r10.mo106513k()
            com.google.common.base.ax r0 = r8.mo83584a(r15, r10, r0)
            boolean r8 = r0.mo56113h()
            if (r8 == 0) goto L_0x0125
            java.lang.Object r8 = r0.mo56107c()
            java.lang.String r8 = (java.lang.String) r8
            r12.copyOnWrite()
            com.google.protobuf.bv r10 = r12.instance
            com.google.android.apps.search.assistant.surfaces.bisto.d.bp r10 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp) r10
            r8.getClass()
            int r13 = r10.f343892a
            r13 = r13 | 1024(0x400, float:1.435E-42)
            r10.f343892a = r13
            r10.f343903l = r8
        L_0x0125:
            com.google.android.apps.gsa.shared.bisto.u r8 = r1.f270147b
            java.util.Collection r8 = r8.mo83586c(r15)
            r12.copyOnWrite()
            com.google.protobuf.bv r10 = r12.instance
            com.google.android.apps.search.assistant.surfaces.bisto.d.bp r10 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp) r10
            com.google.protobuf.cq r13 = r10.f343905n
            boolean r16 = r13.mo58948c()
            if (r16 != 0) goto L_0x0140
            com.google.protobuf.cq r13 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r13)
            r10.f343905n = r13
        L_0x0140:
            com.google.protobuf.cq r10 = r10.f343905n
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r8, (java.util.List) r10)
            dagger.a r10 = r1.f270136n
            java.lang.Object r10 = r10.mo27525b()
            r16 = r10
            com.google.android.apps.gsa.shared.bisto.a.cd r16 = (com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd) r16
            com.google.android.apps.gsa.staticplugins.bisto.g.bf r10 = r1.f270138p
            java.lang.String r17 = r10.mo89270k()
            java.lang.Object r0 = r0.mo56109e(r11)
            r18 = r0
            java.lang.String r18 = (java.lang.String) r18
            java.lang.String r0 = r15.f386631j
            java.lang.String r10 = r15.f386629h
            java.lang.String r11 = r15.f386630i
            int r13 = r15.f386628g
            com.google.android.d.gi r13 = com.google.android.p10712d.C142465gi.m231087a(r13)
            if (r13 != 0) goto L_0x016d
            com.google.android.d.gi r13 = com.google.android.p10712d.C142465gi.DEVICE_TYPE_UNKNOWN
        L_0x016d:
            com.google.android.d.gi r15 = com.google.android.p10712d.C142465gi.DEVICE_TYPE_HOTWORD_MODEL
            boolean r23 = r13.equals(r15)
            r19 = r0
            r20 = r8
            r21 = r10
            r22 = r11
            r16.mo83389ae(r17, r18, r19, r20, r21, r22, r23)
        L_0x017e:
            com.google.protobuf.bv r0 = r12.build()
            com.google.android.apps.search.assistant.surfaces.bisto.d.bp r0 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp) r0
            r6.put(r14, r0)
        L_0x0187:
            int r9 = r9 + 1
            r0 = r24
            goto L_0x0045
        L_0x018d:
            r0 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r3.get(r7)
            com.google.android.d.gl r0 = (com.google.android.p10712d.C142468gl) r0
            java.lang.Object r7 = r6.get(r7)
            com.google.android.apps.search.assistant.surfaces.bisto.d.bp r7 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp) r7
            r8 = 3
            if (r0 == 0) goto L_0x03a2
            if (r7 != 0) goto L_0x01a5
            goto L_0x03a2
        L_0x01a5:
            int r0 = r0.f386622a
            r0 = r0 & 16
            if (r0 == 0) goto L_0x01ad
        L_0x01ab:
            r0 = 0
            goto L_0x01ba
        L_0x01ad:
            com.google.android.apps.search.assistant.surfaces.bisto.c.b.d r0 = r1.f270134l
            java.lang.String r0 = r0.mo106472M()
            boolean r0 = r1.mo90247m(r0, r7)
            if (r0 == 0) goto L_0x01ab
            r0 = 1
        L_0x01ba:
            java.util.Set r7 = r3.keySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x01c2:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x03b9
            java.lang.Object r10 = r7.next()
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            boolean r12 = r6.containsKey(r10)
            if (r12 == 0) goto L_0x01c2
            java.lang.Object r12 = r3.get(r10)
            com.google.android.d.gl r12 = (com.google.android.p10712d.C142468gl) r12
            int r13 = r12.f386623b
            com.google.android.d.gk r13 = com.google.android.p10712d.C142467gk.m231089a(r13)
            if (r13 != 0) goto L_0x01ec
            com.google.android.d.gk r13 = com.google.android.p10712d.C142467gk.OTA_UNKNOWN
        L_0x01ec:
            com.google.android.d.gk r14 = com.google.android.p10712d.C142467gk.OTA_DEVICE_NOT_CONNECTED
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x01c2
            int r13 = r12.f386623b
            com.google.android.d.gk r13 = com.google.android.p10712d.C142467gk.m231089a(r13)
            if (r13 != 0) goto L_0x01fe
            com.google.android.d.gk r13 = com.google.android.p10712d.C142467gk.OTA_UNKNOWN
        L_0x01fe:
            com.google.android.d.gk r14 = com.google.android.p10712d.C142467gk.OTA_UNSUPPORTED
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x01c2
            java.lang.Object r10 = r6.get(r10)
            com.google.android.apps.search.assistant.surfaces.bisto.d.bp r10 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp) r10
            r10.getClass()
            if (r0 == 0) goto L_0x0214
            com.google.android.apps.search.assistant.surfaces.bisto.d.at r12 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124627at.FIRMWARE_OTA_TYPE
            goto L_0x0266
        L_0x0214:
            java.lang.String r13 = r12.f386627f
            java.lang.String r13 = com.google.common.base.C58837ba.m90856e(r13)
            if (r13 != 0) goto L_0x0226
            int r14 = r12.f386626e
            if (r14 != 0) goto L_0x0226
            com.google.android.apps.search.assistant.surfaces.bisto.c.b.d r13 = r1.f270134l
            java.lang.String r13 = r13.mo106472M()
        L_0x0226:
            int r14 = r10.f343892a
            r14 = r14 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x025b
            java.lang.String r14 = r10.f343904m
            java.lang.String r15 = r10.f343903l
            com.google.protobuf.cq r9 = r10.f343905n
            com.google.common.f.aa r19 = com.google.common.p4526f.p4527a.C58975e.f156826a
            boolean r14 = r15.equals(r14)
            if (r14 != 0) goto L_0x025b
            boolean r9 = r9.contains(r15)
            if (r9 == 0) goto L_0x0243
            com.google.android.apps.search.assistant.surfaces.bisto.d.at r12 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124627at.HOTWORD_ACTIVIATE_OTA_TYPE
            goto L_0x0266
        L_0x0243:
            com.google.android.d.gi r9 = com.google.android.p10712d.C142465gi.DEVICE_TYPE_HOTWORD_MODEL
            int r12 = r12.f386628g
            com.google.android.d.gi r12 = com.google.android.p10712d.C142465gi.m231087a(r12)
            if (r12 != 0) goto L_0x024f
            com.google.android.d.gi r12 = com.google.android.p10712d.C142465gi.DEVICE_TYPE_UNKNOWN
        L_0x024f:
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L_0x0258
            com.google.android.apps.search.assistant.surfaces.bisto.d.at r12 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124627at.HOTWORD_MODEL_ONLY_OTA_TYPE
            goto L_0x0266
        L_0x0258:
            com.google.android.apps.search.assistant.surfaces.bisto.d.at r12 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124627at.HOTWORD_FULL_OTA_TYPE
            goto L_0x0266
        L_0x025b:
            boolean r9 = r1.mo90247m(r13, r10)
            if (r9 == 0) goto L_0x0264
            com.google.android.apps.search.assistant.surfaces.bisto.d.at r12 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124627at.FIRMWARE_OTA_TYPE
            goto L_0x0266
        L_0x0264:
            com.google.android.apps.search.assistant.surfaces.bisto.d.at r12 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124627at.UNKNOWN_OTA_TYPE
        L_0x0266:
            com.google.android.apps.search.assistant.surfaces.bisto.d.at r9 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124627at.UNKNOWN_OTA_TYPE
            boolean r9 = r9.equals(r12)
            if (r9 != 0) goto L_0x01c2
            com.google.protobuf.bn r9 = r10.toBuilder()
            com.google.android.apps.search.assistant.surfaces.bisto.d.bo r9 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124649bo) r9
            r9.copyOnWrite()
            com.google.protobuf.bv r13 = r9.instance
            com.google.android.apps.search.assistant.surfaces.bisto.d.bp r13 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp) r13
            int r14 = r12.f343811f
            r13.f343906o = r14
            int r14 = r13.f343892a
            r14 = r14 | 4096(0x1000, float:5.74E-42)
            r13.f343892a = r14
            com.google.android.d.bc r13 = r1.f270150e
            com.google.android.d.bw r13 = r13.f386121g
            if (r13 != 0) goto L_0x028d
            com.google.android.d.bw r13 = com.google.android.p10712d.C142344bw.f386209i
        L_0x028d:
            int r12 = r12.ordinal()
            r14 = 1
            if (r12 == r14) goto L_0x032c
            java.lang.String r14 = "empty dsp hotword model id"
            r15 = 2
            if (r12 == r15) goto L_0x02d7
            if (r12 == r8) goto L_0x029e
        L_0x029b:
            r10 = 0
            goto L_0x0334
        L_0x029e:
            java.lang.String r10 = r10.f343903l
            if (r10 != 0) goto L_0x02b3
            com.google.common.f.e r10 = com.google.android.apps.gsa.staticplugins.bisto.p7531w.C96561bt.f270146a
            com.google.common.f.x r10 = r10.mo56225c()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r12, r5)
            r12 = 16637(0x40fd, float:2.3313E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r12)).mo56386p(r14)
            goto L_0x029b
        L_0x02b3:
            com.google.android.apps.gsa.shared.bisto.u r12 = r1.f270147b
            com.google.android.apps.gsa.shared.bisto.ap r12 = r12.f242814a
            com.google.common.f.aa r13 = com.google.common.p4526f.p4527a.C58975e.f156826a
            boolean r13 = r12.f242687f
            com.google.common.b.hd r12 = r12.f242686e
            boolean r13 = r12.containsKey(r10)
            if (r13 == 0) goto L_0x02ce
            java.lang.Object r10 = r12.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            com.google.common.base.ax r10 = com.google.common.base.C58833ax.m90834k(r10)
            goto L_0x02d0
        L_0x02ce:
            com.google.common.base.b r10 = com.google.common.base.C58836b.f156633a
        L_0x02d0:
            java.lang.Object r10 = r10.mo56109e(r11)
            java.lang.String r10 = (java.lang.String) r10
            goto L_0x0334
        L_0x02d7:
            java.lang.String r10 = r10.f343903l
            if (r10 != 0) goto L_0x02ec
            com.google.common.f.e r10 = com.google.android.apps.gsa.staticplugins.bisto.p7531w.C96561bt.f270146a
            com.google.common.f.x r10 = r10.mo56225c()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r12, r5)
            r12 = 16639(0x40ff, float:2.3316E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r12)).mo56386p(r14)
            goto L_0x029b
        L_0x02ec:
            int r12 = r13.f386211a
            r12 = r12 & 16
            if (r12 == 0) goto L_0x0315
            com.google.android.d.bk r12 = r13.f386216f
            if (r12 != 0) goto L_0x02f8
            com.google.android.d.bk r12 = com.google.android.p10712d.C142332bk.f386155b
        L_0x02f8:
            com.google.protobuf.cq r12 = r12.f386157a
            java.util.Iterator r12 = r12.iterator()
        L_0x02fe:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0315
            java.lang.Object r13 = r12.next()
            com.google.android.d.ca r13 = (com.google.android.p10712d.C142349ca) r13
            java.lang.String r14 = r13.f386235a
            boolean r14 = r10.equals(r14)
            if (r14 == 0) goto L_0x02fe
            java.lang.String r12 = r13.f386236b
            goto L_0x0316
        L_0x0315:
            r12 = 0
        L_0x0316:
            if (r12 != 0) goto L_0x032a
            com.google.common.f.e r13 = com.google.android.apps.gsa.staticplugins.bisto.p7531w.C96561bt.f270146a
            com.google.common.f.x r13 = r13.mo56225c()
            com.google.common.f.aa r14 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r13.mo56378ag(r14, r5)
            java.lang.String r14 = "failed to find full ota file for model id = %s"
            r15 = 16638(0x40fe, float:2.3315E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r15)).mo56389s(r14, r10)
        L_0x032a:
            r10 = r12
            goto L_0x0334
        L_0x032c:
            int r10 = r13.f386211a
            r12 = 1
            r10 = r10 & r12
            if (r10 == 0) goto L_0x029b
            java.lang.String r10 = r13.f386212b
        L_0x0334:
            boolean r12 = com.google.common.base.C58837ba.m90859h(r10)
            if (r12 == 0) goto L_0x034e
            com.google.common.f.e r9 = com.google.android.apps.gsa.staticplugins.bisto.p7531w.C96561bt.f270146a
            com.google.common.f.x r9 = r9.mo56225c()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r9.mo56378ag(r10, r5)
            java.lang.String r10 = "empty Ota download url"
            r12 = 16636(0x40fc, float:2.3312E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r12)).mo56386p(r10)
            r9 = 0
            goto L_0x0366
        L_0x034e:
            r9.copyOnWrite()
            com.google.protobuf.bv r12 = r9.instance
            com.google.android.apps.search.assistant.surfaces.bisto.d.bp r12 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp) r12
            r10.getClass()
            int r13 = r12.f343892a
            r13 = r13 | 8
            r12.f343892a = r13
            r12.f343896e = r10
            com.google.protobuf.bv r9 = r9.build()
            com.google.android.apps.search.assistant.surfaces.bisto.d.bp r9 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp) r9
        L_0x0366:
            if (r9 == 0) goto L_0x01c2
            int r10 = r9.f343906o
            com.google.android.apps.search.assistant.surfaces.bisto.d.at r10 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124627at.m204292a(r10)
            if (r10 != 0) goto L_0x0372
            com.google.android.apps.search.assistant.surfaces.bisto.d.at r10 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124627at.UNKNOWN_OTA_TYPE
        L_0x0372:
            boolean r10 = r4.containsKey(r10)
            if (r10 != 0) goto L_0x038a
            int r10 = r9.f343906o
            com.google.android.apps.search.assistant.surfaces.bisto.d.at r10 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124627at.m204292a(r10)
            if (r10 != 0) goto L_0x0382
            com.google.android.apps.search.assistant.surfaces.bisto.d.at r10 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124627at.UNKNOWN_OTA_TYPE
        L_0x0382:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r4.put(r10, r12)
        L_0x038a:
            int r10 = r9.f343906o
            com.google.android.apps.search.assistant.surfaces.bisto.d.at r10 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124627at.m204292a(r10)
            if (r10 != 0) goto L_0x0394
            com.google.android.apps.search.assistant.surfaces.bisto.d.at r10 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124627at.UNKNOWN_OTA_TYPE
        L_0x0394:
            java.lang.Object r10 = r4.get(r10)
            java.util.List r10 = (java.util.List) r10
            r10.getClass()
            r10.add(r9)
            goto L_0x01c2
        L_0x03a2:
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.bisto.p7531w.C96561bt.f270146a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r3, r5)
            java.lang.String r3 = "No master device. Must not happen"
            r4 = 16642(0x4102, float:2.332E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56386p(r3)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
        L_0x03b9:
            com.google.android.apps.search.assistant.surfaces.bisto.d.at r0 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124627at.HOTWORD_MODEL_ONLY_OTA_TYPE
            boolean r0 = r4.containsKey(r0)
            if (r0 == 0) goto L_0x03cb
            com.google.android.apps.gsa.shared.bisto.ad r0 = r1.f270149d
            com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel r0 = r0.mo83455a()
            if (r0 == 0) goto L_0x03cb
            r0 = 1
            goto L_0x03cc
        L_0x03cb:
            r0 = 0
        L_0x03cc:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x03d9:
            boolean r6 = r4.hasNext()
            r7 = 4
            if (r6 == 0) goto L_0x043a
            java.lang.Object r6 = r4.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r9 = r6.getKey()
            com.google.android.apps.search.assistant.surfaces.bisto.d.at r9 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124627at) r9
            java.lang.Object r6 = r6.getValue()
            java.util.List r6 = (java.util.List) r6
            int r9 = r9.ordinal()
            r10 = 1
            if (r9 == r10) goto L_0x0432
            r10 = 2
            if (r9 == r10) goto L_0x0424
            if (r9 == r8) goto L_0x0405
            if (r9 == r7) goto L_0x0401
            goto L_0x03d9
        L_0x0401:
            r3.addAll(r6)
            goto L_0x03d9
        L_0x0405:
            com.google.android.apps.gsa.shared.bisto.ad r7 = r1.f270149d
            com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel r7 = r7.mo83455a()
            if (r7 != 0) goto L_0x0420
            com.google.common.f.e r6 = com.google.android.apps.gsa.staticplugins.bisto.p7531w.C96561bt.f270146a
            com.google.common.f.x r6 = r6.mo56224b()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r6.mo56378ag(r7, r5)
            java.lang.String r7 = "VoiceMatch not setup, skipping model OTA"
            r9 = 16640(0x4100, float:2.3318E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r9)).mo56386p(r7)
            goto L_0x03d9
        L_0x0420:
            r3.addAll(r6)
            goto L_0x03d9
        L_0x0424:
            com.google.android.apps.gsa.shared.bisto.k r7 = r1.f270148c
            r9 = 105(0x69, float:1.47E-43)
            boolean r7 = r7.mo83555j(r9)
            if (r7 == 0) goto L_0x03d9
            r3.addAll(r6)
            goto L_0x03d9
        L_0x0432:
            if (r0 == 0) goto L_0x0436
            if (r2 == 0) goto L_0x03d9
        L_0x0436:
            r3.addAll(r6)
            goto L_0x03d9
        L_0x043a:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0458
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.bisto.p7531w.C96561bt.f270146a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r2, r5)
            java.lang.String r2 = "No OTA for any subdevice available"
            r3 = 16644(0x4104, float:2.3323E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            com.google.android.apps.search.assistant.surfaces.bisto.d.ar r0 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124625ar.UNKNOWN_INTERNAL_OTA_STATE
            r1.mo90240o(r0)
            return
        L_0x0458:
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.bisto.p7531w.C96561bt.f270146a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r5)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            r5 = 16643(0x4103, float:2.3322E-41)
            java.lang.String r6 = "OTA required. Zero-day: %b"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r5)).mo56389s(r6, r4)
            com.google.android.apps.search.assistant.surfaces.bisto.d.av r0 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124629av.f343812r
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.search.assistant.surfaces.bisto.d.au r0 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124628au) r0
            r0.mo106567b(r3)
            com.google.android.apps.search.assistant.surfaces.bisto.c.b.d r3 = r1.f270134l
            int r3 = r3.mo106505e()
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.android.apps.search.assistant.surfaces.bisto.d.av r4 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124629av) r4
            int r5 = r4.f343814a
            r6 = 32768(0x8000, float:4.5918E-41)
            r5 = r5 | r6
            r4.f343814a = r5
            r4.f343829p = r3
            com.google.android.apps.search.assistant.surfaces.bisto.d.ar r3 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124625ar.CHECKING_IF_OTA_NEEDED
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.android.apps.search.assistant.surfaces.bisto.d.av r4 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124629av) r4
            int r3 = r3.f343803i
            r4.f343821h = r3
            int r3 = r4.f343814a
            r3 = r3 | 256(0x100, float:3.59E-43)
            r4.f343814a = r3
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.apps.search.assistant.surfaces.bisto.d.av r3 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124629av) r3
            r4 = 2
            r3.f343817d = r4
            int r5 = r3.f343814a
            r5 = r5 | r7
            r3.f343814a = r5
            r3 = 1
            if (r3 == r2) goto L_0x04b7
            r12 = 3
            goto L_0x04b8
        L_0x04b7:
            r12 = 2
        L_0x04b8:
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.search.assistant.surfaces.bisto.d.av r2 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124629av) r2
            int r12 = r12 + -1
            r2.f343818e = r12
            int r3 = r2.f343814a
            r3 = r3 | 8
            r2.f343814a = r3
            com.google.android.apps.search.assistant.surfaces.bisto.c.b.d r2 = r1.f270134l
            int r2 = r2.mo106500an()
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.apps.search.assistant.surfaces.bisto.d.av r3 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124629av) r3
            int r4 = r2 + -1
            if (r2 == 0) goto L_0x0515
            r3.f343824k = r4
            int r2 = r3.f343814a
            r2 = r2 | 2048(0x800, float:2.87E-42)
            r3.f343814a = r2
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.search.assistant.surfaces.bisto.d.av r2 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124629av) r2
            int r3 = r2.f343814a
            r3 = r3 | 16384(0x4000, float:2.2959E-41)
            r2.f343814a = r3
            r3 = 0
            r2.f343827n = r3
            com.google.android.apps.gsa.shared.bisto.ad r2 = r1.f270149d
            java.lang.String r2 = r2.mo83457c()
            java.lang.String r2 = com.google.common.base.C58837ba.m90858g(r2)
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.apps.search.assistant.surfaces.bisto.d.av r3 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124629av) r3
            int r4 = r3.f343814a
            r5 = 65536(0x10000, float:9.18355E-41)
            r4 = r4 | r5
            r3.f343814a = r4
            r3.f343830q = r2
            r1.mo90243r(r0)
            com.google.android.apps.search.assistant.surfaces.bisto.d.ar r0 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124625ar.DOWNLOAD_SCHEDULED
            r1.mo90240o(r0)
            return
        L_0x0515:
            r0 = 0
            throw r0
        L_0x0517:
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.bisto.p7531w.C96561bt.f270146a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r2, r5)
            java.lang.String r2 = "Device in busy state. Not running OTA"
            r3 = 16646(0x4106, float:2.3326E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            com.google.android.apps.search.assistant.surfaces.bisto.d.ar r0 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124625ar.UNKNOWN_INTERNAL_OTA_STATE
            r1.mo90240o(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7531w.C96559br.mo17870a(java.lang.Object):void");
    }
}
