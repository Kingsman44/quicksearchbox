package com.google.android.apps.gsa.staticplugins.p7714cv.p7715a.p7716a;

import com.google.android.apps.gsa.shared.speech.C90532c;
import com.google.android.apps.gsa.shared.speech.C90602j;
import com.google.android.apps.gsa.shared.speech.C90607o;
import com.google.android.apps.gsa.shared.speech.p7139a.C90528t;
import com.google.android.apps.gsa.speech.p7269b.C92216a;
import com.google.android.apps.gsa.speech.p7269b.C92217b;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92252n;
import com.google.android.apps.gsa.speech.p7272e.p7275c.C92265b;
import com.google.android.apps.gsa.speech.p7298l.C92473f;
import com.google.android.apps.gsa.staticplugins.p7714cv.p7715a.C98713c;
import com.google.speech.recognizer.p5233a.C67458f;
import com.google.speech.recognizer.p5233a.C67463k;
import com.google.speech.recognizer.p5233a.C67464l;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.a.a.a */
/* compiled from: PG */
public class C98709a implements C92265b {

    /* renamed from: a */
    private final C98713c f275705a;

    /* renamed from: b */
    private final C92216a f275706b;

    public C98709a(C92252n nVar, C92216a aVar) {
        this.f275705a = new C98713c(nVar, aVar);
        this.f275706b = aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo86945a() {
    }

    /* renamed from: b */
    public final void mo86946b(C90528t tVar) {
        this.f275706b.mo70939a(tVar);
    }

    /* renamed from: c */
    public final void mo86947c(long j) {
        this.f275706b.mo70941c(new C90602j(1, j));
    }

    /* renamed from: d */
    public final void mo59864d() {
    }

    /* renamed from: f */
    public final void mo59865f(C67458f fVar) {
    }

    /* renamed from: g */
    public void mo59866g(C67464l lVar) {
        int i = lVar.f183359b;
        C67463k kVar = C67463k.START_OF_SPEECH;
        this.f275706b.mo70941c(new C90532c(lVar, new C90607o(1, (byte[]) null, lVar.f183360c / 1000)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        r0 = r3.f275711b;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59867h(com.google.speech.recognizer.p5233a.C67438ag r19) {
        /*
            r18 = this;
            r1 = r19
            int r0 = r1.f183259b
            r2 = r18
            com.google.android.apps.gsa.staticplugins.cv.a.c r3 = r2.f275705a
            com.google.android.apps.gsa.speech.e.b.n r0 = r3.f275711b
            com.google.android.apps.gsa.speech.e.b.n r4 = com.google.android.apps.gsa.speech.p7272e.p7274b.C92252n.DICTATION
            r5 = 0
            r6 = 1
            if (r0 == r4) goto L_0x0021
            com.google.android.apps.gsa.speech.e.b.n r0 = r3.f275711b
            com.google.android.apps.gsa.speech.e.b.n r4 = com.google.android.apps.gsa.speech.p7272e.p7274b.C92252n.VOICE_ACTIONS
            if (r0 == r4) goto L_0x0021
            com.google.android.apps.gsa.speech.e.b.n r4 = com.google.android.apps.gsa.speech.p7272e.p7274b.C92252n.HOTWORD
            if (r0 == r4) goto L_0x0021
            com.google.android.apps.gsa.speech.e.b.n r4 = com.google.android.apps.gsa.speech.p7272e.p7274b.C92252n.GRAMMAR
            if (r0 != r4) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            r0 = 0
            goto L_0x0022
        L_0x0021:
            r0 = 1
        L_0x0022:
            com.google.common.base.C58838bb.m90883r(r0)
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            int r0 = r1.f183258a
            r0 = r0 & r6
            java.lang.String r4 = "RecognitionEventProc"
            if (r0 == 0) goto L_0x0439
            int r0 = r1.f183260c
            com.google.speech.recognizer.a.ao r0 = com.google.speech.recognizer.p5233a.C67446ao.m97470a(r0)
            if (r0 != 0) goto L_0x0038
            com.google.speech.recognizer.a.ao r0 = com.google.speech.recognizer.p5233a.C67446ao.STATUS_SUCCESS
        L_0x0038:
            com.google.speech.recognizer.a.ao r7 = com.google.speech.recognizer.p5233a.C67446ao.STATUS_SUCCESS
            if (r0 == r7) goto L_0x004f
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.p7714cv.p7715a.C98713c.f275710a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r4)
            java.lang.String r1 = "Error from embedded recognizer."
            r3 = 30979(0x7903, float:4.3411E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r1)
            return
        L_0x004f:
            com.google.android.apps.gsa.speech.e.b.n r0 = r3.f275711b
            com.google.android.apps.gsa.speech.e.b.n r7 = com.google.android.apps.gsa.speech.p7272e.p7274b.C92252n.GRAMMAR
            r8 = 2
            if (r0 != r7) goto L_0x03be
            int r0 = r1.f183259b
            int r0 = com.google.speech.recognizer.p5233a.C67437af.m97466a(r0)
            if (r0 != 0) goto L_0x0060
            goto L_0x03bd
        L_0x0060:
            if (r0 != r8) goto L_0x03bd
            int r0 = r1.f183258a
            r0 = r0 & 4
            if (r0 == 0) goto L_0x034c
            com.google.speech.recognizer.a.ak r0 = r1.f183261d
            if (r0 != 0) goto L_0x006e
            com.google.speech.recognizer.a.ak r0 = com.google.speech.recognizer.p5233a.C67442ak.f183276i
        L_0x006e:
            com.google.protobuf.cq r9 = r0.f183281d
            int r9 = r9.size()
            if (r9 > 0) goto L_0x0078
            goto L_0x034c
        L_0x0078:
            r10 = 0
        L_0x0079:
            if (r10 >= r9) goto L_0x0341
            com.google.protobuf.cq r11 = r0.f183281d
            java.lang.Object r11 = r11.get(r10)
            com.google.speech.recognizer.a.p r11 = (com.google.speech.recognizer.p5233a.C67468p) r11
            int r12 = r11.f183366a
            r13 = 524288(0x80000, float:7.34684E-40)
            r12 = r12 & r13
            if (r12 == 0) goto L_0x033c
            com.google.speech.recognizer.a.am r0 = r11.f183371f
            if (r0 != 0) goto L_0x0090
            com.google.speech.recognizer.a.am r0 = com.google.speech.recognizer.p5233a.C67444am.f183287b
        L_0x0090:
            com.google.protobuf.cq r0 = r0.f183289a
            boolean r9 = r0.isEmpty()
            if (r9 != 0) goto L_0x034c
            java.lang.Object r9 = r0.get(r5)
            com.google.protos.ay.b.b r9 = (com.google.protos.p4934ay.p4937b.C64274b) r9
            com.google.protobuf.cq r9 = r9.f173792a
            int r9 = r9.size()
            if (r9 != 0) goto L_0x00a8
            goto L_0x034c
        L_0x00a8:
            java.lang.Object r0 = r0.get(r5)
            com.google.protos.ay.b.b r0 = (com.google.protos.p4934ay.p4937b.C64274b) r0
            com.google.protobuf.cq r0 = r0.f173792a
            java.lang.Object r0 = r0.get(r5)
            com.google.protos.ay.b.d r0 = (com.google.protos.p4934ay.p4937b.C64276d) r0
            int r9 = r0.f173796a
            r9 = r9 & r8
            if (r9 == 0) goto L_0x034c
            java.lang.String r9 = r0.f173797b
            java.lang.String r9 = r9.trim()
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 == 0) goto L_0x00c9
            goto L_0x034c
        L_0x00c9:
            java.lang.String r0 = r0.f173797b
            java.lang.String r0 = r0.trim()
            java.lang.String r9 = " "
            java.lang.String[] r9 = r0.split(r9)
            r0 = 0
        L_0x00d6:
            int r10 = r9.length
            if (r0 >= r10) goto L_0x034c
            r10 = r9[r0]
            if (r10 == 0) goto L_0x0337
            java.lang.String r11 = "_call"
            boolean r11 = r11.equals(r10)
            if (r11 == 0) goto L_0x02f0
            int r0 = r0 + r6
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r11 = 15
            r10.<init>(r11)
            r12 = 0
            r13 = r12
            r15 = -1
            r12 = r0
            r0 = 0
        L_0x00f3:
            int r7 = r9.length
            r11 = 3
            if (r12 >= r7) goto L_0x0169
            r7 = r9[r12]
            java.lang.String r5 = "XX_"
            boolean r5 = r7.startsWith(r5)
            if (r5 == 0) goto L_0x012c
            r0 = 95
            int r5 = r7.indexOf(r0, r11)
            int r5 = r5 + r6
            java.lang.String r5 = r7.substring(r5)
            r13 = 11
            byte[] r5 = android.util.Base64.decode(r5, r13)
            java.lang.String r13 = new java.lang.String
            r13.<init>(r5)
            int r0 = r7.indexOf(r0, r11)
            java.lang.String r0 = r7.substring(r11, r0)
            r5 = 80
            r11 = 46
            java.lang.String r0 = r0.replace(r5, r11)
            double r16 = java.lang.Double.parseDouble(r0)
            goto L_0x012f
        L_0x012c:
            r16 = r13
            r13 = r0
        L_0x012f:
            java.lang.String r0 = "_p"
            boolean r0 = r7.startsWith(r0)
            if (r0 == 0) goto L_0x0153
            java.lang.String r0 = r7.substring(r8)     // Catch:{ NumberFormatException -> 0x0140 }
            int r15 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0140 }
            goto L_0x0153
        L_0x0140:
            r0 = move-exception
            com.google.common.f.e r5 = com.google.android.apps.gsa.staticplugins.p7714cv.p7715a.C98713c.f275710a
            com.google.common.f.x r5 = r5.mo56225c()
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r11, r4)
            java.lang.String r11 = "Invalid semantic tag: %s"
            r14 = 30973(0x78fd, float:4.3402E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56382g(r0)).mo56372aa(r14)).mo56389s(r11, r7)
        L_0x0153:
            java.lang.String r0 = "_d"
            boolean r0 = r7.startsWith(r0)
            if (r0 == 0) goto L_0x0162
            java.lang.String r0 = r7.substring(r8)
            r10.append(r0)
        L_0x0162:
            int r12 = r12 + 1
            r0 = r13
            r13 = r16
            r5 = 0
            goto L_0x00f3
        L_0x0169:
            if (r0 == 0) goto L_0x0287
            com.google.bb.a.z r5 = com.google.p4152bb.p4153a.C55423z.f146231g
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.bb.a.y r5 = (com.google.p4152bb.p4153a.C55422y) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.bb.a.z r7 = (com.google.p4152bb.p4153a.C55423z) r7
            int r9 = r7.f146233a
            r9 = r9 | r6
            r7.f146233a = r9
            r7.f146234b = r0
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.bb.a.z r7 = (com.google.p4152bb.p4153a.C55423z) r7
            int r9 = r7.f146233a
            r9 = r9 | 4
            r7.f146233a = r9
            r7.f146238f = r0
            com.google.cm.d.a.f r7 = com.google.p4500cm.p4518d.p4519a.C58183f.f155559c
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.cm.d.a.e r7 = (com.google.p4500cm.p4518d.p4519a.C58182e) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r9 = r7.instance
            com.google.cm.d.a.f r9 = (com.google.p4500cm.p4518d.p4519a.C58183f) r9
            int r10 = r9.f155561a
            r10 = r10 | r6
            r9.f155561a = r10
            r9.f155562b = r13
            com.google.protobuf.bv r7 = r7.build()
            com.google.cm.d.a.f r7 = (com.google.p4500cm.p4518d.p4519a.C58183f) r7
            com.google.protobuf.bt r9 = com.google.p4500cm.p4518d.p4519a.C58184g.f155563a
            r5.mo58885m(r9, r7)
            com.google.common.f.e r7 = com.google.android.apps.gsa.staticplugins.p7714cv.p7715a.C98713c.f275710a
            com.google.common.f.x r7 = r7.mo56224b()
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r9, r4)
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            r4 = 30972(0x78fc, float:4.3401E-41)
            com.google.common.f.x r4 = r7.mo56372aa(r4)
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            int r7 = r0.length()
            java.lang.String r9 = "+"
            if (r7 <= r8) goto L_0x01ec
            r7 = 0
            java.lang.String r7 = r0.substring(r7, r8)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r7)
            r10.append(r9)
            int r0 = r0.length()
            int r0 = r0 + -2
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            goto L_0x01fc
        L_0x01ec:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r9)
            int r0 = r0.length()
            r7.append(r0)
            java.lang.String r0 = r7.toString()
        L_0x01fc:
            java.lang.String r7 = "n=%s, t=%d"
            r4.mo56352E(r7, r0, r15)
            r4 = -1
            if (r15 == r4) goto L_0x022f
            com.google.bb.a.al r0 = com.google.p4152bb.p4153a.C54954al.f144564d
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.bb.a.ak r0 = (com.google.p4152bb.p4153a.C54953ak) r0
            if (r15 != r6) goto L_0x0211
            java.lang.String r7 = "home"
            goto L_0x021c
        L_0x0211:
            if (r15 != r11) goto L_0x0216
            java.lang.String r7 = "work"
            goto L_0x021c
        L_0x0216:
            if (r15 != r8) goto L_0x021b
            java.lang.String r7 = "cell"
            goto L_0x021c
        L_0x021b:
            r7 = 0
        L_0x021c:
            if (r7 == 0) goto L_0x022c
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.bb.a.al r4 = (com.google.p4152bb.p4153a.C54954al) r4
            int r9 = r4.f144566a
            r8 = r8 | r9
            r4.f144566a = r8
            r4.f144568c = r7
        L_0x022c:
            r5.mo54257a(r0)
        L_0x022f:
            com.google.bb.a.bs r0 = com.google.p4152bb.p4153a.C54988bs.f144680b
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.bb.a.br r0 = (com.google.p4152bb.p4153a.C54987br) r0
            r0.mo54167a(r5)
            com.google.protobuf.bv r0 = r0.build()
            com.google.bb.a.bs r0 = (com.google.p4152bb.p4153a.C54988bs) r0
            com.google.bb.a.ad r4 = com.google.p4152bb.p4153a.C54946ad.f144531h
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.bb.a.ac r4 = (com.google.p4152bb.p4153a.C54945ac) r4
            com.google.bb.a.bg r5 = com.google.p4152bb.p4153a.C54976bg.f144641o
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.bb.a.bf r5 = (com.google.p4152bb.p4153a.C54975bf) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.bb.a.bg r7 = (com.google.p4152bb.p4153a.C54976bg) r7
            int r8 = r7.f144643a
            r8 = r8 | r6
            r7.f144643a = r8
            r7.f144644b = r6
            r4.copyOnWrite()
            com.google.protobuf.bv r7 = r4.instance
            com.google.bb.a.ad r7 = (com.google.p4152bb.p4153a.C54946ad) r7
            com.google.protobuf.bv r5 = r5.build()
            com.google.bb.a.bg r5 = (com.google.p4152bb.p4153a.C54976bg) r5
            r5.getClass()
            r7.f144537e = r5
            int r5 = r7.f144533a
            r5 = r5 | 32
            r7.f144533a = r5
            com.google.protobuf.bt r5 = com.google.p4152bb.p4153a.C54988bs.f144681c
            r4.mo58885m(r5, r0)
            com.google.protobuf.bv r0 = r4.build()
            com.google.bb.a.ad r0 = (com.google.p4152bb.p4153a.C54946ad) r0
            com.google.speech.h.ci r7 = com.google.android.apps.gsa.staticplugins.p7714cv.p7715a.C98713c.m163502c(r0)
            goto L_0x034d
        L_0x0287:
            int r0 = r10.length()
            if (r0 <= 0) goto L_0x034c
            java.lang.String r0 = r10.toString()
            com.google.bb.a.al r4 = com.google.p4152bb.p4153a.C54954al.f144564d
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.bb.a.ak r4 = (com.google.p4152bb.p4153a.C54953ak) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.bb.a.al r5 = (com.google.p4152bb.p4153a.C54954al) r5
            int r7 = r5.f144566a
            r7 = r7 | r6
            r5.f144566a = r7
            r5.f144567b = r0
            com.google.protobuf.bv r0 = r4.build()
            com.google.bb.a.al r0 = (com.google.p4152bb.p4153a.C54954al) r0
            com.google.bb.a.ad r4 = com.google.p4152bb.p4153a.C54946ad.f144531h
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.bb.a.ac r4 = (com.google.p4152bb.p4153a.C54945ac) r4
            com.google.protobuf.bt r5 = com.google.p4152bb.p4153a.C54988bs.f144681c
            com.google.bb.a.bs r7 = com.google.p4152bb.p4153a.C54988bs.f144680b
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.bb.a.br r7 = (com.google.p4152bb.p4153a.C54987br) r7
            com.google.bb.a.z r8 = com.google.p4152bb.p4153a.C55423z.f146231g
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.bb.a.y r8 = (com.google.p4152bb.p4153a.C55422y) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.bb.a.z r9 = (com.google.p4152bb.p4153a.C55423z) r9
            r0.getClass()
            r9.mo54258a()
            com.google.protobuf.cq r9 = r9.f146235c
            r9.add(r0)
            r7.mo54167a(r8)
            com.google.protobuf.bv r0 = r7.build()
            com.google.bb.a.bs r0 = (com.google.p4152bb.p4153a.C54988bs) r0
            r4.mo58885m(r5, r0)
            com.google.protobuf.bv r0 = r4.build()
            com.google.bb.a.ad r0 = (com.google.p4152bb.p4153a.C54946ad) r0
            com.google.speech.h.ci r7 = com.google.android.apps.gsa.staticplugins.p7714cv.p7715a.C98713c.m163502c(r0)
            goto L_0x034d
        L_0x02f0:
            java.lang.String r5 = "_cancel"
            boolean r5 = r5.equals(r10)
            if (r5 != 0) goto L_0x0332
            java.lang.String r5 = "_okay"
            boolean r5 = r5.equals(r10)
            if (r5 != 0) goto L_0x0332
            java.lang.String r5 = "_call_back"
            boolean r5 = r5.equals(r10)
            if (r5 != 0) goto L_0x0332
            java.lang.String r5 = "_respond"
            boolean r5 = r5.equals(r10)
            if (r5 != 0) goto L_0x0332
            java.lang.String r5 = "_hotword"
            boolean r5 = r5.equals(r10)
            if (r5 != 0) goto L_0x0332
            java.lang.String r5 = "_next"
            boolean r5 = r5.equals(r10)
            if (r5 != 0) goto L_0x0332
            java.lang.String r5 = "_select"
            boolean r5 = r10.startsWith(r5)
            if (r5 == 0) goto L_0x0329
            goto L_0x0332
        L_0x0329:
            java.lang.String r5 = "_other"
            boolean r5 = r5.equals(r10)
            if (r5 == 0) goto L_0x0337
            goto L_0x034c
        L_0x0332:
            com.google.speech.h.ci r7 = com.google.android.apps.gsa.staticplugins.p7714cv.p7715a.C98713c.m163501b(r19)
            goto L_0x034d
        L_0x0337:
            int r0 = r0 + 1
            r5 = 0
            goto L_0x00d6
        L_0x033c:
            int r10 = r10 + 1
            r5 = 0
            goto L_0x0079
        L_0x0341:
            com.google.protobuf.cq r0 = r0.f183281d
            r4 = 0
            java.lang.Object r0 = r0.get(r4)
            com.google.speech.recognizer.a.p r0 = (com.google.speech.recognizer.p5233a.C67468p) r0
            java.lang.String r0 = r0.f183367b
        L_0x034c:
            r7 = 0
        L_0x034d:
            if (r7 == 0) goto L_0x03b3
            com.google.android.apps.gsa.speech.b.a r0 = r3.f275712c
            com.google.protobuf.bn r4 = r19.toBuilder()
            com.google.speech.recognizer.a.aa r4 = (com.google.speech.recognizer.p5233a.C67432aa) r4
            com.google.speech.recognizer.a.ak r1 = r1.f183261d
            if (r1 != 0) goto L_0x035d
            com.google.speech.recognizer.a.ak r1 = com.google.speech.recognizer.p5233a.C67442ak.f183276i
        L_0x035d:
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.speech.recognizer.a.ag r5 = (com.google.speech.recognizer.p5233a.C67438ag) r5
            r1.getClass()
            r5.f183263f = r1
            int r1 = r5.f183258a
            r1 = r1 | 16
            r5.f183258a = r1
            com.google.protobuf.bv r1 = r4.build()
            com.google.speech.recognizer.a.ag r1 = (com.google.speech.recognizer.p5233a.C67438ag) r1
            com.google.speech.h.ci r1 = com.google.android.apps.gsa.staticplugins.p7714cv.p7715a.C98713c.m163501b(r1)
            com.google.android.apps.gsa.shared.speech.k r1 = com.google.android.apps.gsa.staticplugins.p7714cv.p7715a.C98713c.m163500a(r1)
            r0.mo70941c(r1)
            com.google.android.apps.gsa.speech.b.a r0 = r3.f275712c
            com.google.android.apps.gsa.shared.speech.k r1 = com.google.android.apps.gsa.staticplugins.p7714cv.p7715a.C98713c.m163500a(r7)
            r0.mo70941c(r1)
            com.google.android.apps.gsa.speech.b.a r0 = r3.f275712c
            com.google.speech.h.ci r1 = com.google.speech.p5208h.C66611ci.f181206g
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.speech.h.cf r1 = (com.google.speech.p5208h.C66608cf) r1
            com.google.speech.h.ch r3 = com.google.speech.p5208h.C66610ch.DONE_SUCCESS
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.speech.h.ci r4 = (com.google.speech.p5208h.C66611ci) r4
            int r3 = r3.f181205e
            r4.f181209b = r3
            int r3 = r4.f181208a
            r3 = r3 | r6
            r4.f181208a = r3
            com.google.protobuf.bv r1 = r1.build()
            com.google.speech.h.ci r1 = (com.google.speech.p5208h.C66611ci) r1
            com.google.android.apps.gsa.shared.speech.k r1 = com.google.android.apps.gsa.staticplugins.p7714cv.p7715a.C98713c.m163500a(r1)
            r0.mo70941c(r1)
            return
        L_0x03b3:
            com.google.android.apps.gsa.speech.b.a r0 = r3.f275712c
            com.google.android.apps.gsa.shared.speech.a.q r1 = new com.google.android.apps.gsa.shared.speech.a.q
            r1.<init>()
            r0.mo70939a(r1)
        L_0x03bd:
            return
        L_0x03be:
            com.google.android.apps.gsa.speech.e.b.n r4 = com.google.android.apps.gsa.speech.p7272e.p7274b.C92252n.DICTATION
            if (r0 == r4) goto L_0x03c7
            com.google.android.apps.gsa.staticplugins.cv.a.a r0 = r3.f275713d
            r0.mo91274b(r1)
        L_0x03c7:
            int r0 = r1.f183259b
            int r0 = com.google.speech.recognizer.p5233a.C67437af.m97466a(r0)
            if (r0 != 0) goto L_0x03d0
            goto L_0x042b
        L_0x03d0:
            if (r0 != r8) goto L_0x042b
            com.google.android.apps.gsa.staticplugins.cv.a.a r0 = r3.f275713d
            com.google.speech.recognizer.a.ag r0 = r0.mo91273a()
            if (r0 == 0) goto L_0x03e8
            com.google.android.apps.gsa.speech.b.a r1 = r3.f275712c
            com.google.speech.h.ci r0 = com.google.android.apps.gsa.staticplugins.p7714cv.p7715a.C98713c.m163501b(r0)
            com.google.android.apps.gsa.shared.speech.k r0 = com.google.android.apps.gsa.staticplugins.p7714cv.p7715a.C98713c.m163500a(r0)
            r1.mo70941c(r0)
            goto L_0x0401
        L_0x03e8:
            com.google.android.apps.gsa.speech.e.b.n r0 = r3.f275711b
            com.google.android.apps.gsa.speech.e.b.n r4 = com.google.android.apps.gsa.speech.p7272e.p7274b.C92252n.DICTATION
            if (r0 != r4) goto L_0x0401
            int r0 = r1.f183258a
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0401
            com.google.android.apps.gsa.speech.b.a r0 = r3.f275712c
            com.google.speech.h.ci r1 = com.google.android.apps.gsa.staticplugins.p7714cv.p7715a.C98713c.m163501b(r19)
            com.google.android.apps.gsa.shared.speech.k r1 = com.google.android.apps.gsa.staticplugins.p7714cv.p7715a.C98713c.m163500a(r1)
            r0.mo70941c(r1)
        L_0x0401:
            com.google.android.apps.gsa.speech.b.a r0 = r3.f275712c
            com.google.speech.h.ci r1 = com.google.speech.p5208h.C66611ci.f181206g
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.speech.h.cf r1 = (com.google.speech.p5208h.C66608cf) r1
            com.google.speech.h.ch r3 = com.google.speech.p5208h.C66610ch.DONE_SUCCESS
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.speech.h.ci r4 = (com.google.speech.p5208h.C66611ci) r4
            int r3 = r3.f181205e
            r4.f181209b = r3
            int r3 = r4.f181208a
            r3 = r3 | r6
            r4.f181208a = r3
            com.google.protobuf.bv r1 = r1.build()
            com.google.speech.h.ci r1 = (com.google.speech.p5208h.C66611ci) r1
            com.google.android.apps.gsa.shared.speech.k r1 = com.google.android.apps.gsa.staticplugins.p7714cv.p7715a.C98713c.m163500a(r1)
            r0.mo70941c(r1)
            return
        L_0x042b:
            com.google.android.apps.gsa.speech.b.a r0 = r3.f275712c
            com.google.speech.h.ci r1 = com.google.android.apps.gsa.staticplugins.p7714cv.p7715a.C98713c.m163501b(r19)
            com.google.android.apps.gsa.shared.speech.k r1 = com.google.android.apps.gsa.staticplugins.p7714cv.p7715a.C98713c.m163500a(r1)
            r0.mo70941c(r1)
            return
        L_0x0439:
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.p7714cv.p7715a.C98713c.f275710a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r4)
            java.lang.String r1 = "Received recognition event without type."
            r3 = 30980(0x7904, float:4.3412E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7714cv.p7715a.p7716a.C98709a.mo59867h(com.google.speech.recognizer.a.ag):void");
    }

    public C98709a(C92473f fVar, C92217b bVar) {
        this.f275705a = new C98713c(fVar.f258022j, bVar);
        this.f275706b = bVar;
    }
}
