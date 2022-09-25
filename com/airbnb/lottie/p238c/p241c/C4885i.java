package com.airbnb.lottie.p238c.p241c;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C4825ac;
import com.airbnb.lottie.C4829ag;
import com.airbnb.lottie.p234a.C4781a;
import com.airbnb.lottie.p234a.p236b.C4807f;
import com.airbnb.lottie.p234a.p236b.C4822u;
import com.airbnb.lottie.p246g.C4957b;
import com.airbnb.lottie.p246g.C4958c;

/* renamed from: com.airbnb.lottie.c.c.i */
/* compiled from: PG */
public final class C4885i extends C4878b {

    /* renamed from: h */
    private final RectF f15593h = new RectF();

    /* renamed from: i */
    private final Paint f15594i;

    /* renamed from: j */
    private final float[] f15595j;

    /* renamed from: k */
    private final Path f15596k;

    /* renamed from: l */
    private final C4882f f15597l;

    /* renamed from: m */
    private C4807f f15598m;

    public C4885i(C4825ac acVar, C4882f fVar) {
        super(acVar, fVar);
        C4781a aVar = new C4781a();
        this.f15594i = aVar;
        this.f15595j = new float[8];
        this.f15596k = new Path();
        this.f15597l = fVar;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(fVar.f15580k);
    }

    /* renamed from: a */
    public final void mo9714a(Object obj, C4958c cVar) {
        this.f15545g.mo9754e(obj, cVar);
        if (obj == C4829ag.f15366E) {
            this.f15598m = new C4822u(cVar);
        }
    }

    /* renamed from: c */
    public final void mo9716c(RectF rectF, Matrix matrix, boolean z) {
        super.mo9716c(rectF, matrix, z);
        RectF rectF2 = this.f15593h;
        C4882f fVar = this.f15597l;
        rectF2.set(0.0f, 0.0f, (float) fVar.f15578i, (float) fVar.f15579j);
        this.f15539a.mapRect(this.f15593h);
        rectF.set(this.f15593h);
    }

    /* renamed from: i */
    public final void mo9812i(Canvas canvas, Matrix matrix, int i) {
        int i2;
        int alpha = Color.alpha(this.f15597l.f15580k);
        if (alpha != 0) {
            C4807f fVar = this.f15545g.f15330e;
            if (fVar == null) {
                i2 = 100;
            } else {
                i2 = ((Integer) fVar.mo9738e()).intValue();
            }
            int i3 = (int) ((((float) i) / 255.0f) * (((((float) alpha) / 255.0f) * ((float) i2)) / 100.0f) * 255.0f);
            this.f15594i.setAlpha(i3);
            C4807f fVar2 = this.f15598m;
            if (fVar2 != null) {
                Paint paint = this.f15594i;
                C4958c cVar = ((C4822u) fVar2).f15301d;
                C4957b bVar = cVar.f15746b;
                paint.setColorFilter((ColorFilter) cVar.mo9900a());
            }
            if (i3 > 0) {
                float[] fArr = this.f15595j;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                C4882f fVar3 = this.f15597l;
                float f = (float) fVar3.f15578i;
                fArr[2] = f;
                fArr[3] = 0.0f;
                fArr[4] = f;
                float f2 = (float) fVar3.f15579j;
                fArr[5] = f2;
                fArr[6] = 0.0f;
                fArr[7] = f2;
                matrix.mapPoints(fArr);
                this.f15596k.reset();
                Path path = this.f15596k;
                float[] fArr2 = this.f15595j;
                path.moveTo(fArr2[0], fArr2[1]);
                Path path2 = this.f15596k;
                float[] fArr3 = this.f15595j;
                path2.lineTo(fArr3[2], fArr3[3]);
                Path path3 = this.f15596k;
                float[] fArr4 = this.f15595j;
                path3.lineTo(fArr4[4], fArr4[5]);
                Path path4 = this.f15596k;
                float[] fArr5 = this.f15595j;
                path4.lineTo(fArr5[6], fArr5[7]);
                Path path5 = this.f15596k;
                float[] fArr6 = this.f15595j;
                path5.lineTo(fArr6[0], fArr6[1]);
                this.f15596k.close();
                canvas.drawPath(this.f15596k, this.f15594i);
            }
        }
    }
}
