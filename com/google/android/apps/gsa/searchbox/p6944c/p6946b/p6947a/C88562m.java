package com.google.android.apps.gsa.searchbox.p6944c.p6946b.p6947a;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.searchbox.p6944c.C88614r;
import com.google.android.apps.gsa.searchbox.p6944c.p6945a.C88543c;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.common.p4522b.C58485gu;
import com.google.protos.p4948ba.p4949a.C64369b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.searchbox.c.b.a.m */
/* compiled from: PG */
public final class C88562m implements C89200e {

    /* renamed from: b */
    private static final C58485gu f239361b = C58485gu.m89832B(Integer.valueOf(C64369b.SUBTYPE_ANSWER_DICTIONARY.f174585kE), Integer.valueOf(C64369b.SUBTYPE_ANSWER_FINANCE.f174585kE), Integer.valueOf(C64369b.SUBTYPE_ANSWER_GENERIC_ANSWER.f174585kE), Integer.valueOf(C64369b.SUBTYPE_ANSWER_SPORTS.f174585kE), Integer.valueOf(C64369b.SUBTYPE_ANSWER_SUNRISE_SUNSET.f174585kE), Integer.valueOf(C64369b.SUBTYPE_ANSWER_TRANSLATION.f174585kE), Integer.valueOf(C64369b.SUBTYPE_ANSWER_WEATHER.f174585kE), Integer.valueOf(C64369b.SUBTYPE_ANSWER_WHEN_IS.f174585kE), Integer.valueOf(C64369b.SUBTYPE_ANSWER_CURRENCY.f174585kE), Integer.valueOf(C64369b.SUBTYPE_ANSWER_LOCAL_TIME.f174585kE));

    /* renamed from: a */
    final List f239362a = new ArrayList();

    /* renamed from: c */
    private final Context f239363c;

    /* renamed from: d */
    private final C86124t f239364d;

    /* renamed from: e */
    private List f239365e;

    /* renamed from: f */
    private C88543c f239366f;

    public C88562m(Context context, C86124t tVar) {
        this.f239363c = context;
        this.f239364d = tVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:86:0x021e, code lost:
        if (r12.f142299j == false) goto L_0x0221;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x021a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.libraries.searchbox.root.C41626a mo82232a(com.google.p4017at.p4060h.p4073d.p4074a.C54229ar r28, boolean r29) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            java.util.List r2 = r0.f239362a
            r2.clear()
            com.google.protobuf.cq r2 = r1.f142355b
            java.lang.Integer r3 = com.google.android.libraries.searchbox.shared.suggestion.C41669ai.f108954c
            int r3 = r3.intValue()
            com.google.common.b.gp r4 = new com.google.common.b.gp
            r5 = 4
            r4.<init>(r5)
            r6 = 1500(0x5dc, float:2.102E-42)
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x001c:
            int r11 = r2.size()
            if (r8 >= r11) goto L_0x02ab
            java.lang.Object r11 = r2.get(r8)
            com.google.at.h.d.a.aq r11 = (com.google.p4017at.p4060h.p4073d.p4074a.C54228aq) r11
            com.google.common.b.gp r12 = new com.google.common.b.gp
            r12.<init>(r5)
            com.google.protobuf.cj r13 = new com.google.protobuf.cj
            com.google.protobuf.ch r14 = r11.f142333d
            com.google.protobuf.ci r15 = com.google.p4017at.p4060h.p4073d.p4074a.C54228aq.f142327e
            r13.<init>(r14, r15)
            java.util.Iterator r13 = r13.iterator()
        L_0x003a:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x0050
            java.lang.Object r14 = r13.next()
            com.google.protos.ba.a.b r14 = (com.google.protos.p4948ba.p4949a.C64369b) r14
            int r14 = r14.f174585kE
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r12.mo55395g(r14)
            goto L_0x003a
        L_0x0050:
            com.google.common.b.gu r15 = r12.mo55394f()
            com.google.android.libraries.searchbox.shared.suggestion.q r12 = com.google.android.libraries.searchbox.shared.suggestion.C41691q.f109047e
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.android.libraries.searchbox.shared.suggestion.p r12 = (com.google.android.libraries.searchbox.shared.suggestion.C41690p) r12
            com.google.android.libraries.searchbox.shared.suggestion.s r13 = com.google.android.libraries.searchbox.shared.suggestion.C41693s.f109053h
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.android.libraries.searchbox.shared.suggestion.r r13 = (com.google.android.libraries.searchbox.shared.suggestion.C41692r) r13
            com.google.at.h.d.a.ae r14 = r11.f142334f
            if (r14 != 0) goto L_0x006a
            com.google.at.h.d.a.ae r14 = com.google.p4017at.p4060h.p4073d.p4074a.C54216ae.f142285C
        L_0x006a:
            int r14 = r14.f142290a
            r22 = 1
            r14 = r14 & 1
            if (r14 == 0) goto L_0x007d
            com.google.at.h.d.a.ae r6 = r11.f142334f
            if (r6 != 0) goto L_0x0078
            com.google.at.h.d.a.ae r6 = com.google.p4017at.p4060h.p4073d.p4074a.C54216ae.f142285C
        L_0x0078:
            r14 = r8
            double r7 = r6.f142291b
            int r6 = (int) r7
            goto L_0x007e
        L_0x007d:
            r14 = r8
        L_0x007e:
            r19 = r6
            int r6 = r19 + -1
            int r7 = r11.f142332c
            int r7 = com.google.protos.p4948ba.p4949a.C64371d.m96393a(r7)
            if (r7 != 0) goto L_0x008b
            r7 = 1
        L_0x008b:
            int r7 = r7 + -1
            java.lang.String r8 = r11.f142331b
            java.lang.String r8 = com.google.android.apps.gsa.shared.p6990an.C89235z.m145148t(r8)
            com.google.at.h.d.a.f r5 = r11.f142343o
            if (r5 != 0) goto L_0x0099
            com.google.at.h.d.a.f r5 = com.google.p4017at.p4060h.p4073d.p4074a.C54242f.f142415f
        L_0x0099:
            int r5 = r5.f142417a
            r16 = 4
            r5 = r5 & 4
            if (r5 == 0) goto L_0x012b
            com.google.at.h.d.a.f r5 = r11.f142343o
            if (r5 != 0) goto L_0x00a7
            com.google.at.h.d.a.f r5 = com.google.p4017at.p4060h.p4073d.p4074a.C54242f.f142415f
        L_0x00a7:
            java.lang.String r5 = r5.f142420d
            if (r5 != 0) goto L_0x00ad
            goto L_0x012b
        L_0x00ad:
            android.net.Uri r5 = android.net.Uri.parse(r5)
            r24 = r2
            android.content.Context r2 = r0.f239363c
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            android.content.Intent r2 = com.google.android.apps.gsa.shared.util.p7157a.C90716a.m148156a(r5, r2)
            if (r2 == 0) goto L_0x012d
            android.content.Context r5 = r0.f239363c
            r25 = r3
            r3 = 0
            boolean r5 = com.google.android.apps.gsa.shared.util.C90722af.m148175c(r5, r2, r3)
            if (r5 == 0) goto L_0x012f
            java.lang.String r3 = r2.getPackage()
            java.lang.String r5 = r2.getAction()
            r13.copyOnWrite()
            r26 = r6
            com.google.protobuf.bv r6 = r13.instance
            com.google.android.libraries.searchbox.shared.suggestion.s r6 = (com.google.android.libraries.searchbox.shared.suggestion.C41693s) r6
            r5.getClass()
            int r1 = r6.f109055a
            r1 = r1 | 1
            r6.f109055a = r1
            r6.f109056b = r5
            r13.copyOnWrite()
            com.google.protobuf.bv r1 = r13.instance
            com.google.android.libraries.searchbox.shared.suggestion.s r1 = (com.google.android.libraries.searchbox.shared.suggestion.C41693s) r1
            r3.getClass()
            int r5 = r1.f109055a
            r5 = r5 | 8
            r1.f109055a = r5
            r1.f109059e = r3
            r12.copyOnWrite()
            com.google.protobuf.bv r1 = r12.instance
            com.google.android.libraries.searchbox.shared.suggestion.q r1 = (com.google.android.libraries.searchbox.shared.suggestion.C41691q) r1
            r3.getClass()
            int r5 = r1.f109049a
            r5 = r5 | 2
            r1.f109049a = r5
            r1.f109051c = r3
            android.net.Uri r1 = r2.getData()
            if (r1 == 0) goto L_0x0131
            android.net.Uri r1 = r2.getData()
            java.lang.String r1 = r1.toString()
            r13.copyOnWrite()
            com.google.protobuf.bv r2 = r13.instance
            com.google.android.libraries.searchbox.shared.suggestion.s r2 = (com.google.android.libraries.searchbox.shared.suggestion.C41693s) r2
            r1.getClass()
            int r3 = r2.f109055a
            r3 = r3 | 2
            r2.f109055a = r3
            r2.f109057c = r1
            goto L_0x0131
        L_0x012b:
            r24 = r2
        L_0x012d:
            r25 = r3
        L_0x012f:
            r26 = r6
        L_0x0131:
            com.google.at.h.d.a.ae r1 = r11.f142334f
            if (r1 != 0) goto L_0x0138
            com.google.at.h.d.a.ae r2 = com.google.p4017at.p4060h.p4073d.p4074a.C54216ae.f142285C
            goto L_0x0139
        L_0x0138:
            r2 = r1
        L_0x0139:
            int r2 = r2.f142290a
            r2 = r2 & 32
            if (r2 == 0) goto L_0x0148
            if (r1 != 0) goto L_0x0143
            com.google.at.h.d.a.ae r1 = com.google.p4017at.p4060h.p4073d.p4074a.C54216ae.f142285C
        L_0x0143:
            int r1 = r1.f142296g
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x014a
        L_0x0148:
            r1 = r25
        L_0x014a:
            r2 = 50
            if (r7 != r2) goto L_0x0156
            java.lang.Integer r1 = com.google.android.libraries.searchbox.shared.suggestion.C41669ai.f108955d
            int r1 = r1.intValue()
            r7 = 50
        L_0x0156:
            if (r9 != 0) goto L_0x0172
            com.google.protos.ba.a.b r2 = com.google.protos.p4948ba.p4949a.C64369b.SUBTYPE_TRENDS_RERANK
            int r2 = r2.f174585kE
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r15.contains(r2)
            if (r2 == 0) goto L_0x0172
            java.util.List r2 = r0.f239362a
            r3 = 14
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.add(r3)
            r9 = 1
        L_0x0172:
            if (r14 != 0) goto L_0x01ad
            com.google.android.apps.gsa.search.core.i.t r2 = r0.f239364d
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90085ej.f250176b
            boolean r2 = r2.mo79746e(r3)
            if (r2 == 0) goto L_0x01aa
            r2 = 0
            com.google.common.b.sm r3 = r15.listIterator(r2)
        L_0x0183:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x01aa
            java.lang.Object r2 = r3.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            com.google.common.b.gu r5 = f239361b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r5.contains(r2)
            if (r2 == 0) goto L_0x0183
            java.util.List r2 = r0.f239362a
            r5 = 4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r2.add(r3)
            goto L_0x01ab
        L_0x01aa:
            r5 = 4
        L_0x01ab:
            r2 = 0
            goto L_0x01af
        L_0x01ad:
            r5 = 4
            r2 = r14
        L_0x01af:
            if (r10 != 0) goto L_0x01ca
            int r3 = r11.f142330a
            r3 = r3 & r5
            if (r3 == 0) goto L_0x01ca
            com.google.at.h.d.a.ae r3 = r11.f142334f
            if (r3 != 0) goto L_0x01bc
            com.google.at.h.d.a.ae r3 = com.google.p4017at.p4060h.p4073d.p4074a.C54216ae.f142285C
        L_0x01bc:
            int r3 = r3.f142290a
            r5 = 32768(0x8000, float:4.5918E-41)
            r3 = r3 & r5
            if (r3 == 0) goto L_0x01ca
            com.google.android.apps.gsa.searchbox.c.a.c r3 = r0.f239366f
            r3.mo82175A()
            r10 = 1
        L_0x01ca:
            com.google.android.libraries.searchbox.shared.suggestion.e r3 = com.google.android.libraries.searchbox.shared.suggestion.C41679e.f109005p
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.libraries.searchbox.shared.suggestion.d r3 = (com.google.android.libraries.searchbox.shared.suggestion.C41678d) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.android.libraries.searchbox.shared.suggestion.e r5 = (com.google.android.libraries.searchbox.shared.suggestion.C41679e) r5
            com.google.protobuf.bv r6 = r12.build()
            com.google.android.libraries.searchbox.shared.suggestion.q r6 = (com.google.android.libraries.searchbox.shared.suggestion.C41691q) r6
            r6.getClass()
            r5.f109012f = r6
            int r6 = r5.f109007a
            r6 = r6 | 32
            r5.f109007a = r6
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.android.libraries.searchbox.shared.suggestion.e r5 = (com.google.android.libraries.searchbox.shared.suggestion.C41679e) r5
            com.google.protobuf.bv r6 = r13.build()
            com.google.android.libraries.searchbox.shared.suggestion.s r6 = (com.google.android.libraries.searchbox.shared.suggestion.C41693s) r6
            r6.getClass()
            r5.f109009c = r6
            int r6 = r5.f109007a
            r23 = 4
            r6 = r6 | 4
            r5.f109007a = r6
            com.google.protobuf.bv r3 = r3.build()
            com.google.android.libraries.searchbox.shared.suggestion.e r3 = (com.google.android.libraries.searchbox.shared.suggestion.C41679e) r3
            com.google.android.libraries.searchbox.root.RootSuggestion r5 = new com.google.android.libraries.searchbox.root.RootSuggestion
            java.lang.String r6 = ""
            if (r11 == 0) goto L_0x0221
            int r12 = r11.f142330a
            r12 = r12 & 4
            if (r12 == 0) goto L_0x0221
            com.google.at.h.d.a.ae r12 = r11.f142334f
            if (r12 != 0) goto L_0x021c
            com.google.at.h.d.a.ae r12 = com.google.p4017at.p4060h.p4073d.p4074a.C54216ae.f142285C
        L_0x021c:
            boolean r12 = r12.f142299j
            if (r12 == 0) goto L_0x0221
            goto L_0x022b
        L_0x0221:
            boolean r12 = com.google.android.apps.gsa.shared.p6990an.C89235z.m145154z(r3)
            if (r12 == 0) goto L_0x022e
            java.lang.String r6 = com.google.android.apps.gsa.shared.p6990an.C89235z.m145141m(r8, r3)
        L_0x022b:
            r17 = r6
            goto L_0x0289
        L_0x022e:
            r12 = 5
            if (r7 == r12) goto L_0x0242
            r12 = 111(0x6f, float:1.56E-43)
            if (r7 == r12) goto L_0x0242
            r12 = 83
            if (r7 == r12) goto L_0x0242
            r12 = 136(0x88, float:1.9E-43)
            if (r7 != r12) goto L_0x0240
            r7 = 136(0x88, float:1.9E-43)
            goto L_0x0243
        L_0x0240:
            r12 = r7
            goto L_0x0278
        L_0x0242:
            r12 = r7
        L_0x0243:
            r13 = 0
            if (r11 == 0) goto L_0x0260
            int r14 = r11.f142330a
            r14 = r14 & 32
            if (r14 == 0) goto L_0x0260
            com.google.at.h.d.a.n r14 = r11.f142337i
            if (r14 != 0) goto L_0x0252
            com.google.at.h.d.a.n r14 = com.google.p4017at.p4060h.p4073d.p4074a.C54250n.f142445d
        L_0x0252:
            int r14 = r14.f142447a
            r14 = r14 & 1
            if (r14 == 0) goto L_0x0260
            com.google.at.h.d.a.n r13 = r11.f142337i
            if (r13 != 0) goto L_0x025e
            com.google.at.h.d.a.n r13 = com.google.p4017at.p4060h.p4073d.p4074a.C54250n.f142445d
        L_0x025e:
            java.lang.String r13 = r13.f142448b
        L_0x0260:
            boolean r14 = android.text.TextUtils.isEmpty(r13)
            if (r14 != 0) goto L_0x0278
            java.lang.String r6 = com.google.android.apps.gsa.shared.p6990an.C89235z.m73095O(r13)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = "android.intent.action.VIEW#"
            java.lang.String r6 = r7.concat(r6)
        L_0x0274:
            r17 = r6
            r7 = r12
            goto L_0x0289
        L_0x0278:
            if (r7 == 0) goto L_0x0282
            r13 = 35
            if (r7 == r13) goto L_0x0282
            r13 = 33
            if (r7 != r13) goto L_0x0274
        L_0x0282:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.String r6 = r8.toLowerCase(r6)
            goto L_0x0274
        L_0x0289:
            r14 = 1
            java.lang.Integer r18 = java.lang.Integer.valueOf(r1)
            r12 = r5
            r13 = r8
            r1 = r15
            r15 = r7
            r16 = r1
            r20 = r11
            r21 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r4.mo55395g(r5)
            int r8 = r2 + 1
            r1 = r28
            r2 = r24
            r3 = r25
            r6 = r26
            r5 = 4
            goto L_0x001c
        L_0x02ab:
            com.google.common.b.gu r12 = r4.mo55394f()
            r1 = r28
            com.google.at.h.d.a.at r1 = r1.f142356c
            if (r1 != 0) goto L_0x02b7
            com.google.at.h.d.a.at r1 = com.google.p4017at.p4060h.p4073d.p4074a.C54231at.f142359r
        L_0x02b7:
            com.google.protobuf.cq r2 = r1.f142372l
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x02c4
            com.google.android.apps.gsa.searchbox.c.a.c r2 = r0.f239366f
            r2.mo82176B()
        L_0x02c4:
            java.util.List r2 = r0.f239362a
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.util.List r3 = r0.f239365e
            com.google.common.b.gu r3 = (com.google.common.p4522b.C58485gu) r3
            r4 = 0
            com.google.common.b.sm r3 = r3.listIterator(r4)
        L_0x02d4:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x02e4
            java.lang.Object r4 = r3.next()
            com.google.android.apps.gsa.searchbox.c.b.a.q r4 = (com.google.android.apps.gsa.searchbox.p6944c.p6946b.p6947a.C88566q) r4
            r4.mo82239a(r1)
            goto L_0x02d4
        L_0x02e4:
            java.lang.String r3 = "gsa::aa"
            r4 = r29
            r13.putBoolean(r3, r4)
            java.util.Iterator r2 = r2.iterator()
        L_0x02ef:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0303
            java.lang.Object r3 = r2.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            com.google.android.libraries.searchbox.shared.response.C41654i.m73050a(r13, r3)
            goto L_0x02ef
        L_0x0303:
            com.google.android.libraries.searchbox.root.a r2 = new com.google.android.libraries.searchbox.root.a
            r14 = 1
            r15 = 0
            r11 = r2
            r16 = r1
            r11.<init>(r12, r13, r14, r15, r16)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchbox.p6944c.p6946b.p6947a.C88562m.mo82232a(com.google.at.h.d.a.ar, boolean):com.google.android.libraries.searchbox.root.a");
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo82185d(Object obj) {
        C88614r rVar = (C88614r) obj;
        this.f239365e = rVar.f239549t;
        this.f239366f = rVar.f239530a;
    }
}
