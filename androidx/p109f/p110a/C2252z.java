package androidx.p109f.p110a;

import com.google.common.p4535g.C59203do;

/* renamed from: androidx.f.a.z */
/* compiled from: PG */
public final class C2252z {

    /* renamed from: a */
    double f6333a = Math.sqrt(1500.0d);

    /* renamed from: b */
    double f6334b = 0.5d;

    /* renamed from: c */
    public double f6335c;

    /* renamed from: d */
    public double f6336d;

    /* renamed from: e */
    public double f6337e = Double.MAX_VALUE;

    /* renamed from: f */
    private boolean f6338f = false;

    /* renamed from: g */
    private double f6339g;

    /* renamed from: h */
    private double f6340h;

    /* renamed from: i */
    private double f6341i;

    /* renamed from: j */
    private final C2242p f6342j = new C2242p();

    public C2252z() {
    }

    /* renamed from: b */
    public final void mo5596b(float f) {
        if (f >= 0.0f) {
            this.f6334b = (double) f;
            this.f6338f = false;
            return;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public C2252z(float f) {
        this.f6337e = (double) f;
    }

    /* renamed from: c */
    public final void mo5597c(float f) {
        if (f > 0.0f) {
            this.f6333a = Math.sqrt((double) f);
            this.f6338f = false;
            return;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C2242p mo5595a(double d, double d2, long j) {
        double d3;
        double d4;
        double d5;
        double d6;
        double pow;
        if (!this.f6338f) {
            if (this.f6337e != Double.MAX_VALUE) {
                double d7 = this.f6334b;
                if (d7 > 1.0d) {
                    double d8 = this.f6333a;
                    this.f6339g = ((-d7) * d8) + (d8 * Math.sqrt((d7 * d7) - 4.0d));
                    double d9 = this.f6334b;
                    double d10 = this.f6333a;
                    this.f6340h = ((-d9) * d10) - (d10 * Math.sqrt((d9 * d9) - 4.0d));
                } else if (d7 >= C59203do.f157270a && d7 < 1.0d) {
                    this.f6341i = this.f6333a * Math.sqrt(1.0d - (d7 * d7));
                }
                this.f6338f = true;
            } else {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
        }
        double d11 = (double) j;
        Double.isNaN(d11);
        double d12 = d11 / 1000.0d;
        double d13 = d - this.f6337e;
        double d14 = this.f6334b;
        if (d14 > 1.0d) {
            double d15 = this.f6340h;
            double d16 = ((d15 * d13) - d2) / (d15 - this.f6339g);
            double d17 = d13 - d16;
            d4 = (Math.pow(2.718281828459045d, d15 * d12) * d17) + (Math.pow(2.718281828459045d, this.f6339g * d12) * d16);
            double d18 = this.f6340h;
            double pow2 = Math.pow(2.718281828459045d, d18 * d12);
            double d19 = this.f6339g;
            d6 = d17 * d18 * pow2;
            d5 = d16 * d19;
            pow = Math.pow(2.718281828459045d, d19 * d12);
        } else if (d14 == 1.0d) {
            double d20 = this.f6333a;
            d5 = d2 + (d20 * d13);
            double d21 = d13 + (d5 * d12);
            d4 = Math.pow(2.718281828459045d, (-d20) * d12) * d21;
            double pow3 = Math.pow(2.718281828459045d, (-this.f6333a) * d12);
            double d22 = -this.f6333a;
            d6 = d21 * pow3 * d22;
            pow = Math.pow(2.718281828459045d, d22 * d12);
        } else {
            double d23 = this.f6341i;
            double d24 = this.f6333a;
            double d25 = (1.0d / d23) * ((d14 * d24 * d13) + d2);
            double pow4 = Math.pow(2.718281828459045d, (-d14) * d24 * d12) * ((Math.cos(this.f6341i * d12) * d13) + (Math.sin(this.f6341i * d12) * d25));
            double d26 = this.f6333a;
            double d27 = this.f6334b;
            double pow5 = Math.pow(2.718281828459045d, (-d27) * d26 * d12);
            double d28 = this.f6341i;
            double sin = Math.sin(d28 * d12);
            double d29 = pow5;
            double d30 = this.f6341i;
            d3 = ((-d26) * pow4 * d27) + (d29 * (((-d28) * d13 * sin) + (d25 * d30 * Math.cos(d30 * d12))));
            d4 = pow4;
            C2242p pVar = this.f6342j;
            pVar.f6306a = (float) (d4 + this.f6337e);
            pVar.f6307b = (float) d3;
            return pVar;
        }
        d3 = d6 + (d5 * pow);
        C2242p pVar2 = this.f6342j;
        pVar2.f6306a = (float) (d4 + this.f6337e);
        pVar2.f6307b = (float) d3;
        return pVar2;
    }
}
