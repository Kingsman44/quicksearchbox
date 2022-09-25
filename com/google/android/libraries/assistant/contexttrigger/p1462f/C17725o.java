package com.google.android.libraries.assistant.contexttrigger.p1462f;

import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.f.o */
/* compiled from: PG */
public final /* synthetic */ class C17725o implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C17730t f50932a;

    public /* synthetic */ C17725o(C17730t tVar) {
        this.f50932a = tVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: int} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v2 */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx apply(java.lang.Object r25) {
        /*
            r24 = this;
            r0 = r24
            com.google.android.libraries.assistant.contexttrigger.f.t r1 = r0.f50932a
            r2 = r25
            com.google.android.libraries.assistant.contexttrigger.f.ab r2 = (com.google.android.libraries.assistant.contexttrigger.p1462f.C17696ab) r2
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.common.b.gp r3 = com.google.common.p4522b.C58485gu.m89837e()
            com.google.common.b.hd r4 = r2.mo23434b()
            com.google.common.b.gg r4 = r4.values()
            com.google.common.b.sl r4 = r4.iterator()
        L_0x001a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0369
            java.lang.Object r5 = r4.next()
            com.google.assistant.ag.b.a.ac r5 = (com.google.assistant.p3803ag.p3807b.p3808a.C48888ac) r5
            com.google.assistant.ag.b.a.an r6 = r2.mo23433a()
            com.google.assistant.ag.b.a.s r6 = r6.f126535b
            if (r6 != 0) goto L_0x0030
            com.google.assistant.ag.b.a.s r6 = com.google.assistant.p3803ag.p3807b.p3808a.C48917s.f126578f
        L_0x0030:
            com.google.assistant.ag.b.a.u r6 = r6.f126581b
            if (r6 != 0) goto L_0x0036
            com.google.assistant.ag.b.a.u r6 = com.google.assistant.p3803ag.p3807b.p3808a.C48919u.f126586g
        L_0x0036:
            r5.getClass()
            int r7 = r5.f126515g
            int r8 = com.google.assistant.p3803ag.p3807b.p3808a.C48887ab.m85291b(r7)
            r9 = 1
            if (r8 != 0) goto L_0x0043
            r8 = 1
        L_0x0043:
            int r8 = r8 + -1
            if (r8 == r9) goto L_0x0353
            r10 = 2
            java.lang.String r11 = "Invalid context backend type"
            r12 = 3
            if (r8 == r10) goto L_0x020b
            if (r8 == r12) goto L_0x01ed
            r14 = 4
            r15 = 5
            if (r8 == r14) goto L_0x0188
            if (r8 == r15) goto L_0x0066
            java.lang.Exception r5 = new java.lang.Exception
            java.lang.String r6 = "Context backend not supported"
            r5.<init>(r6)
            com.google.common.util.concurrent.cx r5 = com.google.common.util.concurrent.C60856cj.m92899h(r5)
            r15 = r2
            r2 = r3
            r25 = r4
            goto L_0x0360
        L_0x0066:
            com.google.android.libraries.assistant.contexttrigger.g.b r8 = r1.f50941d
            com.google.common.f.e r16 = com.google.android.libraries.assistant.contexttrigger.p1463g.C17739b.f50960a
            com.google.common.f.x r16 = r16.mo56224b()
            r10 = r16
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10
            r13 = 47034(0xb7ba, float:6.5909E-41)
            com.google.common.f.x r10 = r10.mo56372aa(r13)
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10
            java.lang.String r13 = "Update location node with sub trigger id: %s"
            java.lang.String r7 = r5.f126510b
            r10.mo56389s(r13, r7)
            int r7 = r5.f126515g
            int r7 = com.google.assistant.p3803ag.p3807b.p3808a.C48887ab.m85291b(r7)
            if (r7 != 0) goto L_0x008c
        L_0x008a:
            r7 = 0
            goto L_0x0090
        L_0x008c:
            r10 = 6
            if (r7 != r10) goto L_0x008a
            r7 = 1
        L_0x0090:
            com.google.common.base.C58838bb.m90869d(r7, r11)
            com.google.assistant.ag.c.az r7 = r5.f126512d
            if (r7 != 0) goto L_0x0099
            com.google.assistant.ag.c.az r7 = com.google.assistant.p3803ag.p3809c.C48952az.f126657c
        L_0x0099:
            int r10 = r7.f126659a
            if (r10 != r9) goto L_0x00a2
            java.lang.Object r7 = r7.f126660b
            com.google.assistant.ag.c.br r7 = (com.google.assistant.p3803ag.p3809c.C48971br) r7
            goto L_0x00a4
        L_0x00a2:
            com.google.assistant.ag.c.br r7 = com.google.assistant.p3803ag.p3809c.C48971br.f126689d
        L_0x00a4:
            int r7 = r7.f126691a
            if (r7 != r15) goto L_0x00aa
            r7 = 1
            goto L_0x00ab
        L_0x00aa:
            r7 = 0
        L_0x00ab:
            java.lang.String r10 = "Incoming request should be a location leaf node."
            com.google.common.base.C58838bb.m90869d(r7, r10)
            com.google.assistant.ag.c.az r7 = r5.f126512d
            if (r7 != 0) goto L_0x00b6
            com.google.assistant.ag.c.az r7 = com.google.assistant.p3803ag.p3809c.C48952az.f126657c
        L_0x00b6:
            int r10 = r7.f126659a
            if (r10 != r9) goto L_0x00bf
            java.lang.Object r7 = r7.f126660b
            com.google.assistant.ag.c.br r7 = (com.google.assistant.p3803ag.p3809c.C48971br) r7
            goto L_0x00c1
        L_0x00bf:
            com.google.assistant.ag.c.br r7 = com.google.assistant.p3803ag.p3809c.C48971br.f126689d
        L_0x00c1:
            int r10 = r7.f126691a
            if (r10 != r15) goto L_0x00ca
            java.lang.Object r7 = r7.f126692b
            com.google.assistant.ag.c.ce r7 = (com.google.assistant.p3803ag.p3809c.C48985ce) r7
            goto L_0x00cc
        L_0x00ca:
            com.google.assistant.ag.c.ce r7 = com.google.assistant.p3803ag.p3809c.C48985ce.f126722e
        L_0x00cc:
            int r7 = r7.f126724a
            if (r7 != r14) goto L_0x00d2
            r13 = 1
            goto L_0x00d3
        L_0x00d2:
            r13 = 0
        L_0x00d3:
            java.lang.String r7 = "Only geographic locations are supported."
            com.google.common.base.C58838bb.m90869d(r13, r7)
            com.google.android.libraries.search.location.s r7 = r8.f50962c
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            com.google.assistant.ag.c.az r11 = r5.f126512d
            if (r11 != 0) goto L_0x00e5
            com.google.assistant.ag.c.az r11 = com.google.assistant.p3803ag.p3809c.C48952az.f126657c
        L_0x00e5:
            int r13 = r11.f126659a
            if (r13 != r9) goto L_0x00ee
            java.lang.Object r11 = r11.f126660b
            com.google.assistant.ag.c.br r11 = (com.google.assistant.p3803ag.p3809c.C48971br) r11
            goto L_0x00f0
        L_0x00ee:
            com.google.assistant.ag.c.br r11 = com.google.assistant.p3803ag.p3809c.C48971br.f126689d
        L_0x00f0:
            int r13 = r11.f126691a
            if (r13 != r15) goto L_0x00f9
            java.lang.Object r11 = r11.f126692b
            com.google.assistant.ag.c.ce r11 = (com.google.assistant.p3803ag.p3809c.C48985ce) r11
            goto L_0x00fb
        L_0x00f9:
            com.google.assistant.ag.c.ce r11 = com.google.assistant.p3803ag.p3809c.C48985ce.f126722e
        L_0x00fb:
            int r13 = r11.f126724a
            if (r13 != r14) goto L_0x0104
            java.lang.Object r13 = r11.f126725b
            com.google.assistant.ag.c.bu r13 = (com.google.assistant.p3803ag.p3809c.C48974bu) r13
            goto L_0x0106
        L_0x0104:
            com.google.assistant.ag.c.bu r13 = com.google.assistant.p3803ag.p3809c.C48974bu.f126695d
        L_0x0106:
            com.google.android.gms.location.aa r14 = new com.google.android.gms.location.aa
            r14.<init>()
            java.lang.String r5 = r5.f126510b
            r14.mo120366d(r5)
            int r5 = r11.f126726c
            int r16 = com.google.assistant.p3803ag.p3809c.C48984cd.m85333a(r5)
            int r15 = r16 + -1
            if (r16 == 0) goto L_0x0186
            if (r15 == 0) goto L_0x0139
            if (r15 == r9) goto L_0x011f
            goto L_0x013a
        L_0x011f:
            if (r5 != r12) goto L_0x0126
            java.lang.Object r5 = r11.f126727d
            com.google.assistant.ag.c.ca r5 = (com.google.assistant.p3803ag.p3809c.C48981ca) r5
            goto L_0x0128
        L_0x0126:
            com.google.assistant.ag.c.ca r5 = com.google.assistant.p3803ag.p3809c.C48981ca.f126715d
        L_0x0128:
            int r5 = r5.f126718b
            int r5 = com.google.assistant.p3803ag.p3809c.C48979bz.m85330a(r5)
            if (r5 != 0) goto L_0x0131
            r5 = 1
        L_0x0131:
            int r5 = r5 + -1
            if (r5 == 0) goto L_0x013a
            if (r5 == r9) goto L_0x013a
            r9 = 2
            goto L_0x013a
        L_0x0139:
            r9 = 4
        L_0x013a:
            r14.f391809a = r9
            com.google.cg.k r5 = r13.f126698b
            if (r5 != 0) goto L_0x0142
            com.google.cg.k r5 = com.google.p4479cg.C58079k.f155250c
        L_0x0142:
            double r11 = r5.f155252a
            com.google.cg.k r5 = r13.f126698b
            if (r5 != 0) goto L_0x014a
            com.google.cg.k r5 = com.google.p4479cg.C58079k.f155250c
        L_0x014a:
            r25 = r4
            double r4 = r5.f155253b
            r15 = r2
            r23 = r3
            long r2 = r13.f126699c
            float r2 = (float) r2
            r17 = r14
            r18 = r11
            r20 = r4
            r22 = r2
            r17.mo120364b(r18, r20, r22)
            j$.time.Duration r2 = com.google.android.libraries.assistant.contexttrigger.p1463g.C17739b.f50961b
            long r2 = r2.toMillis()
            r14.mo120365c(r2)
            com.google.android.gms.location.internal.ParcelableGeofence r2 = r14.mo120363a()
            r10.add(r2)
            r2 = 5
            com.google.android.gms.location.GeofencingRequest r2 = com.google.android.gms.location.C144877ah.m235475b(r10, r2)
            com.google.android.libraries.search.location.v r3 = r8.f50963d
            int r4 = r6.f126592e
            com.google.android.libraries.search.m.b.b r4 = com.google.android.libraries.search.p3047m.p3050b.C39226b.m68655a(r4)
            if (r4 != 0) goto L_0x0180
            com.google.android.libraries.search.m.b.b r4 = com.google.android.libraries.search.p3047m.p3050b.C39226b.TAG_DO_NOT_USE
        L_0x0180:
            com.google.common.util.concurrent.cx r5 = r7.mo41567a(r2, r3, r4)
            goto L_0x035e
        L_0x0186:
            r2 = 0
            throw r2
        L_0x0188:
            r15 = r2
            r23 = r3
            r25 = r4
            com.google.android.libraries.assistant.contexttrigger.i.f r2 = r1.f50943f
            com.google.common.f.e r3 = com.google.android.libraries.assistant.contexttrigger.p1465i.C17748f.f50974a
            com.google.common.f.x r3 = r3.mo56224b()
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            r4 = 47038(0xb7be, float:6.5914E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r4)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            java.lang.String r4 = "Update awareness node with sub trigger id: %s"
            java.lang.String r6 = r5.f126510b
            r3.mo56389s(r4, r6)
            int r3 = r5.f126515g
            int r3 = com.google.assistant.p3803ag.p3807b.p3808a.C48887ab.m85291b(r3)
            if (r3 != 0) goto L_0x01b1
        L_0x01af:
            r3 = 0
            goto L_0x01b5
        L_0x01b1:
            r4 = 5
            if (r3 != r4) goto L_0x01af
            r3 = 1
        L_0x01b5:
            com.google.common.base.C58838bb.m90869d(r3, r11)
            com.google.assistant.ag.c.az r3 = r5.f126512d
            if (r3 != 0) goto L_0x01be
            com.google.assistant.ag.c.az r3 = com.google.assistant.p3803ag.p3809c.C48952az.f126657c
        L_0x01be:
            int r4 = r3.f126659a
            if (r4 != r9) goto L_0x01c7
            java.lang.Object r3 = r3.f126660b
            com.google.assistant.ag.c.br r3 = (com.google.assistant.p3803ag.p3809c.C48971br) r3
            goto L_0x01c9
        L_0x01c7:
            com.google.assistant.ag.c.br r3 = com.google.assistant.p3803ag.p3809c.C48971br.f126689d
        L_0x01c9:
            int r3 = r3.f126691a
            r4 = 15
            if (r3 != r4) goto L_0x01d0
            goto L_0x01d1
        L_0x01d0:
            r9 = 0
        L_0x01d1:
            java.lang.String r3 = "Should have media context"
            com.google.common.base.C58838bb.m90869d(r9, r3)
            com.google.android.libraries.assistant.contexttrigger.i.d r3 = r2.f50976c
            android.media.session.MediaSessionManager r4 = r2.f50975b
            r5 = 0
            java.util.List r4 = r4.getActiveSessions(r5)
            r3.onActiveSessionsChanged(r4)
            android.media.session.MediaSessionManager r3 = r2.f50975b
            com.google.android.libraries.assistant.contexttrigger.i.d r2 = r2.f50976c
            r3.addOnActiveSessionsChangedListener(r2, r5)
            com.google.common.util.concurrent.cx r5 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x035e
        L_0x01ed:
            r15 = r2
            r23 = r3
            r25 = r4
            com.google.android.libraries.assistant.contexttrigger.d.g r2 = r1.f50942e
            com.google.android.libraries.assistant.contexttrigger.d r2 = r2.f50810e
            boolean r2 = r2.f50788a
            if (r2 == 0) goto L_0x0207
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r3 = "Need to implement this method before turning on the flag"
            r2.<init>(r3)
            com.google.common.util.concurrent.cx r5 = com.google.common.util.concurrent.C60856cj.m92899h(r2)
            goto L_0x035e
        L_0x0207:
            com.google.common.util.concurrent.cx r5 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x035e
        L_0x020b:
            r15 = r2
            r23 = r3
            r25 = r4
            com.google.android.libraries.assistant.contexttrigger.j.i r2 = r1.f50940c
            int r3 = com.google.assistant.p3803ag.p3807b.p3808a.C48887ab.m85291b(r7)
            if (r3 != 0) goto L_0x021a
        L_0x0218:
            r3 = 0
            goto L_0x021d
        L_0x021a:
            if (r3 != r12) goto L_0x0218
            r3 = 1
        L_0x021d:
            com.google.common.base.C58838bb.m90869d(r3, r11)
            com.google.assistant.ag.c.az r3 = r5.f126512d
            if (r3 != 0) goto L_0x0226
            com.google.assistant.ag.c.az r3 = com.google.assistant.p3803ag.p3809c.C48952az.f126657c
        L_0x0226:
            int r4 = r3.f126659a
            if (r4 != r9) goto L_0x022f
            java.lang.Object r3 = r3.f126660b
            com.google.assistant.ag.c.br r3 = (com.google.assistant.p3803ag.p3809c.C48971br) r3
            goto L_0x0231
        L_0x022f:
            com.google.assistant.ag.c.br r3 = com.google.assistant.p3803ag.p3809c.C48971br.f126689d
        L_0x0231:
            int r3 = r3.f126691a
            if (r3 != r9) goto L_0x0237
            r3 = 1
            goto L_0x0238
        L_0x0237:
            r3 = 0
        L_0x0238:
            java.lang.String r4 = "Should have time interval"
            com.google.common.base.C58838bb.m90869d(r3, r4)
            com.google.assistant.ag.c.az r3 = r5.f126512d
            if (r3 != 0) goto L_0x0243
            com.google.assistant.ag.c.az r3 = com.google.assistant.p3803ag.p3809c.C48952az.f126657c
        L_0x0243:
            int r4 = r3.f126659a
            if (r4 != r9) goto L_0x024c
            java.lang.Object r3 = r3.f126660b
            com.google.assistant.ag.c.br r3 = (com.google.assistant.p3803ag.p3809c.C48971br) r3
            goto L_0x024e
        L_0x024c:
            com.google.assistant.ag.c.br r3 = com.google.assistant.p3803ag.p3809c.C48971br.f126689d
        L_0x024e:
            int r4 = r3.f126691a
            if (r4 != r9) goto L_0x0257
            java.lang.Object r3 = r3.f126692b
            com.google.assistant.ag.c.z r3 = (com.google.assistant.p3803ag.p3809c.C49156z) r3
            goto L_0x0259
        L_0x0257:
            com.google.assistant.ag.c.z r3 = com.google.assistant.p3803ag.p3809c.C49156z.f127111d
        L_0x0259:
            com.google.protobuf.fg r4 = r3.f127114b
            if (r4 != 0) goto L_0x025f
            com.google.protobuf.fg r4 = com.google.protobuf.C63042fg.f170152c
        L_0x025f:
            com.google.protobuf.fg r6 = r3.f127115c
            if (r6 != 0) goto L_0x0265
            com.google.protobuf.fg r6 = com.google.protobuf.C63042fg.f170152c
        L_0x0265:
            int r4 = com.google.protobuf.p4750c.C62953e.m95476a(r4, r6)
            if (r4 >= 0) goto L_0x026d
            r4 = 1
            goto L_0x026e
        L_0x026d:
            r4 = 0
        L_0x026e:
            com.google.common.base.C58838bb.m90868c(r4)
            com.google.common.f.e r4 = com.google.android.libraries.assistant.contexttrigger.p1466j.C17793i.f51060a
            com.google.common.f.x r4 = r4.mo56224b()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r7 = "TimeContextManager"
            r4.mo56378ag(r6, r7)
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            r6 = 47044(0xb7c4, float:6.5923E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r6)
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            java.lang.String r6 = r5.f126510b
            com.google.protobuf.fg r8 = r3.f127114b
            if (r8 != 0) goto L_0x0291
            com.google.protobuf.fg r8 = com.google.protobuf.C63042fg.f170152c
        L_0x0291:
            long r10 = r8.f170154a
            java.lang.Long r8 = java.lang.Long.valueOf(r10)
            com.google.protobuf.fg r10 = r3.f127115c
            if (r10 != 0) goto L_0x029d
            com.google.protobuf.fg r10 = com.google.protobuf.C63042fg.f170152c
        L_0x029d:
            long r10 = r10.f170154a
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.lang.String r11 = "#update: time trigger= %s with start time=%d, stop time=%d in seconds."
            r4.mo56359L(r11, r6, r8, r10)
            com.google.android.libraries.f.a r4 = r2.f51062c
            long r10 = r4.mo26870b()
            com.google.protobuf.fg r4 = com.google.protobuf.p4750c.C62953e.m95484i(r10)
            com.google.protobuf.fg r6 = r3.f127115c
            if (r6 != 0) goto L_0x02b8
            com.google.protobuf.fg r6 = com.google.protobuf.C63042fg.f170152c
        L_0x02b8:
            int r6 = com.google.protobuf.p4750c.C62953e.m95476a(r4, r6)
            if (r6 < 0) goto L_0x02d5
            com.google.common.f.e r2 = com.google.android.libraries.assistant.contexttrigger.p1466j.C17793i.f51060a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r3, r7)
            java.lang.String r3 = "Stop time is less than current time"
            r4 = 47045(0xb7c5, float:6.5924E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)
            com.google.common.util.concurrent.cx r5 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x035e
        L_0x02d5:
            com.google.android.libraries.assistant.contexttrigger.j.u r6 = com.google.android.libraries.assistant.contexttrigger.p1466j.C17805u.f51097g
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.libraries.assistant.contexttrigger.j.t r6 = (com.google.android.libraries.assistant.contexttrigger.p1466j.C17804t) r6
            java.lang.String r7 = r5.f126510b
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.android.libraries.assistant.contexttrigger.j.u r8 = (com.google.android.libraries.assistant.contexttrigger.p1466j.C17805u) r8
            r7.getClass()
            r8.f51100b = r9
            r8.f51101c = r7
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.android.libraries.assistant.contexttrigger.j.u r7 = (com.google.android.libraries.assistant.contexttrigger.p1466j.C17805u) r7
            r3.getClass()
            r7.f51103e = r3
            r7.f51102d = r12
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.android.libraries.assistant.contexttrigger.j.u r7 = (com.google.android.libraries.assistant.contexttrigger.p1466j.C17805u) r7
            r7.f51104f = r9
            int r8 = r7.f51099a
            r8 = r8 | 16
            r7.f51099a = r8
            com.google.protobuf.bv r6 = r6.build()
            com.google.android.libraries.assistant.contexttrigger.j.u r6 = (com.google.android.libraries.assistant.contexttrigger.p1466j.C17805u) r6
            com.google.android.libraries.storage.protostore.ab r7 = r2.f51061b
            com.google.android.libraries.assistant.contexttrigger.j.f r8 = new com.google.android.libraries.assistant.contexttrigger.j.f
            r8.<init>(r2, r6)
            java.util.concurrent.Executor r6 = r2.f51063d
            com.google.common.util.concurrent.cx r6 = r7.mo46039a(r8, r6)
            com.google.protobuf.fg r3 = r3.f127114b
            if (r3 != 0) goto L_0x0323
            com.google.protobuf.fg r3 = com.google.protobuf.C63042fg.f170152c
        L_0x0323:
            int r3 = com.google.protobuf.p4750c.C62953e.m95476a(r4, r3)
            if (r3 < 0) goto L_0x0351
            java.lang.String r3 = r5.f126510b
            com.google.common.b.gu r3 = com.google.common.p4522b.C58485gu.m89846n(r3)
            com.google.apps.tiktok.tracing.contrib.b.f r4 = com.google.apps.tiktok.tracing.contrib.p3700b.C47633f.m84733g(r6)
            com.google.android.libraries.assistant.contexttrigger.j.g r5 = new com.google.android.libraries.assistant.contexttrigger.j.g
            r5.<init>(r2)
            java.util.concurrent.Executor r7 = r2.f51063d
            com.google.apps.tiktok.tracing.contrib.b.f r4 = r4.mo51516i(r5, r7)
            com.google.android.libraries.assistant.contexttrigger.j.h r5 = new com.google.android.libraries.assistant.contexttrigger.j.h
            r5.<init>(r2, r3)
            java.util.concurrent.Executor r2 = r2.f51063d
            com.google.apps.tiktok.tracing.contrib.b.f r2 = r4.mo51516i(r5, r2)
            java.lang.String r3 = "Failed to update time trigger."
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.google.apps.tiktok.concurrent.C46459k.m82829b(r2, r3, r4)
        L_0x0351:
            r5 = r6
            goto L_0x035e
        L_0x0353:
            r15 = r2
            r23 = r3
            r25 = r4
            com.google.android.libraries.assistant.contexttrigger.a.i r2 = r1.f50939b
            com.google.common.util.concurrent.cx r5 = r2.mo23413a(r6, r5)
        L_0x035e:
            r2 = r23
        L_0x0360:
            r2.mo55395g(r5)
            r4 = r25
            r3 = r2
            r2 = r15
            goto L_0x001a
        L_0x0369:
            r15 = r2
            r2 = r3
            com.google.common.b.gu r2 = r2.mo55394f()
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60856cj.m92896e(r2)
            com.google.apps.tiktok.tracing.contrib.b.f r2 = com.google.apps.tiktok.tracing.contrib.p3700b.C47633f.m84733g(r2)
            com.google.android.libraries.assistant.contexttrigger.f.m r3 = new com.google.android.libraries.assistant.contexttrigger.f.m
            r4 = r15
            r3.<init>(r4)
            java.util.concurrent.Executor r1 = r1.f50945h
            com.google.apps.tiktok.tracing.contrib.b.f r1 = r2.mo51515h(r3, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.contexttrigger.p1462f.C17725o.apply(java.lang.Object):com.google.common.util.concurrent.cx");
    }
}
