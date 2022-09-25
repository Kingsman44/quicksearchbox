package android.support.p033v7.widget;

import android.graphics.Rect;
import android.view.View;

/* renamed from: android.support.v7.widget.eo */
/* compiled from: PG */
public abstract class C0626eo {

    /* renamed from: a */
    public final C0653fo f2386a;

    /* renamed from: b */
    public int f2387b = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: c */
    final Rect f2388c = new Rect();

    public C0626eo(C0653fo foVar) {
        this.f2386a = foVar;
    }

    /* renamed from: a */
    public abstract int mo2838a(View view);

    /* renamed from: b */
    public abstract int mo2839b(View view);

    /* renamed from: c */
    public abstract int mo2840c(View view);

    /* renamed from: d */
    public abstract int mo2841d(View view);

    /* renamed from: e */
    public abstract int mo2842e();

    /* renamed from: f */
    public abstract int mo2843f();

    /* renamed from: g */
    public abstract int mo2844g();

    /* renamed from: h */
    public abstract int mo2845h();

    /* renamed from: i */
    public abstract int mo2846i();

    /* renamed from: j */
    public abstract int mo2847j();

    /* renamed from: k */
    public abstract int mo2848k();

    /* renamed from: l */
    public abstract int mo2849l(View view);

    /* renamed from: m */
    public abstract int mo2850m(View view);

    /* renamed from: n */
    public abstract void mo2851n(int i);

    /* renamed from: o */
    public final int mo2852o() {
        if (this.f2387b == Integer.MIN_VALUE) {
            return 0;
        }
        return mo2848k() - this.f2387b;
    }

    /* renamed from: p */
    public static C0626eo m2232p(C0653fo foVar, int i) {
        if (i != 0) {
            return new C0625en(foVar);
        }
        return new C0624em(foVar);
    }
}
