package com.airbnb.lottie.p238c.p241c;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.p060c.C0981k;
import com.airbnb.lottie.C4825ac;
import com.airbnb.lottie.C4829ag;
import com.airbnb.lottie.C4838b;
import com.airbnb.lottie.C4964k;
import com.airbnb.lottie.p234a.p236b.C4807f;
import com.airbnb.lottie.p234a.p236b.C4822u;
import com.airbnb.lottie.p238c.C4890e;
import com.airbnb.lottie.p238c.p239a.C4844b;
import com.airbnb.lottie.p245f.C4946c;
import com.airbnb.lottie.p245f.C4947d;
import com.airbnb.lottie.p246g.C4958c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.c.c.c */
/* compiled from: PG */
public final class C4879c extends C4878b {

    /* renamed from: h */
    private C4807f f15561h;

    /* renamed from: i */
    private final List f15562i = new ArrayList();

    /* renamed from: j */
    private final RectF f15563j = new RectF();

    /* renamed from: k */
    private final RectF f15564k = new RectF();

    public C4879c(C4825ac acVar, C4882f fVar, List list, C4964k kVar) {
        super(acVar, fVar);
        C4878b bVar;
        C4878b bVar2;
        String str;
        new Paint();
        C4844b bVar3 = fVar.f15587r;
        if (bVar3 != null) {
            C4807f a = bVar3.mo9797a();
            this.f15561h = a;
            mo9811h(a);
            this.f15561h.mo9740g(this);
        } else {
            this.f15561h = null;
        }
        C0981k kVar2 = new C0981k(kVar.f15758g.size());
        int size = list.size() - 1;
        C4878b bVar4 = null;
        while (true) {
            if (size >= 0) {
                C4882f fVar2 = (C4882f) list.get(size);
                int i = fVar2.f15590u;
                int i2 = i - 1;
                if (i != 0) {
                    if (i2 == 0) {
                        bVar2 = new C4879c(acVar, fVar2, (List) kVar.f15753b.get(fVar2.f15575f), kVar);
                    } else if (i2 == 1) {
                        bVar2 = new C4885i(acVar, fVar2);
                    } else if (i2 == 2) {
                        bVar2 = new C4880d(acVar, fVar2);
                    } else if (i2 == 3) {
                        bVar2 = new C4883g(acVar, fVar2);
                    } else if (i2 == 4) {
                        bVar2 = new C4884h(acVar, fVar2);
                    } else if (i2 != 5) {
                        switch (i) {
                            case 1:
                                str = "PRE_COMP";
                                break;
                            case 2:
                                str = "SOLID";
                                break;
                            case 3:
                                str = "IMAGE";
                                break;
                            case 4:
                                str = "NULL";
                                break;
                            case 5:
                                str = "SHAPE";
                                break;
                            case 6:
                                str = "TEXT";
                                break;
                            default:
                                str = "UNKNOWN";
                                break;
                        }
                        ((C4946c) C4947d.f15711a).mo9784a("Unknown layer type ".concat(str), (Throwable) null);
                        bVar2 = null;
                    } else {
                        bVar2 = new C4888l(acVar, fVar2);
                    }
                    if (bVar2 != null) {
                        kVar2.mo3682i(bVar2.f15541c.f15573d, bVar2);
                        if (bVar4 != null) {
                            bVar4.f15543e = bVar2;
                            bVar4 = null;
                        } else {
                            this.f15562i.add(0, bVar2);
                            int i3 = fVar2.f15591v;
                            int i4 = i3 - 1;
                            if (i3 == 0) {
                                throw null;
                            } else if (i4 == 1 || i4 == 2) {
                                bVar4 = bVar2;
                            }
                        }
                    }
                    size--;
                } else {
                    throw null;
                }
            } else {
                for (int i5 = 0; i5 < kVar2.mo3675c(); i5++) {
                    C4878b bVar5 = (C4878b) kVar2.mo3678e(kVar2.mo3677d(i5));
                    if (!(bVar5 == null || (bVar = (C4878b) kVar2.mo3678e(bVar5.f15541c.f15574e)) == null)) {
                        bVar5.f15544f = bVar;
                    }
                }
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo9714a(Object obj, C4958c cVar) {
        this.f15545g.mo9754e(obj, cVar);
        if (obj == C4829ag.f15364C) {
            C4822u uVar = new C4822u(cVar);
            this.f15561h = uVar;
            uVar.mo9740g(this);
            mo9811h(this.f15561h);
        }
    }

    /* renamed from: c */
    public final void mo9716c(RectF rectF, Matrix matrix, boolean z) {
        super.mo9716c(rectF, matrix, z);
        int size = this.f15562i.size();
        while (true) {
            size--;
            if (size >= 0) {
                this.f15563j.set(0.0f, 0.0f, 0.0f, 0.0f);
                ((C4878b) this.f15562i.get(size)).mo9716c(this.f15563j, this.f15539a, true);
                rectF.union(this.f15563j);
            } else {
                return;
            }
        }
    }

    /* renamed from: i */
    public final void mo9812i(Canvas canvas, Matrix matrix, int i) {
        RectF rectF = this.f15564k;
        C4882f fVar = this.f15541c;
        rectF.set(0.0f, 0.0f, (float) fVar.f15583n, (float) fVar.f15584o);
        matrix.mapRect(this.f15564k);
        canvas.save();
        int size = this.f15562i.size();
        while (true) {
            size--;
            if (size < 0) {
                canvas.restore();
                C4838b.m13493a();
                return;
            } else if (this.f15564k.isEmpty() || canvas.clipRect(this.f15564k)) {
                ((C4878b) this.f15562i.get(size)).mo9715b(canvas, matrix, i);
            }
        }
    }

    /* renamed from: k */
    public final void mo9814k(C4890e eVar, int i, List list, C4890e eVar2) {
        for (int i2 = 0; i2 < this.f15562i.size(); i2++) {
            ((C4878b) this.f15562i.get(i2)).mo9718e(eVar, i, list, eVar2);
        }
    }

    /* renamed from: l */
    public final void mo9815l(float f) {
        super.mo9815l(f);
        C4807f fVar = this.f15561h;
        if (fVar != null) {
            C4964k kVar = this.f15540b.f15341a;
            f = ((((Float) fVar.mo9738e()).floatValue() * this.f15541c.f15571b.f15762k) - this.f15541c.f15571b.f15760i) / ((kVar.f15761j - kVar.f15760i) + 0.01f);
        }
        if (this.f15561h == null) {
            C4882f fVar2 = this.f15541c;
            float f2 = fVar2.f15582m;
            C4964k kVar2 = fVar2.f15571b;
            f -= f2 / (kVar2.f15761j - kVar2.f15760i);
        }
        C4882f fVar3 = this.f15541c;
        if (fVar3.f15581l != 0.0f && !"__container".equals(fVar3.f15572c)) {
            f /= this.f15541c.f15581l;
        }
        int size = this.f15562i.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C4878b) this.f15562i.get(size)).mo9815l(f);
            } else {
                return;
            }
        }
    }
}
