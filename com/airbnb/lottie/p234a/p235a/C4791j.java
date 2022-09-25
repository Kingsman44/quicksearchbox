package com.airbnb.lottie.p234a.p235a;

import android.graphics.RectF;
import androidx.p060c.C0981k;
import com.airbnb.lottie.C4825ac;
import com.airbnb.lottie.C4829ag;
import com.airbnb.lottie.p234a.p236b.C4807f;
import com.airbnb.lottie.p234a.p236b.C4822u;
import com.airbnb.lottie.p238c.p240b.C4862e;
import com.airbnb.lottie.p238c.p240b.C4872o;
import com.airbnb.lottie.p238c.p240b.C4873p;
import com.airbnb.lottie.p238c.p241c.C4878b;
import com.airbnb.lottie.p246g.C4957b;
import com.airbnb.lottie.p246g.C4958c;

/* renamed from: com.airbnb.lottie.a.a.j */
/* compiled from: PG */
public final class C4791j extends C4783b {

    /* renamed from: c */
    private final String f15225c;

    /* renamed from: d */
    private final boolean f15226d;

    /* renamed from: e */
    private final C0981k f15227e = new C0981k(10);

    /* renamed from: f */
    private final C0981k f15228f = new C0981k(10);

    /* renamed from: g */
    private final RectF f15229g = new RectF();

    /* renamed from: h */
    private final int f15230h;

    /* renamed from: i */
    private final C4807f f15231i;

    /* renamed from: j */
    private final C4807f f15232j;

    /* renamed from: k */
    private final C4807f f15233k;

    /* renamed from: l */
    private C4822u f15234l;

    /* renamed from: m */
    private final int f15235m;

    public C4791j(C4825ac acVar, C4878b bVar, C4862e eVar) {
        super(acVar, bVar, C4872o.m13528a(eVar.f15476l), C4873p.m13530a(eVar.f15477m), eVar.f15471g, eVar.f15467c, eVar.f15470f, eVar.f15472h, eVar.f15473i);
        this.f15225c = eVar.f15465a;
        this.f15235m = eVar.f15475k;
        this.f15226d = eVar.f15474j;
        this.f15230h = (int) (acVar.f15341a.mo9905a() / 32.0f);
        C4807f a = eVar.f15466b.mo9797a();
        this.f15231i = a;
        a.mo9740g(this);
        bVar.mo9811h(a);
        C4807f a2 = eVar.f15468d.mo9797a();
        this.f15232j = a2;
        a2.mo9740g(this);
        bVar.mo9811h(a2);
        C4807f a3 = eVar.f15469e.mo9797a();
        this.f15233k = a3;
        a3.mo9740g(this);
        bVar.mo9811h(a3);
    }

    /* renamed from: h */
    private final int m13353h() {
        int round = Math.round(this.f15232j.f15300c * ((float) this.f15230h));
        int round2 = Math.round(this.f15233k.f15300c * ((float) this.f15230h));
        int round3 = Math.round(this.f15231i.f15300c * ((float) this.f15230h));
        int i = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    /* renamed from: i */
    private final int[] m13354i(int[] iArr) {
        C4822u uVar = this.f15234l;
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
        super.mo9714a(obj, cVar);
        if (obj == C4829ag.f15367F) {
            C4822u uVar = this.f15234l;
            if (uVar != null) {
                this.f15165a.mo9813j(uVar);
            }
            C4822u uVar2 = new C4822u(cVar);
            this.f15234l = uVar2;
            uVar2.mo9740g(this);
            this.f15165a.mo9811h(this.f15234l);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: android.graphics.LinearGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: android.graphics.LinearGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: android.graphics.LinearGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: android.graphics.LinearGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: android.graphics.LinearGradient} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9715b(android.graphics.Canvas r17, android.graphics.Matrix r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r0.f15226d
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            android.graphics.RectF r2 = r0.f15229g
            r3 = 0
            r0.mo9716c(r2, r1, r3)
            int r2 = r0.f15235m
            r3 = 1
            if (r2 != r3) goto L_0x0059
            int r2 = r16.m13353h()
            long r2 = (long) r2
            androidx.c.k r4 = r0.f15227e
            java.lang.Object r4 = r4.mo3678e(r2)
            android.graphics.LinearGradient r4 = (android.graphics.LinearGradient) r4
            if (r4 != 0) goto L_0x00a7
            com.airbnb.lottie.a.b.f r4 = r0.f15232j
            java.lang.Object r4 = r4.mo9738e()
            android.graphics.PointF r4 = (android.graphics.PointF) r4
            com.airbnb.lottie.a.b.f r5 = r0.f15233k
            java.lang.Object r5 = r5.mo9738e()
            android.graphics.PointF r5 = (android.graphics.PointF) r5
            com.airbnb.lottie.a.b.f r6 = r0.f15231i
            java.lang.Object r6 = r6.mo9738e()
            com.airbnb.lottie.c.b.c r6 = (com.airbnb.lottie.p238c.p240b.C4860c) r6
            int[] r7 = r6.f15456b
            int[] r13 = r0.m13354i(r7)
            float[] r14 = r6.f15455a
            float r9 = r4.x
            float r10 = r4.y
            float r11 = r5.x
            float r12 = r5.y
            android.graphics.LinearGradient r4 = new android.graphics.LinearGradient
            android.graphics.Shader$TileMode r15 = android.graphics.Shader.TileMode.CLAMP
            r8 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            androidx.c.k r5 = r0.f15227e
            r5.mo3682i(r2, r4)
            goto L_0x00a7
        L_0x0059:
            int r2 = r16.m13353h()
            long r2 = (long) r2
            androidx.c.k r4 = r0.f15228f
            java.lang.Object r4 = r4.mo3678e(r2)
            android.graphics.RadialGradient r4 = (android.graphics.RadialGradient) r4
            if (r4 != 0) goto L_0x00a7
            com.airbnb.lottie.a.b.f r4 = r0.f15232j
            java.lang.Object r4 = r4.mo9738e()
            android.graphics.PointF r4 = (android.graphics.PointF) r4
            com.airbnb.lottie.a.b.f r5 = r0.f15233k
            java.lang.Object r5 = r5.mo9738e()
            android.graphics.PointF r5 = (android.graphics.PointF) r5
            com.airbnb.lottie.a.b.f r6 = r0.f15231i
            java.lang.Object r6 = r6.mo9738e()
            com.airbnb.lottie.c.b.c r6 = (com.airbnb.lottie.p238c.p240b.C4860c) r6
            int[] r7 = r6.f15456b
            int[] r12 = r0.m13354i(r7)
            float[] r13 = r6.f15455a
            float r9 = r4.x
            float r10 = r4.y
            float r4 = r5.x
            float r5 = r5.y
            float r4 = r4 - r9
            double r6 = (double) r4
            float r5 = r5 - r10
            double r4 = (double) r5
            double r4 = java.lang.Math.hypot(r6, r4)
            android.graphics.RadialGradient r6 = new android.graphics.RadialGradient
            float r11 = (float) r4
            android.graphics.Shader$TileMode r14 = android.graphics.Shader.TileMode.CLAMP
            r8 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14)
            androidx.c.k r4 = r0.f15228f
            r4.mo3682i(r2, r6)
            r4 = r6
        L_0x00a7:
            r4.setLocalMatrix(r1)
            android.graphics.Paint r2 = r0.f15166b
            r2.setShader(r4)
            super.mo9715b(r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p234a.p235a.C4791j.mo9715b(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    /* renamed from: g */
    public final String mo9722g() {
        return this.f15225c;
    }
}
