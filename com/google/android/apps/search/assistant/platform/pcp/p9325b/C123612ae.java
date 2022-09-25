package com.google.android.apps.search.assistant.platform.pcp.p9325b;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123708ab;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123712af;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123714ah;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123730ax;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123743bj;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123751br;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123757bx;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123759bz;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123772cl;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123779h;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123787p;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123789r;
import com.google.assistant.p3994s.p3995a.C53126ci;
import com.google.assistant.p3994s.p3995a.C53127cj;
import com.google.assistant.p3994s.p3995a.C53128ck;
import com.google.assistant.p3994s.p3995a.C53153di;
import com.google.assistant.p3994s.p3995a.C53190es;
import com.google.assistant.p3994s.p3995a.C53204ff;
import com.google.assistant.p3994s.p3995a.C53212fn;
import com.google.assistant.p3994s.p3995a.C53218ft;
import com.google.assistant.p3994s.p3995a.C53227gb;
import com.google.assistant.p3994s.p3995a.C53245gt;
import com.google.assistant.p3994s.p3995a.C53247gv;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.b.ae */
/* compiled from: PG */
public final class C123612ae {

    /* renamed from: a */
    private static final C59071e f341537a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.pcp.b.ae");

    /* renamed from: a */
    public static C123744bk m202967a(int i, String str) {
        C123743bj bjVar = (C123743bj) C123744bk.f341804l.createBuilder();
        bjVar.copyOnWrite();
        C123744bk bkVar = (C123744bk) bjVar.instance;
        str.getClass();
        bkVar.f341806a |= 4;
        bkVar.f341812g = str;
        bjVar.copyOnWrite();
        C123744bk bkVar2 = (C123744bk) bjVar.instance;
        bkVar2.f341806a |= 1;
        bkVar2.f341810e = i;
        return (C123744bk) bjVar.build();
    }

    /* JADX WARNING: type inference failed for: r9v7, types: [com.google.protobuf.bv] */
    /* JADX WARNING: type inference failed for: r9v16, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.assistant.p3803ag.p3809c.C48952az m202969c(com.google.assistant.p3803ag.p3809c.C48952az r8, long r9, long r11) {
        /*
            int r0 = r8.f126659a
            r1 = 1
            if (r0 != r1) goto L_0x000a
            java.lang.Object r0 = r8.f126660b
            com.google.assistant.ag.c.br r0 = (com.google.assistant.p3803ag.p3809c.C48971br) r0
            goto L_0x000c
        L_0x000a:
            com.google.assistant.ag.c.br r0 = com.google.assistant.p3803ag.p3809c.C48971br.f126689d
        L_0x000c:
            int r2 = r0.f126691a
            if (r2 != r1) goto L_0x0015
            java.lang.Object r0 = r0.f126692b
            com.google.assistant.ag.c.z r0 = (com.google.assistant.p3803ag.p3809c.C49156z) r0
            goto L_0x0017
        L_0x0015:
            com.google.assistant.ag.c.z r0 = com.google.assistant.p3803ag.p3809c.C49156z.f127111d
        L_0x0017:
            com.google.protobuf.fg r2 = r0.f127114b
            if (r2 != 0) goto L_0x001d
            com.google.protobuf.fg r2 = com.google.protobuf.C63042fg.f170152c
        L_0x001d:
            j$.time.Instant r2 = com.google.protobuf.p4750c.C62950b.m95474e(r2)
            long r2 = r2.toEpochMilli()
            com.google.protobuf.fg r4 = r0.f127115c
            if (r4 != 0) goto L_0x002b
            com.google.protobuf.fg r4 = com.google.protobuf.C63042fg.f170152c
        L_0x002b:
            j$.time.Instant r4 = com.google.protobuf.p4750c.C62950b.m95474e(r4)
            long r4 = r4.toEpochMilli()
            int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0079
            com.google.assistant.ag.c.z r11 = com.google.assistant.p3803ag.p3809c.C49156z.f127111d
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.assistant.ag.c.y r11 = (com.google.assistant.p3803ag.p3809c.C49155y) r11
            r6 = 1
            long r9 = r9 + r6
            long r9 = java.lang.Math.max(r2, r9)
            com.google.protobuf.fg r9 = com.google.protobuf.p4750c.C62953e.m95484i(r9)
            r11.copyOnWrite()
            com.google.protobuf.bv r10 = r11.instance
            com.google.assistant.ag.c.z r10 = (com.google.assistant.p3803ag.p3809c.C49156z) r10
            r9.getClass()
            r10.f127114b = r9
            int r9 = r10.f127113a
            r9 = r9 | r1
            r10.f127113a = r9
            com.google.protobuf.fg r9 = com.google.protobuf.p4750c.C62953e.m95484i(r4)
            r11.copyOnWrite()
            com.google.protobuf.bv r10 = r11.instance
            com.google.assistant.ag.c.z r10 = (com.google.assistant.p3803ag.p3809c.C49156z) r10
            r9.getClass()
            r10.f127115c = r9
            int r9 = r10.f127113a
            r9 = r9 | 2
            r10.f127113a = r9
            com.google.protobuf.bv r9 = r11.build()
            r0 = r9
            com.google.assistant.ag.c.z r0 = (com.google.assistant.p3803ag.p3809c.C49156z) r0
            goto L_0x00ba
        L_0x0079:
            int r9 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r9 > 0) goto L_0x00ba
            com.google.assistant.ag.c.z r9 = com.google.assistant.p3803ag.p3809c.C49156z.f127111d
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.assistant.ag.c.y r9 = (com.google.assistant.p3803ag.p3809c.C49155y) r9
            com.google.protobuf.fg r10 = com.google.protobuf.p4750c.C62953e.m95484i(r2)
            r9.copyOnWrite()
            com.google.protobuf.bv r0 = r9.instance
            com.google.assistant.ag.c.z r0 = (com.google.assistant.p3803ag.p3809c.C49156z) r0
            r10.getClass()
            r0.f127114b = r10
            int r10 = r0.f127113a
            r10 = r10 | r1
            r0.f127113a = r10
            r2 = -1
            long r11 = r11 + r2
            com.google.protobuf.fg r10 = com.google.protobuf.p4750c.C62953e.m95484i(r11)
            r9.copyOnWrite()
            com.google.protobuf.bv r11 = r9.instance
            com.google.assistant.ag.c.z r11 = (com.google.assistant.p3803ag.p3809c.C49156z) r11
            r10.getClass()
            r11.f127115c = r10
            int r10 = r11.f127113a
            r10 = r10 | 2
            r11.f127113a = r10
            com.google.protobuf.bv r9 = r9.build()
            r0 = r9
            com.google.assistant.ag.c.z r0 = (com.google.assistant.p3803ag.p3809c.C49156z) r0
        L_0x00ba:
            com.google.protobuf.bn r9 = r8.toBuilder()
            com.google.assistant.ag.c.av r9 = (com.google.assistant.p3803ag.p3809c.C48948av) r9
            int r10 = r8.f126659a
            if (r10 != r1) goto L_0x00c9
            java.lang.Object r8 = r8.f126660b
            com.google.assistant.ag.c.br r8 = (com.google.assistant.p3803ag.p3809c.C48971br) r8
            goto L_0x00cb
        L_0x00c9:
            com.google.assistant.ag.c.br r8 = com.google.assistant.p3803ag.p3809c.C48971br.f126689d
        L_0x00cb:
            com.google.protobuf.bn r8 = r8.toBuilder()
            com.google.assistant.ag.c.bl r8 = (com.google.assistant.p3803ag.p3809c.C48965bl) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.assistant.ag.c.br r10 = (com.google.assistant.p3803ag.p3809c.C48971br) r10
            r0.getClass()
            r10.f126692b = r0
            r10.f126691a = r1
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.assistant.ag.c.az r10 = (com.google.assistant.p3803ag.p3809c.C48952az) r10
            com.google.protobuf.bv r8 = r8.build()
            com.google.assistant.ag.c.br r8 = (com.google.assistant.p3803ag.p3809c.C48971br) r8
            r8.getClass()
            r10.f126660b = r8
            r10.f126659a = r1
            com.google.protobuf.bv r8 = r9.build()
            com.google.assistant.ag.c.az r8 = (com.google.assistant.p3803ag.p3809c.C48952az) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.pcp.p9325b.C123612ae.m202969c(com.google.assistant.ag.c.az, long, long):com.google.assistant.ag.c.az");
    }

    /* JADX WARNING: type inference failed for: r11v12, types: [com.google.protobuf.bv] */
    /* JADX WARNING: type inference failed for: r11v17, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.assistant.p3803ag.p3809c.C48952az m202970d(com.google.assistant.p3803ag.p3809c.C48952az r10, long r11, long r13) {
        /*
            int r0 = r10.f126659a
            r1 = 1
            if (r0 != r1) goto L_0x000a
            java.lang.Object r0 = r10.f126660b
            com.google.assistant.ag.c.br r0 = (com.google.assistant.p3803ag.p3809c.C48971br) r0
            goto L_0x000c
        L_0x000a:
            com.google.assistant.ag.c.br r0 = com.google.assistant.p3803ag.p3809c.C48971br.f126689d
        L_0x000c:
            int r2 = r0.f126691a
            r3 = 2
            if (r2 != r3) goto L_0x0016
            java.lang.Object r0 = r0.f126692b
            com.google.assistant.ag.c.dj r0 = (com.google.assistant.p3803ag.p3809c.C49017dj) r0
            goto L_0x0018
        L_0x0016:
            com.google.assistant.ag.c.dj r0 = com.google.assistant.p3803ag.p3809c.C49017dj.f126788c
        L_0x0018:
            int r2 = r0.f126790a
            if (r2 != r1) goto L_0x0021
            java.lang.Object r0 = r0.f126791b
            com.google.assistant.ag.c.cy r0 = (com.google.assistant.p3803ag.p3809c.C49005cy) r0
            goto L_0x0023
        L_0x0021:
            com.google.assistant.ag.c.cy r0 = com.google.assistant.p3803ag.p3809c.C49005cy.f126761d
        L_0x0023:
            long r4 = r0.f126764b
            long r6 = r0.f126765c
            int r2 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x005e
            com.google.assistant.ag.c.cy r13 = com.google.assistant.p3803ag.p3809c.C49005cy.f126761d
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.assistant.ag.c.cx r13 = (com.google.assistant.p3803ag.p3809c.C49004cx) r13
            r8 = 1
            long r11 = r11 + r8
            long r11 = java.lang.Math.max(r4, r11)
            r13.copyOnWrite()
            com.google.protobuf.bv r14 = r13.instance
            com.google.assistant.ag.c.cy r14 = (com.google.assistant.p3803ag.p3809c.C49005cy) r14
            int r0 = r14.f126763a
            r0 = r0 | r1
            r14.f126763a = r0
            r14.f126764b = r11
            r13.copyOnWrite()
            com.google.protobuf.bv r11 = r13.instance
            com.google.assistant.ag.c.cy r11 = (com.google.assistant.p3803ag.p3809c.C49005cy) r11
            int r12 = r11.f126763a
            r12 = r12 | r3
            r11.f126763a = r12
            r11.f126765c = r6
            com.google.protobuf.bv r11 = r13.build()
            r0 = r11
            com.google.assistant.ag.c.cy r0 = (com.google.assistant.p3803ag.p3809c.C49005cy) r0
            goto L_0x0090
        L_0x005e:
            int r11 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r11 > 0) goto L_0x0090
            com.google.assistant.ag.c.cy r11 = com.google.assistant.p3803ag.p3809c.C49005cy.f126761d
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.assistant.ag.c.cx r11 = (com.google.assistant.p3803ag.p3809c.C49004cx) r11
            r11.copyOnWrite()
            com.google.protobuf.bv r12 = r11.instance
            com.google.assistant.ag.c.cy r12 = (com.google.assistant.p3803ag.p3809c.C49005cy) r12
            int r0 = r12.f126763a
            r0 = r0 | r1
            r12.f126763a = r0
            r12.f126764b = r4
            r11.copyOnWrite()
            com.google.protobuf.bv r12 = r11.instance
            com.google.assistant.ag.c.cy r12 = (com.google.assistant.p3803ag.p3809c.C49005cy) r12
            int r0 = r12.f126763a
            r0 = r0 | r3
            r12.f126763a = r0
            r4 = -1
            long r13 = r13 + r4
            r12.f126765c = r13
            com.google.protobuf.bv r11 = r11.build()
            r0 = r11
            com.google.assistant.ag.c.cy r0 = (com.google.assistant.p3803ag.p3809c.C49005cy) r0
        L_0x0090:
            com.google.assistant.ag.c.dj r11 = com.google.assistant.p3803ag.p3809c.C49017dj.f126788c
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.assistant.ag.c.cz r11 = (com.google.assistant.p3803ag.p3809c.C49006cz) r11
            r11.copyOnWrite()
            com.google.protobuf.bv r12 = r11.instance
            com.google.assistant.ag.c.dj r12 = (com.google.assistant.p3803ag.p3809c.C49017dj) r12
            r0.getClass()
            r12.f126791b = r0
            r12.f126790a = r1
            com.google.protobuf.bv r11 = r11.build()
            com.google.assistant.ag.c.dj r11 = (com.google.assistant.p3803ag.p3809c.C49017dj) r11
            com.google.protobuf.bn r12 = r10.toBuilder()
            com.google.assistant.ag.c.av r12 = (com.google.assistant.p3803ag.p3809c.C48948av) r12
            int r13 = r10.f126659a
            if (r13 != r1) goto L_0x00bb
            java.lang.Object r10 = r10.f126660b
            com.google.assistant.ag.c.br r10 = (com.google.assistant.p3803ag.p3809c.C48971br) r10
            goto L_0x00bd
        L_0x00bb:
            com.google.assistant.ag.c.br r10 = com.google.assistant.p3803ag.p3809c.C48971br.f126689d
        L_0x00bd:
            com.google.protobuf.bn r10 = r10.toBuilder()
            com.google.assistant.ag.c.bl r10 = (com.google.assistant.p3803ag.p3809c.C48965bl) r10
            r10.copyOnWrite()
            com.google.protobuf.bv r13 = r10.instance
            com.google.assistant.ag.c.br r13 = (com.google.assistant.p3803ag.p3809c.C48971br) r13
            r11.getClass()
            r13.f126692b = r11
            r13.f126691a = r3
            r12.copyOnWrite()
            com.google.protobuf.bv r11 = r12.instance
            com.google.assistant.ag.c.az r11 = (com.google.assistant.p3803ag.p3809c.C48952az) r11
            com.google.protobuf.bv r10 = r10.build()
            com.google.assistant.ag.c.br r10 = (com.google.assistant.p3803ag.p3809c.C48971br) r10
            r10.getClass()
            r11.f126660b = r10
            r11.f126659a = r1
            com.google.protobuf.bv r10 = r12.build()
            com.google.assistant.ag.c.az r10 = (com.google.assistant.p3803ag.p3809c.C48952az) r10
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.pcp.p9325b.C123612ae.m202970d(com.google.assistant.ag.c.az, long, long):com.google.assistant.ag.c.az");
    }

    /* renamed from: e */
    public static void m202971e(C123743bj bjVar, C53127cj cjVar, Instant instant) {
        C63042fg c = C62950b.m95472c(instant);
        cjVar.copyOnWrite();
        C53128ck ckVar = (C53128ck) cjVar.instance;
        C53128ck ckVar2 = C53128ck.f139238f;
        c.getClass();
        ckVar.f139244e = c;
        ckVar.f139240a |= 8;
        C53128ck ckVar3 = (C53128ck) cjVar.build();
        bjVar.copyOnWrite();
        C123744bk bkVar = (C123744bk) bjVar.instance;
        C123744bk bkVar2 = C123744bk.f341804l;
        ckVar3.getClass();
        bkVar.f341809d = ckVar3;
        bkVar.f341808c = 35;
    }

    /* renamed from: f */
    public static C123744bk m202972f(int i, String str, byte[] bArr, C123772cl clVar, String str2, long j) {
        C123743bj bjVar = (C123743bj) C123744bk.f341804l.createBuilder();
        bjVar.copyOnWrite();
        C123744bk bkVar = (C123744bk) bjVar.instance;
        str.getClass();
        bkVar.f341806a |= 4;
        bkVar.f341812g = str;
        bjVar.copyOnWrite();
        C123744bk bkVar2 = (C123744bk) bjVar.instance;
        bkVar2.f341806a |= 1;
        bkVar2.f341810e = i;
        if (bArr != null && bArr.length > 0) {
            if (i != 3) {
                if (i != 7) {
                    if (i == 9) {
                        C123730ax axVar = (C123730ax) C62942bv.parseFrom((C62942bv) C123730ax.f341767b, bArr, C62921ba.m95368a());
                        bjVar.copyOnWrite();
                        C123744bk bkVar3 = (C123744bk) bjVar.instance;
                        axVar.getClass();
                        bkVar3.f341809d = axVar;
                        bkVar3.f341808c = 5;
                    } else if (i == 11 || i == 35) {
                        C53190es esVar = (C53190es) C62942bv.parseFrom((C62942bv) C53190es.f139393s, bArr, C62921ba.m95368a());
                        bjVar.copyOnWrite();
                        C123744bk bkVar4 = (C123744bk) bjVar.instance;
                        esVar.getClass();
                        bkVar4.f341809d = esVar;
                        bkVar4.f341808c = 10;
                    } else if (i == 16) {
                        C123759bz bzVar = (C123759bz) C62942bv.parseFrom((C62942bv) C123759bz.f341867e, bArr, C62921ba.m95368a());
                        bjVar.copyOnWrite();
                        C123744bk bkVar5 = (C123744bk) bjVar.instance;
                        bzVar.getClass();
                        bkVar5.f341809d = bzVar;
                        bkVar5.f341808c = 27;
                    } else if (i == 17) {
                        C123787p pVar = (C123787p) C62942bv.parseFrom((C62942bv) C123787p.f341948n, bArr, C62921ba.m95368a());
                        bjVar.copyOnWrite();
                        C123744bk bkVar6 = (C123744bk) bjVar.instance;
                        pVar.getClass();
                        bkVar6.f341809d = pVar;
                        bkVar6.f341808c = 14;
                    } else if (i != 24) {
                        if (i != 25) {
                            if (i == 118) {
                                C53218ft ftVar = (C53218ft) C62942bv.parseFrom((C62942bv) C53218ft.f139481a, bArr, C62921ba.m95368a());
                                bjVar.copyOnWrite();
                                C123744bk bkVar7 = (C123744bk) bjVar.instance;
                                ftVar.getClass();
                                bkVar7.f341809d = ftVar;
                                bkVar7.f341808c = 34;
                            } else if (i != 119) {
                                switch (i) {
                                    case 31:
                                        C123757bx bxVar = (C123757bx) C62942bv.parseFrom((C62942bv) C123757bx.f341854l, bArr, C62921ba.m95368a());
                                        bjVar.copyOnWrite();
                                        C123744bk bkVar8 = (C123744bk) bjVar.instance;
                                        bxVar.getClass();
                                        bkVar8.f341809d = bxVar;
                                        bkVar8.f341808c = 31;
                                        break;
                                    case 32:
                                        C123779h hVar = (C123779h) C62942bv.parseFrom((C62942bv) C123779h.f341925m, bArr, C62921ba.m95368a());
                                        bjVar.copyOnWrite();
                                        C123744bk bkVar9 = (C123744bk) bjVar.instance;
                                        hVar.getClass();
                                        bkVar9.f341809d = hVar;
                                        bkVar9.f341808c = 32;
                                        break;
                                    case 33:
                                        break;
                                    default:
                                        switch (i) {
                                            case 37:
                                                C123708ab abVar = (C123708ab) C62942bv.parseFrom((C62942bv) C123708ab.f341685n, bArr, C62921ba.m95368a());
                                                bjVar.copyOnWrite();
                                                C123744bk bkVar10 = (C123744bk) bjVar.instance;
                                                abVar.getClass();
                                                bkVar10.f341809d = abVar;
                                                bkVar10.f341808c = 36;
                                                break;
                                            case 38:
                                                C123789r rVar = (C123789r) C62942bv.parseFrom((C62942bv) C123789r.f341963n, bArr, C62921ba.m95368a());
                                                bjVar.copyOnWrite();
                                                C123744bk bkVar11 = (C123744bk) bjVar.instance;
                                                rVar.getClass();
                                                bkVar11.f341809d = rVar;
                                                bkVar11.f341808c = 37;
                                                break;
                                            case 39:
                                                C123712af afVar = (C123712af) C62942bv.parseFrom((C62942bv) C123712af.f341704k, bArr, C62921ba.m95368a());
                                                bjVar.copyOnWrite();
                                                C123744bk bkVar12 = (C123744bk) bjVar.instance;
                                                afVar.getClass();
                                                bkVar12.f341809d = afVar;
                                                bkVar12.f341808c = 38;
                                                break;
                                            case 40:
                                                C123714ah ahVar = (C123714ah) C62942bv.parseFrom((C62942bv) C123714ah.f341716j, bArr, C62921ba.m95368a());
                                                bjVar.copyOnWrite();
                                                C123744bk bkVar13 = (C123744bk) bjVar.instance;
                                                ahVar.getClass();
                                                bkVar13.f341809d = ahVar;
                                                bkVar13.f341808c = 39;
                                                break;
                                            case 41:
                                                break;
                                            default:
                                                C59104x d = f341537a.mo56226d();
                                                d.mo56378ag(C58975e.f156826a, "PCP.Database");
                                                ((C59052c) ((C59052c) d).mo56372aa(35185)).mo56387q("ProactiveDataType value %d not supported.", i);
                                                break;
                                        }
                                }
                            } else {
                                C53247gv gvVar = (C53247gv) C62942bv.parseFrom((C62942bv) C53247gv.f139580b, bArr, C62921ba.m95368a());
                                bjVar.copyOnWrite();
                                C123744bk bkVar14 = (C123744bk) bjVar.instance;
                                gvVar.getClass();
                                bkVar14.f341809d = gvVar;
                                bkVar14.f341808c = 40;
                            }
                        }
                        C123751br brVar = (C123751br) C62942bv.parseFrom((C62942bv) C123751br.f341826e, bArr, C62921ba.m95368a());
                        bjVar.copyOnWrite();
                        C123744bk bkVar15 = (C123744bk) bjVar.instance;
                        brVar.getClass();
                        bkVar15.f341809d = brVar;
                        bkVar15.f341808c = 26;
                    } else {
                        m202971e(bjVar, (C53127cj) ((C53128ck) C62942bv.parseFrom((C62942bv) C53128ck.f139238f, bArr, C62921ba.m95368a())).toBuilder(), Instant.ofEpochMilli(j));
                    }
                }
                C53245gt gtVar = (C53245gt) C62942bv.parseFrom((C62942bv) C53245gt.f139564n, bArr, C62921ba.m95368a());
                bjVar.copyOnWrite();
                C123744bk bkVar16 = (C123744bk) bjVar.instance;
                gtVar.getClass();
                bkVar16.f341809d = gtVar;
                bkVar16.f341808c = 11;
            } else {
                C53212fn fnVar = (C53212fn) C62942bv.parseFrom((C62942bv) C53212fn.f139467g, bArr, C62921ba.m95368a());
                bjVar.copyOnWrite();
                C123744bk bkVar17 = (C123744bk) bjVar.instance;
                fnVar.getClass();
                bkVar17.f341809d = fnVar;
                bkVar17.f341808c = 12;
            }
        }
        if (clVar != null && !clVar.equals(C123772cl.f341902h)) {
            bjVar.copyOnWrite();
            C123744bk bkVar18 = (C123744bk) bjVar.instance;
            bkVar18.f341816k = clVar;
            bkVar18.f341807b |= 8;
        }
        if (str2 != null && str2.length() > 0) {
            bjVar.copyOnWrite();
            C123744bk bkVar19 = (C123744bk) bjVar.instance;
            bkVar19.f341806a |= 2;
            bkVar19.f341811f = str2;
        }
        return (C123744bk) bjVar.build();
    }

    /* renamed from: b */
    public static C123744bk m202968b(C123743bj bjVar, C53126ci ciVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        int i = ciVar.f139233c;
        if (i == 1) {
            C53153di diVar = ciVar.f139234d;
            if (diVar == null) {
                diVar = C53153di.f139315c;
            }
            C62940bt r0 = C62942bv.checkIsLite(C53245gt.f139565o);
            diVar.mo58887l(r0);
            Object l = diVar.f169962ag.mo58854l(r0.f169971d);
            if (l == null) {
                obj = r0.f169969b;
            } else {
                obj = r0.mo58889c(l);
            }
            C53245gt gtVar = (C53245gt) obj;
            bjVar.copyOnWrite();
            C123744bk bkVar = (C123744bk) bjVar.instance;
            C123744bk bkVar2 = C123744bk.f341804l;
            gtVar.getClass();
            bkVar.f341809d = gtVar;
            bkVar.f341808c = 11;
            return (C123744bk) bjVar.build();
        } else if (i == 7) {
            C53153di diVar2 = ciVar.f139234d;
            if (diVar2 == null) {
                diVar2 = C53153di.f139315c;
            }
            C62940bt r02 = C62942bv.checkIsLite(C53212fn.f139468h);
            diVar2.mo58887l(r02);
            Object l2 = diVar2.f169962ag.mo58854l(r02.f169971d);
            if (l2 == null) {
                obj2 = r02.f169969b;
            } else {
                obj2 = r02.mo58889c(l2);
            }
            C53212fn fnVar = (C53212fn) obj2;
            bjVar.copyOnWrite();
            C123744bk bkVar3 = (C123744bk) bjVar.instance;
            C123744bk bkVar4 = C123744bk.f341804l;
            fnVar.getClass();
            bkVar3.f341809d = fnVar;
            bkVar3.f341808c = 12;
            return (C123744bk) bjVar.build();
        } else if (i == 9) {
            C53153di diVar3 = ciVar.f139234d;
            if (diVar3 == null) {
                diVar3 = C53153di.f139315c;
            }
            C62940bt r03 = C62942bv.checkIsLite(C53218ft.f139482b);
            diVar3.mo58887l(r03);
            Object l3 = diVar3.f169962ag.mo58854l(r03.f169971d);
            if (l3 == null) {
                obj3 = r03.f169969b;
            } else {
                obj3 = r03.mo58889c(l3);
            }
            C53218ft ftVar = (C53218ft) obj3;
            bjVar.copyOnWrite();
            C123744bk bkVar5 = (C123744bk) bjVar.instance;
            C123744bk bkVar6 = C123744bk.f341804l;
            ftVar.getClass();
            bkVar5.f341809d = ftVar;
            bkVar5.f341808c = 34;
            return (C123744bk) bjVar.build();
        } else if (i == 18) {
            C53153di diVar4 = ciVar.f139234d;
            if (diVar4 == null) {
                diVar4 = C53153di.f139315c;
            }
            C62940bt r04 = C62942bv.checkIsLite(C53190es.f139394t);
            diVar4.mo58887l(r04);
            Object l4 = diVar4.f169962ag.mo58854l(r04.f169971d);
            if (l4 == null) {
                obj4 = r04.f169969b;
            } else {
                obj4 = r04.mo58889c(l4);
            }
            C53190es esVar = (C53190es) obj4;
            bjVar.copyOnWrite();
            C123744bk bkVar7 = (C123744bk) bjVar.instance;
            C123744bk bkVar8 = C123744bk.f341804l;
            esVar.getClass();
            bkVar7.f341809d = esVar;
            bkVar7.f341808c = 10;
            return (C123744bk) bjVar.build();
        } else if (i == 110) {
            C53153di diVar5 = ciVar.f139234d;
            if (diVar5 == null) {
                diVar5 = C53153di.f139315c;
            }
            C62940bt r05 = C62942bv.checkIsLite(C53247gv.f139581c);
            diVar5.mo58887l(r05);
            Object l5 = diVar5.f169962ag.mo58854l(r05.f169971d);
            if (l5 == null) {
                obj5 = r05.f169969b;
            } else {
                obj5 = r05.mo58889c(l5);
            }
            C53247gv gvVar = (C53247gv) obj5;
            bjVar.copyOnWrite();
            C123744bk bkVar9 = (C123744bk) bjVar.instance;
            C123744bk bkVar10 = C123744bk.f341804l;
            gvVar.getClass();
            bkVar9.f341809d = gvVar;
            bkVar9.f341808c = 40;
            return (C123744bk) bjVar.build();
        } else if (i == 100) {
            C53153di diVar6 = ciVar.f139234d;
            if (diVar6 == null) {
                diVar6 = C53153di.f139315c;
            }
            C62940bt r06 = C62942bv.checkIsLite(C53227gb.f139500c);
            diVar6.mo58887l(r06);
            Object l6 = diVar6.f169962ag.mo58854l(r06.f169971d);
            if (l6 == null) {
                obj6 = r06.f169969b;
            } else {
                obj6 = r06.mo58889c(l6);
            }
            C53227gb gbVar = (C53227gb) obj6;
            bjVar.copyOnWrite();
            C123744bk bkVar11 = (C123744bk) bjVar.instance;
            C123744bk bkVar12 = C123744bk.f341804l;
            gbVar.getClass();
            bkVar11.f341809d = gbVar;
            bkVar11.f341808c = 30;
            return (C123744bk) bjVar.build();
        } else if (i != 101) {
            return (C123744bk) bjVar.build();
        } else {
            C53153di diVar7 = ciVar.f139234d;
            if (diVar7 == null) {
                diVar7 = C53153di.f139315c;
            }
            C62940bt r07 = C62942bv.checkIsLite(C53204ff.f139459b);
            diVar7.mo58887l(r07);
            Object l7 = diVar7.f169962ag.mo58854l(r07.f169971d);
            if (l7 == null) {
                obj7 = r07.f169969b;
            } else {
                obj7 = r07.mo58889c(l7);
            }
            C53204ff ffVar = (C53204ff) obj7;
            bjVar.copyOnWrite();
            C123744bk bkVar13 = (C123744bk) bjVar.instance;
            C123744bk bkVar14 = C123744bk.f341804l;
            ffVar.getClass();
            bkVar13.f341809d = ffVar;
            bkVar13.f341808c = 28;
            return (C123744bk) bjVar.build();
        }
    }
}
