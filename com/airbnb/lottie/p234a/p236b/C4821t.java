package com.airbnb.lottie.p234a.p236b;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.airbnb.lottie.C4829ag;
import com.airbnb.lottie.p238c.p239a.C4844b;
import com.airbnb.lottie.p238c.p239a.C4846d;
import com.airbnb.lottie.p238c.p239a.C4847e;
import com.airbnb.lottie.p238c.p239a.C4849g;
import com.airbnb.lottie.p238c.p239a.C4854l;
import com.airbnb.lottie.p238c.p239a.C4855m;
import com.airbnb.lottie.p238c.p241c.C4878b;
import com.airbnb.lottie.p246g.C4958c;
import com.airbnb.lottie.p246g.C4959d;

/* renamed from: com.airbnb.lottie.a.b.t */
/* compiled from: PG */
public final class C4821t {

    /* renamed from: a */
    public C4807f f15326a;

    /* renamed from: b */
    public C4807f f15327b;

    /* renamed from: c */
    public C4807f f15328c;

    /* renamed from: d */
    public C4807f f15329d;

    /* renamed from: e */
    public C4807f f15330e;

    /* renamed from: f */
    public final C4809h f15331f;

    /* renamed from: g */
    public final C4809h f15332g;

    /* renamed from: h */
    public final C4807f f15333h;

    /* renamed from: i */
    public final C4807f f15334i;

    /* renamed from: j */
    private final Matrix f15335j = new Matrix();

    /* renamed from: k */
    private final Matrix f15336k;

    /* renamed from: l */
    private final Matrix f15337l;

    /* renamed from: m */
    private final Matrix f15338m;

    /* renamed from: n */
    private final float[] f15339n;

    public C4821t(C4854l lVar) {
        C4807f fVar;
        C4807f fVar2;
        C4807f fVar3;
        C4807f fVar4;
        C4807f fVar5;
        C4807f fVar6;
        C4847e eVar = lVar.f15429a;
        if (eVar == null) {
            fVar = null;
        } else {
            fVar = eVar.mo9797a();
        }
        this.f15326a = fVar;
        C4855m mVar = lVar.f15430b;
        if (mVar == null) {
            fVar2 = null;
        } else {
            fVar2 = mVar.mo9797a();
        }
        this.f15327b = fVar2;
        C4849g gVar = lVar.f15431c;
        if (gVar == null) {
            fVar3 = null;
        } else {
            fVar3 = gVar.mo9797a();
        }
        this.f15328c = fVar3;
        C4844b bVar = lVar.f15432d;
        if (bVar == null) {
            fVar4 = null;
        } else {
            fVar4 = bVar.mo9797a();
        }
        this.f15329d = fVar4;
        C4844b bVar2 = lVar.f15434f;
        if (bVar2 == null) {
            fVar5 = null;
        } else {
            fVar5 = bVar2.mo9797a();
        }
        C4809h hVar = (C4809h) fVar5;
        this.f15331f = hVar;
        if (hVar != null) {
            this.f15336k = new Matrix();
            this.f15337l = new Matrix();
            this.f15338m = new Matrix();
            this.f15339n = new float[9];
        } else {
            this.f15336k = null;
            this.f15337l = null;
            this.f15338m = null;
            this.f15339n = null;
        }
        C4844b bVar3 = lVar.f15435g;
        if (bVar3 == null) {
            fVar6 = null;
        } else {
            fVar6 = bVar3.mo9797a();
        }
        this.f15332g = (C4809h) fVar6;
        C4846d dVar = lVar.f15433e;
        if (dVar != null) {
            this.f15330e = dVar.mo9797a();
        }
        C4844b bVar4 = lVar.f15436h;
        if (bVar4 != null) {
            this.f15333h = bVar4.mo9797a();
        } else {
            this.f15333h = null;
        }
        C4844b bVar5 = lVar.f15437i;
        if (bVar5 != null) {
            this.f15334i = bVar5.mo9797a();
        } else {
            this.f15334i = null;
        }
    }

    /* renamed from: f */
    private final void m13455f() {
        for (int i = 0; i < 9; i++) {
            this.f15339n[i] = 0.0f;
        }
    }

    /* renamed from: a */
    public final Matrix mo9750a() {
        float f;
        float f2;
        float f3;
        this.f15335j.reset();
        C4807f fVar = this.f15327b;
        if (fVar != null) {
            PointF pointF = (PointF) fVar.mo9738e();
            if (!(pointF.x == 0.0f && pointF.y == 0.0f)) {
                this.f15335j.preTranslate(pointF.x, pointF.y);
            }
        }
        C4807f fVar2 = this.f15329d;
        if (fVar2 != null) {
            if (fVar2 instanceof C4822u) {
                f3 = ((Float) fVar2.mo9738e()).floatValue();
            } else {
                f3 = ((C4809h) fVar2).mo9744k();
            }
            if (f3 != 0.0f) {
                this.f15335j.preRotate(f3);
            }
        }
        if (this.f15331f != null) {
            C4809h hVar = this.f15332g;
            if (hVar == null) {
                f = 0.0f;
            } else {
                f = (float) Math.cos(Math.toRadians((double) ((-hVar.mo9744k()) + 90.0f)));
            }
            C4809h hVar2 = this.f15332g;
            if (hVar2 == null) {
                f2 = 1.0f;
            } else {
                f2 = (float) Math.sin(Math.toRadians((double) ((-hVar2.mo9744k()) + 90.0f)));
            }
            double tan = Math.tan(Math.toRadians((double) this.f15331f.mo9744k()));
            m13455f();
            float[] fArr = this.f15339n;
            fArr[0] = f;
            fArr[1] = f2;
            float f4 = -f2;
            fArr[3] = f4;
            fArr[4] = f;
            fArr[8] = 1.0f;
            this.f15336k.setValues(fArr);
            m13455f();
            float[] fArr2 = this.f15339n;
            fArr2[0] = 1.0f;
            fArr2[3] = (float) tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f15337l.setValues(fArr2);
            m13455f();
            float[] fArr3 = this.f15339n;
            fArr3[0] = f;
            fArr3[1] = f4;
            fArr3[3] = f2;
            fArr3[4] = f;
            fArr3[8] = 1.0f;
            this.f15338m.setValues(fArr3);
            this.f15337l.preConcat(this.f15336k);
            this.f15338m.preConcat(this.f15337l);
            this.f15335j.preConcat(this.f15338m);
        }
        C4807f fVar3 = this.f15328c;
        if (fVar3 != null) {
            C4959d dVar = (C4959d) fVar3.mo9738e();
            float f5 = dVar.f15748a;
            if (!(f5 == 1.0f && dVar.f15749b == 1.0f)) {
                this.f15335j.preScale(f5, dVar.f15749b);
            }
        }
        C4807f fVar4 = this.f15326a;
        if (fVar4 != null) {
            PointF pointF2 = (PointF) fVar4.mo9738e();
            if (!(pointF2.x == 0.0f && pointF2.y == 0.0f)) {
                this.f15335j.preTranslate(-pointF2.x, -pointF2.y);
            }
        }
        return this.f15335j;
    }

    /* renamed from: c */
    public final void mo9752c(C4878b bVar) {
        bVar.mo9811h(this.f15330e);
        bVar.mo9811h(this.f15333h);
        bVar.mo9811h(this.f15334i);
        bVar.mo9811h(this.f15326a);
        bVar.mo9811h(this.f15327b);
        bVar.mo9811h(this.f15328c);
        bVar.mo9811h(this.f15329d);
        bVar.mo9811h(this.f15331f);
        bVar.mo9811h(this.f15332g);
    }

    /* renamed from: d */
    public final void mo9753d(C4802a aVar) {
        C4807f fVar = this.f15330e;
        if (fVar != null) {
            fVar.mo9740g(aVar);
        }
        C4807f fVar2 = this.f15333h;
        if (fVar2 != null) {
            fVar2.mo9740g(aVar);
        }
        C4807f fVar3 = this.f15334i;
        if (fVar3 != null) {
            fVar3.mo9740g(aVar);
        }
        C4807f fVar4 = this.f15326a;
        if (fVar4 != null) {
            fVar4.mo9740g(aVar);
        }
        C4807f fVar5 = this.f15327b;
        if (fVar5 != null) {
            fVar5.mo9740g(aVar);
        }
        C4807f fVar6 = this.f15328c;
        if (fVar6 != null) {
            fVar6.mo9740g(aVar);
        }
        C4807f fVar7 = this.f15329d;
        if (fVar7 != null) {
            fVar7.mo9740g(aVar);
        }
        C4809h hVar = this.f15331f;
        if (hVar != null) {
            hVar.mo9740g(aVar);
        }
        C4809h hVar2 = this.f15332g;
        if (hVar2 != null) {
            hVar2.mo9740g(aVar);
        }
    }

    /* renamed from: e */
    public final boolean mo9754e(Object obj, C4958c cVar) {
        C4807f fVar;
        C4807f fVar2;
        if (obj == C4829ag.f15374e) {
            C4807f fVar3 = this.f15326a;
            if (fVar3 == null) {
                new PointF();
                this.f15326a = new C4822u(cVar);
                return true;
            }
            fVar3.f15301d = cVar;
            return true;
        } else if (obj == C4829ag.f15375f) {
            C4807f fVar4 = this.f15327b;
            if (fVar4 == null) {
                new PointF();
                this.f15327b = new C4822u(cVar);
                return true;
            }
            fVar4.f15301d = cVar;
            return true;
        } else {
            if (obj == C4829ag.f15376g) {
                C4807f fVar5 = this.f15327b;
                if (fVar5 instanceof C4819r) {
                    C4819r rVar = (C4819r) fVar5;
                    C4958c cVar2 = rVar.f15320e;
                    rVar.f15320e = cVar;
                    return true;
                }
            }
            if (obj == C4829ag.f15377h) {
                C4807f fVar6 = this.f15327b;
                if (fVar6 instanceof C4819r) {
                    C4819r rVar2 = (C4819r) fVar6;
                    C4958c cVar3 = rVar2.f15321f;
                    rVar2.f15321f = cVar;
                    return true;
                }
            }
            if (obj == C4829ag.f15382m) {
                C4807f fVar7 = this.f15328c;
                if (fVar7 == null) {
                    this.f15328c = new C4822u(cVar);
                    return true;
                }
                fVar7.f15301d = cVar;
                return true;
            } else if (obj == C4829ag.f15383n) {
                C4807f fVar8 = this.f15329d;
                if (fVar8 == null) {
                    this.f15329d = new C4822u(cVar);
                    return true;
                }
                fVar8.f15301d = cVar;
                return true;
            } else {
                if (obj == C4829ag.f15372c) {
                    fVar = this.f15330e;
                    if (fVar == null) {
                        this.f15330e = new C4822u(cVar);
                        return true;
                    }
                } else if ((obj == C4829ag.f15362A && (fVar2 = this.f15333h) != null) || ((obj == C4829ag.f15363B && (fVar2 = this.f15334i) != null) || (obj == C4829ag.f15384o && (fVar2 = this.f15331f) != null))) {
                    fVar2.f15301d = cVar;
                    return true;
                } else if (obj != C4829ag.f15385p || (fVar = this.f15332g) == null) {
                    return false;
                }
                fVar.f15301d = cVar;
                return true;
            }
        }
    }

    /* renamed from: b */
    public final Matrix mo9751b(float f) {
        PointF pointF;
        C4959d dVar;
        float f2;
        C4807f fVar = this.f15327b;
        PointF pointF2 = null;
        if (fVar == null) {
            pointF = null;
        } else {
            pointF = (PointF) fVar.mo9738e();
        }
        C4807f fVar2 = this.f15328c;
        if (fVar2 == null) {
            dVar = null;
        } else {
            dVar = (C4959d) fVar2.mo9738e();
        }
        this.f15335j.reset();
        if (pointF != null) {
            this.f15335j.preTranslate(pointF.x * f, pointF.y * f);
        }
        if (dVar != null) {
            double d = (double) f;
            this.f15335j.preScale((float) Math.pow((double) dVar.f15748a, d), (float) Math.pow((double) dVar.f15749b, d));
        }
        C4807f fVar3 = this.f15329d;
        if (fVar3 != null) {
            float floatValue = ((Float) fVar3.mo9738e()).floatValue();
            C4807f fVar4 = this.f15326a;
            if (fVar4 != null) {
                pointF2 = (PointF) fVar4.mo9738e();
            }
            Matrix matrix = this.f15335j;
            float f3 = floatValue * f;
            float f4 = 0.0f;
            if (pointF2 == null) {
                f2 = 0.0f;
            } else {
                f2 = pointF2.x;
            }
            if (pointF2 != null) {
                f4 = pointF2.y;
            }
            matrix.preRotate(f3, f2, f4);
        }
        return this.f15335j;
    }
}
