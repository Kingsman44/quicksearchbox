package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9978k;

import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.k.b */
/* compiled from: PG */
public final /* synthetic */ class C131418b implements Function {

    /* renamed from: a */
    public final /* synthetic */ C131423g f359225a;

    public /* synthetic */ C131418b(C131423g gVar) {
        this.f359225a = gVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    /* JADX WARNING: type inference failed for: r2v8, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            com.google.android.apps.search.assistant.verticals.ambient.s.k.g r1 = r0.f359225a
            r2 = r20
            com.google.android.apps.search.assistant.platform.pcp.f.bk r2 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk) r2
            com.google.common.f.a.d r3 = r1.f359232b
            com.google.common.f.x r3 = r3.mo56224b()
            java.lang.String r4 = "#Generate reminder card"
            r5 = 39248(0x9950, float:5.4998E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56372aa(r5)).mo56386p(r4)
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.i.a r3 = r1.f359233c
            int r4 = r2.f341808c
            r5 = 26
            java.lang.String r6 = "SmartspaceReminderIH"
            r7 = 0
            if (r4 != r5) goto L_0x0693
            java.lang.Object r4 = r2.f341809d
            com.google.android.apps.search.assistant.platform.pcp.f.br r4 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123751br) r4
            com.google.android.libraries.f.a r5 = r3.f359774c
            long r8 = r5.mo26870b()
            j$.time.Instant r5 = p3186j$.time.Instant.ofEpochMilli(r8)
            long r8 = r4.f341829b
            j$.time.Instant r8 = p3186j$.time.Instant.ofEpochMilli(r8)
            long r9 = com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131179d.f358774j
            j$.time.Duration r9 = p3186j$.time.Duration.ofSeconds(r9)
            j$.time.Instant r9 = r5.minus(r9)
            boolean r9 = r9.isBefore(r5)
            if (r9 == 0) goto L_0x06a6
            boolean r5 = r8.isAfter(r5)
            if (r5 == 0) goto L_0x06a6
            long r7 = r4.f341829b
            java.lang.String r5 = r4.f341831d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            r9.append(r7)
            java.lang.String r5 = r9.toString()
            int r5 = r5.hashCode()
            boolean r2 = r2.f341814i
            com.google.android.libraries.f.a r7 = r3.f359774c
            long r7 = r7.mo26870b()
            j$.time.Instant r7 = p3186j$.time.Instant.ofEpochMilli(r7)
            long r8 = r4.f341829b
            j$.time.Instant r8 = p3186j$.time.Instant.ofEpochMilli(r8)
            com.google.common.f.e r9 = com.google.android.apps.search.assistant.verticals.ambient.smartspace.p10003i.C131674a.f359772a
            com.google.common.f.x r9 = r9.mo56224b()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r9.mo56378ag(r10, r6)
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            r6 = 39175(0x9907, float:5.4896E-41)
            com.google.common.f.x r6 = r9.mo56372aa(r6)
            r10 = r6
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10
            java.lang.String r11 = "Building Smartspace reminder card, id: %s, title: %s, due time: %s, is from work profile? %b"
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            java.lang.String r13 = r4.f341830c
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r2)
            r14 = r8
            r10.mo56360M(r11, r12, r13, r14, r15)
            com.google.assistant.c.do r6 = com.google.assistant.p3886c.C50818do.f132293H
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.assistant.c.cn r6 = (com.google.assistant.p3886c.C50790cn) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r9 = r6.instance
            com.google.assistant.c.do r9 = (com.google.assistant.p3886c.C50818do) r9
            int r10 = r9.f132304a
            r10 = r10 | 4
            r9.f132304a = r10
            r9.f132307d = r5
            r6.copyOnWrite()
            com.google.protobuf.bv r5 = r6.instance
            com.google.assistant.c.do r5 = (com.google.assistant.p3886c.C50818do) r5
            int r9 = r5.f132304a
            r10 = 1
            r9 = r9 | r10
            r5.f132304a = r9
            r9 = 0
            r5.f132305b = r9
            com.google.assistant.c.cp r5 = com.google.assistant.p3886c.C50792cp.PRIMARY
            r6.copyOnWrite()
            com.google.protobuf.bv r11 = r6.instance
            com.google.assistant.c.do r11 = (com.google.assistant.p3886c.C50818do) r11
            int r5 = r5.f132174e
            r11.f132306c = r5
            int r5 = r11.f132304a
            r12 = 2
            r5 = r5 | r12
            r11.f132304a = r5
            com.google.assistant.c.b.e r5 = com.google.assistant.p3886c.p3888b.C50720e.f131985f
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.c.b.b r5 = (com.google.assistant.p3886c.p3888b.C50717b) r5
            java.lang.String r11 = r4.f341830c
            r5.copyOnWrite()
            com.google.protobuf.bv r13 = r5.instance
            com.google.assistant.c.b.e r13 = (com.google.assistant.p3886c.p3888b.C50720e) r13
            r11.getClass()
            int r14 = r13.f131987a
            r14 = r14 | r10
            r13.f131987a = r14
            r13.f131988b = r11
            com.google.assistant.c.b.g r11 = com.google.assistant.p3886c.p3888b.C50722g.END
            r5.copyOnWrite()
            com.google.protobuf.bv r13 = r5.instance
            com.google.assistant.c.b.e r13 = (com.google.assistant.p3886c.p3888b.C50720e) r13
            int r11 = r11.f131998e
            r13.f131989c = r11
            int r11 = r13.f131987a
            r11 = r11 | r12
            r13.f131987a = r11
            com.google.assistant.c.b.d r11 = com.google.assistant.p3886c.p3888b.C50719d.FIXED_STRING
            r5.copyOnWrite()
            com.google.protobuf.bv r13 = r5.instance
            com.google.assistant.c.b.e r13 = (com.google.assistant.p3886c.p3888b.C50720e) r13
            int r11 = r11.f131984e
            r13.f131990d = r11
            int r11 = r13.f131987a
            r11 = r11 | 4
            r13.f131987a = r11
            com.google.protobuf.bv r5 = r5.build()
            com.google.assistant.c.b.e r5 = (com.google.assistant.p3886c.p3888b.C50720e) r5
            com.google.assistant.c.b.e r11 = com.google.assistant.p3886c.p3888b.C50720e.f131985f
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.assistant.c.b.b r11 = (com.google.assistant.p3886c.p3888b.C50717b) r11
            com.google.assistant.c.b.g r13 = com.google.assistant.p3886c.p3888b.C50722g.UNSPECIFIED
            r11.copyOnWrite()
            com.google.protobuf.bv r14 = r11.instance
            com.google.assistant.c.b.e r14 = (com.google.assistant.p3886c.p3888b.C50720e) r14
            int r13 = r13.f131998e
            r14.f131989c = r13
            int r13 = r14.f131987a
            r13 = r13 | r12
            r14.f131987a = r13
            com.google.assistant.c.b.d r13 = com.google.assistant.p3886c.p3888b.C50719d.EVENT_START_TIME
            r11.copyOnWrite()
            com.google.protobuf.bv r14 = r11.instance
            com.google.assistant.c.b.e r14 = (com.google.assistant.p3886c.p3888b.C50720e) r14
            int r13 = r13.f131984e
            r14.f131990d = r13
            int r13 = r14.f131987a
            r13 = r13 | 4
            r14.f131987a = r13
            r11.copyOnWrite()
            com.google.protobuf.bv r13 = r11.instance
            com.google.assistant.c.b.e r13 = (com.google.assistant.p3886c.p3888b.C50720e) r13
            int r14 = r13.f131987a
            r14 = r14 | 8
            r13.f131987a = r14
            r13.f131991e = r10
            com.google.protobuf.bv r11 = r11.build()
            com.google.assistant.c.b.e r11 = (com.google.assistant.p3886c.p3888b.C50720e) r11
            android.content.Context r13 = r3.f359773b
            long r14 = r4.f341829b
            long r16 = r7.toEpochMilli()
            boolean r4 = r3.f359775d
            r18 = r4
            java.lang.CharSequence r4 = com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131253v.m213756c(r13, r14, r16, r18)
            com.google.assistant.c.b.e r13 = com.google.assistant.p3886c.p3888b.C50720e.f131985f
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.assistant.c.b.b r13 = (com.google.assistant.p3886c.p3888b.C50717b) r13
            java.lang.String r4 = r4.toString()
            r13.copyOnWrite()
            com.google.protobuf.bv r14 = r13.instance
            com.google.assistant.c.b.e r14 = (com.google.assistant.p3886c.p3888b.C50720e) r14
            r4.getClass()
            int r15 = r14.f131987a
            r15 = r15 | r10
            r14.f131987a = r15
            r14.f131988b = r4
            com.google.assistant.c.b.g r4 = com.google.assistant.p3886c.p3888b.C50722g.END
            r13.copyOnWrite()
            com.google.protobuf.bv r14 = r13.instance
            com.google.assistant.c.b.e r14 = (com.google.assistant.p3886c.p3888b.C50720e) r14
            int r4 = r4.f131998e
            r14.f131989c = r4
            int r4 = r14.f131987a
            r4 = r4 | r12
            r14.f131987a = r4
            com.google.assistant.c.b.d r4 = com.google.assistant.p3886c.p3888b.C50719d.FIXED_STRING
            r13.copyOnWrite()
            com.google.protobuf.bv r14 = r13.instance
            com.google.assistant.c.b.e r14 = (com.google.assistant.p3886c.p3888b.C50720e) r14
            int r4 = r4.f131984e
            r14.f131990d = r4
            int r4 = r14.f131987a
            r4 = r4 | 4
            r14.f131987a = r4
            com.google.protobuf.bv r4 = r13.build()
            com.google.assistant.c.b.e r4 = (com.google.assistant.p3886c.p3888b.C50720e) r4
            com.google.assistant.c.cz r13 = com.google.assistant.p3886c.C50802cz.f132236g
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.assistant.c.cy r13 = (com.google.assistant.p3886c.C50801cy) r13
            com.google.assistant.c.b.h r14 = com.google.assistant.p3886c.p3888b.C50723h.f131999e
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.assistant.c.b.a r14 = (com.google.assistant.p3886c.p3888b.C50716a) r14
            r14.copyOnWrite()
            com.google.protobuf.bv r15 = r14.instance
            com.google.assistant.c.b.h r15 = (com.google.assistant.p3886c.p3888b.C50723h) r15
            int r9 = r15.f132001a
            r9 = r9 | r10
            r15.f132001a = r9
            java.lang.String r9 = "%1$s"
            r15.f132002b = r9
            r14.mo53428a(r5)
            com.google.assistant.c.b.g r15 = com.google.assistant.p3886c.p3888b.C50722g.UNSPECIFIED
            r14.copyOnWrite()
            com.google.protobuf.bv r10 = r14.instance
            com.google.assistant.c.b.h r10 = (com.google.assistant.p3886c.p3888b.C50723h) r10
            int r15 = r15.f131998e
            r10.f132003c = r15
            int r15 = r10.f132001a
            r15 = r15 | r12
            r10.f132001a = r15
            r13.copyOnWrite()
            com.google.protobuf.bv r10 = r13.instance
            com.google.assistant.c.cz r10 = (com.google.assistant.p3886c.C50802cz) r10
            com.google.protobuf.bv r14 = r14.build()
            com.google.assistant.c.b.h r14 = (com.google.assistant.p3886c.p3888b.C50723h) r14
            r14.getClass()
            r10.f132239b = r14
            int r14 = r10.f132238a
            r15 = 1
            r14 = r14 | r15
            r10.f132238a = r14
            com.google.assistant.c.b.h r10 = com.google.assistant.p3886c.p3888b.C50723h.f131999e
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.assistant.c.b.a r10 = (com.google.assistant.p3886c.p3888b.C50716a) r10
            android.content.Context r14 = r3.f359773b
            android.content.res.Resources r14 = r14.getResources()
            java.lang.Object[] r12 = new java.lang.Object[r15]
            r16 = 0
            r12[r16] = r9
            r15 = 2132084180(0x7f1505d4, float:1.9808523E38)
            java.lang.String r12 = r14.getString(r15, r12)
            r10.copyOnWrite()
            com.google.protobuf.bv r14 = r10.instance
            com.google.assistant.c.b.h r14 = (com.google.assistant.p3886c.p3888b.C50723h) r14
            r12.getClass()
            int r15 = r14.f132001a
            r16 = 1
            r15 = r15 | 1
            r14.f132001a = r15
            r14.f132002b = r12
            r10.mo53428a(r4)
            com.google.assistant.c.b.g r12 = com.google.assistant.p3886c.p3888b.C50722g.UNSPECIFIED
            r10.copyOnWrite()
            com.google.protobuf.bv r14 = r10.instance
            com.google.assistant.c.b.h r14 = (com.google.assistant.p3886c.p3888b.C50723h) r14
            int r12 = r12.f131998e
            r14.f132003c = r12
            int r12 = r14.f132001a
            r15 = 2
            r12 = r12 | r15
            r14.f132001a = r12
            r13.copyOnWrite()
            com.google.protobuf.bv r12 = r13.instance
            com.google.assistant.c.cz r12 = (com.google.assistant.p3886c.C50802cz) r12
            com.google.protobuf.bv r10 = r10.build()
            com.google.assistant.c.b.h r10 = (com.google.assistant.p3886c.p3888b.C50723h) r10
            r10.getClass()
            r12.f132241d = r10
            int r10 = r12.f132238a
            r10 = r10 | 4
            r12.f132238a = r10
            r6.copyOnWrite()
            com.google.protobuf.bv r10 = r6.instance
            com.google.assistant.c.do r10 = (com.google.assistant.p3886c.C50818do) r10
            com.google.protobuf.bv r12 = r13.build()
            com.google.assistant.c.cz r12 = (com.google.assistant.p3886c.C50802cz) r12
            r12.getClass()
            r10.f132311h = r12
            int r12 = r10.f132304a
            r12 = r12 | 64
            r10.f132304a = r12
            com.google.assistant.c.cz r10 = com.google.assistant.p3886c.C50802cz.f132236g
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.assistant.c.cy r10 = (com.google.assistant.p3886c.C50801cy) r10
            com.google.assistant.c.b.h r12 = com.google.assistant.p3886c.p3888b.C50723h.f131999e
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.assistant.c.b.a r12 = (com.google.assistant.p3886c.p3888b.C50716a) r12
            android.content.Context r13 = r3.f359773b
            android.content.res.Resources r13 = r13.getResources()
            r14 = 2
            java.lang.Object[] r15 = new java.lang.Object[r14]
            r14 = 0
            r15[r14] = r9
            java.lang.String r14 = "%2$s"
            r16 = 1
            r15[r16] = r14
            r14 = 2132084179(0x7f1505d3, float:1.9808521E38)
            java.lang.String r13 = r13.getString(r14, r15)
            r12.copyOnWrite()
            com.google.protobuf.bv r14 = r12.instance
            com.google.assistant.c.b.h r14 = (com.google.assistant.p3886c.p3888b.C50723h) r14
            r13.getClass()
            int r15 = r14.f132001a
            r15 = r15 | 1
            r14.f132001a = r15
            r14.f132002b = r13
            r12.mo53428a(r5)
            r12.mo53428a(r11)
            com.google.assistant.c.b.g r11 = com.google.assistant.p3886c.p3888b.C50722g.UNSPECIFIED
            r12.copyOnWrite()
            com.google.protobuf.bv r13 = r12.instance
            com.google.assistant.c.b.h r13 = (com.google.assistant.p3886c.p3888b.C50723h) r13
            int r11 = r11.f131998e
            r13.f132003c = r11
            int r11 = r13.f132001a
            r14 = 2
            r11 = r11 | r14
            r13.f132001a = r11
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.assistant.c.cz r11 = (com.google.assistant.p3886c.C50802cz) r11
            com.google.protobuf.bv r12 = r12.build()
            com.google.assistant.c.b.h r12 = (com.google.assistant.p3886c.p3888b.C50723h) r12
            r12.getClass()
            r11.f132239b = r12
            int r12 = r11.f132238a
            r13 = 1
            r12 = r12 | r13
            r11.f132238a = r12
            com.google.assistant.c.b.h r11 = com.google.assistant.p3886c.p3888b.C50723h.f131999e
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.assistant.c.b.a r11 = (com.google.assistant.p3886c.p3888b.C50716a) r11
            android.content.Context r12 = r3.f359773b
            android.content.res.Resources r12 = r12.getResources()
            java.lang.Object[] r14 = new java.lang.Object[r13]
            r15 = 0
            r14[r15] = r9
            r15 = 2132084180(0x7f1505d4, float:1.9808523E38)
            java.lang.String r12 = r12.getString(r15, r14)
            r11.copyOnWrite()
            com.google.protobuf.bv r14 = r11.instance
            com.google.assistant.c.b.h r14 = (com.google.assistant.p3886c.p3888b.C50723h) r14
            r12.getClass()
            int r15 = r14.f132001a
            r15 = r15 | r13
            r14.f132001a = r15
            r14.f132002b = r12
            r11.mo53428a(r4)
            com.google.assistant.c.b.g r12 = com.google.assistant.p3886c.p3888b.C50722g.UNSPECIFIED
            r11.copyOnWrite()
            com.google.protobuf.bv r13 = r11.instance
            com.google.assistant.c.b.h r13 = (com.google.assistant.p3886c.p3888b.C50723h) r13
            int r12 = r12.f131998e
            r13.f132003c = r12
            int r12 = r13.f132001a
            r14 = 2
            r12 = r12 | r14
            r13.f132001a = r12
            r10.copyOnWrite()
            com.google.protobuf.bv r12 = r10.instance
            com.google.assistant.c.cz r12 = (com.google.assistant.p3886c.C50802cz) r12
            com.google.protobuf.bv r11 = r11.build()
            com.google.assistant.c.b.h r11 = (com.google.assistant.p3886c.p3888b.C50723h) r11
            r11.getClass()
            r12.f132241d = r11
            int r11 = r12.f132238a
            r11 = r11 | 4
            r12.f132238a = r11
            r6.copyOnWrite()
            com.google.protobuf.bv r11 = r6.instance
            com.google.assistant.c.do r11 = (com.google.assistant.p3886c.C50818do) r11
            com.google.protobuf.bv r10 = r10.build()
            com.google.assistant.c.cz r10 = (com.google.assistant.p3886c.C50802cz) r10
            r10.getClass()
            r11.f132308e = r10
            int r10 = r11.f132304a
            r10 = r10 | 8
            r11.f132304a = r10
            com.google.assistant.c.cz r10 = com.google.assistant.p3886c.C50802cz.f132236g
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.assistant.c.cy r10 = (com.google.assistant.p3886c.C50801cy) r10
            com.google.assistant.c.b.h r11 = com.google.assistant.p3886c.p3888b.C50723h.f131999e
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.assistant.c.b.a r11 = (com.google.assistant.p3886c.p3888b.C50716a) r11
            r11.copyOnWrite()
            com.google.protobuf.bv r12 = r11.instance
            com.google.assistant.c.b.h r12 = (com.google.assistant.p3886c.p3888b.C50723h) r12
            int r13 = r12.f132001a
            r14 = 1
            r13 = r13 | r14
            r12.f132001a = r13
            r12.f132002b = r9
            r11.mo53428a(r5)
            com.google.assistant.c.b.g r12 = com.google.assistant.p3886c.p3888b.C50722g.UNSPECIFIED
            r11.copyOnWrite()
            com.google.protobuf.bv r13 = r11.instance
            com.google.assistant.c.b.h r13 = (com.google.assistant.p3886c.p3888b.C50723h) r13
            int r12 = r12.f131998e
            r13.f132003c = r12
            int r12 = r13.f132001a
            r14 = 2
            r12 = r12 | r14
            r13.f132001a = r12
            r10.copyOnWrite()
            com.google.protobuf.bv r12 = r10.instance
            com.google.assistant.c.cz r12 = (com.google.assistant.p3886c.C50802cz) r12
            com.google.protobuf.bv r11 = r11.build()
            com.google.assistant.c.b.h r11 = (com.google.assistant.p3886c.p3888b.C50723h) r11
            r11.getClass()
            r12.f132239b = r11
            int r11 = r12.f132238a
            r13 = 1
            r11 = r11 | r13
            r12.f132238a = r11
            com.google.assistant.c.b.h r11 = com.google.assistant.p3886c.p3888b.C50723h.f131999e
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.assistant.c.b.a r11 = (com.google.assistant.p3886c.p3888b.C50716a) r11
            android.content.Context r12 = r3.f359773b
            android.content.res.Resources r12 = r12.getResources()
            java.lang.Object[] r14 = new java.lang.Object[r13]
            r15 = 0
            r14[r15] = r9
            r15 = 2132084180(0x7f1505d4, float:1.9808523E38)
            java.lang.String r12 = r12.getString(r15, r14)
            r11.copyOnWrite()
            com.google.protobuf.bv r14 = r11.instance
            com.google.assistant.c.b.h r14 = (com.google.assistant.p3886c.p3888b.C50723h) r14
            r12.getClass()
            int r15 = r14.f132001a
            r15 = r15 | r13
            r14.f132001a = r15
            r14.f132002b = r12
            r11.mo53428a(r4)
            com.google.assistant.c.b.g r12 = com.google.assistant.p3886c.p3888b.C50722g.UNSPECIFIED
            r11.copyOnWrite()
            com.google.protobuf.bv r13 = r11.instance
            com.google.assistant.c.b.h r13 = (com.google.assistant.p3886c.p3888b.C50723h) r13
            int r12 = r12.f131998e
            r13.f132003c = r12
            int r12 = r13.f132001a
            r14 = 2
            r12 = r12 | r14
            r13.f132001a = r12
            r10.copyOnWrite()
            com.google.protobuf.bv r12 = r10.instance
            com.google.assistant.c.cz r12 = (com.google.assistant.p3886c.C50802cz) r12
            com.google.protobuf.bv r11 = r11.build()
            com.google.assistant.c.b.h r11 = (com.google.assistant.p3886c.p3888b.C50723h) r11
            r11.getClass()
            r12.f132241d = r11
            int r11 = r12.f132238a
            r11 = r11 | 4
            r12.f132238a = r11
            r6.copyOnWrite()
            com.google.protobuf.bv r11 = r6.instance
            com.google.assistant.c.do r11 = (com.google.assistant.p3886c.C50818do) r11
            com.google.protobuf.bv r10 = r10.build()
            com.google.assistant.c.cz r10 = (com.google.assistant.p3886c.C50802cz) r10
            r10.getClass()
            r11.f132312i = r10
            int r10 = r11.f132304a
            r10 = r10 | 128(0x80, float:1.794E-43)
            r11.f132304a = r10
            com.google.assistant.c.cz r10 = com.google.assistant.p3886c.C50802cz.f132236g
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.assistant.c.cy r10 = (com.google.assistant.p3886c.C50801cy) r10
            com.google.assistant.c.b.h r11 = com.google.assistant.p3886c.p3888b.C50723h.f131999e
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.assistant.c.b.a r11 = (com.google.assistant.p3886c.p3888b.C50716a) r11
            android.content.Context r12 = r3.f359773b
            android.content.res.Resources r12 = r12.getResources()
            r13 = 1
            java.lang.Object[] r14 = new java.lang.Object[r13]
            r15 = 0
            r14[r15] = r9
            r15 = 2132084178(0x7f1505d2, float:1.980852E38)
            java.lang.String r12 = r12.getString(r15, r14)
            r11.copyOnWrite()
            com.google.protobuf.bv r14 = r11.instance
            com.google.assistant.c.b.h r14 = (com.google.assistant.p3886c.p3888b.C50723h) r14
            r12.getClass()
            int r15 = r14.f132001a
            r15 = r15 | r13
            r14.f132001a = r15
            r14.f132002b = r12
            r11.mo53428a(r5)
            com.google.assistant.c.b.g r5 = com.google.assistant.p3886c.p3888b.C50722g.UNSPECIFIED
            r11.copyOnWrite()
            com.google.protobuf.bv r12 = r11.instance
            com.google.assistant.c.b.h r12 = (com.google.assistant.p3886c.p3888b.C50723h) r12
            int r5 = r5.f131998e
            r12.f132003c = r5
            int r5 = r12.f132001a
            r13 = 2
            r5 = r5 | r13
            r12.f132001a = r5
            r10.copyOnWrite()
            com.google.protobuf.bv r5 = r10.instance
            com.google.assistant.c.cz r5 = (com.google.assistant.p3886c.C50802cz) r5
            com.google.protobuf.bv r11 = r11.build()
            com.google.assistant.c.b.h r11 = (com.google.assistant.p3886c.p3888b.C50723h) r11
            r11.getClass()
            r5.f132239b = r11
            int r11 = r5.f132238a
            r12 = 1
            r11 = r11 | r12
            r5.f132238a = r11
            com.google.assistant.c.b.h r5 = com.google.assistant.p3886c.p3888b.C50723h.f131999e
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.c.b.a r5 = (com.google.assistant.p3886c.p3888b.C50716a) r5
            android.content.Context r3 = r3.f359773b
            android.content.res.Resources r3 = r3.getResources()
            java.lang.Object[] r11 = new java.lang.Object[r12]
            r13 = 0
            r11[r13] = r9
            r9 = 2132084180(0x7f1505d4, float:1.9808523E38)
            java.lang.String r3 = r3.getString(r9, r11)
            r5.copyOnWrite()
            com.google.protobuf.bv r9 = r5.instance
            com.google.assistant.c.b.h r9 = (com.google.assistant.p3886c.p3888b.C50723h) r9
            r3.getClass()
            int r11 = r9.f132001a
            r11 = r11 | r12
            r9.f132001a = r11
            r9.f132002b = r3
            r5.mo53428a(r4)
            com.google.assistant.c.b.g r3 = com.google.assistant.p3886c.p3888b.C50722g.UNSPECIFIED
            r5.copyOnWrite()
            com.google.protobuf.bv r4 = r5.instance
            com.google.assistant.c.b.h r4 = (com.google.assistant.p3886c.p3888b.C50723h) r4
            int r3 = r3.f131998e
            r4.f132003c = r3
            int r3 = r4.f132001a
            r9 = 2
            r3 = r3 | r9
            r4.f132001a = r3
            r10.copyOnWrite()
            com.google.protobuf.bv r3 = r10.instance
            com.google.assistant.c.cz r3 = (com.google.assistant.p3886c.C50802cz) r3
            com.google.protobuf.bv r4 = r5.build()
            com.google.assistant.c.b.h r4 = (com.google.assistant.p3886c.p3888b.C50723h) r4
            r4.getClass()
            r3.f132241d = r4
            int r4 = r3.f132238a
            r4 = r4 | 4
            r3.f132238a = r4
            r6.copyOnWrite()
            com.google.protobuf.bv r3 = r6.instance
            com.google.assistant.c.do r3 = (com.google.assistant.p3886c.C50818do) r3
            com.google.protobuf.bv r4 = r10.build()
            com.google.assistant.c.cz r4 = (com.google.assistant.p3886c.C50802cz) r4
            r4.getClass()
            r3.f132309f = r4
            int r4 = r3.f132304a
            r4 = r4 | 16
            r3.f132304a = r4
            com.google.assistant.c.b.n r3 = com.google.assistant.p3886c.p3888b.C50729n.f132007g
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.c.b.m r3 = (com.google.assistant.p3886c.p3888b.C50728m) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.assistant.c.b.n r4 = (com.google.assistant.p3886c.p3888b.C50729n) r4
            int r5 = r4.f132009a
            r9 = 1
            r5 = r5 | r9
            r4.f132009a = r5
            java.lang.String r5 = "com.google.android.apps.nexuslauncher.extra.SMARTSPACE_ICON"
            r4.f132010b = r5
            r6.copyOnWrite()
            com.google.protobuf.bv r4 = r6.instance
            com.google.assistant.c.do r4 = (com.google.assistant.p3886c.C50818do) r4
            com.google.protobuf.bv r3 = r3.build()
            com.google.assistant.c.b.n r3 = (com.google.assistant.p3886c.p3888b.C50729n) r3
            r3.getClass()
            r4.f132314k = r3
            int r3 = r4.f132304a
            r3 = r3 | 512(0x200, float:7.175E-43)
            r4.f132304a = r3
            com.google.assistant.c.cr r3 = com.google.assistant.p3886c.C50794cr.REMINDER
            r6.copyOnWrite()
            com.google.protobuf.bv r4 = r6.instance
            com.google.assistant.c.do r4 = (com.google.assistant.p3886c.C50818do) r4
            int r3 = r3.f132222T
            r4.f132315l = r3
            int r3 = r4.f132304a
            r3 = r3 | 1024(0x400, float:1.435E-42)
            r4.f132304a = r3
            android.content.Intent r3 = com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131251t.m213741b(r2)
            com.google.assistant.c.b.r r4 = com.google.assistant.p3886c.p3888b.C50733r.f132021d
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.c.b.q r4 = (com.google.assistant.p3886c.p3888b.C50732q) r4
            com.google.assistant.c.b.p r5 = com.google.assistant.p3886c.p3888b.C50731p.START_ACTIVITY
            r4.copyOnWrite()
            com.google.protobuf.bv r9 = r4.instance
            com.google.assistant.c.b.r r9 = (com.google.assistant.p3886c.p3888b.C50733r) r9
            int r5 = r5.f132020d
            r9.f132024b = r5
            int r5 = r9.f132023a
            r10 = 1
            r5 = r5 | r10
            r9.f132023a = r5
            java.lang.String r3 = r3.toUri(r10)
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.assistant.c.b.r r5 = (com.google.assistant.p3886c.p3888b.C50733r) r5
            r3.getClass()
            int r9 = r5.f132023a
            r10 = 2
            r9 = r9 | r10
            r5.f132023a = r9
            r5.f132025c = r3
            r6.copyOnWrite()
            com.google.protobuf.bv r3 = r6.instance
            com.google.assistant.c.do r3 = (com.google.assistant.p3886c.C50818do) r3
            com.google.protobuf.bv r4 = r4.build()
            com.google.assistant.c.b.r r4 = (com.google.assistant.p3886c.p3888b.C50733r) r4
            r4.getClass()
            r3.f132316m = r4
            int r4 = r3.f132304a
            r4 = r4 | 2048(0x800, float:2.87E-42)
            r3.f132304a = r4
            long r3 = r7.toEpochMilli()
            r6.copyOnWrite()
            com.google.protobuf.bv r5 = r6.instance
            com.google.assistant.c.do r5 = (com.google.assistant.p3886c.C50818do) r5
            int r7 = r5.f132304a
            r7 = r7 | 4096(0x1000, float:5.74E-42)
            r5.f132304a = r7
            r5.f132317n = r3
            long r3 = r8.toEpochMilli()
            r6.copyOnWrite()
            com.google.protobuf.bv r5 = r6.instance
            com.google.assistant.c.do r5 = (com.google.assistant.p3886c.C50818do) r5
            int r7 = r5.f132304a
            r7 = r7 | 8192(0x2000, float:1.14794E-41)
            r5.f132304a = r7
            r5.f132318o = r3
            r6.copyOnWrite()
            com.google.protobuf.bv r3 = r6.instance
            com.google.assistant.c.do r3 = (com.google.assistant.p3886c.C50818do) r3
            int r4 = r3.f132304a
            r4 = r4 | 16384(0x4000, float:2.2959E-41)
            r3.f132304a = r4
            r4 = 0
            r3.f132319p = r4
            com.google.assistant.c.ct r3 = com.google.assistant.p3886c.C50796ct.f132223c
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.c.cs r3 = (com.google.assistant.p3886c.C50795cs) r3
            long r4 = r8.toEpochMilli()
            r3.copyOnWrite()
            com.google.protobuf.bv r7 = r3.instance
            com.google.assistant.c.ct r7 = (com.google.assistant.p3886c.C50796ct) r7
            int r9 = r7.f132225a
            r10 = 1
            r9 = r9 | r10
            r7.f132225a = r9
            r7.f132226b = r4
            r6.copyOnWrite()
            com.google.protobuf.bv r4 = r6.instance
            com.google.assistant.c.do r4 = (com.google.assistant.p3886c.C50818do) r4
            com.google.protobuf.bv r3 = r3.build()
            com.google.assistant.c.ct r3 = (com.google.assistant.p3886c.C50796ct) r3
            r3.getClass()
            r4.f132320q = r3
            int r3 = r4.f132304a
            r5 = 32768(0x8000, float:4.5918E-41)
            r3 = r3 | r5
            r4.f132304a = r3
            com.google.assistant.c.dn r3 = com.google.assistant.p3886c.C50817dn.f132287e
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.c.dk r3 = (com.google.assistant.p3886c.C50814dk) r3
            com.google.assistant.c.dm r4 = com.google.assistant.p3886c.C50816dm.f132281e
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.c.dl r4 = (com.google.assistant.p3886c.C50815dl) r4
            long r9 = com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131179d.f358774j
            j$.time.Duration r5 = p3186j$.time.Duration.ofSeconds(r9)
            j$.time.Instant r5 = r8.minus(r5)
            long r9 = r5.toEpochMilli()
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.assistant.c.dm r5 = (com.google.assistant.p3886c.C50816dm) r5
            int r7 = r5.f132283a
            r11 = 1
            r7 = r7 | r11
            r5.f132283a = r7
            r5.f132284b = r9
            long r9 = r8.toEpochMilli()
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.assistant.c.dm r5 = (com.google.assistant.p3886c.C50816dm) r5
            int r7 = r5.f132283a
            r11 = 2
            r7 = r7 | r11
            r5.f132283a = r7
            r5.f132285c = r9
            long r7 = r8.toEpochMilli()
            r4.mo53468a(r7)
            com.google.protobuf.bv r4 = r4.build()
            com.google.assistant.c.dm r4 = (com.google.assistant.p3886c.C50816dm) r4
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.assistant.c.dn r5 = (com.google.assistant.p3886c.C50817dn) r5
            r4.getClass()
            r5.f132292d = r4
            int r4 = r5.f132289a
            r4 = r4 | 8
            r5.f132289a = r4
            com.google.protobuf.bv r3 = r3.build()
            com.google.assistant.c.dn r3 = (com.google.assistant.p3886c.C50817dn) r3
            r6.copyOnWrite()
            com.google.protobuf.bv r4 = r6.instance
            com.google.assistant.c.do r4 = (com.google.assistant.p3886c.C50818do) r4
            r3.getClass()
            r4.f132295A = r3
            int r3 = r4.f132304a
            r5 = 67108864(0x4000000, float:1.5046328E-36)
            r3 = r3 | r5
            r4.f132304a = r3
            r6.copyOnWrite()
            com.google.protobuf.bv r3 = r6.instance
            com.google.assistant.c.do r3 = (com.google.assistant.p3886c.C50818do) r3
            int r4 = r3.f132304a
            r5 = 65536(0x10000, float:9.18355E-41)
            r4 = r4 | r5
            r3.f132304a = r4
            r4 = 1
            r3.f132321r = r4
            r6.copyOnWrite()
            com.google.protobuf.bv r3 = r6.instance
            com.google.assistant.c.do r3 = (com.google.assistant.p3886c.C50818do) r3
            int r5 = r3.f132304a
            r7 = 524288(0x80000, float:7.34684E-40)
            r5 = r5 | r7
            r3.f132304a = r5
            r3.f132324u = r4
            r6.copyOnWrite()
            com.google.protobuf.bv r3 = r6.instance
            com.google.assistant.c.do r3 = (com.google.assistant.p3886c.C50818do) r3
            int r4 = r3.f132304a
            r5 = 131072(0x20000, float:1.83671E-40)
            r4 = r4 | r5
            r3.f132304a = r4
            r3.f132322s = r2
            com.google.protobuf.bv r2 = r6.build()
            r7 = r2
            com.google.assistant.c.do r7 = (com.google.assistant.p3886c.C50818do) r7
            goto L_0x06a6
        L_0x0693:
            com.google.common.f.e r2 = com.google.android.apps.search.assistant.verticals.ambient.smartspace.p10003i.C131674a.f359772a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r3, r6)
            java.lang.String r3 = "proactive data doesn't contain reminder data."
            r4 = 39176(0x9908, float:5.4897E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)
        L_0x06a6:
            j$.util.Optional r2 = p3186j$.util.Optional.ofNullable(r7)
            boolean r3 = r2.isPresent()
            if (r3 == 0) goto L_0x06bd
            com.google.android.apps.search.assistant.verticals.ambient.q.e.t r1 = r1.f359234d
            java.lang.Object r2 = r2.get()
            com.google.assistant.c.do r2 = (com.google.assistant.p3886c.C50818do) r2
            com.google.common.util.concurrent.cx r1 = r1.mo110131e(r2)
            goto L_0x06c1
        L_0x06bd:
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r2)
        L_0x06c1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9978k.C131418b.apply(java.lang.Object):java.lang.Object");
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
