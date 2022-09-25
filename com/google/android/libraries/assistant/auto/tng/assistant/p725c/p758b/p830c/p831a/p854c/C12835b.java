package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p854c;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p760a.p761a.C12182h;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.c.b */
/* compiled from: PG */
public final /* synthetic */ class C12835b implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C12844k f40060a;

    /* renamed from: b */
    public final /* synthetic */ C12182h f40061b;

    public /* synthetic */ C12835b(C12844k kVar, C12182h hVar) {
        this.f40060a = kVar;
        this.f40061b = hVar;
    }

    /* JADX WARNING: type inference failed for: r0v56, types: [com.google.protobuf.bn] */
    /* JADX WARNING: type inference failed for: r9v28, types: [com.google.protobuf.bn] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo18058a() {
        /*
            r21 = this;
            r1 = r21
            com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.c.k r2 = r1.f40060a
            com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.a.a.h r3 = r1.f40061b
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            com.google.assistant.e.j.en r6 = r3.mo20475a()
            com.google.assistant.e.j.ex r0 = r6.f136685e
            if (r0 != 0) goto L_0x001a
            com.google.assistant.e.j.ex r0 = com.google.assistant.p3897e.p3921j.C52091ex.f136710b
        L_0x001a:
            com.google.protobuf.cq r0 = r0.f136712a
            java.util.Iterator r7 = r0.iterator()
        L_0x0020:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x006f
            java.lang.Object r0 = r7.next()
            com.google.assistant.e.j.kc r0 = (com.google.assistant.p3897e.p3921j.C52232kc) r0
            java.lang.String r8 = "asst.client.execution.params"
            java.lang.String r9 = r0.f137065b
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0020
            com.google.assistant.e.j.ka r8 = r0.f137066c
            if (r8 != 0) goto L_0x003c
            com.google.assistant.e.j.ka r8 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
        L_0x003c:
            java.lang.String r9 = "assistant.api.params.ClientExecutionParams"
            java.lang.String r8 = r8.f137060b
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x0020
            com.google.assistant.e.j.ka r0 = r0.f137066c     // Catch:{ ct -> 0x005f }
            if (r0 != 0) goto L_0x004c
            com.google.assistant.e.j.ka r0 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d     // Catch:{ ct -> 0x005f }
        L_0x004c:
            com.google.protobuf.z r0 = r0.f137061c     // Catch:{ ct -> 0x005f }
            com.google.protobuf.ba r8 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x005f }
            com.google.assistant.e.i.a.bq r9 = com.google.assistant.p3897e.p3917i.p3918a.C51274bq.f133487i     // Catch:{ ct -> 0x005f }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r9, (com.google.protobuf.C63088z) r0, (com.google.protobuf.C62921ba) r8)     // Catch:{ ct -> 0x005f }
            com.google.assistant.e.i.a.bq r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51274bq) r0     // Catch:{ ct -> 0x005f }
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)     // Catch:{ ct -> 0x005f }
            goto L_0x0073
        L_0x005f:
            r0 = move-exception
            com.google.common.f.e r8 = com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p854c.C12859z.f40116a
            com.google.common.f.x r8 = r8.mo56225c()
            java.lang.String r9 = "Failed to parse ClientExecutionParams"
            r10 = 44533(0xadf5, float:6.2404E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56382g(r0)).mo56372aa(r10)).mo56386p(r9)
            goto L_0x0020
        L_0x006f:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
        L_0x0073:
            boolean r7 = r0.isPresent()
            java.lang.String r8 = "mic.UPDATE"
            r9 = 4
            if (r7 == 0) goto L_0x0096
            java.lang.Object r7 = r0.get()
            com.google.assistant.e.i.a.bq r7 = (com.google.assistant.p3897e.p3917i.p3918a.C51274bq) r7
            int r7 = r7.f133489a
            r7 = r7 & 32
            if (r7 == 0) goto L_0x0096
            java.lang.Object r0 = r0.get()
            com.google.assistant.e.i.a.bq r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51274bq) r0
            com.google.assistant.e.d.a.n r0 = r0.f133495g
            if (r0 != 0) goto L_0x0207
            com.google.assistant.e.d.a.n r0 = com.google.assistant.p3897e.p3908d.p3909a.C51183n.f133226e
            goto L_0x0207
        L_0x0096:
            com.google.protobuf.cq r0 = r6.f136684d
            com.google.common.b.qy r6 = new com.google.common.b.qy
            r6.<init>(r8)
            com.google.assistant.e.d.a.n r7 = com.google.assistant.p3897e.p3908d.p3909a.C51183n.f133226e
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.assistant.e.d.a.m r7 = (com.google.assistant.p3897e.p3908d.p3909a.C51182m) r7
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r0 = r0.iterator()
            r12 = 0
            r13 = 0
            r13 = r12
            r14 = 0
        L_0x00b2:
            boolean r15 = r0.hasNext()
            if (r15 == 0) goto L_0x01a7
            java.lang.Object r15 = r0.next()
            com.google.assistant.e.j.ep r15 = (com.google.assistant.p3897e.p3921j.C52083ep) r15
            int r10 = r15.f136692b
            if (r10 != r9) goto L_0x00c7
            java.lang.Object r10 = r15.f136693c
            com.google.assistant.e.j.ei r10 = (com.google.assistant.p3897e.p3921j.C52076ei) r10
            goto L_0x00c9
        L_0x00c7:
            com.google.assistant.e.j.ei r10 = com.google.assistant.p3897e.p3921j.C52076ei.f136664f
        L_0x00c9:
            int r10 = r10.f136666a
            r10 = r10 & 32
            if (r10 == 0) goto L_0x011c
            int r10 = r15.f136692b
            if (r10 != r9) goto L_0x00d8
            java.lang.Object r10 = r15.f136693c
            com.google.assistant.e.j.ei r10 = (com.google.assistant.p3897e.p3921j.C52076ei) r10
            goto L_0x00da
        L_0x00d8:
            com.google.assistant.e.j.ei r10 = com.google.assistant.p3897e.p3921j.C52076ei.f136664f
        L_0x00da:
            com.google.assistant.e.j.dy r10 = r10.f136668c
            if (r10 != 0) goto L_0x00e0
            com.google.assistant.e.j.dy r10 = com.google.assistant.p3897e.p3921j.C51809dy.f135933f
        L_0x00e0:
            java.lang.String r9 = "tts.OUTPUT"
            java.lang.String r10 = r10.f135936b
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x011c
            if (r12 != 0) goto L_0x0113
            java.lang.Integer r9 = java.lang.Integer.valueOf(r14)
            r11.add(r9)
            com.google.assistant.e.d.a.f r9 = com.google.assistant.p3897e.p3908d.p3909a.C51175f.f133205f
            com.google.protobuf.bn r9 = r9.createBuilder()
            r12 = r9
            com.google.assistant.e.d.a.e r12 = (com.google.assistant.p3897e.p3908d.p3909a.C51174e) r12
            int r9 = r14 + 1
            r12.copyOnWrite()
            com.google.protobuf.bv r10 = r12.instance
            com.google.assistant.e.d.a.f r10 = (com.google.assistant.p3897e.p3908d.p3909a.C51175f) r10
            r17 = r0
            int r0 = r10.f133207a
            r16 = 1
            r0 = r0 | 1
            r10.f133207a = r0
            r10.f133208b = r14
            r14 = r9
            goto L_0x0115
        L_0x0113:
            r17 = r0
        L_0x0115:
            int r0 = r15.f136694d
            r12.mo53531b(r0)
            goto L_0x01a0
        L_0x011c:
            r17 = r0
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0125
            goto L_0x0175
        L_0x0125:
            int r0 = r15.f136692b
            r9 = 4
            if (r0 != r9) goto L_0x012f
            java.lang.Object r10 = r15.f136693c
            com.google.assistant.e.j.ei r10 = (com.google.assistant.p3897e.p3921j.C52076ei) r10
            goto L_0x0131
        L_0x012f:
            com.google.assistant.e.j.ei r10 = com.google.assistant.p3897e.p3921j.C52076ei.f136664f
        L_0x0131:
            int r10 = r10.f136666a
            r10 = r10 & 32
            if (r10 == 0) goto L_0x0175
            if (r0 != r9) goto L_0x013e
            java.lang.Object r0 = r15.f136693c
            com.google.assistant.e.j.ei r0 = (com.google.assistant.p3897e.p3921j.C52076ei) r0
            goto L_0x0140
        L_0x013e:
            com.google.assistant.e.j.ei r0 = com.google.assistant.p3897e.p3921j.C52076ei.f136664f
        L_0x0140:
            com.google.assistant.e.j.dy r0 = r0.f136668c
            if (r0 != 0) goto L_0x0146
            com.google.assistant.e.j.dy r0 = com.google.assistant.p3897e.p3921j.C51809dy.f135933f
        L_0x0146:
            java.lang.String r0 = r0.f135936b
            java.lang.Object r9 = r6.f156534a
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0175
            if (r13 != 0) goto L_0x016f
            com.google.assistant.e.d.a.f r0 = com.google.assistant.p3897e.p3908d.p3909a.C51175f.f133205f
            com.google.protobuf.bn r0 = r0.createBuilder()
            r13 = r0
            com.google.assistant.e.d.a.e r13 = (com.google.assistant.p3897e.p3908d.p3909a.C51174e) r13
            int r0 = r14 + 1
            r13.copyOnWrite()
            com.google.protobuf.bv r9 = r13.instance
            com.google.assistant.e.d.a.f r9 = (com.google.assistant.p3897e.p3908d.p3909a.C51175f) r9
            int r10 = r9.f133207a
            r16 = 1
            r10 = r10 | 1
            r9.f133207a = r10
            r9.f133208b = r14
            r14 = r0
        L_0x016f:
            int r0 = r15.f136694d
            r13.mo53531b(r0)
            goto L_0x01a0
        L_0x0175:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            r11.add(r0)
            com.google.assistant.e.d.a.f r0 = com.google.assistant.p3897e.p3908d.p3909a.C51175f.f133205f
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.d.a.e r0 = (com.google.assistant.p3897e.p3908d.p3909a.C51174e) r0
            int r9 = r14 + 1
            r0.copyOnWrite()
            com.google.protobuf.bv r10 = r0.instance
            com.google.assistant.e.d.a.f r10 = (com.google.assistant.p3897e.p3908d.p3909a.C51175f) r10
            int r1 = r10.f133207a
            r16 = 1
            r1 = r1 | 1
            r10.f133207a = r1
            r10.f133208b = r14
            int r1 = r15.f136694d
            r0.mo53531b(r1)
            r7.mo53548c(r0)
            r14 = r9
        L_0x01a0:
            r1 = r21
            r0 = r17
            r9 = 4
            goto L_0x00b2
        L_0x01a7:
            if (r12 == 0) goto L_0x01ac
            r7.mo53548c(r12)
        L_0x01ac:
            com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p854c.C12859z.m29100a(r7, r11)
            if (r13 == 0) goto L_0x01c5
            r7.mo53548c(r13)
            com.google.protobuf.bv r0 = r13.instance
            com.google.assistant.e.d.a.f r0 = (com.google.assistant.p3897e.p3908d.p3909a.C51175f) r0
            int r0 = r0.f133208b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89846n(r0)
            com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p854c.C12859z.m29100a(r7, r0)
        L_0x01c5:
            com.google.assistant.e.d.a.l r0 = com.google.assistant.p3897e.p3908d.p3909a.C51181l.f133221d
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.d.a.i r0 = (com.google.assistant.p3897e.p3908d.p3909a.C51178i) r0
            com.google.assistant.e.d.a.k r1 = com.google.assistant.p3897e.p3908d.p3909a.C51180k.SEND_RESPONSE
            r0.copyOnWrite()
            com.google.protobuf.bv r6 = r0.instance
            com.google.assistant.e.d.a.l r6 = (com.google.assistant.p3897e.p3908d.p3909a.C51181l) r6
            int r1 = r1.f133220f
            r6.f133224b = r1
            int r1 = r6.f133223a
            r9 = 1
            r1 = r1 | r9
            r6.f133223a = r1
            r7.mo53550e(r0)
            com.google.assistant.e.d.a.l r0 = com.google.assistant.p3897e.p3908d.p3909a.C51181l.f133221d
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.d.a.i r0 = (com.google.assistant.p3897e.p3908d.p3909a.C51178i) r0
            com.google.assistant.e.d.a.k r1 = com.google.assistant.p3897e.p3908d.p3909a.C51180k.FINISH
            r0.copyOnWrite()
            com.google.protobuf.bv r6 = r0.instance
            com.google.assistant.e.d.a.l r6 = (com.google.assistant.p3897e.p3908d.p3909a.C51181l) r6
            int r1 = r1.f133220f
            r6.f133224b = r1
            int r1 = r6.f133223a
            r9 = 1
            r1 = r1 | r9
            r6.f133223a = r1
            r7.mo53550e(r0)
            com.google.protobuf.bv r0 = r7.build()
            com.google.assistant.e.d.a.n r0 = (com.google.assistant.p3897e.p3908d.p3909a.C51183n) r0
        L_0x0207:
            com.google.protobuf.cq r1 = r0.f133229b
            java.util.Iterator r1 = r1.iterator()
        L_0x020d:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0223
            java.lang.Object r6 = r1.next()
            com.google.assistant.e.d.a.f r6 = (com.google.assistant.p3897e.p3908d.p3909a.C51175f) r6
            int r7 = r6.f133208b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r4.put(r7, r6)
            goto L_0x020d
        L_0x0223:
            com.google.assistant.e.j.en r1 = r3.mo20475a()
            com.google.protobuf.cq r1 = r1.f136684d
            java.util.Iterator r1 = r1.iterator()
        L_0x022d:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0243
            java.lang.Object r6 = r1.next()
            com.google.assistant.e.j.ep r6 = (com.google.assistant.p3897e.p3921j.C52083ep) r6
            int r7 = r6.f136694d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r5.put(r7, r6)
            goto L_0x022d
        L_0x0243:
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60866ct.f164955a
            com.google.protobuf.cq r0 = r0.f133230c
            java.util.Iterator r0 = r0.iterator()
        L_0x0252:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x043b
            java.lang.Object r7 = r0.next()
            com.google.assistant.e.d.a.l r7 = (com.google.assistant.p3897e.p3908d.p3909a.C51181l) r7
            com.google.assistant.e.d.a.k r9 = com.google.assistant.p3897e.p3908d.p3909a.C51180k.NO_OP
            int r9 = r7.f133224b
            com.google.assistant.e.d.a.k r9 = com.google.assistant.p3897e.p3908d.p3909a.C51180k.m86072a(r9)
            if (r9 != 0) goto L_0x026a
            com.google.assistant.e.d.a.k r9 = com.google.assistant.p3897e.p3908d.p3909a.C51180k.NO_OP
        L_0x026a:
            int r9 = r9.ordinal()
            r10 = 1
            if (r9 == r10) goto L_0x0318
            r10 = 2
            java.lang.String r11 = "ConvDeltaStreamProc"
            if (r9 == r10) goto L_0x02ab
            r10 = 3
            if (r9 == r10) goto L_0x02a3
            r10 = 4
            if (r9 == r10) goto L_0x02a3
            com.google.common.f.e r9 = com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p854c.C12844k.f40077a
            com.google.common.f.x r9 = r9.mo56225c()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r9.mo56378ag(r10, r11)
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            r10 = 44508(0xaddc, float:6.2369E-41)
            com.google.common.f.x r9 = r9.mo56372aa(r10)
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            int r7 = r7.f133224b
            com.google.assistant.e.d.a.k r7 = com.google.assistant.p3897e.p3908d.p3909a.C51180k.m86072a(r7)
            if (r7 != 0) goto L_0x029c
            com.google.assistant.e.d.a.k r7 = com.google.assistant.p3897e.p3908d.p3909a.C51180k.NO_OP
        L_0x029c:
            java.lang.String r10 = "Unknown opcode: %s"
            int r7 = r7.f133220f
            r9.mo56387q(r10, r7)
        L_0x02a3:
            r17 = r0
            r18 = r4
            r19 = r5
            goto L_0x0433
        L_0x02ab:
            com.google.protobuf.ch r6 = r7.f133225c
            com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.c.i r7 = com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p854c.C12842i.m29087c(r1)
            com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.c.a r7 = (com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p854c.C12834a) r7
            com.google.common.b.hd r7 = r7.f40058a
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x02be:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L_0x0306
            java.lang.Object r10 = r6.next()
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            java.util.List r10 = com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p854c.C12843j.m29090a(r10, r4)
            java.util.Iterator r10 = r10.iterator()
        L_0x02d6:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x02be
            java.lang.Object r12 = r10.next()
            java.lang.Integer r12 = (java.lang.Integer) r12
            boolean r13 = r7.containsKey(r12)
            if (r13 == 0) goto L_0x02f2
            java.lang.Object r12 = r7.get(r12)
            com.google.common.util.concurrent.cx r12 = (com.google.common.util.concurrent.C60870cx) r12
            r9.add(r12)
            goto L_0x02d6
        L_0x02f2:
            com.google.common.f.e r13 = com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p854c.C12844k.f40077a
            com.google.common.f.x r13 = r13.mo56226d()
            com.google.common.f.aa r14 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r13.mo56378ag(r14, r11)
            java.lang.String r14 = "No clientOp result for interactionId: %s"
            r15 = 44497(0xadd1, float:6.2354E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r15)).mo56389s(r14, r12)
            goto L_0x02d6
        L_0x0306:
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60856cj.m92896e(r9)
            com.google.apps.tiktok.tracing.contrib.b.f r6 = com.google.apps.tiktok.tracing.contrib.p3700b.C47633f.m84733g(r6)
            com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.c.g r7 = com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p854c.C12840g.f40074a
            java.util.concurrent.Executor r9 = r2.f40079c
            com.google.apps.tiktok.tracing.contrib.b.f r6 = r6.mo51515h(r7, r9)
            goto L_0x0252
        L_0x0318:
            com.google.protobuf.ch r7 = r7.f133225c
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0323:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x0426
            java.lang.Object r10 = r7.next()
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.List r10 = com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p854c.C12843j.m29090a(r10, r4)
            java.util.Iterator r10 = r10.iterator()
        L_0x0340:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x035c
            java.lang.Object r12 = r10.next()
            java.lang.Integer r12 = (java.lang.Integer) r12
            boolean r13 = r5.containsKey(r12)
            if (r13 == 0) goto L_0x0340
            java.lang.Object r12 = r5.get(r12)
            com.google.assistant.e.j.ep r12 = (com.google.assistant.p3897e.p3921j.C52083ep) r12
            r11.add(r12)
            goto L_0x0340
        L_0x035c:
            j$.util.Optional r10 = p3186j$.util.Optional.empty()
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            java.util.Iterator r11 = r11.iterator()
            r13 = r6
        L_0x036a:
            boolean r14 = r11.hasNext()
            if (r14 == 0) goto L_0x040e
            java.lang.Object r14 = r11.next()
            com.google.assistant.e.j.ep r14 = (com.google.assistant.p3897e.p3921j.C52083ep) r14
            int r15 = r14.f136692b
            r17 = r0
            r0 = 4
            if (r15 != r0) goto L_0x0382
            java.lang.Object r15 = r14.f136693c
            com.google.assistant.e.j.ei r15 = (com.google.assistant.p3897e.p3921j.C52076ei) r15
            goto L_0x0384
        L_0x0382:
            com.google.assistant.e.j.ei r15 = com.google.assistant.p3897e.p3921j.C52076ei.f136664f
        L_0x0384:
            com.google.assistant.e.j.dy r15 = r15.f136668c
            if (r15 != 0) goto L_0x038a
            com.google.assistant.e.j.dy r15 = com.google.assistant.p3897e.p3921j.C51809dy.f135933f
        L_0x038a:
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r18 = r4
            boolean r4 = r2.f40083g
            if (r4 == 0) goto L_0x039e
            com.google.assistant.e.j.ec r4 = com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p852k.C12788a.f39969d
            com.google.common.util.concurrent.cx r4 = com.google.common.util.concurrent.C60856cj.m92900i(r4)
            r19 = r5
            goto L_0x03ee
        L_0x039e:
            java.lang.String r4 = r15.f135936b
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x03c9
            r4 = 1
            r2.f40083g = r4
            com.google.assistant.e.j.dw r10 = r15.f135938d
            if (r10 != 0) goto L_0x03af
            com.google.assistant.e.j.dw r10 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x03af:
            com.google.assistant.e.j.zt r13 = com.google.assistant.p3897e.p3921j.C52654zt.f138233e
            com.google.protobuf.eb r13 = r13.getParserForType()
            java.lang.String r4 = "mic_behavior_args"
            j$.util.Optional r4 = com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p856a.C12875h.m29134b(r10, r4, r13)
            com.google.assistant.e.j.ec r10 = com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p852k.C12788a.f39969d
            com.google.common.util.concurrent.cx r10 = com.google.common.util.concurrent.C60856cj.m92900i(r10)
            r19 = r5
            r20 = r10
            r10 = r4
            r4 = r20
            goto L_0x03ee
        L_0x03c9:
            int r4 = r14.f136694d
            r19 = r5
            com.google.common.b.hd r5 = r3.mo20476b()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r5.get(r4)
            com.google.android.libraries.assistant.auto.tng.assistant.c.b.d.a.g r4 = (com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p856a.C12874g) r4
            j$.util.Optional r4 = p3186j$.util.Optional.ofNullable(r4)
            com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.c.d r5 = new com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.c.d
            r5.<init>(r2, r0, r14, r4)
            java.util.concurrent.Executor r4 = r2.f40079c
            com.google.common.util.concurrent.s r5 = com.google.apps.tiktok.tracing.C47810es.m84966f(r5)
            com.google.common.util.concurrent.cx r4 = com.google.common.util.concurrent.C60922j.m93045h(r13, r5, r4)
        L_0x03ee:
            com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.c.e r5 = new com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.c.e
            r5.<init>(r2, r4, r15, r0)
            java.util.concurrent.Executor r0 = r2.f40079c
            com.google.common.base.ah r5 = com.google.apps.tiktok.tracing.C47810es.m84963c(r5)
            com.google.common.util.concurrent.cx r13 = com.google.common.util.concurrent.C60922j.m93044g(r4, r5, r0)
            int r0 = r14.f136694d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12.put(r0, r4)
            r0 = r17
            r4 = r18
            r5 = r19
            goto L_0x036a
        L_0x040e:
            r17 = r0
            r18 = r4
            r19 = r5
            com.google.common.b.hd r0 = com.google.common.p4522b.C58495hd.m89898l(r12)
            com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.c.a r4 = new com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.c.a
            r4.<init>(r0, r10)
            r9.add(r4)
            r0 = r17
            r4 = r18
            goto L_0x0323
        L_0x0426:
            r17 = r0
            r18 = r4
            r19 = r5
            com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.c.i r0 = com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p854c.C12842i.m29087c(r9)
            r1.add(r0)
        L_0x0433:
            r0 = r17
            r4 = r18
            r5 = r19
            goto L_0x0252
        L_0x043b:
            com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.c.i r0 = com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p854c.C12842i.m29087c(r1)
            r1 = r0
            com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.c.a r1 = (com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p854c.C12834a) r1
            com.google.common.b.hd r1 = r1.f40058a
            com.google.common.b.gg r1 = r1.values()
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92896e(r1)
            com.google.apps.tiktok.tracing.contrib.b.f r1 = com.google.apps.tiktok.tracing.contrib.p3700b.C47633f.m84733g(r1)
            com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.c.c r3 = new com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.c.c
            r3.<init>(r0)
            java.util.concurrent.Executor r0 = r2.f40079c
            com.google.apps.tiktok.tracing.contrib.b.f r0 = r1.mo51516i(r3, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p854c.C12835b.mo18058a():com.google.common.util.concurrent.cx");
    }
}
