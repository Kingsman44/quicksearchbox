package androidx.drawerlayout.widget;

import android.view.View;
import androidx.customview.p103b.C2149g;
import androidx.customview.p103b.C2150h;

/* renamed from: androidx.drawerlayout.widget.l */
/* compiled from: PG */
final class C2183l extends C2149g {

    /* renamed from: a */
    public final int f6194a;

    /* renamed from: b */
    public C2150h f6195b;

    /* renamed from: c */
    final /* synthetic */ DrawerLayout f6196c;

    /* renamed from: d */
    private final Runnable f6197d = new C2182k(this);

    public C2183l(DrawerLayout drawerLayout, int i) {
        this.f6196c = drawerLayout;
        this.f6194a = i;
    }

    /* renamed from: a */
    public final int mo5392a(View view, int i, int i2) {
        return view.getTop();
    }

    /* renamed from: c */
    public final int mo5394c(View view) {
        if (DrawerLayout.m6035u(view)) {
            return view.getWidth();
        }
        return 0;
    }

    /* renamed from: e */
    public final void mo5396e(int i, int i2) {
        View view;
        if ((i & 1) == 1) {
            view = this.f6196c.mo5456g(3);
        } else {
            view = this.f6196c.mo5456g(5);
        }
        if (view != null && this.f6196c.mo5454e(view) == 0) {
            this.f6195b.mo5407d(view, i2);
        }
    }

    /* renamed from: f */
    public final void mo5397f(View view, int i) {
        ((C2180i) view.getLayoutParams()).f6191c = false;
        mo5495n();
    }

    /* renamed from: g */
    public final void mo5398g(int i) {
        this.f6196c.mo5480q(i, this.f6195b.f6102k);
    }

    /* renamed from: h */
    public final void mo5399h(View view, float f, float f2) {
        int i;
        float s = DrawerLayout.m6033s(view);
        int width = view.getWidth();
        if (this.f6196c.mo5481r(view, 3)) {
            i = 0;
            if (f <= 0.0f && (f != 0.0f || s <= 0.5f)) {
                i = -width;
            }
        } else {
            i = this.f6196c.getWidth();
            if (f < 0.0f || (f == 0.0f && s > 0.5f)) {
                i -= width;
            }
        }
        this.f6195b.mo5411h(i, view.getTop());
        this.f6196c.invalidate();
    }

    /* renamed from: i */
    public final boolean mo5400i(View view, int i) {
        return DrawerLayout.m6035u(view) && this.f6196c.mo5481r(view, this.f6194a) && this.f6196c.mo5454e(view) == 0;
    }

    /* renamed from: j */
    public final int mo5401j(View view, int i) {
        if (this.f6196c.mo5481r(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        }
        int width = this.f6196c.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i, width));
    }

    /* renamed from: k */
    public final boolean mo5402k() {
        return false;
    }

    /* renamed from: l */
    public final void mo5403l() {
        this.f6196c.postDelayed(this.f6197d, 160);
    }

    /* renamed from: m */
    public final void mo5404m(View view, int i, int i2) {
        float f;
        int width = view.getWidth();
        if (this.f6196c.mo5481r(view, 3)) {
            f = (float) (i + width);
        } else {
            f = (float) (this.f6196c.getWidth() - i);
        }
        float f2 = f / ((float) width);
        this.f6196c.mo5466o(view, f2);
        view.setVisibility(f2 == 0.0f ? 4 : 0);
        this.f6196c.invalidate();
    }

    /* renamed from: n */
    public final void mo5495n() {
        int i = 3;
        if (this.f6194a == 3) {
            i = 5;
        }
        View g = this.f6196c.mo5456g(i);
        if (g != null) {
            this.f6196c.mo5462k(g, true);
        }
    }

    /* renamed from: o */
    public final void mo5496o() {
        this.f6196c.removeCallbacks(this.f6197d);
    }
}
