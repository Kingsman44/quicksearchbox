package com.google.android.material.p3515l;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* renamed from: com.google.android.material.l.r */
/* compiled from: PG */
public final class C44787r {

    /* renamed from: a */
    private final C44795z[] f116793a = new C44795z[4];

    /* renamed from: b */
    private final Matrix[] f116794b = new Matrix[4];

    /* renamed from: c */
    private final Matrix[] f116795c = new Matrix[4];

    /* renamed from: d */
    private final PointF f116796d = new PointF();

    /* renamed from: e */
    private final Path f116797e = new Path();

    /* renamed from: f */
    private final Path f116798f = new Path();

    /* renamed from: g */
    private final C44795z f116799g = new C44795z();

    /* renamed from: h */
    private final float[] f116800h = new float[2];

    /* renamed from: i */
    private final float[] f116801i = new float[2];

    /* renamed from: j */
    private final Path f116802j = new Path();

    /* renamed from: k */
    private final Path f116803k = new Path();

    /* renamed from: l */
    private boolean f116804l = true;

    public C44787r() {
        for (int i = 0; i < 4; i++) {
            this.f116793a[i] = new C44795z();
            this.f116794b[i] = new Matrix();
            this.f116795c[i] = new Matrix();
        }
    }

    /* renamed from: b */
    private final boolean m79433b(Path path, int i) {
        this.f116803k.reset();
        this.f116793a[i].mo48158c(this.f116794b[i], this.f116803k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f116803k.computeBounds(rectF, true);
        path.op(this.f116803k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() <= 1.0f || rectF.height() <= 1.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static final float m79434c(int i) {
        return (float) (((i + 1) % 4) * 90);
    }

    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v4, types: [boolean] */
    /* JADX WARNING: type inference failed for: r5v13 */
    /* renamed from: a */
    public final void mo48153a(C44785p pVar, float f, RectF rectF, C44776g gVar, Path path) {
        int i;
        C44785p pVar2 = pVar;
        RectF rectF2 = rectF;
        C44776g gVar2 = gVar;
        Path path2 = path;
        path.rewind();
        this.f116797e.rewind();
        this.f116798f.rewind();
        this.f116798f.addRect(rectF2, Path.Direction.CW);
        ? r5 = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= 4) {
                break;
            }
            (i2 != 1 ? i2 != 2 ? i2 != 3 ? pVar2.f116781c : pVar2.f116780b : pVar2.f116783e : pVar2.f116782d).mo48112a(this.f116793a[i2], f, (i2 != 1 ? i2 != 2 ? i2 != 3 ? pVar2.f116785g : pVar2.f116784f : pVar2.f116787i : pVar2.f116786h).mo48107a(rectF2));
            float c = m79434c(i2);
            this.f116794b[i2].reset();
            PointF pointF = this.f116796d;
            if (i2 == 1) {
                pointF.set(rectF2.right, rectF2.bottom);
            } else if (i2 == 2) {
                pointF.set(rectF2.left, rectF2.bottom);
            } else if (i2 != 3) {
                pointF.set(rectF2.right, rectF2.top);
            } else {
                pointF.set(rectF2.left, rectF2.top);
            }
            this.f116794b[i2].setTranslate(this.f116796d.x, this.f116796d.y);
            this.f116794b[i2].preRotate(c);
            float[] fArr = this.f116800h;
            C44795z zVar = this.f116793a[i2];
            fArr[0] = zVar.f116819b;
            fArr[1] = zVar.f116820c;
            this.f116794b[i2].mapPoints(fArr);
            this.f116795c[i2].reset();
            Matrix matrix = this.f116795c[i2];
            float[] fArr2 = this.f116800h;
            matrix.setTranslate(fArr2[0], fArr2[1]);
            this.f116795c[i2].preRotate(m79434c(i2));
            i2++;
        }
        int i3 = 0;
        for (i = 4; i3 < i; i = 4) {
            float[] fArr3 = this.f116800h;
            C44795z zVar2 = this.f116793a[i3];
            fArr3[r5] = 0.0f;
            fArr3[1] = zVar2.f116818a;
            this.f116794b[i3].mapPoints(fArr3);
            if (i3 == 0) {
                float[] fArr4 = this.f116800h;
                path2.moveTo(fArr4[r5], fArr4[1]);
            } else {
                float[] fArr5 = this.f116800h;
                path2.lineTo(fArr5[r5], fArr5[1]);
            }
            this.f116793a[i3].mo48158c(this.f116794b[i3], path2);
            if (gVar2 != null) {
                C44795z zVar3 = this.f116793a[i3];
                Matrix matrix2 = this.f116794b[i3];
                gVar2.f116717a.f116744F.set(i3, r5);
                gVar2.f116717a.f116742D[i3] = zVar3.mo48156a(matrix2);
            }
            int i4 = i3 + 1;
            int i5 = i4 % 4;
            float[] fArr6 = this.f116800h;
            C44795z zVar4 = this.f116793a[i3];
            fArr6[r5] = zVar4.f116819b;
            fArr6[1] = zVar4.f116820c;
            this.f116794b[i3].mapPoints(fArr6);
            float[] fArr7 = this.f116801i;
            C44795z zVar5 = this.f116793a[i5];
            fArr7[r5] = 0.0f;
            fArr7[1] = zVar5.f116818a;
            this.f116794b[i5].mapPoints(fArr7);
            float[] fArr8 = this.f116800h;
            float f2 = fArr8[r5];
            float[] fArr9 = this.f116801i;
            int i6 = i3;
            float max = Math.max(((float) Math.hypot((double) (f2 - fArr9[r5]), (double) (fArr8[1] - fArr9[1]))) - 4046.848f, 0.0f);
            float[] fArr10 = this.f116800h;
            C44795z zVar6 = this.f116793a[i6];
            fArr10[0] = zVar6.f116819b;
            fArr10[1] = zVar6.f116820c;
            this.f116794b[i6].mapPoints(fArr10);
            int i7 = i6;
            if (i7 == 1 || i7 == 3) {
                Math.abs(rectF.centerX() - this.f116800h[0]);
            } else {
                Math.abs(rectF.centerY() - this.f116800h[1]);
            }
            this.f116799g.mo48160e();
            if (i7 == 1) {
                C44775f fVar = pVar2.f116790l;
            } else if (i7 == 2) {
                C44775f fVar2 = pVar2.f116791m;
            } else if (i7 != 3) {
                C44775f fVar3 = pVar2.f116789k;
            } else {
                C44775f fVar4 = pVar2.f116788j;
            }
            this.f116799g.mo48159d(max, 0.0f);
            this.f116802j.reset();
            this.f116799g.mo48158c(this.f116795c[i7], this.f116802j);
            if (!this.f116804l || (!m79433b(this.f116802j, i7) && !m79433b(this.f116802j, i5))) {
                this.f116799g.mo48158c(this.f116795c[i7], path2);
            } else {
                Path path3 = this.f116802j;
                path3.op(path3, this.f116798f, Path.Op.DIFFERENCE);
                float[] fArr11 = this.f116800h;
                fArr11[0] = 0.0f;
                fArr11[1] = this.f116799g.f116818a;
                this.f116795c[i7].mapPoints(fArr11);
                Path path4 = this.f116797e;
                float[] fArr12 = this.f116800h;
                path4.moveTo(fArr12[0], fArr12[1]);
                this.f116799g.mo48158c(this.f116795c[i7], this.f116797e);
            }
            if (gVar2 != null) {
                C44795z zVar7 = this.f116799g;
                Matrix matrix3 = this.f116795c[i7];
                gVar2.f116717a.f116744F.set(i7 + 4, false);
                gVar2.f116717a.f116743E[i7] = zVar7.mo48156a(matrix3);
            }
            i3 = i4;
            r5 = 0;
        }
        path.close();
        this.f116797e.close();
        if (!this.f116797e.isEmpty()) {
            path2.op(this.f116797e, Path.Op.UNION);
        }
    }
}
