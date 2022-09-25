package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3504a.C44502g;

/* renamed from: com.google.android.material.floatingactionbutton.m */
/* compiled from: PG */
final class C44674m extends C44664c {

    /* renamed from: d */
    final /* synthetic */ ExtendedFloatingActionButton f116452d;

    /* renamed from: e */
    private final C44677p f116453e;

    /* renamed from: f */
    private final boolean f116454f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44674m(ExtendedFloatingActionButton extendedFloatingActionButton, C44657a aVar, C44677p pVar, boolean z) {
        super(extendedFloatingActionButton, aVar);
        this.f116452d = extendedFloatingActionButton;
        this.f116453e = pVar;
        this.f116454f = z;
    }

    /* renamed from: a */
    public final AnimatorSet mo47937a() {
        C44502g c = mo47949c();
        if (c.mo47380e("width")) {
            PropertyValuesHolder[] f = c.mo47382f("width");
            f[0].setFloatValues(new float[]{(float) this.f116452d.getWidth(), (float) this.f116453e.mo47967d()});
            c.f115659a.put("width", f);
        }
        if (c.mo47380e("height")) {
            PropertyValuesHolder[] f2 = c.mo47382f("height");
            f2[0].setFloatValues(new float[]{(float) this.f116452d.getHeight(), (float) this.f116453e.mo47964a()});
            c.f115659a.put("height", f2);
        }
        if (c.mo47380e("paddingStart")) {
            PropertyValuesHolder[] f3 = c.mo47382f("paddingStart");
            f3[0].setFloatValues(new float[]{(float) C2043bi.m5583l(this.f116452d), (float) this.f116453e.mo47966c()});
            c.f115659a.put("paddingStart", f3);
        }
        if (c.mo47380e("paddingEnd")) {
            PropertyValuesHolder[] f4 = c.mo47382f("paddingEnd");
            f4[0].setFloatValues(new float[]{(float) C2043bi.m5582k(this.f116452d), (float) this.f116453e.mo47965b()});
            c.f115659a.put("paddingEnd", f4);
        }
        if (c.mo47380e("labelOpacity")) {
            PropertyValuesHolder[] f5 = c.mo47382f("labelOpacity");
            boolean z = this.f116454f;
            float f6 = 1.0f;
            float f7 = true != z ? 1.0f : 0.0f;
            if (true != z) {
                f6 = 0.0f;
            }
            f5[0].setFloatValues(new float[]{f7, f6});
            c.f115659a.put("labelOpacity", f5);
        }
        return super.mo47948b(c);
    }

    /* renamed from: f */
    public final void mo47940f() {
        this.f116426b.f116382a = null;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f116452d;
        extendedFloatingActionButton.f116358t = false;
        extendedFloatingActionButton.setHorizontallyScrolling(false);
        ViewGroup.LayoutParams layoutParams = this.f116452d.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = this.f116453e.mo47968e().width;
            layoutParams.height = this.f116453e.mo47968e().height;
        }
    }

    /* renamed from: g */
    public final void mo47941g(Animator animator) {
        C44657a aVar = this.f116426b;
        aVar.mo47923a();
        aVar.f116382a = animator;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f116452d;
        extendedFloatingActionButton.f116357s = this.f116454f;
        extendedFloatingActionButton.f116358t = true;
        extendedFloatingActionButton.setHorizontallyScrolling(true);
    }

    /* renamed from: h */
    public final int mo47942h() {
        return this.f116454f ? R.animator.mtrl_extended_fab_change_size_expand_motion_spec : R.animator.mtrl_extended_fab_change_size_collapse_motion_spec;
    }

    /* renamed from: i */
    public final void mo47943i() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f116452d;
        extendedFloatingActionButton.f116357s = this.f116454f;
        ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = this.f116453e.mo47968e().width;
            layoutParams.height = this.f116453e.mo47968e().height;
            C2043bi.m5556aj(this.f116452d, this.f116453e.mo47966c(), this.f116452d.getPaddingTop(), this.f116453e.mo47965b(), this.f116452d.getPaddingBottom());
            this.f116452d.requestLayout();
        }
    }

    /* renamed from: j */
    public final boolean mo47944j() {
        boolean z = this.f116454f;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f116452d;
        return z == extendedFloatingActionButton.f116357s || extendedFloatingActionButton.f115971d == null || TextUtils.isEmpty(extendedFloatingActionButton.getText());
    }

    /* renamed from: k */
    public final void mo47945k() {
    }
}
