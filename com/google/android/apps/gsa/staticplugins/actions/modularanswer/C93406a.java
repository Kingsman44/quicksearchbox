package com.google.android.apps.gsa.staticplugins.actions.modularanswer;

import com.google.android.apps.gsa.handsfree.h;
import com.google.android.apps.gsa.staticplugins.actions.p7361g.C93396j;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.modularanswer.a */
/* compiled from: PG */
public final class C93406a {

    /* renamed from: a */
    private final C68214a f260526a;

    /* renamed from: b */
    private final C93396j f260527b;

    /* renamed from: c */
    private final h f260528c;

    public C93406a(C68214a aVar, C93396j jVar, h hVar) {
        this.f260526a = aVar;
        this.f260527b = jVar;
        this.f260528c = hVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v30, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v69, resolved type: java.util.TreeMap} */
    /* JADX WARNING: type inference failed for: r1v21, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x065f A[LOOP:10: B:195:0x0659->B:197:0x065f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x02ad  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.gsa.search.shared.actions.core.ModularAnswer mo87667a(com.google.p4152bb.p4153a.C55324od r37, com.google.android.apps.gsa.shared.search.Query r38, boolean r39, com.google.p4152bb.p4153a.C55421x r40) {
        /*
            r36 = this;
            r0 = r36
            r1 = r37
            r2 = r38
            r3 = r40
            com.google.bb.a.nr r4 = r1.f145754g
            if (r4 != 0) goto L_0x000e
            com.google.bb.a.nr r4 = com.google.p4152bb.p4153a.C55311nr.f145714b
        L_0x000e:
            com.google.protobuf.cq r4 = r4.f145716a
            com.google.common.b.gu r4 = com.google.common.p4522b.C58485gu.m89842j(r4)
            dagger.a r5 = r0.f260526a
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.search.shared.d.c r5 = (com.google.android.apps.gsa.search.shared.p6926d.C87541c) r5
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r5 = r5.mo81641b()
            if (r39 == 0) goto L_0x0044
            boolean r6 = r5 instanceof com.google.android.apps.gsa.search.shared.actions.core.ModularAnswer
            if (r6 == 0) goto L_0x0044
            com.google.protobuf.bt r6 = com.google.p4152bb.p4153a.C55332ol.f145777c
            com.google.protobuf.bt r6 = com.google.protobuf.C62942bv.checkIsLite(r6)
            r1.mo58887l(r6)
            com.google.protobuf.bf r7 = r1.f169962ag
            com.google.protobuf.bs r6 = r6.f169971d
            boolean r6 = r7.mo58857o(r6)
            if (r6 != 0) goto L_0x003a
            goto L_0x0044
        L_0x003a:
            com.google.android.apps.gsa.staticplugins.actions.modularanswer.ModularAnswerImpl r5 = (com.google.android.apps.gsa.staticplugins.actions.modularanswer.ModularAnswerImpl) r5
            com.google.android.apps.gsa.staticplugins.actions.modularanswer.ModularAnswerImpl r2 = new com.google.android.apps.gsa.staticplugins.actions.modularanswer.ModularAnswerImpl
            java.util.List r5 = r5.f260516g
            r2.<init>(r1, r5, r4, r3)
            return r2
        L_0x0044:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            com.google.protobuf.bt r6 = com.google.p4152bb.p4153a.C55332ol.f145777c
            com.google.protobuf.bt r6 = com.google.protobuf.C62942bv.checkIsLite(r6)
            r1.mo58887l(r6)
            com.google.protobuf.bf r7 = r1.f169962ag
            com.google.protobuf.bs r6 = r6.f169971d
            boolean r6 = r7.mo58857o(r6)
            if (r6 == 0) goto L_0x06ca
            com.google.protobuf.bt r6 = com.google.p4152bb.p4153a.C55332ol.f145777c
            com.google.protobuf.bt r6 = com.google.protobuf.C62942bv.checkIsLite(r6)
            r1.mo58887l(r6)
            com.google.protobuf.bf r12 = r1.f169962ag
            com.google.protobuf.bs r13 = r6.f169971d
            java.lang.Object r12 = r12.mo58854l(r13)
            if (r12 != 0) goto L_0x0072
            java.lang.Object r6 = r6.f169969b
            goto L_0x0076
        L_0x0072:
            java.lang.Object r6 = r6.mo58889c(r12)
        L_0x0076:
            com.google.bb.a.ol r6 = (com.google.p4152bb.p4153a.C55332ol) r6
            com.google.protobuf.bn r12 = r37.toBuilder()
            com.google.bb.a.oc r12 = (com.google.p4152bb.p4153a.C55323oc) r12
            r13 = 0
        L_0x007f:
            com.google.protobuf.cq r14 = r1.f145751d
            int r14 = r14.size()
            if (r13 >= r14) goto L_0x06c0
            com.google.protobuf.cq r14 = r1.f145751d
            java.lang.Object r14 = r14.get(r13)
            com.google.bb.a.df r14 = (com.google.p4152bb.p4153a.C55029df) r14
            com.google.protobuf.bt r15 = com.google.p4152bb.p4153a.C55047dx.f144821k
            com.google.protobuf.bt r15 = com.google.protobuf.C62942bv.checkIsLite(r15)
            r14.mo58887l(r15)
            com.google.protobuf.bf r8 = r14.f169962ag
            com.google.protobuf.bs r15 = r15.f169971d
            boolean r8 = r8.mo58857o(r15)
            if (r8 != 0) goto L_0x00a9
            r21 = r4
            r34 = r6
            r11 = r13
            goto L_0x06b2
        L_0x00a9:
            com.google.protobuf.bt r8 = com.google.p4152bb.p4153a.C55047dx.f144821k
            com.google.protobuf.bt r8 = com.google.protobuf.C62942bv.checkIsLite(r8)
            r14.mo58887l(r8)
            com.google.protobuf.bf r15 = r14.f169962ag
            com.google.protobuf.bs r9 = r8.f169971d
            java.lang.Object r9 = r15.mo58854l(r9)
            if (r9 != 0) goto L_0x00bf
            java.lang.Object r8 = r8.f169969b
            goto L_0x00c3
        L_0x00bf:
            java.lang.Object r8 = r8.mo58889c(r9)
        L_0x00c3:
            com.google.bb.a.dx r8 = (com.google.p4152bb.p4153a.C55047dx) r8
            com.google.protobuf.bn r8 = r8.toBuilder()
            com.google.bb.a.dm r8 = (com.google.p4152bb.p4153a.C55036dm) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.bb.a.dx r9 = (com.google.p4152bb.p4153a.C55047dx) r9
            int r15 = r9.f144823a
            r15 = r15 | 16
            r9.f144823a = r15
            java.lang.String r15 = "agsa_action_sms"
            r9.f144831i = r15
            com.google.protobuf.bv r8 = r8.build()
            com.google.bb.a.dx r8 = (com.google.p4152bb.p4153a.C55047dx) r8
            com.google.protobuf.bt r9 = com.google.p4152bb.p4153a.C55340ot.f145800f
            com.google.protobuf.bt r9 = com.google.protobuf.C62942bv.checkIsLite(r9)
            r8.mo58887l(r9)
            com.google.protobuf.bf r15 = r8.f169962ag
            com.google.protobuf.bs r11 = r9.f169971d
            java.lang.Object r11 = r15.mo58854l(r11)
            if (r11 != 0) goto L_0x00f8
            java.lang.Object r9 = r9.f169969b
            goto L_0x00fc
        L_0x00f8:
            java.lang.Object r9 = r9.mo58889c(r11)
        L_0x00fc:
            com.google.bb.a.ot r9 = (com.google.p4152bb.p4153a.C55340ot) r9
            if (r9 == 0) goto L_0x0676
            com.google.android.apps.gsa.staticplugins.actions.g.j r9 = r0.f260527b
            com.google.protobuf.bt r11 = com.google.p4152bb.p4153a.C55340ot.f145800f
            com.google.protobuf.bt r11 = com.google.protobuf.C62942bv.checkIsLite(r11)
            r8.mo58887l(r11)
            com.google.protobuf.bf r15 = r8.f169962ag
            com.google.protobuf.bs r7 = r11.f169971d
            java.lang.Object r7 = r15.mo58854l(r7)
            if (r7 != 0) goto L_0x0118
            java.lang.Object r7 = r11.f169969b
            goto L_0x011c
        L_0x0118:
            java.lang.Object r7 = r11.mo58889c(r7)
        L_0x011c:
            com.google.bb.a.ot r7 = (com.google.p4152bb.p4153a.C55340ot) r7
            com.google.protobuf.cq r11 = r7.f145803b
            int r11 = r11.size()
            java.lang.String r15 = "agsa_sms_contact"
            if (r11 != 0) goto L_0x012c
        L_0x0128:
            r20 = r15
            goto L_0x01a2
        L_0x012c:
            com.google.protobuf.cq r11 = r7.f145803b
            java.lang.String r10 = r8.f144831i
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x0138
            r10 = r15
            goto L_0x013a
        L_0x0138:
            java.lang.String r10 = r8.f144831i
        L_0x013a:
            java.util.Map r10 = r9.mo87659b(r2, r11, r10)
            java.util.Set r11 = r10.keySet()
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x014b
            com.google.protobuf.cq r7 = r7.f145803b
            goto L_0x0128
        L_0x014b:
            java.util.ArrayList r7 = new java.util.ArrayList
            java.util.Set r10 = r10.keySet()
            r7.<init>(r10)
            boolean r10 = r7.isEmpty()
            if (r10 == 0) goto L_0x015b
            goto L_0x0128
        L_0x015b:
            r7.size()
            r10 = 0
        L_0x015f:
            com.google.protobuf.cq r11 = r8.f144824b
            int r11 = r11.size()
            if (r10 >= r11) goto L_0x018f
            com.google.protobuf.cq r11 = r8.f144824b
            java.lang.Object r11 = r11.get(r10)
            com.google.bb.a.do r11 = (com.google.p4152bb.p4153a.C55038do) r11
            r20 = r15
            java.lang.String r15 = r11.f144802b
            java.lang.String r3 = "CreativeWork/ShortMessage"
            boolean r3 = r15.equals(r3)
            if (r3 == 0) goto L_0x0188
            java.lang.String r3 = r11.f144803c
            java.lang.String r11 = "otherPartyAddress"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto L_0x0186
            goto L_0x0188
        L_0x0186:
            r3 = -1
            goto L_0x0193
        L_0x0188:
            int r10 = r10 + 1
            r3 = r40
            r15 = r20
            goto L_0x015f
        L_0x018f:
            r20 = r15
            r3 = -1
            r10 = -1
        L_0x0193:
            if (r10 != r3) goto L_0x01a5
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.actions.p7361g.C93396j.f260484a
            com.google.common.f.x r3 = r3.mo56226d()
            java.lang.String r7 = "Couldn't find other party address section."
            r9 = 13699(0x3583, float:1.9196E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r9)).mo56386p(r7)
        L_0x01a2:
            r21 = r4
            goto L_0x0211
        L_0x01a5:
            com.google.bb.a.ds r3 = com.google.p4152bb.p4153a.C55042ds.f144811b
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.bb.a.dr r3 = (com.google.p4152bb.p4153a.C55041dr) r3
            r11 = 0
        L_0x01ae:
            int r15 = r7.size()
            if (r11 >= r15) goto L_0x01ff
            com.google.bb.a.du r15 = com.google.p4152bb.p4153a.C55044du.f144814d
            com.google.protobuf.bn r15 = r15.createBuilder()
            com.google.bb.a.dt r15 = (com.google.p4152bb.p4153a.C55043dt) r15
            r15.copyOnWrite()
            r21 = r4
            com.google.protobuf.bv r4 = r15.instance
            com.google.bb.a.du r4 = (com.google.p4152bb.p4153a.C55044du) r4
            int r1 = r4.f144816a
            r17 = 1
            r1 = r1 | 1
            r4.f144816a = r1
            r4.f144817b = r10
            java.lang.Object r1 = r7.get(r11)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r9.mo87658a(r1)
            r15.copyOnWrite()
            com.google.protobuf.bv r4 = r15.instance
            com.google.bb.a.du r4 = (com.google.p4152bb.p4153a.C55044du) r4
            r1.getClass()
            r22 = r7
            int r7 = r4.f144816a
            r19 = 2
            r7 = r7 | 2
            r4.f144816a = r7
            r4.f144818c = r1
            int r1 = r4.f144817b
            java.lang.String r1 = r4.f144818c
            r3.mo54175a(r15)
            int r11 = r11 + 1
            r1 = r37
            r4 = r21
            r7 = r22
            goto L_0x01ae
        L_0x01ff:
            r21 = r4
            com.google.protobuf.bn r1 = r8.toBuilder()
            com.google.bb.a.dm r1 = (com.google.p4152bb.p4153a.C55036dm) r1
            r1.mo54174a(r3)
            com.google.protobuf.bv r1 = r1.build()
            r8 = r1
            com.google.bb.a.dx r8 = (com.google.p4152bb.p4153a.C55047dx) r8
        L_0x0211:
            com.google.android.apps.gsa.staticplugins.actions.g.j r1 = r0.f260527b
            com.google.protobuf.bt r3 = com.google.p4152bb.p4153a.C55340ot.f145800f
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)
            r8.mo58887l(r3)
            com.google.protobuf.bf r4 = r8.f169962ag
            com.google.protobuf.bs r7 = r3.f169971d
            java.lang.Object r4 = r4.mo58854l(r7)
            if (r4 != 0) goto L_0x0229
            java.lang.Object r3 = r3.f169969b
            goto L_0x022d
        L_0x0229:
            java.lang.Object r3 = r3.mo58889c(r4)
        L_0x022d:
            com.google.bb.a.ot r3 = (com.google.p4152bb.p4153a.C55340ot) r3
            com.google.protobuf.cq r4 = r3.f145803b
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x0266
            com.google.protobuf.cq r4 = r3.f145803b
            java.lang.String r7 = r8.f144831i
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x0244
            r15 = r20
            goto L_0x0246
        L_0x0244:
            java.lang.String r15 = r8.f144831i
        L_0x0246:
            java.util.Map r4 = r1.mo87659b(r2, r4, r15)
            java.util.Set r7 = r4.keySet()
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x0267
            com.google.protobuf.cq r1 = r3.f145803b
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89845m()
        L_0x025a:
            r34 = r6
            r35 = r8
            r16 = r12
            r20 = r13
            r22 = r14
            goto L_0x0655
        L_0x0266:
            r4 = 0
        L_0x0267:
            com.google.android.apps.gsa.search.core.i.t r7 = r1.f260489f
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247755nD
            boolean r7 = r7.mo79746e(r9)
            if (r7 == 0) goto L_0x028f
            com.google.android.apps.gsa.search.core.ae.a.ak r7 = new com.google.android.apps.gsa.search.core.ae.a.ak
            com.google.bb.a.dx r9 = com.google.android.apps.gsa.staticplugins.actions.p7361g.C93397k.m153649a(r8)
            dagger.a r10 = r1.f260487d
            dagger.a r11 = r1.f260488e
            r15 = 3
            r7.<init>(r9, r10, r11, r15)
            com.google.android.apps.gsa.search.core.ae.a.aj r9 = r1.f260485b
            java.lang.String r10 = com.google.android.apps.gsa.staticplugins.actions.p7361g.C93397k.m153650b(r8)
            java.lang.String r11 = r8.f144829g
            java.lang.String r15 = "internal.3p:Message"
            com.google.android.libraries.gcoreclient.c.b r9 = r9.mo78007a(r10, r11, r15, r7)
            r15 = 0
            goto L_0x02a6
        L_0x028f:
            com.google.android.apps.gsa.search.core.ae.a.ak r7 = new com.google.android.apps.gsa.search.core.ae.a.ak
            dagger.a r9 = r1.f260487d
            dagger.a r10 = r1.f260488e
            r11 = 0
            r7.<init>(r8, r9, r10, r11)
            com.google.android.apps.gsa.search.core.ae.a.aj r9 = r1.f260485b
            java.lang.String r10 = r8.f144829g
            java.lang.String r11 = r7.mo78008a()
            r15 = 0
            com.google.android.libraries.gcoreclient.c.b r9 = r9.mo78007a(r11, r10, r15, r7)
        L_0x02a6:
            if (r9 != 0) goto L_0x02ad
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89845m()
            goto L_0x025a
        L_0x02ad:
            r9.mo26945a()
            if (r3 == 0) goto L_0x030d
            int r10 = r3.f145802a
            r11 = 1
            r10 = r10 & r11
            if (r10 == 0) goto L_0x030d
            com.google.bb.a.os r10 = r3.f145804c
            if (r10 != 0) goto L_0x02be
            com.google.bb.a.os r10 = com.google.p4152bb.p4153a.C55339os.f145794c
        L_0x02be:
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
            r16 = r12
            r20 = r13
            long r12 = r10.f145796a
            long r11 = r11.toMillis(r12)
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.SECONDS
            r22 = r14
            long r14 = r10.f145797b
            long r13 = r13.toMillis(r14)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x02dd:
            boolean r15 = r9.hasNext()
            if (r15 == 0) goto L_0x0317
            java.lang.Object r15 = r9.next()
            com.google.android.libraries.gcoreclient.c.a.b r15 = (com.google.android.libraries.gcoreclient.p1753c.p1754a.C21454b) r15
            java.lang.Long r23 = r1.mo87660c(r15)
            if (r23 == 0) goto L_0x02dd
            r24 = 0
            int r26 = (r11 > r24 ? 1 : (r11 == r24 ? 0 : -1))
            if (r26 == 0) goto L_0x02fd
            long r26 = r23.longValue()
            int r28 = (r26 > r11 ? 1 : (r26 == r11 ? 0 : -1))
            if (r28 < 0) goto L_0x02dd
        L_0x02fd:
            int r26 = (r13 > r24 ? 1 : (r13 == r24 ? 0 : -1))
            if (r26 == 0) goto L_0x0309
            long r23 = r23.longValue()
            int r25 = (r23 > r13 ? 1 : (r23 == r13 ? 0 : -1))
            if (r25 > 0) goto L_0x02dd
        L_0x0309:
            r10.add(r15)
            goto L_0x02dd
        L_0x030d:
            r16 = r12
            r20 = r13
            r22 = r14
            com.google.common.b.gu r10 = com.google.common.p4522b.C58485gu.m89841i(r9)
        L_0x0317:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            android.net.Uri r11 = android.provider.Telephony.Sms.CONTENT_URI
            java.lang.String r11 = r11.toString()
            java.util.Iterator r10 = r10.iterator()
        L_0x0326:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x0342
            java.lang.Object r12 = r10.next()
            com.google.android.libraries.gcoreclient.c.a.b r12 = (com.google.android.libraries.gcoreclient.p1753c.p1754a.C21454b) r12
            com.google.android.gms.appdatasearch.al r13 = r12.f59905a
            java.lang.String r13 = r13.mo117713i()
            boolean r13 = r13.startsWith(r11)
            if (r13 == 0) goto L_0x0326
            r9.add(r12)
            goto L_0x0326
        L_0x0342:
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L_0x0352
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89845m()
            r34 = r6
            r35 = r8
            goto L_0x0655
        L_0x0352:
            com.google.protobuf.cq r10 = r3.f145803b
            int r10 = r10.size()
            if (r10 == 0) goto L_0x035c
            if (r4 != 0) goto L_0x040b
        L_0x035c:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r10 = r9.iterator()
        L_0x0365:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0381
            java.lang.Object r11 = r10.next()
            com.google.android.libraries.gcoreclient.c.a.b r11 = (com.google.android.libraries.gcoreclient.p1753c.p1754a.C21454b) r11
            com.google.android.apps.gsa.staticplugins.actions.g.k r12 = r1.f260490g
            java.lang.String r12 = r12.mo87661c()
            com.google.android.gms.appdatasearch.al r11 = r11.f59905a
            java.lang.String r11 = r11.mo117712h(r12)
            r4.add(r11)
            goto L_0x0365
        L_0x0381:
            java.util.TreeMap r10 = new java.util.TreeMap
            r10.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x038a:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L_0x040a
            java.lang.Object r11 = r4.next()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = r1.mo87658a(r11)
            boolean r13 = r10.containsKey(r11)
            if (r13 != 0) goto L_0x03fc
            boolean r13 = r10.containsKey(r12)
            if (r13 == 0) goto L_0x03a7
            goto L_0x03fc
        L_0x03a7:
            boolean r13 = r12.isEmpty()
            if (r13 == 0) goto L_0x03bb
            com.google.common.f.e r11 = com.google.android.apps.gsa.staticplugins.actions.p7361g.C93396j.f260484a
            com.google.common.f.x r11 = r11.mo56226d()
            java.lang.String r12 = "Found an empty phone number."
            r13 = 13725(0x359d, float:1.9233E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r13)).mo56386p(r12)
            goto L_0x038a
        L_0x03bb:
            com.google.android.apps.gsa.contacts.cn r13 = r1.f260486c
            java.util.List r12 = r13.a(r12)
            java.util.List r12 = com.google.android.apps.gsa.search.shared.contact.Person.normalizeContacts(r12)
            boolean r13 = r12.isEmpty()
            if (r13 == 0) goto L_0x03d9
            com.google.common.f.e r12 = com.google.android.apps.gsa.staticplugins.actions.p7361g.C93396j.f260484a
            com.google.common.f.x r12 = r12.mo56226d()
            java.lang.String r13 = "[%s] was not associated with any person"
            r14 = 13724(0x359c, float:1.9231E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r14)).mo56389s(r13, r11)
            goto L_0x038a
        L_0x03d9:
            int r13 = r12.size()
            r14 = 1
            if (r13 <= r14) goto L_0x03ed
            com.google.common.f.e r13 = com.google.android.apps.gsa.staticplugins.actions.p7361g.C93396j.f260484a
            com.google.common.f.x r13 = r13.mo56226d()
            java.lang.String r14 = "[%s] was associated with multiple persons"
            r15 = 13723(0x359b, float:1.923E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r15)).mo56389s(r14, r11)
        L_0x03ed:
            java.lang.String r11 = r1.mo87658a(r11)
            r13 = 0
            java.lang.Object r12 = r12.get(r13)
            com.google.android.apps.gsa.search.shared.contact.Person r12 = (com.google.android.apps.gsa.search.shared.contact.Person) r12
            r10.put(r11, r12)
            goto L_0x038a
        L_0x03fc:
            com.google.common.f.e r12 = com.google.android.apps.gsa.staticplugins.actions.p7361g.C93396j.f260484a
            com.google.common.f.x r12 = r12.mo56226d()
            java.lang.String r13 = "[%s] was tried to be associated with different person"
            r14 = 13722(0x359a, float:1.9229E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r14)).mo56389s(r13, r11)
            goto L_0x038a
        L_0x040a:
            r4 = r10
        L_0x040b:
            java.util.List r10 = r7.f229729d
            if (r10 != 0) goto L_0x041b
            com.google.bb.a.dx r10 = r7.f229726a
            java.util.List r11 = r7.mo78009b(r10)
            java.util.List r10 = com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84429ak.m134757c(r10, r11)
            r7.f229729d = r10
        L_0x041b:
            java.util.List r7 = r7.f229729d
            com.google.common.b.gu r7 = com.google.common.p4522b.C58485gu.m89842j(r7)
            r9.size()
            long r10 = r6.f145779a
            r12 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r12
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.TreeMap r13 = new java.util.TreeMap
            r13.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x0438:
            boolean r14 = r9.hasNext()
            if (r14 == 0) goto L_0x04b8
            java.lang.Object r14 = r9.next()
            com.google.android.libraries.gcoreclient.c.a.b r14 = (com.google.android.libraries.gcoreclient.p1753c.p1754a.C21454b) r14
            java.lang.Long r15 = r1.mo87660c(r14)
            if (r15 == 0) goto L_0x04b5
            com.google.android.apps.gsa.staticplugins.actions.g.k r2 = r1.f260490g
            java.lang.String r2 = r2.mo87661c()
            r34 = r6
            com.google.android.gms.appdatasearch.al r6 = r14.f59905a
            java.lang.String r2 = r6.mo117712h(r2)
            boolean r6 = r13.containsKey(r2)
            if (r6 != 0) goto L_0x0471
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r12.add(r6)
            r13.put(r2, r6)
            r6.add(r14)
            r2 = r38
            r6 = r34
            goto L_0x0438
        L_0x0471:
            java.lang.Object r6 = r13.get(r2)
            java.util.List r6 = (java.util.List) r6
            int r23 = r6.size()
            r35 = r8
            r18 = -1
            int r8 = r23 + -1
            java.lang.Object r8 = r6.get(r8)
            com.google.android.libraries.gcoreclient.c.a.b r8 = (com.google.android.libraries.gcoreclient.p1753c.p1754a.C21454b) r8
            java.lang.Long r8 = r1.mo87660c(r8)
            long r23 = r8.longValue()
            long r25 = r15.longValue()
            long r23 = r23 - r25
            int r8 = (r23 > r10 ? 1 : (r23 == r10 ? 0 : -1))
            if (r8 > 0) goto L_0x04a0
            r6.add(r14)
            r6.size()
            goto L_0x04ae
        L_0x04a0:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r12.add(r6)
            r13.put(r2, r6)
            r6.add(r14)
        L_0x04ae:
            r2 = r38
            r6 = r34
            r8 = r35
            goto L_0x0438
        L_0x04b5:
            r2 = r38
            goto L_0x0438
        L_0x04b8:
            r34 = r6
            r35 = r8
            com.google.protobuf.cq r2 = r3.f145805d
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x04cf
            com.google.protobuf.cq r2 = r3.f145805d
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            com.google.bb.a.op r2 = (com.google.p4152bb.p4153a.C55336op) r2
            goto L_0x0568
        L_0x04cf:
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.actions.p7361g.C93396j.f260484a
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.String r3 = "Can't find contract for SearchMessageResult. It may affect Text-to-Speech."
            r6 = 13707(0x358b, float:1.9208E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r6)).mo56386p(r3)
            com.google.bb.a.op r2 = com.google.p4152bb.p4153a.C55336op.f145790b
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.bb.a.om r2 = (com.google.p4152bb.p4153a.C55333om) r2
            com.google.bb.a.oo r3 = com.google.p4152bb.p4153a.C55335oo.f145781h
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.bb.a.on r3 = (com.google.p4152bb.p4153a.C55334on) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.bb.a.oo r6 = (com.google.p4152bb.p4153a.C55335oo) r6
            int r8 = r6.f145783a
            r9 = 1
            r8 = r8 | r9
            r6.f145783a = r8
            r8 = 0
            r6.f145784b = r8
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.bb.a.oo r6 = (com.google.p4152bb.p4153a.C55335oo) r6
            int r8 = r6.f145783a
            r10 = 2
            r8 = r8 | r10
            r6.f145783a = r8
            r6.f145785c = r9
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.bb.a.oo r6 = (com.google.p4152bb.p4153a.C55335oo) r6
            int r8 = r6.f145783a
            r9 = 4
            r8 = r8 | r9
            r6.f145783a = r8
            r6.f145786d = r10
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.bb.a.oo r6 = (com.google.p4152bb.p4153a.C55335oo) r6
            int r8 = r6.f145783a
            r8 = r8 | 8
            r6.f145783a = r8
            r8 = 3
            r6.f145787e = r8
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.bb.a.oo r6 = (com.google.p4152bb.p4153a.C55335oo) r6
            int r8 = r6.f145783a
            r8 = r8 | 16
            r6.f145783a = r8
            r8 = 4
            r6.f145788f = r8
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.bb.a.oo r6 = (com.google.p4152bb.p4153a.C55335oo) r6
            int r8 = r6.f145783a
            r8 = r8 | 32
            r6.f145783a = r8
            r8 = 5
            r6.f145789g = r8
            r2.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            com.google.bb.a.op r6 = (com.google.p4152bb.p4153a.C55336op) r6
            com.google.protobuf.bv r3 = r3.build()
            com.google.bb.a.oo r3 = (com.google.p4152bb.p4153a.C55335oo) r3
            r3.getClass()
            r6.mo54244a()
            com.google.protobuf.cq r6 = r6.f145793a
            r6.add(r3)
            com.google.protobuf.bv r2 = r2.build()
            com.google.bb.a.op r2 = (com.google.p4152bb.p4153a.C55336op) r2
        L_0x0568:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r6 = r12.size()
            r8 = 0
            r24 = 0
        L_0x0574:
            if (r8 >= r6) goto L_0x0654
            java.lang.Object r9 = r12.get(r8)
            java.util.List r9 = (java.util.List) r9
            java.util.Collections.reverse(r9)
            int r10 = r24 + 1
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r13 = r9.iterator()
        L_0x058a:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x05b7
            java.lang.Object r14 = r13.next()
            com.google.android.libraries.gcoreclient.c.a.b r14 = (com.google.android.libraries.gcoreclient.p1753c.p1754a.C21454b) r14
            com.google.android.apps.gsa.staticplugins.actions.g.k r15 = r1.f260490g
            com.google.android.apps.gsa.search.core.i.t r15 = r15.f260500h
            r19 = r6
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247755nD
            boolean r6 = r15.mo79746e(r6)
            if (r6 == 0) goto L_0x05a7
            java.lang.String r6 = "text"
            goto L_0x05ab
        L_0x05a7:
            com.google.android.gms.appdatasearch.Section r6 = com.google.android.apps.gsa.staticplugins.actions.p7361g.C93397k.f260493a
            java.lang.String r6 = r6.f387556a
        L_0x05ab:
            com.google.android.gms.appdatasearch.al r14 = r14.f59905a
            java.lang.String r6 = r14.mo117712h(r6)
            r11.add(r6)
            r6 = r19
            goto L_0x058a
        L_0x05b7:
            r19 = r6
            int r6 = r9.size()
            r13 = -1
            int r6 = r6 + r13
            java.lang.Object r6 = r9.get(r6)
            com.google.android.libraries.gcoreclient.c.a.b r6 = (com.google.android.libraries.gcoreclient.p1753c.p1754a.C21454b) r6
            com.google.android.apps.gsa.staticplugins.actions.g.k r9 = r1.f260490g
            java.lang.String r9 = r9.mo87661c()
            com.google.android.gms.appdatasearch.al r14 = r6.f59905a
            java.lang.String r9 = r14.mo117712h(r9)
            java.lang.String r9 = r1.mo87658a(r9)
            java.lang.String r26 = android.telephony.PhoneNumberUtils.formatNumber(r9)
            java.lang.Object r9 = r4.get(r9)
            r25 = r9
            com.google.android.apps.gsa.search.shared.contact.Person r25 = (com.google.android.apps.gsa.search.shared.contact.Person) r25
            java.lang.Long r9 = r1.mo87660c(r6)
            com.google.android.apps.gsa.staticplugins.actions.g.k r14 = r1.f260490g
            com.google.android.apps.gsa.search.core.i.t r14 = r14.f260500h
            com.google.android.apps.gsa.shared.m.d r15 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247755nD
            boolean r14 = r14.mo79746e(r15)
            if (r14 == 0) goto L_0x05f4
            java.lang.String r14 = "labels"
            goto L_0x05f8
        L_0x05f4:
            com.google.android.gms.appdatasearch.Section r14 = com.google.android.apps.gsa.staticplugins.actions.p7361g.C93397k.f260494b
            java.lang.String r14 = r14.f387556a
        L_0x05f8:
            com.google.android.gms.appdatasearch.al r15 = r6.f59905a
            java.lang.String r14 = r15.mo117712h(r14)
            com.google.android.apps.gsa.staticplugins.actions.g.k r15 = r1.f260490g
            com.google.android.apps.gsa.search.core.i.t r15 = r15.f260500h
            com.google.android.apps.gsa.shared.m.d r13 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247755nD
            boolean r13 = r15.mo79746e(r13)
            if (r13 == 0) goto L_0x060d
            java.lang.String r13 = "inbox"
            goto L_0x060f
        L_0x060d:
            java.lang.String r13 = com.google.android.apps.gsa.staticplugins.actions.p7361g.C93397k.f260498f
        L_0x060f:
            boolean r13 = r14.contains(r13)
            r14 = 1
            if (r14 == r13) goto L_0x061b
            r13 = 101(0x65, float:1.42E-43)
            r31 = 101(0x65, float:1.42E-43)
            goto L_0x061f
        L_0x061b:
            r13 = 100
            r31 = 100
        L_0x061f:
            com.google.android.apps.gsa.staticplugins.actions.g.k r13 = r1.f260490g
            com.google.android.apps.gsa.search.core.i.t r13 = r13.f260500h
            com.google.android.apps.gsa.shared.m.d r14 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247755nD
            boolean r13 = r13.mo79746e(r14)
            if (r13 == 0) goto L_0x062e
            java.lang.String r13 = "isPartOf_id"
            goto L_0x0632
        L_0x062e:
            com.google.android.gms.appdatasearch.Section r13 = com.google.android.apps.gsa.staticplugins.actions.p7361g.C93397k.f260497e
            java.lang.String r13 = r13.f387556a
        L_0x0632:
            com.google.android.gms.appdatasearch.al r6 = r6.f59905a
            java.lang.String r32 = r6.mo117712h(r13)
            com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.SmsResult r6 = new com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.SmsResult
            long r29 = r9.longValue()
            r23 = r6
            r27 = r11
            r28 = r7
            r33 = r2
            r23.<init>(r24, r25, r26, r27, r28, r29, r31, r32, r33)
            r3.add(r6)
            int r8 = r8 + 1
            r24 = r10
            r6 = r19
            goto L_0x0574
        L_0x0654:
            r1 = r3
        L_0x0655:
            java.util.Iterator r1 = r1.iterator()
        L_0x0659:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0673
            java.lang.Object r2 = r1.next()
            com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.SmsResult r2 = (com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.SmsResult) r2
            com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.ResultGroup r3 = new com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.ResultGroup
            com.google.common.b.gu r2 = com.google.common.p4522b.C58485gu.m89846n(r2)
            r4 = 1
            r3.<init>(r4, r2)
            r5.add(r3)
            goto L_0x0659
        L_0x0673:
            r8 = r35
            goto L_0x0680
        L_0x0676:
            r21 = r4
            r34 = r6
            r16 = r12
            r20 = r13
            r22 = r14
        L_0x0680:
            com.google.protobuf.bn r1 = r22.toBuilder()
            com.google.bb.a.de r1 = (com.google.p4152bb.p4153a.C55028de) r1
            com.google.protobuf.bt r2 = com.google.p4152bb.p4153a.C55047dx.f144821k
            r1.mo58885m(r2, r8)
            com.google.protobuf.bv r1 = r1.build()
            com.google.bb.a.df r1 = (com.google.p4152bb.p4153a.C55029df) r1
            r16.copyOnWrite()
            r12 = r16
            com.google.protobuf.bv r2 = r12.instance
            com.google.bb.a.od r2 = (com.google.p4152bb.p4153a.C55324od) r2
            r1.getClass()
            com.google.protobuf.cq r3 = r2.f145751d
            boolean r4 = r3.mo58948c()
            if (r4 != 0) goto L_0x06ab
            com.google.protobuf.cq r3 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r3)
            r2.f145751d = r3
        L_0x06ab:
            com.google.protobuf.cq r2 = r2.f145751d
            r11 = r20
            r2.set(r11, r1)
        L_0x06b2:
            int r13 = r11 + 1
            r1 = r37
            r2 = r38
            r3 = r40
            r4 = r21
            r6 = r34
            goto L_0x007f
        L_0x06c0:
            r21 = r4
            com.google.protobuf.bv r1 = r12.build()
            com.google.bb.a.od r1 = (com.google.p4152bb.p4153a.C55324od) r1
            goto L_0x0abe
        L_0x06ca:
            r21 = r4
            com.google.protobuf.cq r2 = r1.f145749b
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x0804
            com.google.protobuf.cq r2 = r1.f145749b
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            com.google.bb.a.oj r2 = (com.google.p4152bb.p4153a.C55330oj) r2
            com.google.protobuf.bt r3 = com.google.p4152bb.p4153a.C55328oh.f145765c
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)
            r2.mo58887l(r3)
            com.google.protobuf.bf r2 = r2.f169962ag
            com.google.protobuf.bs r3 = r3.f169971d
            boolean r2 = r2.mo58857o(r3)
            if (r2 == 0) goto L_0x0804
            com.google.protobuf.cq r2 = r1.f145749b
            r2.size()
            com.google.protobuf.cq r2 = r1.f145749b
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            com.google.bb.a.oj r2 = (com.google.p4152bb.p4153a.C55330oj) r2
            com.google.protobuf.bt r3 = com.google.p4152bb.p4153a.C55328oh.f145765c
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)
            r2.mo58887l(r3)
            com.google.protobuf.bf r2 = r2.f169962ag
            com.google.protobuf.bs r4 = r3.f169971d
            java.lang.Object r2 = r2.mo58854l(r4)
            if (r2 != 0) goto L_0x0714
            java.lang.Object r2 = r3.f169969b
            goto L_0x0718
        L_0x0714:
            java.lang.Object r2 = r3.mo58889c(r2)
        L_0x0718:
            com.google.bb.a.oh r2 = (com.google.p4152bb.p4153a.C55328oh) r2
            com.google.protobuf.cq r3 = r1.f145749b
            java.util.Iterator r3 = r3.iterator()
            r7 = 0
        L_0x0721:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0abe
            java.lang.Object r4 = r3.next()
            com.google.bb.a.oj r4 = (com.google.p4152bb.p4153a.C55330oj) r4
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            com.google.protobuf.cq r8 = r4.f145774d
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x0745
            com.google.protobuf.cq r8 = r4.f145774d
            r9 = 0
            java.lang.Object r8 = r8.get(r9)
            com.google.bb.a.nl r8 = (com.google.p4152bb.p4153a.C55305nl) r8
            r10 = r8
            goto L_0x0746
        L_0x0745:
            r10 = 0
        L_0x0746:
            com.google.protobuf.cq r4 = r4.f145773c
            java.util.Iterator r4 = r4.iterator()
        L_0x074c:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x07df
            java.lang.Object r8 = r4.next()
            com.google.bb.a.nx r8 = (com.google.p4152bb.p4153a.C55317nx) r8
            int r9 = r8.f145734b
            com.google.bb.a.og r11 = r2.f145767a
            if (r11 != 0) goto L_0x0760
            com.google.bb.a.og r11 = com.google.p4152bb.p4153a.C55327og.f145758d
        L_0x0760:
            int r11 = r11.f145762c
            if (r9 != r11) goto L_0x074c
            com.google.protobuf.bt r9 = com.google.p4152bb.p4153a.C55342ov.f145807c
            com.google.protobuf.bt r9 = com.google.protobuf.C62942bv.checkIsLite(r9)
            r8.mo58887l(r9)
            com.google.protobuf.bf r11 = r8.f169962ag
            com.google.protobuf.bs r9 = r9.f169971d
            boolean r9 = r11.mo58857o(r9)
            if (r9 == 0) goto L_0x074c
            com.google.protobuf.bt r9 = com.google.p4152bb.p4153a.C55342ov.f145807c
            com.google.protobuf.bt r9 = com.google.protobuf.C62942bv.checkIsLite(r9)
            r8.mo58887l(r9)
            com.google.protobuf.bf r11 = r8.f169962ag
            com.google.protobuf.bs r12 = r9.f169971d
            java.lang.Object r11 = r11.mo58854l(r12)
            if (r11 != 0) goto L_0x078d
            java.lang.Object r9 = r9.f169969b
            goto L_0x0791
        L_0x078d:
            java.lang.Object r9 = r9.mo58889c(r11)
        L_0x0791:
            com.google.bb.a.ov r9 = (com.google.p4152bb.p4153a.C55342ov) r9
            com.google.protobuf.cq r9 = r9.f145809a
            int r9 = r9.size()
            if (r9 <= 0) goto L_0x074c
            com.google.protobuf.bt r4 = com.google.p4152bb.p4153a.C55342ov.f145807c
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r8.mo58887l(r4)
            com.google.protobuf.bf r6 = r8.f169962ag
            com.google.protobuf.bs r8 = r4.f169971d
            java.lang.Object r6 = r6.mo58854l(r8)
            if (r6 != 0) goto L_0x07b1
            java.lang.Object r4 = r4.f169969b
            goto L_0x07b5
        L_0x07b1:
            java.lang.Object r4 = r4.mo58889c(r6)
        L_0x07b5:
            com.google.bb.a.ov r4 = (com.google.p4152bb.p4153a.C55342ov) r4
            com.google.protobuf.cq r4 = r4.f145809a
            r6 = 0
            java.lang.Object r4 = r4.get(r6)
            java.lang.String r4 = (java.lang.String) r4
            com.google.android.apps.gsa.handsfree.h r6 = r0.f260528c
            java.util.Map r6 = r6.o
            java.lang.Object r6 = r6.get(r4)
            java.util.List r6 = (java.util.List) r6
            com.google.android.apps.gsa.handsfree.h r8 = r0.f260528c
            java.util.Map r8 = r8.n
            java.lang.Object r4 = r8.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r6 == 0) goto L_0x07dc
            if (r4 == 0) goto L_0x07dc
            r8 = 0
            r6.get(r8)
        L_0x07dc:
            r9 = r4
            r8 = r6
            goto L_0x07e1
        L_0x07df:
            r8 = r6
            r9 = 0
        L_0x07e1:
            if (r8 == 0) goto L_0x0721
            boolean r4 = r8.isEmpty()
            if (r4 != 0) goto L_0x0721
            if (r9 == 0) goto L_0x0721
            int r4 = r7 + 1
            com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.NotificationClientResult r12 = new com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.NotificationClientResult
            r6 = r12
            r11 = r2
            r6.<init>(r7, r8, r9, r10, r11)
            com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.ResultGroup r6 = new com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.ResultGroup
            com.google.common.b.gu r7 = com.google.common.p4522b.C58485gu.m89846n(r12)
            r8 = 1
            r6.<init>(r8, r7)
            r5.add(r6)
            r7 = r4
            goto L_0x0721
        L_0x0804:
            com.google.protobuf.cq r2 = r1.f145749b
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x08af
            com.google.protobuf.cq r2 = r1.f145749b
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            com.google.bb.a.oj r2 = (com.google.p4152bb.p4153a.C55330oj) r2
            com.google.protobuf.bt r3 = com.google.p4152bb.p4153a.C55322ob.f145743b
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)
            r2.mo58887l(r3)
            com.google.protobuf.bf r2 = r2.f169962ag
            com.google.protobuf.bs r3 = r3.f169971d
            boolean r2 = r2.mo58857o(r3)
            if (r2 == 0) goto L_0x08af
            com.google.protobuf.cq r2 = r1.f145749b
            r2.size()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.google.protobuf.cq r3 = r1.f145749b
            java.util.Iterator r3 = r3.iterator()
        L_0x0838:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0892
            java.lang.Object r4 = r3.next()
            com.google.bb.a.oj r4 = (com.google.p4152bb.p4153a.C55330oj) r4
            com.google.protobuf.cq r6 = r4.f145773c
            int r6 = r6.size()
            r7 = 1
            if (r6 != r7) goto L_0x0abe
            com.google.protobuf.cq r6 = r4.f145773c
            r7 = 0
            java.lang.Object r6 = r6.get(r7)
            com.google.bb.a.nx r6 = (com.google.p4152bb.p4153a.C55317nx) r6
            com.google.protobuf.bt r7 = com.google.p4152bb.p4153a.C55319nz.f145737d
            com.google.protobuf.bt r7 = com.google.protobuf.C62942bv.checkIsLite(r7)
            r6.mo58887l(r7)
            com.google.protobuf.bf r6 = r6.f169962ag
            com.google.protobuf.bs r7 = r7.f169971d
            boolean r6 = r6.mo58857o(r7)
            if (r6 != 0) goto L_0x086b
            goto L_0x0abe
        L_0x086b:
            com.google.protobuf.cq r6 = r4.f145774d
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x087d
            com.google.protobuf.cq r6 = r4.f145774d
            r7 = 0
            java.lang.Object r6 = r6.get(r7)
            com.google.bb.a.nl r6 = (com.google.p4152bb.p4153a.C55305nl) r6
            goto L_0x087f
        L_0x087d:
            r7 = 0
            r6 = 0
        L_0x087f:
            com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.ListResult r8 = new com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.ListResult
            int r9 = r4.f145772b
            com.google.protobuf.cq r4 = r4.f145773c
            java.lang.Object r4 = r4.get(r7)
            com.google.bb.a.nx r4 = (com.google.p4152bb.p4153a.C55317nx) r4
            r8.<init>(r9, r4, r6)
            r2.add(r8)
            goto L_0x0838
        L_0x0892:
            int r3 = r2.size()
            r11 = 0
        L_0x0897:
            if (r11 >= r3) goto L_0x0abe
            java.lang.Object r4 = r2.get(r11)
            com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.Result r4 = (com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.Result) r4
            com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.ResultGroup r6 = new com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.ResultGroup
            com.google.common.b.gu r4 = com.google.common.p4522b.C58485gu.m89846n(r4)
            r7 = 3
            r6.<init>(r7, r4)
            r5.add(r6)
            int r11 = r11 + 1
            goto L_0x0897
        L_0x08af:
            com.google.protobuf.cq r2 = r1.f145749b
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x0abe
            com.google.protobuf.cq r2 = r1.f145749b
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            com.google.bb.a.oj r2 = (com.google.p4152bb.p4153a.C55330oj) r2
            com.google.protobuf.bt r3 = com.google.p4152bb.p4153a.C55346oz.f145816h
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)
            r2.mo58887l(r3)
            com.google.protobuf.bf r2 = r2.f169962ag
            com.google.protobuf.bs r3 = r3.f169971d
            boolean r2 = r2.mo58857o(r3)
            if (r2 == 0) goto L_0x0abe
            com.google.protobuf.cq r2 = r1.f145749b
            java.util.Iterator r2 = r2.iterator()
        L_0x08d9:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0abe
            java.lang.Object r3 = r2.next()
            com.google.bb.a.oj r3 = (com.google.p4152bb.p4153a.C55330oj) r3
            com.google.protobuf.bt r4 = com.google.p4152bb.p4153a.C55346oz.f145816h
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r3.mo58887l(r4)
            com.google.protobuf.bf r6 = r3.f169962ag
            com.google.protobuf.bs r4 = r4.f169971d
            boolean r4 = r6.mo58857o(r4)
            if (r4 == 0) goto L_0x08d9
            com.google.protobuf.bt r4 = com.google.p4152bb.p4153a.C55346oz.f145816h
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r3.mo58887l(r4)
            com.google.protobuf.bf r6 = r3.f169962ag
            com.google.protobuf.bs r7 = r4.f169971d
            java.lang.Object r6 = r6.mo58854l(r7)
            if (r6 != 0) goto L_0x090e
            java.lang.Object r4 = r4.f169969b
            goto L_0x0912
        L_0x090e:
            java.lang.Object r4 = r4.mo58889c(r6)
        L_0x0912:
            r9 = r4
            com.google.bb.a.oz r9 = (com.google.p4152bb.p4153a.C55346oz) r9
            int r4 = r9.f145818a
            r6 = r4 & 1
            if (r6 == 0) goto L_0x08d9
            r6 = r4 & 2
            if (r6 == 0) goto L_0x08d9
            r6 = r4 & 4
            if (r6 == 0) goto L_0x08d9
            r6 = r4 & 8
            if (r6 == 0) goto L_0x08d9
            r4 = r4 & 16
            if (r4 == 0) goto L_0x08d9
            com.google.protobuf.cq r4 = r3.f145773c
            java.util.Iterator r4 = r4.iterator()
            r6 = 0
            r7 = 0
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x0936:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x0a5c
            java.lang.Object r8 = r4.next()
            com.google.bb.a.nx r8 = (com.google.p4152bb.p4153a.C55317nx) r8
            int r10 = r8.f145733a
            r14 = 1
            r10 = r10 & r14
            if (r10 == 0) goto L_0x0936
            com.google.protobuf.bt r10 = com.google.p4152bb.p4153a.C55342ov.f145807c
            com.google.protobuf.bt r10 = com.google.protobuf.C62942bv.checkIsLite(r10)
            r8.mo58887l(r10)
            com.google.protobuf.bf r14 = r8.f169962ag
            com.google.protobuf.bs r10 = r10.f169971d
            boolean r10 = r14.mo58857o(r10)
            if (r10 == 0) goto L_0x0936
            com.google.protobuf.bt r10 = com.google.p4152bb.p4153a.C55342ov.f145807c
            com.google.protobuf.bt r10 = com.google.protobuf.C62942bv.checkIsLite(r10)
            r8.mo58887l(r10)
            com.google.protobuf.bf r14 = r8.f169962ag
            com.google.protobuf.bs r15 = r10.f169971d
            java.lang.Object r14 = r14.mo58854l(r15)
            if (r14 != 0) goto L_0x0971
            java.lang.Object r10 = r10.f169969b
            goto L_0x0975
        L_0x0971:
            java.lang.Object r10 = r10.mo58889c(r14)
        L_0x0975:
            com.google.bb.a.ov r10 = (com.google.p4152bb.p4153a.C55342ov) r10
            com.google.protobuf.cq r10 = r10.f145809a
            int r10 = r10.size()
            if (r10 <= 0) goto L_0x0936
            int r10 = r8.f145734b
            int r14 = r9.f145819b
            if (r10 != r14) goto L_0x09ac
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            com.google.protobuf.bt r10 = com.google.p4152bb.p4153a.C55342ov.f145807c
            com.google.protobuf.bt r10 = com.google.protobuf.C62942bv.checkIsLite(r10)
            r8.mo58887l(r10)
            com.google.protobuf.bf r8 = r8.f169962ag
            com.google.protobuf.bs r14 = r10.f169971d
            java.lang.Object r8 = r8.mo58854l(r14)
            if (r8 != 0) goto L_0x09a0
            java.lang.Object r8 = r10.f169969b
            goto L_0x09a4
        L_0x09a0:
            java.lang.Object r8 = r10.mo58889c(r8)
        L_0x09a4:
            com.google.bb.a.ov r8 = (com.google.p4152bb.p4153a.C55342ov) r8
            com.google.protobuf.cq r8 = r8.f145809a
            r6.addAll(r8)
            goto L_0x0936
        L_0x09ac:
            int r14 = r9.f145820c
            if (r10 != r14) goto L_0x09d8
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            com.google.protobuf.bt r10 = com.google.p4152bb.p4153a.C55342ov.f145807c
            com.google.protobuf.bt r10 = com.google.protobuf.C62942bv.checkIsLite(r10)
            r8.mo58887l(r10)
            com.google.protobuf.bf r8 = r8.f169962ag
            com.google.protobuf.bs r14 = r10.f169971d
            java.lang.Object r8 = r8.mo58854l(r14)
            if (r8 != 0) goto L_0x09cb
            java.lang.Object r8 = r10.f169969b
            goto L_0x09cf
        L_0x09cb:
            java.lang.Object r8 = r10.mo58889c(r8)
        L_0x09cf:
            com.google.bb.a.ov r8 = (com.google.p4152bb.p4153a.C55342ov) r8
            com.google.protobuf.cq r8 = r8.f145809a
            r7.addAll(r8)
            goto L_0x0936
        L_0x09d8:
            int r14 = r9.f145821d
            if (r10 != r14) goto L_0x0a04
            com.google.protobuf.bt r10 = com.google.p4152bb.p4153a.C55342ov.f145807c
            com.google.protobuf.bt r10 = com.google.protobuf.C62942bv.checkIsLite(r10)
            r8.mo58887l(r10)
            com.google.protobuf.bf r8 = r8.f169962ag
            com.google.protobuf.bs r11 = r10.f169971d
            java.lang.Object r8 = r8.mo58854l(r11)
            if (r8 != 0) goto L_0x09f2
            java.lang.Object r8 = r10.f169969b
            goto L_0x09f6
        L_0x09f2:
            java.lang.Object r8 = r10.mo58889c(r8)
        L_0x09f6:
            com.google.bb.a.ov r8 = (com.google.p4152bb.p4153a.C55342ov) r8
            com.google.protobuf.cq r8 = r8.f145809a
            r10 = 0
            java.lang.Object r8 = r8.get(r10)
            r11 = r8
            java.lang.String r11 = (java.lang.String) r11
            goto L_0x0936
        L_0x0a04:
            int r14 = r9.f145822e
            if (r10 != r14) goto L_0x0a30
            com.google.protobuf.bt r10 = com.google.p4152bb.p4153a.C55342ov.f145807c
            com.google.protobuf.bt r10 = com.google.protobuf.C62942bv.checkIsLite(r10)
            r8.mo58887l(r10)
            com.google.protobuf.bf r8 = r8.f169962ag
            com.google.protobuf.bs r12 = r10.f169971d
            java.lang.Object r8 = r8.mo58854l(r12)
            if (r8 != 0) goto L_0x0a1e
            java.lang.Object r8 = r10.f169969b
            goto L_0x0a22
        L_0x0a1e:
            java.lang.Object r8 = r10.mo58889c(r8)
        L_0x0a22:
            com.google.bb.a.ov r8 = (com.google.p4152bb.p4153a.C55342ov) r8
            com.google.protobuf.cq r8 = r8.f145809a
            r10 = 0
            java.lang.Object r8 = r8.get(r10)
            r12 = r8
            java.lang.String r12 = (java.lang.String) r12
            goto L_0x0936
        L_0x0a30:
            int r14 = r9.f145823f
            if (r10 != r14) goto L_0x0936
            com.google.protobuf.bt r10 = com.google.p4152bb.p4153a.C55342ov.f145807c
            com.google.protobuf.bt r10 = com.google.protobuf.C62942bv.checkIsLite(r10)
            r8.mo58887l(r10)
            com.google.protobuf.bf r8 = r8.f169962ag
            com.google.protobuf.bs r13 = r10.f169971d
            java.lang.Object r8 = r8.mo58854l(r13)
            if (r8 != 0) goto L_0x0a4a
            java.lang.Object r8 = r10.f169969b
            goto L_0x0a4e
        L_0x0a4a:
            java.lang.Object r8 = r10.mo58889c(r8)
        L_0x0a4e:
            com.google.bb.a.ov r8 = (com.google.p4152bb.p4153a.C55342ov) r8
            com.google.protobuf.cq r8 = r8.f145809a
            r10 = 0
            java.lang.Object r8 = r8.get(r10)
            r13 = r8
            java.lang.String r13 = (java.lang.String) r13
            goto L_0x0936
        L_0x0a5c:
            if (r6 == 0) goto L_0x08d9
            if (r7 == 0) goto L_0x08d9
            int r4 = r6.size()
            int r8 = r7.size()
            if (r4 != r8) goto L_0x08d9
            if (r11 == 0) goto L_0x08d9
            if (r13 == 0) goto L_0x08d9
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r4 = 0
        L_0x0a74:
            int r8 = r6.size()
            if (r4 >= r8) goto L_0x0a91
            com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.ClockResult$TimeInfo r8 = new com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.ClockResult$TimeInfo
            java.lang.Object r14 = r6.get(r4)
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r15 = r7.get(r4)
            java.lang.String r15 = (java.lang.String) r15
            r8.<init>(r14, r15)
            r10.add(r8)
            int r4 = r4 + 1
            goto L_0x0a74
        L_0x0a91:
            com.google.protobuf.cq r4 = r3.f145774d
            int r4 = r4.size()
            r14 = 1
            if (r4 != r14) goto L_0x0aa5
            com.google.protobuf.cq r4 = r3.f145774d
            r15 = 0
            java.lang.Object r4 = r4.get(r15)
            com.google.bb.a.nl r4 = (com.google.p4152bb.p4153a.C55305nl) r4
            r8 = r4
            goto L_0x0aa7
        L_0x0aa5:
            r15 = 0
            r8 = 0
        L_0x0aa7:
            com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.ClockResult r4 = new com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.ClockResult
            int r7 = r3.f145772b
            r6 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.ResultGroup r3 = new com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.ResultGroup
            com.google.common.b.gu r4 = com.google.common.p4522b.C58485gu.m89846n(r4)
            r6 = 4
            r3.<init>(r6, r4)
            r5.add(r3)
            goto L_0x08d9
        L_0x0abe:
            r5.size()
            com.google.android.apps.gsa.staticplugins.actions.modularanswer.ModularAnswerImpl r2 = new com.google.android.apps.gsa.staticplugins.actions.modularanswer.ModularAnswerImpl
            r3 = r40
            r4 = r21
            r2.<init>(r1, r5, r4, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.actions.modularanswer.C93406a.mo87667a(com.google.bb.a.od, com.google.android.apps.gsa.shared.search.Query, boolean, com.google.bb.a.x):com.google.android.apps.gsa.search.shared.actions.core.ModularAnswer");
    }
}
