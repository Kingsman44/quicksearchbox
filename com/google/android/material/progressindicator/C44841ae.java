package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import androidx.p198v.p199a.p200a.C4244c;
import androidx.p198v.p199a.p200a.C4251j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3505b.C44535e;

/* renamed from: com.google.android.material.progressindicator.ae */
/* compiled from: PG */
final class C44841ae extends C44864v {

    /* renamed from: a */
    public static final int[] f116981a = {533, 567, 850, 750};

    /* renamed from: b */
    public static final int[] f116982b = {1267, 1000, 333, 0};

    /* renamed from: i */
    private static final Property f116983i = new C44840ad(Float.class);

    /* renamed from: c */
    public final Interpolator[] f116984c;

    /* renamed from: d */
    public final C44849g f116985d;

    /* renamed from: e */
    public int f116986e = 0;

    /* renamed from: f */
    public boolean f116987f;

    /* renamed from: g */
    public float f116988g;

    /* renamed from: h */
    C4244c f116989h = null;

    /* renamed from: m */
    private ObjectAnimator f116990m;

    /* renamed from: n */
    private ObjectAnimator f116991n;

    public C44841ae(Context context, C44842af afVar) {
        super(2);
        this.f116985d = afVar;
        this.f116984c = new Interpolator[]{C4251j.m12166a(context, R.anim.linear_indeterminate_line1_head_interpolator), C4251j.m12166a(context, R.anim.linear_indeterminate_line1_tail_interpolator), C4251j.m12166a(context, R.anim.linear_indeterminate_line2_head_interpolator), C4251j.m12166a(context, R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    /* renamed from: a */
    public final void mo48257a() {
        ObjectAnimator objectAnimator = this.f116990m;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: b */
    public final void mo48258b(C4244c cVar) {
        this.f116989h = cVar;
    }

    /* renamed from: c */
    public final void mo48259c() {
        ObjectAnimator objectAnimator = this.f116991n;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            mo48257a();
            if (this.f117064j.isVisible()) {
                this.f116991n.setFloatValues(new float[]{this.f116988g, 1.0f});
                this.f116991n.setDuration((long) ((1.0f - this.f116988g) * 1800.0f));
                this.f116991n.start();
            }
        }
    }

    /* renamed from: d */
    public final void mo48260d() {
        if (this.f116990m == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f116983i, new float[]{0.0f, 1.0f});
            this.f116990m = ofFloat;
            ofFloat.setDuration(1800);
            this.f116990m.setInterpolator((TimeInterpolator) null);
            this.f116990m.setRepeatCount(-1);
            this.f116990m.addListener(new C44838ab(this));
        }
        if (this.f116991n == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f116983i, new float[]{1.0f});
            this.f116991n = ofFloat2;
            ofFloat2.setDuration(1800);
            this.f116991n.setInterpolator((TimeInterpolator) null);
            this.f116991n.addListener(new C44839ac(this));
        }
        this.f116986e = 0;
        int a = C44535e.m78718a(this.f116985d.f117017c[0], this.f117064j.f117060i);
        int[] iArr = this.f117066l;
        iArr[0] = a;
        iArr[1] = a;
        this.f116990m.start();
    }

    /* renamed from: e */
    public final void mo48261e() {
        this.f116989h = null;
    }
}
