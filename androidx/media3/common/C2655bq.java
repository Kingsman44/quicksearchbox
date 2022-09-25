package androidx.media3.common;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4522b.C58758qx;

/* renamed from: androidx.media3.common.bq */
/* compiled from: PG */
public class C2655bq implements C2668l {

    /* renamed from: a */
    public final int f7375a = Integer.MAX_VALUE;

    /* renamed from: b */
    public final int f7376b = Integer.MAX_VALUE;

    /* renamed from: c */
    public final int f7377c = Integer.MAX_VALUE;

    /* renamed from: d */
    public final int f7378d = Integer.MAX_VALUE;

    /* renamed from: e */
    public final int f7379e = 0;

    /* renamed from: f */
    public final int f7380f = 0;

    /* renamed from: g */
    public final int f7381g = 0;

    /* renamed from: h */
    public final int f7382h = 0;

    /* renamed from: i */
    public final int f7383i;

    /* renamed from: j */
    public final int f7384j;

    /* renamed from: k */
    public final boolean f7385k;

    /* renamed from: l */
    public final C58485gu f7386l;

    /* renamed from: m */
    public final int f7387m;

    /* renamed from: n */
    public final C58485gu f7388n;

    /* renamed from: o */
    public final int f7389o;

    /* renamed from: p */
    public final int f7390p;

    /* renamed from: q */
    public final int f7391q;

    /* renamed from: r */
    public final C58485gu f7392r;

    /* renamed from: s */
    public final C58485gu f7393s;

    /* renamed from: t */
    public final int f7394t;

    /* renamed from: u */
    public final int f7395u;

    /* renamed from: v */
    public final boolean f7396v;

    /* renamed from: w */
    public final boolean f7397w;

    /* renamed from: x */
    public final boolean f7398x;

    /* renamed from: y */
    public final C58495hd f7399y;

    /* renamed from: z */
    public final C58528ij f7400z;

    static {
        new C2655bq(new C2654bp());
    }

    protected C2655bq(C2654bp bpVar) {
        this.f7383i = bpVar.f7363e;
        this.f7384j = bpVar.f7364f;
        this.f7385k = bpVar.f7365g;
        this.f7386l = bpVar.f7366h;
        this.f7387m = 0;
        this.f7388n = bpVar.f7367i;
        this.f7389o = 0;
        this.f7390p = Integer.MAX_VALUE;
        this.f7391q = Integer.MAX_VALUE;
        this.f7392r = bpVar.f7370l;
        this.f7393s = bpVar.f7371m;
        this.f7394t = bpVar.f7372n;
        this.f7395u = 0;
        this.f7396v = false;
        this.f7397w = false;
        this.f7398x = false;
        this.f7399y = C58495hd.m89898l(bpVar.f7373o);
        this.f7400z = C58528ij.m90006F(bpVar.f7374p);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C2655bq bqVar = (C2655bq) obj;
            return this.f7385k == bqVar.f7385k && this.f7383i == bqVar.f7383i && this.f7384j == bqVar.f7384j && C58597ky.m90218i(this.f7386l, bqVar.f7386l) && C58597ky.m90218i(this.f7388n, bqVar.f7388n) && C58597ky.m90218i(this.f7392r, bqVar.f7392r) && C58597ky.m90218i(this.f7393s, bqVar.f7393s) && this.f7394t == bqVar.f7394t && this.f7399y.equals(bqVar.f7399y) && this.f7400z.equals(bqVar.f7400z);
        }
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.f7385k ? 1 : 0) - true) * 31) + this.f7383i) * 31) + this.f7384j) * 31) + this.f7386l.hashCode()) * 961) + this.f7388n.hashCode()) * 961) + Integer.MAX_VALUE) * 31) + Integer.MAX_VALUE) * 31) + this.f7392r.hashCode()) * 31) + this.f7393s.hashCode()) * 31) + this.f7394t) * 28629151) + C58758qx.m90643a(this.f7399y.entrySet())) * 31) + this.f7400z.hashCode();
    }
}
