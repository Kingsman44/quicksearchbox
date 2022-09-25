package com.google.android.apps.gsa.searchplate.recognizer;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Color;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import com.google.android.apps.gsa.searchplate.p6966d.C88939k;
import com.google.android.apps.gsa.shared.util.p7187ui.C91107f;
import com.google.android.apps.gsa.shared.util.p7187ui.C91119r;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.searchplate.recognizer.f */
/* compiled from: PG */
public final class C88961f {

    /* renamed from: a */
    public static final Interpolator f241051a = C91107f.m148858a(0.8f, 0.0f);

    /* renamed from: A */
    private final int f241052A;

    /* renamed from: B */
    private final boolean f241053B;

    /* renamed from: b */
    final OrbDrawable f241054b;

    /* renamed from: c */
    final CircleShadowDrawable f241055c;

    /* renamed from: d */
    public int f241056d;

    /* renamed from: e */
    final float f241057e;

    /* renamed from: f */
    final float f241058f;

    /* renamed from: g */
    float f241059g;

    /* renamed from: h */
    public final float f241060h;

    /* renamed from: i */
    public final float f241061i;

    /* renamed from: j */
    public final float f241062j;

    /* renamed from: k */
    public final float f241063k;

    /* renamed from: l */
    public final int f241064l;

    /* renamed from: m */
    public final ValueAnimator f241065m;

    /* renamed from: n */
    float f241066n;

    /* renamed from: o */
    float f241067o;

    /* renamed from: p */
    public int f241068p;

    /* renamed from: q */
    public float f241069q;

    /* renamed from: r */
    public final int f241070r;

    /* renamed from: s */
    public final int f241071s;

    /* renamed from: t */
    private final ValueAnimator f241072t;

    /* renamed from: u */
    private final float f241073u;

    /* renamed from: v */
    private final ValueAnimator f241074v;

    /* renamed from: w */
    private final ValueAnimator f241075w;

    /* renamed from: x */
    private final ValueAnimator f241076x;

    /* renamed from: y */
    private final ValueAnimator f241077y;

    /* renamed from: z */
    private final ValueAnimator f241078z;

    public C88961f(ImageView imageView, Resources resources, int i, boolean z, boolean z2, int i2, int i3, int i4) {
        OrbDrawable orbDrawable = new OrbDrawable();
        this.f241054b = orbDrawable;
        imageView.setImageDrawable(orbDrawable);
        CircleShadowDrawable circleShadowDrawable = new CircleShadowDrawable(0.0f);
        this.f241055c = circleShadowDrawable;
        imageView.setBackground(circleShadowDrawable);
        float f = (float) i;
        this.f241057e = f;
        f = !z ? f * 0.95f : f;
        this.f241058f = f;
        this.f241053B = z2;
        this.f241070r = i2;
        this.f241052A = i3;
        this.f241071s = i4;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(orbDrawable, "radius", new float[]{0.0f, 0.0f});
        this.f241072t = ofFloat;
        ofFloat.addUpdateListener(new C88956a(this));
        float dimensionPixelSize = (float) resources.getDimensionPixelSize(R.dimen.ic_mic_shadow_not_listen_height);
        this.f241060h = dimensionPixelSize;
        this.f241061i = (float) resources.getDimensionPixelSize(R.dimen.ic_mic_shadow_load_height);
        this.f241073u = (float) resources.getDimensionPixelSize(R.dimen.ic_mic_shadow_listen_height);
        this.f241062j = (float) resources.getDimensionPixelSize(R.dimen.ic_mic_shadow_record_height);
        this.f241063k = (float) resources.getDimensionPixelSize(R.dimen.ic_mic_shadow_tts_height);
        this.f241064l = Color.alpha(resources.getColor(R.color.ic_mic_shadow_color));
        this.f241074v = ObjectAnimator.ofFloat(circleShadowDrawable, "baseRadius", new float[]{0.0f, 0.0f});
        this.f241076x = ObjectAnimator.ofFloat(circleShadowDrawable, "z", new float[]{0.0f, 0.0f});
        this.f241075w = ObjectAnimator.ofInt(circleShadowDrawable, "alpha", new int[]{0, 0});
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 0.0f});
        this.f241078z = ofFloat2;
        ofFloat2.addUpdateListener(new C88957b(this));
        ofFloat2.addListener(new C88958c(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{0.0f, 0.0f});
        this.f241077y = ofFloat3;
        ofFloat3.addUpdateListener(new C88959d(this));
        if (z || !z2) {
            this.f241065m = null;
        } else {
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.f241065m = ofFloat4;
            ofFloat4.setInterpolator(C91119r.f254433a);
            ofFloat4.setRepeatCount(-1);
            ofFloat4.setDuration(2333);
            ofFloat4.addUpdateListener(new C88960e(this));
        }
        orbDrawable.setColorWithoutAnimation(i2);
        this.f241056d = 0;
        this.f241059g = f;
        orbDrawable.setRadius(f);
        circleShadowDrawable.setBaseRadius(this.f241059g);
        this.f241068p = 0;
        this.f241069q = dimensionPixelSize;
        circleShadowDrawable.setAlpha(0);
        circleShadowDrawable.setZ(this.f241069q);
        mo82888g(0);
    }

    /* renamed from: a */
    public final void mo82882a(float f, float f2, int i) {
        if (this.f241065m != null) {
            long j = (long) i;
            C88939k.m144548d(this.f241077y, j, C91107f.f254408d, this.f241066n, f);
            C88939k.m144548d(this.f241078z, j, C91107f.f254408d, this.f241067o, f2);
        }
    }

    /* renamed from: b */
    public final void mo82883b(float f, long j, TimeInterpolator timeInterpolator) {
        if (true != this.f241053B) {
            j = 0;
        }
        float f2 = this.f241059g;
        if (f2 != f) {
            C88939k.m144548d(this.f241072t, j, timeInterpolator, f2, f);
            C88939k.m144548d(this.f241074v, j, C91107f.f254408d, this.f241059g, f);
        }
    }

    /* renamed from: c */
    public final void mo82884c(int i, long j) {
        if (true != this.f241053B) {
            j = 0;
        }
        if (this.f241068p != i) {
            C88939k.m144549e(this.f241075w, j, C91107f.f254408d, this.f241068p, i);
            this.f241068p = i;
        }
    }

    /* renamed from: d */
    public final void mo82885d(float f, long j) {
        if (true != this.f241053B) {
            j = 0;
        }
        if (this.f241069q != f) {
            C88939k.m144548d(this.f241076x, j, C91107f.f254408d, this.f241069q, f);
            this.f241069q = f;
        }
    }

    /* renamed from: e */
    public final void mo82886e(int i, float f, int i2, TimeInterpolator timeInterpolator, long j) {
        OrbDrawable orbDrawable = this.f241054b;
        if (true != this.f241053B) {
            j = 0;
        }
        orbDrawable.expandToShowColor(i, f, i2, timeInterpolator, j);
    }

    /* renamed from: f */
    public final void mo82887f() {
        ValueAnimator valueAnimator = this.f241065m;
        if (valueAnimator != null && !valueAnimator.isStarted()) {
            this.f241065m.start();
        }
    }

    /* renamed from: g */
    public final void mo82888g(long j) {
        ValueAnimator valueAnimator = this.f241065m;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            C88939k.m144548d(this.f241078z, j, C91107f.f254408d, this.f241067o, 0.0f);
            C88939k.m144548d(this.f241077y, j, C91107f.f254408d, this.f241066n, 0.0f);
        }
    }

    /* renamed from: h */
    public final void mo82889h(TimeInterpolator timeInterpolator) {
        mo82886e(this.f241052A, 0.3f, 0, timeInterpolator, 500);
        mo82883b(this.f241057e, 500, timeInterpolator);
        mo82885d(this.f241073u, 500);
        mo82884c(this.f241064l, 500);
        mo82882a(0.04f, 0.06f, 500);
        mo82887f();
    }

    /* renamed from: i */
    public final void mo82890i(int i, TimeInterpolator timeInterpolator) {
        this.f241054b.shrinkToShowColor(i, 0.4f, timeInterpolator, true != this.f241053B ? 0 : 250);
    }
}
