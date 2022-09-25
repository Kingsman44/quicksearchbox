package com.google.android.apps.search.assistant.platform.pcp.p9325b;

import com.google.common.base.C58880cq;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.b.ao */
/* compiled from: PG */
final class C123622ao {

    /* renamed from: a */
    private static final C59071e f341548a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.pcp.b.ao");

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m202984a(java.lang.String r2) {
        /*
            int r0 = r2.hashCode()
            r1 = 0
            switch(r0) {
                case -363740029: goto L_0x0045;
                case -363359569: goto L_0x003b;
                case -79435895: goto L_0x0031;
                case 148535529: goto L_0x0027;
                case 277381348: goto L_0x001d;
                case 1053085300: goto L_0x0013;
                case 1443195344: goto L_0x0009;
                default: goto L_0x0008;
            }
        L_0x0008:
            goto L_0x004f
        L_0x0009:
            java.lang.String r0 = "data_id"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x004f
            r2 = 1
            goto L_0x0050
        L_0x0013:
            java.lang.String r0 = "contextual_triggering_condition"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x004f
            r2 = 6
            goto L_0x0050
        L_0x001d:
            java.lang.String r0 = "data_content"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x004f
            r2 = 5
            goto L_0x0050
        L_0x0027:
            java.lang.String r0 = "hash_tag"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x004f
            r2 = 3
            goto L_0x0050
        L_0x0031:
            java.lang.String r0 = "data_content_hash"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x004f
            r2 = 2
            goto L_0x0050
        L_0x003b:
            java.lang.String r0 = "data_type"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x004f
            r2 = 0
            goto L_0x0050
        L_0x0045:
            java.lang.String r0 = "data_hash"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x004f
            r2 = 4
            goto L_0x0050
        L_0x004f:
            r2 = -1
        L_0x0050:
            r0 = 20
            switch(r2) {
                case 0: goto L_0x005a;
                case 1: goto L_0x0059;
                case 2: goto L_0x0059;
                case 3: goto L_0x0059;
                case 4: goto L_0x0059;
                case 5: goto L_0x0056;
                case 6: goto L_0x0056;
                default: goto L_0x0055;
            }
        L_0x0055:
            return r1
        L_0x0056:
            r2 = 25
            return r2
        L_0x0059:
            return r0
        L_0x005a:
            r2 = 8
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.pcp.p9325b.C123622ao.m202984a(java.lang.String):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String m202985b(android.database.Cursor r12) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = 0
        L_0x0007:
            int r3 = r12.getColumnCount()
            if (r2 >= r3) goto L_0x027f
            int r3 = r12.getType(r2)
            java.lang.String r4 = r12.getColumnName(r2)
            if (r2 <= 0) goto L_0x001c
            java.lang.String r5 = " | "
            r0.append(r5)
        L_0x001c:
            if (r3 == 0) goto L_0x0276
            r5 = 1
            if (r3 == r5) goto L_0x026a
            r6 = 3
            if (r3 == r6) goto L_0x025e
            r7 = 4
            if (r3 == r7) goto L_0x0029
            goto L_0x027b
        L_0x0029:
            byte[] r3 = r12.getBlob(r2)
            int r8 = r4.hashCode()
            r9 = 2
            switch(r8) {
                case -363740029: goto L_0x005e;
                case -79435895: goto L_0x0054;
                case 148535529: goto L_0x004a;
                case 277381348: goto L_0x0040;
                case 1053085300: goto L_0x0036;
                default: goto L_0x0035;
            }
        L_0x0035:
            goto L_0x0068
        L_0x0036:
            java.lang.String r8 = "contextual_triggering_condition"
            boolean r8 = r4.equals(r8)
            if (r8 == 0) goto L_0x0068
            r8 = 3
            goto L_0x0069
        L_0x0040:
            java.lang.String r8 = "data_content"
            boolean r8 = r4.equals(r8)
            if (r8 == 0) goto L_0x0068
            r8 = 4
            goto L_0x0069
        L_0x004a:
            java.lang.String r8 = "hash_tag"
            boolean r8 = r4.equals(r8)
            if (r8 == 0) goto L_0x0068
            r8 = 0
            goto L_0x0069
        L_0x0054:
            java.lang.String r8 = "data_content_hash"
            boolean r8 = r4.equals(r8)
            if (r8 == 0) goto L_0x0068
            r8 = 1
            goto L_0x0069
        L_0x005e:
            java.lang.String r8 = "data_hash"
            boolean r8 = r4.equals(r8)
            if (r8 == 0) goto L_0x0068
            r8 = 2
            goto L_0x0069
        L_0x0068:
            r8 = -1
        L_0x0069:
            if (r8 == 0) goto L_0x024e
            if (r8 == r5) goto L_0x024e
            if (r8 == r9) goto L_0x024e
            java.lang.String r4 = "PCP.DatabaseOperator"
            if (r8 == r6) goto L_0x0132
            if (r8 == r7) goto L_0x0077
            goto L_0x027b
        L_0x0077:
            if (r3 == 0) goto L_0x027b
            int r6 = r3.length
            if (r6 <= 0) goto L_0x027b
            java.lang.String r6 = "data_type"
            int r6 = r12.getColumnIndex(r6)     // Catch:{ ct -> 0x011c }
            boolean r7 = r12.isNull(r6)     // Catch:{ ct -> 0x011c }
            if (r7 != 0) goto L_0x027b
            int r6 = r12.getInt(r6)     // Catch:{ ct -> 0x011c }
            if (r6 != r5) goto L_0x027b
            com.google.protobuf.ba r5 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x011c }
            com.google.assistant.s.a.gt r6 = com.google.assistant.p3994s.p3995a.C53245gt.f139564n     // Catch:{ ct -> 0x011c }
            com.google.protobuf.bv r3 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r6, (byte[]) r3, (com.google.protobuf.C62921ba) r5)     // Catch:{ ct -> 0x011c }
            com.google.assistant.s.a.gt r3 = (com.google.assistant.p3994s.p3995a.C53245gt) r3     // Catch:{ ct -> 0x011c }
            java.lang.String r5 = "\nWeather temp: "
            r0.append(r5)     // Catch:{ ct -> 0x011c }
            com.google.protobuf.cq r5 = r3.f139569c     // Catch:{ ct -> 0x011c }
            int r5 = r5.size()     // Catch:{ ct -> 0x011c }
            java.lang.String r6 = ""
            if (r5 <= 0) goto L_0x00b4
            com.google.protobuf.cq r5 = r3.f139569c     // Catch:{ ct -> 0x011c }
            java.lang.Object r5 = r5.get(r1)     // Catch:{ ct -> 0x011c }
            com.google.assistant.s.a.ge r5 = (com.google.assistant.p3994s.p3995a.C53230ge) r5     // Catch:{ ct -> 0x011c }
            java.lang.String r5 = r5.f139507c     // Catch:{ ct -> 0x011c }
            goto L_0x00b5
        L_0x00b4:
            r5 = r6
        L_0x00b5:
            r0.append(r5)     // Catch:{ ct -> 0x011c }
            java.lang.String r5 = "   Unit useCelsius: "
            r0.append(r5)     // Catch:{ ct -> 0x011c }
            boolean r5 = r3.f139574h     // Catch:{ ct -> 0x011c }
            r0.append(r5)     // Catch:{ ct -> 0x011c }
            java.lang.String r5 = "   Data Origin: "
            r0.append(r5)     // Catch:{ ct -> 0x011c }
            int r5 = r3.f139568b     // Catch:{ ct -> 0x011c }
            com.google.assistant.s.a.gg r5 = com.google.assistant.p3994s.p3995a.C53232gg.m86789a(r5)     // Catch:{ ct -> 0x011c }
            if (r5 != 0) goto L_0x00d1
            com.google.assistant.s.a.gg r5 = com.google.assistant.p3994s.p3995a.C53232gg.UNKNOWN     // Catch:{ ct -> 0x011c }
        L_0x00d1:
            r0.append(r5)     // Catch:{ ct -> 0x011c }
            java.lang.String r5 = "   IconUrl: "
            r0.append(r5)     // Catch:{ ct -> 0x011c }
            com.google.protobuf.cq r5 = r3.f139569c     // Catch:{ ct -> 0x011c }
            int r5 = r5.size()     // Catch:{ ct -> 0x011c }
            if (r5 <= 0) goto L_0x00ec
            com.google.protobuf.cq r5 = r3.f139569c     // Catch:{ ct -> 0x011c }
            java.lang.Object r5 = r5.get(r1)     // Catch:{ ct -> 0x011c }
            com.google.assistant.s.a.ge r5 = (com.google.assistant.p3994s.p3995a.C53230ge) r5     // Catch:{ ct -> 0x011c }
            java.lang.String r5 = r5.f139512h     // Catch:{ ct -> 0x011c }
            goto L_0x00ed
        L_0x00ec:
            r5 = r6
        L_0x00ed:
            r0.append(r5)     // Catch:{ ct -> 0x011c }
            java.lang.String r5 = "   WeatherDescription: "
            r0.append(r5)     // Catch:{ ct -> 0x011c }
            com.google.protobuf.cq r5 = r3.f139569c     // Catch:{ ct -> 0x011c }
            int r5 = r5.size()     // Catch:{ ct -> 0x011c }
            if (r5 <= 0) goto L_0x0107
            com.google.protobuf.cq r5 = r3.f139569c     // Catch:{ ct -> 0x011c }
            java.lang.Object r5 = r5.get(r1)     // Catch:{ ct -> 0x011c }
            com.google.assistant.s.a.ge r5 = (com.google.assistant.p3994s.p3995a.C53230ge) r5     // Catch:{ ct -> 0x011c }
            java.lang.String r6 = r5.f139506b     // Catch:{ ct -> 0x011c }
        L_0x0107:
            r0.append(r6)     // Catch:{ ct -> 0x011c }
            java.lang.String r5 = "   LocationName: "
            r0.append(r5)     // Catch:{ ct -> 0x011c }
            com.google.assistant.s.a.gq r3 = r3.f139577k     // Catch:{ ct -> 0x011c }
            if (r3 != 0) goto L_0x0115
            com.google.assistant.s.a.gq r3 = com.google.assistant.p3994s.p3995a.C53242gq.f139546f     // Catch:{ ct -> 0x011c }
        L_0x0115:
            java.lang.String r3 = r3.f139550c     // Catch:{ ct -> 0x011c }
            r0.append(r3)     // Catch:{ ct -> 0x011c }
            goto L_0x027b
        L_0x011c:
            r3 = move-exception
            com.google.common.f.e r5 = f341548a
            com.google.common.f.x r5 = r5.mo56226d()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r6, r4)
            java.lang.String r4 = "Failed to dump data content."
            r6 = 35188(0x8974, float:4.9309E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56382g(r3)).mo56372aa(r6)).mo56386p(r4)
            goto L_0x027b
        L_0x0132:
            if (r3 == 0) goto L_0x027b
            int r6 = r3.length
            if (r6 <= 0) goto L_0x027b
            com.google.protobuf.ba r6 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0239 }
            com.google.assistant.ag.c.az r7 = com.google.assistant.p3803ag.p3809c.C48952az.f126657c     // Catch:{ ct -> 0x0239 }
            com.google.protobuf.bv r3 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r7, (byte[]) r3, (com.google.protobuf.C62921ba) r6)     // Catch:{ ct -> 0x0239 }
            com.google.assistant.ag.c.az r3 = (com.google.assistant.p3803ag.p3809c.C48952az) r3     // Catch:{ ct -> 0x0239 }
            int r6 = r3.f126659a     // Catch:{ ct -> 0x0239 }
            if (r6 != r5) goto L_0x020c
            java.lang.Object r6 = r3.f126660b     // Catch:{ ct -> 0x0239 }
            com.google.assistant.ag.c.br r6 = (com.google.assistant.p3803ag.p3809c.C48971br) r6     // Catch:{ ct -> 0x0239 }
            int r7 = r6.f126691a     // Catch:{ ct -> 0x0239 }
            if (r7 != r9) goto L_0x0154
            java.lang.Object r6 = r6.f126692b     // Catch:{ ct -> 0x0239 }
            com.google.assistant.ag.c.dj r6 = (com.google.assistant.p3803ag.p3809c.C49017dj) r6     // Catch:{ ct -> 0x0239 }
            goto L_0x0156
        L_0x0154:
            com.google.assistant.ag.c.dj r6 = com.google.assistant.p3803ag.p3809c.C49017dj.f126788c     // Catch:{ ct -> 0x0239 }
        L_0x0156:
            int r6 = r6.f126790a     // Catch:{ ct -> 0x0239 }
            java.lang.String r7 = " Stop Time: "
            java.lang.String r8 = "Start Time: "
            if (r6 != r5) goto L_0x01c2
            r0.append(r8)     // Catch:{ ct -> 0x0239 }
            int r6 = r3.f126659a     // Catch:{ ct -> 0x0239 }
            if (r6 != r5) goto L_0x016a
            java.lang.Object r6 = r3.f126660b     // Catch:{ ct -> 0x0239 }
            com.google.assistant.ag.c.br r6 = (com.google.assistant.p3803ag.p3809c.C48971br) r6     // Catch:{ ct -> 0x0239 }
            goto L_0x016c
        L_0x016a:
            com.google.assistant.ag.c.br r6 = com.google.assistant.p3803ag.p3809c.C48971br.f126689d     // Catch:{ ct -> 0x0239 }
        L_0x016c:
            int r8 = r6.f126691a     // Catch:{ ct -> 0x0239 }
            if (r8 != r9) goto L_0x0175
            java.lang.Object r6 = r6.f126692b     // Catch:{ ct -> 0x0239 }
            com.google.assistant.ag.c.dj r6 = (com.google.assistant.p3803ag.p3809c.C49017dj) r6     // Catch:{ ct -> 0x0239 }
            goto L_0x0177
        L_0x0175:
            com.google.assistant.ag.c.dj r6 = com.google.assistant.p3803ag.p3809c.C49017dj.f126788c     // Catch:{ ct -> 0x0239 }
        L_0x0177:
            int r8 = r6.f126790a     // Catch:{ ct -> 0x0239 }
            if (r8 != r5) goto L_0x0180
            java.lang.Object r6 = r6.f126791b     // Catch:{ ct -> 0x0239 }
            com.google.assistant.ag.c.cy r6 = (com.google.assistant.p3803ag.p3809c.C49005cy) r6     // Catch:{ ct -> 0x0239 }
            goto L_0x0182
        L_0x0180:
            com.google.assistant.ag.c.cy r6 = com.google.assistant.p3803ag.p3809c.C49005cy.f126761d     // Catch:{ ct -> 0x0239 }
        L_0x0182:
            long r10 = r6.f126764b     // Catch:{ ct -> 0x0239 }
            j$.time.Instant r6 = p3186j$.time.Instant.ofEpochMilli(r10)     // Catch:{ ct -> 0x0239 }
            long r10 = r6.getEpochSecond()     // Catch:{ ct -> 0x0239 }
            r0.append(r10)     // Catch:{ ct -> 0x0239 }
            r0.append(r7)     // Catch:{ ct -> 0x0239 }
            int r6 = r3.f126659a     // Catch:{ ct -> 0x0239 }
            if (r6 != r5) goto L_0x019b
            java.lang.Object r3 = r3.f126660b     // Catch:{ ct -> 0x0239 }
            com.google.assistant.ag.c.br r3 = (com.google.assistant.p3803ag.p3809c.C48971br) r3     // Catch:{ ct -> 0x0239 }
            goto L_0x019d
        L_0x019b:
            com.google.assistant.ag.c.br r3 = com.google.assistant.p3803ag.p3809c.C48971br.f126689d     // Catch:{ ct -> 0x0239 }
        L_0x019d:
            int r6 = r3.f126691a     // Catch:{ ct -> 0x0239 }
            if (r6 != r9) goto L_0x01a6
            java.lang.Object r3 = r3.f126692b     // Catch:{ ct -> 0x0239 }
            com.google.assistant.ag.c.dj r3 = (com.google.assistant.p3803ag.p3809c.C49017dj) r3     // Catch:{ ct -> 0x0239 }
            goto L_0x01a8
        L_0x01a6:
            com.google.assistant.ag.c.dj r3 = com.google.assistant.p3803ag.p3809c.C49017dj.f126788c     // Catch:{ ct -> 0x0239 }
        L_0x01a8:
            int r6 = r3.f126790a     // Catch:{ ct -> 0x0239 }
            if (r6 != r5) goto L_0x01b1
            java.lang.Object r3 = r3.f126791b     // Catch:{ ct -> 0x0239 }
            com.google.assistant.ag.c.cy r3 = (com.google.assistant.p3803ag.p3809c.C49005cy) r3     // Catch:{ ct -> 0x0239 }
            goto L_0x01b3
        L_0x01b1:
            com.google.assistant.ag.c.cy r3 = com.google.assistant.p3803ag.p3809c.C49005cy.f126761d     // Catch:{ ct -> 0x0239 }
        L_0x01b3:
            long r5 = r3.f126765c     // Catch:{ ct -> 0x0239 }
            j$.time.Instant r3 = p3186j$.time.Instant.ofEpochMilli(r5)     // Catch:{ ct -> 0x0239 }
            long r5 = r3.getEpochSecond()     // Catch:{ ct -> 0x0239 }
            r0.append(r5)     // Catch:{ ct -> 0x0239 }
            goto L_0x027b
        L_0x01c2:
            r0.append(r8)     // Catch:{ ct -> 0x0239 }
            int r6 = r3.f126659a     // Catch:{ ct -> 0x0239 }
            if (r6 != r5) goto L_0x01ce
            java.lang.Object r6 = r3.f126660b     // Catch:{ ct -> 0x0239 }
            com.google.assistant.ag.c.br r6 = (com.google.assistant.p3803ag.p3809c.C48971br) r6     // Catch:{ ct -> 0x0239 }
            goto L_0x01d0
        L_0x01ce:
            com.google.assistant.ag.c.br r6 = com.google.assistant.p3803ag.p3809c.C48971br.f126689d     // Catch:{ ct -> 0x0239 }
        L_0x01d0:
            int r8 = r6.f126691a     // Catch:{ ct -> 0x0239 }
            if (r8 != r5) goto L_0x01d9
            java.lang.Object r6 = r6.f126692b     // Catch:{ ct -> 0x0239 }
            com.google.assistant.ag.c.z r6 = (com.google.assistant.p3803ag.p3809c.C49156z) r6     // Catch:{ ct -> 0x0239 }
            goto L_0x01db
        L_0x01d9:
            com.google.assistant.ag.c.z r6 = com.google.assistant.p3803ag.p3809c.C49156z.f127111d     // Catch:{ ct -> 0x0239 }
        L_0x01db:
            com.google.protobuf.fg r6 = r6.f127114b     // Catch:{ ct -> 0x0239 }
            if (r6 != 0) goto L_0x01e1
            com.google.protobuf.fg r6 = com.google.protobuf.C63042fg.f170152c     // Catch:{ ct -> 0x0239 }
        L_0x01e1:
            long r8 = r6.f170154a     // Catch:{ ct -> 0x0239 }
            r0.append(r8)     // Catch:{ ct -> 0x0239 }
            r0.append(r7)     // Catch:{ ct -> 0x0239 }
            int r6 = r3.f126659a     // Catch:{ ct -> 0x0239 }
            if (r6 != r5) goto L_0x01f2
            java.lang.Object r3 = r3.f126660b     // Catch:{ ct -> 0x0239 }
            com.google.assistant.ag.c.br r3 = (com.google.assistant.p3803ag.p3809c.C48971br) r3     // Catch:{ ct -> 0x0239 }
            goto L_0x01f4
        L_0x01f2:
            com.google.assistant.ag.c.br r3 = com.google.assistant.p3803ag.p3809c.C48971br.f126689d     // Catch:{ ct -> 0x0239 }
        L_0x01f4:
            int r6 = r3.f126691a     // Catch:{ ct -> 0x0239 }
            if (r6 != r5) goto L_0x01fd
            java.lang.Object r3 = r3.f126692b     // Catch:{ ct -> 0x0239 }
            com.google.assistant.ag.c.z r3 = (com.google.assistant.p3803ag.p3809c.C49156z) r3     // Catch:{ ct -> 0x0239 }
            goto L_0x01ff
        L_0x01fd:
            com.google.assistant.ag.c.z r3 = com.google.assistant.p3803ag.p3809c.C49156z.f127111d     // Catch:{ ct -> 0x0239 }
        L_0x01ff:
            com.google.protobuf.fg r3 = r3.f127115c     // Catch:{ ct -> 0x0239 }
            if (r3 != 0) goto L_0x0205
            com.google.protobuf.fg r3 = com.google.protobuf.C63042fg.f170152c     // Catch:{ ct -> 0x0239 }
        L_0x0205:
            long r5 = r3.f170154a     // Catch:{ ct -> 0x0239 }
            r0.append(r5)     // Catch:{ ct -> 0x0239 }
            goto L_0x027b
        L_0x020c:
            if (r6 != r9) goto L_0x027b
            java.lang.String r5 = "Conditions: "
            r0.append(r5)     // Catch:{ ct -> 0x0239 }
            int r5 = r3.f126659a     // Catch:{ ct -> 0x0239 }
            if (r5 != r9) goto L_0x021c
            java.lang.Object r3 = r3.f126660b     // Catch:{ ct -> 0x0239 }
            com.google.assistant.ag.c.ay r3 = (com.google.assistant.p3803ag.p3809c.C48951ay) r3     // Catch:{ ct -> 0x0239 }
            goto L_0x021e
        L_0x021c:
            com.google.assistant.ag.c.ay r3 = com.google.assistant.p3803ag.p3809c.C48951ay.f126654b     // Catch:{ ct -> 0x0239 }
        L_0x021e:
            com.google.protobuf.cq r3 = r3.f126656a     // Catch:{ ct -> 0x0239 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ ct -> 0x0239 }
        L_0x0224:
            boolean r5 = r3.hasNext()     // Catch:{ ct -> 0x0239 }
            if (r5 == 0) goto L_0x027b
            java.lang.Object r5 = r3.next()     // Catch:{ ct -> 0x0239 }
            com.google.assistant.ag.c.az r5 = (com.google.assistant.p3803ag.p3809c.C48952az) r5     // Catch:{ ct -> 0x0239 }
            r0.append(r5)     // Catch:{ ct -> 0x0239 }
            java.lang.String r5 = ", "
            r0.append(r5)     // Catch:{ ct -> 0x0239 }
            goto L_0x0224
        L_0x0239:
            r3 = move-exception
            com.google.common.f.e r5 = f341548a
            com.google.common.f.x r5 = r5.mo56226d()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r6, r4)
            java.lang.String r4 = "Failed to dump triggering conditions"
            r6 = 35187(0x8973, float:4.9307E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56382g(r3)).mo56372aa(r6)).mo56386p(r4)
            goto L_0x027b
        L_0x024e:
            if (r3 == 0) goto L_0x027b
            int r5 = r3.length
            if (r5 <= 0) goto L_0x027b
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = com.google.common.base.C58913w.f156754c
            r5.<init>(r3, r6)
            m202986c(r0, r5, r4)
            goto L_0x027b
        L_0x025e:
            java.lang.String r3 = r12.getString(r2)
            java.lang.String r3 = com.google.common.base.C58837ba.m90858g(r3)
            m202986c(r0, r3, r4)
            goto L_0x027b
        L_0x026a:
            long r5 = r12.getLong(r2)
            java.lang.String r3 = java.lang.String.valueOf(r5)
            m202986c(r0, r3, r4)
            goto L_0x027b
        L_0x0276:
            java.lang.String r3 = "null"
            m202986c(r0, r3, r4)
        L_0x027b:
            int r2 = r2 + 1
            goto L_0x0007
        L_0x027f:
            java.lang.String r12 = "\n"
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.pcp.p9325b.C123622ao.m202985b(android.database.Cursor):java.lang.String");
    }

    /* renamed from: c */
    private static void m202986c(StringBuilder sb, String str, String str2) {
        sb.append(C58880cq.m90967c(str, m202984a(str2)));
    }
}
