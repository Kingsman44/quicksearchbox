package com.google.android.libraries.lens.view.feedback;

import com.google.android.libraries.lens.view.connectivity.LensConnectivityManager;
import com.google.android.libraries.lens.view.filters.p2101e.C25989d;
import com.google.android.libraries.lens.view.p2096f.C25799b;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.android.libraries.lens.view.p2161r.C27655b;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.libraries.lens.view.feedback.t */
/* compiled from: PG */
public final class C25830t {

    /* renamed from: a */
    public static final /* synthetic */ int f70179a = 0;

    /* renamed from: b */
    private static final C58974d f70180b = C58974d.m91135i("FeedbackReportHandler");

    /* renamed from: c */
    private final C27232l f70181c;

    /* renamed from: d */
    private final C25989d f70182d;

    /* renamed from: e */
    private final C27655b f70183e;

    /* renamed from: f */
    private final C25799b f70184f;

    /* renamed from: g */
    private final LensConnectivityManager f70185g;

    /* renamed from: h */
    private final C25836z f70186h;

    public C25830t(C27232l lVar, C25989d dVar, C25836z zVar, C27655b bVar, C25799b bVar2, LensConnectivityManager lensConnectivityManager) {
        this.f70181c = lVar;
        this.f70182d = dVar;
        this.f70186h = zVar;
        this.f70183e = bVar;
        this.f70184f = bVar2;
        this.f70185g = lensConnectivityManager;
    }

    /* JADX WARNING: type inference failed for: r0v107, types: [com.google.protobuf.bv] */
    /* JADX WARNING: type inference failed for: r0v120, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0457  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x045b A[SYNTHETIC, Splitter:B:106:0x045b] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x04de  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x04ed  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x04f0  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x050c  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x03d5 A[SYNTHETIC, Splitter:B:84:0x03d5] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0402 A[SYNTHETIC, Splitter:B:90:0x0402] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x042f A[SYNTHETIC, Splitter:B:96:0x042f] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30979a(java.lang.String r41, com.google.android.libraries.lens.view.feedback.C25829s r42) {
        /*
            r40 = this;
            r1 = r40
            r0 = r41
            java.lang.String r2 = ","
            com.google.common.f.a.d r3 = f70180b
            com.google.common.f.x r3 = r3.mo56224b()
            com.google.common.f.a.a r3 = (com.google.common.p4526f.p4527a.C58970a) r3
            r4 = 49348(0xc0c4, float:6.9151E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r4)
            com.google.common.f.a.a r3 = (com.google.common.p4526f.p4527a.C58970a) r3
            com.google.android.libraries.lens.view.l.l r4 = r1.f70181c
            com.google.common.base.ax r4 = r4.mo32701h()
            java.lang.Object r4 = r4.mo56111f()
            java.lang.String r5 = "Request feedback from entry point %s [%s]: screenshot %s"
            r6 = 0
            r3.mo56359L(r5, r0, r4, r6)
            java.lang.String r3 = "ae-action://send_feedback"
            android.net.Uri r3 = android.net.Uri.parse(r3)
            android.net.Uri$Builder r3 = r3.buildUpon()
            java.lang.String r4 = "ep"
            android.net.Uri$Builder r0 = r3.appendQueryParameter(r4, r0)
            com.google.android.libraries.lens.view.l.l r3 = r1.f70181c
            com.google.common.base.ax r3 = r3.mo32701h()
            java.lang.String r5 = "UNKNOWN"
            java.lang.Object r3 = r3.mo56109e(r5)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r5 = "cp"
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r5, r3)
            com.google.android.libraries.lens.view.l.l r3 = r1.f70181c
            int r3 = r3.mo32694a()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r7 = "it"
            r0.appendQueryParameter(r7, r3)
            android.net.Uri r3 = r0.build()
            com.google.android.libraries.lens.view.filters.e.d r0 = r1.f70182d
            com.google.android.libraries.lens.view.filters.e.i r0 = r0.f70642a
            com.google.android.libraries.lens.view.filters.e.a.d r0 = r0.f70649b
            java.lang.String r8 = r0.toString()
            com.google.android.libraries.lens.view.filters.e.d r0 = r1.f70182d
            com.google.bp.f.b.a.cg r9 = r0.f70643b
            com.google.android.libraries.lens.view.f.b r0 = r1.f70184f
            r10 = 1
            com.google.android.libraries.lens.view.r.e r11 = com.google.android.libraries.lens.view.p2161r.C27658e.m51456a(r0, r10)
            com.google.android.libraries.lens.view.r.b r0 = r1.f70183e
            r0.mo30427c(r11)
            com.google.android.libraries.lens.view.feedback.z r12 = r1.f70186h
            com.google.common.base.ax r0 = r42.mo30963d()
            r13 = 0
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r13)
            java.lang.Object r0 = r0.mo56109e(r14)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r10 == r0) goto L_0x0092
            java.lang.String r0 = "OFF"
            goto L_0x0094
        L_0x0092:
            java.lang.String r0 = "ON"
        L_0x0094:
            r14 = r0
            com.google.common.base.ax r0 = r42.mo30970i()
            boolean r15 = r0.mo56113h()
            r6 = 4
            if (r15 == 0) goto L_0x00eb
            java.util.Locale r15 = java.util.Locale.US
            java.lang.Object[] r10 = new java.lang.Object[r6]
            java.lang.Object r17 = r0.mo56107c()
            r6 = r17
            android.graphics.RectF r6 = (android.graphics.RectF) r6
            float r6 = r6.left
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            r10[r13] = r6
            java.lang.Object r6 = r0.mo56107c()
            android.graphics.RectF r6 = (android.graphics.RectF) r6
            float r6 = r6.top
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            r17 = 1
            r10[r17] = r6
            java.lang.Object r6 = r0.mo56107c()
            android.graphics.RectF r6 = (android.graphics.RectF) r6
            float r6 = r6.right
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            r16 = 2
            r10[r16] = r6
            java.lang.Object r0 = r0.mo56107c()
            android.graphics.RectF r0 = (android.graphics.RectF) r0
            float r0 = r0.bottom
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r6 = 3
            r10[r6] = r0
            java.lang.String r0 = "{%.2f, %.2f, %.2f, %.2f}"
            java.lang.String r0 = java.lang.String.format(r15, r0, r10)
            r6 = r0
            goto L_0x00ec
        L_0x00eb:
            r6 = 0
        L_0x00ec:
            com.google.common.base.ax r0 = r42.mo30966f()
            java.lang.Object r0 = r0.mo56111f()
            r10 = r0
            com.google.android.libraries.lens.e.y r10 = (com.google.android.libraries.lens.p2014e.C24233y) r10
            com.google.common.base.ax r0 = r42.mo30967g()
            java.lang.Object r0 = r0.mo56111f()
            r15 = r0
            java.lang.String r15 = (java.lang.String) r15
            com.google.common.base.ax r0 = r42.mo30962c()
            com.google.android.libraries.lens.view.feedback.o r13 = com.google.android.libraries.lens.view.feedback.C25825o.f70177a
            com.google.common.base.ax r0 = r0.mo56106b(r13)
            java.lang.Object r0 = r0.mo56111f()
            r13 = r0
            android.graphics.Bitmap r13 = (android.graphics.Bitmap) r13
            com.google.common.base.ax r0 = r42.mo30961b()
            java.lang.Object r0 = r0.mo56111f()
            r18 = r10
            r10 = r0
            com.google.at.g.a.a.r r10 = (com.google.p4017at.p4056g.p4057a.p4058a.C54066r) r10
            com.google.common.base.ax r0 = r42.mo30971j()
            java.lang.Object r0 = r0.mo56111f()
            r19 = r10
            r10 = r0
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
            com.google.common.base.ax r0 = r42.mo30962c()
            r20 = r9
            com.google.android.libraries.lens.view.feedback.p r9 = com.google.android.libraries.lens.view.feedback.C25826p.f70178a
            com.google.common.base.ax r0 = r0.mo56106b(r9)
            java.lang.Object r0 = r0.mo56111f()
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9
            com.google.common.base.ax r0 = r42.mo30968h()
            java.lang.Object r0 = r0.mo56111f()
            r21 = r0
            com.google.android.libraries.lens.view.au.n r21 = (com.google.android.libraries.lens.view.p2081au.C25564n) r21
            r22 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = ""
            r11.mo33145b(r2, r0)     // Catch:{ IOException -> 0x015f }
            r23 = r6
            r25 = r14
            r24 = r15
            goto L_0x0174
        L_0x015f:
            r0 = move-exception
            com.google.common.f.a.d r23 = com.google.android.libraries.lens.view.p2161r.C27658e.f75513a
            r24 = r15
            com.google.common.f.x r15 = r23.mo56225c()
            r23 = r6
            java.lang.String r6 = "Unable to write dump()"
            r25 = r14
            r14 = 49334(0xc0b6, float:6.9132E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r15).mo56382g(r0)).mo56372aa(r14)).mo56386p(r6)
        L_0x0174:
            java.lang.String r0 = r2.toString()
            java.util.Map r2 = r11.f75515b
            com.google.common.b.hd r2 = com.google.common.p4522b.C58495hd.m89898l(r2)
            com.google.android.libraries.lens.view.connectivity.LensConnectivityManager r6 = r1.f70185g
            boolean r6 = r6.mo30907k()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            com.google.common.base.ax r11 = r42.mo30964e()
            java.lang.Object r11 = r11.mo56111f()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            com.google.apps.tiktok.monitoring.feedback.k r14 = com.google.apps.tiktok.monitoring.feedback.C47475l.m84477g()
            r15 = 1
            r14.mo51310d(r15)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            if (r13 == 0) goto L_0x01a4
            r15.add(r13)
        L_0x01a4:
            if (r10 == 0) goto L_0x01a9
            r15.add(r10)
        L_0x01a9:
            boolean r10 = r15.isEmpty()
            if (r10 == 0) goto L_0x01c2
            r35 = r2
            r38 = r5
            r33 = r6
            r37 = r7
            r36 = r8
            r39 = r9
            r42 = r11
            r26 = r13
            r1 = 0
            goto L_0x02b3
        L_0x01c2:
            int r10 = r15.size()
            r1 = 1
            if (r10 != r1) goto L_0x01e6
            r1 = 0
            java.lang.Object r10 = r15.get(r1)
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
            android.graphics.Bitmap r1 = com.google.android.libraries.lens.view.feedback.C25809ab.m47620a(r10)
            r35 = r2
            r38 = r5
            r33 = r6
            r37 = r7
            r36 = r8
            r39 = r9
            r42 = r11
            r26 = r13
            goto L_0x02b3
        L_0x01e6:
            java.util.Iterator r1 = r15.iterator()
            r26 = r13
            r10 = 0
            r13 = 0
        L_0x01ee:
            boolean r27 = r1.hasNext()
            if (r27 == 0) goto L_0x0212
            java.lang.Object r27 = r1.next()
            android.graphics.Bitmap r27 = (android.graphics.Bitmap) r27
            int r28 = r27.getWidth()
            r42 = r1
            r16 = 2
            int r1 = r28 + 2
            int r10 = java.lang.Math.max(r10, r1)
            int r1 = r27.getHeight()
            int r1 = r1 + 2
            int r13 = r13 + r1
            r1 = r42
            goto L_0x01ee
        L_0x0212:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r10, r13, r1)
            android.graphics.Canvas r10 = new android.graphics.Canvas
            r10.<init>(r1)
            android.graphics.Paint r13 = new android.graphics.Paint
            r13.<init>()
            r42 = r11
            r11 = -12303292(0xffffffffff444444, float:-2.6088314E38)
            r13.setColor(r11)
            android.graphics.Paint r11 = new android.graphics.Paint
            r11.<init>()
            r33 = r6
            r6 = -1
            r11.setColor(r6)
            java.util.Iterator r15 = r15.iterator()
            r6 = 0
        L_0x023a:
            boolean r27 = r15.hasNext()
            if (r27 == 0) goto L_0x02a5
            java.lang.Object r27 = r15.next()
            r34 = r15
            r15 = r27
            android.graphics.Bitmap r15 = (android.graphics.Bitmap) r15
            int r27 = r15.getWidth()
            r35 = r2
            r16 = 2
            int r2 = r27 + 2
            int r27 = r15.getHeight()
            int r27 = r27 + 2
            r36 = r8
            int r8 = r6 + r27
            r28 = 0
            r37 = r7
            float r7 = (float) r6
            r38 = r5
            float r5 = (float) r2
            r39 = r9
            float r9 = (float) r8
            r27 = r10
            r29 = r7
            r30 = r5
            r31 = r9
            r32 = r13
            r27.drawRect(r28, r29, r30, r31, r32)
            r28 = 1065353216(0x3f800000, float:1.0)
            int r5 = r6 + 1
            float r5 = (float) r5
            r7 = -1
            int r2 = r2 + r7
            float r2 = (float) r2
            int r8 = r8 + r7
            float r8 = (float) r8
            r29 = r5
            r30 = r2
            r31 = r8
            r32 = r11
            r27.drawRect(r28, r29, r30, r31, r32)
            r2 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            r10.drawBitmap(r15, r2, r5, r8)
            int r2 = r15.getHeight()
            r5 = 2
            int r2 = r2 + r5
            int r6 = r6 + r2
            r15 = r34
            r2 = r35
            r8 = r36
            r7 = r37
            r5 = r38
            r9 = r39
            goto L_0x023a
        L_0x02a5:
            r35 = r2
            r38 = r5
            r37 = r7
            r36 = r8
            r39 = r9
            android.graphics.Bitmap r1 = com.google.android.libraries.lens.view.feedback.C25809ab.m47620a(r1)
        L_0x02b3:
            if (r1 == 0) goto L_0x02be
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
            r2 = r14
            com.google.apps.tiktok.monitoring.feedback.c r2 = (com.google.apps.tiktok.monitoring.feedback.C47465c) r2
            r2.f123251c = r1
        L_0x02be:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x02ca
            java.lang.String r1 = "LensStateDump"
            r2 = 0
            com.google.android.libraries.lens.view.feedback.C25836z.m47672a(r14, r1, r0, r2)
        L_0x02ca:
            r0 = r14
            com.google.apps.tiktok.monitoring.feedback.c r0 = (com.google.apps.tiktok.monitoring.feedback.C47465c) r0
            java.lang.String r1 = "com.google.android.libraries.lens.LENS_FEEDBACK_UNKNOWN"
            r0.f123249a = r1
            com.google.common.base.ax r0 = r12.f70193c
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x02e7
            com.google.common.base.ax r0 = r12.f70193c
            java.lang.Object r0 = r0.mo56107c()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "Lens account"
            r5 = 1
            com.google.android.libraries.lens.view.feedback.C25836z.m47672a(r14, r2, r0, r5)
        L_0x02e7:
            java.lang.String r0 = r3.getQueryParameter(r4)
            if (r0 == 0) goto L_0x02f4
            java.lang.String r2 = "Feedback entry point"
            r4 = 0
            com.google.android.libraries.lens.view.feedback.C25836z.m47672a(r14, r2, r0, r4)
            goto L_0x02f5
        L_0x02f4:
            r4 = 0
        L_0x02f5:
            if (r39 == 0) goto L_0x02fe
            java.lang.String r2 = "Image source"
            r5 = r39
            com.google.android.libraries.lens.view.feedback.C25836z.m47672a(r14, r2, r5, r4)
        L_0x02fe:
            r2 = r38
            java.lang.String r2 = r3.getQueryParameter(r2)
            if (r2 == 0) goto L_0x032e
            com.google.android.libraries.lens.view.f.a r4 = new com.google.android.libraries.lens.view.f.a
            r4.<init>(r2, r0)
            com.google.common.b.hd r0 = com.google.android.libraries.lens.view.p2096f.C25803f.f70105b
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L_0x031c
            com.google.common.b.hd r0 = com.google.android.libraries.lens.view.p2096f.C25803f.f70105b
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0324
        L_0x031c:
            com.google.common.b.hd r0 = com.google.android.libraries.lens.view.p2096f.C25803f.f70104a
            java.lang.Object r0 = r0.getOrDefault(r2, r1)
            java.lang.String r0 = (java.lang.String) r0
        L_0x0324:
            r14.mo51309c(r0)
            java.lang.String r0 = "Session caller package"
            r1 = 0
            com.google.android.libraries.lens.view.feedback.C25836z.m47672a(r14, r0, r2, r1)
            goto L_0x032f
        L_0x032e:
            r1 = 0
        L_0x032f:
            r2 = r37
            java.lang.String r0 = r3.getQueryParameter(r2)
            if (r0 == 0) goto L_0x033c
            java.lang.String r2 = "Intent type id"
            com.google.android.libraries.lens.view.feedback.C25836z.m47672a(r14, r2, r0, r1)
        L_0x033c:
            if (r36 == 0) goto L_0x0345
            java.lang.String r0 = "Filters"
            r2 = r36
            com.google.android.libraries.lens.view.feedback.C25836z.m47672a(r14, r0, r2, r1)
        L_0x0345:
            java.lang.String r0 = "Region Search mode"
            r2 = r25
            com.google.android.libraries.lens.view.feedback.C25836z.m47672a(r14, r0, r2, r1)
            if (r23 == 0) goto L_0x0355
            java.lang.String r0 = "Region Search normalized area"
            r2 = r23
            com.google.android.libraries.lens.view.feedback.C25836z.m47672a(r14, r0, r2, r1)
        L_0x0355:
            java.lang.String r0 = "Session id"
            r2 = r35
            com.google.android.libraries.lens.view.feedback.C25836z.m47673b(r14, r2, r0)
            java.lang.String r0 = "Payload id"
            com.google.android.libraries.lens.view.feedback.C25836z.m47673b(r14, r2, r0)
            java.lang.String r0 = "Interaction id"
            com.google.android.libraries.lens.view.feedback.C25836z.m47673b(r14, r2, r0)
            java.lang.String r0 = "Connected"
            java.lang.String r3 = r33.toString()
            com.google.android.libraries.lens.view.feedback.C25836z.m47672a(r14, r0, r3, r1)
            if (r42 == 0) goto L_0x037a
            java.lang.String r0 = "Reticle region interaction"
            java.lang.String r3 = r42.toString()
            com.google.android.libraries.lens.view.feedback.C25836z.m47672a(r14, r0, r3, r1)
        L_0x037a:
            if (r24 == 0) goto L_0x0384
            java.lang.String r0 = "Multimodal query"
            r3 = r24
            r4 = 1
            com.google.android.libraries.lens.view.feedback.C25836z.m47672a(r14, r0, r3, r4)
        L_0x0384:
            if (r21 == 0) goto L_0x038f
            java.lang.String r0 = "Query type"
            java.lang.String r3 = r21.name()
            com.google.android.libraries.lens.view.feedback.C25836z.m47672a(r14, r0, r3, r1)
        L_0x038f:
            i.a.a.b r0 = p5485i.p5486a.p5487a.C69790b.f186171f
            com.google.protobuf.bn r0 = r0.createBuilder()
            r1 = r0
            i.a.a.a r1 = (p5485i.p5486a.p5487a.C69789a) r1
            java.lang.String r0 = "Prefetch request"
            java.lang.Object r0 = r2.get(r0)
            com.google.apps.tiktok.d.a.g r0 = (com.google.apps.tiktok.p3633d.p3634a.C46669g) r0
            if (r0 == 0) goto L_0x03ca
            com.google.protobuf.z r0 = r0.mo50688b()     // Catch:{ ct -> 0x03b9 }
            com.google.protobuf.ba r3 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x03b9 }
            com.google.at.g.a.a.bj r4 = com.google.p4017at.p4056g.p4057a.p4058a.C54002bj.f141677q     // Catch:{ ct -> 0x03b9 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r4, (com.google.protobuf.C63088z) r0, (com.google.protobuf.C62921ba) r3)     // Catch:{ ct -> 0x03b9 }
            r8 = r0
            com.google.at.g.a.a.bj r8 = (com.google.p4017at.p4056g.p4057a.p4058a.C54002bj) r8     // Catch:{ ct -> 0x03b9 }
            r1.mo61446a(r8)     // Catch:{ ct -> 0x03b7 }
            goto L_0x03cb
        L_0x03b7:
            r0 = move-exception
            goto L_0x03bb
        L_0x03b9:
            r0 = move-exception
            r8 = 0
        L_0x03bb:
            com.google.common.f.e r3 = com.google.android.libraries.lens.view.feedback.C25836z.f70191a
            com.google.common.f.x r3 = r3.mo56225c()
            java.lang.String r4 = "Failed to parse prefetch LensRequest for feedback"
            r5 = 49353(0xc0c9, float:6.9158E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r0)).mo56372aa(r5)).mo56386p(r4)
            goto L_0x03cb
        L_0x03ca:
            r8 = 0
        L_0x03cb:
            java.lang.String r0 = "Interaction request"
            java.lang.Object r0 = r2.get(r0)
            com.google.apps.tiktok.d.a.g r0 = (com.google.apps.tiktok.p3633d.p3634a.C46669g) r0
            if (r0 == 0) goto L_0x03f8
            com.google.protobuf.z r0 = r0.mo50688b()     // Catch:{ ct -> 0x03e9 }
            com.google.protobuf.ba r3 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x03e9 }
            com.google.at.g.a.a.bj r4 = com.google.p4017at.p4056g.p4057a.p4058a.C54002bj.f141677q     // Catch:{ ct -> 0x03e9 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r4, (com.google.protobuf.C63088z) r0, (com.google.protobuf.C62921ba) r3)     // Catch:{ ct -> 0x03e9 }
            com.google.at.g.a.a.bj r0 = (com.google.p4017at.p4056g.p4057a.p4058a.C54002bj) r0     // Catch:{ ct -> 0x03e9 }
            r1.mo61446a(r0)     // Catch:{ ct -> 0x03e9 }
            goto L_0x03f8
        L_0x03e9:
            r0 = move-exception
            com.google.common.f.e r3 = com.google.android.libraries.lens.view.feedback.C25836z.f70191a
            com.google.common.f.x r3 = r3.mo56225c()
            java.lang.String r4 = "Failed to parse interaction LensRequest for feedback"
            r5 = 49352(0xc0c8, float:6.9157E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r0)).mo56372aa(r5)).mo56386p(r4)
        L_0x03f8:
            java.lang.String r0 = "Prefetch response"
            java.lang.Object r0 = r2.get(r0)
            com.google.apps.tiktok.d.a.g r0 = (com.google.apps.tiktok.p3633d.p3634a.C46669g) r0
            if (r0 == 0) goto L_0x0425
            com.google.protobuf.z r0 = r0.mo50688b()     // Catch:{ ct -> 0x0416 }
            com.google.protobuf.ba r3 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0416 }
            com.google.at.g.a.a.bp r4 = com.google.p4017at.p4056g.p4057a.p4058a.C54008bp.f141704q     // Catch:{ ct -> 0x0416 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r4, (com.google.protobuf.C63088z) r0, (com.google.protobuf.C62921ba) r3)     // Catch:{ ct -> 0x0416 }
            com.google.at.g.a.a.bp r0 = (com.google.p4017at.p4056g.p4057a.p4058a.C54008bp) r0     // Catch:{ ct -> 0x0416 }
            r1.mo61447b(r0)     // Catch:{ ct -> 0x0416 }
            goto L_0x0425
        L_0x0416:
            r0 = move-exception
            com.google.common.f.e r3 = com.google.android.libraries.lens.view.feedback.C25836z.f70191a
            com.google.common.f.x r3 = r3.mo56225c()
            java.lang.String r4 = "Failed to parse prefetch LensResponse for feedback"
            r5 = 49351(0xc0c7, float:6.9155E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r0)).mo56372aa(r5)).mo56386p(r4)
        L_0x0425:
            java.lang.String r0 = "Interaction response"
            java.lang.Object r0 = r2.get(r0)
            com.google.apps.tiktok.d.a.g r0 = (com.google.apps.tiktok.p3633d.p3634a.C46669g) r0
            if (r0 == 0) goto L_0x0457
            com.google.protobuf.z r0 = r0.mo50688b()     // Catch:{ ct -> 0x0446 }
            com.google.protobuf.ba r2 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0446 }
            com.google.at.g.a.a.bp r3 = com.google.p4017at.p4056g.p4057a.p4058a.C54008bp.f141704q     // Catch:{ ct -> 0x0446 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r3, (com.google.protobuf.C63088z) r0, (com.google.protobuf.C62921ba) r2)     // Catch:{ ct -> 0x0446 }
            r2 = r0
            com.google.at.g.a.a.bp r2 = (com.google.p4017at.p4056g.p4057a.p4058a.C54008bp) r2     // Catch:{ ct -> 0x0446 }
            r1.mo61447b(r2)     // Catch:{ ct -> 0x0444 }
            goto L_0x0458
        L_0x0444:
            r0 = move-exception
            goto L_0x0448
        L_0x0446:
            r0 = move-exception
            r2 = 0
        L_0x0448:
            com.google.common.f.e r3 = com.google.android.libraries.lens.view.feedback.C25836z.f70191a
            com.google.common.f.x r3 = r3.mo56225c()
            java.lang.String r4 = "Failed to parse interaction LensResponse for feedback"
            r5 = 49350(0xc0c6, float:6.9154E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r0)).mo56372aa(r5)).mo56386p(r4)
            goto L_0x0458
        L_0x0457:
            r2 = 0
        L_0x0458:
            if (r2 != 0) goto L_0x045b
            goto L_0x04d4
        L_0x045b:
            com.google.protobuf.ba r0 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x04c5 }
            com.google.at.g.a.a.bo r3 = r2.f141717l     // Catch:{ ct -> 0x04c5 }
            if (r3 != 0) goto L_0x0465
            com.google.at.g.a.a.bo r3 = com.google.p4017at.p4056g.p4057a.p4058a.C54007bo.f141701b     // Catch:{ ct -> 0x04c5 }
        L_0x0465:
            com.google.protobuf.z r3 = r3.f141703a     // Catch:{ ct -> 0x04c5 }
            com.google.common.o.amc r4 = com.google.common.p4552o.amc.f159123i     // Catch:{ ct -> 0x04c5 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r4, (com.google.protobuf.C63088z) r3, (com.google.protobuf.C62921ba) r0)     // Catch:{ ct -> 0x04c5 }
            com.google.common.o.amc r0 = (com.google.common.p4552o.amc) r0     // Catch:{ ct -> 0x04c5 }
            java.lang.String r3 = "Response top level vertical"
            int r4 = r0.f159126b     // Catch:{ ct -> 0x04c5 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ ct -> 0x04c5 }
            r5 = 0
            com.google.android.libraries.lens.view.feedback.C25836z.m47672a(r14, r3, r4, r5)     // Catch:{ ct -> 0x04c5 }
            com.google.protobuf.cq r3 = r0.f159127c     // Catch:{ ct -> 0x04c5 }
            j$.util.stream.Stream r3 = p3186j$.util.Collection.EL.stream(r3)     // Catch:{ ct -> 0x04c5 }
            com.google.android.libraries.lens.view.feedback.v r4 = com.google.android.libraries.lens.view.feedback.C25832v.f70187a     // Catch:{ ct -> 0x04c5 }
            j$.util.stream.Stream r3 = r3.map(r4)     // Catch:{ ct -> 0x04c5 }
            com.google.android.libraries.lens.view.feedback.w r4 = com.google.android.libraries.lens.view.feedback.C25833w.f70188a     // Catch:{ ct -> 0x04c5 }
            j$.util.stream.Stream r3 = r3.flatMap(r4)     // Catch:{ ct -> 0x04c5 }
            com.google.android.libraries.lens.view.feedback.x r4 = com.google.android.libraries.lens.view.feedback.C25834x.f70189a     // Catch:{ ct -> 0x04c5 }
            j$.util.stream.Stream r3 = r3.map(r4)     // Catch:{ ct -> 0x04c5 }
            j$.util.stream.Collector r4 = p3186j$.util.stream.Collectors.joining(r22)     // Catch:{ ct -> 0x04c5 }
            java.lang.Object r3 = r3.collect(r4)     // Catch:{ ct -> 0x04c5 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ ct -> 0x04c5 }
            com.google.protobuf.cq r0 = r0.f159127c     // Catch:{ ct -> 0x04c5 }
            j$.util.stream.Stream r0 = p3186j$.util.Collection.EL.stream(r0)     // Catch:{ ct -> 0x04c5 }
            com.google.android.libraries.lens.view.feedback.y r4 = com.google.android.libraries.lens.view.feedback.C25835y.f70190a     // Catch:{ ct -> 0x04c5 }
            j$.util.stream.Stream r0 = r0.map(r4)     // Catch:{ ct -> 0x04c5 }
            com.google.android.libraries.lens.view.feedback.x r4 = com.google.android.libraries.lens.view.feedback.C25834x.f70189a     // Catch:{ ct -> 0x04c5 }
            j$.util.stream.Stream r0 = r0.map(r4)     // Catch:{ ct -> 0x04c5 }
            j$.util.stream.Collector r4 = p3186j$.util.stream.Collectors.joining(r22)     // Catch:{ ct -> 0x04c5 }
            java.lang.Object r0 = r0.collect(r4)     // Catch:{ ct -> 0x04c5 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ct -> 0x04c5 }
            java.lang.String r4 = "LVS sources"
            r5 = 0
            com.google.android.libraries.lens.view.feedback.C25836z.m47672a(r14, r4, r3, r5)     // Catch:{ ct -> 0x04c5 }
            java.lang.String r3 = "Response result type"
            com.google.android.libraries.lens.view.feedback.C25836z.m47672a(r14, r3, r0, r5)     // Catch:{ ct -> 0x04c5 }
            goto L_0x04d4
        L_0x04c5:
            r0 = move-exception
            com.google.common.f.e r3 = com.google.android.libraries.lens.view.feedback.C25836z.f70191a
            com.google.common.f.x r3 = r3.mo56225c()
            java.lang.String r4 = "Could not parse serialized presentation log"
            r5 = 49349(0xc0c5, float:6.9153E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r0)).mo56372aa(r5)).mo56386p(r4)
        L_0x04d4:
            if (r2 == 0) goto L_0x050a
            com.google.at.g.a.a.cs r0 = r2.f141714i
            if (r0 == 0) goto L_0x050a
            com.google.bp.f.b.a.aw r0 = r0.f141784a
            if (r0 != 0) goto L_0x04e0
            com.google.bp.f.b.a.aw r0 = com.google.p4242bp.p4257f.p4260b.p4261a.C56242aw.f149799b
        L_0x04e0:
            com.google.protobuf.cq r0 = r0.f149801a
            int r0 = r0.size()
            long r2 = (long) r0
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x04f0
            java.lang.String r0 = "0"
            goto L_0x0504
        L_0x04f0:
            r4 = 4
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x04f9
            java.lang.String r0 = "upto3"
            goto L_0x0504
        L_0x04f9:
            r4 = 10
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0502
            java.lang.String r0 = "upto9"
            goto L_0x0504
        L_0x0502:
            java.lang.String r0 = "many"
        L_0x0504:
            java.lang.String r2 = "Paragraphs"
            r3 = 0
            com.google.android.libraries.lens.view.feedback.C25836z.m47672a(r14, r2, r0, r3)
        L_0x050a:
            if (r8 != 0) goto L_0x06f4
            if (r20 == 0) goto L_0x0519
            r1.copyOnWrite()
            com.google.protobuf.bv r0 = r1.instance
            i.a.a.b r0 = (p5485i.p5486a.p5487a.C69790b) r0
            r2 = r20
            r0.f186175c = r2
        L_0x0519:
            if (r19 == 0) goto L_0x0526
            r1.copyOnWrite()
            com.google.protobuf.bv r0 = r1.instance
            i.a.a.b r0 = (p5485i.p5486a.p5487a.C69790b) r0
            r2 = r19
            r0.f186173a = r2
        L_0x0526:
            if (r26 == 0) goto L_0x06f4
            if (r18 == 0) goto L_0x06f4
            com.google.android.libraries.lens.e.a.l r0 = com.google.android.libraries.lens.p2014e.p2015a.C24193l.f66123c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.libraries.lens.e.a.e r0 = (com.google.android.libraries.lens.p2014e.p2015a.C24186e) r0
            int r2 = r18.mo29769l()
            int r3 = r2 + -1
            if (r2 == 0) goto L_0x06f2
            if (r3 == 0) goto L_0x06a2
            r2 = 1
            if (r3 == r2) goto L_0x065a
            r2 = 2
            if (r3 == r2) goto L_0x05ce
            r2 = 3
            if (r3 != r2) goto L_0x05ba
            com.google.common.base.ax r2 = r18.mo29762f()
            java.lang.Object r2 = r2.mo56107c()
            android.graphics.RectF r2 = (android.graphics.RectF) r2
            com.google.android.libraries.lens.e.a.i r3 = com.google.android.libraries.lens.p2014e.p2015a.C24190i.f66117b
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.libraries.lens.e.a.h r3 = (com.google.android.libraries.lens.p2014e.p2015a.C24189h) r3
            com.google.android.libraries.lens.e.a.b r4 = com.google.android.libraries.lens.p2014e.p2015a.C24183b.f66104e
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.libraries.lens.e.a.a r4 = (com.google.android.libraries.lens.p2014e.p2015a.C24182a) r4
            float r5 = r2.top
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.android.libraries.lens.e.a.b r6 = (com.google.android.libraries.lens.p2014e.p2015a.C24183b) r6
            r6.f66107b = r5
            float r5 = r2.left
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.android.libraries.lens.e.a.b r6 = (com.google.android.libraries.lens.p2014e.p2015a.C24183b) r6
            r6.f66106a = r5
            float r5 = r2.bottom
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.android.libraries.lens.e.a.b r6 = (com.google.android.libraries.lens.p2014e.p2015a.C24183b) r6
            r6.f66109d = r5
            float r2 = r2.right
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.android.libraries.lens.e.a.b r5 = (com.google.android.libraries.lens.p2014e.p2015a.C24183b) r5
            r5.f66108c = r2
            r3.copyOnWrite()
            com.google.protobuf.bv r2 = r3.instance
            com.google.android.libraries.lens.e.a.i r2 = (com.google.android.libraries.lens.p2014e.p2015a.C24190i) r2
            com.google.protobuf.bv r4 = r4.build()
            com.google.android.libraries.lens.e.a.b r4 = (com.google.android.libraries.lens.p2014e.p2015a.C24183b) r4
            r4.getClass()
            r2.f66119a = r4
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.libraries.lens.e.a.l r2 = (com.google.android.libraries.lens.p2014e.p2015a.C24193l) r2
            com.google.protobuf.bv r3 = r3.build()
            com.google.android.libraries.lens.e.a.i r3 = (com.google.android.libraries.lens.p2014e.p2015a.C24190i) r3
            r3.getClass()
            r2.f66126b = r3
            r3 = 4
            r2.f66125a = r3
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.libraries.lens.e.a.l r0 = (com.google.android.libraries.lens.p2014e.p2015a.C24193l) r0
            goto L_0x06e5
        L_0x05ba:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r1 = r18.mo29769l()
            java.lang.String r1 = com.google.android.libraries.lens.p2014e.C24232x.m45226a(r1)
            java.lang.String r2 = "LensInteraction has unrecognized type: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x05ce:
            com.google.common.base.ax r2 = r18.mo29762f()
            java.lang.Object r2 = r2.mo56107c()
            android.graphics.RectF r2 = (android.graphics.RectF) r2
            com.google.android.libraries.lens.e.a.d r3 = com.google.android.libraries.lens.p2014e.p2015a.C24185d.f66110b
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.libraries.lens.e.a.c r3 = (com.google.android.libraries.lens.p2014e.p2015a.C24184c) r3
            com.google.android.libraries.lens.e.a.n r4 = com.google.android.libraries.lens.p2014e.p2015a.C24195n.f66127f
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.libraries.lens.e.a.m r4 = (com.google.android.libraries.lens.p2014e.p2015a.C24194m) r4
            float r5 = r2.top
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.android.libraries.lens.e.a.n r6 = (com.google.android.libraries.lens.p2014e.p2015a.C24195n) r6
            r6.f66130b = r5
            float r5 = r2.left
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.android.libraries.lens.e.a.n r6 = (com.google.android.libraries.lens.p2014e.p2015a.C24195n) r6
            r6.f66129a = r5
            float r5 = r2.bottom
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.android.libraries.lens.e.a.n r6 = (com.google.android.libraries.lens.p2014e.p2015a.C24195n) r6
            r6.f66132d = r5
            float r2 = r2.right
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.android.libraries.lens.e.a.n r5 = (com.google.android.libraries.lens.p2014e.p2015a.C24195n) r5
            r5.f66131c = r2
            com.google.common.base.ax r2 = r18.mo29760e()
            java.lang.Object r2 = r2.mo56107c()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.android.libraries.lens.e.a.n r5 = (com.google.android.libraries.lens.p2014e.p2015a.C24195n) r5
            r5.f66133e = r2
            r3.copyOnWrite()
            com.google.protobuf.bv r2 = r3.instance
            com.google.android.libraries.lens.e.a.d r2 = (com.google.android.libraries.lens.p2014e.p2015a.C24185d) r2
            com.google.protobuf.bv r4 = r4.build()
            com.google.android.libraries.lens.e.a.n r4 = (com.google.android.libraries.lens.p2014e.p2015a.C24195n) r4
            r4.getClass()
            r2.f66112a = r4
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.libraries.lens.e.a.l r2 = (com.google.android.libraries.lens.p2014e.p2015a.C24193l) r2
            com.google.protobuf.bv r3 = r3.build()
            com.google.android.libraries.lens.e.a.d r3 = (com.google.android.libraries.lens.p2014e.p2015a.C24185d) r3
            r3.getClass()
            r2.f66126b = r3
            r3 = 3
            r2.f66125a = r3
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.libraries.lens.e.a.l r0 = (com.google.android.libraries.lens.p2014e.p2015a.C24193l) r0
            goto L_0x06e5
        L_0x065a:
            com.google.android.libraries.lens.e.a.k r2 = com.google.android.libraries.lens.p2014e.p2015a.C24192k.f66120b
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.lens.e.a.j r2 = (com.google.android.libraries.lens.p2014e.p2015a.C24191j) r2
            com.google.common.base.ax r3 = r18.mo29764h()
            java.lang.Object r3 = r3.mo56107c()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.libraries.lens.e.a.k r4 = (com.google.android.libraries.lens.p2014e.p2015a.C24192k) r4
            com.google.protobuf.cq r5 = r4.f66122a
            boolean r6 = r5.mo58948c()
            if (r6 != 0) goto L_0x0681
            com.google.protobuf.cq r5 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r5)
            r4.f66122a = r5
        L_0x0681:
            com.google.protobuf.cq r4 = r4.f66122a
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r3, (java.util.List) r4)
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.libraries.lens.e.a.l r3 = (com.google.android.libraries.lens.p2014e.p2015a.C24193l) r3
            com.google.protobuf.bv r2 = r2.build()
            com.google.android.libraries.lens.e.a.k r2 = (com.google.android.libraries.lens.p2014e.p2015a.C24192k) r2
            r2.getClass()
            r3.f66126b = r2
            r2 = 2
            r3.f66125a = r2
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.libraries.lens.e.a.l r0 = (com.google.android.libraries.lens.p2014e.p2015a.C24193l) r0
            goto L_0x06e5
        L_0x06a2:
            com.google.common.base.ax r2 = r18.mo29763g()
            java.lang.Object r2 = r2.mo56107c()
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            com.google.android.libraries.lens.e.a.g r3 = com.google.android.libraries.lens.p2014e.p2015a.C24188g.f66113c
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.libraries.lens.e.a.f r3 = (com.google.android.libraries.lens.p2014e.p2015a.C24187f) r3
            float r4 = r2.x
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.android.libraries.lens.e.a.g r5 = (com.google.android.libraries.lens.p2014e.p2015a.C24188g) r5
            r5.f66115a = r4
            float r2 = r2.y
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.android.libraries.lens.e.a.g r4 = (com.google.android.libraries.lens.p2014e.p2015a.C24188g) r4
            r4.f66116b = r2
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.libraries.lens.e.a.l r2 = (com.google.android.libraries.lens.p2014e.p2015a.C24193l) r2
            com.google.protobuf.bv r3 = r3.build()
            com.google.android.libraries.lens.e.a.g r3 = (com.google.android.libraries.lens.p2014e.p2015a.C24188g) r3
            r3.getClass()
            r2.f66126b = r3
            r3 = 1
            r2.f66125a = r3
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.libraries.lens.e.a.l r0 = (com.google.android.libraries.lens.p2014e.p2015a.C24193l) r0
        L_0x06e5:
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            i.a.a.b r2 = (p5485i.p5486a.p5487a.C69790b) r2
            r0.getClass()
            r2.f186174b = r0
            goto L_0x06f4
        L_0x06f2:
            r2 = 0
            throw r2
        L_0x06f4:
            com.google.protobuf.bv r0 = r1.build()
            i.a.a.b r0 = (p5485i.p5486a.p5487a.C69790b) r0
            com.google.protobuf.z r0 = r0.toByteString()
            com.google.apps.tiktok.d.a.a r1 = new com.google.apps.tiktok.d.a.a
            r1.<init>()
            com.google.apps.tiktok.d.a.e r2 = com.google.apps.tiktok.p3633d.p3634a.C46667e.TEXT
            r1.mo50686d(r2)
            r2 = 1
            r1.mo50684b(r2)
            r1.mo50685c(r0)
            java.lang.String r0 = "feedback_binary_data"
            com.google.apps.tiktok.d.a.g r1 = r1.mo50683a()
            r14.mo51333f(r0, r1)
            com.google.apps.tiktok.monitoring.feedback.n r0 = r12.f70192b
            com.google.apps.tiktok.monitoring.feedback.l r1 = r14.mo51332e()
            r0.mo51336a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.feedback.C25830t.mo30979a(java.lang.String, com.google.android.libraries.lens.view.feedback.s):void");
    }
}
