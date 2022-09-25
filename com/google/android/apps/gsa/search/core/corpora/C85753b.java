package com.google.android.apps.gsa.search.core.corpora;

import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.search.core.corpora.b */
/* compiled from: PG */
public final class C85753b {

    /* renamed from: a */
    public final SettableFuture f231874a = new SettableFuture();

    /* renamed from: b */
    public final C85752a f231875b;

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0192  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C85753b(android.content.Context r26, java.lang.Integer r27, com.google.android.apps.gsa.search.core.p6805i.C86124t r28) {
        /*
            r25 = this;
            r0 = r25
            r25.<init>()
            com.google.common.util.concurrent.SettableFuture r1 = new com.google.common.util.concurrent.SettableFuture
            r1.<init>()
            r0.f231874a = r1
            com.google.android.apps.gsa.shared.m.g r1 = com.google.android.apps.gsa.shared.p7066m.C90121fs.f250860a
            com.google.al.c.c.b.h r2 = com.google.p395al.p408c.p414c.p416b.C8498h.f29494b
            com.google.protobuf.eb r2 = r2.getParserForType()
            r3 = r28
            com.google.protobuf.MessageLite r1 = r3.mo79754t(r1, r2)
            com.google.al.c.c.b.h r1 = (com.google.p395al.p408c.p414c.p416b.C8498h) r1
            int r2 = r27.intValue()
            if (r1 == 0) goto L_0x002a
            com.google.al.c.c.b.h r3 = com.google.p395al.p408c.p414c.p416b.C8498h.f29494b
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0041
        L_0x002a:
            android.content.res.Resources r1 = r26.getResources()     // Catch:{ ct -> 0x01bc }
            r3 = 2132017348(0x7f1400c4, float:1.9672972E38)
            byte[] r1 = com.google.android.apps.gsa.shared.util.C90772bp.m148288O(r1, r3)     // Catch:{ ct -> 0x01bc }
            com.google.protobuf.ba r3 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x01bc }
            com.google.al.c.c.b.h r4 = com.google.p395al.p408c.p414c.p416b.C8498h.f29494b     // Catch:{ ct -> 0x01bc }
            com.google.protobuf.bv r1 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r4, (byte[]) r1, (com.google.protobuf.C62921ba) r3)     // Catch:{ ct -> 0x01bc }
            com.google.al.c.c.b.h r1 = (com.google.p395al.p408c.p414c.p416b.C8498h) r1     // Catch:{ ct -> 0x01bc }
        L_0x0041:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            com.google.common.b.gp r5 = com.google.common.p4522b.C58485gu.m89837e()
            com.google.protobuf.cq r6 = r1.f29496a
            java.util.Iterator r6 = r6.iterator()
            java.lang.String r7 = ""
            r8 = r7
        L_0x0058:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x019b
            java.lang.Object r9 = r6.next()
            com.google.al.c.c.b.e r9 = (com.google.p395al.p408c.p414c.p416b.C8495e) r9
            int r10 = r9.f29466a
            r11 = r10 & 8192(0x2000, float:1.14794E-41)
            if (r11 == 0) goto L_0x0076
            int r11 = r9.f29480o
            if (r2 >= r11) goto L_0x0076
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            int r9 = r9.f29480o
        L_0x0072:
            r27 = r2
            goto L_0x0136
        L_0x0076:
            r10 = r10 & 16384(0x4000, float:2.2959E-41)
            if (r10 == 0) goto L_0x0083
            int r10 = r9.f29481p
            if (r2 <= r10) goto L_0x0083
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            int r9 = r9.f29481p
            goto L_0x0072
        L_0x0083:
            java.lang.String r10 = r9.f29467b
            java.lang.String r11 = "nrby"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x0090
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x0072
        L_0x0090:
            java.lang.String r10 = r9.f29482q
            boolean r10 = r10.isEmpty()
            r11 = 1
            r10 = r10 ^ r11
            java.lang.String r12 = r9.f29483r
            boolean r12 = r12.isEmpty()
            r12 = r12 ^ r11
            java.lang.String r13 = r9.f29484s
            boolean r13 = r13.isEmpty()
            r13 = r13 ^ r11
            int r14 = r9.f29468c
            int r15 = com.google.p395al.p408c.p414c.p416b.C8494d.m23269a(r14)
            java.lang.String r11 = "Velvet.IntentCorpus"
            if (r15 != 0) goto L_0x00b3
            r27 = r2
            goto L_0x00e2
        L_0x00b3:
            r27 = r2
            r2 = 2
            if (r15 != r2) goto L_0x00e2
            if (r13 == 0) goto L_0x00be
            if (r10 == 0) goto L_0x00be
            if (r12 != 0) goto L_0x00ee
        L_0x00be:
            com.google.common.f.e r2 = com.google.android.apps.gsa.search.core.corpora.IntentCorpus.f231862a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r10, r11)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            r10 = 7619(0x1dc3, float:1.0676E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r10)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            java.lang.String r10 = r9.f29482q
            java.lang.String r11 = r9.f29483r
            java.lang.String r12 = r9.f29484s
            java.lang.String r13 = "Only some fields of intent corpora set\nmIntentPackage: %s\nmIntentActivity: %s\nmIntentUriPattern: %s"
            r2.mo56359L(r13, r10, r11, r12)
            int r2 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
            goto L_0x014e
        L_0x00e2:
            int r2 = com.google.p395al.p408c.p414c.p416b.C8494d.m23269a(r14)
            if (r2 != 0) goto L_0x00e9
            goto L_0x014e
        L_0x00e9:
            r10 = 3
            if (r2 != r10) goto L_0x014e
            if (r13 == 0) goto L_0x013a
        L_0x00ee:
            com.google.android.apps.gsa.search.core.corpora.IntentCorpus r2 = new com.google.android.apps.gsa.search.core.corpora.IntentCorpus
            java.lang.String r15 = r9.f29467b
            int r10 = r9.f29472g
            com.google.al.d.b r10 = com.google.p395al.p417d.C8600b.m23279a(r10)
            if (r10 != 0) goto L_0x00fc
            com.google.al.d.b r10 = com.google.p395al.p417d.C8600b.NO_MODES
        L_0x00fc:
            r16 = r10
            int r10 = r9.f29468c
            int r10 = com.google.p395al.p408c.p414c.p416b.C8494d.m23269a(r10)
            if (r10 != 0) goto L_0x0109
            r17 = 1
            goto L_0x010b
        L_0x0109:
            r17 = r10
        L_0x010b:
            java.lang.String r10 = r9.f29469d
            android.net.Uri r18 = android.net.Uri.parse(r10)
            java.lang.String r10 = r9.f29470e
            android.net.Uri r19 = android.net.Uri.parse(r10)
            com.google.protobuf.cq r10 = r9.f29473h
            java.util.Map r20 = com.google.android.apps.gsa.search.core.corpora.IntentCorpus.m147520c(r10)
            java.lang.String r10 = r9.f29482q
            java.lang.String r11 = r9.f29483r
            java.lang.String r12 = r9.f29484s
            java.lang.String r9 = r9.f29485t
            r14 = r2
            r21 = r10
            r22 = r11
            r23 = r12
            r24 = r9
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.String r9 = r2.f252914e
            r4.put(r9, r2)
        L_0x0136:
            r2 = r27
            goto L_0x0058
        L_0x013a:
            com.google.common.f.e r2 = com.google.android.apps.gsa.search.core.corpora.IntentCorpus.f231862a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r10, r11)
            java.lang.String r10 = "IntentUriPattern not set for browsable intent"
            r11 = 7618(0x1dc2, float:1.0675E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r11)).mo56386p(r10)
            int r2 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
        L_0x014e:
            boolean r2 = r4.isEmpty()
            if (r2 == 0) goto L_0x0166
            com.google.android.apps.gsa.search.core.corpora.WebCorpus r2 = com.google.android.apps.gsa.search.core.corpora.WebCorpus.m137791a(r9, r7)
            java.lang.String r8 = r2.f231867b
            java.lang.String r9 = r2.f252914e
            java.lang.String r10 = "web"
            boolean r9 = r9.equals(r10)
            com.google.common.base.C58838bb.m90883r(r9)
            goto L_0x016d
        L_0x0166:
            com.google.android.apps.gsa.search.core.corpora.WebCorpus r2 = com.google.android.apps.gsa.search.core.corpora.WebCorpus.m137791a(r9, r8)
            r5.mo55395g(r2)
        L_0x016d:
            java.lang.String r9 = r2.f252914e
            r4.put(r9, r2)
            java.util.Map r9 = r2.f252917h
            if (r9 == 0) goto L_0x0192
            java.lang.String r10 = "tbm"
            java.lang.Object r10 = r9.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r11 = "tbs"
            java.lang.Object r9 = r9.get(r11)
            java.lang.String r9 = (java.lang.String) r9
            if (r10 != 0) goto L_0x018a
            if (r9 == 0) goto L_0x0136
        L_0x018a:
            java.lang.String r9 = com.google.android.apps.gsa.search.core.corpora.C85752a.m137793c(r10, r9)
            r3.put(r9, r2)
            goto L_0x0136
        L_0x0192:
            r9 = 0
            java.lang.String r9 = com.google.android.apps.gsa.search.core.corpora.C85752a.m137793c(r9, r9)
            r3.put(r9, r2)
            goto L_0x0136
        L_0x019b:
            com.google.android.apps.gsa.search.core.corpora.a r2 = new com.google.android.apps.gsa.search.core.corpora.a
            com.google.common.b.hd r4 = com.google.common.p4522b.C58495hd.m89898l(r4)
            com.google.common.b.hd r3 = com.google.common.p4522b.C58495hd.m89898l(r3)
            com.google.common.b.gu r5 = r5.mo55394f()
            r2.<init>(r4, r3, r5, r1)
            r0.f231875b = r2
            boolean r1 = r2.mo79409d()
            if (r1 == 0) goto L_0x01bb
            com.google.common.util.concurrent.SettableFuture r1 = r0.f231874a
            com.google.android.apps.gsa.x.c r2 = com.google.android.apps.gsa.p8883x.C118826c.f331422a
            r1.mo57356n(r2)
        L_0x01bb:
            return
        L_0x01bc:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Cannot read defalut corpora from resources."
            r1.<init>(r2)
            goto L_0x01c5
        L_0x01c4:
            throw r1
        L_0x01c5:
            goto L_0x01c4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.corpora.C85753b.<init>(android.content.Context, java.lang.Integer, com.google.android.apps.gsa.search.core.i.t):void");
    }
}
