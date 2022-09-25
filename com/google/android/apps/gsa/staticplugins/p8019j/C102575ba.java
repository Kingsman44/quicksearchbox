package com.google.android.apps.gsa.staticplugins.p8019j;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.ba */
/* compiled from: PG */
public final class C102575ba {

    /* renamed from: a */
    private static final C59071e f286281a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.j.ba");

    /* renamed from: b */
    private final C58833ax f286282b;

    /* renamed from: c */
    private final C58833ax f286283c;

    /* renamed from: d */
    private final C58833ax f286284d;

    public C102575ba(C58833ax axVar, C58833ax axVar2, C58833ax axVar3) {
        this.f286282b = axVar;
        this.f286283c = axVar2;
        this.f286284d = axVar3;
    }

    /* renamed from: b */
    private static boolean m170106b(e eVar) {
        return (eVar == null || eVar == e.a) ? false : true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00fb A[SYNTHETIC, Splitter:B:31:0x00fb] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x013b A[SYNTHETIC, Splitter:B:43:0x013b] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x027a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.assistant.p3897e.p3921j.C52232kc mo93339a(com.google.android.apps.gsa.shared.search.Query r14) {
        /*
            r13 = this;
            com.google.assistant.e.j.kc r0 = com.google.assistant.p3897e.p3921j.C52232kc.f137062d
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.kb r0 = (com.google.assistant.p3897e.p3921j.C52231kb) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.assistant.e.j.kc r1 = (com.google.assistant.p3897e.p3921j.C52232kc) r1
            int r2 = r1.f137064a
            r3 = 1
            r2 = r2 | r3
            r1.f137064a = r2
            java.lang.String r2 = "asst.request.logging.params"
            r1.f137065b = r2
            com.google.assistant.e.j.ka r1 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.j.jz r1 = (com.google.assistant.p3897e.p3921j.C52228jz) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.e.j.ka r2 = (com.google.assistant.p3897e.p3921j.C52230ka) r2
            int r4 = r2.f137059a
            r4 = r4 | r3
            r2.f137059a = r4
            java.lang.String r4 = "assistant.api.params.RequestLoggingParams"
            r2.f137060b = r4
            com.google.assistant.e.i.a.li r2 = com.google.assistant.p3897e.p3917i.p3918a.C51536li.f134316k
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.i.a.lf r2 = (com.google.assistant.p3897e.p3917i.p3918a.C51533lf) r2
            boolean r4 = com.google.android.apps.gsa.shared.p6976ag.C89104a.f241538a
            if (r4 == 0) goto L_0x0050
            com.google.assistant.e.i.a.lh r4 = com.google.assistant.p3897e.p3917i.p3918a.C51535lh.GENERAL_TEST
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.assistant.e.i.a.li r5 = (com.google.assistant.p3897e.p3917i.p3918a.C51536li) r5
            int r4 = r4.f134315r
            r5.f134319b = r4
            int r4 = r5.f134318a
            r4 = r4 | r3
            r5.f134318a = r4
            goto L_0x0062
        L_0x0050:
            com.google.assistant.e.i.a.lh r4 = com.google.assistant.p3897e.p3917i.p3918a.C51535lh.REAL_USER
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.assistant.e.i.a.li r5 = (com.google.assistant.p3897e.p3917i.p3918a.C51536li) r5
            int r4 = r4.f134315r
            r5.f134319b = r4
            int r4 = r5.f134318a
            r4 = r4 | r3
            r5.f134318a = r4
        L_0x0062:
            java.lang.String r4 = "android.opa.extra.TRIGGERED_BY"
            int r4 = r14.mo84263a(r4)
            com.google.android.apps.gsa.assistant.shared.l.e r4 = com.google.android.apps.gsa.assistant.shared.l.e.a(r4)
            com.google.common.base.ax r5 = r13.f286282b
            boolean r5 = r5.mo56113h()
            r6 = 2
            if (r5 == 0) goto L_0x009e
            com.google.common.base.ax r5 = r13.f286282b
            java.lang.Object r5 = r5.mo56107c()
            com.google.common.base.cr r5 = (com.google.common.base.C58881cr) r5
            java.lang.Object r5 = r5.mo6453a()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r5 == r6) goto L_0x00af
            com.google.common.base.ax r5 = r13.f286282b
            java.lang.Object r5 = r5.mo56107c()
            com.google.common.base.cr r5 = (com.google.common.base.C58881cr) r5
            java.lang.Object r5 = r5.mo6453a()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r5 != r3) goto L_0x009e
            goto L_0x00af
        L_0x009e:
            boolean r5 = m170106b(r4)
            if (r5 != 0) goto L_0x00af
            com.google.common.base.ax r5 = r13.f286284d
            boolean r5 = r5.mo56113h()
            if (r5 == 0) goto L_0x00ad
            goto L_0x00af
        L_0x00ad:
            r5 = 0
            goto L_0x00b0
        L_0x00af:
            r5 = 1
        L_0x00b0:
            java.lang.String r7 = "android.search.extra.AOG_DISCOVERY_INFO"
            byte[] r7 = r14.mo84440dU(r7)
            java.lang.String r8 = "ReqLoggingParams"
            r9 = 0
            if (r7 == 0) goto L_0x00d7
            com.google.protobuf.h r10 = com.google.protobuf.C63070h.f170215c     // Catch:{ ct -> 0x00c4 }
            com.google.protobuf.bv r7 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r10, (byte[]) r7)     // Catch:{ ct -> 0x00c4 }
            com.google.protobuf.h r7 = (com.google.protobuf.C63070h) r7     // Catch:{ ct -> 0x00c4 }
            goto L_0x00d8
        L_0x00c4:
            r7 = move-exception
            com.google.common.f.e r10 = f286281a
            com.google.common.f.x r10 = r10.mo56226d()
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r11, r8)
            java.lang.String r11 = "Cannot parse given voice plate params"
            r12 = 13998(0x36ae, float:1.9615E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56382g(r7)).mo56372aa(r12)).mo56386p(r11)
        L_0x00d7:
            r7 = r9
        L_0x00d8:
            if (r7 == 0) goto L_0x00eb
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.copyOnWrite()
            com.google.protobuf.bv r10 = r2.instance
            com.google.assistant.e.i.a.li r10 = (com.google.assistant.p3897e.p3917i.p3918a.C51536li) r10
            r10.f134324g = r7
            int r7 = r10.f134318a
            r7 = r7 | 512(0x200, float:7.175E-43)
            r10.f134318a = r7
        L_0x00eb:
            android.os.Bundle r7 = r14.f252786y
            if (r7 != 0) goto L_0x00f1
            r7 = r9
            goto L_0x00f7
        L_0x00f1:
            java.lang.String r10 = "android.opa.extra.ASSISTANT_TEXT_QUERY_INFO_PARAMS"
            byte[] r7 = r7.getByteArray(r10)
        L_0x00f7:
            java.lang.String r10 = "Cannot parse given text query info params"
            if (r7 == 0) goto L_0x0119
            com.google.protobuf.ba r11 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0108 }
            com.google.common.o.a.y r12 = com.google.common.p4552o.p4553a.C59569y.f158066g     // Catch:{ ct -> 0x0108 }
            com.google.protobuf.bv r7 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r12, (byte[]) r7, (com.google.protobuf.C62921ba) r11)     // Catch:{ ct -> 0x0108 }
            com.google.common.o.a.y r7 = (com.google.common.p4552o.p4553a.C59569y) r7     // Catch:{ ct -> 0x0108 }
            goto L_0x011a
        L_0x0108:
            r7 = move-exception
            com.google.common.f.e r11 = f286281a
            com.google.common.f.x r11 = r11.mo56226d()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r11.mo56378ag(r12, r8)
            r12 = 13996(0x36ac, float:1.9613E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56382g(r7)).mo56372aa(r12)).mo56386p(r10)
        L_0x0119:
            r7 = r9
        L_0x011a:
            if (r7 == 0) goto L_0x012d
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.copyOnWrite()
            com.google.protobuf.bv r11 = r2.instance
            com.google.assistant.e.i.a.li r11 = (com.google.assistant.p3897e.p3917i.p3918a.C51536li) r11
            r11.f134326i = r7
            int r7 = r11.f134318a
            r7 = r7 | 2048(0x800, float:2.87E-42)
            r11.f134318a = r7
        L_0x012d:
            android.os.Bundle r7 = r14.f252786y
            if (r7 != 0) goto L_0x0133
            r7 = r9
            goto L_0x0139
        L_0x0133:
            java.lang.String r11 = "android.opa.extra.TAPAS_CLIENT_SESSION"
            byte[] r7 = r7.getByteArray(r11)
        L_0x0139:
            if (r7 == 0) goto L_0x015a
            com.google.protobuf.ba r11 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0149 }
            com.google.common.o.a.cz r12 = com.google.common.p4552o.p4553a.C59529cz.f157963h     // Catch:{ ct -> 0x0149 }
            com.google.protobuf.bv r7 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r12, (byte[]) r7, (com.google.protobuf.C62921ba) r11)     // Catch:{ ct -> 0x0149 }
            com.google.common.o.a.cz r7 = (com.google.common.p4552o.p4553a.C59529cz) r7     // Catch:{ ct -> 0x0149 }
            r9 = r7
            goto L_0x015a
        L_0x0149:
            r7 = move-exception
            com.google.common.f.e r11 = f286281a
            com.google.common.f.x r11 = r11.mo56226d()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r11.mo56378ag(r12, r8)
            r8 = 13994(0x36aa, float:1.961E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56382g(r7)).mo56372aa(r8)).mo56386p(r10)
        L_0x015a:
            if (r9 == 0) goto L_0x016d
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.copyOnWrite()
            com.google.protobuf.bv r7 = r2.instance
            com.google.assistant.e.i.a.li r7 = (com.google.assistant.p3897e.p3917i.p3918a.C51536li) r7
            r7.f134327j = r9
            int r8 = r7.f134318a
            r8 = r8 | 4096(0x1000, float:5.74E-42)
            r7.f134318a = r8
        L_0x016d:
            if (r5 == 0) goto L_0x026c
            com.google.assistant.ab.w.i r5 = com.google.assistant.p3745ab.p3771w.C48422i.f125135e
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.ab.w.h r5 = (com.google.assistant.p3745ab.p3771w.C48421h) r5
            boolean r7 = m170106b(r4)
            if (r7 == 0) goto L_0x018f
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.assistant.ab.w.i r7 = (com.google.assistant.p3745ab.p3771w.C48422i) r7
            int r4 = r4.ca
            r7.f125138b = r4
            int r4 = r7.f125137a
            r4 = r4 | r3
            r7.f125137a = r4
        L_0x018f:
            com.google.common.base.ax r4 = r13.f286282b
            boolean r4 = r4.mo56113h()
            if (r4 == 0) goto L_0x01ca
            com.google.common.base.ax r4 = r13.f286282b
            java.lang.Object r4 = r4.mo56107c()
            com.google.common.base.cr r4 = (com.google.common.base.C58881cr) r4
            java.lang.Object r4 = r4.mo6453a()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 != r6) goto L_0x01ba
            r5.copyOnWrite()
            com.google.protobuf.bv r4 = r5.instance
            com.google.assistant.ab.w.i r4 = (com.google.assistant.p3745ab.p3771w.C48422i) r4
            r4.f125139c = r6
            int r7 = r4.f125137a
            r7 = r7 | r6
            r4.f125137a = r7
            goto L_0x01ca
        L_0x01ba:
            if (r4 != r3) goto L_0x01ca
            r5.copyOnWrite()
            com.google.protobuf.bv r4 = r5.instance
            com.google.assistant.ab.w.i r4 = (com.google.assistant.p3745ab.p3771w.C48422i) r4
            r4.f125139c = r3
            int r7 = r4.f125137a
            r7 = r7 | r6
            r4.f125137a = r7
        L_0x01ca:
            com.google.common.base.ax r4 = r13.f286283c
            boolean r4 = r4.mo56113h()
            if (r4 == 0) goto L_0x01fb
            com.google.protobuf.bv r4 = r5.instance
            com.google.assistant.ab.w.i r4 = (com.google.assistant.p3745ab.p3771w.C48422i) r4
            int r4 = r4.f125137a
            r4 = r4 & r6
            if (r4 == 0) goto L_0x01dc
            goto L_0x01fb
        L_0x01dc:
            com.google.common.base.ax r4 = r13.f286283c
            java.lang.Object r4 = r4.mo56107c()
            com.google.android.apps.gsa.assistant.shared.w r4 = (com.google.android.apps.gsa.assistant.shared.C73912w) r4
            int r4 = r4.mo65445a()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            if (r4 != r6) goto L_0x01fb
            r5.copyOnWrite()
            com.google.protobuf.bv r4 = r5.instance
            com.google.assistant.ab.w.i r4 = (com.google.assistant.p3745ab.p3771w.C48422i) r4
            r7 = 3
            r4.f125139c = r7
            int r7 = r4.f125137a
            r7 = r7 | r6
            r4.f125137a = r7
        L_0x01fb:
            com.google.common.base.ax r4 = r13.f286284d
            boolean r4 = r4.mo56113h()
            if (r4 == 0) goto L_0x0221
            com.google.common.base.ax r4 = r13.f286284d
            java.lang.Object r4 = r4.mo56107c()
            com.google.android.apps.gsa.nga.shared.v.h r4 = (com.google.android.apps.gsa.nga.shared.p6407v.C83278h) r4
            com.google.assistant.ab.w.g r4 = r4.mo75573b()
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.assistant.ab.w.i r7 = (com.google.assistant.p3745ab.p3771w.C48422i) r7
            r4.getClass()
            r7.f125140d = r4
            int r4 = r7.f125137a
            r4 = r4 | 4
            r7.f125137a = r4
        L_0x0221:
            com.google.assistant.e.j.ka r4 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.e.j.jz r4 = (com.google.assistant.p3897e.p3921j.C52228jz) r4
            com.google.protobuf.bv r5 = r5.build()
            com.google.assistant.ab.w.i r5 = (com.google.assistant.p3745ab.p3771w.C48422i) r5
            com.google.protobuf.z r5 = r5.toByteString()
            r4.copyOnWrite()
            com.google.protobuf.bv r7 = r4.instance
            com.google.assistant.e.j.ka r7 = (com.google.assistant.p3897e.p3921j.C52230ka) r7
            r5.getClass()
            int r8 = r7.f137059a
            r8 = r8 | r6
            r7.f137059a = r8
            r7.f137061c = r5
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.assistant.e.j.ka r5 = (com.google.assistant.p3897e.p3921j.C52230ka) r5
            int r7 = r5.f137059a
            r3 = r3 | r7
            r5.f137059a = r3
            java.lang.String r3 = "assistant.logs.OpaAndroidInfo"
            r5.f137060b = r3
            com.google.protobuf.bv r3 = r4.build()
            com.google.assistant.e.j.ka r3 = (com.google.assistant.p3897e.p3921j.C52230ka) r3
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.assistant.e.i.a.li r4 = (com.google.assistant.p3897e.p3917i.p3918a.C51536li) r4
            r3.getClass()
            r4.f134323f = r3
            int r3 = r4.f134318a
            r3 = r3 | 256(0x100, float:3.59E-43)
            r4.f134318a = r3
        L_0x026c:
            java.lang.String r3 = "android.opa.extra.REQUEST_SOURCE_TYPE"
            int r14 = r14.mo84263a(r3)
            com.google.assistant.e.f.d r14 = com.google.assistant.p3897e.p3912f.C51209d.m86086a(r14)
            com.google.assistant.e.f.d r3 = com.google.assistant.p3897e.p3912f.C51209d.UNKNOWN_SOURCE
            if (r14 == r3) goto L_0x028b
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.assistant.e.i.a.li r3 = (com.google.assistant.p3897e.p3917i.p3918a.C51536li) r3
            int r14 = r14.f133323n
            r3.f134325h = r14
            int r14 = r3.f134318a
            r14 = r14 | 1024(0x400, float:1.435E-42)
            r3.f134318a = r14
        L_0x028b:
            com.google.protobuf.bv r14 = r2.build()
            com.google.assistant.e.i.a.li r14 = (com.google.assistant.p3897e.p3917i.p3918a.C51536li) r14
            com.google.protobuf.z r14 = r14.toByteString()
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.e.j.ka r2 = (com.google.assistant.p3897e.p3921j.C52230ka) r2
            r14.getClass()
            int r3 = r2.f137059a
            r3 = r3 | r6
            r2.f137059a = r3
            r2.f137061c = r14
            com.google.protobuf.bv r14 = r1.build()
            com.google.assistant.e.j.ka r14 = (com.google.assistant.p3897e.p3921j.C52230ka) r14
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.assistant.e.j.kc r1 = (com.google.assistant.p3897e.p3921j.C52232kc) r1
            r14.getClass()
            r1.f137066c = r14
            int r14 = r1.f137064a
            r14 = r14 | r6
            r1.f137064a = r14
            com.google.protobuf.bv r14 = r0.build()
            com.google.assistant.e.j.kc r14 = (com.google.assistant.p3897e.p3921j.C52232kc) r14
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p8019j.C102575ba.mo93339a(com.google.android.apps.gsa.shared.search.Query):com.google.assistant.e.j.kc");
    }
}
