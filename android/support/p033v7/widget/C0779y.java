package android.support.p033v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p033v7.p034a.C0338a;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.p098j.C2043bi;

/* renamed from: android.support.v7.widget.y */
/* compiled from: PG */
public final class C0779y {

    /* renamed from: a */
    private final View f2682a;

    /* renamed from: b */
    private final C0506ad f2683b;

    /* renamed from: c */
    private int f2684c = -1;

    /* renamed from: d */
    private C0733in f2685d;

    /* renamed from: e */
    private C0733in f2686e;

    /* renamed from: f */
    private C0733in f2687f;

    public C0779y(View view) {
        this.f2682a = view;
        this.f2683b = C0506ad.m1895d();
    }

    /* renamed from: a */
    public final ColorStateList mo3304a() {
        C0733in inVar = this.f2686e;
        if (inVar != null) {
            return inVar.f2591a;
        }
        return null;
    }

    /* renamed from: b */
    public final PorterDuff.Mode mo3305b() {
        C0733in inVar = this.f2686e;
        if (inVar != null) {
            return inVar.f2592b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo3306c() {
        Drawable background = this.f2682a.getBackground();
        if (background != null) {
            if (this.f2685d != null) {
                if (this.f2687f == null) {
                    this.f2687f = new C0733in();
                }
                C0733in inVar = this.f2687f;
                inVar.f2591a = null;
                inVar.f2594d = false;
                inVar.f2592b = null;
                inVar.f2593c = false;
                ColorStateList n = C2043bi.m5585n(this.f2682a);
                if (n != null) {
                    inVar.f2594d = true;
                    inVar.f2591a = n;
                }
                PorterDuff.Mode o = C2043bi.m5586o(this.f2682a);
                if (o != null) {
                    inVar.f2593c = true;
                    inVar.f2592b = o;
                }
                if (inVar.f2594d || inVar.f2593c) {
                    C0678gm.m2376h(background, inVar, this.f2682a.getDrawableState());
                    return;
                }
            }
            C0733in inVar2 = this.f2686e;
            if (inVar2 != null) {
                C0678gm.m2376h(background, inVar2, this.f2682a.getDrawableState());
                return;
            }
            C0733in inVar3 = this.f2685d;
            if (inVar3 != null) {
                C0678gm.m2376h(background, inVar3, this.f2682a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo3307d(AttributeSet attributeSet, int i) {
        C0735ip f = C0735ip.m2473f(this.f2682a.getContext(), attributeSet, C0338a.f1063B, i, 0);
        View view = this.f2682a;
        C2043bi.m5525S(view, view.getContext(), C0338a.f1063B, attributeSet, f.f2596b, i, 0);
        try {
            if (f.f2596b.hasValue(0)) {
                this.f2684c = f.f2596b.getResourceId(0, -1);
                ColorStateList a = this.f2683b.mo2476a(this.f2682a.getContext(), this.f2684c);
                if (a != null) {
                    mo3309f(a);
                }
            }
            if (f.f2596b.hasValue(1)) {
                C2043bi.m5531Y(this.f2682a, f.mo3245a(1));
            }
            if (f.f2596b.hasValue(2)) {
                C2043bi.m5532Z(this.f2682a, C0571cn.m2114a(f.f2596b.getInt(2, -1), (PorterDuff.Mode) null));
            }
        } finally {
            f.f2596b.recycle();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo3308e(int i) {
        this.f2684c = i;
        C0506ad adVar = this.f2683b;
        mo3309f(adVar != null ? adVar.mo2476a(this.f2682a.getContext(), i) : null);
        mo3306c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo3309f(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f2685d == null) {
                this.f2685d = new C0733in();
            }
            C0733in inVar = this.f2685d;
            inVar.f2591a = colorStateList;
            inVar.f2594d = true;
        } else {
            this.f2685d = null;
        }
        mo3306c();
    }

    /* renamed from: g */
    public final void mo3310g(ColorStateList colorStateList) {
        if (this.f2686e == null) {
            this.f2686e = new C0733in();
        }
        C0733in inVar = this.f2686e;
        inVar.f2591a = colorStateList;
        inVar.f2594d = true;
        mo3306c();
    }

    /* renamed from: h */
    public final void mo3311h(PorterDuff.Mode mode) {
        if (this.f2686e == null) {
            this.f2686e = new C0733in();
        }
        C0733in inVar = this.f2686e;
        inVar.f2592b = mode;
        inVar.f2593c = true;
        mo3306c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo3312i() {
        this.f2684c = -1;
        mo3309f((ColorStateList) null);
        mo3306c();
    }
}
