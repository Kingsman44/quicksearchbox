package com.airbnb.lottie.p234a.p235a;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.p060c.C0981k;
import com.airbnb.lottie.C4825ac;
import com.airbnb.lottie.C4829ag;
import com.airbnb.lottie.p234a.C4781a;
import com.airbnb.lottie.p234a.p236b.C4802a;
import com.airbnb.lottie.p234a.p236b.C4807f;
import com.airbnb.lottie.p234a.p236b.C4822u;
import com.airbnb.lottie.p238c.C4890e;
import com.airbnb.lottie.p238c.p240b.C4861d;
import com.airbnb.lottie.p238c.p241c.C4878b;
import com.airbnb.lottie.p245f.C4949f;
import com.airbnb.lottie.p246g.C4957b;
import com.airbnb.lottie.p246g.C4958c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.i */
/* compiled from: PG */
public final class C4790i implements C4787f, C4802a, C4793l {

    /* renamed from: a */
    private final String f15207a;

    /* renamed from: b */
    private final boolean f15208b;

    /* renamed from: c */
    private final C4878b f15209c;

    /* renamed from: d */
    private final C0981k f15210d = new C0981k(10);

    /* renamed from: e */
    private final C0981k f15211e = new C0981k(10);

    /* renamed from: f */
    private final Path f15212f;

    /* renamed from: g */
    private final Paint f15213g;

    /* renamed from: h */
    private final RectF f15214h;

    /* renamed from: i */
    private final List f15215i;

    /* renamed from: j */
    private final C4807f f15216j;

    /* renamed from: k */
    private final C4807f f15217k;

    /* renamed from: l */
    private final C4807f f15218l;

    /* renamed from: m */
    private final C4807f f15219m;

    /* renamed from: n */
    private C4807f f15220n;

    /* renamed from: o */
    private C4822u f15221o;

    /* renamed from: p */
    private final C4825ac f15222p;

    /* renamed from: q */
    private final int f15223q;

    /* renamed from: r */
    private final int f15224r;

    public C4790i(C4825ac acVar, C4878b bVar, C4861d dVar) {
        Path path = new Path();
        this.f15212f = path;
        this.f15213g = new C4781a(1);
        this.f15214h = new RectF();
        this.f15215i = new ArrayList();
        this.f15209c = bVar;
        this.f15207a = dVar.f15462f;
        this.f15208b = dVar.f15463g;
        this.f15222p = acVar;
        this.f15224r = dVar.f15464h;
        path.setFillType(dVar.f15457a);
        this.f15223q = (int) (acVar.f15341a.mo9905a() / 32.0f);
        C4807f a = dVar.f15458b.mo9797a();
        this.f15216j = a;
        a.mo9740g(this);
        bVar.mo9811h(a);
        C4807f a2 = dVar.f15459c.mo9797a();
        this.f15217k = a2;
        a2.mo9740g(this);
        bVar.mo9811h(a2);
        C4807f a3 = dVar.f15460d.mo9797a();
        this.f15218l = a3;
        a3.mo9740g(this);
        bVar.mo9811h(a3);
        C4807f a4 = dVar.f15461e.mo9797a();
        this.f15219m = a4;
        a4.mo9740g(this);
        bVar.mo9811h(a4);
    }

    /* renamed from: h */
    private final int m13344h() {
        int round = Math.round(this.f15218l.f15300c * ((float) this.f15223q));
        int round2 = Math.round(this.f15219m.f15300c * ((float) this.f15223q));
        int round3 = Math.round(this.f15216j.f15300c * ((float) this.f15223q));
        int i = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    /* renamed from: i */
    private final int[] m13345i(int[] iArr) {
        C4822u uVar = this.f15221o;
        if (uVar != null) {
            C4958c cVar = uVar.f15301d;
            C4957b bVar = cVar.f15746b;
            Integer[] numArr = (Integer[]) cVar.mo9900a();
            int length = iArr.length;
            int length2 = numArr.length;
            int i = 0;
            if (length == length2) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[length2];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    /* renamed from: a */
    public final void mo9714a(Object obj, C4958c cVar) {
        if (obj == C4829ag.f15373d) {
            this.f15217k.f15301d = cVar;
        } else if (obj == C4829ag.f15366E) {
            C4807f fVar = this.f15220n;
            if (fVar != null) {
                this.f15209c.mo9813j(fVar);
            }
            C4822u uVar = new C4822u(cVar);
            this.f15220n = uVar;
            uVar.mo9740g(this);
            this.f15209c.mo9811h(this.f15220n);
        } else if (obj == C4829ag.f15367F) {
            C4822u uVar2 = this.f15221o;
            if (uVar2 != null) {
                this.f15209c.mo9813j(uVar2);
            }
            this.f15210d.mo3681h();
            this.f15211e.mo3681h();
            C4822u uVar3 = new C4822u(cVar);
            this.f15221o = uVar3;
            uVar3.mo9740g(this);
            this.f15209c.mo9811h(this.f15221o);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: android.graphics.LinearGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: android.graphics.RadialGradient} */
    /* JADX WARNING: type inference failed for: r4v22, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9715b(android.graphics.Canvas r17, android.graphics.Matrix r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r0.f15208b
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            android.graphics.Path r2 = r0.f15212f
            r2.reset()
            r2 = 0
            r3 = 0
        L_0x0010:
            java.util.List r4 = r0.f15215i
            int r4 = r4.size()
            if (r3 >= r4) goto L_0x002c
            android.graphics.Path r4 = r0.f15212f
            java.util.List r5 = r0.f15215i
            java.lang.Object r5 = r5.get(r3)
            com.airbnb.lottie.a.a.n r5 = (com.airbnb.lottie.p234a.p235a.C4795n) r5
            android.graphics.Path r5 = r5.mo9724i()
            r4.addPath(r5, r1)
            int r3 = r3 + 1
            goto L_0x0010
        L_0x002c:
            android.graphics.Path r3 = r0.f15212f
            android.graphics.RectF r4 = r0.f15214h
            r3.computeBounds(r4, r2)
            int r2 = r0.f15224r
            r3 = 1
            if (r2 != r3) goto L_0x007e
            int r2 = r16.m13344h()
            long r2 = (long) r2
            androidx.c.k r4 = r0.f15210d
            java.lang.Object r4 = r4.mo3678e(r2)
            android.graphics.LinearGradient r4 = (android.graphics.LinearGradient) r4
            if (r4 != 0) goto L_0x00d8
            com.airbnb.lottie.a.b.f r4 = r0.f15218l
            java.lang.Object r4 = r4.mo9738e()
            android.graphics.PointF r4 = (android.graphics.PointF) r4
            com.airbnb.lottie.a.b.f r5 = r0.f15219m
            java.lang.Object r5 = r5.mo9738e()
            android.graphics.PointF r5 = (android.graphics.PointF) r5
            com.airbnb.lottie.a.b.f r6 = r0.f15216j
            java.lang.Object r6 = r6.mo9738e()
            com.airbnb.lottie.c.b.c r6 = (com.airbnb.lottie.p238c.p240b.C4860c) r6
            int[] r7 = r6.f15456b
            int[] r13 = r0.m13345i(r7)
            float[] r14 = r6.f15455a
            android.graphics.LinearGradient r6 = new android.graphics.LinearGradient
            float r9 = r4.x
            float r10 = r4.y
            float r11 = r5.x
            float r12 = r5.y
            android.graphics.Shader$TileMode r15 = android.graphics.Shader.TileMode.CLAMP
            r8 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            androidx.c.k r4 = r0.f15210d
            r4.mo3682i(r2, r6)
            r4 = r6
            goto L_0x00d8
        L_0x007e:
            int r2 = r16.m13344h()
            long r2 = (long) r2
            androidx.c.k r4 = r0.f15211e
            java.lang.Object r4 = r4.mo3678e(r2)
            android.graphics.RadialGradient r4 = (android.graphics.RadialGradient) r4
            if (r4 != 0) goto L_0x00d8
            com.airbnb.lottie.a.b.f r4 = r0.f15218l
            java.lang.Object r4 = r4.mo9738e()
            android.graphics.PointF r4 = (android.graphics.PointF) r4
            com.airbnb.lottie.a.b.f r5 = r0.f15219m
            java.lang.Object r5 = r5.mo9738e()
            android.graphics.PointF r5 = (android.graphics.PointF) r5
            com.airbnb.lottie.a.b.f r6 = r0.f15216j
            java.lang.Object r6 = r6.mo9738e()
            com.airbnb.lottie.c.b.c r6 = (com.airbnb.lottie.p238c.p240b.C4860c) r6
            int[] r7 = r6.f15456b
            int[] r12 = r0.m13345i(r7)
            float[] r13 = r6.f15455a
            float r9 = r4.x
            float r10 = r4.y
            float r4 = r5.x
            float r4 = r4 - r9
            double r6 = (double) r4
            float r4 = r5.y
            float r4 = r4 - r10
            double r4 = (double) r4
            double r4 = java.lang.Math.hypot(r6, r4)
            float r4 = (float) r4
            r5 = 0
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x00ca
            r4 = 981668463(0x3a83126f, float:0.001)
            r11 = 981668463(0x3a83126f, float:0.001)
            goto L_0x00cb
        L_0x00ca:
            r11 = r4
        L_0x00cb:
            android.graphics.RadialGradient r4 = new android.graphics.RadialGradient
            android.graphics.Shader$TileMode r14 = android.graphics.Shader.TileMode.CLAMP
            r8 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14)
            androidx.c.k r5 = r0.f15211e
            r5.mo3682i(r2, r4)
        L_0x00d8:
            r4.setLocalMatrix(r1)
            android.graphics.Paint r1 = r0.f15213g
            r1.setShader(r4)
            com.airbnb.lottie.a.b.f r1 = r0.f15220n
            if (r1 == 0) goto L_0x00f5
            android.graphics.Paint r2 = r0.f15213g
            com.airbnb.lottie.a.b.u r1 = (com.airbnb.lottie.p234a.p236b.C4822u) r1
            com.airbnb.lottie.g.c r1 = r1.f15301d
            com.airbnb.lottie.g.b r3 = r1.f15746b
            java.lang.Object r1 = r1.mo9900a()
            android.graphics.ColorFilter r1 = (android.graphics.ColorFilter) r1
            r2.setColorFilter(r1)
        L_0x00f5:
            com.airbnb.lottie.a.b.f r1 = r0.f15217k
            java.lang.Object r1 = r1.mo9738e()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            android.graphics.Paint r2 = r0.f15213g
            r3 = r19
            float r3 = (float) r3
            r4 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 / r4
            float r1 = (float) r1
            float r3 = r3 * r1
            r1 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 / r1
            float r3 = r3 * r4
            int r1 = (int) r3
            int r1 = com.airbnb.lottie.p245f.C4949f.m13717k(r1)
            r2.setAlpha(r1)
            android.graphics.Path r1 = r0.f15212f
            android.graphics.Paint r2 = r0.f15213g
            r3 = r17
            r3.drawPath(r1, r2)
            com.airbnb.lottie.C4838b.m13493a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p234a.p235a.C4790i.mo9715b(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    /* renamed from: c */
    public final void mo9716c(RectF rectF, Matrix matrix, boolean z) {
        this.f15212f.reset();
        for (int i = 0; i < this.f15215i.size(); i++) {
            this.f15212f.addPath(((C4795n) this.f15215i.get(i)).mo9724i(), matrix);
        }
        this.f15212f.computeBounds(rectF, false);
        rectF.set(rectF.left - 4.0f, rectF.top - 4.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* renamed from: d */
    public final void mo9717d() {
        this.f15222p.invalidateSelf();
    }

    /* renamed from: e */
    public final void mo9718e(C4890e eVar, int i, List list, C4890e eVar2) {
        C4949f.m13714h(eVar, i, list, eVar2, this);
    }

    /* renamed from: f */
    public final void mo9719f(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            C4785d dVar = (C4785d) list2.get(i);
            if (dVar instanceof C4795n) {
                this.f15215i.add((C4795n) dVar);
            }
        }
    }

    /* renamed from: g */
    public final String mo9722g() {
        return this.f15207a;
    }
}
