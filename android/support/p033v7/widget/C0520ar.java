package android.support.p033v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p033v7.p034a.C0338a;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.C1929b;
import androidx.core.graphics.drawable.C1930c;
import androidx.core.p098j.C2043bi;

/* renamed from: android.support.v7.widget.ar */
/* compiled from: PG */
final class C0520ar extends C0515am {

    /* renamed from: b */
    public final SeekBar f2073b;

    /* renamed from: c */
    public Drawable f2074c;

    /* renamed from: d */
    private ColorStateList f2075d = null;

    /* renamed from: e */
    private PorterDuff.Mode f2076e = null;

    /* renamed from: f */
    private boolean f2077f = false;

    /* renamed from: g */
    private boolean f2078g = false;

    public C0520ar(SeekBar seekBar) {
        super(seekBar);
        this.f2073b = seekBar;
    }

    /* renamed from: c */
    private final void m1921c() {
        Drawable drawable = this.f2074c;
        if (drawable == null) {
            return;
        }
        if (this.f2077f || this.f2078g) {
            Drawable mutate = drawable.mutate();
            this.f2074c = mutate;
            if (this.f2077f) {
                C1929b.m5226g(mutate, this.f2075d);
            }
            if (this.f2078g) {
                C1929b.m5227h(this.f2074c, this.f2076e);
            }
            if (this.f2074c.isStateful()) {
                this.f2074c.setState(this.f2073b.getDrawableState());
            }
        }
    }

    /* renamed from: b */
    public final void mo2512b(AttributeSet attributeSet, int i) {
        super.mo2512b(attributeSet, i);
        C0735ip f = C0735ip.m2473f(this.f2073b.getContext(), attributeSet, C0338a.f1071g, i, 0);
        SeekBar seekBar = this.f2073b;
        C2043bi.m5525S(seekBar, seekBar.getContext(), C0338a.f1071g, attributeSet, f.f2596b, i, 0);
        Drawable c = f.mo3247c(0);
        if (c != null) {
            this.f2073b.setThumb(c);
        }
        Drawable b = f.mo3246b(1);
        Drawable drawable = this.f2074c;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
        this.f2074c = b;
        if (b != null) {
            b.setCallback(this.f2073b);
            C1930c.m5230b(b, C2043bi.m5577f(this.f2073b));
            if (b.isStateful()) {
                b.setState(this.f2073b.getDrawableState());
            }
            m1921c();
        }
        this.f2073b.invalidate();
        if (f.f2596b.hasValue(3)) {
            this.f2076e = C0571cn.m2114a(f.f2596b.getInt(3, -1), this.f2076e);
            this.f2078g = true;
        }
        if (f.f2596b.hasValue(2)) {
            this.f2075d = f.mo3245a(2);
            this.f2077f = true;
        }
        f.f2596b.recycle();
        m1921c();
    }
}
