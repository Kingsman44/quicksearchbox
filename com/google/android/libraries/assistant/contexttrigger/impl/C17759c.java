package com.google.android.libraries.assistant.contexttrigger.impl;

import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.p4184bj.p4189b.C55890g;
import com.google.p4184bj.p4189b.C55893j;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.impl.c */
/* compiled from: PG */
public final class C17759c {
    /* renamed from: a */
    public static int m35026a(double d) {
        return (int) Math.round(d * 1.0E7d);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r2v37, types: [int] */
    /* JADX WARNING: type inference failed for: r2v116 */
    /* JADX WARNING: type inference failed for: r2v117 */
    /* JADX WARNING: type inference failed for: r2v118 */
    /* JADX WARNING: type inference failed for: r2v176 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.common.base.C58833ax m35027b(com.google.assistant.p3803ag.p3809c.C48952az r15) {
        /*
            com.google.bj.b.j r0 = com.google.p4184bj.p4189b.C55893j.f148728h
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.bj.b.g r0 = (com.google.p4184bj.p4189b.C55890g) r0
            int r1 = r15.f126659a
            int r2 = com.google.assistant.p3803ag.p3809c.C48949aw.m85320b(r1)
            int r3 = r2 + -1
            r4 = 0
            if (r2 == 0) goto L_0x06aa
            r2 = 0
            r5 = 3
            r6 = 4
            r7 = 2
            r8 = 1
            if (r3 == 0) goto L_0x009d
            if (r3 == r8) goto L_0x007d
            if (r3 == r7) goto L_0x005d
            if (r3 == r5) goto L_0x003b
            java.lang.UnsupportedOperationException r15 = new java.lang.UnsupportedOperationException
            java.lang.Object[] r0 = new java.lang.Object[r8]
            int r1 = com.google.assistant.p3803ag.p3809c.C48949aw.m85320b(r1)
            java.lang.String r3 = com.google.assistant.p3803ag.p3809c.C48949aw.m85319a(r1)
            if (r1 == 0) goto L_0x003a
            r0[r2] = r3
            java.lang.String r1 = "ContextTriggerCondition condition case %s is not supported."
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r15.<init>(r0)
            throw r15
        L_0x003a:
            throw r4
        L_0x003b:
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.bj.b.j r1 = (com.google.p4184bj.p4189b.C55893j) r1
            r1.f148731b = r5
            int r2 = r1.f148730a
            r2 = r2 | r8
            r1.f148730a = r2
            int r1 = r15.f126659a
            if (r1 != r6) goto L_0x0052
            java.lang.Object r15 = r15.f126660b
            com.google.assistant.ag.c.az r15 = (com.google.assistant.p3803ag.p3809c.C48952az) r15
            goto L_0x0054
        L_0x0052:
            com.google.assistant.ag.c.az r15 = com.google.assistant.p3803ag.p3809c.C48952az.f126657c
        L_0x0054:
            com.google.common.b.gu r15 = com.google.common.p4522b.C58485gu.m89846n(r15)
            com.google.common.base.ax r15 = m35028c(r0, r15)
            return r15
        L_0x005d:
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.bj.b.j r1 = (com.google.p4184bj.p4189b.C55893j) r1
            r1.f148731b = r7
            int r2 = r1.f148730a
            r2 = r2 | r8
            r1.f148730a = r2
            int r1 = r15.f126659a
            if (r1 != r5) goto L_0x0074
            java.lang.Object r15 = r15.f126660b
            com.google.assistant.ag.c.ay r15 = (com.google.assistant.p3803ag.p3809c.C48951ay) r15
            goto L_0x0076
        L_0x0074:
            com.google.assistant.ag.c.ay r15 = com.google.assistant.p3803ag.p3809c.C48951ay.f126654b
        L_0x0076:
            com.google.protobuf.cq r15 = r15.f126656a
            com.google.common.base.ax r15 = m35028c(r0, r15)
            return r15
        L_0x007d:
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.bj.b.j r1 = (com.google.p4184bj.p4189b.C55893j) r1
            r1.f148731b = r8
            int r2 = r1.f148730a
            r2 = r2 | r8
            r1.f148730a = r2
            int r1 = r15.f126659a
            if (r1 != r7) goto L_0x0094
            java.lang.Object r15 = r15.f126660b
            com.google.assistant.ag.c.ay r15 = (com.google.assistant.p3803ag.p3809c.C48951ay) r15
            goto L_0x0096
        L_0x0094:
            com.google.assistant.ag.c.ay r15 = com.google.assistant.p3803ag.p3809c.C48951ay.f126654b
        L_0x0096:
            com.google.protobuf.cq r15 = r15.f126656a
            com.google.common.base.ax r15 = m35028c(r0, r15)
            return r15
        L_0x009d:
            if (r1 != r8) goto L_0x00a4
            java.lang.Object r15 = r15.f126660b
            com.google.assistant.ag.c.br r15 = (com.google.assistant.p3803ag.p3809c.C48971br) r15
            goto L_0x00a6
        L_0x00a4:
            com.google.assistant.ag.c.br r15 = com.google.assistant.p3803ag.p3809c.C48971br.f126689d
        L_0x00a6:
            int r1 = r15.f126691a
            int r3 = com.google.assistant.p3803ag.p3809c.C48966bm.m85328a(r1)
            int r9 = r3 + -1
            if (r3 == 0) goto L_0x06a9
            r3 = 8
            if (r9 == 0) goto L_0x0614
            r10 = 11
            r11 = 7
            r12 = 10
            r13 = 5
            if (r9 == r8) goto L_0x0479
            java.lang.String r14 = "Unsupported trigger type."
            if (r9 == r7) goto L_0x0285
            if (r9 == r11) goto L_0x01b7
            if (r9 == r3) goto L_0x00e7
            com.google.assistant.ag.c.bq r15 = r15.f126693c
            if (r15 != 0) goto L_0x00ca
            com.google.assistant.ag.c.bq r15 = com.google.assistant.p3803ag.p3809c.C48970bq.f126685b
        L_0x00ca:
            int r15 = r15.f126687a
            int r15 = com.google.assistant.p3803ag.p3809c.C48969bp.m85329a(r15)
            if (r15 != 0) goto L_0x00d3
            goto L_0x00d4
        L_0x00d3:
            r7 = r15
        L_0x00d4:
            int r7 = r7 + -1
            if (r7 == 0) goto L_0x00e3
            if (r7 != r8) goto L_0x00db
            goto L_0x00e3
        L_0x00db:
            java.lang.UnsupportedOperationException r15 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Unsupported required LeafContextTriggerCondition."
            r15.<init>(r0)
            throw r15
        L_0x00e3:
            com.google.common.base.b r15 = com.google.common.base.C58836b.f156633a
            goto L_0x06a0
        L_0x00e7:
            if (r1 != r10) goto L_0x00ee
            java.lang.Object r15 = r15.f126692b
            com.google.assistant.ag.c.cq r15 = (com.google.assistant.p3803ag.p3809c.C48997cq) r15
            goto L_0x00f0
        L_0x00ee:
            com.google.assistant.ag.c.cq r15 = com.google.assistant.p3803ag.p3809c.C48997cq.f126747e
        L_0x00f0:
            com.google.bj.b.u r1 = com.google.p4184bj.p4189b.C55904u.f148756e
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.bj.b.s r1 = (com.google.p4184bj.p4189b.C55902s) r1
            int r2 = r15.f126751c
            int r2 = com.google.assistant.p3803ag.p3809c.C48996cp.m85338a(r2)
            if (r2 == 0) goto L_0x01b1
            if (r2 == r8) goto L_0x01b1
            int r2 = r15.f126750b
            com.google.assistant.ag.c.cn r2 = com.google.assistant.p3803ag.p3809c.C48994cn.m85336a(r2)
            if (r2 != 0) goto L_0x010c
            com.google.assistant.ag.c.cn r2 = com.google.assistant.p3803ag.p3809c.C48994cn.UNSPECIFIED_STATE
        L_0x010c:
            com.google.assistant.ag.c.cn r3 = com.google.assistant.p3803ag.p3809c.C48994cn.UNSPECIFIED_STATE
            if (r2 == r3) goto L_0x01a9
            int r2 = r15.f126751c
            int r2 = com.google.assistant.p3803ag.p3809c.C48996cp.m85338a(r2)
            if (r2 != 0) goto L_0x0119
            goto L_0x011d
        L_0x0119:
            if (r2 != r5) goto L_0x011d
            r2 = 2
            goto L_0x012e
        L_0x011d:
            int r2 = r15.f126750b
            com.google.assistant.ag.c.cn r2 = com.google.assistant.p3803ag.p3809c.C48994cn.m85336a(r2)
            if (r2 != 0) goto L_0x0127
            com.google.assistant.ag.c.cn r2 = com.google.assistant.p3803ag.p3809c.C48994cn.UNSPECIFIED_STATE
        L_0x0127:
            com.google.assistant.ag.c.cn r3 = com.google.assistant.p3803ag.p3809c.C48994cn.PHONE_UNLOCKED
            if (r2 != r3) goto L_0x012d
            r2 = 3
            goto L_0x012e
        L_0x012d:
            r2 = 4
        L_0x012e:
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.bj.b.u r3 = (com.google.p4184bj.p4189b.C55904u) r3
            int r2 = r2 + -1
            r3.f148759b = r2
            int r2 = r3.f148758a
            r2 = r2 | r8
            r3.f148758a = r2
            int r2 = r15.f126751c
            int r2 = com.google.assistant.p3803ag.p3809c.C48996cp.m85338a(r2)
            if (r2 != 0) goto L_0x0147
            goto L_0x0168
        L_0x0147:
            if (r2 != r5) goto L_0x0168
            int r2 = r15.f126750b
            com.google.assistant.ag.c.cn r2 = com.google.assistant.p3803ag.p3809c.C48994cn.m85336a(r2)
            if (r2 != 0) goto L_0x0153
            com.google.assistant.ag.c.cn r2 = com.google.assistant.p3803ag.p3809c.C48994cn.UNSPECIFIED_STATE
        L_0x0153:
            com.google.assistant.ag.c.cn r3 = com.google.assistant.p3803ag.p3809c.C48994cn.PHONE_UNLOCKED
            if (r2 != r3) goto L_0x0158
            r5 = 2
        L_0x0158:
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.bj.b.u r2 = (com.google.p4184bj.p4189b.C55904u) r2
            int r5 = r5 + -1
            r2.f148761d = r5
            int r3 = r2.f148758a
            r3 = r3 | r6
            r2.f148758a = r3
        L_0x0168:
            int r2 = r15.f126749a
            r2 = r2 & r6
            if (r2 == 0) goto L_0x017d
            long r2 = r15.f126752d
            r1.copyOnWrite()
            com.google.protobuf.bv r15 = r1.instance
            com.google.bj.b.u r15 = (com.google.p4184bj.p4189b.C55904u) r15
            int r4 = r15.f148758a
            r4 = r4 | r7
            r15.f148758a = r4
            r15.f148760c = r2
        L_0x017d:
            r0.copyOnWrite()
            com.google.protobuf.bv r15 = r0.instance
            com.google.bj.b.j r15 = (com.google.p4184bj.p4189b.C55893j) r15
            r15.f148731b = r12
            int r2 = r15.f148730a
            r2 = r2 | r8
            r15.f148730a = r2
            r0.copyOnWrite()
            com.google.protobuf.bv r15 = r0.instance
            com.google.bj.b.j r15 = (com.google.p4184bj.p4189b.C55893j) r15
            com.google.protobuf.bv r1 = r1.build()
            com.google.bj.b.u r1 = (com.google.p4184bj.p4189b.C55904u) r1
            r1.getClass()
            r15.f148736g = r1
            int r1 = r15.f148730a
            r1 = r1 | 128(0x80, float:1.794E-43)
            r15.f148730a = r1
            com.google.common.base.ax r15 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x06a0
        L_0x01a9:
            java.lang.UnsupportedOperationException r15 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Phone lock state not specified."
            r15.<init>(r0)
            throw r15
        L_0x01b1:
            java.lang.UnsupportedOperationException r15 = new java.lang.UnsupportedOperationException
            r15.<init>(r14)
            throw r15
        L_0x01b7:
            if (r1 != r12) goto L_0x01be
            java.lang.Object r15 = r15.f126692b
            com.google.assistant.ag.c.cw r15 = (com.google.assistant.p3803ag.p3809c.C49003cw) r15
            goto L_0x01c0
        L_0x01be:
            com.google.assistant.ag.c.cw r15 = com.google.assistant.p3803ag.p3809c.C49003cw.f126755e
        L_0x01c0:
            com.google.bj.b.x r1 = com.google.p4184bj.p4189b.C55907x.f148763e
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.bj.b.v r1 = (com.google.p4184bj.p4189b.C55905v) r1
            int r2 = r15.f126759c
            int r4 = com.google.assistant.p3803ag.p3809c.C49002cv.m85340a(r2)
            if (r4 == 0) goto L_0x027f
            if (r4 == r8) goto L_0x027f
            int r4 = r15.f126758b
            int r9 = com.google.assistant.p3803ag.p3809c.C49000ct.m85339a(r4)
            if (r9 == 0) goto L_0x0277
            if (r9 == r8) goto L_0x0277
            int r2 = com.google.assistant.p3803ag.p3809c.C49002cv.m85340a(r2)
            if (r2 != 0) goto L_0x01e3
            goto L_0x0210
        L_0x01e3:
            if (r2 != r5) goto L_0x0210
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.bj.b.x r2 = (com.google.p4184bj.p4189b.C55907x) r2
            r2.f148766b = r8
            int r4 = r2.f148765a
            r4 = r4 | r8
            r2.f148765a = r4
            int r2 = r15.f126758b
            int r2 = com.google.assistant.p3803ag.p3809c.C49000ct.m85339a(r2)
            if (r2 != 0) goto L_0x01fd
        L_0x01fb:
            r5 = 2
            goto L_0x01ff
        L_0x01fd:
            if (r2 != r5) goto L_0x01fb
        L_0x01ff:
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.bj.b.x r2 = (com.google.p4184bj.p4189b.C55907x) r2
            int r5 = r5 + -1
            r2.f148768d = r5
            int r4 = r2.f148765a
            r4 = r4 | r6
            r2.f148765a = r4
            goto L_0x0236
        L_0x0210:
            int r2 = com.google.assistant.p3803ag.p3809c.C49000ct.m85339a(r4)
            if (r2 != 0) goto L_0x0217
            goto L_0x0228
        L_0x0217:
            if (r2 != r5) goto L_0x0228
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.bj.b.x r2 = (com.google.p4184bj.p4189b.C55907x) r2
            r2.f148766b = r7
            int r4 = r2.f148765a
            r4 = r4 | r8
            r2.f148765a = r4
            goto L_0x0236
        L_0x0228:
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.bj.b.x r2 = (com.google.p4184bj.p4189b.C55907x) r2
            r2.f148766b = r5
            int r4 = r2.f148765a
            r4 = r4 | r8
            r2.f148765a = r4
        L_0x0236:
            int r2 = r15.f126757a
            r2 = r2 & r6
            if (r2 == 0) goto L_0x024b
            long r4 = r15.f126760d
            r1.copyOnWrite()
            com.google.protobuf.bv r15 = r1.instance
            com.google.bj.b.x r15 = (com.google.p4184bj.p4189b.C55907x) r15
            int r2 = r15.f148765a
            r2 = r2 | r7
            r15.f148765a = r2
            r15.f148767c = r4
        L_0x024b:
            r0.copyOnWrite()
            com.google.protobuf.bv r15 = r0.instance
            com.google.bj.b.j r15 = (com.google.p4184bj.p4189b.C55893j) r15
            r15.f148731b = r3
            int r2 = r15.f148730a
            r2 = r2 | r8
            r15.f148730a = r2
            r0.copyOnWrite()
            com.google.protobuf.bv r15 = r0.instance
            com.google.bj.b.j r15 = (com.google.p4184bj.p4189b.C55893j) r15
            com.google.protobuf.bv r1 = r1.build()
            com.google.bj.b.x r1 = (com.google.p4184bj.p4189b.C55907x) r1
            r1.getClass()
            r15.f148735f = r1
            int r1 = r15.f148730a
            r1 = r1 | 32
            r15.f148730a = r1
            com.google.common.base.ax r15 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x06a0
        L_0x0277:
            java.lang.UnsupportedOperationException r15 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Screen state not specified."
            r15.<init>(r0)
            throw r15
        L_0x027f:
            java.lang.UnsupportedOperationException r15 = new java.lang.UnsupportedOperationException
            r15.<init>(r14)
            throw r15
        L_0x0285:
            if (r1 != r13) goto L_0x028c
            java.lang.Object r15 = r15.f126692b
            com.google.assistant.ag.c.ce r15 = (com.google.assistant.p3803ag.p3809c.C48985ce) r15
            goto L_0x028e
        L_0x028c:
            com.google.assistant.ag.c.ce r15 = com.google.assistant.p3803ag.p3809c.C48985ce.f126722e
        L_0x028e:
            com.google.bj.b.r r1 = com.google.p4184bj.p4189b.C55901r.f148744j
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.bj.b.o r1 = (com.google.p4184bj.p4189b.C55898o) r1
            int r9 = r15.f126724a
            if (r9 == 0) goto L_0x02a3
            if (r9 == r8) goto L_0x02a1
            if (r9 == r6) goto L_0x029f
            goto L_0x02a4
        L_0x029f:
            r2 = 2
            goto L_0x02a4
        L_0x02a1:
            r2 = 1
            goto L_0x02a4
        L_0x02a3:
            r2 = 3
        L_0x02a4:
            int r10 = r2 + -1
            if (r2 == 0) goto L_0x0478
            if (r10 == 0) goto L_0x0470
            if (r10 == r8) goto L_0x02b8
            if (r10 == r7) goto L_0x02b0
            goto L_0x0359
        L_0x02b0:
            java.lang.UnsupportedOperationException r15 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "No location type."
            r15.<init>(r0)
            throw r15
        L_0x02b8:
            if (r9 != r6) goto L_0x02bf
            java.lang.Object r2 = r15.f126725b
            com.google.assistant.ag.c.bu r2 = (com.google.assistant.p3803ag.p3809c.C48974bu) r2
            goto L_0x02c1
        L_0x02bf:
            com.google.assistant.ag.c.bu r2 = com.google.assistant.p3803ag.p3809c.C48974bu.f126695d
        L_0x02c1:
            int r2 = r2.f126697a
            r2 = r2 & r8
            if (r2 == 0) goto L_0x0468
            int r2 = r15.f126724a
            if (r2 != r6) goto L_0x02cf
            java.lang.Object r9 = r15.f126725b
            com.google.assistant.ag.c.bu r9 = (com.google.assistant.p3803ag.p3809c.C48974bu) r9
            goto L_0x02d1
        L_0x02cf:
            com.google.assistant.ag.c.bu r9 = com.google.assistant.p3803ag.p3809c.C48974bu.f126695d
        L_0x02d1:
            int r9 = r9.f126697a
            r9 = r9 & r7
            if (r9 == 0) goto L_0x0468
            if (r2 != r6) goto L_0x02dd
            java.lang.Object r2 = r15.f126725b
            com.google.assistant.ag.c.bu r2 = (com.google.assistant.p3803ag.p3809c.C48974bu) r2
            goto L_0x02df
        L_0x02dd:
            com.google.assistant.ag.c.bu r2 = com.google.assistant.p3803ag.p3809c.C48974bu.f126695d
        L_0x02df:
            com.google.cg.k r2 = r2.f126698b
            if (r2 != 0) goto L_0x02e5
            com.google.cg.k r2 = com.google.p4479cg.C58079k.f155250c
        L_0x02e5:
            double r9 = r2.f155252a
            int r2 = m35026a(r9)
            r1.copyOnWrite()
            com.google.protobuf.bv r9 = r1.instance
            com.google.bj.b.r r9 = (com.google.p4184bj.p4189b.C55901r) r9
            int r10 = r9.f148746a
            r3 = r3 | r10
            r9.f148746a = r3
            r9.f148750e = r2
            int r2 = r15.f126724a
            if (r2 != r6) goto L_0x0302
            java.lang.Object r2 = r15.f126725b
            com.google.assistant.ag.c.bu r2 = (com.google.assistant.p3803ag.p3809c.C48974bu) r2
            goto L_0x0304
        L_0x0302:
            com.google.assistant.ag.c.bu r2 = com.google.assistant.p3803ag.p3809c.C48974bu.f126695d
        L_0x0304:
            com.google.cg.k r2 = r2.f126698b
            if (r2 != 0) goto L_0x030a
            com.google.cg.k r2 = com.google.p4479cg.C58079k.f155250c
        L_0x030a:
            double r2 = r2.f155253b
            int r2 = m35026a(r2)
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.bj.b.r r3 = (com.google.p4184bj.p4189b.C55901r) r3
            int r9 = r3.f148746a
            r9 = r9 | 16
            r3.f148746a = r9
            r3.f148751f = r2
            int r2 = r15.f126724a
            if (r2 != r6) goto L_0x0328
            java.lang.Object r2 = r15.f126725b
            com.google.assistant.ag.c.bu r2 = (com.google.assistant.p3803ag.p3809c.C48974bu) r2
            goto L_0x032a
        L_0x0328:
            com.google.assistant.ag.c.bu r2 = com.google.assistant.p3803ag.p3809c.C48974bu.f126695d
        L_0x032a:
            long r2 = r2.f126699c
            r1.copyOnWrite()
            com.google.protobuf.bv r9 = r1.instance
            com.google.bj.b.r r9 = (com.google.p4184bj.p4189b.C55901r) r9
            int r10 = r9.f148746a
            r10 = r10 | 64
            r9.f148746a = r10
            double r2 = (double) r2
            r9.f148753h = r2
            int r2 = r15.f126724a
            if (r2 != r6) goto L_0x0345
            java.lang.Object r2 = r15.f126725b
            com.google.assistant.ag.c.bu r2 = (com.google.assistant.p3803ag.p3809c.C48974bu) r2
            goto L_0x0347
        L_0x0345:
            com.google.assistant.ag.c.bu r2 = com.google.assistant.p3803ag.p3809c.C48974bu.f126695d
        L_0x0347:
            long r2 = r2.f126699c
            r1.copyOnWrite()
            com.google.protobuf.bv r9 = r1.instance
            com.google.bj.b.r r9 = (com.google.p4184bj.p4189b.C55901r) r9
            int r10 = r9.f148746a
            r10 = r10 | 32
            r9.f148746a = r10
            double r2 = (double) r2
            r9.f148752g = r2
        L_0x0359:
            int r2 = r15.f126726c
            int r3 = com.google.assistant.p3803ag.p3809c.C48984cd.m85333a(r2)
            int r9 = r3 + -1
            if (r3 == 0) goto L_0x0467
            if (r9 == 0) goto L_0x03e6
            if (r9 != r8) goto L_0x03e0
            if (r2 != r5) goto L_0x036e
            java.lang.Object r2 = r15.f126727d
            com.google.assistant.ag.c.ca r2 = (com.google.assistant.p3803ag.p3809c.C48981ca) r2
            goto L_0x0370
        L_0x036e:
            com.google.assistant.ag.c.ca r2 = com.google.assistant.p3803ag.p3809c.C48981ca.f126715d
        L_0x0370:
            int r2 = r2.f126717a
            r2 = r2 & r7
            if (r2 == 0) goto L_0x03d8
            int r2 = r15.f126726c
            if (r2 != r5) goto L_0x037e
            java.lang.Object r2 = r15.f126727d
            com.google.assistant.ag.c.ca r2 = (com.google.assistant.p3803ag.p3809c.C48981ca) r2
            goto L_0x0380
        L_0x037e:
            com.google.assistant.ag.c.ca r2 = com.google.assistant.p3803ag.p3809c.C48981ca.f126715d
        L_0x0380:
            int r2 = r2.f126718b
            int r2 = com.google.assistant.p3803ag.p3809c.C48979bz.m85330a(r2)
            if (r2 != 0) goto L_0x0389
            r2 = 1
        L_0x0389:
            int r2 = r2 + -1
            if (r2 == r8) goto L_0x03a6
            if (r2 != r7) goto L_0x039e
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.bj.b.r r2 = (com.google.p4184bj.p4189b.C55901r) r2
            r2.f148747b = r5
            int r3 = r2.f148746a
            r3 = r3 | r8
            r2.f148746a = r3
            goto L_0x03b4
        L_0x039e:
            java.lang.UnsupportedOperationException r15 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Unsupported location change type."
            r15.<init>(r0)
            throw r15
        L_0x03a6:
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.bj.b.r r2 = (com.google.p4184bj.p4189b.C55901r) r2
            r2.f148747b = r7
            int r3 = r2.f148746a
            r3 = r3 | r8
            r2.f148746a = r3
        L_0x03b4:
            int r2 = r15.f126726c
            if (r2 != r5) goto L_0x03bd
            java.lang.Object r15 = r15.f126727d
            com.google.assistant.ag.c.ca r15 = (com.google.assistant.p3803ag.p3809c.C48981ca) r15
            goto L_0x03bf
        L_0x03bd:
            com.google.assistant.ag.c.ca r15 = com.google.assistant.p3803ag.p3809c.C48981ca.f126715d
        L_0x03bf:
            long r2 = r15.f126719c
            j$.time.Duration r15 = p3186j$.time.Duration.ofSeconds(r2)
            long r2 = r15.toMillis()
            r1.copyOnWrite()
            com.google.protobuf.bv r15 = r1.instance
            com.google.bj.b.r r15 = (com.google.p4184bj.p4189b.C55901r) r15
            int r4 = r15.f148746a
            r4 = r4 | r6
            r15.f148746a = r4
            r15.f148749d = r2
            goto L_0x0426
        L_0x03d8:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Condition is missing min time outside fence."
            r15.<init>(r0)
            throw r15
        L_0x03e0:
            java.lang.UnsupportedOperationException r15 = new java.lang.UnsupportedOperationException
            r15.<init>(r14)
            throw r15
        L_0x03e6:
            if (r2 != r7) goto L_0x03ed
            java.lang.Object r2 = r15.f126727d
            com.google.assistant.ag.c.bw r2 = (com.google.assistant.p3803ag.p3809c.C48976bw) r2
            goto L_0x03ef
        L_0x03ed:
            com.google.assistant.ag.c.bw r2 = com.google.assistant.p3803ag.p3809c.C48976bw.f126700c
        L_0x03ef:
            int r2 = r2.f126702a
            r2 = r2 & r8
            if (r2 == 0) goto L_0x045f
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.bj.b.r r2 = (com.google.p4184bj.p4189b.C55901r) r2
            r2.f148747b = r8
            int r3 = r2.f148746a
            r3 = r3 | r8
            r2.f148746a = r3
            int r2 = r15.f126726c
            if (r2 != r7) goto L_0x040b
            java.lang.Object r15 = r15.f126727d
            com.google.assistant.ag.c.bw r15 = (com.google.assistant.p3803ag.p3809c.C48976bw) r15
            goto L_0x040d
        L_0x040b:
            com.google.assistant.ag.c.bw r15 = com.google.assistant.p3803ag.p3809c.C48976bw.f126700c
        L_0x040d:
            long r2 = r15.f126703b
            j$.time.Duration r15 = p3186j$.time.Duration.ofSeconds(r2)
            long r2 = r15.toMillis()
            r1.copyOnWrite()
            com.google.protobuf.bv r15 = r1.instance
            com.google.bj.b.r r15 = (com.google.p4184bj.p4189b.C55901r) r15
            int r4 = r15.f148746a
            r4 = r4 | 128(0x80, float:1.794E-43)
            r15.f148746a = r4
            r15.f148754i = r2
        L_0x0426:
            r0.copyOnWrite()
            com.google.protobuf.bv r15 = r0.instance
            com.google.bj.b.j r15 = (com.google.p4184bj.p4189b.C55893j) r15
            r15.f148731b = r13
            int r2 = r15.f148730a
            r2 = r2 | r8
            r15.f148730a = r2
            r1.copyOnWrite()
            com.google.protobuf.bv r15 = r1.instance
            com.google.bj.b.r r15 = (com.google.p4184bj.p4189b.C55901r) r15
            r15.f148748c = r8
            int r2 = r15.f148746a
            r2 = r2 | r7
            r15.f148746a = r2
            r0.copyOnWrite()
            com.google.protobuf.bv r15 = r0.instance
            com.google.bj.b.j r15 = (com.google.p4184bj.p4189b.C55893j) r15
            com.google.protobuf.bv r1 = r1.build()
            com.google.bj.b.r r1 = (com.google.p4184bj.p4189b.C55901r) r1
            r1.getClass()
            r15.f148734e = r1
            int r1 = r15.f148730a
            r1 = r1 | r6
            r15.f148730a = r1
            com.google.common.base.ax r15 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x06a0
        L_0x045f:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Condition is missing dwell time."
            r15.<init>(r0)
            throw r15
        L_0x0467:
            throw r4
        L_0x0468:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Geographic location condition is missing the center or the radius."
            r15.<init>(r0)
            throw r15
        L_0x0470:
            java.lang.UnsupportedOperationException r15 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Unsupported location type: PRESET_LOCATION."
            r15.<init>(r0)
            throw r15
        L_0x0478:
            throw r4
        L_0x0479:
            if (r1 != r7) goto L_0x0480
            java.lang.Object r15 = r15.f126692b
            com.google.assistant.ag.c.dj r15 = (com.google.assistant.p3803ag.p3809c.C49017dj) r15
            goto L_0x0482
        L_0x0480:
            com.google.assistant.ag.c.dj r15 = com.google.assistant.p3803ag.p3809c.C49017dj.f126788c
        L_0x0482:
            int r1 = r15.f126790a
            int r9 = com.google.assistant.p3803ag.p3809c.C49008da.m85342b(r1)
            int r14 = r9 + -1
            if (r9 == 0) goto L_0x0613
            if (r14 == 0) goto L_0x058d
            if (r14 == r8) goto L_0x04ab
            java.lang.UnsupportedOperationException r15 = new java.lang.UnsupportedOperationException
            java.lang.Object[] r0 = new java.lang.Object[r8]
            int r1 = com.google.assistant.p3803ag.p3809c.C49008da.m85342b(r1)
            java.lang.String r3 = com.google.assistant.p3803ag.p3809c.C49008da.m85341a(r1)
            if (r1 == 0) goto L_0x04aa
            r0[r2] = r3
            java.lang.String r1 = "TimeContext interval case: %s is not supported."
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r15.<init>(r0)
            throw r15
        L_0x04aa:
            throw r4
        L_0x04ab:
            if (r1 != r7) goto L_0x04b2
            java.lang.Object r15 = r15.f126791b
            com.google.assistant.ag.c.di r15 = (com.google.assistant.p3803ag.p3809c.C49016di) r15
            goto L_0x04b4
        L_0x04b2:
            com.google.assistant.ag.c.di r15 = com.google.assistant.p3803ag.p3809c.C49016di.f126780f
        L_0x04b4:
            com.google.bj.b.ab r1 = com.google.p4184bj.p4189b.C55882ab.f148700g
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.bj.b.y r1 = (com.google.p4184bj.p4189b.C55908y) r1
            int r9 = r15.f126784c
            int r9 = com.google.assistant.p3803ag.p3809c.C49015dh.m85343a(r9)
            if (r9 != 0) goto L_0x04c5
            r9 = 1
        L_0x04c5:
            int r9 = r9 + -1
            switch(r9) {
                case 1: goto L_0x04e6;
                case 2: goto L_0x04e4;
                case 3: goto L_0x04e2;
                case 4: goto L_0x04e0;
                case 5: goto L_0x04dd;
                case 6: goto L_0x04da;
                case 7: goto L_0x04d7;
                case 8: goto L_0x04e7;
                case 9: goto L_0x04d4;
                case 10: goto L_0x04d2;
                default: goto L_0x04ca;
            }
        L_0x04ca:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid TimeContext.WithinDayInterval.Type."
            r15.<init>(r0)
            throw r15
        L_0x04d2:
            r10 = 6
            goto L_0x04e7
        L_0x04d4:
            r10 = 12
            goto L_0x04e7
        L_0x04d7:
            r10 = 10
            goto L_0x04e7
        L_0x04da:
            r10 = 9
            goto L_0x04e7
        L_0x04dd:
            r10 = 8
            goto L_0x04e7
        L_0x04e0:
            r10 = 7
            goto L_0x04e7
        L_0x04e2:
            r10 = 4
            goto L_0x04e7
        L_0x04e4:
            r10 = 5
            goto L_0x04e7
        L_0x04e6:
            r10 = 3
        L_0x04e7:
            r1.copyOnWrite()
            com.google.protobuf.bv r9 = r1.instance
            com.google.bj.b.ab r9 = (com.google.p4184bj.p4189b.C55882ab) r9
            int r10 = r10 + -1
            r9.f148703b = r10
            int r10 = r9.f148702a
            r10 = r10 | r8
            r9.f148702a = r10
            long r9 = r15.f126785d
            r1.copyOnWrite()
            com.google.protobuf.bv r11 = r1.instance
            com.google.bj.b.ab r11 = (com.google.p4184bj.p4189b.C55882ab) r11
            int r12 = r11.f148702a
            r12 = r12 | r6
            r11.f148702a = r12
            r11.f148705d = r9
            long r9 = r15.f126786e
            r1.copyOnWrite()
            com.google.protobuf.bv r11 = r1.instance
            com.google.bj.b.ab r11 = (com.google.p4184bj.p4189b.C55882ab) r11
            int r12 = r11.f148702a
            r3 = r3 | r12
            r11.f148702a = r3
            r11.f148706e = r9
            int r3 = r15.f126782a
            if (r3 == 0) goto L_0x0524
            if (r3 == r6) goto L_0x0523
            if (r3 == r13) goto L_0x0521
            r5 = 0
            goto L_0x0524
        L_0x0521:
            r5 = 2
            goto L_0x0524
        L_0x0523:
            r5 = 1
        L_0x0524:
            int r9 = r5 + -1
            if (r5 == 0) goto L_0x058c
            if (r9 == 0) goto L_0x0547
            if (r9 == r8) goto L_0x052d
            goto L_0x0561
        L_0x052d:
            if (r3 != r13) goto L_0x0537
            java.lang.Object r15 = r15.f126783b
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r2 = r15.booleanValue()
        L_0x0537:
            r1.copyOnWrite()
            com.google.protobuf.bv r15 = r1.instance
            com.google.bj.b.ab r15 = (com.google.p4184bj.p4189b.C55882ab) r15
            int r3 = r15.f148702a
            r3 = r3 | 32
            r15.f148702a = r3
            r15.f148707f = r2
            goto L_0x0561
        L_0x0547:
            if (r3 != r6) goto L_0x054e
            java.lang.Object r15 = r15.f126783b
            java.lang.String r15 = (java.lang.String) r15
            goto L_0x0550
        L_0x054e:
            java.lang.String r15 = ""
        L_0x0550:
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.bj.b.ab r2 = (com.google.p4184bj.p4189b.C55882ab) r2
            r15.getClass()
            int r3 = r2.f148702a
            r3 = r3 | r7
            r2.f148702a = r3
            r2.f148704c = r15
        L_0x0561:
            r0.copyOnWrite()
            com.google.protobuf.bv r15 = r0.instance
            com.google.bj.b.j r15 = (com.google.p4184bj.p4189b.C55893j) r15
            r15.f148731b = r6
            int r2 = r15.f148730a
            r2 = r2 | r8
            r15.f148730a = r2
            r0.copyOnWrite()
            com.google.protobuf.bv r15 = r0.instance
            com.google.bj.b.j r15 = (com.google.p4184bj.p4189b.C55893j) r15
            com.google.protobuf.bv r1 = r1.build()
            com.google.bj.b.ab r1 = (com.google.p4184bj.p4189b.C55882ab) r1
            r1.getClass()
            r15.f148733d = r1
            int r1 = r15.f148730a
            r1 = r1 | r7
            r15.f148730a = r1
            com.google.common.base.ax r15 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x06a0
        L_0x058c:
            throw r4
        L_0x058d:
            if (r1 != r8) goto L_0x0594
            java.lang.Object r15 = r15.f126791b
            com.google.assistant.ag.c.cy r15 = (com.google.assistant.p3803ag.p3809c.C49005cy) r15
            goto L_0x0596
        L_0x0594:
            com.google.assistant.ag.c.cy r15 = com.google.assistant.p3803ag.p3809c.C49005cy.f126761d
        L_0x0596:
            int r1 = r15.f126763a
            r2 = r1 & 1
            if (r2 == 0) goto L_0x059d
            goto L_0x05a0
        L_0x059d:
            r1 = r1 & r7
            if (r1 == 0) goto L_0x060b
        L_0x05a0:
            com.google.bj.b.ab r1 = com.google.p4184bj.p4189b.C55882ab.f148700g
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.bj.b.y r1 = (com.google.p4184bj.p4189b.C55908y) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.bj.b.ab r2 = (com.google.p4184bj.p4189b.C55882ab) r2
            r2.f148703b = r8
            int r4 = r2.f148702a
            r4 = r4 | r8
            r2.f148702a = r4
            int r2 = r15.f126763a
            r2 = r2 & r8
            if (r2 == 0) goto L_0x05cb
            long r4 = r15.f126764b
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.bj.b.ab r2 = (com.google.p4184bj.p4189b.C55882ab) r2
            int r9 = r2.f148702a
            r9 = r9 | r6
            r2.f148702a = r9
            r2.f148705d = r4
        L_0x05cb:
            int r2 = r15.f126763a
            r2 = r2 & r7
            if (r2 == 0) goto L_0x05e0
            long r4 = r15.f126765c
            r1.copyOnWrite()
            com.google.protobuf.bv r15 = r1.instance
            com.google.bj.b.ab r15 = (com.google.p4184bj.p4189b.C55882ab) r15
            int r2 = r15.f148702a
            r2 = r2 | r3
            r15.f148702a = r2
            r15.f148706e = r4
        L_0x05e0:
            r0.copyOnWrite()
            com.google.protobuf.bv r15 = r0.instance
            com.google.bj.b.j r15 = (com.google.p4184bj.p4189b.C55893j) r15
            r15.f148731b = r6
            int r2 = r15.f148730a
            r2 = r2 | r8
            r15.f148730a = r2
            r0.copyOnWrite()
            com.google.protobuf.bv r15 = r0.instance
            com.google.bj.b.j r15 = (com.google.p4184bj.p4189b.C55893j) r15
            com.google.protobuf.bv r1 = r1.build()
            com.google.bj.b.ab r1 = (com.google.p4184bj.p4189b.C55882ab) r1
            r1.getClass()
            r15.f148733d = r1
            int r1 = r15.f148730a
            r1 = r1 | r7
            r15.f148730a = r1
            com.google.common.base.ax r15 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x06a0
        L_0x060b:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "TimeContext.AbsoluteInterval has no start and no stop time."
            r15.<init>(r0)
            throw r15
        L_0x0613:
            throw r4
        L_0x0614:
            if (r1 != r8) goto L_0x061b
            java.lang.Object r15 = r15.f126692b
            com.google.assistant.ag.c.z r15 = (com.google.assistant.p3803ag.p3809c.C49156z) r15
            goto L_0x061d
        L_0x061b:
            com.google.assistant.ag.c.z r15 = com.google.assistant.p3803ag.p3809c.C49156z.f127111d
        L_0x061d:
            int r1 = r15.f127113a
            r2 = r1 & 1
            if (r2 == 0) goto L_0x0624
            goto L_0x0627
        L_0x0624:
            r1 = r1 & r7
            if (r1 == 0) goto L_0x06a1
        L_0x0627:
            com.google.bj.b.ab r1 = com.google.p4184bj.p4189b.C55882ab.f148700g
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.bj.b.y r1 = (com.google.p4184bj.p4189b.C55908y) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.bj.b.ab r2 = (com.google.p4184bj.p4189b.C55882ab) r2
            r2.f148703b = r8
            int r4 = r2.f148702a
            r4 = r4 | r8
            r2.f148702a = r4
            int r2 = r15.f127113a
            r2 = r2 & r8
            if (r2 == 0) goto L_0x065a
            com.google.protobuf.fg r2 = r15.f127114b
            if (r2 != 0) goto L_0x0648
            com.google.protobuf.fg r2 = com.google.protobuf.C63042fg.f170152c
        L_0x0648:
            long r4 = com.google.protobuf.p4750c.C62953e.m95478c(r2)
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.bj.b.ab r2 = (com.google.p4184bj.p4189b.C55882ab) r2
            int r9 = r2.f148702a
            r9 = r9 | r6
            r2.f148702a = r9
            r2.f148705d = r4
        L_0x065a:
            int r2 = r15.f127113a
            r2 = r2 & r7
            if (r2 == 0) goto L_0x0677
            com.google.protobuf.fg r15 = r15.f127115c
            if (r15 != 0) goto L_0x0665
            com.google.protobuf.fg r15 = com.google.protobuf.C63042fg.f170152c
        L_0x0665:
            long r4 = com.google.protobuf.p4750c.C62953e.m95478c(r15)
            r1.copyOnWrite()
            com.google.protobuf.bv r15 = r1.instance
            com.google.bj.b.ab r15 = (com.google.p4184bj.p4189b.C55882ab) r15
            int r2 = r15.f148702a
            r2 = r2 | r3
            r15.f148702a = r2
            r15.f148706e = r4
        L_0x0677:
            r0.copyOnWrite()
            com.google.protobuf.bv r15 = r0.instance
            com.google.bj.b.j r15 = (com.google.p4184bj.p4189b.C55893j) r15
            r15.f148731b = r6
            int r2 = r15.f148730a
            r2 = r2 | r8
            r15.f148730a = r2
            r0.copyOnWrite()
            com.google.protobuf.bv r15 = r0.instance
            com.google.bj.b.j r15 = (com.google.p4184bj.p4189b.C55893j) r15
            com.google.protobuf.bv r1 = r1.build()
            com.google.bj.b.ab r1 = (com.google.p4184bj.p4189b.C55882ab) r1
            r1.getClass()
            r15.f148733d = r1
            int r1 = r15.f148730a
            r1 = r1 | r7
            r15.f148730a = r1
            com.google.common.base.ax r15 = com.google.common.base.C58833ax.m90834k(r0)
        L_0x06a0:
            return r15
        L_0x06a1:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "AbsoluteTimeInterval has no start and no stop time."
            r15.<init>(r0)
            throw r15
        L_0x06a9:
            throw r4
        L_0x06aa:
            goto L_0x06ac
        L_0x06ab:
            throw r4
        L_0x06ac:
            goto L_0x06ab
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.contexttrigger.impl.C17759c.m35027b(com.google.assistant.ag.c.az):com.google.common.base.ax");
    }

    /* renamed from: c */
    private static C58833ax m35028c(C55890g gVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C58833ax b = m35027b((C48952az) it.next());
            if (b.mo56113h()) {
                gVar.copyOnWrite();
                C55893j jVar = (C55893j) gVar.instance;
                C55893j jVar2 = (C55893j) ((C55890g) b.mo56107c()).build();
                C55893j jVar3 = C55893j.f148728h;
                jVar2.getClass();
                C62971cq cqVar = jVar.f148732c;
                if (!cqVar.mo58948c()) {
                    jVar.f148732c = C62942bv.mutableCopy(cqVar);
                }
                jVar.f148732c.add(jVar2);
            }
        }
        if (Collections.unmodifiableList(((C55893j) gVar.instance).f148732c).isEmpty()) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k(gVar);
    }
}
