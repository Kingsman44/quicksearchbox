package android.support.p033v7.widget;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.support.p033v7.p034a.C0338a;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.p098j.C2043bi;
import androidx.core.widget.C2124k;

/* renamed from: android.support.v7.widget.aj */
/* compiled from: PG */
public final class C0512aj {

    /* renamed from: a */
    public C0733in f2057a;

    /* renamed from: b */
    public int f2058b = 0;

    /* renamed from: c */
    private final ImageView f2059c;

    public C0512aj(ImageView imageView) {
        this.f2059c = imageView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2497a() {
        if (this.f2059c.getDrawable() != null) {
            this.f2059c.getDrawable().setLevel(this.f2058b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo2498b() {
        C0733in inVar;
        Drawable drawable = this.f2059c.getDrawable();
        if (drawable != null) {
            C0571cn.m2116c(drawable);
        }
        if (drawable != null && (inVar = this.f2057a) != null) {
            C0678gm.m2376h(drawable, inVar, this.f2059c.getDrawableState());
        }
    }

    /* renamed from: c */
    public final void mo2499c(AttributeSet attributeSet, int i) {
        int resourceId;
        C0735ip f = C0735ip.m2473f(this.f2059c.getContext(), attributeSet, C0338a.f1070f, i, 0);
        ImageView imageView = this.f2059c;
        C2043bi.m5525S(imageView, imageView.getContext(), C0338a.f1070f, attributeSet, f.f2596b, i, 0);
        try {
            Drawable drawable = this.f2059c.getDrawable();
            if (!(drawable != null || (resourceId = f.f2596b.getResourceId(1, -1)) == -1 || (drawable = C0678gm.m2375e().mo3100c(this.f2059c.getContext(), resourceId)) == null)) {
                this.f2059c.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C0571cn.m2116c(drawable);
            }
            if (f.f2596b.hasValue(2)) {
                C2124k.m5892c(this.f2059c, f.mo3245a(2));
            }
            if (f.f2596b.hasValue(3)) {
                C2124k.m5893d(this.f2059c, C0571cn.m2114a(f.f2596b.getInt(3, -1), (PorterDuff.Mode) null));
            }
        } finally {
            f.f2596b.recycle();
        }
    }

    /* renamed from: d */
    public final void mo2500d(int i) {
        if (i != 0) {
            Drawable c = C0678gm.m2375e().mo3100c(this.f2059c.getContext(), i);
            if (c != null) {
                C0571cn.m2116c(c);
            }
            this.f2059c.setImageDrawable(c);
        } else {
            this.f2059c.setImageDrawable((Drawable) null);
        }
        mo2498b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo2501e() {
        return !(this.f2059c.getBackground() instanceof RippleDrawable);
    }
}
