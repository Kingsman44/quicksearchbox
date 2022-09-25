package androidx.p198v.p199a.p200a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Shader;
import androidx.core.content.p091b.C1855d;
import androidx.core.graphics.C1940f;
import androidx.p060c.C0977g;
import org.chromium.net.PrivateKeyType;

/* renamed from: androidx.v.a.a.q */
/* compiled from: PG */
final class C4258q {

    /* renamed from: a */
    public static final Matrix f13733a = new Matrix();

    /* renamed from: b */
    Paint f13734b;

    /* renamed from: c */
    Paint f13735c;

    /* renamed from: d */
    final C4255n f13736d;

    /* renamed from: e */
    float f13737e;

    /* renamed from: f */
    float f13738f;

    /* renamed from: g */
    float f13739g;

    /* renamed from: h */
    float f13740h;

    /* renamed from: i */
    int f13741i;

    /* renamed from: j */
    String f13742j;

    /* renamed from: k */
    Boolean f13743k;

    /* renamed from: l */
    final C0977g f13744l;

    /* renamed from: m */
    private final Path f13745m;

    /* renamed from: n */
    private final Path f13746n;

    /* renamed from: o */
    private final Matrix f13747o;

    /* renamed from: p */
    private PathMeasure f13748p;

    /* renamed from: q */
    private int f13749q;

    public C4258q() {
        this.f13747o = new Matrix();
        this.f13737e = 0.0f;
        this.f13738f = 0.0f;
        this.f13739g = 0.0f;
        this.f13740h = 0.0f;
        this.f13741i = PrivateKeyType.INVALID;
        this.f13742j = null;
        this.f13743k = null;
        this.f13744l = new C0977g();
        this.f13736d = new C4255n();
        this.f13745m = new Path();
        this.f13746n = new Path();
    }

    /* renamed from: a */
    public final boolean mo9044a() {
        if (this.f13743k == null) {
            this.f13743k = Boolean.valueOf(this.f13736d.mo9006b());
        }
        return this.f13743k.booleanValue();
    }

    /* renamed from: b */
    public final void mo9045b(C4255n nVar, Matrix matrix, Canvas canvas, int i, int i2) {
        Path.FillType fillType;
        C4255n nVar2 = nVar;
        Canvas canvas2 = canvas;
        nVar2.f13716a.set(matrix);
        nVar2.f13716a.preConcat(nVar2.f13725j);
        canvas.save();
        for (int i3 = 0; i3 < nVar2.f13717b.size(); i3++) {
            C4256o oVar = (C4256o) nVar2.f13717b.get(i3);
            if (oVar instanceof C4255n) {
                mo9045b((C4255n) oVar, nVar2.f13716a, canvas, i, i2);
            } else if (oVar instanceof C4257p) {
                C4257p pVar = (C4257p) oVar;
                float f = ((float) i) / this.f13739g;
                float f2 = ((float) i2) / this.f13740h;
                float min = Math.min(f, f2);
                Matrix matrix2 = nVar2.f13716a;
                this.f13747o.set(matrix2);
                this.f13747o.postScale(f, f2);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix2.mapVectors(fArr);
                double hypot = Math.hypot((double) fArr[0], (double) fArr[1]);
                float f3 = min;
                double hypot2 = Math.hypot((double) fArr[2], (double) fArr[3]);
                float f4 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max((float) hypot, (float) hypot2);
                float abs = max > 0.0f ? Math.abs(f4) / max : 0.0f;
                if (abs != 0.0f) {
                    Path path = this.f13745m;
                    path.reset();
                    C1940f[] fVarArr = pVar.f13729m;
                    if (fVarArr != null) {
                        C1940f.m5253a(fVarArr, path);
                    }
                    Path path2 = this.f13745m;
                    this.f13746n.reset();
                    if (pVar.mo9005a()) {
                        Path path3 = this.f13746n;
                        if (pVar.f13731o == 0) {
                            fillType = Path.FillType.WINDING;
                        } else {
                            fillType = Path.FillType.EVEN_ODD;
                        }
                        path3.setFillType(fillType);
                        this.f13746n.addPath(path2, this.f13747o);
                        canvas2.clipPath(this.f13746n);
                    } else {
                        C4254m mVar = (C4254m) pVar;
                        float f5 = mVar.f13710g;
                        if (!(f5 == 0.0f && mVar.f13711h == 1.0f)) {
                            float f6 = mVar.f13712i;
                            float f7 = (f5 + f6) % 1.0f;
                            float f8 = (mVar.f13711h + f6) % 1.0f;
                            if (this.f13748p == null) {
                                this.f13748p = new PathMeasure();
                            }
                            this.f13748p.setPath(this.f13745m, false);
                            float length = this.f13748p.getLength();
                            float f9 = f7 * length;
                            float f10 = f8 * length;
                            path2.reset();
                            if (f9 > f10) {
                                this.f13748p.getSegment(f9, length, path2, true);
                                this.f13748p.getSegment(0.0f, f10, path2, true);
                            } else {
                                this.f13748p.getSegment(f9, f10, path2, true);
                            }
                            path2.rLineTo(0.0f, 0.0f);
                        }
                        this.f13746n.addPath(path2, this.f13747o);
                        if (mVar.f13707d.mo5037d()) {
                            C1855d dVar = mVar.f13707d;
                            if (this.f13735c == null) {
                                Paint paint = new Paint(1);
                                this.f13735c = paint;
                                paint.setStyle(Paint.Style.FILL);
                            }
                            Paint paint2 = this.f13735c;
                            if (dVar.mo5034a()) {
                                Shader shader = dVar.f5730a;
                                shader.setLocalMatrix(this.f13747o);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(mVar.f13709f * 255.0f));
                            } else {
                                paint2.setShader((Shader) null);
                                paint2.setAlpha(PrivateKeyType.INVALID);
                                paint2.setColor(C4261t.m12179a(dVar.f5731b, mVar.f13709f));
                            }
                            paint2.setColorFilter((ColorFilter) null);
                            this.f13746n.setFillType(mVar.f13731o == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas2.drawPath(this.f13746n, paint2);
                        }
                        if (mVar.f13705b.mo5037d()) {
                            C1855d dVar2 = mVar.f13705b;
                            if (this.f13734b == null) {
                                Paint paint3 = new Paint(1);
                                this.f13734b = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.f13734b;
                            Paint.Join join = mVar.f13714k;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = mVar.f13713j;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(mVar.f13715l);
                            if (dVar2.mo5034a()) {
                                Shader shader2 = dVar2.f5730a;
                                shader2.setLocalMatrix(this.f13747o);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(mVar.f13708e * 255.0f));
                            } else {
                                paint4.setShader((Shader) null);
                                paint4.setAlpha(PrivateKeyType.INVALID);
                                paint4.setColor(C4261t.m12179a(dVar2.f5731b, mVar.f13708e));
                            }
                            paint4.setColorFilter((ColorFilter) null);
                            paint4.setStrokeWidth(mVar.f13706c * abs * f3);
                            canvas2.drawPath(this.f13746n, paint4);
                        }
                    }
                }
            }
            int i4 = i;
            int i5 = i2;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return ((float) getRootAlpha()) / 255.0f;
    }

    public int getRootAlpha() {
        return this.f13741i;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f13741i = i;
    }

    public C4258q(C4258q qVar) {
        this.f13747o = new Matrix();
        this.f13737e = 0.0f;
        this.f13738f = 0.0f;
        this.f13739g = 0.0f;
        this.f13740h = 0.0f;
        this.f13741i = PrivateKeyType.INVALID;
        this.f13742j = null;
        this.f13743k = null;
        C0977g gVar = new C0977g();
        this.f13744l = gVar;
        this.f13736d = new C4255n(qVar.f13736d, gVar);
        this.f13745m = new Path(qVar.f13745m);
        this.f13746n = new Path(qVar.f13746n);
        this.f13737e = qVar.f13737e;
        this.f13738f = qVar.f13738f;
        this.f13739g = qVar.f13739g;
        this.f13740h = qVar.f13740h;
        int i = qVar.f13749q;
        this.f13749q = 0;
        this.f13741i = qVar.f13741i;
        this.f13742j = qVar.f13742j;
        String str = qVar.f13742j;
        if (str != null) {
            gVar.put(str, this);
        }
        this.f13743k = qVar.f13743k;
    }
}
