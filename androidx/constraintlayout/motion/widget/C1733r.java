package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.p084a.C1655a;
import androidx.constraintlayout.motion.p084a.C1661af;
import androidx.constraintlayout.motion.p084a.C1665aj;
import androidx.constraintlayout.motion.p084a.C1675at;
import androidx.constraintlayout.motion.p084a.C1680f;
import androidx.constraintlayout.motion.p084a.C1690p;
import androidx.constraintlayout.motion.p084a.C1694t;
import androidx.constraintlayout.p079a.p080a.p081a.C1594d;
import androidx.constraintlayout.p079a.p080a.p081a.C1596f;
import androidx.constraintlayout.p079a.p080a.p081a.C1597g;
import androidx.constraintlayout.p079a.p080a.p081a.C1607q;
import androidx.constraintlayout.widget.C1742a;
import androidx.constraintlayout.widget.C1745d;
import com.google.common.p4535g.C59203do;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: androidx.constraintlayout.motion.widget.r */
/* compiled from: PG */
public final class C1733r {

    /* renamed from: A */
    public Interpolator f5130A = null;

    /* renamed from: B */
    public boolean f5131B = false;

    /* renamed from: C */
    private int f5132C = -1;

    /* renamed from: D */
    private String[] f5133D;

    /* renamed from: E */
    private int[] f5134E;

    /* renamed from: F */
    private final float[] f5135F = new float[4];

    /* renamed from: G */
    private HashMap f5136G;

    /* renamed from: H */
    private View f5137H = null;

    /* renamed from: a */
    final Rect f5138a = new Rect();

    /* renamed from: b */
    final View f5139b;

    /* renamed from: c */
    final int f5140c;

    /* renamed from: d */
    boolean f5141d = false;

    /* renamed from: e */
    public final C1703ab f5142e = new C1703ab();

    /* renamed from: f */
    public final C1703ab f5143f = new C1703ab();

    /* renamed from: g */
    public final C1731p f5144g = new C1731p();

    /* renamed from: h */
    public final C1731p f5145h = new C1731p();

    /* renamed from: i */
    public C1594d[] f5146i;

    /* renamed from: j */
    public C1594d f5147j;

    /* renamed from: k */
    float f5148k = Float.NaN;

    /* renamed from: l */
    float f5149l = 0.0f;

    /* renamed from: m */
    float f5150m = 1.0f;

    /* renamed from: n */
    public int[] f5151n;

    /* renamed from: o */
    public double[] f5152o;

    /* renamed from: p */
    public double[] f5153p;

    /* renamed from: q */
    public final ArrayList f5154q = new ArrayList();

    /* renamed from: r */
    public final float[] f5155r = new float[1];

    /* renamed from: s */
    public final ArrayList f5156s = new ArrayList();

    /* renamed from: t */
    public HashMap f5157t;

    /* renamed from: u */
    public HashMap f5158u;

    /* renamed from: v */
    public C1730o[] f5159v;

    /* renamed from: w */
    public int f5160w = -1;

    /* renamed from: x */
    public int f5161x = -1;

    /* renamed from: y */
    public int f5162y = -1;

    /* renamed from: z */
    public float f5163z = Float.NaN;

    public C1733r(View view) {
        this.f5139b = view;
        this.f5140c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C1745d) {
            String str = ((C1745d) layoutParams).f5256Y;
        }
    }

    /* renamed from: e */
    static final void m4704e(Rect rect, Rect rect2, int i, int i2, int i3) {
        if (i == 1) {
            int i4 = rect.left;
            int i5 = rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i3 - (((i4 + i5) + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        } else if (i == 2) {
            int i6 = rect.left;
            int i7 = rect.right;
            rect2.left = i2 - (((rect.top + rect.bottom) + rect.width()) / 2);
            rect2.top = ((i6 + i7) - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        } else if (i == 3) {
            int i8 = rect.left + rect.right;
            int i9 = rect.top;
            int i10 = rect.bottom;
            rect2.left = ((rect.height() / 2) + rect.top) - (i8 / 2);
            rect2.top = i3 - ((i8 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        } else if (i == 4) {
            int i11 = rect.left;
            int i12 = rect.right;
            rect2.left = i2 - (((rect.bottom + rect.top) + rect.width()) / 2);
            rect2.top = ((i11 + i12) - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        }
    }

    /* renamed from: b */
    public final void mo4807b(double d, float[] fArr, float[] fArr2) {
        double d2 = d;
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f5146i[0].mo4516a(d2, dArr);
        this.f5146i[0].mo4518c(d2, dArr2);
        float f = 0.0f;
        Arrays.fill(fArr2, 0.0f);
        C1703ab abVar = this.f5142e;
        int[] iArr = this.f5151n;
        float f2 = abVar.f4882f;
        float f3 = abVar.f4883g;
        float f4 = abVar.f4884h;
        float f5 = abVar.f4885i;
        float f6 = 0.0f;
        int i = 0;
        float f7 = 0.0f;
        float f8 = 0.0f;
        while (i < iArr.length) {
            float f9 = (float) dArr[i];
            float f10 = (float) dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f2 = f9;
                f = f10;
            } else if (i2 == 2) {
                f3 = f9;
                f6 = f10;
            } else if (i2 == 3) {
                f4 = f9;
                f7 = f10;
            } else if (i2 == 4) {
                f5 = f9;
                f8 = f10;
            }
            i++;
            double d3 = d;
            float[] fArr3 = fArr2;
        }
        float f11 = 2.0f;
        float f12 = f + (f7 / 2.0f);
        float f13 = f6 + (f8 / 2.0f);
        C1733r rVar = abVar.f4890n;
        if (rVar != null) {
            float[] fArr4 = new float[2];
            float[] fArr5 = new float[2];
            rVar.mo4807b(d, fArr4, fArr5);
            float f14 = fArr4[0];
            float f15 = fArr4[1];
            float f16 = fArr5[0];
            float f17 = fArr5[1];
            double d4 = (double) f2;
            double d5 = (double) f3;
            double d6 = (double) f14;
            double sin = Math.sin(d5);
            Double.isNaN(d4);
            Double.isNaN(d6);
            float f18 = f17;
            double d7 = (double) (f4 / 2.0f);
            Double.isNaN(d7);
            float f19 = (float) ((d6 + (sin * d4)) - d7);
            double d8 = (double) f15;
            double cos = Math.cos(d5);
            Double.isNaN(d4);
            Double.isNaN(d8);
            double d9 = (double) (f5 / 2.0f);
            Double.isNaN(d9);
            double d10 = (double) f;
            double d11 = (double) f6;
            double d12 = (double) f16;
            double sin2 = Math.sin(d5);
            Double.isNaN(d10);
            Double.isNaN(d12);
            double d13 = d12 + (sin2 * d10);
            double cos2 = Math.cos(d5);
            Double.isNaN(d11);
            double d14 = (double) f18;
            double cos3 = Math.cos(d5);
            Double.isNaN(d10);
            Double.isNaN(d14);
            double d15 = d14 - (d10 * cos3);
            double sin3 = Math.sin(d5);
            Double.isNaN(d11);
            f2 = f19;
            f3 = (float) ((d8 - (d4 * cos)) - d9);
            f13 = (float) (d15 + (sin3 * d11));
            f12 = (float) (d13 + (cos2 * d11));
            f11 = 2.0f;
        }
        fArr[0] = f2 + (f4 / f11) + 0.0f;
        fArr[1] = f3 + (f5 / f11) + 0.0f;
        fArr2[0] = f12;
        fArr2[1] = f13;
    }

    /* renamed from: c */
    public final void mo4808c(C1703ab abVar) {
        abVar.mo4752c((float) ((int) this.f5139b.getX()), (float) ((int) this.f5139b.getY()), (float) this.f5139b.getWidth(), (float) this.f5139b.getHeight());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo4809d(View view, float f, long j, C1597g gVar) {
        boolean z;
        C1665aj ajVar;
        boolean z2;
        View view2;
        float f2;
        double d;
        float f3;
        C1665aj ajVar2;
        boolean z3;
        double d2;
        boolean z4;
        boolean z5;
        float f4;
        float f5;
        float f6;
        float f7;
        int i;
        C1733r rVar = this;
        View view3 = view;
        float a = rVar.mo4806a(f, (float[]) null);
        int i2 = rVar.f5162y;
        if (i2 != -1) {
            float f8 = 1.0f / ((float) i2);
            float floor = ((float) Math.floor((double) (a / f8))) * f8;
            float f9 = (a % f8) / f8;
            if (!Float.isNaN(rVar.f5163z)) {
                f9 = (f9 + rVar.f5163z) % 1.0f;
            }
            Interpolator interpolator = rVar.f5130A;
            a = ((interpolator != null ? interpolator.getInterpolation(f9) : ((double) f9) > 0.5d ? 1.0f : 0.0f) * f8) + floor;
        }
        float f10 = a;
        HashMap hashMap = rVar.f5157t;
        if (hashMap != null) {
            for (C1661af d3 : hashMap.values()) {
                d3.mo4705d(view3, f10);
            }
        }
        HashMap hashMap2 = rVar.f5136G;
        if (hashMap2 != null) {
            ajVar = null;
            z = false;
            for (C1675at atVar : hashMap2.values()) {
                if (atVar instanceof C1665aj) {
                    ajVar = (C1665aj) atVar;
                } else {
                    z |= atVar.mo4706d(view, f10, j, gVar);
                }
            }
        } else {
            ajVar = null;
            z = false;
        }
        C1594d[] dVarArr = rVar.f5146i;
        if (dVarArr != null) {
            double d4 = (double) f10;
            dVarArr[0].mo4516a(d4, rVar.f5152o);
            rVar.f5146i[0].mo4518c(d4, rVar.f5153p);
            C1594d dVar = rVar.f5147j;
            if (dVar != null) {
                double[] dArr = rVar.f5152o;
                if (dArr.length > 0) {
                    dVar.mo4516a(d4, dArr);
                    rVar.f5147j.mo4518c(d4, rVar.f5153p);
                }
            }
            if (!rVar.f5131B) {
                C1703ab abVar = rVar.f5142e;
                int[] iArr = rVar.f5151n;
                double[] dArr2 = rVar.f5152o;
                double[] dArr3 = rVar.f5153p;
                boolean z6 = rVar.f5141d;
                float f11 = abVar.f4882f;
                float f12 = abVar.f4883g;
                float f13 = abVar.f4884h;
                float f14 = abVar.f4885i;
                float f15 = f11;
                int length = iArr.length;
                float f16 = f14;
                if (length != 0 && abVar.f4893q.length <= (i = iArr[length - 1])) {
                    int i3 = i + 1;
                    abVar.f4893q = new double[i3];
                    abVar.f4894r = new double[i3];
                }
                float f17 = f12;
                float f18 = f13;
                Arrays.fill(abVar.f4893q, Double.NaN);
                for (int i4 = 0; i4 < iArr.length; i4++) {
                    double[] dArr4 = abVar.f4893q;
                    int i5 = iArr[i4];
                    dArr4[i5] = dArr2[i4];
                    abVar.f4894r[i5] = dArr3[i4];
                }
                float f19 = Float.NaN;
                float f20 = f17;
                f3 = f10;
                float f21 = f15;
                float f22 = f16;
                float f23 = f18;
                int i6 = 0;
                float f24 = 0.0f;
                float f25 = 0.0f;
                ajVar2 = ajVar;
                z3 = z;
                float f26 = 0.0f;
                float f27 = 0.0f;
                while (true) {
                    double[] dArr5 = abVar.f4893q;
                    int length2 = dArr5.length;
                    double d5 = C59203do.f157270a;
                    z5 = z6;
                    if (i6 >= length2) {
                        break;
                    }
                    if (Double.isNaN(dArr5[i6])) {
                        f7 = f19;
                        f6 = f20;
                    } else {
                        if (!Double.isNaN(abVar.f4893q[i6])) {
                            d5 = abVar.f4893q[i6] + C59203do.f157270a;
                        }
                        f7 = f19;
                        float f28 = (float) d5;
                        f6 = f20;
                        float f29 = (float) abVar.f4894r[i6];
                        if (i6 == 1) {
                            f21 = f28;
                            f27 = f29;
                        } else if (i6 == 2) {
                            f20 = f28;
                            f26 = f29;
                            f19 = f7;
                            i6++;
                            z6 = z5;
                        } else if (i6 == 3) {
                            f23 = f28;
                            f24 = f29;
                        } else if (i6 == 4) {
                            f22 = f28;
                            f25 = f29;
                        } else if (i6 == 5) {
                            f19 = f28;
                            f20 = f6;
                            i6++;
                            z6 = z5;
                        }
                        f20 = f6;
                        f19 = f7;
                        i6++;
                        z6 = z5;
                    }
                    f19 = f7;
                    f20 = f6;
                    i6++;
                    z6 = z5;
                }
                float f30 = f19;
                float f31 = f20;
                C1733r rVar2 = abVar.f4890n;
                if (rVar2 != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    rVar2.mo4807b(d4, fArr, fArr2);
                    float f32 = fArr[0];
                    float f33 = fArr[1];
                    float f34 = fArr2[0];
                    float f35 = fArr2[1];
                    double d6 = (double) f21;
                    float f36 = f31;
                    d = d4;
                    double d7 = (double) f36;
                    double[] dArr6 = dArr3;
                    double d8 = (double) f32;
                    double sin = Math.sin(d7);
                    Double.isNaN(d6);
                    Double.isNaN(d8);
                    f4 = f23;
                    double d9 = (double) (f23 / 2.0f);
                    Double.isNaN(d9);
                    double d10 = (double) f33;
                    double cos = Math.cos(d7);
                    Double.isNaN(d6);
                    Double.isNaN(d10);
                    double d11 = d10 - (cos * d6);
                    double d12 = (double) (f22 / 2.0f);
                    Double.isNaN(d12);
                    float f37 = (float) (d11 - d12);
                    double d13 = (double) f27;
                    double d14 = (double) f26;
                    float f38 = f37;
                    double d15 = (double) f34;
                    double sin2 = Math.sin(d7);
                    Double.isNaN(d13);
                    Double.isNaN(d15);
                    double d16 = d15 + (sin2 * d13);
                    double cos2 = Math.cos(d7);
                    Double.isNaN(d6);
                    Double.isNaN(d14);
                    float f39 = (float) (d16 + (cos2 * d6 * d14));
                    float f40 = (float) ((d8 + (sin * d6)) - d9);
                    double d17 = (double) f35;
                    double cos3 = Math.cos(d7);
                    Double.isNaN(d13);
                    Double.isNaN(d17);
                    double d18 = d17 - (d13 * cos3);
                    double sin3 = Math.sin(d7);
                    Double.isNaN(d6);
                    Double.isNaN(d14);
                    float f41 = (float) (d18 + (d6 * sin3 * d14));
                    double[] dArr7 = dArr6;
                    if (dArr7.length >= 2) {
                        dArr7[0] = (double) f39;
                        dArr7[1] = (double) f41;
                    }
                    if (!Float.isNaN(f30)) {
                        double d19 = (double) f30;
                        double degrees = Math.toDegrees(Math.atan2((double) f41, (double) f39));
                        Double.isNaN(d19);
                        view2 = view;
                        view2.setRotation((float) (d19 + degrees));
                    } else {
                        view2 = view;
                    }
                    f21 = f40;
                    f5 = f38;
                } else {
                    view2 = view3;
                    f4 = f23;
                    f5 = f31;
                    d = d4;
                    if (!Float.isNaN(f30)) {
                        double d20 = (double) f30;
                        double degrees2 = Math.toDegrees(Math.atan2((double) (f26 + (f25 / 2.0f)), (double) (f27 + (f24 / 2.0f))));
                        Double.isNaN(d20);
                        view2.setRotation((float) (d20 + degrees2 + C59203do.f157270a));
                    }
                }
                if (view2 instanceof C1717b) {
                    ((C1717b) view2).mo4790a();
                } else {
                    float f42 = f21 + 0.5f;
                    int i7 = (int) f42;
                    float f43 = f5 + 0.5f;
                    int i8 = (int) f43;
                    int i9 = (int) (f42 + f4);
                    int i10 = (int) (f43 + f22);
                    int i11 = i9 - i7;
                    int i12 = i10 - i8;
                    if (!(i11 == view.getMeasuredWidth() && i12 == view.getMeasuredHeight() && !z5)) {
                        view2.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                    }
                    view2.layout(i7, i8, i9, i10);
                }
                rVar = this;
                rVar.f5141d = false;
            } else {
                d = d4;
                view2 = view3;
                f3 = f10;
                ajVar2 = ajVar;
                z3 = z;
            }
            if (rVar.f5161x != -1) {
                if (rVar.f5137H == null) {
                    rVar.f5137H = ((View) view.getParent()).findViewById(rVar.f5161x);
                }
                View view4 = rVar.f5137H;
                if (view4 != null) {
                    float top = ((float) (view4.getTop() + rVar.f5137H.getBottom())) / 2.0f;
                    float left = ((float) (rVar.f5137H.getLeft() + rVar.f5137H.getRight())) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        int left2 = view.getLeft();
                        int top2 = view.getTop();
                        view2.setPivotX(left - ((float) left2));
                        view2.setPivotY(top - ((float) top2));
                    }
                }
            }
            HashMap hashMap3 = rVar.f5157t;
            if (hashMap3 != null) {
                for (C1607q qVar : hashMap3.values()) {
                    if (qVar instanceof C1694t) {
                        double[] dArr8 = rVar.f5153p;
                        if (dArr8.length > 1) {
                            view2.setRotation(((C1694t) qVar).mo4534a(f3) + ((float) Math.toDegrees(Math.atan2(dArr8[1], dArr8[0]))));
                        }
                    }
                }
            }
            f2 = f3;
            if (ajVar2 != null) {
                double[] dArr9 = rVar.f5153p;
                d2 = d;
                view2.setRotation(ajVar2.mo4707e(f2, j, view, gVar) + ((float) Math.toDegrees(Math.atan2(dArr9[1], dArr9[0]))));
                z4 = z3 | ajVar2.f4474h;
            } else {
                d2 = d;
                z4 = z3;
            }
            int i13 = 1;
            while (true) {
                C1594d[] dVarArr2 = rVar.f5146i;
                if (i13 >= dVarArr2.length) {
                    break;
                }
                dVarArr2[i13].mo4517b(d2, rVar.f5135F);
                C1655a.m4531a((C1742a) rVar.f5142e.f4891o.get(rVar.f5133D[i13 - 1]), view2, rVar.f5135F);
                i13++;
            }
            C1731p pVar = rVar.f5144g;
            if (pVar.f5112b == 0) {
                if (f2 <= 0.0f) {
                    view2.setVisibility(pVar.f5113c);
                } else if (f2 >= 1.0f) {
                    view2.setVisibility(rVar.f5145h.f5113c);
                } else if (rVar.f5145h.f5113c != pVar.f5113c) {
                    view2.setVisibility(0);
                }
            }
            if (rVar.f5159v != null) {
                int i14 = 0;
                while (true) {
                    C1730o[] oVarArr = rVar.f5159v;
                    if (i14 >= oVarArr.length) {
                        break;
                    }
                    oVarArr[i14].mo4800g(f2, view2);
                    i14++;
                }
            }
            z2 = z4;
        } else {
            view2 = view3;
            f2 = f10;
            boolean z7 = z;
            C1703ab abVar2 = rVar.f5142e;
            float f44 = abVar2.f4882f;
            C1703ab abVar3 = rVar.f5143f;
            float f45 = abVar3.f4882f;
            float f46 = abVar2.f4883g;
            float f47 = abVar3.f4883g;
            float f48 = abVar2.f4884h;
            float f49 = abVar3.f4884h;
            float f50 = abVar2.f4885i;
            float f51 = abVar3.f4885i;
            float f52 = f44 + ((f45 - f44) * f2) + 0.5f;
            int i15 = (int) f52;
            float f53 = f46 + ((f47 - f46) * f2) + 0.5f;
            int i16 = (int) f53;
            int i17 = (int) (f52 + ((f49 - f48) * f2) + f48);
            int i18 = (int) (f53 + ((f51 - f50) * f2) + f50);
            int i19 = i17 - i15;
            int i20 = i18 - i16;
            if (!(f49 == f48 && f51 == f50 && !rVar.f5141d)) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(i19, 1073741824), View.MeasureSpec.makeMeasureSpec(i20, 1073741824));
                rVar.f5141d = false;
            }
            view2.layout(i15, i16, i17, i18);
            z2 = z7;
        }
        HashMap hashMap4 = rVar.f5158u;
        if (hashMap4 != null) {
            for (C1690p pVar2 : hashMap4.values()) {
                if (pVar2 instanceof C1680f) {
                    double[] dArr10 = rVar.f5153p;
                    view2.setRotation(((float) ((C1680f) pVar2).f4415a.mo4526a(f2)) + ((float) Math.toDegrees(Math.atan2(dArr10[1], dArr10[0]))));
                } else {
                    pVar2.mo4711c(view2, f2);
                }
            }
        }
        return z2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x026b, code lost:
        r15 = r18;
        r14 = r20;
        r13 = r21;
        r5 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0273, code lost:
        r8 = r30;
        r6 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0277, code lost:
        r18 = r3;
        r3 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x027b, code lost:
        r17 = r2;
        r2 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x049a, code lost:
        r16 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x049c, code lost:
        switch(r16) {
            case 0: goto L_0x04ff;
            case 1: goto L_0x04f9;
            case 2: goto L_0x04f3;
            case 3: goto L_0x04ed;
            case 4: goto L_0x04e7;
            case 5: goto L_0x04e1;
            case 6: goto L_0x04db;
            case 7: goto L_0x04d5;
            case 8: goto L_0x04cf;
            case 9: goto L_0x04c9;
            case 10: goto L_0x04c3;
            case 11: goto L_0x04bd;
            case 12: goto L_0x04b7;
            case 13: goto L_0x04b1;
            case 14: goto L_0x04ab;
            case 15: goto L_0x04a5;
            default: goto L_0x049f;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x049f, code lost:
        r16 = r2;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x04a5, code lost:
        r16 = new androidx.constraintlayout.motion.p084a.C1697w();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x04ab, code lost:
        r16 = new androidx.constraintlayout.motion.p084a.C1660ae();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x04b1, code lost:
        r16 = new androidx.constraintlayout.motion.p084a.C1659ad();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x04b7, code lost:
        r16 = new androidx.constraintlayout.motion.p084a.C1658ac();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x04bd, code lost:
        r16 = new androidx.constraintlayout.motion.p084a.C1691q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x04c3, code lost:
        r16 = new androidx.constraintlayout.motion.p084a.C1691q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x04c9, code lost:
        r16 = new androidx.constraintlayout.motion.p084a.C1657ab();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x04cf, code lost:
        r16 = new androidx.constraintlayout.motion.p084a.C1656aa();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x04d5, code lost:
        r16 = new androidx.constraintlayout.motion.p084a.C1694t();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04db, code lost:
        r16 = new androidx.constraintlayout.motion.p084a.C1696v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x04e1, code lost:
        r16 = new androidx.constraintlayout.motion.p084a.C1695u();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x04e7, code lost:
        r16 = new androidx.constraintlayout.motion.p084a.C1700z();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x04ed, code lost:
        r16 = new androidx.constraintlayout.motion.p084a.C1699y();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x04f3, code lost:
        r16 = new androidx.constraintlayout.motion.p084a.C1698x();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x04f9, code lost:
        r16 = new androidx.constraintlayout.motion.p084a.C1693s();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x04ff, code lost:
        r16 = new androidx.constraintlayout.motion.p084a.C1691q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0504, code lost:
        r46 = r16;
        r16 = r2;
        r2 = r46;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0662, code lost:
        r1 = r16;
        r0 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x070c, code lost:
        r3 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x070d, code lost:
        switch(r3) {
            case 0: goto L_0x075b;
            case 1: goto L_0x0755;
            case 2: goto L_0x074f;
            case 3: goto L_0x0749;
            case 4: goto L_0x0743;
            case 5: goto L_0x073d;
            case 6: goto L_0x0737;
            case 7: goto L_0x0731;
            case 8: goto L_0x072b;
            case 9: goto L_0x0725;
            case 10: goto L_0x071f;
            case 11: goto L_0x0719;
            default: goto L_0x0710;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0710, code lost:
        r20 = r0;
        r16 = r1;
        r0 = r50;
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0719, code lost:
        r3 = new androidx.constraintlayout.motion.p084a.C1666ak();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x071f, code lost:
        r3 = new androidx.constraintlayout.motion.p084a.C1674as();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0725, code lost:
        r3 = new androidx.constraintlayout.motion.p084a.C1673ar();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x072b, code lost:
        r3 = new androidx.constraintlayout.motion.p084a.C1672aq();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0731, code lost:
        r3 = new androidx.constraintlayout.motion.p084a.C1671ap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0737, code lost:
        r3 = new androidx.constraintlayout.motion.p084a.C1670ao();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x073d, code lost:
        r3 = new androidx.constraintlayout.motion.p084a.C1665aj();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0743, code lost:
        r3 = new androidx.constraintlayout.motion.p084a.C1669an();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0749, code lost:
        r3 = new androidx.constraintlayout.motion.p084a.C1668am();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x074f, code lost:
        r3 = new androidx.constraintlayout.motion.p084a.C1667al();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0755, code lost:
        r3 = new androidx.constraintlayout.motion.p084a.C1664ai();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x075b, code lost:
        r3 = new androidx.constraintlayout.motion.p084a.C1662ag();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0760, code lost:
        r20 = r0;
        r16 = r1;
        r3.f4475i = r50;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0833, code lost:
        r4 = r16;
        r3 = r20;
        r2 = r36;
        r1 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x0920, code lost:
        r7 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0921, code lost:
        switch(r7) {
            case 0: goto L_0x0b0b;
            case 1: goto L_0x0ae5;
            case 2: goto L_0x0abf;
            case 3: goto L_0x0a98;
            case 4: goto L_0x0a71;
            case 5: goto L_0x0a4a;
            case 6: goto L_0x0a23;
            case 7: goto L_0x09fc;
            case 8: goto L_0x09d5;
            case 9: goto L_0x09ae;
            case 10: goto L_0x0987;
            case 11: goto L_0x0951;
            default: goto L_0x0924;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0924, code lost:
        r20 = r3;
        r16 = r4;
        r7 = r37;
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 20);
        r4.append("UNKNOWN addValues \"");
        r4.append(r0);
        r4.append("\"");
        android.util.Log.e("KeyTimeCycles", r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0951, code lost:
        r7 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0959, code lost:
        if (java.lang.Float.isNaN(r7.f5085s) != false) goto L_0x0978;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x095b, code lost:
        r16 = r4;
        r20 = r3;
        r30.mo4544b(r7.f5013a, r7.f5085s, r7.f5087u, r7.f5086t, r7.f5088v);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x0978, code lost:
        r14 = r1;
        r15 = r2;
        r20 = r3;
        r16 = r4;
        r3 = r7;
        r7 = r28;
        r0 = r29;
        r4 = r47;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0987, code lost:
        r20 = r3;
        r16 = r4;
        r7 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0993, code lost:
        if (java.lang.Float.isNaN(r7.f5084r) != false) goto L_0x0b30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x0995, code lost:
        r30.mo4544b(r7.f5013a, r7.f5084r, r7.f5087u, r7.f5086t, r7.f5088v);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x09ae, code lost:
        r20 = r3;
        r16 = r4;
        r7 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x09ba, code lost:
        if (java.lang.Float.isNaN(r7.f5083q) != false) goto L_0x0b30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x09bc, code lost:
        r30.mo4544b(r7.f5013a, r7.f5083q, r7.f5087u, r7.f5086t, r7.f5088v);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x09d5, code lost:
        r20 = r3;
        r16 = r4;
        r7 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x09e1, code lost:
        if (java.lang.Float.isNaN(r7.f5082p) != false) goto L_0x0b30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x09e3, code lost:
        r30.mo4544b(r7.f5013a, r7.f5082p, r7.f5087u, r7.f5086t, r7.f5088v);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x09fc, code lost:
        r20 = r3;
        r16 = r4;
        r7 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0a08, code lost:
        if (java.lang.Float.isNaN(r7.f5081o) != false) goto L_0x0b30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0a0a, code lost:
        r30.mo4544b(r7.f5013a, r7.f5081o, r7.f5087u, r7.f5086t, r7.f5088v);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0a23, code lost:
        r20 = r3;
        r16 = r4;
        r7 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0a2f, code lost:
        if (java.lang.Float.isNaN(r7.f5080n) != false) goto L_0x0b30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0a31, code lost:
        r30.mo4544b(r7.f5013a, r7.f5080n, r7.f5087u, r7.f5086t, r7.f5088v);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0a4a, code lost:
        r20 = r3;
        r16 = r4;
        r7 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0a56, code lost:
        if (java.lang.Float.isNaN(r7.f5079m) != false) goto L_0x0b30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0a58, code lost:
        r30.mo4544b(r7.f5013a, r7.f5079m, r7.f5087u, r7.f5086t, r7.f5088v);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0a71, code lost:
        r20 = r3;
        r16 = r4;
        r7 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0a7d, code lost:
        if (java.lang.Float.isNaN(r7.f5078l) != false) goto L_0x0b30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0a7f, code lost:
        r30.mo4544b(r7.f5013a, r7.f5078l, r7.f5087u, r7.f5086t, r7.f5088v);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0a98, code lost:
        r20 = r3;
        r16 = r4;
        r7 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0aa4, code lost:
        if (java.lang.Float.isNaN(r7.f5077k) != false) goto L_0x0b30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0aa6, code lost:
        r30.mo4544b(r7.f5013a, r7.f5077k, r7.f5087u, r7.f5086t, r7.f5088v);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0abf, code lost:
        r20 = r3;
        r16 = r4;
        r7 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0acb, code lost:
        if (java.lang.Float.isNaN(r7.f5076j) != false) goto L_0x0b30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0acd, code lost:
        r30.mo4544b(r7.f5013a, r7.f5076j, r7.f5087u, r7.f5086t, r7.f5088v);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0ae5, code lost:
        r20 = r3;
        r16 = r4;
        r7 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0af1, code lost:
        if (java.lang.Float.isNaN(r7.f5075i) != false) goto L_0x0b30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0af3, code lost:
        r30.mo4544b(r7.f5013a, r7.f5075i, r7.f5087u, r7.f5086t, r7.f5088v);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0b0b, code lost:
        r20 = r3;
        r16 = r4;
        r7 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0b17, code lost:
        if (java.lang.Float.isNaN(r7.f5074h) != false) goto L_0x0b30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0b19, code lost:
        r30.mo4544b(r7.f5013a, r7.f5074h, r7.f5087u, r7.f5086t, r7.f5088v);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0b30, code lost:
        r4 = r47;
        r14 = r1;
        r15 = r2;
        r3 = r7;
        r7 = r28;
        r0 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0b39, code lost:
        r1 = r50;
        r2 = r51;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:557:0x10a3, code lost:
        r1 = r16;
        r13 = r21;
        r10 = r24;
        r9 = r28;
        r3 = r29;
        r12 = r30;
        r11 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:558:0x10b1, code lost:
        r2 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:559:0x10b3, code lost:
        r15 = r36;
        r14 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:581:0x1185, code lost:
        r12 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:585:0x11a8, code lost:
        r11 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:612:0x12b6, code lost:
        r16 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:613:0x12b8, code lost:
        switch(r16) {
            case 0: goto L_0x1319;
            case 1: goto L_0x1314;
            case 2: goto L_0x130f;
            case 3: goto L_0x130a;
            case 4: goto L_0x1305;
            case 5: goto L_0x1300;
            case 6: goto L_0x12fb;
            case 7: goto L_0x12f6;
            case 8: goto L_0x12f1;
            case 9: goto L_0x12ec;
            case 10: goto L_0x12e7;
            case 11: goto L_0x12e2;
            case 12: goto L_0x12dd;
            case 13: goto L_0x12d8;
            default: goto L_0x12bb;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:614:0x12bb, code lost:
        r16 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:615:0x12c3, code lost:
        if (r8.startsWith("CUSTOM") != false) goto L_0x132d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:616:0x12c5, code lost:
        r1 = java.lang.String.valueOf(r8);
        r32 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:617:0x12d1, code lost:
        if (r1.length() == 0) goto L_0x1322;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:618:0x12d3, code lost:
        r1 = "  UNKNOWN  ".concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:619:0x12d8, code lost:
        r16 = r1;
        r1 = r4.f5042m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:620:0x12dd, code lost:
        r16 = r1;
        r1 = r4.f5041l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:621:0x12e2, code lost:
        r16 = r1;
        r1 = r4.f5040k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:622:0x12e7, code lost:
        r16 = r1;
        r1 = r4.f5054y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:623:0x12ec, code lost:
        r16 = r1;
        r1 = r4.f5053x;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:624:0x12f1, code lost:
        r16 = r1;
        r1 = r4.f5052w;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:625:0x12f6, code lost:
        r16 = r1;
        r1 = r4.f5051v;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:626:0x12fb, code lost:
        r16 = r1;
        r1 = r4.f5050u;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:627:0x1300, code lost:
        r16 = r1;
        r1 = r4.f5047r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:628:0x1305, code lost:
        r16 = r1;
        r1 = r4.f5049t;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:629:0x130a, code lost:
        r16 = r1;
        r1 = r4.f5048s;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:630:0x130f, code lost:
        r16 = r1;
        r1 = r4.f5046q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:631:0x1314, code lost:
        r16 = r1;
        r1 = r4.f5045p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:632:0x1319, code lost:
        r16 = r1;
        r1 = r4.f5044o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:633:0x131d, code lost:
        r38 = r1;
        r32 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:634:0x1322, code lost:
        r1 = new java.lang.String("  UNKNOWN  ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:635:0x1327, code lost:
        android.util.Log.v("WARNING! KeyCycle", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:636:0x132d, code lost:
        r32 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:637:0x132f, code lost:
        r38 = Float.NaN;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:639:0x1337, code lost:
        if (java.lang.Float.isNaN(r38) != false) goto L_0x1390;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:640:0x1339, code lost:
        r1 = (androidx.constraintlayout.motion.p084a.C1690p) r6.get(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:641:0x133f, code lost:
        if (r1 == null) goto L_0x1390;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:642:0x1341, code lost:
        r2 = r4.f5013a;
        r8 = r4.f5037h;
        r29 = r3;
        r3 = r4.f5038i;
        r19 = r6;
        r6 = r4.f5043n;
        r51 = r7;
        r28 = r9;
        r24 = r10;
        r21 = r4;
        r31 = r11;
        r1.f4420f.add(new androidx.constraintlayout.p079a.p080a.p081a.C1600j(r2, r4.f5039j, r4.f5040k, r4.f5041l, r38));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:643:0x1372, code lost:
        if (r6 == -1) goto L_0x1376;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:644:0x1374, code lost:
        r1.f4419e = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:645:0x1376, code lost:
        r1.f4417c = r8;
        r1.f4418d = r3;
        r3 = r50;
        r7 = r51;
        r30 = r12;
        r38 = r14;
        r36 = r15;
        r2 = r18;
        r6 = r19;
        r4 = r21;
        r21 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:646:0x1390, code lost:
        r29 = r3;
        r28 = r9;
        r24 = r10;
        r31 = r11;
        r30 = r12;
        r21 = r13;
        r38 = r14;
        r36 = r15;
        r2 = r18;
        r3 = r50;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4810f(int r48, int r49, long r50) {
        /*
            r47 = this;
            r0 = r47
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            int r5 = r0.f5160w
            r6 = -1
            if (r5 == r6) goto L_0x0024
            androidx.constraintlayout.motion.widget.ab r7 = r0.f5142e
            r7.f4887k = r5
        L_0x0024:
            androidx.constraintlayout.motion.widget.p r5 = r0.f5144g
            androidx.constraintlayout.motion.widget.p r7 = r0.f5145h
            float r8 = r5.f5111a
            float r9 = r7.f5111a
            boolean r8 = androidx.constraintlayout.motion.widget.C1731p.m4700d(r8, r9)
            java.lang.String r9 = "alpha"
            if (r8 == 0) goto L_0x0037
            r2.add(r9)
        L_0x0037:
            float r8 = r5.f5114d
            float r10 = r7.f5114d
            boolean r8 = androidx.constraintlayout.motion.widget.C1731p.m4700d(r8, r10)
            java.lang.String r10 = "elevation"
            if (r8 == 0) goto L_0x0046
            r2.add(r10)
        L_0x0046:
            int r8 = r5.f5113c
            int r11 = r7.f5113c
            if (r8 == r11) goto L_0x0057
            int r12 = r5.f5112b
            if (r12 != 0) goto L_0x0057
            if (r8 == 0) goto L_0x0054
            if (r11 != 0) goto L_0x0057
        L_0x0054:
            r2.add(r9)
        L_0x0057:
            float r8 = r5.f5115e
            float r11 = r7.f5115e
            boolean r8 = androidx.constraintlayout.motion.widget.C1731p.m4700d(r8, r11)
            java.lang.String r11 = "rotation"
            if (r8 == 0) goto L_0x0066
            r2.add(r11)
        L_0x0066:
            float r8 = r5.f5125o
            boolean r8 = java.lang.Float.isNaN(r8)
            java.lang.String r12 = "transitionPathRotate"
            if (r8 == 0) goto L_0x0078
            float r8 = r7.f5125o
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 != 0) goto L_0x007b
        L_0x0078:
            r2.add(r12)
        L_0x007b:
            float r8 = r5.f5126p
            boolean r8 = java.lang.Float.isNaN(r8)
            java.lang.String r13 = "progress"
            if (r8 == 0) goto L_0x008d
            float r8 = r7.f5126p
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 != 0) goto L_0x0090
        L_0x008d:
            r2.add(r13)
        L_0x0090:
            float r8 = r5.f5116f
            float r14 = r7.f5116f
            boolean r8 = androidx.constraintlayout.motion.widget.C1731p.m4700d(r8, r14)
            java.lang.String r14 = "rotationX"
            if (r8 == 0) goto L_0x009f
            r2.add(r14)
        L_0x009f:
            float r8 = r5.f5117g
            float r15 = r7.f5117g
            boolean r8 = androidx.constraintlayout.motion.widget.C1731p.m4700d(r8, r15)
            java.lang.String r15 = "rotationY"
            if (r8 == 0) goto L_0x00ae
            r2.add(r15)
        L_0x00ae:
            float r8 = r5.f5120j
            float r6 = r7.f5120j
            boolean r6 = androidx.constraintlayout.motion.widget.C1731p.m4700d(r8, r6)
            if (r6 == 0) goto L_0x00bd
            java.lang.String r6 = "transformPivotX"
            r2.add(r6)
        L_0x00bd:
            float r6 = r5.f5121k
            float r8 = r7.f5121k
            boolean r6 = androidx.constraintlayout.motion.widget.C1731p.m4700d(r6, r8)
            if (r6 == 0) goto L_0x00cc
            java.lang.String r6 = "transformPivotY"
            r2.add(r6)
        L_0x00cc:
            float r6 = r5.f5118h
            float r8 = r7.f5118h
            boolean r6 = androidx.constraintlayout.motion.widget.C1731p.m4700d(r6, r8)
            java.lang.String r8 = "scaleX"
            if (r6 == 0) goto L_0x00db
            r2.add(r8)
        L_0x00db:
            float r6 = r5.f5119i
            r16 = r14
            float r14 = r7.f5119i
            boolean r6 = androidx.constraintlayout.motion.widget.C1731p.m4700d(r6, r14)
            java.lang.String r14 = "scaleY"
            if (r6 == 0) goto L_0x00ec
            r2.add(r14)
        L_0x00ec:
            float r6 = r5.f5122l
            r17 = r15
            float r15 = r7.f5122l
            boolean r6 = androidx.constraintlayout.motion.widget.C1731p.m4700d(r6, r15)
            java.lang.String r15 = "translationX"
            if (r6 == 0) goto L_0x00fd
            r2.add(r15)
        L_0x00fd:
            float r6 = r5.f5123m
            r18 = r15
            float r15 = r7.f5123m
            boolean r6 = androidx.constraintlayout.motion.widget.C1731p.m4700d(r6, r15)
            java.lang.String r15 = "translationY"
            if (r6 == 0) goto L_0x010e
            r2.add(r15)
        L_0x010e:
            float r5 = r5.f5124n
            float r6 = r7.f5124n
            boolean r5 = androidx.constraintlayout.motion.widget.C1731p.m4700d(r5, r6)
            java.lang.String r6 = "translationZ"
            if (r5 == 0) goto L_0x011d
            r2.add(r6)
        L_0x011d:
            java.util.ArrayList r5 = r0.f5156s
            int r7 = r5.size()
            r19 = 0
            r20 = r15
            r21 = r6
            r6 = r19
            r15 = 0
        L_0x012c:
            if (r15 >= r7) goto L_0x01d0
            java.lang.Object r22 = r5.get(r15)
            r23 = r5
            r5 = r22
            androidx.constraintlayout.motion.widget.c r5 = (androidx.constraintlayout.motion.widget.C1718c) r5
            r22 = r7
            boolean r7 = r5 instanceof androidx.constraintlayout.motion.widget.C1725j
            if (r7 == 0) goto L_0x0195
            androidx.constraintlayout.motion.widget.j r5 = (androidx.constraintlayout.motion.widget.C1725j) r5
            androidx.constraintlayout.motion.widget.ab r7 = new androidx.constraintlayout.motion.widget.ab
            r30 = r13
            androidx.constraintlayout.motion.widget.ab r13 = r0.f5142e
            r31 = r8
            androidx.constraintlayout.motion.widget.ab r8 = r0.f5143f
            r24 = r7
            r25 = r48
            r26 = r49
            r27 = r5
            r28 = r13
            r29 = r8
            r24.<init>(r25, r26, r27, r28, r29)
            java.util.ArrayList r8 = r0.f5154q
            int r8 = java.util.Collections.binarySearch(r8, r7)
            if (r8 != 0) goto L_0x0184
            float r8 = r7.f4881e
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r24 = r14
            r14 = 52
            r13.<init>(r14)
            java.lang.String r14 = " KeyPath position \""
            r13.append(r14)
            r13.append(r8)
            java.lang.String r8 = "\" outside of range"
            r13.append(r8)
            java.lang.String r8 = "MotionController"
            java.lang.String r13 = r13.toString()
            android.util.Log.e(r8, r13)
            r8 = 0
            goto L_0x0186
        L_0x0184:
            r24 = r14
        L_0x0186:
            java.util.ArrayList r13 = r0.f5154q
            int r8 = -r8
            r14 = -1
            int r8 = r8 + r14
            r13.add(r8, r7)
            int r5 = r5.f5070p
            if (r5 == r14) goto L_0x01c2
            r0.f5132C = r5
            goto L_0x01c2
        L_0x0195:
            r31 = r8
            r30 = r13
            r24 = r14
            boolean r7 = r5 instanceof androidx.constraintlayout.motion.widget.C1722g
            if (r7 == 0) goto L_0x01a3
            r5.mo4793c(r3)
            goto L_0x01c2
        L_0x01a3:
            boolean r7 = r5 instanceof androidx.constraintlayout.motion.widget.C1728m
            if (r7 == 0) goto L_0x01ab
            r5.mo4793c(r1)
            goto L_0x01c2
        L_0x01ab:
            boolean r7 = r5 instanceof androidx.constraintlayout.motion.widget.C1730o
            if (r7 == 0) goto L_0x01bc
            if (r6 != 0) goto L_0x01b6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x01b6:
            androidx.constraintlayout.motion.widget.o r5 = (androidx.constraintlayout.motion.widget.C1730o) r5
            r6.add(r5)
            goto L_0x01c2
        L_0x01bc:
            r5.mo4796e(r4)
            r5.mo4793c(r2)
        L_0x01c2:
            int r15 = r15 + 1
            r7 = r22
            r5 = r23
            r14 = r24
            r13 = r30
            r8 = r31
            goto L_0x012c
        L_0x01d0:
            r31 = r8
            r30 = r13
            r24 = r14
            if (r6 == 0) goto L_0x01e3
            r5 = 0
            androidx.constraintlayout.motion.widget.o[] r7 = new androidx.constraintlayout.motion.widget.C1730o[r5]
            java.lang.Object[] r5 = r6.toArray(r7)
            androidx.constraintlayout.motion.widget.o[] r5 = (androidx.constraintlayout.motion.widget.C1730o[]) r5
            r0.f5159v = r5
        L_0x01e3:
            boolean r5 = r2.isEmpty()
            r14 = 1
            if (r5 != 0) goto L_0x05c9
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r0.f5157t = r5
            java.util.Iterator r5 = r2.iterator()
        L_0x01f5:
            boolean r22 = r5.hasNext()
            if (r22 == 0) goto L_0x0543
            java.lang.Object r22 = r5.next()
            r7 = r22
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = "CUSTOM,"
            boolean r8 = r7.startsWith(r8)
            if (r8 == 0) goto L_0x0262
            android.util.SparseArray r8 = new android.util.SparseArray
            r8.<init>()
            java.lang.String r13 = ","
            java.lang.String[] r13 = r7.split(r13)
            r13 = r13[r14]
            java.util.ArrayList r15 = r0.f5156s
            int r6 = r15.size()
            r14 = 0
        L_0x021f:
            if (r14 >= r6) goto L_0x0246
            java.lang.Object r28 = r15.get(r14)
            r29 = r5
            r5 = r28
            androidx.constraintlayout.motion.widget.c r5 = (androidx.constraintlayout.motion.widget.C1718c) r5
            r28 = r6
            java.util.HashMap r6 = r5.f5017e
            if (r6 != 0) goto L_0x0232
            goto L_0x023f
        L_0x0232:
            java.lang.Object r6 = r6.get(r13)
            androidx.constraintlayout.widget.a r6 = (androidx.constraintlayout.widget.C1742a) r6
            if (r6 == 0) goto L_0x023f
            int r5 = r5.f5013a
            r8.append(r5, r6)
        L_0x023f:
            int r14 = r14 + 1
            r6 = r28
            r5 = r29
            goto L_0x021f
        L_0x0246:
            r29 = r5
            androidx.constraintlayout.motion.a.r r5 = new androidx.constraintlayout.motion.a.r
            r5.<init>(r7, r8)
            r15 = r18
            r14 = r20
            r13 = r21
            r8 = r30
            r6 = r31
            r18 = r3
            r3 = r17
            r17 = r2
            r2 = r5
            r5 = r24
            goto L_0x050a
        L_0x0262:
            r29 = r5
            int r5 = r7.hashCode()
            switch(r5) {
                case -1249320806: goto L_0x047d;
                case -1249320805: goto L_0x0460;
                case -1225497657: goto L_0x0441;
                case -1225497656: goto L_0x041d;
                case -1225497655: goto L_0x03f7;
                case -1001078227: goto L_0x03cf;
                case -908189618: goto L_0x03a5;
                case -908189617: goto L_0x037d;
                case -797520672: goto L_0x035b;
                case -760884510: goto L_0x033b;
                case -760884509: goto L_0x031b;
                case -40300674: goto L_0x02fd;
                case -4379043: goto L_0x02df;
                case 37232917: goto L_0x02c1;
                case 92909918: goto L_0x02a3;
                case 156108012: goto L_0x0281;
                default: goto L_0x026b;
            }
        L_0x026b:
            r15 = r18
            r14 = r20
            r13 = r21
            r5 = r24
        L_0x0273:
            r8 = r30
            r6 = r31
        L_0x0277:
            r18 = r3
            r3 = r17
        L_0x027b:
            r17 = r2
            r2 = r16
            goto L_0x049a
        L_0x0281:
            java.lang.String r5 = "waveOffset"
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x026b
            r5 = 10
            r15 = r18
            r14 = r20
            r13 = r21
            r5 = r24
            r8 = r30
            r6 = r31
            r18 = r3
            r3 = r17
            r17 = r2
            r2 = r16
            r16 = 10
            goto L_0x049c
        L_0x02a3:
            boolean r5 = r7.equals(r9)
            if (r5 == 0) goto L_0x026b
            r15 = r18
            r14 = r20
            r13 = r21
            r5 = r24
            r8 = r30
            r6 = r31
            r18 = r3
            r3 = r17
            r17 = r2
            r2 = r16
            r16 = 0
            goto L_0x049c
        L_0x02c1:
            boolean r5 = r7.equals(r12)
            if (r5 == 0) goto L_0x026b
            r15 = r18
            r14 = r20
            r13 = r21
            r5 = r24
            r8 = r30
            r6 = r31
            r18 = r3
            r3 = r17
            r17 = r2
            r2 = r16
            r16 = 7
            goto L_0x049c
        L_0x02df:
            boolean r5 = r7.equals(r10)
            if (r5 == 0) goto L_0x026b
            r15 = r18
            r14 = r20
            r13 = r21
            r5 = r24
            r8 = r30
            r6 = r31
            r18 = r3
            r3 = r17
            r17 = r2
            r2 = r16
            r16 = 1
            goto L_0x049c
        L_0x02fd:
            boolean r5 = r7.equals(r11)
            if (r5 == 0) goto L_0x026b
            r15 = r18
            r14 = r20
            r13 = r21
            r5 = r24
            r8 = r30
            r6 = r31
            r18 = r3
            r3 = r17
            r17 = r2
            r2 = r16
            r16 = 2
            goto L_0x049c
        L_0x031b:
            java.lang.String r5 = "transformPivotY"
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x026b
            r15 = r18
            r14 = r20
            r13 = r21
            r5 = r24
            r8 = r30
            r6 = r31
            r18 = r3
            r3 = r17
            r17 = r2
            r2 = r16
            r16 = 6
            goto L_0x049c
        L_0x033b:
            java.lang.String r5 = "transformPivotX"
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x026b
            r15 = r18
            r14 = r20
            r13 = r21
            r5 = r24
            r8 = r30
            r6 = r31
            r18 = r3
            r3 = r17
            r17 = r2
            r2 = r16
            r16 = 5
            goto L_0x049c
        L_0x035b:
            java.lang.String r5 = "waveVariesBy"
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x026b
            r5 = 11
            r15 = r18
            r14 = r20
            r13 = r21
            r5 = r24
            r8 = r30
            r6 = r31
            r18 = r3
            r3 = r17
            r17 = r2
            r2 = r16
            r16 = 11
            goto L_0x049c
        L_0x037d:
            r5 = r24
            boolean r6 = r7.equals(r5)
            if (r6 == 0) goto L_0x039d
            r6 = 9
            r15 = r18
            r14 = r20
            r13 = r21
            r8 = r30
            r6 = r31
            r18 = r3
            r3 = r17
            r17 = r2
            r2 = r16
            r16 = 9
            goto L_0x049c
        L_0x039d:
            r15 = r18
            r14 = r20
            r13 = r21
            goto L_0x0273
        L_0x03a5:
            r5 = r24
            r6 = r31
            boolean r8 = r7.equals(r6)
            if (r8 == 0) goto L_0x03c5
            r8 = 8
            r15 = r18
            r14 = r20
            r13 = r21
            r8 = r30
            r18 = r3
            r3 = r17
            r17 = r2
            r2 = r16
            r16 = 8
            goto L_0x049c
        L_0x03c5:
            r15 = r18
            r14 = r20
            r13 = r21
            r8 = r30
            goto L_0x0277
        L_0x03cf:
            r5 = r24
            r8 = r30
            r6 = r31
            boolean r13 = r7.equals(r8)
            if (r13 == 0) goto L_0x03ef
            r13 = 15
            r15 = r18
            r14 = r20
            r13 = r21
            r18 = r3
            r3 = r17
            r17 = r2
            r2 = r16
            r16 = 15
            goto L_0x049c
        L_0x03ef:
            r15 = r18
            r14 = r20
            r13 = r21
            goto L_0x0277
        L_0x03f7:
            r13 = r21
            r5 = r24
            r8 = r30
            r6 = r31
            boolean r14 = r7.equals(r13)
            if (r14 == 0) goto L_0x0417
            r14 = 14
            r15 = r18
            r14 = r20
            r18 = r3
            r3 = r17
            r17 = r2
            r2 = r16
            r16 = 14
            goto L_0x049c
        L_0x0417:
            r15 = r18
            r14 = r20
            goto L_0x0277
        L_0x041d:
            r14 = r20
            r13 = r21
            r5 = r24
            r8 = r30
            r6 = r31
            boolean r15 = r7.equals(r14)
            if (r15 == 0) goto L_0x043d
            r15 = 13
            r15 = r18
            r18 = r3
            r3 = r17
            r17 = r2
            r2 = r16
            r16 = 13
            goto L_0x049c
        L_0x043d:
            r15 = r18
            goto L_0x0277
        L_0x0441:
            r15 = r18
            r14 = r20
            r13 = r21
            r5 = r24
            r8 = r30
            r6 = r31
            boolean r18 = r7.equals(r15)
            if (r18 == 0) goto L_0x0277
            r18 = 12
            r18 = r3
            r3 = r17
            r17 = r2
            r2 = r16
            r16 = 12
            goto L_0x049c
        L_0x0460:
            r15 = r18
            r14 = r20
            r13 = r21
            r5 = r24
            r8 = r30
            r6 = r31
            r18 = r3
            r3 = r17
            boolean r17 = r7.equals(r3)
            if (r17 == 0) goto L_0x027b
            r17 = r2
            r2 = r16
            r16 = 4
            goto L_0x049c
        L_0x047d:
            r15 = r18
            r14 = r20
            r13 = r21
            r5 = r24
            r8 = r30
            r6 = r31
            r18 = r3
            r3 = r17
            r17 = r2
            r2 = r16
            boolean r16 = r7.equals(r2)
            if (r16 == 0) goto L_0x049a
            r16 = 3
            goto L_0x049c
        L_0x049a:
            r16 = -1
        L_0x049c:
            switch(r16) {
                case 0: goto L_0x04ff;
                case 1: goto L_0x04f9;
                case 2: goto L_0x04f3;
                case 3: goto L_0x04ed;
                case 4: goto L_0x04e7;
                case 5: goto L_0x04e1;
                case 6: goto L_0x04db;
                case 7: goto L_0x04d5;
                case 8: goto L_0x04cf;
                case 9: goto L_0x04c9;
                case 10: goto L_0x04c3;
                case 11: goto L_0x04bd;
                case 12: goto L_0x04b7;
                case 13: goto L_0x04b1;
                case 14: goto L_0x04ab;
                case 15: goto L_0x04a5;
                default: goto L_0x049f;
            }
        L_0x049f:
            r16 = r2
            r2 = r19
            goto L_0x050a
        L_0x04a5:
            androidx.constraintlayout.motion.a.w r16 = new androidx.constraintlayout.motion.a.w
            r16.<init>()
            goto L_0x0504
        L_0x04ab:
            androidx.constraintlayout.motion.a.ae r16 = new androidx.constraintlayout.motion.a.ae
            r16.<init>()
            goto L_0x0504
        L_0x04b1:
            androidx.constraintlayout.motion.a.ad r16 = new androidx.constraintlayout.motion.a.ad
            r16.<init>()
            goto L_0x0504
        L_0x04b7:
            androidx.constraintlayout.motion.a.ac r16 = new androidx.constraintlayout.motion.a.ac
            r16.<init>()
            goto L_0x0504
        L_0x04bd:
            androidx.constraintlayout.motion.a.q r16 = new androidx.constraintlayout.motion.a.q
            r16.<init>()
            goto L_0x0504
        L_0x04c3:
            androidx.constraintlayout.motion.a.q r16 = new androidx.constraintlayout.motion.a.q
            r16.<init>()
            goto L_0x0504
        L_0x04c9:
            androidx.constraintlayout.motion.a.ab r16 = new androidx.constraintlayout.motion.a.ab
            r16.<init>()
            goto L_0x0504
        L_0x04cf:
            androidx.constraintlayout.motion.a.aa r16 = new androidx.constraintlayout.motion.a.aa
            r16.<init>()
            goto L_0x0504
        L_0x04d5:
            androidx.constraintlayout.motion.a.t r16 = new androidx.constraintlayout.motion.a.t
            r16.<init>()
            goto L_0x0504
        L_0x04db:
            androidx.constraintlayout.motion.a.v r16 = new androidx.constraintlayout.motion.a.v
            r16.<init>()
            goto L_0x0504
        L_0x04e1:
            androidx.constraintlayout.motion.a.u r16 = new androidx.constraintlayout.motion.a.u
            r16.<init>()
            goto L_0x0504
        L_0x04e7:
            androidx.constraintlayout.motion.a.z r16 = new androidx.constraintlayout.motion.a.z
            r16.<init>()
            goto L_0x0504
        L_0x04ed:
            androidx.constraintlayout.motion.a.y r16 = new androidx.constraintlayout.motion.a.y
            r16.<init>()
            goto L_0x0504
        L_0x04f3:
            androidx.constraintlayout.motion.a.x r16 = new androidx.constraintlayout.motion.a.x
            r16.<init>()
            goto L_0x0504
        L_0x04f9:
            androidx.constraintlayout.motion.a.s r16 = new androidx.constraintlayout.motion.a.s
            r16.<init>()
            goto L_0x0504
        L_0x04ff:
            androidx.constraintlayout.motion.a.q r16 = new androidx.constraintlayout.motion.a.q
            r16.<init>()
        L_0x0504:
            r46 = r16
            r16 = r2
            r2 = r46
        L_0x050a:
            if (r2 == 0) goto L_0x052c
            r2.f4442d = r7
            r20 = r3
            java.util.HashMap r3 = r0.f5157t
            r3.put(r7, r2)
            r24 = r5
            r31 = r6
            r30 = r8
            r21 = r13
            r2 = r17
            r3 = r18
            r17 = r20
            r5 = r29
            r20 = r14
            r18 = r15
            r14 = 1
            goto L_0x01f5
        L_0x052c:
            r24 = r5
            r31 = r6
            r30 = r8
            r21 = r13
            r20 = r14
            r2 = r17
            r5 = r29
            r14 = 1
            r17 = r3
            r3 = r18
            r18 = r15
            goto L_0x01f5
        L_0x0543:
            r15 = r18
            r14 = r20
            r13 = r21
            r5 = r24
            r8 = r30
            r6 = r31
            r18 = r3
            r20 = r17
            r17 = r2
            java.util.ArrayList r2 = r0.f5156s
            int r3 = r2.size()
            r7 = 0
        L_0x055c:
            if (r7 >= r3) goto L_0x057a
            java.lang.Object r21 = r2.get(r7)
            r24 = r2
            r2 = r21
            androidx.constraintlayout.motion.widget.c r2 = (androidx.constraintlayout.motion.widget.C1718c) r2
            r21 = r3
            boolean r3 = r2 instanceof androidx.constraintlayout.motion.widget.C1720e
            if (r3 == 0) goto L_0x0573
            java.util.HashMap r3 = r0.f5157t
            r2.mo4792b(r3)
        L_0x0573:
            int r7 = r7 + 1
            r3 = r21
            r2 = r24
            goto L_0x055c
        L_0x057a:
            androidx.constraintlayout.motion.widget.p r2 = r0.f5144g
            java.util.HashMap r3 = r0.f5157t
            r7 = 0
            r2.mo4801a(r3, r7)
            androidx.constraintlayout.motion.widget.p r2 = r0.f5145h
            java.util.HashMap r3 = r0.f5157t
            r7 = 100
            r2.mo4801a(r3, r7)
            java.util.HashMap r2 = r0.f5157t
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0595:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x05db
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r7 = r4.containsKey(r3)
            if (r7 == 0) goto L_0x05b6
            java.lang.Object r7 = r4.get(r3)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L_0x05b6
            int r7 = r7.intValue()
            r21 = r2
            goto L_0x05b9
        L_0x05b6:
            r21 = r2
            r7 = 0
        L_0x05b9:
            java.util.HashMap r2 = r0.f5157t
            java.lang.Object r2 = r2.get(r3)
            androidx.constraintlayout.a.a.a.q r2 = (androidx.constraintlayout.p079a.p080a.p081a.C1607q) r2
            if (r2 == 0) goto L_0x05c6
            r2.mo4536c(r7)
        L_0x05c6:
            r2 = r21
            goto L_0x0595
        L_0x05c9:
            r15 = r18
            r14 = r20
            r13 = r21
            r5 = r24
            r8 = r30
            r6 = r31
            r18 = r3
            r20 = r17
            r17 = r2
        L_0x05db:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x0b95
            java.util.HashMap r2 = r0.f5136G
            if (r2 != 0) goto L_0x05ec
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r0.f5136G = r2
        L_0x05ec:
            java.util.Iterator r1 = r1.iterator()
        L_0x05f0:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0785
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.HashMap r3 = r0.f5136G
            boolean r3 = r3.containsKey(r2)
            if (r3 != 0) goto L_0x0777
            java.lang.String r3 = "CUSTOM,"
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L_0x0657
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            java.lang.String r7 = ","
            java.lang.String[] r7 = r2.split(r7)
            r21 = 1
            r7 = r7[r21]
            r21 = r1
            java.util.ArrayList r1 = r0.f5156s
            r24 = r4
            int r4 = r1.size()
            r0 = 0
        L_0x0626:
            if (r0 >= r4) goto L_0x064d
            java.lang.Object r28 = r1.get(r0)
            r29 = r1
            r1 = r28
            androidx.constraintlayout.motion.widget.c r1 = (androidx.constraintlayout.motion.widget.C1718c) r1
            r28 = r4
            java.util.HashMap r4 = r1.f5017e
            if (r4 != 0) goto L_0x0639
            goto L_0x0646
        L_0x0639:
            java.lang.Object r4 = r4.get(r7)
            androidx.constraintlayout.widget.a r4 = (androidx.constraintlayout.widget.C1742a) r4
            if (r4 == 0) goto L_0x0646
            int r1 = r1.f5013a
            r3.append(r1, r4)
        L_0x0646:
            int r0 = r0 + 1
            r4 = r28
            r1 = r29
            goto L_0x0626
        L_0x064d:
            androidx.constraintlayout.motion.a.ah r0 = new androidx.constraintlayout.motion.a.ah
            r0.<init>(r2, r3)
            r3 = r0
            r0 = r50
            goto L_0x0768
        L_0x0657:
            r21 = r1
            r24 = r4
            int r0 = r2.hashCode()
            switch(r0) {
                case -1249320806: goto L_0x0700;
                case -1249320805: goto L_0x06f1;
                case -1225497657: goto L_0x06e2;
                case -1225497656: goto L_0x06d3;
                case -1225497655: goto L_0x06c4;
                case -1001078227: goto L_0x06b5;
                case -908189618: goto L_0x06a9;
                case -908189617: goto L_0x069c;
                case -40300674: goto L_0x068f;
                case -4379043: goto L_0x0682;
                case 37232917: goto L_0x0675;
                case 92909918: goto L_0x0668;
                default: goto L_0x0662;
            }
        L_0x0662:
            r1 = r16
            r0 = r20
            goto L_0x070c
        L_0x0668:
            boolean r0 = r2.equals(r9)
            if (r0 == 0) goto L_0x0662
            r1 = r16
            r0 = r20
            r3 = 0
            goto L_0x070d
        L_0x0675:
            boolean r0 = r2.equals(r12)
            if (r0 == 0) goto L_0x0662
            r1 = r16
            r0 = r20
            r3 = 5
            goto L_0x070d
        L_0x0682:
            boolean r0 = r2.equals(r10)
            if (r0 == 0) goto L_0x0662
            r1 = r16
            r0 = r20
            r3 = 1
            goto L_0x070d
        L_0x068f:
            boolean r0 = r2.equals(r11)
            if (r0 == 0) goto L_0x0662
            r1 = r16
            r0 = r20
            r3 = 2
            goto L_0x070d
        L_0x069c:
            boolean r0 = r2.equals(r5)
            if (r0 == 0) goto L_0x0662
            r1 = r16
            r0 = r20
            r3 = 7
            goto L_0x070d
        L_0x06a9:
            boolean r0 = r2.equals(r6)
            if (r0 == 0) goto L_0x0662
            r1 = r16
            r0 = r20
            r3 = 6
            goto L_0x070d
        L_0x06b5:
            boolean r0 = r2.equals(r8)
            if (r0 == 0) goto L_0x0662
            r0 = 11
            r1 = r16
            r0 = r20
            r3 = 11
            goto L_0x070d
        L_0x06c4:
            boolean r0 = r2.equals(r13)
            if (r0 == 0) goto L_0x0662
            r0 = 10
            r1 = r16
            r0 = r20
            r3 = 10
            goto L_0x070d
        L_0x06d3:
            boolean r0 = r2.equals(r14)
            if (r0 == 0) goto L_0x0662
            r0 = 9
            r1 = r16
            r0 = r20
            r3 = 9
            goto L_0x070d
        L_0x06e2:
            boolean r0 = r2.equals(r15)
            if (r0 == 0) goto L_0x0662
            r0 = 8
            r1 = r16
            r0 = r20
            r3 = 8
            goto L_0x070d
        L_0x06f1:
            r0 = r20
            boolean r1 = r2.equals(r0)
            if (r1 == 0) goto L_0x06fd
            r1 = r16
            r3 = 4
            goto L_0x070d
        L_0x06fd:
            r1 = r16
            goto L_0x070c
        L_0x0700:
            r1 = r16
            r0 = r20
            boolean r3 = r2.equals(r1)
            if (r3 == 0) goto L_0x070c
            r3 = 3
            goto L_0x070d
        L_0x070c:
            r3 = -1
        L_0x070d:
            switch(r3) {
                case 0: goto L_0x075b;
                case 1: goto L_0x0755;
                case 2: goto L_0x074f;
                case 3: goto L_0x0749;
                case 4: goto L_0x0743;
                case 5: goto L_0x073d;
                case 6: goto L_0x0737;
                case 7: goto L_0x0731;
                case 8: goto L_0x072b;
                case 9: goto L_0x0725;
                case 10: goto L_0x071f;
                case 11: goto L_0x0719;
                default: goto L_0x0710;
            }
        L_0x0710:
            r20 = r0
            r16 = r1
            r0 = r50
            r3 = r19
            goto L_0x0768
        L_0x0719:
            androidx.constraintlayout.motion.a.ak r3 = new androidx.constraintlayout.motion.a.ak
            r3.<init>()
            goto L_0x0760
        L_0x071f:
            androidx.constraintlayout.motion.a.as r3 = new androidx.constraintlayout.motion.a.as
            r3.<init>()
            goto L_0x0760
        L_0x0725:
            androidx.constraintlayout.motion.a.ar r3 = new androidx.constraintlayout.motion.a.ar
            r3.<init>()
            goto L_0x0760
        L_0x072b:
            androidx.constraintlayout.motion.a.aq r3 = new androidx.constraintlayout.motion.a.aq
            r3.<init>()
            goto L_0x0760
        L_0x0731:
            androidx.constraintlayout.motion.a.ap r3 = new androidx.constraintlayout.motion.a.ap
            r3.<init>()
            goto L_0x0760
        L_0x0737:
            androidx.constraintlayout.motion.a.ao r3 = new androidx.constraintlayout.motion.a.ao
            r3.<init>()
            goto L_0x0760
        L_0x073d:
            androidx.constraintlayout.motion.a.aj r3 = new androidx.constraintlayout.motion.a.aj
            r3.<init>()
            goto L_0x0760
        L_0x0743:
            androidx.constraintlayout.motion.a.an r3 = new androidx.constraintlayout.motion.a.an
            r3.<init>()
            goto L_0x0760
        L_0x0749:
            androidx.constraintlayout.motion.a.am r3 = new androidx.constraintlayout.motion.a.am
            r3.<init>()
            goto L_0x0760
        L_0x074f:
            androidx.constraintlayout.motion.a.al r3 = new androidx.constraintlayout.motion.a.al
            r3.<init>()
            goto L_0x0760
        L_0x0755:
            androidx.constraintlayout.motion.a.ai r3 = new androidx.constraintlayout.motion.a.ai
            r3.<init>()
            goto L_0x0760
        L_0x075b:
            androidx.constraintlayout.motion.a.ag r3 = new androidx.constraintlayout.motion.a.ag
            r3.<init>()
        L_0x0760:
            r20 = r0
            r16 = r1
            r0 = r50
            r3.f4475i = r0
        L_0x0768:
            if (r3 == 0) goto L_0x0774
            r3.f4472f = r2
            r4 = r47
            java.util.HashMap r7 = r4.f5136G
            r7.put(r2, r3)
            goto L_0x077e
        L_0x0774:
            r0 = r47
            goto L_0x077f
        L_0x0777:
            r21 = r1
            r24 = r4
            r4 = r0
            r0 = r50
        L_0x077e:
            r0 = r4
        L_0x077f:
            r1 = r21
            r4 = r24
            goto L_0x05f0
        L_0x0785:
            r24 = r4
            r4 = r0
            java.util.ArrayList r0 = r4.f5156s
            int r1 = r0.size()
            r2 = 0
        L_0x078f:
            if (r2 >= r1) goto L_0x0b5a
            java.lang.Object r3 = r0.get(r2)
            androidx.constraintlayout.motion.widget.c r3 = (androidx.constraintlayout.motion.widget.C1718c) r3
            boolean r7 = r3 instanceof androidx.constraintlayout.motion.widget.C1728m
            if (r7 == 0) goto L_0x0b45
            androidx.constraintlayout.motion.widget.m r3 = (androidx.constraintlayout.motion.widget.C1728m) r3
            java.util.HashMap r7 = r4.f5136G
            java.util.Set r21 = r7.keySet()
            java.util.Iterator r21 = r21.iterator()
        L_0x07a7:
            boolean r28 = r21.hasNext()
            if (r28 == 0) goto L_0x0b45
            java.lang.Object r28 = r21.next()
            r29 = r0
            r0 = r28
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r28 = r7.get(r0)
            r30 = r28
            androidx.constraintlayout.motion.a.at r30 = (androidx.constraintlayout.motion.p084a.C1675at) r30
            if (r30 == 0) goto L_0x0b3f
            r50 = r1
            java.lang.String r1 = "CUSTOM"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L_0x0822
            r1 = 7
            java.lang.String r0 = r0.substring(r1)
            java.util.HashMap r1 = r3.f5017e
            java.lang.Object r0 = r1.get(r0)
            androidx.constraintlayout.widget.a r0 = (androidx.constraintlayout.widget.C1742a) r0
            if (r0 == 0) goto L_0x081c
            r1 = r30
            androidx.constraintlayout.motion.a.ah r1 = (androidx.constraintlayout.motion.p084a.C1663ah) r1
            r28 = r7
            int r7 = r3.f5013a
            float r4 = r3.f5087u
            r51 = r2
            int r2 = r3.f5086t
            r36 = r15
            float r15 = r3.f5088v
            r37 = r3
            android.util.SparseArray r3 = r1.f4803l
            r3.append(r7, r0)
            android.util.SparseArray r0 = r1.f4804m
            r38 = r14
            r3 = 2
            float[] r14 = new float[r3]
            r3 = 0
            r14[r3] = r4
            r3 = 1
            r14[r3] = r15
            r0.append(r7, r14)
            int r0 = r1.f4468b
            int r0 = java.lang.Math.max(r0, r2)
            r1.f4468b = r0
            r4 = r47
            r1 = r50
            r2 = r51
            r7 = r28
            r0 = r29
            r15 = r36
            r3 = r37
            r14 = r38
            goto L_0x07a7
        L_0x081c:
            r4 = r47
            r1 = r50
            goto L_0x0b41
        L_0x0822:
            r51 = r2
            r37 = r3
            r28 = r7
            r38 = r14
            r36 = r15
            int r1 = r0.hashCode()
            switch(r1) {
                case -1249320806: goto L_0x0910;
                case -1249320805: goto L_0x08fd;
                case -1225497657: goto L_0x08e5;
                case -1225497656: goto L_0x08cb;
                case -1225497655: goto L_0x08b7;
                case -1001078227: goto L_0x08a3;
                case -908189618: goto L_0x0892;
                case -908189617: goto L_0x0881;
                case -40300674: goto L_0x0870;
                case -4379043: goto L_0x085f;
                case 37232917: goto L_0x084e;
                case 92909918: goto L_0x083d;
                default: goto L_0x0833;
            }
        L_0x0833:
            r4 = r16
            r3 = r20
            r2 = r36
            r1 = r38
            goto L_0x0920
        L_0x083d:
            boolean r1 = r0.equals(r9)
            if (r1 == 0) goto L_0x0833
            r4 = r16
            r3 = r20
            r2 = r36
            r1 = r38
            r7 = 0
            goto L_0x0921
        L_0x084e:
            boolean r1 = r0.equals(r12)
            if (r1 == 0) goto L_0x0833
            r4 = r16
            r3 = r20
            r2 = r36
            r1 = r38
            r7 = 5
            goto L_0x0921
        L_0x085f:
            boolean r1 = r0.equals(r10)
            if (r1 == 0) goto L_0x0833
            r4 = r16
            r3 = r20
            r2 = r36
            r1 = r38
            r7 = 1
            goto L_0x0921
        L_0x0870:
            boolean r1 = r0.equals(r11)
            if (r1 == 0) goto L_0x0833
            r4 = r16
            r3 = r20
            r2 = r36
            r1 = r38
            r7 = 2
            goto L_0x0921
        L_0x0881:
            boolean r1 = r0.equals(r5)
            if (r1 == 0) goto L_0x0833
            r4 = r16
            r3 = r20
            r2 = r36
            r1 = r38
            r7 = 7
            goto L_0x0921
        L_0x0892:
            boolean r1 = r0.equals(r6)
            if (r1 == 0) goto L_0x0833
            r4 = r16
            r3 = r20
            r2 = r36
            r1 = r38
            r7 = 6
            goto L_0x0921
        L_0x08a3:
            boolean r1 = r0.equals(r8)
            if (r1 == 0) goto L_0x0833
            r1 = 11
            r4 = r16
            r3 = r20
            r2 = r36
            r1 = r38
            r7 = 11
            goto L_0x0921
        L_0x08b7:
            boolean r1 = r0.equals(r13)
            if (r1 == 0) goto L_0x0833
            r1 = 10
            r4 = r16
            r3 = r20
            r2 = r36
            r1 = r38
            r7 = 10
            goto L_0x0921
        L_0x08cb:
            r1 = r38
            boolean r2 = r0.equals(r1)
            if (r2 == 0) goto L_0x08de
            r2 = 9
            r4 = r16
            r3 = r20
            r2 = r36
            r7 = 9
            goto L_0x0921
        L_0x08de:
            r4 = r16
            r3 = r20
            r2 = r36
            goto L_0x0920
        L_0x08e5:
            r2 = r36
            r1 = r38
            boolean r3 = r0.equals(r2)
            if (r3 == 0) goto L_0x08f8
            r3 = 8
            r4 = r16
            r3 = r20
            r7 = 8
            goto L_0x0921
        L_0x08f8:
            r4 = r16
            r3 = r20
            goto L_0x0920
        L_0x08fd:
            r3 = r20
            r2 = r36
            r1 = r38
            boolean r4 = r0.equals(r3)
            if (r4 == 0) goto L_0x090d
            r4 = r16
            r7 = 4
            goto L_0x0921
        L_0x090d:
            r4 = r16
            goto L_0x0920
        L_0x0910:
            r4 = r16
            r3 = r20
            r2 = r36
            r1 = r38
            boolean r7 = r0.equals(r4)
            if (r7 == 0) goto L_0x0920
            r7 = 3
            goto L_0x0921
        L_0x0920:
            r7 = -1
        L_0x0921:
            switch(r7) {
                case 0: goto L_0x0b0b;
                case 1: goto L_0x0ae5;
                case 2: goto L_0x0abf;
                case 3: goto L_0x0a98;
                case 4: goto L_0x0a71;
                case 5: goto L_0x0a4a;
                case 6: goto L_0x0a23;
                case 7: goto L_0x09fc;
                case 8: goto L_0x09d5;
                case 9: goto L_0x09ae;
                case 10: goto L_0x0987;
                case 11: goto L_0x0951;
                default: goto L_0x0924;
            }
        L_0x0924:
            r20 = r3
            r16 = r4
            r7 = r37
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 20
            r4.<init>(r3)
            java.lang.String r3 = "UNKNOWN addValues \""
            r4.append(r3)
            r4.append(r0)
            java.lang.String r0 = "\""
            r4.append(r0)
            java.lang.String r0 = "KeyTimeCycles"
            java.lang.String r3 = r4.toString()
            android.util.Log.e(r0, r3)
            goto L_0x0b30
        L_0x0951:
            r7 = r37
            float r0 = r7.f5085s
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x0978
            int r0 = r7.f5013a
            float r14 = r7.f5085s
            float r15 = r7.f5087u
            r16 = r4
            int r4 = r7.f5086t
            r20 = r3
            float r3 = r7.f5088v
            r31 = r0
            r32 = r14
            r33 = r15
            r34 = r4
            r35 = r3
            r30.mo4544b(r31, r32, r33, r34, r35)
            goto L_0x0b30
        L_0x0978:
            r14 = r1
            r15 = r2
            r20 = r3
            r16 = r4
            r3 = r7
            r7 = r28
            r0 = r29
            r4 = r47
            goto L_0x0b39
        L_0x0987:
            r20 = r3
            r16 = r4
            r7 = r37
            float r0 = r7.f5084r
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x0b30
            int r0 = r7.f5013a
            float r3 = r7.f5084r
            float r4 = r7.f5087u
            int r14 = r7.f5086t
            float r15 = r7.f5088v
            r31 = r0
            r32 = r3
            r33 = r4
            r34 = r14
            r35 = r15
            r30.mo4544b(r31, r32, r33, r34, r35)
            goto L_0x0b30
        L_0x09ae:
            r20 = r3
            r16 = r4
            r7 = r37
            float r0 = r7.f5083q
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x0b30
            int r0 = r7.f5013a
            float r3 = r7.f5083q
            float r4 = r7.f5087u
            int r14 = r7.f5086t
            float r15 = r7.f5088v
            r31 = r0
            r32 = r3
            r33 = r4
            r34 = r14
            r35 = r15
            r30.mo4544b(r31, r32, r33, r34, r35)
            goto L_0x0b30
        L_0x09d5:
            r20 = r3
            r16 = r4
            r7 = r37
            float r0 = r7.f5082p
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x0b30
            int r0 = r7.f5013a
            float r3 = r7.f5082p
            float r4 = r7.f5087u
            int r14 = r7.f5086t
            float r15 = r7.f5088v
            r31 = r0
            r32 = r3
            r33 = r4
            r34 = r14
            r35 = r15
            r30.mo4544b(r31, r32, r33, r34, r35)
            goto L_0x0b30
        L_0x09fc:
            r20 = r3
            r16 = r4
            r7 = r37
            float r0 = r7.f5081o
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x0b30
            int r0 = r7.f5013a
            float r3 = r7.f5081o
            float r4 = r7.f5087u
            int r14 = r7.f5086t
            float r15 = r7.f5088v
            r31 = r0
            r32 = r3
            r33 = r4
            r34 = r14
            r35 = r15
            r30.mo4544b(r31, r32, r33, r34, r35)
            goto L_0x0b30
        L_0x0a23:
            r20 = r3
            r16 = r4
            r7 = r37
            float r0 = r7.f5080n
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x0b30
            int r0 = r7.f5013a
            float r3 = r7.f5080n
            float r4 = r7.f5087u
            int r14 = r7.f5086t
            float r15 = r7.f5088v
            r31 = r0
            r32 = r3
            r33 = r4
            r34 = r14
            r35 = r15
            r30.mo4544b(r31, r32, r33, r34, r35)
            goto L_0x0b30
        L_0x0a4a:
            r20 = r3
            r16 = r4
            r7 = r37
            float r0 = r7.f5079m
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x0b30
            int r0 = r7.f5013a
            float r3 = r7.f5079m
            float r4 = r7.f5087u
            int r14 = r7.f5086t
            float r15 = r7.f5088v
            r31 = r0
            r32 = r3
            r33 = r4
            r34 = r14
            r35 = r15
            r30.mo4544b(r31, r32, r33, r34, r35)
            goto L_0x0b30
        L_0x0a71:
            r20 = r3
            r16 = r4
            r7 = r37
            float r0 = r7.f5078l
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x0b30
            int r0 = r7.f5013a
            float r3 = r7.f5078l
            float r4 = r7.f5087u
            int r14 = r7.f5086t
            float r15 = r7.f5088v
            r31 = r0
            r32 = r3
            r33 = r4
            r34 = r14
            r35 = r15
            r30.mo4544b(r31, r32, r33, r34, r35)
            goto L_0x0b30
        L_0x0a98:
            r20 = r3
            r16 = r4
            r7 = r37
            float r0 = r7.f5077k
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x0b30
            int r0 = r7.f5013a
            float r3 = r7.f5077k
            float r4 = r7.f5087u
            int r14 = r7.f5086t
            float r15 = r7.f5088v
            r31 = r0
            r32 = r3
            r33 = r4
            r34 = r14
            r35 = r15
            r30.mo4544b(r31, r32, r33, r34, r35)
            goto L_0x0b30
        L_0x0abf:
            r20 = r3
            r16 = r4
            r7 = r37
            float r0 = r7.f5076j
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x0b30
            int r0 = r7.f5013a
            float r3 = r7.f5076j
            float r4 = r7.f5087u
            int r14 = r7.f5086t
            float r15 = r7.f5088v
            r31 = r0
            r32 = r3
            r33 = r4
            r34 = r14
            r35 = r15
            r30.mo4544b(r31, r32, r33, r34, r35)
            goto L_0x0b30
        L_0x0ae5:
            r20 = r3
            r16 = r4
            r7 = r37
            float r0 = r7.f5075i
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x0b30
            int r0 = r7.f5013a
            float r3 = r7.f5075i
            float r4 = r7.f5087u
            int r14 = r7.f5086t
            float r15 = r7.f5088v
            r31 = r0
            r32 = r3
            r33 = r4
            r34 = r14
            r35 = r15
            r30.mo4544b(r31, r32, r33, r34, r35)
            goto L_0x0b30
        L_0x0b0b:
            r20 = r3
            r16 = r4
            r7 = r37
            float r0 = r7.f5074h
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x0b30
            int r0 = r7.f5013a
            float r3 = r7.f5074h
            float r4 = r7.f5087u
            int r14 = r7.f5086t
            float r15 = r7.f5088v
            r31 = r0
            r32 = r3
            r33 = r4
            r34 = r14
            r35 = r15
            r30.mo4544b(r31, r32, r33, r34, r35)
        L_0x0b30:
            r4 = r47
            r14 = r1
            r15 = r2
            r3 = r7
            r7 = r28
            r0 = r29
        L_0x0b39:
            r1 = r50
            r2 = r51
            goto L_0x07a7
        L_0x0b3f:
            r4 = r47
        L_0x0b41:
            r0 = r29
            goto L_0x07a7
        L_0x0b45:
            r29 = r0
            r50 = r1
            r51 = r2
            r1 = r14
            r2 = r15
            int r0 = r51 + 1
            r4 = r47
            r14 = r1
            r15 = r2
            r1 = r50
            r2 = r0
            r0 = r29
            goto L_0x078f
        L_0x0b5a:
            r0 = r4
            r1 = r14
            r2 = r15
            java.util.HashMap r3 = r0.f5136G
            java.util.Set r3 = r3.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0b67:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0b97
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            r7 = r24
            boolean r14 = r7.containsKey(r4)
            if (r14 == 0) goto L_0x0b86
            java.lang.Object r14 = r7.get(r4)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            goto L_0x0b87
        L_0x0b86:
            r14 = 0
        L_0x0b87:
            java.util.HashMap r15 = r0.f5136G
            java.lang.Object r4 = r15.get(r4)
            androidx.constraintlayout.motion.a.at r4 = (androidx.constraintlayout.motion.p084a.C1675at) r4
            r4.mo4545c(r14)
            r24 = r7
            goto L_0x0b67
        L_0x0b95:
            r1 = r14
            r2 = r15
        L_0x0b97:
            java.util.ArrayList r3 = r0.f5154q
            int r3 = r3.size()
            r4 = 2
            int r3 = r3 + r4
            androidx.constraintlayout.motion.widget.ab[] r4 = new androidx.constraintlayout.motion.widget.C1703ab[r3]
            androidx.constraintlayout.motion.widget.ab r7 = r0.f5142e
            r14 = 0
            r4[r14] = r7
            int r7 = r3 + -1
            androidx.constraintlayout.motion.widget.ab r15 = r0.f5143f
            r4[r7] = r15
            java.util.ArrayList r7 = r0.f5154q
            int r7 = r7.size()
            if (r7 <= 0) goto L_0x0bbb
            int r7 = r0.f5132C
            r15 = -1
            if (r7 != r15) goto L_0x0bbb
            r0.f5132C = r14
        L_0x0bbb:
            java.util.ArrayList r7 = r0.f5154q
            int r14 = r7.size()
            r15 = 0
            r21 = 1
        L_0x0bc4:
            if (r15 >= r14) goto L_0x0bd5
            int r24 = r21 + 1
            java.lang.Object r28 = r7.get(r15)
            androidx.constraintlayout.motion.widget.ab r28 = (androidx.constraintlayout.motion.widget.C1703ab) r28
            r4[r21] = r28
            int r15 = r15 + 1
            r21 = r24
            goto L_0x0bc4
        L_0x0bd5:
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            androidx.constraintlayout.motion.widget.ab r14 = r0.f5143f
            java.util.LinkedHashMap r14 = r14.f4891o
            java.util.Set r14 = r14.keySet()
            java.util.Iterator r14 = r14.iterator()
        L_0x0be6:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x0c29
            java.lang.Object r15 = r14.next()
            java.lang.String r15 = (java.lang.String) r15
            r50 = r14
            androidx.constraintlayout.motion.widget.ab r14 = r0.f5142e
            java.util.LinkedHashMap r14 = r14.f4891o
            boolean r14 = r14.containsKey(r15)
            if (r14 == 0) goto L_0x0c26
            java.lang.String r14 = java.lang.String.valueOf(r15)
            int r21 = r14.length()
            r36 = r2
            java.lang.String r2 = "CUSTOM,"
            if (r21 == 0) goto L_0x0c11
            java.lang.String r2 = r2.concat(r14)
            goto L_0x0c17
        L_0x0c11:
            java.lang.String r14 = new java.lang.String
            r14.<init>(r2)
            r2 = r14
        L_0x0c17:
            r14 = r17
            boolean r2 = r14.contains(r2)
            if (r2 != 0) goto L_0x0c22
            r7.add(r15)
        L_0x0c22:
            r17 = r14
            r2 = r36
        L_0x0c26:
            r14 = r50
            goto L_0x0be6
        L_0x0c29:
            r36 = r2
            r2 = 0
            java.lang.String[] r14 = new java.lang.String[r2]
            java.lang.Object[] r2 = r7.toArray(r14)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r0.f5133D = r2
            int r2 = r2.length
            int[] r2 = new int[r2]
            r0.f5134E = r2
            r2 = 0
        L_0x0c3c:
            java.lang.String[] r7 = r0.f5133D
            int r14 = r7.length
            if (r2 >= r14) goto L_0x0c73
            r7 = r7[r2]
            int[] r14 = r0.f5134E
            r15 = 0
            r14[r2] = r15
            r14 = 0
        L_0x0c49:
            if (r14 >= r3) goto L_0x0c70
            r15 = r4[r14]
            java.util.LinkedHashMap r15 = r15.f4891o
            boolean r15 = r15.containsKey(r7)
            if (r15 == 0) goto L_0x0c6d
            r15 = r4[r14]
            java.util.LinkedHashMap r15 = r15.f4891o
            java.lang.Object r15 = r15.get(r7)
            androidx.constraintlayout.widget.a r15 = (androidx.constraintlayout.widget.C1742a) r15
            if (r15 == 0) goto L_0x0c6d
            int[] r7 = r0.f5134E
            r14 = r7[r2]
            int r15 = r15.mo4849b()
            int r14 = r14 + r15
            r7[r2] = r14
            goto L_0x0c70
        L_0x0c6d:
            int r14 = r14 + 1
            goto L_0x0c49
        L_0x0c70:
            int r2 = r2 + 1
            goto L_0x0c3c
        L_0x0c73:
            r2 = 0
            r7 = r4[r2]
            int r2 = r7.f4887k
            r7 = -1
            if (r2 == r7) goto L_0x0c7d
            r2 = 1
            goto L_0x0c7e
        L_0x0c7d:
            r2 = 0
        L_0x0c7e:
            int r14 = r14 + 18
            boolean[] r7 = new boolean[r14]
            r15 = 1
        L_0x0c83:
            if (r15 >= r3) goto L_0x0cf0
            r38 = r1
            r1 = r4[r15]
            int r17 = r15 + -1
            r21 = r13
            r13 = r4[r17]
            r30 = r8
            float r8 = r1.f4882f
            r31 = r6
            float r6 = r13.f4882f
            boolean r6 = r1.mo4755e(r8, r6)
            float r8 = r1.f4883g
            r24 = r5
            float r5 = r13.f4883g
            boolean r5 = r1.mo4755e(r8, r5)
            r8 = 0
            boolean r17 = r7[r8]
            float r8 = r1.f4881e
            r28 = r11
            float r11 = r13.f4881e
            boolean r8 = r1.mo4755e(r8, r11)
            r8 = r17 | r8
            r11 = 0
            r7[r11] = r8
            r5 = r5 | r6
            r5 = r5 | r2
            r6 = 1
            boolean r8 = r7[r6]
            r8 = r8 | r5
            r7[r6] = r8
            r6 = 2
            boolean r8 = r7[r6]
            r5 = r5 | r8
            r7[r6] = r5
            r5 = 3
            boolean r6 = r7[r5]
            float r8 = r1.f4884h
            float r11 = r13.f4884h
            boolean r8 = r1.mo4755e(r8, r11)
            r6 = r6 | r8
            r7[r5] = r6
            r5 = 4
            boolean r6 = r7[r5]
            float r8 = r1.f4885i
            float r11 = r13.f4885i
            boolean r1 = r1.mo4755e(r8, r11)
            r1 = r1 | r6
            r7[r5] = r1
            int r15 = r15 + 1
            r13 = r21
            r5 = r24
            r11 = r28
            r8 = r30
            r6 = r31
            r1 = r38
            goto L_0x0c83
        L_0x0cf0:
            r38 = r1
            r24 = r5
            r31 = r6
            r30 = r8
            r28 = r11
            r21 = r13
            r1 = 0
            r2 = 1
        L_0x0cfe:
            if (r2 >= r14) goto L_0x0d09
            boolean r5 = r7[r2]
            if (r5 == 0) goto L_0x0d06
            int r1 = r1 + 1
        L_0x0d06:
            int r2 = r2 + 1
            goto L_0x0cfe
        L_0x0d09:
            int[] r2 = new int[r1]
            r0.f5151n = r2
            r2 = 2
            int r1 = java.lang.Math.max(r2, r1)
            double[] r2 = new double[r1]
            r0.f5152o = r2
            double[] r1 = new double[r1]
            r0.f5153p = r1
            r1 = 0
            r2 = 1
        L_0x0d1c:
            if (r2 >= r14) goto L_0x0d2c
            boolean r5 = r7[r2]
            if (r5 == 0) goto L_0x0d29
            int r5 = r1 + 1
            int[] r6 = r0.f5151n
            r6[r1] = r2
            r1 = r5
        L_0x0d29:
            int r2 = r2 + 1
            goto L_0x0d1c
        L_0x0d2c:
            int[] r1 = r0.f5151n
            int r1 = r1.length
            r2 = 2
            int[] r5 = new int[r2]
            r2 = 1
            r5[r2] = r1
            r1 = 0
            r5[r1] = r3
            java.lang.Class r1 = java.lang.Double.TYPE
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r5)
            double[][] r1 = (double[][]) r1
            double[] r2 = new double[r3]
            r5 = 0
        L_0x0d43:
            if (r5 >= r3) goto L_0x0d97
            r6 = r4[r5]
            r7 = r1[r5]
            int[] r8 = r0.f5151n
            r11 = 6
            float[] r13 = new float[r11]
            float r11 = r6.f4881e
            r14 = 0
            r13[r14] = r11
            float r11 = r6.f4882f
            r14 = 1
            r13[r14] = r11
            float r11 = r6.f4883g
            r14 = 2
            r13[r14] = r11
            float r11 = r6.f4884h
            r14 = 3
            r13[r14] = r11
            float r11 = r6.f4885i
            r15 = 4
            r13[r15] = r11
            float r6 = r6.f4886j
            r11 = 5
            r13[r11] = r6
            r6 = 0
            r17 = 0
        L_0x0d6f:
            int r11 = r8.length
            if (r6 >= r11) goto L_0x0d8d
            r11 = r8[r6]
            r14 = 6
            if (r11 >= r14) goto L_0x0d85
            int r14 = r17 + 1
            r11 = r13[r11]
            r22 = r13
            r50 = r14
            double r13 = (double) r11
            r7[r17] = r13
            r17 = r50
            goto L_0x0d87
        L_0x0d85:
            r22 = r13
        L_0x0d87:
            int r6 = r6 + 1
            r13 = r22
            r14 = 3
            goto L_0x0d6f
        L_0x0d8d:
            r6 = r4[r5]
            float r6 = r6.f4880d
            double r6 = (double) r6
            r2[r5] = r6
            int r5 = r5 + 1
            goto L_0x0d43
        L_0x0d97:
            r15 = 4
            r5 = 0
        L_0x0d99:
            int[] r6 = r0.f5151n
            int r7 = r6.length
            if (r5 >= r7) goto L_0x0ddc
            r6 = r6[r5]
            java.lang.String[] r7 = androidx.constraintlayout.motion.widget.C1703ab.f4877a
            r8 = 6
            if (r6 >= r8) goto L_0x0dd9
            r6 = r7[r6]
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = " ["
            java.lang.String r6 = r6.concat(r7)
            r7 = 0
        L_0x0db2:
            if (r7 >= r3) goto L_0x0dd9
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r11 = r1[r7]
            r13 = r11[r5]
            java.lang.String r11 = java.lang.String.valueOf(r6)
            int r11 = r11.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r11 = r11 + 24
            r8.<init>(r11)
            r8.append(r6)
            r8.append(r13)
            java.lang.String r6 = r8.toString()
            int r7 = r7 + 1
            r8 = 6
            goto L_0x0db2
        L_0x0dd9:
            int r5 = r5 + 1
            goto L_0x0d99
        L_0x0ddc:
            java.lang.String[] r5 = r0.f5133D
            int r5 = r5.length
            r6 = 1
            int r5 = r5 + r6
            androidx.constraintlayout.a.a.a.d[] r5 = new androidx.constraintlayout.p079a.p080a.p081a.C1594d[r5]
            r0.f5146i = r5
            r5 = 0
        L_0x0de6:
            java.lang.String[] r6 = r0.f5133D
            int r7 = r6.length
            if (r5 >= r7) goto L_0x0eac
            r6 = r6[r5]
            r11 = r19
            r13 = r11
            r7 = 0
            r8 = 0
        L_0x0df2:
            if (r7 >= r3) goto L_0x0e8d
            r14 = r4[r7]
            java.util.LinkedHashMap r14 = r14.f4891o
            boolean r14 = r14.containsKey(r6)
            if (r14 == 0) goto L_0x0e7c
            if (r13 != 0) goto L_0x0e25
            double[] r11 = new double[r3]
            r13 = r4[r7]
            java.util.LinkedHashMap r13 = r13.f4891o
            java.lang.Object r13 = r13.get(r6)
            androidx.constraintlayout.widget.a r13 = (androidx.constraintlayout.widget.C1742a) r13
            if (r13 != 0) goto L_0x0e10
            r13 = 0
            goto L_0x0e14
        L_0x0e10:
            int r13 = r13.mo4849b()
        L_0x0e14:
            r14 = 2
            int[] r15 = new int[r14]
            r14 = 1
            r15[r14] = r13
            r13 = 0
            r15[r13] = r3
            java.lang.Class r13 = java.lang.Double.TYPE
            java.lang.Object r13 = java.lang.reflect.Array.newInstance(r13, r15)
            double[][] r13 = (double[][]) r13
        L_0x0e25:
            r14 = r4[r7]
            float r15 = r14.f4880d
            r17 = r9
            r29 = r10
            double r9 = (double) r15
            r11[r8] = r9
            r9 = r13[r8]
            java.util.LinkedHashMap r10 = r14.f4891o
            java.lang.Object r10 = r10.get(r6)
            androidx.constraintlayout.widget.a r10 = (androidx.constraintlayout.widget.C1742a) r10
            if (r10 != 0) goto L_0x0e41
        L_0x0e3c:
            r50 = r6
            r51 = r13
            goto L_0x0e77
        L_0x0e41:
            int r14 = r10.mo4849b()
            r15 = 1
            if (r14 != r15) goto L_0x0e51
            float r10 = r10.mo4848a()
            double r14 = (double) r10
            r10 = 0
            r9[r10] = r14
            goto L_0x0e3c
        L_0x0e51:
            int r14 = r10.mo4849b()
            float[] r15 = new float[r14]
            r10.mo4850c(r15)
            r10 = 0
            r32 = 0
        L_0x0e5d:
            if (r10 >= r14) goto L_0x0e3c
            int r33 = r32 + 1
            r50 = r6
            r6 = r15[r10]
            r51 = r13
            r34 = r14
            double r13 = (double) r6
            r9[r32] = r13
            int r10 = r10 + 1
            r6 = r50
            r13 = r51
            r32 = r33
            r14 = r34
            goto L_0x0e5d
        L_0x0e77:
            int r8 = r8 + 1
            r13 = r51
            goto L_0x0e82
        L_0x0e7c:
            r50 = r6
            r17 = r9
            r29 = r10
        L_0x0e82:
            int r7 = r7 + 1
            r6 = r50
            r9 = r17
            r10 = r29
            r15 = 4
            goto L_0x0df2
        L_0x0e8d:
            r17 = r9
            r29 = r10
            double[] r6 = java.util.Arrays.copyOf(r11, r8)
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r13, r8)
            double[][] r7 = (double[][]) r7
            int r5 = r5 + 1
            androidx.constraintlayout.a.a.a.d[] r8 = r0.f5146i
            int r9 = r0.f5132C
            androidx.constraintlayout.a.a.a.d r6 = androidx.constraintlayout.p079a.p080a.p081a.C1594d.m4236f(r9, r6, r7)
            r8[r5] = r6
            r9 = r17
            r15 = 4
            goto L_0x0de6
        L_0x0eac:
            r17 = r9
            r29 = r10
            androidx.constraintlayout.a.a.a.d[] r5 = r0.f5146i
            int r6 = r0.f5132C
            androidx.constraintlayout.a.a.a.d r1 = androidx.constraintlayout.p079a.p080a.p081a.C1594d.m4236f(r6, r2, r1)
            r2 = 0
            r5[r2] = r1
            r1 = r4[r2]
            int r1 = r1.f4887k
            r5 = -1
            if (r1 == r5) goto L_0x0efc
            int[] r1 = new int[r3]
            double[] r5 = new double[r3]
            r6 = 2
            int[] r7 = new int[r6]
            r8 = 1
            r7[r8] = r6
            r7[r2] = r3
            java.lang.Class r2 = java.lang.Double.TYPE
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r2, r7)
            double[][] r2 = (double[][]) r2
            r6 = 0
        L_0x0ed7:
            if (r6 >= r3) goto L_0x0ef5
            r7 = r4[r6]
            int r8 = r7.f4887k
            r1[r6] = r8
            float r8 = r7.f4880d
            double r8 = (double) r8
            r5[r6] = r8
            r8 = r2[r6]
            float r9 = r7.f4882f
            double r9 = (double) r9
            r11 = 0
            r8[r11] = r9
            float r7 = r7.f4883g
            double r9 = (double) r7
            r7 = 1
            r8[r7] = r9
            int r6 = r6 + 1
            goto L_0x0ed7
        L_0x0ef5:
            androidx.constraintlayout.a.a.a.b r3 = new androidx.constraintlayout.a.a.a.b
            r3.<init>(r1, r5, r2)
            r0.f5147j = r3
        L_0x0efc:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.f5158u = r1
            java.util.Iterator r1 = r18.iterator()
            r2 = 2143289344(0x7fc00000, float:NaN)
        L_0x0f09:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x1008
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            androidx.constraintlayout.motion.a.p r4 = androidx.constraintlayout.motion.p084a.C1690p.m4572d(r3)
            if (r4 == 0) goto L_0x0f09
            int r5 = r4.f4419e
            r6 = 1
            if (r5 != r6) goto L_0x0ff5
            boolean r5 = java.lang.Float.isNaN(r2)
            if (r5 == 0) goto L_0x0ff5
            r5 = 2
            float[] r2 = new float[r5]
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = r8
            r5 = 0
            r7 = r6
            r6 = 0
        L_0x0f32:
            r11 = 100
            if (r5 >= r11) goto L_0x0fed
            float r11 = (float) r5
            r13 = 1009090229(0x3c257eb5, float:0.01010101)
            float r11 = r11 * r13
            double r13 = (double) r11
            androidx.constraintlayout.motion.widget.ab r15 = r0.f5142e
            androidx.constraintlayout.a.a.a.f r15 = r15.f4878b
            r50 = r1
            java.util.ArrayList r1 = r0.f5154q
            r18 = r13
            int r13 = r1.size()
            r14 = 0
            r32 = 2143289344(0x7fc00000, float:NaN)
            r32 = r12
            r12 = 0
            r33 = 2143289344(0x7fc00000, float:NaN)
        L_0x0f53:
            if (r12 >= r13) goto L_0x0f82
            java.lang.Object r34 = r1.get(r12)
            r35 = r1
            r1 = r34
            androidx.constraintlayout.motion.widget.ab r1 = (androidx.constraintlayout.motion.widget.C1703ab) r1
            r51 = r13
            androidx.constraintlayout.a.a.a.f r13 = r1.f4878b
            if (r13 == 0) goto L_0x0f7b
            r34 = r13
            float r13 = r1.f4880d
            int r37 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r37 >= 0) goto L_0x0f71
            r14 = r13
            r15 = r34
            goto L_0x0f7b
        L_0x0f71:
            boolean r13 = java.lang.Float.isNaN(r33)
            if (r13 == 0) goto L_0x0f7b
            float r1 = r1.f4880d
            r33 = r1
        L_0x0f7b:
            int r12 = r12 + 1
            r13 = r51
            r1 = r35
            goto L_0x0f53
        L_0x0f82:
            if (r15 == 0) goto L_0x0f9e
            boolean r1 = java.lang.Float.isNaN(r33)
            r12 = 1
            if (r12 == r1) goto L_0x0f8c
            goto L_0x0f8e
        L_0x0f8c:
            r33 = 1065353216(0x3f800000, float:1.0)
        L_0x0f8e:
            float r33 = r33 - r14
            float r11 = r11 - r14
            float r11 = r11 / r33
            double r11 = (double) r11
            double r11 = r15.mo4521a(r11)
            float r1 = (float) r11
            float r1 = r1 * r33
            float r1 = r1 + r14
            double r11 = (double) r1
            goto L_0x0fa0
        L_0x0f9e:
            r11 = r18
        L_0x0fa0:
            androidx.constraintlayout.a.a.a.d[] r1 = r0.f5146i
            r13 = 0
            r1 = r1[r13]
            double[] r13 = r0.f5152o
            r1.mo4516a(r11, r13)
            androidx.constraintlayout.motion.widget.ab r1 = r0.f5142e
            int[] r13 = r0.f5151n
            double[] r14 = r0.f5152o
            r45 = 0
            r39 = r1
            r40 = r11
            r42 = r13
            r43 = r14
            r44 = r2
            r39.mo4751b(r40, r42, r43, r44, r45)
            if (r5 <= 0) goto L_0x0fdc
            double r11 = (double) r6
            r1 = 1
            r6 = r2[r1]
            double r13 = (double) r6
            java.lang.Double.isNaN(r13)
            double r9 = r9 - r13
            r14 = 0
            r1 = r2[r14]
            double r14 = (double) r1
            java.lang.Double.isNaN(r14)
            double r7 = r7 - r14
            double r6 = java.lang.Math.hypot(r9, r7)
            java.lang.Double.isNaN(r11)
            double r11 = r11 + r6
            float r1 = (float) r11
            r6 = r1
        L_0x0fdc:
            r1 = 0
            r7 = r2[r1]
            double r7 = (double) r7
            r9 = 1
            r10 = r2[r9]
            double r10 = (double) r10
            int r5 = r5 + 1
            r1 = r50
            r9 = r10
            r12 = r32
            goto L_0x0f32
        L_0x0fed:
            r50 = r1
            r32 = r12
            r1 = 0
            r9 = 1
            r2 = r6
            goto L_0x0ffb
        L_0x0ff5:
            r50 = r1
            r32 = r12
            r1 = 0
            r9 = 1
        L_0x0ffb:
            r4.f4416b = r3
            java.util.HashMap r5 = r0.f5158u
            r5.put(r3, r4)
            r1 = r50
            r12 = r32
            goto L_0x0f09
        L_0x1008:
            r32 = r12
            r1 = 0
            r9 = 1
            java.util.ArrayList r2 = r0.f5156s
            int r3 = r2.size()
            r5 = 0
        L_0x1013:
            if (r5 >= r3) goto L_0x13c7
            java.lang.Object r4 = r2.get(r5)
            androidx.constraintlayout.motion.widget.c r4 = (androidx.constraintlayout.motion.widget.C1718c) r4
            boolean r6 = r4 instanceof androidx.constraintlayout.motion.widget.C1722g
            if (r6 == 0) goto L_0x13a8
            androidx.constraintlayout.motion.widget.g r4 = (androidx.constraintlayout.motion.widget.C1722g) r4
            java.util.HashMap r6 = r0.f5158u
            java.util.Set r7 = r6.keySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x102b:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x13a8
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r10 = "CUSTOM"
            boolean r10 = r8.startsWith(r10)
            if (r10 == 0) goto L_0x1098
            r10 = 7
            java.lang.String r11 = r8.substring(r10)
            java.util.HashMap r12 = r4.f5017e
            java.lang.Object r11 = r12.get(r11)
            androidx.constraintlayout.widget.a r11 = (androidx.constraintlayout.widget.C1742a) r11
            if (r11 == 0) goto L_0x102b
            int r12 = r11.f5223h
            r13 = 2
            if (r12 != r13) goto L_0x102b
            java.lang.Object r8 = r6.get(r8)
            androidx.constraintlayout.motion.a.p r8 = (androidx.constraintlayout.motion.p084a.C1690p) r8
            if (r8 == 0) goto L_0x102b
            int r12 = r4.f5013a
            int r14 = r4.f5037h
            java.lang.String r15 = r4.f5038i
            int r1 = r4.f5043n
            float r9 = r4.f5039j
            float r10 = r4.f5040k
            float r13 = r4.f5041l
            float r44 = r11.mo4848a()
            r18 = r2
            java.util.ArrayList r2 = r8.f4420f
            r50 = r3
            androidx.constraintlayout.a.a.a.j r3 = new androidx.constraintlayout.a.a.a.j
            r39 = r3
            r40 = r12
            r41 = r9
            r42 = r10
            r43 = r13
            r39.<init>(r40, r41, r42, r43, r44)
            r2.add(r3)
            r2 = -1
            if (r1 == r2) goto L_0x108a
            r8.f4419e = r1
        L_0x108a:
            r8.f4417c = r14
            r8.mo4527a(r11)
            r8.f4418d = r15
            r3 = r50
            r2 = r18
            r1 = 0
            r9 = 1
            goto L_0x102b
        L_0x1098:
            r18 = r2
            r50 = r3
            int r1 = r8.hashCode()
            switch(r1) {
                case -1249320806: goto L_0x1299;
                case -1249320805: goto L_0x127a;
                case -1225497657: goto L_0x1252;
                case -1225497656: goto L_0x1226;
                case -1225497655: goto L_0x11fc;
                case -1001078227: goto L_0x11d0;
                case -908189618: goto L_0x11ac;
                case -908189617: goto L_0x1188;
                case -40300674: goto L_0x1163;
                case -4379043: goto L_0x1140;
                case 37232917: goto L_0x111d;
                case 92909918: goto L_0x10fd;
                case 156108012: goto L_0x10db;
                case 1530034690: goto L_0x10b9;
                default: goto L_0x10a3;
            }
        L_0x10a3:
            r1 = r16
            r13 = r21
            r10 = r24
            r9 = r28
            r3 = r29
            r12 = r30
            r11 = r31
        L_0x10b1:
            r2 = r32
        L_0x10b3:
            r15 = r36
            r14 = r38
            goto L_0x12b6
        L_0x10b9:
            java.lang.String r1 = "wavePhase"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L_0x10a3
            r14 = 12
            r1 = r16
            r13 = r21
            r10 = r24
            r9 = r28
            r3 = r29
            r12 = r30
            r11 = r31
            r2 = r32
            r15 = r36
            r14 = r38
            r16 = 12
            goto L_0x12b8
        L_0x10db:
            java.lang.String r1 = "waveOffset"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L_0x10a3
            r14 = 11
            r1 = r16
            r13 = r21
            r10 = r24
            r9 = r28
            r3 = r29
            r12 = r30
            r11 = r31
            r2 = r32
            r15 = r36
            r14 = r38
            r16 = 11
            goto L_0x12b8
        L_0x10fd:
            r1 = r17
            boolean r2 = r8.equals(r1)
            r1 = r16
            r13 = r21
            r10 = r24
            r9 = r28
            r3 = r29
            r12 = r30
            r11 = r31
            if (r2 == 0) goto L_0x10b1
            r2 = r32
            r15 = r36
            r14 = r38
            r16 = 0
            goto L_0x12b8
        L_0x111d:
            r1 = r17
            r2 = r32
            boolean r3 = r8.equals(r2)
            r1 = r16
            r13 = r21
            r10 = r24
            r9 = r28
            if (r3 == 0) goto L_0x113d
            r3 = r29
            r12 = r30
            r11 = r31
            r15 = r36
            r14 = r38
            r16 = 5
            goto L_0x12b8
        L_0x113d:
            r3 = r29
            goto L_0x1185
        L_0x1140:
            r1 = r17
            r3 = r29
            r2 = r32
            boolean r9 = r8.equals(r3)
            r1 = r16
            r13 = r21
            r10 = r24
            if (r9 == 0) goto L_0x1160
            r9 = r28
            r12 = r30
            r11 = r31
            r15 = r36
            r14 = r38
            r16 = 1
            goto L_0x12b8
        L_0x1160:
            r9 = r28
            goto L_0x1185
        L_0x1163:
            r1 = r17
            r9 = r28
            r3 = r29
            r2 = r32
            boolean r10 = r8.equals(r9)
            r1 = r16
            r13 = r21
            if (r10 == 0) goto L_0x1183
            r10 = r24
            r12 = r30
            r11 = r31
            r15 = r36
            r14 = r38
            r16 = 2
            goto L_0x12b8
        L_0x1183:
            r10 = r24
        L_0x1185:
            r12 = r30
            goto L_0x11a8
        L_0x1188:
            r1 = r17
            r10 = r24
            r9 = r28
            r3 = r29
            r2 = r32
            boolean r11 = r8.equals(r10)
            r1 = r16
            r13 = r21
            r12 = r30
            if (r11 == 0) goto L_0x11a8
            r11 = r31
            r15 = r36
            r14 = r38
            r16 = 7
            goto L_0x12b8
        L_0x11a8:
            r11 = r31
            goto L_0x10b3
        L_0x11ac:
            r1 = r17
            r10 = r24
            r9 = r28
            r3 = r29
            r11 = r31
            r2 = r32
            boolean r12 = r8.equals(r11)
            r1 = r16
            r13 = r21
            if (r12 == 0) goto L_0x11cc
            r12 = r30
            r15 = r36
            r14 = r38
            r16 = 6
            goto L_0x12b8
        L_0x11cc:
            r12 = r30
            goto L_0x10b3
        L_0x11d0:
            r1 = r17
            r10 = r24
            r9 = r28
            r3 = r29
            r12 = r30
            r11 = r31
            r2 = r32
            boolean r13 = r8.equals(r12)
            if (r13 == 0) goto L_0x11f4
            r14 = 13
            r17 = r1
            r1 = r16
            r13 = r21
            r15 = r36
            r14 = r38
            r16 = 13
            goto L_0x12b8
        L_0x11f4:
            r17 = r1
            r1 = r16
            r13 = r21
            goto L_0x10b3
        L_0x11fc:
            r1 = r17
            r13 = r21
            r10 = r24
            r9 = r28
            r3 = r29
            r12 = r30
            r11 = r31
            r2 = r32
            boolean r14 = r8.equals(r13)
            if (r14 == 0) goto L_0x1220
            r14 = 10
            r17 = r1
            r1 = r16
            r15 = r36
            r14 = r38
            r16 = 10
            goto L_0x12b8
        L_0x1220:
            r17 = r1
            r1 = r16
            goto L_0x10b3
        L_0x1226:
            r1 = r17
            r13 = r21
            r10 = r24
            r9 = r28
            r3 = r29
            r12 = r30
            r11 = r31
            r2 = r32
            r14 = r38
            boolean r15 = r8.equals(r14)
            if (r15 == 0) goto L_0x124a
            r15 = 9
            r17 = r1
            r1 = r16
            r15 = r36
            r16 = 9
            goto L_0x12b8
        L_0x124a:
            r17 = r1
            r1 = r16
            r15 = r36
            goto L_0x12b6
        L_0x1252:
            r1 = r17
            r13 = r21
            r10 = r24
            r9 = r28
            r3 = r29
            r12 = r30
            r11 = r31
            r2 = r32
            r15 = r36
            r14 = r38
            boolean r17 = r8.equals(r15)
            if (r17 == 0) goto L_0x1275
            r17 = 8
            r17 = r1
            r1 = r16
            r16 = 8
            goto L_0x12b8
        L_0x1275:
            r17 = r1
            r1 = r16
            goto L_0x12b6
        L_0x127a:
            r1 = r20
            r13 = r21
            r10 = r24
            r9 = r28
            r3 = r29
            r12 = r30
            r11 = r31
            r2 = r32
            r15 = r36
            r14 = r38
            boolean r19 = r8.equals(r1)
            r1 = r16
            if (r19 == 0) goto L_0x12b6
            r16 = 4
            goto L_0x12b8
        L_0x1299:
            r1 = r16
            r13 = r21
            r10 = r24
            r9 = r28
            r3 = r29
            r12 = r30
            r11 = r31
            r2 = r32
            r15 = r36
            r14 = r38
            boolean r16 = r8.equals(r1)
            if (r16 == 0) goto L_0x12b6
            r16 = 3
            goto L_0x12b8
        L_0x12b6:
            r16 = -1
        L_0x12b8:
            switch(r16) {
                case 0: goto L_0x1319;
                case 1: goto L_0x1314;
                case 2: goto L_0x130f;
                case 3: goto L_0x130a;
                case 4: goto L_0x1305;
                case 5: goto L_0x1300;
                case 6: goto L_0x12fb;
                case 7: goto L_0x12f6;
                case 8: goto L_0x12f1;
                case 9: goto L_0x12ec;
                case 10: goto L_0x12e7;
                case 11: goto L_0x12e2;
                case 12: goto L_0x12dd;
                case 13: goto L_0x12d8;
                default: goto L_0x12bb;
            }
        L_0x12bb:
            r16 = r1
            java.lang.String r1 = "CUSTOM"
            boolean r1 = r8.startsWith(r1)
            if (r1 != 0) goto L_0x132d
            java.lang.String r1 = java.lang.String.valueOf(r8)
            int r19 = r1.length()
            r32 = r2
            java.lang.String r2 = "  UNKNOWN  "
            if (r19 == 0) goto L_0x1322
            java.lang.String r1 = r2.concat(r1)
            goto L_0x1327
        L_0x12d8:
            r16 = r1
            float r1 = r4.f5042m
            goto L_0x131d
        L_0x12dd:
            r16 = r1
            float r1 = r4.f5041l
            goto L_0x131d
        L_0x12e2:
            r16 = r1
            float r1 = r4.f5040k
            goto L_0x131d
        L_0x12e7:
            r16 = r1
            float r1 = r4.f5054y
            goto L_0x131d
        L_0x12ec:
            r16 = r1
            float r1 = r4.f5053x
            goto L_0x131d
        L_0x12f1:
            r16 = r1
            float r1 = r4.f5052w
            goto L_0x131d
        L_0x12f6:
            r16 = r1
            float r1 = r4.f5051v
            goto L_0x131d
        L_0x12fb:
            r16 = r1
            float r1 = r4.f5050u
            goto L_0x131d
        L_0x1300:
            r16 = r1
            float r1 = r4.f5047r
            goto L_0x131d
        L_0x1305:
            r16 = r1
            float r1 = r4.f5049t
            goto L_0x131d
        L_0x130a:
            r16 = r1
            float r1 = r4.f5048s
            goto L_0x131d
        L_0x130f:
            r16 = r1
            float r1 = r4.f5046q
            goto L_0x131d
        L_0x1314:
            r16 = r1
            float r1 = r4.f5045p
            goto L_0x131d
        L_0x1319:
            r16 = r1
            float r1 = r4.f5044o
        L_0x131d:
            r38 = r1
            r32 = r2
            goto L_0x1333
        L_0x1322:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
        L_0x1327:
            java.lang.String r2 = "WARNING! KeyCycle"
            android.util.Log.v(r2, r1)
            goto L_0x132f
        L_0x132d:
            r32 = r2
        L_0x132f:
            r1 = 2143289344(0x7fc00000, float:NaN)
            r38 = 2143289344(0x7fc00000, float:NaN)
        L_0x1333:
            boolean r1 = java.lang.Float.isNaN(r38)
            if (r1 != 0) goto L_0x1390
            java.lang.Object r1 = r6.get(r8)
            androidx.constraintlayout.motion.a.p r1 = (androidx.constraintlayout.motion.p084a.C1690p) r1
            if (r1 == 0) goto L_0x1390
            int r2 = r4.f5013a
            int r8 = r4.f5037h
            r29 = r3
            java.lang.String r3 = r4.f5038i
            r19 = r6
            int r6 = r4.f5043n
            r51 = r7
            float r7 = r4.f5039j
            r28 = r9
            float r9 = r4.f5040k
            r24 = r10
            float r10 = r4.f5041l
            r21 = r4
            java.util.ArrayList r4 = r1.f4420f
            r31 = r11
            androidx.constraintlayout.a.a.a.j r11 = new androidx.constraintlayout.a.a.a.j
            r33 = r11
            r34 = r2
            r35 = r7
            r36 = r9
            r37 = r10
            r33.<init>(r34, r35, r36, r37, r38)
            r4.add(r11)
            r2 = -1
            if (r6 == r2) goto L_0x1376
            r1.f4419e = r6
        L_0x1376:
            r1.f4417c = r8
            r1.f4418d = r3
            r3 = r50
            r7 = r51
            r30 = r12
            r38 = r14
            r36 = r15
            r2 = r18
            r6 = r19
            r4 = r21
            r1 = 0
            r9 = 1
            r21 = r13
            goto L_0x102b
        L_0x1390:
            r29 = r3
            r28 = r9
            r24 = r10
            r31 = r11
            r30 = r12
            r21 = r13
            r38 = r14
            r36 = r15
            r2 = r18
            r1 = 0
            r9 = 1
            r3 = r50
            goto L_0x102b
        L_0x13a8:
            r18 = r2
            r50 = r3
            r13 = r21
            r12 = r30
            r15 = r36
            r14 = r38
            r2 = -1
            int r5 = r5 + 1
            r3 = r50
            r30 = r12
            r21 = r13
            r38 = r14
            r36 = r15
            r2 = r18
            r1 = 0
            r9 = 1
            goto L_0x1013
        L_0x13c7:
            java.util.HashMap r1 = r0.f5158u
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x13d1:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x13e1
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.motion.a.p r2 = (androidx.constraintlayout.motion.p084a.C1690p) r2
            r2.mo4528b()
            goto L_0x13d1
        L_0x13e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C1733r.mo4810f(int, int, long):void");
    }

    public final String toString() {
        C1703ab abVar = this.f5142e;
        float f = abVar.f4882f;
        float f2 = abVar.f4883g;
        C1703ab abVar2 = this.f5143f;
        float f3 = abVar2.f4882f;
        float f4 = abVar2.f4883g;
        StringBuilder sb = new StringBuilder(88);
        sb.append(" start: x: ");
        sb.append(f);
        sb.append(" y: ");
        sb.append(f2);
        sb.append(" end: x: ");
        sb.append(f3);
        sb.append(" y: ");
        sb.append(f4);
        return sb.toString();
    }

    /* renamed from: a */
    public final float mo4806a(float f, float[] fArr) {
        float f2 = 0.0f;
        float f3 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f4 = this.f5150m;
            if (((double) f4) != 1.0d) {
                float f5 = this.f5149l;
                if (f < f5) {
                    f = 0.0f;
                }
                if (f > f5 && ((double) f) < 1.0d) {
                    f = Math.min((f - f5) * f4, 1.0f);
                }
            }
        }
        C1596f fVar = this.f5142e.f4878b;
        ArrayList arrayList = this.f5154q;
        int size = arrayList.size();
        float f6 = Float.NaN;
        for (int i = 0; i < size; i++) {
            C1703ab abVar = (C1703ab) arrayList.get(i);
            C1596f fVar2 = abVar.f4878b;
            if (fVar2 != null) {
                float f7 = abVar.f4880d;
                if (f7 < f) {
                    fVar = fVar2;
                    f2 = f7;
                } else if (Float.isNaN(f6)) {
                    f6 = abVar.f4880d;
                }
            }
        }
        if (fVar != null) {
            if (true != Float.isNaN(f6)) {
                f3 = f6;
            }
            float f8 = f3 - f2;
            double d = (double) ((f - f2) / f8);
            f = (((float) fVar.mo4521a(d)) * f8) + f2;
            if (fArr != null) {
                fArr[0] = (float) fVar.mo4522b(d);
            }
        }
        return f;
    }
}
