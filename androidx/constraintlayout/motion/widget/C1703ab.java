package androidx.constraintlayout.motion.widget;

import androidx.constraintlayout.p079a.p080a.p081a.C1596f;
import androidx.constraintlayout.widget.C1742a;
import androidx.constraintlayout.widget.C1751j;
import androidx.constraintlayout.widget.C1753l;
import androidx.constraintlayout.widget.C1754m;
import java.util.LinkedHashMap;

/* renamed from: androidx.constraintlayout.motion.widget.ab */
/* compiled from: PG */
final class C1703ab implements Comparable {

    /* renamed from: a */
    static final String[] f4877a = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: b */
    C1596f f4878b;

    /* renamed from: c */
    int f4879c = 0;

    /* renamed from: d */
    float f4880d;

    /* renamed from: e */
    float f4881e;

    /* renamed from: f */
    float f4882f;

    /* renamed from: g */
    float f4883g;

    /* renamed from: h */
    float f4884h;

    /* renamed from: i */
    float f4885i;

    /* renamed from: j */
    float f4886j = Float.NaN;

    /* renamed from: k */
    int f4887k = -1;

    /* renamed from: l */
    int f4888l = -1;

    /* renamed from: m */
    float f4889m = Float.NaN;

    /* renamed from: n */
    C1733r f4890n = null;

    /* renamed from: o */
    final LinkedHashMap f4891o = new LinkedHashMap();

    /* renamed from: p */
    int f4892p = 0;

    /* renamed from: q */
    double[] f4893q = new double[18];

    /* renamed from: r */
    double[] f4894r = new double[18];

    public C1703ab() {
    }

    /* renamed from: f */
    static final void m4626f(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        int[] iArr2 = iArr;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr2.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr2[i];
            if (i2 == 1) {
                f3 = f7;
            } else if (i2 == 2) {
                f5 = f7;
            } else if (i2 == 3) {
                f4 = f7;
            } else if (i2 == 4) {
                f6 = f7;
            }
        }
        float f8 = f3 - ((f4 * 0.0f) / 2.0f);
        float f9 = f5 - ((f6 * 0.0f) / 2.0f);
        fArr[0] = ((1.0f - f) * f8) + ((f8 + f4) * f) + 0.0f;
        fArr[1] = ((1.0f - f2) * f9) + ((f9 + f6) * f2) + 0.0f;
    }

    /* renamed from: a */
    public final void mo4750a(C1751j jVar) {
        this.f4878b = C1596f.m4246c(jVar.f5341d.f5419e);
        C1753l lVar = jVar.f5341d;
        this.f4887k = lVar.f5420f;
        this.f4888l = lVar.f5417c;
        this.f4886j = lVar.f5424j;
        this.f4879c = lVar.f5421g;
        C1754m mVar = jVar.f5340c;
        this.f4889m = jVar.f5342e.f5350D;
        for (String str : jVar.f5344g.keySet()) {
            C1742a aVar = (C1742a) jVar.f5344g.get(str);
            if (aVar != null && aVar.mo4852g()) {
                this.f4891o.put(str, aVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo4751b(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        int[] iArr2 = iArr;
        float f = this.f4882f;
        float f2 = this.f4883g;
        float f3 = this.f4884h;
        float f4 = this.f4885i;
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr2[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        C1733r rVar = this.f4890n;
        if (rVar != null) {
            float[] fArr2 = new float[2];
            rVar.mo4807b(d, fArr2, new float[2]);
            float f6 = fArr2[0];
            float f7 = fArr2[1];
            double d2 = (double) f;
            double d3 = (double) f2;
            double d4 = (double) f6;
            double sin = Math.sin(d3);
            Double.isNaN(d2);
            Double.isNaN(d4);
            double d5 = d4 + (sin * d2);
            double d6 = (double) (f3 / 2.0f);
            Double.isNaN(d6);
            float f8 = (float) (d5 - d6);
            double d7 = (double) f7;
            double cos = Math.cos(d3);
            Double.isNaN(d2);
            Double.isNaN(d7);
            double d8 = (double) (f4 / 2.0f);
            Double.isNaN(d8);
            f2 = (float) ((d7 - (d2 * cos)) - d8);
            f = f8;
        }
        fArr[i] = f + (f3 / 2.0f) + 0.0f;
        fArr[i + 1] = f2 + (f4 / 2.0f) + 0.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo4752c(float f, float f2, float f3, float f4) {
        this.f4882f = f;
        this.f4883g = f2;
        this.f4884h = f3;
        this.f4885i = f4;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Float.compare(this.f4881e, ((C1703ab) obj).f4881e);
    }

    /* renamed from: d */
    public final void mo4754d(C1733r rVar, C1703ab abVar) {
        double d = (double) (((this.f4882f + (this.f4884h / 2.0f)) - abVar.f4882f) - (abVar.f4884h / 2.0f));
        double d2 = (double) (((this.f4883g + (this.f4885i / 2.0f)) - abVar.f4883g) - (abVar.f4885i / 2.0f));
        this.f4890n = rVar;
        this.f4882f = (float) Math.hypot(d2, d);
        if (Float.isNaN(this.f4889m)) {
            this.f4883g = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.f4883g = (float) Math.toRadians((double) this.f4889m);
        }
    }

    /* renamed from: e */
    public final boolean mo4755e(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    public C1703ab(int i, int i2, C1725j jVar, C1703ab abVar, C1703ab abVar2) {
        float f;
        int i3;
        float f2;
        float f3;
        C1725j jVar2 = jVar;
        C1703ab abVar3 = abVar;
        C1703ab abVar4 = abVar2;
        if (abVar3.f4888l != -1) {
            float f4 = ((float) jVar2.f5013a) / 100.0f;
            this.f4880d = f4;
            this.f4879c = jVar2.f5060h;
            this.f4892p = jVar2.f5067o;
            float f5 = Float.isNaN(jVar2.f5061i) ? f4 : jVar2.f5061i;
            float f6 = Float.isNaN(jVar2.f5062j) ? f4 : jVar2.f5062j;
            float f7 = abVar4.f4884h;
            float f8 = abVar3.f4884h;
            float f9 = abVar4.f4885i;
            float f10 = abVar3.f4885i;
            this.f4881e = this.f4880d;
            this.f4884h = (float) ((int) (f8 + ((f7 - f8) * f5)));
            this.f4885i = (float) ((int) (f10 + ((f9 - f10) * f6)));
            int i4 = jVar2.f5067o;
            if (i4 == 1) {
                float f11 = Float.isNaN(jVar2.f5063k) ? f4 : jVar2.f5063k;
                float f12 = abVar4.f4882f;
                float f13 = abVar3.f4882f;
                this.f4882f = (f11 * (f12 - f13)) + f13;
                f4 = !Float.isNaN(jVar2.f5064l) ? jVar2.f5064l : f4;
                float f14 = abVar4.f4883g;
                float f15 = abVar3.f4883g;
                this.f4883g = (f4 * (f14 - f15)) + f15;
            } else if (i4 != 2) {
                float f16 = Float.isNaN(jVar2.f5063k) ? f4 : jVar2.f5063k;
                float f17 = abVar4.f4882f;
                float f18 = abVar3.f4882f;
                this.f4882f = (f16 * (f17 - f18)) + f18;
                f4 = !Float.isNaN(jVar2.f5064l) ? jVar2.f5064l : f4;
                float f19 = abVar4.f4883g;
                float f20 = abVar3.f4883g;
                this.f4883g = (f4 * (f19 - f20)) + f20;
            } else {
                if (Float.isNaN(jVar2.f5063k)) {
                    float f21 = abVar4.f4882f;
                    float f22 = abVar3.f4882f;
                    f2 = ((f21 - f22) * f4) + f22;
                } else {
                    f2 = Math.min(f6, f5) * jVar2.f5063k;
                }
                this.f4882f = f2;
                if (Float.isNaN(jVar2.f5064l)) {
                    float f23 = abVar4.f4883g;
                    float f24 = abVar3.f4883g;
                    f3 = (f4 * (f23 - f24)) + f24;
                } else {
                    f3 = jVar2.f5064l;
                }
                this.f4883g = f3;
            }
            this.f4888l = abVar3.f4888l;
            this.f4878b = C1596f.m4246c(jVar2.f5058f);
            this.f4887k = jVar2.f5059g;
            return;
        }
        int i5 = jVar2.f5067o;
        if (i5 == 1) {
            float f25 = ((float) jVar2.f5013a) / 100.0f;
            this.f4880d = f25;
            this.f4879c = jVar2.f5060h;
            float f26 = Float.isNaN(jVar2.f5061i) ? f25 : jVar2.f5061i;
            float f27 = Float.isNaN(jVar2.f5062j) ? f25 : jVar2.f5062j;
            float f28 = abVar4.f4884h - abVar3.f4884h;
            float f29 = abVar4.f4885i - abVar3.f4885i;
            this.f4881e = this.f4880d;
            f25 = !Float.isNaN(jVar2.f5063k) ? jVar2.f5063k : f25;
            float f30 = abVar3.f4882f;
            float f31 = abVar3.f4884h;
            float f32 = abVar3.f4883g;
            float f33 = abVar3.f4885i;
            float f34 = (abVar4.f4882f + (abVar4.f4884h / 2.0f)) - ((f31 / 2.0f) + f30);
            float f35 = (abVar4.f4883g + (abVar4.f4885i / 2.0f)) - ((f33 / 2.0f) + f32);
            float f36 = f34 * f25;
            float f37 = f28 * f26;
            float f38 = f37 / 2.0f;
            this.f4882f = (float) ((int) ((f30 + f36) - f38));
            float f39 = f25 * f35;
            float f40 = f29 * f27;
            float f41 = f40 / 2.0f;
            this.f4883g = (float) ((int) ((f32 + f39) - f41));
            this.f4884h = (float) ((int) (f31 + f37));
            this.f4885i = (float) ((int) (f33 + f40));
            if (Float.isNaN(jVar2.f5064l)) {
                i3 = 1;
                f = 0.0f;
            } else {
                f = jVar2.f5064l;
                i3 = 1;
            }
            this.f4892p = i3;
            float f42 = abVar3.f4882f;
            float f43 = abVar3.f4883g;
            this.f4882f = ((float) ((int) ((f42 + f36) - f38))) + ((-f35) * f);
            this.f4883g = ((float) ((int) ((f43 + f39) - f41))) + (f34 * f);
            this.f4878b = C1596f.m4246c(jVar2.f5058f);
            this.f4887k = jVar2.f5059g;
        } else if (i5 != 2) {
            float f44 = ((float) jVar2.f5013a) / 100.0f;
            this.f4880d = f44;
            this.f4879c = jVar2.f5060h;
            float f45 = Float.isNaN(jVar2.f5061i) ? f44 : jVar2.f5061i;
            float f46 = Float.isNaN(jVar2.f5062j) ? f44 : jVar2.f5062j;
            float f47 = abVar4.f4884h;
            float f48 = abVar3.f4884h;
            float f49 = abVar4.f4885i;
            float f50 = abVar3.f4885i;
            this.f4881e = this.f4880d;
            float f51 = abVar3.f4882f;
            float f52 = abVar3.f4883g;
            float f53 = (abVar4.f4882f + (f47 / 2.0f)) - (f51 + (f48 / 2.0f));
            float f54 = (abVar4.f4883g + (f49 / 2.0f)) - (f52 + (f50 / 2.0f));
            float f55 = (f47 - f48) * f45;
            float f56 = f55 / 2.0f;
            this.f4882f = (float) ((int) ((f51 + (f53 * f44)) - f56));
            float f57 = (f49 - f50) * f46;
            float f58 = f57 / 2.0f;
            this.f4883g = (float) ((int) ((f52 + (f54 * f44)) - f58));
            this.f4884h = (float) ((int) (f48 + f55));
            this.f4885i = (float) ((int) (f50 + f57));
            float f59 = Float.isNaN(jVar2.f5063k) ? f44 : jVar2.f5063k;
            float f60 = Float.isNaN(jVar2.f5066n) ? 0.0f : jVar2.f5066n;
            f44 = !Float.isNaN(jVar2.f5064l) ? jVar2.f5064l : f44;
            float f61 = Float.isNaN(jVar2.f5065m) ? 0.0f : jVar2.f5065m;
            this.f4892p = 0;
            this.f4882f = (float) ((int) (((abVar3.f4882f + (f59 * f53)) + (f61 * f54)) - f56));
            this.f4883g = (float) ((int) (((abVar3.f4883g + (f53 * f60)) + (f54 * f44)) - f58));
            this.f4878b = C1596f.m4246c(jVar2.f5058f);
            this.f4887k = jVar2.f5059g;
        } else {
            float f62 = ((float) jVar2.f5013a) / 100.0f;
            this.f4880d = f62;
            this.f4879c = jVar2.f5060h;
            float f63 = Float.isNaN(jVar2.f5061i) ? f62 : jVar2.f5061i;
            float f64 = Float.isNaN(jVar2.f5062j) ? f62 : jVar2.f5062j;
            float f65 = abVar4.f4884h;
            float f66 = abVar3.f4884h;
            float f67 = abVar4.f4885i;
            float f68 = abVar3.f4885i;
            this.f4881e = this.f4880d;
            float f69 = abVar3.f4882f;
            float f70 = abVar3.f4883g;
            float f71 = abVar4.f4882f;
            float f72 = abVar4.f4883g;
            float f73 = (f65 - f66) * f63;
            this.f4882f = (float) ((int) ((f69 + (((f71 + (f65 / 2.0f)) - ((f66 / 2.0f) + f69)) * f62)) - (f73 / 2.0f)));
            float f74 = (f67 - f68) * f64;
            this.f4883g = (float) ((int) ((f70 + (((f72 + (f67 / 2.0f)) - ((f68 / 2.0f) + f70)) * f62)) - (f74 / 2.0f)));
            this.f4884h = (float) ((int) (f66 + f73));
            this.f4885i = (float) ((int) (f68 + f74));
            this.f4892p = 2;
            if (!Float.isNaN(jVar2.f5063k)) {
                this.f4882f = (float) ((int) (jVar2.f5063k * ((float) ((int) (((float) i) - this.f4884h)))));
            }
            if (!Float.isNaN(jVar2.f5064l)) {
                this.f4883g = (float) ((int) (jVar2.f5064l * ((float) ((int) (((float) i2) - this.f4885i)))));
            }
            this.f4878b = C1596f.m4246c(jVar2.f5058f);
            this.f4887k = jVar2.f5059g;
        }
    }
}
