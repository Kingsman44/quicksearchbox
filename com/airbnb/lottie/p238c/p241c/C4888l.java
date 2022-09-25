package com.airbnb.lottie.p238c.p241c;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.p060c.C0981k;
import com.airbnb.lottie.C4825ac;
import com.airbnb.lottie.C4829ag;
import com.airbnb.lottie.C4964k;
import com.airbnb.lottie.p234a.p236b.C4807f;
import com.airbnb.lottie.p234a.p236b.C4820s;
import com.airbnb.lottie.p234a.p236b.C4822u;
import com.airbnb.lottie.p238c.p239a.C4843a;
import com.airbnb.lottie.p238c.p239a.C4844b;
import com.airbnb.lottie.p238c.p239a.C4853k;
import com.airbnb.lottie.p246g.C4958c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.airbnb.lottie.c.c.l */
/* compiled from: PG */
public final class C4888l extends C4878b {

    /* renamed from: A */
    private C4807f f15599A;

    /* renamed from: h */
    private final StringBuilder f15600h = new StringBuilder(2);

    /* renamed from: i */
    private final RectF f15601i = new RectF();

    /* renamed from: j */
    private final Matrix f15602j = new Matrix();

    /* renamed from: k */
    private final Paint f15603k = new C4886j();

    /* renamed from: l */
    private final Paint f15604l = new C4887k();

    /* renamed from: m */
    private final Map f15605m = new HashMap();

    /* renamed from: n */
    private final C0981k f15606n = new C0981k(10);

    /* renamed from: o */
    private final C4820s f15607o;

    /* renamed from: p */
    private final C4825ac f15608p;

    /* renamed from: q */
    private final C4964k f15609q;

    /* renamed from: r */
    private C4807f f15610r;

    /* renamed from: s */
    private C4807f f15611s;

    /* renamed from: t */
    private C4807f f15612t;

    /* renamed from: u */
    private C4807f f15613u;

    /* renamed from: v */
    private C4807f f15614v;

    /* renamed from: w */
    private C4807f f15615w;

    /* renamed from: x */
    private C4807f f15616x;

    /* renamed from: y */
    private C4807f f15617y;

    /* renamed from: z */
    private C4807f f15618z;

    public C4888l(C4825ac acVar, C4882f fVar) {
        super(acVar, fVar);
        C4844b bVar;
        C4844b bVar2;
        C4843a aVar;
        C4843a aVar2;
        this.f15608p = acVar;
        this.f15609q = fVar.f15571b;
        C4820s d = fVar.f15585p.mo9797a();
        this.f15607o = d;
        d.mo9740g(this);
        mo9811h(d);
        C4853k kVar = fVar.f15586q;
        if (!(kVar == null || (aVar2 = kVar.f15425a) == null)) {
            C4807f a = aVar2.mo9797a();
            this.f15610r = a;
            a.mo9740g(this);
            mo9811h(this.f15610r);
        }
        if (!(kVar == null || (aVar = kVar.f15426b) == null)) {
            C4807f a2 = aVar.mo9797a();
            this.f15612t = a2;
            a2.mo9740g(this);
            mo9811h(this.f15612t);
        }
        if (!(kVar == null || (bVar2 = kVar.f15427c) == null)) {
            C4807f a3 = bVar2.mo9797a();
            this.f15614v = a3;
            a3.mo9740g(this);
            mo9811h(this.f15614v);
        }
        if (kVar != null && (bVar = kVar.f15428d) != null) {
            C4807f a4 = bVar.mo9797a();
            this.f15616x = a4;
            a4.mo9740g(this);
            mo9811h(this.f15616x);
        }
    }

    /* renamed from: q */
    private static final void m13573q(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
            }
        }
    }

    /* renamed from: r */
    private static final void m13574r(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawPath(path, paint);
            }
        }
    }

    /* renamed from: s */
    private static final List m13575s(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }

    /* renamed from: a */
    public final void mo9714a(Object obj, C4958c cVar) {
        this.f15545g.mo9754e(obj, cVar);
        if (obj == C4829ag.f15370a) {
            C4807f fVar = this.f15611s;
            if (fVar != null) {
                mo9813j(fVar);
            }
            C4822u uVar = new C4822u(cVar);
            this.f15611s = uVar;
            uVar.mo9740g(this);
            mo9811h(this.f15611s);
        } else if (obj == C4829ag.f15371b) {
            C4807f fVar2 = this.f15613u;
            if (fVar2 != null) {
                mo9813j(fVar2);
            }
            C4822u uVar2 = new C4822u(cVar);
            this.f15613u = uVar2;
            uVar2.mo9740g(this);
            mo9811h(this.f15613u);
        } else if (obj == C4829ag.f15386q) {
            C4807f fVar3 = this.f15615w;
            if (fVar3 != null) {
                mo9813j(fVar3);
            }
            C4822u uVar3 = new C4822u(cVar);
            this.f15615w = uVar3;
            uVar3.mo9740g(this);
            mo9811h(this.f15615w);
        } else if (obj == C4829ag.f15387r) {
            C4807f fVar4 = this.f15617y;
            if (fVar4 != null) {
                mo9813j(fVar4);
            }
            C4822u uVar4 = new C4822u(cVar);
            this.f15617y = uVar4;
            uVar4.mo9740g(this);
            mo9811h(this.f15617y);
        } else if (obj == C4829ag.f15365D) {
            C4807f fVar5 = this.f15618z;
            if (fVar5 != null) {
                mo9813j(fVar5);
            }
            C4822u uVar5 = new C4822u(cVar);
            this.f15618z = uVar5;
            uVar5.mo9740g(this);
            mo9811h(this.f15618z);
        } else if (obj == C4829ag.f15368G) {
            C4807f fVar6 = this.f15599A;
            if (fVar6 != null) {
                mo9813j(fVar6);
            }
            C4822u uVar6 = new C4822u(cVar);
            this.f15599A = uVar6;
            uVar6.mo9740g(this);
            mo9811h(this.f15599A);
        }
    }

    /* renamed from: c */
    public final void mo9716c(RectF rectF, Matrix matrix, boolean z) {
        super.mo9716c(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, (float) this.f15609q.f15759h.width(), (float) this.f15609q.f15759h.height());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:82:0x02cc, code lost:
        if (r4 == null) goto L_0x02ce;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x034d  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x03e5  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9812i(android.graphics.Canvas r21, android.graphics.Matrix r22, int r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r21.save()
            com.airbnb.lottie.ac r2 = r0.f15608p
            boolean r2 = r2.mo9776m()
            if (r2 != 0) goto L_0x0012
            r21.concat(r22)
        L_0x0012:
            com.airbnb.lottie.a.b.s r2 = r0.f15607o
            java.lang.Object r2 = r2.mo9738e()
            com.airbnb.lottie.c.b r2 = (com.airbnb.lottie.p238c.C4857b) r2
            com.airbnb.lottie.k r3 = r0.f15609q
            java.util.Map r3 = r3.f15755d
            java.lang.String r4 = r2.f15440b
            java.lang.Object r3 = r3.get(r4)
            com.airbnb.lottie.c.c r3 = (com.airbnb.lottie.p238c.C4876c) r3
            if (r3 != 0) goto L_0x002c
            r21.restore()
            return
        L_0x002c:
            com.airbnb.lottie.a.b.f r4 = r0.f15611s
            if (r4 == 0) goto L_0x0046
            android.graphics.Paint r5 = r0.f15603k
            com.airbnb.lottie.a.b.u r4 = (com.airbnb.lottie.p234a.p236b.C4822u) r4
            com.airbnb.lottie.g.c r4 = r4.f15301d
            com.airbnb.lottie.g.b r6 = r4.f15746b
            java.lang.Object r4 = r4.mo9900a()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5.setColor(r4)
            goto L_0x0061
        L_0x0046:
            com.airbnb.lottie.a.b.f r4 = r0.f15610r
            if (r4 == 0) goto L_0x005a
            android.graphics.Paint r5 = r0.f15603k
            java.lang.Object r4 = r4.mo9738e()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5.setColor(r4)
            goto L_0x0061
        L_0x005a:
            android.graphics.Paint r4 = r0.f15603k
            int r5 = r2.f15445g
            r4.setColor(r5)
        L_0x0061:
            com.airbnb.lottie.a.b.f r4 = r0.f15613u
            if (r4 == 0) goto L_0x007b
            android.graphics.Paint r5 = r0.f15604l
            com.airbnb.lottie.a.b.u r4 = (com.airbnb.lottie.p234a.p236b.C4822u) r4
            com.airbnb.lottie.g.c r4 = r4.f15301d
            com.airbnb.lottie.g.b r6 = r4.f15746b
            java.lang.Object r4 = r4.mo9900a()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5.setColor(r4)
            goto L_0x0096
        L_0x007b:
            com.airbnb.lottie.a.b.f r4 = r0.f15612t
            if (r4 == 0) goto L_0x008f
            android.graphics.Paint r5 = r0.f15604l
            java.lang.Object r4 = r4.mo9738e()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5.setColor(r4)
            goto L_0x0096
        L_0x008f:
            android.graphics.Paint r4 = r0.f15604l
            int r5 = r2.f15446h
            r4.setColor(r5)
        L_0x0096:
            com.airbnb.lottie.a.b.t r4 = r0.f15545g
            com.airbnb.lottie.a.b.f r4 = r4.f15330e
            r5 = 100
            if (r4 != 0) goto L_0x00a1
            r4 = 100
            goto L_0x00ab
        L_0x00a1:
            java.lang.Object r4 = r4.mo9738e()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
        L_0x00ab:
            int r4 = r4 * 255
            int r4 = r4 / r5
            android.graphics.Paint r5 = r0.f15603k
            r5.setAlpha(r4)
            android.graphics.Paint r5 = r0.f15604l
            r5.setAlpha(r4)
            com.airbnb.lottie.a.b.f r4 = r0.f15615w
            if (r4 == 0) goto L_0x00d2
            android.graphics.Paint r5 = r0.f15604l
            com.airbnb.lottie.a.b.u r4 = (com.airbnb.lottie.p234a.p236b.C4822u) r4
            com.airbnb.lottie.g.c r4 = r4.f15301d
            com.airbnb.lottie.g.b r6 = r4.f15746b
            java.lang.Object r4 = r4.mo9900a()
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r5.setStrokeWidth(r4)
            goto L_0x00f9
        L_0x00d2:
            com.airbnb.lottie.a.b.f r4 = r0.f15614v
            if (r4 == 0) goto L_0x00e6
            android.graphics.Paint r5 = r0.f15604l
            java.lang.Object r4 = r4.mo9738e()
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r5.setStrokeWidth(r4)
            goto L_0x00f9
        L_0x00e6:
            float r4 = com.airbnb.lottie.p245f.C4954k.m13720c(r22)
            android.graphics.Paint r5 = r0.f15604l
            float r6 = r2.f15447i
            float r7 = com.airbnb.lottie.p245f.C4954k.m13718a()
            float r6 = r6 * r7
            float r6 = r6 * r4
            r5.setStrokeWidth(r6)
        L_0x00f9:
            com.airbnb.lottie.ac r4 = r0.f15608p
            boolean r4 = r4.mo9776m()
            r7 = 1120403456(0x42c80000, float:100.0)
            if (r4 == 0) goto L_0x02bc
            com.airbnb.lottie.a.b.f r4 = r0.f15618z
            if (r4 == 0) goto L_0x0118
            com.airbnb.lottie.a.b.u r4 = (com.airbnb.lottie.p234a.p236b.C4822u) r4
            com.airbnb.lottie.g.c r4 = r4.f15301d
            com.airbnb.lottie.g.b r10 = r4.f15746b
            java.lang.Object r4 = r4.mo9900a()
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            goto L_0x011a
        L_0x0118:
            float r4 = r2.f15441c
        L_0x011a:
            float r4 = r4 / r7
            float r7 = com.airbnb.lottie.p245f.C4954k.m13720c(r22)
            java.lang.String r10 = r2.f15439a
            float r11 = r2.f15443e
            float r12 = com.airbnb.lottie.p245f.C4954k.m13718a()
            float r11 = r11 * r12
            java.util.List r10 = m13575s(r10)
            int r12 = r10.size()
            r13 = 0
        L_0x0132:
            if (r13 >= r12) goto L_0x04ca
            java.lang.Object r14 = r10.get(r13)
            java.lang.String r14 = (java.lang.String) r14
            r6 = 0
            r15 = 0
        L_0x013c:
            int r9 = r14.length()
            if (r15 >= r9) goto L_0x0188
            char r9 = r14.charAt(r15)
            java.lang.String r8 = r3.f15535a
            java.lang.String r5 = r3.f15537c
            int r5 = com.airbnb.lottie.p238c.C4889d.m13579a(r9, r8, r5)
            com.airbnb.lottie.k r8 = r0.f15609q
            androidx.c.o r8 = r8.f15756e
            java.lang.Object r5 = r8.mo3726e(r5)
            com.airbnb.lottie.c.d r5 = (com.airbnb.lottie.p238c.C4889d) r5
            if (r5 == 0) goto L_0x017d
            double r8 = (double) r6
            double r5 = r5.f15620b
            r17 = r10
            r16 = r11
            double r10 = (double) r4
            java.lang.Double.isNaN(r10)
            double r5 = r5 * r10
            float r10 = com.airbnb.lottie.p245f.C4954k.m13718a()
            double r10 = (double) r10
            java.lang.Double.isNaN(r10)
            double r5 = r5 * r10
            double r10 = (double) r7
            java.lang.Double.isNaN(r10)
            double r5 = r5 * r10
            java.lang.Double.isNaN(r8)
            double r8 = r8 + r5
            float r6 = (float) r8
            goto L_0x0181
        L_0x017d:
            r17 = r10
            r16 = r11
        L_0x0181:
            int r15 = r15 + 1
            r11 = r16
            r10 = r17
            goto L_0x013c
        L_0x0188:
            r17 = r10
            r16 = r11
            r21.save()
            int r5 = r2.f15449k
            m13572p(r5, r1, r6)
            float r5 = (float) r13
            float r5 = r5 * r16
            int r6 = r12 + -1
            float r6 = (float) r6
            float r6 = r6 * r16
            r8 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r8
            float r5 = r5 - r6
            r6 = 0
            r1.translate(r6, r5)
            r5 = 0
        L_0x01a5:
            int r6 = r14.length()
            if (r5 >= r6) goto L_0x02ad
            char r6 = r14.charAt(r5)
            java.lang.String r8 = r3.f15535a
            java.lang.String r9 = r3.f15537c
            int r6 = com.airbnb.lottie.p238c.C4889d.m13579a(r6, r8, r9)
            com.airbnb.lottie.k r8 = r0.f15609q
            androidx.c.o r8 = r8.f15756e
            java.lang.Object r6 = r8.mo3726e(r6)
            com.airbnb.lottie.c.d r6 = (com.airbnb.lottie.p238c.C4889d) r6
            if (r6 != 0) goto L_0x01c9
            r15 = r22
            r19 = r12
            goto L_0x02a7
        L_0x01c9:
            java.util.Map r8 = r0.f15605m
            boolean r8 = r8.containsKey(r6)
            if (r8 == 0) goto L_0x01da
            java.util.Map r8 = r0.f15605m
            java.lang.Object r8 = r8.get(r6)
            java.util.List r8 = (java.util.List) r8
            goto L_0x0209
        L_0x01da:
            java.util.List r8 = r6.f15619a
            int r9 = r8.size()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r9)
            r11 = 0
        L_0x01e6:
            if (r11 >= r9) goto L_0x0203
            java.lang.Object r15 = r8.get(r11)
            com.airbnb.lottie.c.b.m r15 = (com.airbnb.lottie.p238c.p240b.C4870m) r15
            r18 = r8
            com.airbnb.lottie.a.a.e r8 = new com.airbnb.lottie.a.a.e
            r19 = r9
            com.airbnb.lottie.ac r9 = r0.f15608p
            r8.<init>(r9, r0, r15)
            r10.add(r8)
            int r11 = r11 + 1
            r8 = r18
            r9 = r19
            goto L_0x01e6
        L_0x0203:
            java.util.Map r8 = r0.f15605m
            r8.put(r6, r10)
            r8 = r10
        L_0x0209:
            r9 = 0
        L_0x020a:
            int r10 = r8.size()
            if (r9 >= r10) goto L_0x0264
            java.lang.Object r10 = r8.get(r9)
            com.airbnb.lottie.a.a.e r10 = (com.airbnb.lottie.p234a.p235a.C4786e) r10
            android.graphics.Path r10 = r10.mo9724i()
            android.graphics.RectF r11 = r0.f15601i
            r15 = 0
            r10.computeBounds(r11, r15)
            android.graphics.Matrix r11 = r0.f15602j
            r15 = r22
            r11.set(r15)
            android.graphics.Matrix r11 = r0.f15602j
            r18 = r8
            float r8 = r2.f15444f
            float r8 = -r8
            float r19 = com.airbnb.lottie.p245f.C4954k.m13718a()
            float r8 = r8 * r19
            r19 = r12
            r12 = 0
            r11.preTranslate(r12, r8)
            android.graphics.Matrix r8 = r0.f15602j
            r8.preScale(r4, r4)
            android.graphics.Matrix r8 = r0.f15602j
            r10.transform(r8)
            boolean r8 = r2.f15448j
            if (r8 == 0) goto L_0x0253
            android.graphics.Paint r8 = r0.f15603k
            m13574r(r10, r8, r1)
            android.graphics.Paint r8 = r0.f15604l
            m13574r(r10, r8, r1)
            goto L_0x025d
        L_0x0253:
            android.graphics.Paint r8 = r0.f15604l
            m13574r(r10, r8, r1)
            android.graphics.Paint r8 = r0.f15603k
            m13574r(r10, r8, r1)
        L_0x025d:
            int r9 = r9 + 1
            r8 = r18
            r12 = r19
            goto L_0x020a
        L_0x0264:
            r15 = r22
            r19 = r12
            double r8 = r6.f15620b
            float r6 = (float) r8
            float r6 = r6 * r4
            float r8 = com.airbnb.lottie.p245f.C4954k.m13718a()
            float r6 = r6 * r8
            float r6 = r6 * r7
            int r8 = r2.f15442d
            float r8 = (float) r8
            r9 = 1092616192(0x41200000, float:10.0)
            float r8 = r8 / r9
            com.airbnb.lottie.a.b.f r9 = r0.f15617y
            if (r9 == 0) goto L_0x0291
            com.airbnb.lottie.a.b.u r9 = (com.airbnb.lottie.p234a.p236b.C4822u) r9
            com.airbnb.lottie.g.c r9 = r9.f15301d
            com.airbnb.lottie.g.b r10 = r9.f15746b
            java.lang.Object r9 = r9.mo9900a()
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
        L_0x028f:
            float r8 = r8 + r9
            goto L_0x02a0
        L_0x0291:
            com.airbnb.lottie.a.b.f r9 = r0.f15616x
            if (r9 == 0) goto L_0x02a0
            java.lang.Object r9 = r9.mo9738e()
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            goto L_0x028f
        L_0x02a0:
            float r8 = r8 * r7
            float r6 = r6 + r8
            r8 = 0
            r1.translate(r6, r8)
        L_0x02a7:
            int r5 = r5 + 1
            r12 = r19
            goto L_0x01a5
        L_0x02ad:
            r15 = r22
            r19 = r12
            r21.restore()
            int r13 = r13 + 1
            r11 = r16
            r10 = r17
            goto L_0x0132
        L_0x02bc:
            com.airbnb.lottie.a.b.f r4 = r0.f15599A
            if (r4 == 0) goto L_0x02ce
            com.airbnb.lottie.a.b.u r4 = (com.airbnb.lottie.p234a.p236b.C4822u) r4
            com.airbnb.lottie.g.c r4 = r4.f15301d
            com.airbnb.lottie.g.b r5 = r4.f15746b
            java.lang.Object r4 = r4.mo9900a()
            android.graphics.Typeface r4 = (android.graphics.Typeface) r4
            if (r4 != 0) goto L_0x035d
        L_0x02ce:
            com.airbnb.lottie.ac r4 = r0.f15608p
            java.lang.String r5 = r3.f15535a
            java.lang.String r3 = r3.f15537c
            android.graphics.drawable.Drawable$Callback r6 = r4.getCallback()
            r8 = 0
            if (r6 != 0) goto L_0x02dd
            r4 = r8
            goto L_0x02ee
        L_0x02dd:
            com.airbnb.lottie.b.a r6 = r4.f15349i
            if (r6 != 0) goto L_0x02ec
            com.airbnb.lottie.b.a r6 = new com.airbnb.lottie.b.a
            android.graphics.drawable.Drawable$Callback r9 = r4.getCallback()
            r6.<init>(r9)
            r4.f15349i = r6
        L_0x02ec:
            com.airbnb.lottie.b.a r4 = r4.f15349i
        L_0x02ee:
            if (r4 == 0) goto L_0x0359
            com.airbnb.lottie.c.i r6 = r4.f15410a
            r6.f15629a = r5
            r6.f15630b = r3
            java.util.Map r9 = r4.f15411b
            java.lang.Object r6 = r9.get(r6)
            android.graphics.Typeface r6 = (android.graphics.Typeface) r6
            if (r6 == 0) goto L_0x0302
        L_0x0300:
            r4 = r6
            goto L_0x035a
        L_0x0302:
            java.util.Map r6 = r4.f15412c
            java.lang.Object r6 = r6.get(r5)
            android.graphics.Typeface r6 = (android.graphics.Typeface) r6
            if (r6 == 0) goto L_0x030d
            goto L_0x032b
        L_0x030d:
            java.lang.String r6 = r4.f15414e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "fonts/"
            r9.<init>(r10)
            r9.append(r5)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            android.content.res.AssetManager r9 = r4.f15413d
            android.graphics.Typeface r6 = android.graphics.Typeface.createFromAsset(r9, r6)
            java.util.Map r9 = r4.f15412c
            r9.put(r5, r6)
        L_0x032b:
            java.lang.String r5 = "Italic"
            boolean r5 = r3.contains(r5)
            java.lang.String r9 = "Bold"
            boolean r15 = r3.contains(r9)
            if (r5 == 0) goto L_0x033e
            if (r15 == 0) goto L_0x033d
            r15 = 3
            goto L_0x0347
        L_0x033d:
            r15 = 0
        L_0x033e:
            if (r5 == 0) goto L_0x0342
            r15 = 2
            goto L_0x0347
        L_0x0342:
            if (r15 == 0) goto L_0x0346
            r15 = 1
            goto L_0x0347
        L_0x0346:
            r15 = 0
        L_0x0347:
            int r3 = r6.getStyle()
            if (r3 == r15) goto L_0x0351
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r15)
        L_0x0351:
            java.util.Map r3 = r4.f15411b
            com.airbnb.lottie.c.i r4 = r4.f15410a
            r3.put(r4, r6)
            goto L_0x0300
        L_0x0359:
            r4 = r8
        L_0x035a:
            if (r4 != 0) goto L_0x035d
            r4 = r8
        L_0x035d:
            if (r4 == 0) goto L_0x04ca
            java.lang.String r3 = r2.f15439a
            android.graphics.Paint r5 = r0.f15603k
            r5.setTypeface(r4)
            com.airbnb.lottie.a.b.f r4 = r0.f15618z
            if (r4 == 0) goto L_0x037b
            com.airbnb.lottie.a.b.u r4 = (com.airbnb.lottie.p234a.p236b.C4822u) r4
            com.airbnb.lottie.g.c r4 = r4.f15301d
            com.airbnb.lottie.g.b r5 = r4.f15746b
            java.lang.Object r4 = r4.mo9900a()
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            goto L_0x037d
        L_0x037b:
            float r4 = r2.f15441c
        L_0x037d:
            android.graphics.Paint r5 = r0.f15603k
            float r6 = com.airbnb.lottie.p245f.C4954k.m13718a()
            float r6 = r6 * r4
            r5.setTextSize(r6)
            android.graphics.Paint r5 = r0.f15604l
            android.graphics.Paint r6 = r0.f15603k
            android.graphics.Typeface r6 = r6.getTypeface()
            r5.setTypeface(r6)
            android.graphics.Paint r5 = r0.f15604l
            android.graphics.Paint r6 = r0.f15603k
            float r6 = r6.getTextSize()
            r5.setTextSize(r6)
            float r5 = r2.f15443e
            float r6 = com.airbnb.lottie.p245f.C4954k.m13718a()
            float r5 = r5 * r6
            int r6 = r2.f15442d
            float r6 = (float) r6
            r8 = 1092616192(0x41200000, float:10.0)
            float r6 = r6 / r8
            com.airbnb.lottie.a.b.f r8 = r0.f15617y
            if (r8 == 0) goto L_0x03c2
            com.airbnb.lottie.a.b.u r8 = (com.airbnb.lottie.p234a.p236b.C4822u) r8
            com.airbnb.lottie.g.c r8 = r8.f15301d
            com.airbnb.lottie.g.b r9 = r8.f15746b
            java.lang.Object r8 = r8.mo9900a()
            java.lang.Float r8 = (java.lang.Float) r8
            float r8 = r8.floatValue()
        L_0x03c0:
            float r6 = r6 + r8
            goto L_0x03d1
        L_0x03c2:
            com.airbnb.lottie.a.b.f r8 = r0.f15616x
            if (r8 == 0) goto L_0x03d1
            java.lang.Object r8 = r8.mo9738e()
            java.lang.Float r8 = (java.lang.Float) r8
            float r8 = r8.floatValue()
            goto L_0x03c0
        L_0x03d1:
            float r8 = com.airbnb.lottie.p245f.C4954k.m13718a()
            float r6 = r6 * r8
            float r6 = r6 * r4
            float r6 = r6 / r7
            java.util.List r3 = m13575s(r3)
            int r4 = r3.size()
            r15 = 0
        L_0x03e3:
            if (r15 >= r4) goto L_0x04ca
            java.lang.Object r7 = r3.get(r15)
            java.lang.String r7 = (java.lang.String) r7
            android.graphics.Paint r8 = r0.f15604l
            float r8 = r8.measureText(r7)
            int r9 = r7.length()
            r21.save()
            int r10 = r2.f15449k
            int r9 = r9 + -1
            float r9 = (float) r9
            float r9 = r9 * r6
            float r8 = r8 + r9
            m13572p(r10, r1, r8)
            float r8 = (float) r15
            float r8 = r8 * r5
            int r9 = r4 + -1
            float r9 = (float) r9
            float r9 = r9 * r5
            r10 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r10
            float r8 = r8 - r9
            r9 = 0
            r1.translate(r9, r8)
            r8 = 0
        L_0x0414:
            int r9 = r7.length()
            if (r8 >= r9) goto L_0x04c2
            int r9 = r7.codePointAt(r8)
            int r11 = java.lang.Character.charCount(r9)
            int r11 = r11 + r8
        L_0x0423:
            int r12 = r7.length()
            if (r11 >= r12) goto L_0x045d
            int r12 = r7.codePointAt(r11)
            int r13 = java.lang.Character.getType(r12)
            r14 = 16
            if (r13 == r14) goto L_0x0454
            int r13 = java.lang.Character.getType(r12)
            r14 = 27
            if (r13 == r14) goto L_0x0454
            int r13 = java.lang.Character.getType(r12)
            r14 = 6
            if (r13 == r14) goto L_0x0454
            int r13 = java.lang.Character.getType(r12)
            r14 = 28
            if (r13 == r14) goto L_0x0454
            int r13 = java.lang.Character.getType(r12)
            r14 = 19
            if (r13 != r14) goto L_0x045d
        L_0x0454:
            int r13 = java.lang.Character.charCount(r12)
            int r11 = r11 + r13
            int r9 = r9 * 31
            int r9 = r9 + r12
            goto L_0x0423
        L_0x045d:
            long r12 = (long) r9
            androidx.c.k r9 = r0.f15606n
            boolean r9 = r9.mo3685l(r12)
            if (r9 == 0) goto L_0x046f
            androidx.c.k r9 = r0.f15606n
            java.lang.Object r9 = r9.mo3678e(r12)
            java.lang.String r9 = (java.lang.String) r9
            goto L_0x0495
        L_0x046f:
            java.lang.StringBuilder r9 = r0.f15600h
            r14 = 0
            r9.setLength(r14)
            r9 = r8
        L_0x0476:
            if (r9 >= r11) goto L_0x048a
            int r10 = r7.codePointAt(r9)
            java.lang.StringBuilder r14 = r0.f15600h
            r14.appendCodePoint(r10)
            int r10 = java.lang.Character.charCount(r10)
            int r9 = r9 + r10
            r10 = 1073741824(0x40000000, float:2.0)
            r14 = 0
            goto L_0x0476
        L_0x048a:
            java.lang.StringBuilder r9 = r0.f15600h
            java.lang.String r9 = r9.toString()
            androidx.c.k r10 = r0.f15606n
            r10.mo3682i(r12, r9)
        L_0x0495:
            int r10 = r9.length()
            int r8 = r8 + r10
            boolean r10 = r2.f15448j
            if (r10 == 0) goto L_0x04a9
            android.graphics.Paint r10 = r0.f15603k
            m13573q(r9, r10, r1)
            android.graphics.Paint r10 = r0.f15604l
            m13573q(r9, r10, r1)
            goto L_0x04b3
        L_0x04a9:
            android.graphics.Paint r10 = r0.f15604l
            m13573q(r9, r10, r1)
            android.graphics.Paint r10 = r0.f15603k
            m13573q(r9, r10, r1)
        L_0x04b3:
            android.graphics.Paint r10 = r0.f15603k
            float r9 = r10.measureText(r9)
            float r9 = r9 + r6
            r10 = 0
            r1.translate(r9, r10)
            r10 = 1073741824(0x40000000, float:2.0)
            goto L_0x0414
        L_0x04c2:
            r10 = 0
            r21.restore()
            int r15 = r15 + 1
            goto L_0x03e3
        L_0x04ca:
            r21.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p238c.p241c.C4888l.mo9812i(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    /* renamed from: p */
    private static final void m13572p(int i, Canvas canvas, float f) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 1) {
            canvas.translate(-f, 0.0f);
        } else if (i2 == 2) {
            canvas.translate((-f) / 2.0f, 0.0f);
        }
    }
}
