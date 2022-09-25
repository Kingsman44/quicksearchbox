package android.support.p033v7.widget;

import android.view.View;

/* renamed from: android.support.v7.widget.dn */
/* compiled from: PG */
final class C0598dn {

    /* renamed from: a */
    C0626eo f2311a;

    /* renamed from: b */
    int f2312b;

    /* renamed from: c */
    int f2313c;

    /* renamed from: d */
    boolean f2314d;

    /* renamed from: e */
    boolean f2315e;

    public C0598dn() {
        mo2786d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2783a() {
        int i;
        if (this.f2314d) {
            i = this.f2311a.mo2843f();
        } else {
            i = this.f2311a.mo2847j();
        }
        this.f2313c = i;
    }

    /* renamed from: b */
    public final void mo2784b(View view, int i) {
        if (this.f2314d) {
            this.f2313c = this.f2311a.mo2838a(view) + this.f2311a.mo2852o();
        } else {
            this.f2313c = this.f2311a.mo2841d(view);
        }
        this.f2312b = i;
    }

    /* renamed from: c */
    public final void mo2785c(View view, int i) {
        int o = this.f2311a.mo2852o();
        if (o >= 0) {
            mo2784b(view, i);
            return;
        }
        this.f2312b = i;
        if (this.f2314d) {
            int f = (this.f2311a.mo2843f() - o) - this.f2311a.mo2838a(view);
            this.f2313c = this.f2311a.mo2843f() - f;
            if (f > 0) {
                int b = this.f2311a.mo2839b(view);
                int i2 = this.f2313c;
                int j = this.f2311a.mo2847j();
                int min = (i2 - b) - (j + Math.min(this.f2311a.mo2841d(view) - j, 0));
                if (min < 0) {
                    this.f2313c += Math.min(f, -min);
                    return;
                }
                return;
            }
            return;
        }
        int d = this.f2311a.mo2841d(view);
        int j2 = d - this.f2311a.mo2847j();
        this.f2313c = d;
        if (j2 > 0) {
            int b2 = this.f2311a.mo2839b(view);
            int f2 = (this.f2311a.mo2843f() - Math.min(0, (this.f2311a.mo2843f() - o) - this.f2311a.mo2838a(view))) - (d + b2);
            if (f2 < 0) {
                this.f2313c -= Math.min(j2, -f2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo2786d() {
        this.f2312b = -1;
        this.f2313c = LinearLayoutManager.INVALID_OFFSET;
        this.f2314d = false;
        this.f2315e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f2312b + ", mCoordinate=" + this.f2313c + ", mLayoutFromEnd=" + this.f2314d + ", mValid=" + this.f2315e + '}';
    }
}
