package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.ImageGridView */
/* compiled from: PG */
public class ImageGridView extends LinearLayout {

    /* renamed from: a */
    public C102374p f285435a;

    /* renamed from: b */
    public int f285436b;

    /* renamed from: c */
    public int f285437c;

    /* renamed from: d */
    public C102338bk f285438d;

    public ImageGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0147, code lost:
        if (r5.f119954d < 0) goto L_0x0152;
     */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0482  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x049f  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0503  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0792  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo93070a(com.google.protos.p5146w.p5147a.p5148a.C65926d r31) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            com.google.android.libraries.logging.j r2 = new com.google.android.libraries.logging.j
            r3 = 4165(0x1045, float:5.836E-42)
            r2.<init>(r3)
            com.google.android.libraries.logging.C28295m.m52919e(r0, r2)
            int r2 = r0.f285437c
            com.google.protos.aa.a.e r3 = com.google.protos.p4753aa.p4754a.C63100e.f170276k
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.protos.aa.a.d r3 = (com.google.protos.p4753aa.p4754a.C63099d) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.protos.aa.a.e r4 = (com.google.protos.p4753aa.p4754a.C63100e) r4
            r5 = 5
            r4.f170281d = r5
            int r6 = r4.f170278a
            r6 = r6 | 16
            r4.f170278a = r6
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.protos.aa.a.e r4 = (com.google.protos.p4753aa.p4754a.C63100e) r4
            int r6 = r4.f170278a
            r6 = r6 | 32
            r4.f170278a = r6
            int r2 = r2 + -16
            r4.f170282e = r2
            com.google.protobuf.bv r2 = r3.build()
            com.google.protos.aa.a.e r2 = (com.google.protos.p4753aa.p4754a.C63100e) r2
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            com.google.common.b.gp r4 = com.google.common.p4522b.C58485gu.m89837e()
            com.google.protobuf.cq r6 = r1.f179291a
            java.util.Iterator r6 = r6.iterator()
        L_0x004e:
            boolean r7 = r6.hasNext()
            r8 = -1
            r9 = 1
            if (r7 == 0) goto L_0x0241
            java.lang.Object r7 = r6.next()
            com.google.protos.w.a.a.h r7 = (com.google.protos.p5146w.p5147a.p5148a.C65930h) r7
            com.google.ap.a.f r10 = new com.google.ap.a.f
            r11 = 0
            r10.<init>(r11)
            com.google.protobuf.bt r13 = com.google.protos.p5146w.p5147a.p5148a.C65933k.f179313h
            com.google.protobuf.bt r13 = com.google.protobuf.C62942bv.checkIsLite(r13)
            r7.mo58887l(r13)
            com.google.protobuf.bf r14 = r7.f169962ag
            com.google.protobuf.bs r13 = r13.f169971d
            boolean r13 = r14.mo58857o(r13)
            if (r13 == 0) goto L_0x00ca
            com.google.protobuf.bt r10 = com.google.protos.p5146w.p5147a.p5148a.C65933k.f179313h
            com.google.protobuf.bt r10 = com.google.protobuf.C62942bv.checkIsLite(r10)
            r7.mo58887l(r10)
            com.google.protobuf.bf r13 = r7.f169962ag
            com.google.protobuf.bs r14 = r10.f169971d
            java.lang.Object r13 = r13.mo58854l(r14)
            if (r13 != 0) goto L_0x008c
            java.lang.Object r10 = r10.f169969b
            goto L_0x0090
        L_0x008c:
            java.lang.Object r10 = r10.mo58889c(r13)
        L_0x0090:
            com.google.protos.w.a.a.k r10 = (com.google.protos.p5146w.p5147a.p5148a.C65933k) r10
            com.google.ap.a.f r13 = new com.google.ap.a.f
            int r14 = r10.f179317c
            int r15 = r10.f179318d
            int r5 = r10.f179315a
            int r11 = r10.f179316b
            boolean r12 = r10.f179320f
            boolean r10 = r10.f179319e
            int r14 = r14 / 3
            r14 = r14 & 7
            int r14 = r14 << 27
            int r15 = r15 / 3
            r15 = r15 & 7
            int r15 = r15 << 24
            r14 = r14 | r15
            int r5 = r5 / 3
            r5 = r5 & 7
            int r5 = r5 << 21
            r5 = r5 | r14
            int r11 = r11 / 3
            r11 = r11 & 7
            int r11 = r11 << 18
            r5 = r5 | r11
            if (r12 == 0) goto L_0x00c0
            r11 = 1073741824(0x40000000, float:2.0)
            r5 = r5 | r11
        L_0x00c0:
            if (r10 == 0) goto L_0x00c5
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r5 | r10
        L_0x00c5:
            long r10 = (long) r5
            r13.<init>(r10)
            r10 = r13
        L_0x00ca:
            com.google.ap.a.b r5 = new com.google.ap.a.b
            r5.<init>()
            r5.mo49691f(r8)
            r5.mo49690e(r8)
            r5.mo49689d(r8)
            r5.mo49688c(r8)
            r5.f119956f = r9
            short r8 = r5.f119959i
            r8 = r8 | 240(0xf0, float:3.36E-43)
            short r11 = (short) r8
            r5.f119959i = r11
            com.google.ap.a.f r11 = new com.google.ap.a.f
            r12 = 0
            r11.<init>(r12)
            r5.f119957g = r11
            r5.f119958h = r9
            r8 = r8 | 768(0x300, float:1.076E-42)
            short r8 = (short) r8
            r5.f119959i = r8
            java.lang.String r8 = r7.f179303b
            if (r8 == 0) goto L_0x0239
            r5.f119951a = r8
            com.google.protos.w.a.a.f r8 = r7.f179304c
            if (r8 != 0) goto L_0x0100
            com.google.protos.w.a.a.f r8 = com.google.protos.p5146w.p5147a.p5148a.C65928f.f179293f
        L_0x0100:
            int r8 = r8.f179298d
            r5.mo49691f(r8)
            com.google.protos.w.a.a.f r8 = r7.f179304c
            if (r8 != 0) goto L_0x010b
            com.google.protos.w.a.a.f r8 = com.google.protos.p5146w.p5147a.p5148a.C65928f.f179293f
        L_0x010b:
            int r8 = r8.f179297c
            r5.mo49690e(r8)
            com.google.protos.w.a.a.f r8 = r7.f179305d
            if (r8 != 0) goto L_0x0116
            com.google.protos.w.a.a.f r8 = com.google.protos.p5146w.p5147a.p5148a.C65928f.f179293f
        L_0x0116:
            int r8 = r8.f179298d
            r5.mo49689d(r8)
            com.google.protos.w.a.a.f r7 = r7.f179305d
            if (r7 != 0) goto L_0x0121
            com.google.protos.w.a.a.f r7 = com.google.protos.p5146w.p5147a.p5148a.C65928f.f179293f
        L_0x0121:
            int r7 = r7.f179297c
            r5.mo49688c(r7)
            r5.f119957g = r10
            int r7 = r5.mo49686a()
            r8 = 0
            if (r7 < 0) goto L_0x0231
            int r7 = r5.mo49687b()
            if (r7 >= 0) goto L_0x0137
            goto L_0x0231
        L_0x0137:
            short r7 = r5.f119959i
            r8 = r7 & 8
            if (r8 == 0) goto L_0x0229
            int r8 = r5.f119955e
            if (r8 < 0) goto L_0x0152
            r7 = r7 & 4
            if (r7 == 0) goto L_0x014a
            int r7 = r5.f119954d
            if (r7 >= 0) goto L_0x0160
            goto L_0x0152
        L_0x014a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Property \"imageWidth\" has not been set"
            r1.<init>(r2)
            throw r1
        L_0x0152:
            int r7 = r5.mo49686a()
            r5.mo49688c(r7)
            int r7 = r5.mo49687b()
            r5.mo49689d(r7)
        L_0x0160:
            short r7 = r5.f119959i
            r8 = 1023(0x3ff, float:1.434E-42)
            if (r7 != r8) goto L_0x0195
            java.lang.String r7 = r5.f119951a
            if (r7 == 0) goto L_0x0195
            com.google.ap.a.f r8 = r5.f119957g
            if (r8 != 0) goto L_0x016f
            goto L_0x0195
        L_0x016f:
            com.google.ap.a.c r9 = new com.google.ap.a.c
            int r10 = r5.f119952b
            int r11 = r5.f119953c
            int r12 = r5.f119954d
            int r13 = r5.f119955e
            int r14 = r5.f119956f
            boolean r5 = r5.f119958h
            r16 = r9
            r17 = r7
            r18 = r10
            r19 = r11
            r20 = r12
            r21 = r13
            r22 = r14
            r23 = r8
            r24 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            r8 = r9
            goto L_0x0231
        L_0x0195:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r5.f119951a
            if (r2 != 0) goto L_0x01a3
            java.lang.String r2 = " id"
            r1.append(r2)
        L_0x01a3:
            short r2 = r5.f119959i
            r2 = r2 & r9
            if (r2 != 0) goto L_0x01ad
            java.lang.String r2 = " thumbWidth"
            r1.append(r2)
        L_0x01ad:
            short r2 = r5.f119959i
            r2 = r2 & 2
            if (r2 != 0) goto L_0x01b8
            java.lang.String r2 = " thumbHeight"
            r1.append(r2)
        L_0x01b8:
            short r2 = r5.f119959i
            r2 = r2 & 4
            if (r2 != 0) goto L_0x01c3
            java.lang.String r2 = " imageWidth"
            r1.append(r2)
        L_0x01c3:
            short r2 = r5.f119959i
            r2 = r2 & 8
            if (r2 != 0) goto L_0x01ce
            java.lang.String r2 = " imageHeight"
            r1.append(r2)
        L_0x01ce:
            short r2 = r5.f119959i
            r2 = r2 & 16
            if (r2 != 0) goto L_0x01d9
            java.lang.String r2 = " colSpan"
            r1.append(r2)
        L_0x01d9:
            short r2 = r5.f119959i
            r2 = r2 & 32
            if (r2 != 0) goto L_0x01e4
            java.lang.String r2 = " textHeight"
            r1.append(r2)
        L_0x01e4:
            short r2 = r5.f119959i
            r2 = r2 & 64
            if (r2 != 0) goto L_0x01ef
            java.lang.String r2 = " textWidth"
            r1.append(r2)
        L_0x01ef:
            short r2 = r5.f119959i
            r2 = r2 & 128(0x80, float:1.794E-43)
            if (r2 != 0) goto L_0x01fa
            java.lang.String r2 = " boxWidth"
            r1.append(r2)
        L_0x01fa:
            com.google.ap.a.f r2 = r5.f119957g
            if (r2 != 0) goto L_0x0203
            java.lang.String r2 = " cropHints"
            r1.append(r2)
        L_0x0203:
            short r2 = r5.f119959i
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 != 0) goto L_0x020e
            java.lang.String r2 = " visible"
            r1.append(r2)
        L_0x020e:
            short r2 = r5.f119959i
            r2 = r2 & 512(0x200, float:7.175E-43)
            if (r2 != 0) goto L_0x0219
            java.lang.String r2 = " limitDisplaySize"
            r1.append(r2)
        L_0x0219:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Missing required properties:"
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        L_0x0229:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Property \"imageHeight\" has not been set"
            r1.<init>(r2)
            throw r1
        L_0x0231:
            if (r8 == 0) goto L_0x0236
            r4.mo55395g(r8)
        L_0x0236:
            r5 = 5
            goto L_0x004e
        L_0x0239:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null id"
            r1.<init>(r2)
            throw r1
        L_0x0241:
            com.google.common.b.gu r4 = r4.mo55394f()
            com.google.protobuf.ch r5 = r2.f170284g
            int r5 = r5.size()
            r6 = 0
            if (r5 <= 0) goto L_0x0254
            boolean r5 = r2.f170285h
            com.google.protobuf.ch r7 = r2.f170284g
            goto L_0x02dc
        L_0x0254:
            com.google.common.b.sm r5 = r4.listIterator(r6)
            r10 = 0
        L_0x025a:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x026c
            java.lang.Object r7 = r5.next()
            com.google.ap.a.h r7 = (com.google.p3577ap.p3578a.C45610h) r7
            double r12 = r7.mo49709n()
            double r10 = r10 + r12
            goto L_0x025a
        L_0x026c:
            r5 = r4
            com.google.common.b.pq r5 = (com.google.common.p4522b.C58724pq) r5
            int r5 = r5.f156474d
            double r12 = (double) r5
            java.lang.Double.isNaN(r12)
            double r10 = r10 / r12
            r12 = 4613937818241073152(0x4008000000000000, double:3.0)
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x027e
            r5 = 1
            goto L_0x027f
        L_0x027e:
            r5 = 0
        L_0x027f:
            int r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r7 <= 0) goto L_0x0286
            r7 = 425(0x1a9, float:5.96E-43)
            goto L_0x0288
        L_0x0286:
            r7 = 250(0xfa, float:3.5E-43)
        L_0x0288:
            int r10 = r2.f170282e
            int r10 = r10 + 8
            double r10 = (double) r10
            int r7 = r7 + 8
            double r12 = (double) r7
            java.lang.Double.isNaN(r10)
            java.lang.Double.isNaN(r12)
            double r10 = r10 / r12
            double r10 = java.lang.Math.ceil(r10)
            int r7 = (int) r10
            int r7 = java.lang.Math.max(r7, r9)
            int r10 = r7 + -1
            int r11 = r2.f170282e
            int r10 = r10 * 8
            int r11 = r11 - r10
            double r11 = (double) r11
            double r13 = (double) r7
            java.lang.Double.isNaN(r11)
            java.lang.Double.isNaN(r13)
            double r11 = r11 / r13
            double r11 = java.lang.Math.floor(r11)
            int r11 = (int) r11
            r12 = 125(0x7d, float:1.75E-43)
            int r11 = java.lang.Math.max(r12, r11)
            com.google.common.b.gp r12 = com.google.common.p4522b.C58485gu.m89837e()
            int r13 = r2.f170282e
            int r13 = r13 - r10
            int r10 = r11 * r7
            int r13 = r13 - r10
            r10 = 0
        L_0x02c6:
            if (r10 >= r7) goto L_0x02d8
            if (r10 >= r13) goto L_0x02cc
            r14 = 1
            goto L_0x02cd
        L_0x02cc:
            r14 = 0
        L_0x02cd:
            int r14 = r14 + r11
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r12.mo55395g(r14)
            int r10 = r10 + 1
            goto L_0x02c6
        L_0x02d8:
            com.google.common.b.gu r7 = r12.mo55394f()
        L_0x02dc:
            com.google.protobuf.ch r10 = r2.f170283f
            int r10 = r10.size()
            if (r10 <= 0) goto L_0x02ec
            java.util.ArrayList r10 = new java.util.ArrayList
            com.google.protobuf.ch r11 = r2.f170283f
            r10.<init>(r11)
            goto L_0x0306
        L_0x02ec:
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = r7.size()
            r10.<init>(r11)
            r11 = 0
        L_0x02f6:
            int r12 = r7.size()
            if (r11 >= r12) goto L_0x0306
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            r10.add(r12)
            int r11 = r11 + 1
            goto L_0x02f6
        L_0x0306:
            int r11 = r10.size()
            int[] r12 = new int[r11]
            com.google.ap.a.d r13 = com.google.p3577ap.p3578a.C45607e.m81310a(r10, r9)
            com.google.ap.a.a r13 = (com.google.p3577ap.p3578a.C45603a) r13
            int r13 = r13.f119950b
            java.util.HashSet r14 = new java.util.HashSet
            r14.<init>()
            int r14 = r2.f170278a
            r14 = r14 & 128(0x80, float:1.794E-43)
            if (r14 == 0) goto L_0x0322
            int r14 = r2.f170286i
            goto L_0x0324
        L_0x0322:
            int r14 = r2.f170280c
        L_0x0324:
            r15 = r4
            com.google.common.b.pq r15 = (com.google.common.p4522b.C58724pq) r15
            int r15 = r15.f156474d
            r6 = r13
            r8 = 0
        L_0x032b:
            if (r8 >= r15) goto L_0x052a
            java.lang.Object r18 = r4.get(r8)
            com.google.ap.a.h r18 = (com.google.p3577ap.p3578a.C45610h) r18
            int r19 = r18.mo49693b()
            if (r19 != 0) goto L_0x033a
            goto L_0x0340
        L_0x033a:
            if (r19 >= 0) goto L_0x033e
            r9 = r11
            goto L_0x0340
        L_0x033e:
            r9 = r19
        L_0x0340:
            com.google.ap.a.d r19 = com.google.p3577ap.p3578a.C45607e.m81310a(r10, r9)
            r21 = r4
            r4 = r19
            com.google.ap.a.a r4 = (com.google.p3577ap.p3578a.C45603a) r4
            r19 = r11
            int r11 = r4.f119949a
            r22 = r15
            int r15 = r4.f119950b
            int r1 = r14 + r13
            if (r15 >= r1) goto L_0x0358
            r1 = 1
            goto L_0x0359
        L_0x0358:
            r1 = 0
        L_0x0359:
            r15 = 0
            r23 = 0
        L_0x035c:
            if (r15 >= r9) goto L_0x0373
            r24 = r13
            int r13 = r11 + r15
            java.lang.Object r13 = r7.get(r13)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            int r23 = r23 + r13
            int r15 = r15 + 1
            r13 = r24
            goto L_0x035c
        L_0x0373:
            r24 = r13
            int r13 = r9 + -1
            int r13 = r13 * 8
            int r13 = r23 + r13
            boolean r15 = r18.mo49706m()
            if (r15 == 0) goto L_0x03c1
            int r15 = r18.mo49699g()
            if (r15 == 0) goto L_0x03c1
            int r15 = r18.mo49700h()
            r23 = r14
            double r14 = (double) r15
            boolean r0 = r18.mo49705l()
            r25 = r7
            r7 = 1
            if (r7 == r0) goto L_0x039d
            r26 = 4608083138725491507(0x3ff3333333333333, double:1.2)
            goto L_0x039f
        L_0x039d:
            r26 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x039f:
            java.lang.Double.isNaN(r14)
            double r14 = r14 * r26
            int r0 = (int) r14
            int r0 = java.lang.Math.min(r13, r0)
            double r14 = (double) r0
            double r26 = r18.mo49709n()
            java.lang.Double.isNaN(r14)
            double r14 = r14 / r26
            int r7 = (int) r14
            r14 = 50
            int r14 = java.lang.Math.max(r14, r7)
            r15 = 350(0x15e, float:4.9E-43)
            int r14 = java.lang.Math.min(r15, r14)
            goto L_0x03c8
        L_0x03c1:
            r25 = r7
            r23 = r14
            r0 = r13
            r7 = 0
            r14 = 0
        L_0x03c8:
            int r15 = r18.mo49692a()
            if (r15 <= 0) goto L_0x03d3
            int r15 = r18.mo49692a()
            goto L_0x03d4
        L_0x03d3:
            r15 = r13
        L_0x03d4:
            com.google.protos.aa.a.c r26 = com.google.protos.p4753aa.p4754a.C63098c.f170263l
            com.google.protobuf.bn r26 = r26.createBuilder()
            r27 = r5
            r5 = r26
            com.google.protos.aa.a.b r5 = (com.google.protos.p4753aa.p4754a.C63097b) r5
            r5.copyOnWrite()
            r26 = r2
            com.google.protobuf.bv r2 = r5.instance
            com.google.protos.aa.a.c r2 = (com.google.protos.p4753aa.p4754a.C63098c) r2
            r28 = r8
            int r8 = r2.f170265a
            r8 = r8 | 4096(0x1000, float:5.74E-42)
            r2.f170265a = r8
            r2.f170273i = r11
            r5.copyOnWrite()
            com.google.protobuf.bv r2 = r5.instance
            com.google.protos.aa.a.c r2 = (com.google.protos.p4753aa.p4754a.C63098c) r2
            int r8 = r2.f170265a
            r8 = r8 | 2048(0x800, float:2.87E-42)
            r2.f170265a = r8
            r2.f170272h = r1
            r5.copyOnWrite()
            com.google.protobuf.bv r1 = r5.instance
            com.google.protos.aa.a.c r1 = (com.google.protos.p4753aa.p4754a.C63098c) r1
            int r2 = r1.f170265a
            r8 = 1
            r2 = r2 | r8
            r1.f170265a = r2
            r1.f170266b = r15
            r5.copyOnWrite()
            com.google.protobuf.bv r1 = r5.instance
            com.google.protos.aa.a.c r1 = (com.google.protos.p4753aa.p4754a.C63098c) r1
            int r2 = r1.f170265a
            r2 = r2 | 2
            r1.f170265a = r2
            r1.f170267c = r14
            r5.copyOnWrite()
            com.google.protobuf.bv r1 = r5.instance
            com.google.protos.aa.a.c r1 = (com.google.protos.p4753aa.p4754a.C63098c) r1
            int r2 = r1.f170265a
            r2 = r2 | 32
            r1.f170265a = r2
            r1.f170268d = r0
            r5.copyOnWrite()
            com.google.protobuf.bv r1 = r5.instance
            com.google.protos.aa.a.c r1 = (com.google.protos.p4753aa.p4754a.C63098c) r1
            int r2 = r1.f170265a
            r2 = r2 | 64
            r1.f170265a = r2
            r1.f170269e = r7
            com.google.ap.a.f r1 = r18.mo49702i()
            int r14 = r14 - r7
            if (r14 <= 0) goto L_0x044b
            int r1 = r14 >> 1
        L_0x0447:
            r14 = r10
            r29 = r11
            goto L_0x0470
        L_0x044b:
            int r2 = r1.f119970c
            if (r2 != 0) goto L_0x0456
            int r7 = r1.f119971d
            if (r7 != 0) goto L_0x0456
            int r1 = r14 / 2
            goto L_0x0447
        L_0x0456:
            double r7 = (double) r14
            r14 = r10
            r29 = r11
            double r10 = (double) r2
            java.lang.Double.isNaN(r7)
            java.lang.Double.isNaN(r10)
            double r7 = r7 * r10
            int r1 = r1.f119971d
            int r2 = r2 + r1
            double r1 = (double) r2
            java.lang.Double.isNaN(r1)
            double r7 = r7 / r1
            long r1 = java.lang.Math.round(r7)
            int r1 = (int) r1
        L_0x0470:
            r5.copyOnWrite()
            com.google.protobuf.bv r2 = r5.instance
            com.google.protos.aa.a.c r2 = (com.google.protos.p4753aa.p4754a.C63098c) r2
            int r7 = r2.f170265a
            r7 = r7 | 512(0x200, float:7.175E-43)
            r2.f170265a = r7
            r2.f170271g = r1
            if (r15 != 0) goto L_0x0482
            goto L_0x0488
        L_0x0482:
            int r1 = java.lang.Math.min(r13, r15)
            int r13 = r1 - r0
        L_0x0488:
            r5.copyOnWrite()
            com.google.protobuf.bv r0 = r5.instance
            com.google.protos.aa.a.c r0 = (com.google.protos.p4753aa.p4754a.C63098c) r0
            int r1 = r0.f170265a
            r1 = r1 | 128(0x80, float:1.794E-43)
            r0.f170265a = r1
            int r13 = r13 / 2
            r0.f170270f = r13
            boolean r0 = r18.mo49706m()
            if (r0 == 0) goto L_0x0503
            int r0 = r4.f119950b
            com.google.protobuf.bv r1 = r5.instance
            com.google.protos.aa.a.c r1 = (com.google.protos.p4753aa.p4754a.C63098c) r1
            int r1 = r1.f170267c
            int r0 = r0 + r1
            int r1 = r18.mo49696e()
            int r0 = r0 + r1
            int r0 = r0 + 8
            r1 = 1
            if (r9 <= r1) goto L_0x04e9
            int r1 = r4.f119950b
            r10 = r14
            r2 = r29
            java.lang.Object r4 = r10.get(r2)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r1 = r1 - r4
            r5.mo59178a(r1)
            r1 = 1
        L_0x04c6:
            if (r1 >= r9) goto L_0x04ec
            int r11 = r2 + r1
            java.lang.Object r4 = r10.get(r11)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r4 = r0 - r4
            r5.mo59178a(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r10.set(r11, r4)
            r4 = r12[r11]
            r7 = 1
            int r4 = r4 + r7
            r12[r11] = r4
            int r1 = r1 + 1
            goto L_0x04c6
        L_0x04e9:
            r10 = r14
            r2 = r29
        L_0x04ec:
            r7 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r10.set(r2, r1)
            r1 = r12[r2]
            int r1 = r1 + r7
            r12[r2] = r1
            int r6 = java.lang.Math.max(r6, r0)
            r0 = 0
        L_0x04fe:
            if (r0 >= r9) goto L_0x0504
            int r0 = r0 + 1
            goto L_0x04fe
        L_0x0503:
            r10 = r14
        L_0x0504:
            java.lang.String r0 = r18.mo49704k()
            com.google.protobuf.bv r1 = r5.build()
            com.google.protos.aa.a.c r1 = (com.google.protos.p4753aa.p4754a.C63098c) r1
            r3.put(r0, r1)
            int r8 = r28 + 1
            r9 = 1
            r0 = r30
            r1 = r31
            r11 = r19
            r4 = r21
            r15 = r22
            r14 = r23
            r13 = r24
            r7 = r25
            r2 = r26
            r5 = r27
            goto L_0x032b
        L_0x052a:
            r26 = r2
            r27 = r5
            r25 = r7
            com.google.protos.aa.a.e r0 = com.google.protos.p4753aa.p4754a.C63100e.f170276k
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.protos.aa.a.d r0 = (com.google.protos.p4753aa.p4754a.C63099d) r0
            int r1 = r2.f170279b
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.protos.aa.a.e r4 = (com.google.protos.p4753aa.p4754a.C63100e) r4
            int r5 = r4.f170278a
            r7 = 1
            r5 = r5 | r7
            r4.f170278a = r5
            int r1 = r1 + r7
            r4.f170279b = r1
            int r1 = r2.f170282e
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.protos.aa.a.e r4 = (com.google.protos.p4753aa.p4754a.C63100e) r4
            int r5 = r4.f170278a
            r5 = r5 | 32
            r4.f170278a = r5
            r4.f170282e = r1
            int r1 = r2.f170280c
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.protos.aa.a.e r2 = (com.google.protos.p4753aa.p4754a.C63100e) r2
            int r4 = r2.f170278a
            r4 = r4 | 8
            r2.f170278a = r4
            r2.f170280c = r1
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.protos.aa.a.e r1 = (com.google.protos.p4753aa.p4754a.C63100e) r1
            r2 = 5
            r1.f170281d = r2
            int r2 = r1.f170278a
            r2 = r2 | 16
            r1.f170278a = r2
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.protos.aa.a.e r1 = (com.google.protos.p4753aa.p4754a.C63100e) r1
            int r2 = r1.f170278a
            r2 = r2 | 64
            r1.f170278a = r2
            r5 = r27
            r1.f170285h = r5
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.protos.aa.a.e r1 = (com.google.protos.p4753aa.p4754a.C63100e) r1
            com.google.protobuf.ch r2 = r1.f170283f
            boolean r4 = r2.mo58948c()
            if (r4 != 0) goto L_0x05a2
            com.google.protobuf.ch r2 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62961ch) r2)
            r1.f170283f = r2
        L_0x05a2:
            com.google.protobuf.ch r1 = r1.f170283f
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r10, (java.util.List) r1)
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.protos.aa.a.e r1 = (com.google.protos.p4753aa.p4754a.C63100e) r1
            com.google.protobuf.ch r2 = r1.f170284g
            boolean r4 = r2.mo58948c()
            if (r4 != 0) goto L_0x05bc
            com.google.protobuf.ch r2 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62961ch) r2)
            r1.f170284g = r2
        L_0x05bc:
            com.google.protobuf.ch r1 = r1.f170284g
            r7 = r25
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r7, (java.util.List) r1)
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.protos.aa.a.e r1 = (com.google.protos.p4753aa.p4754a.C63100e) r1
            int r2 = r1.f170278a
            r2 = r2 | 512(0x200, float:7.175E-43)
            r1.f170278a = r2
            r1.f170287j = r6
            com.google.protobuf.bv r0 = r0.build()
            com.google.protos.aa.a.e r0 = (com.google.protos.p4753aa.p4754a.C63100e) r0
            r2 = 0
            r1 = r30
            r1.setOrientation(r2)
            com.google.protobuf.ch r0 = r0.f170284g
            int r0 = r0.size()
            android.widget.LinearLayout[] r2 = new android.widget.LinearLayout[r0]
            r4 = 0
        L_0x05e7:
            if (r4 >= r0) goto L_0x05fb
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            android.content.Context r6 = r30.getContext()
            r5.<init>(r6)
            r2[r4] = r5
            r6 = 1
            r5.setOrientation(r6)
            int r4 = r4 + 1
            goto L_0x05e7
        L_0x05fb:
            r4 = r31
            com.google.protobuf.cq r5 = r4.f179291a
            r5.size()
            android.content.res.Resources r5 = r30.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            r6 = 1090519040(0x41000000, float:8.0)
            float r6 = r6 * r5
            int r6 = (int) r6
            r7 = 0
        L_0x0612:
            com.google.protobuf.cq r8 = r4.f179291a
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x07bc
            com.google.protobuf.cq r8 = r4.f179291a
            java.lang.Object r8 = r8.get(r7)
            com.google.protos.w.a.a.h r8 = (com.google.protos.p5146w.p5147a.p5148a.C65930h) r8
            java.lang.String r10 = r8.f179303b
            java.lang.Object r10 = r3.get(r10)
            com.google.protos.aa.a.c r10 = (com.google.protos.p4753aa.p4754a.C63098c) r10
            if (r10 != 0) goto L_0x0633
            r19 = r3
            r10 = 1
            r13 = 5
            r14 = 0
            goto L_0x07b6
        L_0x0633:
            android.widget.FrameLayout$LayoutParams r11 = new android.widget.FrameLayout$LayoutParams
            int r12 = r10.f170268d
            float r12 = (float) r12
            float r12 = r12 * r5
            int r12 = (int) r12
            int r13 = r10.f170269e
            float r13 = (float) r13
            float r13 = r13 * r5
            int r13 = (int) r13
            r11.<init>(r12, r13)
            int r12 = r10.f170270f
            float r13 = (float) r12
            float r13 = r13 * r5
            int r13 = (int) r13
            int r14 = r10.f170271g
            float r14 = (float) r14
            float r14 = r14 * r5
            int r14 = (int) r14
            int r15 = r10.f170266b
            int r9 = r10.f170268d
            int r15 = r15 - r9
            int r15 = r15 - r12
            float r9 = (float) r15
            float r9 = r9 * r5
            int r9 = (int) r9
            r12 = 0
            r11.setMargins(r13, r14, r9, r12)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            int r12 = r10.f170266b
            float r12 = (float) r12
            float r12 = r12 * r5
            int r12 = (int) r12
            int r13 = r10.f170267c
            float r13 = (float) r13
            float r13 = r13 * r5
            int r13 = (int) r13
            r9.<init>(r12, r13)
            android.view.ViewGroup$MarginLayoutParams r12 = new android.view.ViewGroup$MarginLayoutParams
            int r13 = r9.width
            r14 = -2
            r12.<init>(r13, r14)
            int r13 = r10.f170273i
            if (r13 != 0) goto L_0x067d
            r14 = r6
            goto L_0x067e
        L_0x067d:
            r14 = 0
        L_0x067e:
            r13 = r2[r13]
            int r13 = r13.getChildCount()
            if (r13 == 0) goto L_0x0688
            r13 = r6
            goto L_0x0689
        L_0x0688:
            r13 = 0
        L_0x0689:
            r15 = 0
            r12.setMargins(r14, r13, r6, r15)
            android.content.Context r13 = r30.getContext()
            android.view.LayoutInflater r13 = android.view.LayoutInflater.from(r13)
            int r14 = r10.f170273i
            r14 = r2[r14]
            r19 = r3
            r3 = 2131625472(0x7f0e0600, float:1.8878153E38)
            android.view.View r3 = r13.inflate(r3, r14, r15)
            com.google.android.apps.gsa.staticplugins.images.viewer.ui.ThumbnailView r3 = (com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui.ThumbnailView) r3
            r3.setLayoutParams(r12)
            r3.mo93099a(r8, r11, r9)
            android.widget.FrameLayout r9 = r3.f285517a
            com.google.android.apps.gsa.staticplugins.images.viewer.ui.e r11 = new com.google.android.apps.gsa.staticplugins.images.viewer.ui.e
            android.content.Context r12 = r30.getContext()
            r13 = 2132088381(0x7f15163d, float:1.9817044E38)
            r11.<init>(r12, r13)
            androidx.core.p098j.C2043bi.m5526T(r9, r11)
            com.google.protobuf.bt r9 = com.google.protos.p5146w.p5147a.p5148a.C65937o.f179333l
            com.google.protobuf.bt r9 = com.google.protobuf.C62942bv.checkIsLite(r9)
            r8.mo58887l(r9)
            com.google.protobuf.bf r11 = r8.f169962ag
            com.google.protobuf.bs r9 = r9.f169971d
            boolean r9 = r11.mo58857o(r9)
            if (r9 == 0) goto L_0x0703
            android.widget.FrameLayout r9 = r3.f285517a
            android.content.Context r11 = r30.getContext()
            r12 = 1
            java.lang.Object[] r13 = new java.lang.Object[r12]
            com.google.protobuf.bt r12 = com.google.protos.p5146w.p5147a.p5148a.C65937o.f179333l
            com.google.protobuf.bt r12 = com.google.protobuf.C62942bv.checkIsLite(r12)
            r8.mo58887l(r12)
            com.google.protobuf.bf r14 = r8.f169962ag
            com.google.protobuf.bs r15 = r12.f169971d
            java.lang.Object r14 = r14.mo58854l(r15)
            if (r14 != 0) goto L_0x06ed
            java.lang.Object r12 = r12.f169969b
            goto L_0x06f1
        L_0x06ed:
            java.lang.Object r12 = r12.mo58889c(r14)
        L_0x06f1:
            com.google.protos.w.a.a.o r12 = (com.google.protos.p5146w.p5147a.p5148a.C65937o) r12
            java.lang.String r12 = r12.f179339e
            r14 = 0
            r13[r14] = r12
            r12 = 2132088365(0x7f15162d, float:1.9817011E38)
            java.lang.String r11 = r11.getString(r12, r13)
            r9.setContentDescription(r11)
            goto L_0x0704
        L_0x0703:
            r14 = 0
        L_0x0704:
            int r9 = r10.f170273i
            r9 = r2[r9]
            r9.addView(r3)
            com.google.android.libraries.logging.j r9 = new com.google.android.libraries.logging.j
            int r10 = r1.f285436b
            r9.<init>(r10)
            r10 = 1
            r9.mo33794h(r10)
            r11 = 5
            r9.mo33795i(r11)
            com.google.android.libraries.logging.C28295m.m52919e(r3, r9)
            com.google.protobuf.bt r9 = com.google.protos.p5146w.p5147a.p5148a.C65941s.f179350e
            com.google.protobuf.bt r9 = com.google.protobuf.C62942bv.checkIsLite(r9)
            r8.mo58887l(r9)
            com.google.protobuf.bf r11 = r8.f169962ag
            com.google.protobuf.bs r9 = r9.f169971d
            boolean r9 = r11.mo58857o(r9)
            if (r9 == 0) goto L_0x077f
            com.google.protobuf.bt r9 = com.google.protos.p5146w.p5147a.p5148a.C65937o.f179333l
            com.google.protobuf.bt r9 = com.google.protobuf.C62942bv.checkIsLite(r9)
            r8.mo58887l(r9)
            com.google.protobuf.bf r11 = r8.f169962ag
            com.google.protobuf.bs r9 = r9.f169971d
            boolean r9 = r11.mo58857o(r9)
            if (r9 == 0) goto L_0x077f
            android.view.View r9 = r3.f285519c
            com.google.protobuf.bt r11 = com.google.protos.p5146w.p5147a.p5148a.C65937o.f179333l
            com.google.protobuf.bt r11 = com.google.protobuf.C62942bv.checkIsLite(r11)
            r8.mo58887l(r11)
            com.google.protobuf.bf r12 = r8.f169962ag
            com.google.protobuf.bs r13 = r11.f169971d
            java.lang.Object r12 = r12.mo58854l(r13)
            if (r12 != 0) goto L_0x075b
            java.lang.Object r11 = r11.f169969b
            goto L_0x075f
        L_0x075b:
            java.lang.Object r11 = r11.mo58889c(r12)
        L_0x075f:
            com.google.protos.w.a.a.o r11 = (com.google.protos.p5146w.p5147a.p5148a.C65937o) r11
            java.lang.String r11 = r11.f179338d
            com.google.android.libraries.logging.j r12 = new com.google.android.libraries.logging.j
            r13 = 54069(0xd335, float:7.5767E-41)
            r12.<init>(r13)
            r13 = 5
            r12.mo33795i(r13)
            com.google.android.libraries.logging.C28295m.m52919e(r9, r12)
            com.google.android.apps.gsa.staticplugins.images.viewer.ui.p r12 = r1.f285435a
            com.google.android.apps.gsa.staticplugins.images.viewer.ui.cf r12 = r12.f285686h
            com.google.android.apps.gsa.staticplugins.images.viewer.ui.o r15 = new com.google.android.apps.gsa.staticplugins.images.viewer.ui.o
            r15.<init>(r1, r11)
            r12.mo93139f(r9, r8, r15)
            goto L_0x0780
        L_0x077f:
            r13 = 5
        L_0x0780:
            com.google.android.apps.gsa.staticplugins.images.viewer.ui.bk r8 = r1.f285438d
            android.widget.ImageView r9 = r3.f285518b
            android.widget.FrameLayout r11 = r3.f285517a
            com.google.protobuf.cq r12 = r4.f179291a
            java.lang.Object r12 = r12.get(r7)
            com.google.protos.w.a.a.h r12 = (com.google.protos.p5146w.p5147a.p5148a.C65930h) r12
            com.google.protos.w.a.a.f r12 = r12.f179304c
            if (r12 != 0) goto L_0x0794
            com.google.protos.w.a.a.f r12 = com.google.protos.p5146w.p5147a.p5148a.C65928f.f179293f
        L_0x0794:
            java.lang.String r12 = r12.f179296b
            com.google.android.apps.gsa.staticplugins.images.viewer.ui.RelatedContentHeader r15 = r8.f285607a
            com.google.android.apps.gsa.staticplugins.images.viewer.ui.p r15 = r15.f285505d
            com.google.android.apps.gsa.shared.y.au r15 = r15.f285680b
            r15.mo85421i(r12, r9)
            com.google.android.apps.gsa.staticplugins.images.viewer.ui.RelatedContentHeader r15 = r8.f285607a
            java.util.Map r15 = r15.f285510i
            r15.put(r9, r12)
            com.google.android.apps.gsa.staticplugins.images.viewer.ui.RelatedContentHeader r9 = r8.f285607a
            com.google.android.apps.gsa.staticplugins.images.viewer.ui.p r9 = r9.f285505d
            com.google.android.apps.gsa.staticplugins.images.viewer.ui.cf r12 = r9.f285686h
            com.google.protos.w.a.a.h r9 = r9.f285681c
            com.google.android.apps.gsa.staticplugins.images.viewer.ui.bj r15 = new com.google.android.apps.gsa.staticplugins.images.viewer.ui.bj
            r15.<init>(r8, r7)
            r12.mo93140g(r11, r3, r9, r15)
        L_0x07b6:
            int r7 = r7 + 1
            r3 = r19
            goto L_0x0612
        L_0x07bc:
            r14 = 0
            r6 = 0
        L_0x07be:
            if (r6 >= r0) goto L_0x07c8
            r3 = r2[r6]
            r1.addView(r3)
            int r6 = r6 + 1
            goto L_0x07be
        L_0x07c8:
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r2 = -2
            r3 = -1
            r0.<init>(r3, r2)
            r1.setLayoutParams(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui.ImageGridView.mo93070a(com.google.protos.w.a.a.d):void");
    }
}
