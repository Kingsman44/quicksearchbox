package com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1144b;

import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15666r;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.c.a.b.b */
/* compiled from: PG */
public final /* synthetic */ class C15598b implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C15602f f46643a;

    /* renamed from: b */
    public final /* synthetic */ C15666r f46644b;

    public /* synthetic */ C15598b(C15602f fVar, C15666r rVar) {
        this.f46643a = fVar;
        this.f46644b = rVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0137, code lost:
        if (r2.equals("DecreaseDeviceSetting") != false) goto L_0x014f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01cf, code lost:
        if (r2.equals("Stop") == false) goto L_0x01e6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0233  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo18058a() {
        /*
            r16 = this;
            r0 = r16
            com.google.android.libraries.assistant.auto.tng.r.c.a.b.f r1 = r0.f46643a
            com.google.android.libraries.assistant.auto.tng.r.c.b.r r2 = r0.f46644b
            com.google.android.libraries.assistant.auto.tng.r.c.b.o r3 = r2.mo22476b()
            int r3 = r3.mo22462b()
            int r4 = r3 + -1
            if (r3 == 0) goto L_0x0390
            r5 = 0
            r3 = 5
            java.lang.String r7 = "DeviceActionFulfiller"
            r8 = 6
            r9 = 4
            r10 = 0
            r11 = 7
            r13 = 2
            r14 = 1
            if (r4 == 0) goto L_0x0239
            if (r4 == r14) goto L_0x004a
            if (r4 == r13) goto L_0x002b
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x038f
        L_0x002b:
            com.google.common.f.e r1 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1144b.C15602f.f46648a
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r7)
            java.lang.String r2 = "Handling device action fulfillment through conversation delta"
            r3 = 46183(0xb467, float:6.4716E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            com.google.assistant.e.e.a.j r1 = com.google.assistant.p3897e.p3910e.p3911a.C51195j.f133264n
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x038f
        L_0x004a:
            com.google.common.f.e r4 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1144b.C15602f.f46648a
            com.google.common.f.x r4 = r4.mo56224b()
            com.google.common.f.aa r15 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r15, r7)
            java.lang.String r7 = "Handling device action fulfillment through intent query"
            r15 = 46182(0xb466, float:6.4715E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r15)).mo56386p(r7)
            com.google.android.libraries.assistant.auto.tng.r.c.b.o r2 = r2.mo22476b()
            com.google.knowledge.a.a.n r2 = r2.mo22470d()
            com.google.android.libraries.assistant.auto.tng.r.c.c.c r4 = new com.google.android.libraries.assistant.auto.tng.r.c.c.c
            r4.<init>((com.google.knowledge.p4661a.p4662a.C61752n) r2)
            java.lang.String r7 = "setting"
            com.google.common.base.ax r7 = r4.mo22499d(r7)
            boolean r15 = r7.mo56113h()
            if (r15 == 0) goto L_0x01b3
            java.lang.String r5 = "relative_value"
            com.google.common.base.ax r5 = r4.mo22498c(r5)
            java.lang.String r6 = "absolute_value"
            com.google.common.base.ax r6 = r4.mo22498c(r6)
            boolean r15 = r6.mo56113h()
            if (r15 != 0) goto L_0x00f8
            java.lang.String r15 = "MAXIMUM"
            boolean r15 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1144b.C15602f.m32340f(r15, r4)
            if (r15 == 0) goto L_0x00c0
            com.google.protos.an.e.h r6 = com.google.protos.p4850an.p4865e.C63594h.f172008d
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.protos.an.e.e r6 = (com.google.protos.p4850an.p4865e.C63591e) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r15 = r6.instance
            com.google.protos.an.e.h r15 = (com.google.protos.p4850an.p4865e.C63594h) r15
            r15.f172011b = r9
            int r12 = r15.f172010a
            r12 = r12 | r14
            r15.f172010a = r12
            r6.copyOnWrite()
            com.google.protobuf.bv r12 = r6.instance
            com.google.protos.an.e.h r12 = (com.google.protos.p4850an.p4865e.C63594h) r12
            int r15 = r12.f172010a
            r15 = r15 | r13
            r12.f172010a = r15
            java.lang.String r15 = "1"
            r12.f172012c = r15
            com.google.protobuf.bv r6 = r6.build()
            com.google.protos.an.e.h r6 = (com.google.protos.p4850an.p4865e.C63594h) r6
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90834k(r6)
        L_0x00c0:
            java.lang.String r12 = "MINIMUM"
            boolean r4 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1144b.C15602f.m32340f(r12, r4)
            if (r4 == 0) goto L_0x00f8
            com.google.protos.an.e.h r4 = com.google.protos.p4850an.p4865e.C63594h.f172008d
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.protos.an.e.e r4 = (com.google.protos.p4850an.p4865e.C63591e) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.protos.an.e.h r6 = (com.google.protos.p4850an.p4865e.C63594h) r6
            r6.f172011b = r9
            int r12 = r6.f172010a
            r12 = r12 | r14
            r6.f172010a = r12
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.protos.an.e.h r6 = (com.google.protos.p4850an.p4865e.C63594h) r6
            int r12 = r6.f172010a
            r12 = r12 | r13
            r6.f172010a = r12
            java.lang.String r12 = "0.1"
            r6.f172012c = r12
            com.google.protobuf.bv r4 = r4.build()
            com.google.protos.an.e.h r4 = (com.google.protos.p4850an.p4865e.C63594h) r4
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90834k(r4)
        L_0x00f8:
            java.lang.String r2 = r2.f166811b
            boolean r4 = r6.mo56113h()
            java.lang.String r12 = "SetDeviceSetting"
            if (r14 != r4) goto L_0x0103
            r2 = r12
        L_0x0103:
            int r4 = r2.hashCode()
            switch(r4) {
                case -1363629390: goto L_0x0144;
                case -330839288: goto L_0x013a;
                case -167558404: goto L_0x0131;
                case 94559292: goto L_0x0127;
                case 435378404: goto L_0x011d;
                case 1370374648: goto L_0x0115;
                case 1504745432: goto L_0x010b;
                default: goto L_0x010a;
            }
        L_0x010a:
            goto L_0x014e
        L_0x010b:
            java.lang.String r4 = "IncreaseDeviceSetting"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x014e
            r9 = 2
            goto L_0x014f
        L_0x0115:
            boolean r2 = r2.equals(r12)
            if (r2 == 0) goto L_0x014e
            r9 = 6
            goto L_0x014f
        L_0x011d:
            java.lang.String r4 = "Increase_device_setting"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x014e
            r9 = 3
            goto L_0x014f
        L_0x0127:
            java.lang.String r4 = "TurnDeviceSettingOn"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x014e
            r9 = 0
            goto L_0x014f
        L_0x0131:
            java.lang.String r4 = "DecreaseDeviceSetting"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x014e
            goto L_0x014f
        L_0x013a:
            java.lang.String r4 = "Decrease_device_setting"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x014e
            r9 = 5
            goto L_0x014f
        L_0x0144:
            java.lang.String r4 = "TurnDeviceSettingOff"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x014e
            r9 = 1
            goto L_0x014f
        L_0x014e:
            r9 = -1
        L_0x014f:
            switch(r9) {
                case 0: goto L_0x01a7;
                case 1: goto L_0x019a;
                case 2: goto L_0x0186;
                case 3: goto L_0x0186;
                case 4: goto L_0x0172;
                case 5: goto L_0x0172;
                case 6: goto L_0x015e;
                default: goto L_0x0152;
            }
        L_0x0152:
            com.google.assistant.e.e.a.j r1 = com.google.assistant.p3897e.p3910e.p3911a.C51195j.f133264n
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x038f
        L_0x015e:
            java.lang.Object r2 = r7.mo56107c()
            java.lang.String r2 = (java.lang.String) r2
            int r3 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1144b.C15602f.m32342h(r6)
            com.google.common.base.ax r4 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1144b.C15602f.m32339d(r6, r10)
            com.google.common.util.concurrent.cx r1 = r1.mo22418j(r2, r11, r3, r4)
            goto L_0x038f
        L_0x0172:
            java.lang.Object r2 = r7.mo56107c()
            java.lang.String r2 = (java.lang.String) r2
            int r3 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1144b.C15602f.m32342h(r5)
            com.google.common.base.ax r4 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1144b.C15602f.m32339d(r5, r14)
            com.google.common.util.concurrent.cx r1 = r1.mo22418j(r2, r8, r3, r4)
            goto L_0x038f
        L_0x0186:
            java.lang.Object r2 = r7.mo56107c()
            java.lang.String r2 = (java.lang.String) r2
            int r4 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1144b.C15602f.m32342h(r5)
            com.google.common.base.ax r5 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1144b.C15602f.m32339d(r5, r14)
            com.google.common.util.concurrent.cx r1 = r1.mo22418j(r2, r3, r4, r5)
            goto L_0x038f
        L_0x019a:
            java.lang.Object r2 = r7.mo56107c()
            java.lang.String r2 = (java.lang.String) r2
            r3 = 3
            com.google.common.util.concurrent.cx r1 = r1.mo22417i(r2, r3)
            goto L_0x038f
        L_0x01a7:
            java.lang.Object r2 = r7.mo56107c()
            java.lang.String r2 = (java.lang.String) r2
            com.google.common.util.concurrent.cx r1 = r1.mo22417i(r2, r13)
            goto L_0x038f
        L_0x01b3:
            java.lang.String r2 = r2.f166811b
            int r3 = r2.hashCode()
            r4 = -1475640849(0xffffffffa80b81ef, float:-7.744225E-15)
            if (r3 == r4) goto L_0x01dc
            r4 = -1183163064(0xffffffffb97a5d48, float:-2.3876608E-4)
            if (r3 == r4) goto L_0x01d2
            r4 = 2587682(0x277c22, float:3.626115E-39)
            if (r3 == r4) goto L_0x01c9
            goto L_0x01e6
        L_0x01c9:
            java.lang.String r3 = "Stop"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01e6
            goto L_0x01e7
        L_0x01d2:
            java.lang.String r3 = "UnmuteDevice"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01e6
            r10 = 2
            goto L_0x01e7
        L_0x01dc:
            java.lang.String r3 = "MuteDevice"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01e6
            r10 = 1
            goto L_0x01e7
        L_0x01e6:
            r10 = -1
        L_0x01e7:
            if (r10 == 0) goto L_0x0233
            if (r10 == r14) goto L_0x021e
            if (r10 == r13) goto L_0x01f9
            com.google.assistant.e.e.a.j r1 = com.google.assistant.p3897e.p3910e.p3911a.C51195j.f133264n
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x038f
        L_0x01f9:
            com.google.protos.an.d.b.p r2 = com.google.protos.p4850an.p4855d.p4857b.C63490p.VOLUME_LEVEL
            java.lang.String r2 = r2.name()
            g.a.a r3 = r1.f46649b
            java.lang.Object r3 = r3.mo17428b()
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            com.google.common.base.ax r3 = com.google.common.base.C58833ax.m90834k(r3)
            com.google.common.base.ax r3 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1144b.C15602f.m32337b(r3, r14)
            r4 = 3
            com.google.common.util.concurrent.cx r1 = r1.mo22418j(r2, r11, r4, r3)
            goto L_0x038f
        L_0x021e:
            r4 = 3
            com.google.protos.an.d.b.p r2 = com.google.protos.p4850an.p4855d.p4857b.C63490p.VOLUME_LEVEL
            java.lang.String r2 = r2.name()
            java.lang.Double r3 = java.lang.Double.valueOf(r5)
            com.google.common.base.ax r3 = com.google.common.base.C58833ax.m90834k(r3)
            com.google.common.util.concurrent.cx r1 = r1.mo22418j(r2, r11, r4, r3)
            goto L_0x038f
        L_0x0233:
            com.google.common.util.concurrent.cx r1 = r1.mo22416e()
            goto L_0x038f
        L_0x0239:
            com.google.common.f.e r4 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1144b.C15602f.f46648a
            com.google.common.f.x r4 = r4.mo56224b()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r12, r7)
            java.lang.String r7 = "Handling device action fulfillment through analyzer response"
            r12 = 46184(0xb468, float:6.4718E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r12)).mo56386p(r7)
            com.google.android.libraries.assistant.auto.tng.r.c.b.o r2 = r2.mo22476b()
            com.google.protos.an.f r2 = r2.mo22461a()
            com.google.protobuf.bt r4 = com.google.protos.p4850an.p4855d.p4857b.C63484j.f171547g
            java.lang.Object r2 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a.m32464c(r2, r4)
            com.google.protos.an.d.b.j r2 = (com.google.protos.p4850an.p4855d.p4857b.C63484j) r2
            if (r2 != 0) goto L_0x0266
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x038f
        L_0x0266:
            int r4 = r2.f171550b
            int r4 = com.google.protos.p4850an.p4855d.p4857b.C63479e.m96246a(r4)
            if (r4 != 0) goto L_0x026f
            goto L_0x028d
        L_0x026f:
            if (r4 != r11) goto L_0x028d
            com.google.protobuf.ch r4 = r2.f171552d
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x028d
            com.google.protobuf.ch r4 = r2.f171552d
            int r4 = r4.mo58914d(r10)
            int r4 = com.google.protos.p4850an.p4855d.p4857b.C63483i.m96248a(r4)
            if (r4 == 0) goto L_0x028d
            if (r4 != r8) goto L_0x028d
            com.google.common.util.concurrent.cx r1 = r1.mo22416e()
            goto L_0x038f
        L_0x028d:
            g.a.a r4 = r1.f46650c
            java.lang.Object r4 = r4.mo17428b()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0385
            int r4 = r2.f171549a
            int r7 = com.google.protos.p4850an.p4855d.p4857b.C63477c.m96245b(r4)
            if (r7 != 0) goto L_0x02a4
            goto L_0x02a7
        L_0x02a4:
            r12 = 3
            if (r7 == r12) goto L_0x0348
        L_0x02a7:
            int r7 = com.google.protos.p4850an.p4855d.p4857b.C63477c.m96245b(r4)
            if (r7 != 0) goto L_0x02ae
            goto L_0x02b2
        L_0x02ae:
            if (r7 != r13) goto L_0x02b2
            goto L_0x0348
        L_0x02b2:
            int r4 = com.google.protos.p4850an.p4855d.p4857b.C63477c.m96245b(r4)
            if (r4 != 0) goto L_0x02ba
            goto L_0x0385
        L_0x02ba:
            r7 = 8
            if (r4 != r7) goto L_0x0385
            com.google.protos.an.d.b.p r4 = com.google.protos.p4850an.p4855d.p4857b.C63490p.VOLUME_LEVEL
            com.google.protobuf.ch r7 = r2.f171552d
            int r7 = r7.size()
            if (r7 != r14) goto L_0x02eb
            com.google.protobuf.ch r7 = r2.f171552d
            int r7 = r7.mo58914d(r10)
            int r7 = com.google.protos.p4850an.p4855d.p4857b.C63483i.m96248a(r7)
            if (r7 != 0) goto L_0x02d5
            r7 = 1
        L_0x02d5:
            r12 = -1
            int r7 = r7 + r12
            if (r7 == r14) goto L_0x02e9
            r12 = 10
            if (r7 == r12) goto L_0x02e9
            r12 = 3
            if (r7 == r12) goto L_0x02e6
            if (r7 == r9) goto L_0x02e3
            goto L_0x02eb
        L_0x02e3:
            com.google.protos.an.d.b.p r4 = com.google.protos.p4850an.p4855d.p4857b.C63490p.ALARM_VOLUME
            goto L_0x02eb
        L_0x02e6:
            com.google.protos.an.d.b.p r4 = com.google.protos.p4850an.p4855d.p4857b.C63490p.MEDIA_VOLUME
            goto L_0x02eb
        L_0x02e9:
            com.google.protos.an.d.b.p r4 = com.google.protos.p4850an.p4855d.p4857b.C63490p.RING_VOLUME
        L_0x02eb:
            java.lang.String r4 = r4.name()
            int r7 = r2.f171551c
            int r7 = com.google.protos.p4850an.p4855d.p4857b.C63481g.m96247a(r7)
            if (r7 != 0) goto L_0x02f8
            r7 = 1
        L_0x02f8:
            r12 = -1
            int r7 = r7 + r12
            if (r7 == r14) goto L_0x033b
            if (r7 == r13) goto L_0x032e
            r3 = 3
            if (r7 == r3) goto L_0x031f
            if (r7 == r9) goto L_0x0311
            int r3 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1144b.C15602f.m32341g(r2)
            com.google.common.base.ax r2 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1144b.C15602f.m32338c(r2, r10)
            com.google.common.util.concurrent.cx r1 = r1.mo22418j(r4, r11, r3, r2)
            goto L_0x038f
        L_0x0311:
            java.lang.Double r2 = java.lang.Double.valueOf(r5)
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
            com.google.common.util.concurrent.cx r1 = r1.mo22418j(r4, r11, r3, r2)
            goto L_0x038f
        L_0x031f:
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double r2 = java.lang.Double.valueOf(r5)
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
            com.google.common.util.concurrent.cx r1 = r1.mo22418j(r4, r11, r3, r2)
            goto L_0x038f
        L_0x032e:
            int r3 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1144b.C15602f.m32341g(r2)
            com.google.common.base.ax r2 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1144b.C15602f.m32338c(r2, r14)
            com.google.common.util.concurrent.cx r1 = r1.mo22418j(r4, r8, r3, r2)
            goto L_0x038f
        L_0x033b:
            int r5 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1144b.C15602f.m32341g(r2)
            com.google.common.base.ax r2 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1144b.C15602f.m32338c(r2, r14)
            com.google.common.util.concurrent.cx r1 = r1.mo22418j(r4, r3, r5, r2)
            goto L_0x038f
        L_0x0348:
            int r2 = r2.f171550b
            int r2 = com.google.protos.p4850an.p4855d.p4857b.C63479e.m96246a(r2)
            if (r2 != 0) goto L_0x0351
            r2 = 1
        L_0x0351:
            r3 = -1
            int r2 = r2 + r3
            if (r2 == r14) goto L_0x0374
            if (r2 == r13) goto L_0x0362
            com.google.assistant.e.e.a.j r1 = com.google.assistant.p3897e.p3910e.p3911a.C51195j.f133264n
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x038f
        L_0x0362:
            int r2 = com.google.protos.p4850an.p4855d.p4857b.C63477c.m96245b(r4)
            if (r2 != 0) goto L_0x0369
            goto L_0x036a
        L_0x0369:
            r14 = r2
        L_0x036a:
            java.lang.String r2 = com.google.protos.p4850an.p4855d.p4857b.C63477c.m96244a(r14)
            r3 = 3
            com.google.common.util.concurrent.cx r1 = r1.mo22417i(r2, r3)
            goto L_0x038f
        L_0x0374:
            int r2 = com.google.protos.p4850an.p4855d.p4857b.C63477c.m96245b(r4)
            if (r2 != 0) goto L_0x037b
            goto L_0x037c
        L_0x037b:
            r14 = r2
        L_0x037c:
            java.lang.String r2 = com.google.protos.p4850an.p4855d.p4857b.C63477c.m96244a(r14)
            com.google.common.util.concurrent.cx r1 = r1.mo22417i(r2, r13)
            goto L_0x038f
        L_0x0385:
            com.google.assistant.e.e.a.j r1 = com.google.assistant.p3897e.p3910e.p3911a.C51195j.f133264n
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
        L_0x038f:
            return r1
        L_0x0390:
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1144b.C15598b.mo18058a():com.google.common.util.concurrent.cx");
    }
}
