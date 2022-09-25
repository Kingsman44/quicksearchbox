package com.airbnb.lottie.p234a.p235a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.C4825ac;
import com.airbnb.lottie.C4829ag;
import com.airbnb.lottie.C4838b;
import com.airbnb.lottie.p234a.C4781a;
import com.airbnb.lottie.p234a.p236b.C4802a;
import com.airbnb.lottie.p234a.p236b.C4807f;
import com.airbnb.lottie.p234a.p236b.C4809h;
import com.airbnb.lottie.p234a.p236b.C4811j;
import com.airbnb.lottie.p234a.p236b.C4822u;
import com.airbnb.lottie.p238c.C4890e;
import com.airbnb.lottie.p238c.p239a.C4844b;
import com.airbnb.lottie.p238c.p239a.C4846d;
import com.airbnb.lottie.p238c.p241c.C4878b;
import com.airbnb.lottie.p245f.C4949f;
import com.airbnb.lottie.p245f.C4954k;
import com.airbnb.lottie.p246g.C4957b;
import com.airbnb.lottie.p246g.C4958c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.b */
/* compiled from: PG */
public abstract class C4783b implements C4802a, C4793l, C4787f {

    /* renamed from: a */
    protected final C4878b f15165a;

    /* renamed from: b */
    final Paint f15166b;

    /* renamed from: c */
    private final PathMeasure f15167c = new PathMeasure();

    /* renamed from: d */
    private final Path f15168d = new Path();

    /* renamed from: e */
    private final Path f15169e = new Path();

    /* renamed from: f */
    private final RectF f15170f = new RectF();

    /* renamed from: g */
    private final C4825ac f15171g;

    /* renamed from: h */
    private final List f15172h = new ArrayList();

    /* renamed from: i */
    private final float[] f15173i;

    /* renamed from: j */
    private final C4807f f15174j;

    /* renamed from: k */
    private final C4807f f15175k;

    /* renamed from: l */
    private final List f15176l;

    /* renamed from: m */
    private final C4807f f15177m;

    /* renamed from: n */
    private C4807f f15178n;

    public C4783b(C4825ac acVar, C4878b bVar, Paint.Cap cap, Paint.Join join, float f, C4846d dVar, C4844b bVar2, List list, C4844b bVar3) {
        C4781a aVar = new C4781a(1);
        this.f15166b = aVar;
        this.f15171g = acVar;
        this.f15165a = bVar;
        aVar.setStyle(Paint.Style.STROKE);
        aVar.setStrokeCap(cap);
        aVar.setStrokeJoin(join);
        aVar.setStrokeMiter(f);
        this.f15175k = dVar.mo9797a();
        this.f15174j = bVar2.mo9797a();
        if (bVar3 == null) {
            this.f15177m = null;
        } else {
            this.f15177m = bVar3.mo9797a();
        }
        this.f15176l = new ArrayList(list.size());
        this.f15173i = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.f15176l.add(((C4844b) list.get(i)).mo9797a());
        }
        bVar.mo9811h(this.f15175k);
        bVar.mo9811h(this.f15174j);
        for (int i2 = 0; i2 < this.f15176l.size(); i2++) {
            bVar.mo9811h((C4807f) this.f15176l.get(i2));
        }
        C4807f fVar = this.f15177m;
        if (fVar != null) {
            bVar.mo9811h(fVar);
        }
        this.f15175k.mo9740g(this);
        this.f15174j.mo9740g(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((C4807f) this.f15176l.get(i3)).mo9740g(this);
        }
        C4807f fVar2 = this.f15177m;
        if (fVar2 != null) {
            fVar2.mo9740g(this);
        }
    }

    /* renamed from: a */
    public void mo9714a(Object obj, C4958c cVar) {
        if (obj == C4829ag.f15373d) {
            this.f15175k.f15301d = cVar;
        } else if (obj == C4829ag.f15386q) {
            this.f15174j.f15301d = cVar;
        } else if (obj == C4829ag.f15366E) {
            C4807f fVar = this.f15178n;
            if (fVar != null) {
                this.f15165a.mo9813j(fVar);
            }
            C4822u uVar = new C4822u(cVar);
            this.f15178n = uVar;
            uVar.mo9740g(this);
            this.f15165a.mo9811h(this.f15178n);
        }
    }

    /* renamed from: b */
    public void mo9715b(Canvas canvas, Matrix matrix, int i) {
        float f;
        Canvas canvas2 = canvas;
        Matrix matrix2 = matrix;
        float[] fArr = (float[]) C4954k.f15722a.get();
        boolean z = false;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix2.mapPoints(fArr);
        if (fArr[0] == fArr[2] || fArr[1] == fArr[3]) {
            C4838b.m13493a();
            return;
        }
        C4811j jVar = (C4811j) this.f15175k;
        float k = (((float) i) / 255.0f) * ((float) jVar.mo9747k(jVar.mo9737d(), jVar.mo9735b()));
        float f2 = 100.0f;
        this.f15166b.setAlpha(C4949f.m13717k((int) ((k / 100.0f) * 255.0f)));
        this.f15166b.setStrokeWidth(((C4809h) this.f15174j).mo9744k() * C4954k.m13720c(matrix));
        if (this.f15166b.getStrokeWidth() > 0.0f) {
            if (this.f15176l.isEmpty()) {
                C4838b.m13493a();
            } else {
                float c = C4954k.m13720c(matrix);
                for (int i2 = 0; i2 < this.f15176l.size(); i2++) {
                    this.f15173i[i2] = ((Float) ((C4807f) this.f15176l.get(i2)).mo9738e()).floatValue();
                    if (i2 % 2 == 0) {
                        float[] fArr2 = this.f15173i;
                        if (fArr2[i2] < 1.0f) {
                            fArr2[i2] = 1.0f;
                        }
                    } else {
                        float[] fArr3 = this.f15173i;
                        if (fArr3[i2] < 0.1f) {
                            fArr3[i2] = 0.1f;
                        }
                    }
                    float[] fArr4 = this.f15173i;
                    fArr4[i2] = fArr4[i2] * c;
                }
                C4807f fVar = this.f15177m;
                if (fVar == null) {
                    f = 0.0f;
                } else {
                    f = ((Float) fVar.mo9738e()).floatValue() * c;
                }
                this.f15166b.setPathEffect(new DashPathEffect(this.f15173i, f));
                C4838b.m13493a();
            }
            C4807f fVar2 = this.f15178n;
            if (fVar2 != null) {
                Paint paint = this.f15166b;
                C4958c cVar = ((C4822u) fVar2).f15301d;
                C4957b bVar = cVar.f15746b;
                paint.setColorFilter((ColorFilter) cVar.mo9900a());
            }
            int i3 = 0;
            while (i3 < this.f15172h.size()) {
                C4782a aVar = (C4782a) this.f15172h.get(i3);
                if (aVar.f15164b != null) {
                    this.f15168d.reset();
                    int size = aVar.f15163a.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        this.f15168d.addPath(((C4795n) aVar.f15163a.get(size)).mo9724i(), matrix2);
                    }
                    this.f15167c.setPath(this.f15168d, z);
                    float length = this.f15167c.getLength();
                    while (this.f15167c.nextContour()) {
                        length += this.f15167c.getLength();
                    }
                    float floatValue = (((Float) aVar.f15164b.f15289d.mo9738e()).floatValue() * length) / 360.0f;
                    float floatValue2 = ((((Float) aVar.f15164b.f15287b.mo9738e()).floatValue() * length) / f2) + floatValue;
                    float floatValue3 = ((((Float) aVar.f15164b.f15288c.mo9738e()).floatValue() * length) / f2) + floatValue;
                    int size2 = aVar.f15163a.size() - 1;
                    float f3 = 0.0f;
                    while (size2 >= 0) {
                        this.f15169e.set(((C4795n) aVar.f15163a.get(size2)).mo9724i());
                        this.f15169e.transform(matrix2);
                        this.f15167c.setPath(this.f15169e, z);
                        float length2 = this.f15167c.getLength();
                        if (floatValue3 > length) {
                            float f4 = floatValue3 - length;
                            if (f4 < f3 + length2 && f3 < f4) {
                                C4954k.m13725h(this.f15169e, floatValue2 > length ? (floatValue2 - length) / length2 : 0.0f, Math.min(f4 / length2, 1.0f), 0.0f);
                                canvas2.drawPath(this.f15169e, this.f15166b);
                                f3 += length2;
                                size2--;
                                z = false;
                            }
                        }
                        float f5 = f3 + length2;
                        if (f5 >= floatValue2 && f3 <= floatValue3) {
                            if (f5 > floatValue3 || floatValue2 >= f3) {
                                C4954k.m13725h(this.f15169e, floatValue2 < f3 ? 0.0f : (floatValue2 - f3) / length2, floatValue3 > f5 ? 1.0f : (floatValue3 - f3) / length2, 0.0f);
                                canvas2.drawPath(this.f15169e, this.f15166b);
                            } else {
                                canvas2.drawPath(this.f15169e, this.f15166b);
                            }
                        }
                        f3 += length2;
                        size2--;
                        z = false;
                    }
                    C4838b.m13493a();
                } else {
                    this.f15168d.reset();
                    int size3 = aVar.f15163a.size();
                    while (true) {
                        size3--;
                        if (size3 < 0) {
                            break;
                        }
                        this.f15168d.addPath(((C4795n) aVar.f15163a.get(size3)).mo9724i(), matrix2);
                    }
                    C4838b.m13493a();
                    canvas2.drawPath(this.f15168d, this.f15166b);
                    C4838b.m13493a();
                }
                i3++;
                f2 = 100.0f;
                z = false;
            }
            C4838b.m13493a();
            return;
        }
        C4838b.m13493a();
    }

    /* renamed from: c */
    public final void mo9716c(RectF rectF, Matrix matrix, boolean z) {
        this.f15168d.reset();
        for (int i = 0; i < this.f15172h.size(); i++) {
            C4782a aVar = (C4782a) this.f15172h.get(i);
            for (int i2 = 0; i2 < aVar.f15163a.size(); i2++) {
                this.f15168d.addPath(((C4795n) aVar.f15163a.get(i2)).mo9724i(), matrix);
            }
        }
        this.f15168d.computeBounds(this.f15170f, false);
        float k = ((C4809h) this.f15174j).mo9744k();
        RectF rectF2 = this.f15170f;
        float f = k / 2.0f;
        rectF2.set(rectF2.left - f, this.f15170f.top - f, this.f15170f.right + f, this.f15170f.bottom + f);
        rectF.set(this.f15170f);
        rectF.set(rectF.left - 4.0f, rectF.top - 4.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        C4838b.m13493a();
    }

    /* renamed from: d */
    public final void mo9717d() {
        this.f15171g.invalidateSelf();
    }

    /* renamed from: e */
    public final void mo9718e(C4890e eVar, int i, List list, C4890e eVar2) {
        C4949f.m13714h(eVar, i, list, eVar2, this);
    }

    /* renamed from: f */
    public final void mo9719f(List list, List list2) {
        C4782a aVar = null;
        C4801t tVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            C4785d dVar = (C4785d) list.get(size);
            if (dVar instanceof C4801t) {
                C4801t tVar2 = (C4801t) dVar;
                if (tVar2.f15290e == 2) {
                    tVar = tVar2;
                }
            }
        }
        if (tVar != null) {
            tVar.mo9727a(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            C4785d dVar2 = (C4785d) list2.get(size2);
            if (dVar2 instanceof C4801t) {
                C4801t tVar3 = (C4801t) dVar2;
                if (tVar3.f15290e == 2) {
                    if (aVar != null) {
                        this.f15172h.add(aVar);
                    }
                    C4782a aVar2 = new C4782a(tVar3);
                    tVar3.mo9727a(this);
                    aVar = aVar2;
                }
            }
            if (dVar2 instanceof C4795n) {
                if (aVar == null) {
                    aVar = new C4782a(tVar);
                }
                aVar.f15163a.add((C4795n) dVar2);
            }
        }
        if (aVar != null) {
            this.f15172h.add(aVar);
        }
    }
}
